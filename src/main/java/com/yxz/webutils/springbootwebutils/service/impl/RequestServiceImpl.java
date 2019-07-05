package com.yxz.webutils.springbootwebutils.service.impl;

import com.yxz.webutils.springbootwebutils.domain.ReqMappingBean;
import com.yxz.webutils.springbootwebutils.annotation.ReqMapping;
import com.yxz.webutils.springbootwebutils.service.IRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author： yuzx
 * @Description:
 * @DateTime: Created in 2019/7/5 10:43
 */
@Service
public class RequestServiceImpl implements IRequestService {
    @Autowired
    RequestMappingHandlerMapping handlerMapping;
    @Override
    public Map<String,ReqMappingBean> getAllReqMapping() {
        Map<String,ReqMappingBean> res = new HashMap<>();
        Map<RequestMappingInfo, HandlerMethod> map = handlerMapping.getHandlerMethods();
        map.forEach((info, handlerMethod) -> {
            Method method = handlerMethod.getMethod();
            if(method.isAnnotationPresent(ReqMapping.class)){
                ReqMapping req = method.getAnnotation(ReqMapping.class);
                ReqMappingBean reqMappingBean = new ReqMappingBean();
                reqMappingBean.setBex(req.bex());
                reqMappingBean.setName(req.name());
                reqMappingBean.setPath(req.path());
                reqMappingBean.setVaild(req.vaild());
                reqMappingBean.setServer(req.server());
                reqMappingBean.setConsumes(req.consumes());
                reqMappingBean.setHeaders(req.headers());
                reqMappingBean.setParams(req.params());
                reqMappingBean.setValue(req.value());
                reqMappingBean.setMethod(req.method());
                reqMappingBean.setProduces(req.produces());
                PatternsRequestCondition p = info.getPatternsCondition();
                reqMappingBean.setFullValue(p.getPatterns().toArray(new String[0]));
                reqMappingBean.setClassName(method.getDeclaringClass().getName());
                reqMappingBean.setMethodName(method.getName());
                res.put(req.bex(),reqMappingBean);
            }
        });
        return res;
    }
}
