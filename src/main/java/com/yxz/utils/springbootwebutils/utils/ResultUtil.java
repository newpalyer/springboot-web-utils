package com.yxz.utils.springbootwebutils.utils;

import com.yxz.utils.springbootwebutils.domain.CommonResult;
import com.yxz.utils.springbootwebutils.utils.consts.StatusCode;

/**
 * @Author： yuzx
 * @Description:
 * @DateTime: Created in 2019/7/22 18:25
 */
public class ResultUtil {
    public static CommonResult result(int code,String msg,Object obj){
        return new CommonResult(code,msg,obj);
    }

    public static CommonResult success(String msg,Object obj){
        return result(StatusCode.SUCCESS,msg,obj);
    }

    public static CommonResult success(Object obj){
        return success(null,obj);
    }
    public static CommonResult success(){
        return success(null,null);
    }

    public static CommonResult fail(String msg,Object obj){
        return result(StatusCode.FAIL,msg,obj);
    }

    public static CommonResult fail(Object obj){
        return fail(null,obj);
    }
    public static CommonResult fail(){
        return fail(null,null);
    }

    public static CommonResult invoke(boolean b){
        return b?success():fail();
    }

}
