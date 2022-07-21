package com.seig.config;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {
    //解析请求
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //获取请求中的国际化参数
        String language = request.getParameter("l");
        //默认的地区
        Locale locale = Locale.getDefault();
        //如果请求的链接参数不为空,携带了国际化参数
        if (!StringUtils.isEmpty(language)) {
            String[] split = language.split("_");//zh_CN(语言_地区)
            locale = new Locale(split[0], split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
