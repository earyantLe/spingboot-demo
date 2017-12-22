package com.earyant.common.dto;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.MissingServletRequestParameterException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @version: V1.0
 * @des:
 * @author: CTSIG
 * @email: shenzhaoxiang@gmail.com
 * @date: 2017-02-22 19:08
 */
public class ExceptionType {

    /**
     * 异常错误匹配方法
     * @param ex
     * @return code：错误码 msg：错误描述
     */
    public static CodeMsgContants getErrorMessage(Exception ex) {
        if (ex instanceof ArithmeticException) {
            return CodeMsgContants.ArithmeticException;
        }
        if (ex instanceof NullPointerException) {
            return CodeMsgContants.NullPointerException;
        }
        if (ex instanceof ClassCastException) {
            return CodeMsgContants.ClassCastException;
        }
        if (ex instanceof NegativeArraySizeException) {
            return CodeMsgContants.NegativeArraySizeException;
        }
        if (ex instanceof ArrayIndexOutOfBoundsException) {
            return CodeMsgContants.ArrayIndexOutOfBoundsException;
        }
        if (ex instanceof FileNotFoundException) {
            return CodeMsgContants.FileNotFoundException;
        }
        if (ex instanceof NumberFormatException) {
            return CodeMsgContants.NumberFormatException;
        }
        if (ex instanceof SQLException) {
            return CodeMsgContants.SQLException;
        }
        if (ex instanceof IOException) {
            return CodeMsgContants.IOException;
        }
        if (ex instanceof NoSuchMethodException) {
            return CodeMsgContants.NoSuchMethodException;
        }
        if (ex instanceof DataIntegrityViolationException) {
            return CodeMsgContants.DataIntegrityViolationException;
        }
//        if (ex instanceof MyBatisSystemException) {
//            return CodeMsgContants.MyBatisSystemException;
//        }
        if (ex instanceof MissingServletRequestParameterException) {
            return CodeMsgContants.MissingServletRequestParameterException;
        }

        return CodeMsgContants.OtherException;
    }
}
