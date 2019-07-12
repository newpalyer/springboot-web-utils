package com.yxz.utils.springbootwebutils.domain;

import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.Objects;

/**
 * @Author： yuzx
 * @Description:
 * @DateTime: Created in 2019/7/5 10:34
 */
public class ReqMappingBean {
    private String bex;

    private String server;

    private Boolean vaild;

    private String name;

    private String className;

    private String methodName;

    private String[] value;

    private String[] fullValue;

    private RequestMethod[] method;

    private String[] path;

    private String[] params;

    private String[] headers;

    private String[] consumes;

    private String[] produces;

    public String getBex() {
        return bex;
    }

    public void setBex(String bex) {
        this.bex = bex;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public Boolean getVaild() {
        return vaild;
    }

    public void setVaild(Boolean vaild) {
        this.vaild = vaild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getValue() {
        return value;
    }

    public void setValue(String[] value) {
        this.value = value;
    }

    public String[] getPath() {
        return path;
    }

    public void setPath(String[] path) {
        this.path = path;
    }

    public String[] getParams() {
        return params;
    }

    public void setParams(String[] params) {
        this.params = params;
    }

    public String[] getHeaders() {
        return headers;
    }

    public void setHeaders(String[] headers) {
        this.headers = headers;
    }

    public String[] getConsumes() {
        return consumes;
    }

    public void setConsumes(String[] consumes) {
        this.consumes = consumes;
    }

    public String[] getProduces() {
        return produces;
    }

    public void setProduces(String[] produces) {
        this.produces = produces;
    }

    public RequestMethod[] getMethod() {
        return method;
    }

    public void setMethod(RequestMethod[] method) {
        this.method = method;
    }

    public String[] getFullValue() {
        return fullValue;
    }

    public void setFullValue(String[] fullValue) {
        this.fullValue = fullValue;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ReqMappingBean){
            ReqMappingBean o = (ReqMappingBean) obj;
            return o.getBex().equals(this.bex);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.bex);
    }

    @Override
    public String toString() {
        return "ReqMappingBean{" +
                "bex='" + bex + '\'' +
                ", server='" + server + '\'' +
                ", vaild=" + vaild +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                ", value=" + Arrays.toString(value) +
                ", fullValue=" + Arrays.toString(fullValue) +
                ", method=" + Arrays.toString(method) +
                ", path=" + Arrays.toString(path) +
                ", params=" + Arrays.toString(params) +
                ", headers=" + Arrays.toString(headers) +
                ", consumes=" + Arrays.toString(consumes) +
                ", produces=" + Arrays.toString(produces) +
                '}';
    }
}
