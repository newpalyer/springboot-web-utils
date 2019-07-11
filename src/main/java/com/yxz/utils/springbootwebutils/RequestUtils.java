package com.yxz.utils.springbootwebutils;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author： yuzx
 * @Description:
 * @DateTime: Created in 2019/7/9 17:46
 */
public class RequestUtils {
    public static HttpServletRequest getRequest(){
        Assert.notNull(RequestContextHolder.getRequestAttributes(),
                "RequestContextHolder.getRequestAttributes() is Null");
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }
    public static String getIpAddress(){
        HttpServletRequest request = getRequest();
        String ip = request.getHeader("X-Real-IP");

        if (!StringUtils.isEmpty(ip) && !"unknown".equalsIgnoreCase(ip)){
            return ip;
        }

        ip = request.getHeader("x-forwarded-for");
        if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)){
            ip = request.getRemoteAddr();
            if (ip.equals("127.0.0.1") || ip.equals("0:0:0:0:0:0:0:1")) {
                // 根据网卡取本机配置的IP
                InetAddress inet = null;
                try {
                    inet = InetAddress.getLocalHost();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                ip = inet != null ? inet.getHostAddress() : null;
            }
        }
        if (!StringUtils.isEmpty(ip) && !"unknown".equalsIgnoreCase(ip)){
            int index = ip.indexOf(",");
            if (index != -1){
                return ip.substring(0, index);
            } else {
                return ip;
            }
        }
        return ip;
    }
}
