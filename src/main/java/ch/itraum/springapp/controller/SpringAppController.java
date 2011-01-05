package ch.itraum.springapp.controller;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch.itraum.springapp.model.JavaBean;
import ch.itraum.springapp.model.ReferenceJavaBean;

@Controller
public class SpringAppController {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringAppController.class);
	
	@ModelAttribute("referenceJavaBeans")
	public Collection<ReferenceJavaBean> populateReferenceJavaBeans() {
		List<ReferenceJavaBean> referenceJavaBeans = new LinkedList<ReferenceJavaBean>();

		referenceJavaBeans.add(new ReferenceJavaBean("AAA"));
		referenceJavaBeans.add(new ReferenceJavaBean("BBB"));
		referenceJavaBeans.add(new ReferenceJavaBean("CCC"));
		
		Collections.sort(referenceJavaBeans);
		
		return referenceJavaBeans;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String get(Model model) {
		logger.debug("SpringAppController: GET request");
		
		model.addAttribute("message", "Clean JavaBean");
		model.addAttribute(new JavaBean());
		
		return "springapp";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String post(JavaBean javaBean, Model model) {
		logger.debug("SpringAppController: POST request");
		
		model.addAttribute("message", javaBean);
		model.addAttribute(javaBean);
		
		return "springapp";
	}
}
