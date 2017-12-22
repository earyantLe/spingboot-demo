package com.earyant.config.interceptor;

import com.earyant.common.util.JsonUtils;
import com.earyant.dao.primary.LogRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by earyant on 2017 : 09 : 2017/9/20 0020 : 15:57 : .
 * idc  com.earyant.idc.config.interceptor
 * <p>
 * 全局拦截器
 */
@Component
public class WebInterceptor implements HandlerInterceptor {
    Logger logger = LoggerFactory.getLogger(WebInterceptor.class);
    @Autowired
    RabbitTemplate rabbitTemplate;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //通过rabbitmq记录log
        LogRecord log = new LogRecord();
        log.setRequestSession(httpServletRequest.getSession().toString());
        log.setRequestUrI(httpServletRequest.getRequestURI());
        log.setRequestMethod(httpServletRequest.getMethod());
        log.setRequestIp(httpServletRequest.getRemoteAddr());
        log.setRequestContextPath(httpServletRequest.getContextPath());
        logger.info(" handler  " + o.toString() + "  " + o.getClass().getName());
        //response
//        log.setResponseString(httpServletResponse.getOutputStream().toString()); //引起序列化异常：java.lang.IllegalStateException: getOutputStream() has already been called for this response
        log.setResponseStatus(httpServletResponse.getStatus());
        rabbitTemplate.convertAndSend("log", JsonUtils.toJson(log));
//        全局拦截判断用户是否登录
//        User user = (User) httpServletRequest.getSession().getAttribute("user");
//        if (user == null) {
//            httpServletResponse.sendRedirect("toLogin");
//            return true;
//        } else {
//            return true;
//        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
