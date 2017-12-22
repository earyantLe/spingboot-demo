package com.earyant.config.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * Created by earyant on 2017 : 09 : 2017/9/21 0021 : 9:35 : .
 * idc  com.earyant.idc.config.interceptor
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    private String DEFAULT_ERROR_VIEW = "error";
    Logger logger = LoggerFactory.getLogger(GlobalDefaultExceptionHandler.class);


    @ResponseStatus(value = HttpStatus.CONFLICT, reason = "Data integrity violation")  // 409
    @ExceptionHandler(DataIntegrityViolationException.class)
    public void conflict() {
        // Nothing to do
    }

    @ExceptionHandler({SQLException.class, DataAccessException.class})
    public String databaseError() {
        // Nothing to do.  Returns the logical view name of an error page, passed to
        // the view-resolver(s) in usual way.
        // Note that the exception is _not_ available to this view (it is not added to
        // the model) but see "Extending ExceptionHandlerExceptionResolver" below.
        return "databaseError";
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleError(HttpServletRequest req, Exception exception) {
        logger.error("Request: " + req.getRequestURL() + " raised " + exception);
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", exception);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");
        return mav;
    }
}
