package com.apitest.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServeletContainerInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};

    }
}

//public class ServeletContainerInitConfig extends AbstractDispatcherServletInitializer {
//    @Override
//    protected WebApplicationContext createServletApplicationContext() {
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(SpringMvcConfig.class);
//        return ctx;
//    }
//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//    @Override
//    protected WebApplicationContext createRootApplicationContext(){
//        return null;
//    }
//
//}
