package com.jjm.gm_springboot.exception;

import com.jjm.gm_springboot.utils.ResponseCode;
import com.jjm.gm_springboot.utils.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理类。
 * 使用 slf4j 保存日志信息。
 * 此处使用了 统一结果处理 类 Result 用于包装异常信息。
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 处理 Exception 异常
     * @param e 异常
     * @return 处理结果
     */
    @ExceptionHandler(Exception.class)
    public ResultData handlerException(Exception e) {
        logger.error(e.getMessage(), e);
        return ResultData.error(String.valueOf(ResponseCode.INTERNAL_SERVER_ERROR.val()),"服务器内部错误!");
    }

    /**
     * 处理空指针异常
     * @param e 异常
     * @return 处理结果
     */
    @ExceptionHandler(NullPointerException.class)
    public ResultData handlerNullPointerException(NullPointerException e) {
        logger.error(e.getMessage(), e);
        return ResultData.error(String.valueOf(ResponseCode.INTERNAL_SERVER_ERROR),"空指针异常");
    }

    /**
     * 处理自定义异常
     * @param e 异常
     * @return 处理结果
     */
    @ExceptionHandler(GlobalException.class)
    public ResultData handlerGlobalException(GlobalException e) {
        logger.error(e.getMessage(), e);
        return ResultData.error(e.getCode(),e.getMessage());
    }
}

