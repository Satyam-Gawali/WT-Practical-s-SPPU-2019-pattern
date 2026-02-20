 package com.wtpr8.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wtpr8.form.LoginForm;
import org.apache.struts.action.*;

public class LoginAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        LoginForm loginForm = (LoginForm) form;
        String name = loginForm.getName();
        String mobile = loginForm.getMobile();
        String email = loginForm.getEmail();

        // You can validate/store in DB here. This example just forwards.
        request.setAttribute("user", name);
        return mapping.findForward("success");
    }
}
