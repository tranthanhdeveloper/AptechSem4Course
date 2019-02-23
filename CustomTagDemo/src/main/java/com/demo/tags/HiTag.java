package com.demo.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class HiTag extends SimpleTagSupport {
	private String fullname;
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
		JspWriter jspWriter = getJspContext().getOut();
		jspWriter.print("Hi "+fullname);
	}
}
