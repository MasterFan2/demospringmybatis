package com.masterfan.test.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.masterfan.test.entity.User;
import com.masterfan.test.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/selectUser")
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");


        try {
            long userId = Long.parseLong(request.getParameter("id"));
            User user = userService.findUserById(userId);

            ObjectMapper mapper = new ObjectMapper();

            response.getWriter().write(mapper.writeValueAsString(user));
            response.getWriter().close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("gohome")
    public ModelAndView home(ModelAndView mv) {
        mv.setViewName("home/home");
        return mv;
    }
}
