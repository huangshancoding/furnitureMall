package com.chonghuitang.mall.config;

import com.chonghuitang.mall.entity.Result;
import com.chonghuitang.mall.util.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author lxl
 * @Description 异常统一处理类
 */

@ControllerAdvice
public class ContollerAdviceForAll {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result errorHandler(Exception exception){
        return ResultUtil.error(exception.getMessage());
    }

}
