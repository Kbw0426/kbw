package com.kbw.interceptor;

import com.kbw.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor  implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取请求的URL
        String url = request.getRequestURI();
        //URL:除了登录请求外，其他的URL都进行拦截控制
        if (url.indexOf("/user/login")>=0){
            return true;
        }
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("USER_SESSION");
        //判断session中是否有用户数据，如果有，则返回true，继续执行下去
        if (user!=null){
            return true;
        }
        request.setAttribute("msg","您还没登陆，请先登录");
        request.getRequestDispatcher("/login.jsp").forward(request,response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        //在处理过程中，执行拦截
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        //执行完毕，返回前拦截
    }
}
