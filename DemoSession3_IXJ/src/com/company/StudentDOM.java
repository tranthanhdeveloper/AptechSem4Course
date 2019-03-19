package com.company;

import com.helper.DOMHelper;
import com.sun.org.apache.xml.internal.utils.DOM2Helper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class StudentDOM {
    public void create(){
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse("data\\student.xml");

            // Retrieve root node
            Element studentEl = document.getDocumentElement();

            // create child node
            Element age = document.createElement("age");
            age.appendChild(document.createTextNode("20"));
            studentEl.appendChild(age);

            // Create new element with attributes
            Element dob = document.createElement("dob");
            dob.setAttribute("format", "yyyy-MM-dd");
            dob.appendChild(document.createTextNode("1980-10-20"));
            studentEl.appendChild(dob);

            DOMHelper.saveXMLContent(document, "data\\student.xml");
        }catch (Exception e){

        }
    }
}
