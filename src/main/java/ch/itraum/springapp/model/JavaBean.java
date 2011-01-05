package ch.itraum.springapp.model;

import java.util.HashSet;
import java.util.Set;

public class JavaBean {
	
	private String name;
	private ReferenceJavaBean referenceJavaBean;
	private Set<ReferenceJavaBean> referenceJavaBeanSet = new HashSet<ReferenceJavaBean>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ReferenceJavaBean getReferenceJavaBean() {
		return referenceJavaBean;
	}

	public void setReferenceJavaBean(ReferenceJavaBean referenceJavaBean) {
		this.referenceJavaBean = referenceJavaBean;
	}

	public Set<ReferenceJavaBean> getReferenceJavaBeanSet() {
		return referenceJavaBeanSet;
	}

	public void setReferenceJavaBeanSet(Set<ReferenceJavaBean> referenceJavaBeanSet) {
		this.referenceJavaBeanSet = referenceJavaBeanSet;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("JavaBean [ name: ");
		stringBuilder.append(name);
		stringBuilder.append(" referenceJavaBean: ");
		stringBuilder.append(referenceJavaBean);
		stringBuilder.append(" referenceJavaBeanSet: ");
		stringBuilder.append(referenceJavaBeanSet);
		stringBuilder.append(" ]");
		return stringBuilder.toString();
	}
}
