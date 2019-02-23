package com.demo.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class HelloTag extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
		JspWriter jspWriter = getJspContext().getOut();
		jspWriter.print("Hello World");
	}
}
