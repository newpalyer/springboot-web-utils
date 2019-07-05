package com.yxz.webutils.springbootwebutils.service;


import com.yxz.webutils.springbootwebutils.domain.ReqMappingBean;
import java.util.Map;

/**
 * @Author： yuzx
 * @Description:
 * @DateTime: Created in 2019/7/5 10:24
 */
public interface IRequestService {
    /**
     * 获取所有注解了@ReqMapping 的方法信息
     * 返回一个以bex作为key,ReqMappingBean 作为value的map
     * @return
     */
    public Map<String,ReqMappingBean> getAllReqMapping();
}
