package com.demo.validation.util;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "userValidator")
public class UsernameValidator implements Validator {
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String username = String.valueOf(value);
        if(username.equalsIgnoreCase("abc")){
            FacesMessage facesMessage = new FacesMessage();
            facesMessage.setSummary("Username invalid");
            facesMessage.setDetail("Username already exists");
            facesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(facesMessage);
        }
    }
}
