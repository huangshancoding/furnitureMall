package com.chonghuitang.mall.util;

import com.chonghuitang.mall.entity.Result;
import com.chonghuitang.mall.entity.ResultEnum;

/**
 * @author lxl
 * @Description 返回值工具类
 */
public class ResultUtil {

    public static Result success(){
        return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getMsg());
    }

    public static  Result success(Object object){
        return new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getMsg(),object);
    }

    public static Result notFound(){
        return new Result(ResultEnum.NOT_FOUND.getCode(),ResultEnum.NOT_FOUND.getMsg());
    }

    public static Result parameterError(){
        return new Result(ResultEnum.PARAMETER_ERROR.getCode(),ResultEnum.PARAMETER_ERROR.getMsg());
    }

    public static Result error(){
        return new Result(ResultEnum.ERROR.getCode(),ResultEnum.ERROR.getMsg());
    }

    public static Result error(Object object){
        return new Result(ResultEnum.ERROR.getCode(),ResultEnum.ERROR.getMsg(),object);
    }
}
