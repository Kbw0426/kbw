package com.kbw.controller;

import com.kbw.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testString")
    public String testString(Model model) {
        System.out.println("testString执行了。。。");
        //模拟从数据库查询出user对象
        User user = new User();
        user.setUname("张义豪");
        user.setAge(18);
        //modeld对象
        model.addAttribute("user", user);
        return "success";
    }

    /**
     * 是void
     * 请求转发一次请求，不用编写项目名称
     *
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("testVoid方法执行了。。。");
        //编写请求转发的程序，不会再使用视图解析器
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //重定向
        //response.sendRedirect(request.getContextPath()+"/index.jsp");

        //设置中文乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //直接响应
        response.getWriter().print("你好张义豪");

    }

    /**
     * 返回ModelAndView
     *
     * @return
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView mv = new ModelAndView();
        System.out.println("testModelAndView方法执行了。。。");
        User user = new User();
        user.setUname("王运红");
        user.setAge(18);
        //把user对象存储到mv对象中，也会把user对象存入到request对象中
        mv.addObject("user", user);
        mv.setViewName("success");
        return mv;


    }
}
