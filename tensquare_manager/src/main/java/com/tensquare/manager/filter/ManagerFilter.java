package com.tensquare.manager.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

/**
 * @ClassName ManagerFilter
 * @auther tangh
 * @date 2019/2/2 0002 15:13
 */
@Component
public class ManagerFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "前置过滤器";
    }

    @Override
    public int filterOrder() {
        return 0;// 优先级为0，数字越大，优先级越低
    }

    @Override
    public boolean shouldFilter() {
        return true;// 是否执行该过滤器，
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("zuul过滤器");
        return null;
    }

}
