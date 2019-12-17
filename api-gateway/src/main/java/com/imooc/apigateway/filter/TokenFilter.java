//package com.imooc.apigateway.filter;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//
//import javax.servlet.http.HttpServletRequest;
//
//import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
//import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;
//
///**
// * Created by 廖师兄
// * 2018-02-15 15:34
// */
//@Component
//public class TokenFilter extends ZuulFilter {
//    @Override
//    public String filterType() {
//        // 做参数校验，应该在之前
//        return PRE_TYPE;
//    }
//
//    @Override
//    public int filterOrder() {
//        // 放在这个之前 -1就可以
//        return PRE_DECORATION_FILTER_ORDER - 1;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    @Override
//    public Object run() {
//        // 获取上下文
//        RequestContext requestContext = RequestContext.getCurrentContext();
//        HttpServletRequest request = requestContext.getRequest();
//
//        //这里从url参数里获取, 也可以从cookie, header里获取
//        String token = request.getParameter("token");
//        // 如果是空，返回没有权限401
//        if (StringUtils.isEmpty(token)) {
//            requestContext.setSendZuulResponse(false);
//            requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
//        }
//        return null;
//    }
//}
