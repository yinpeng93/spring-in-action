package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author yp
 * @description AbstractAnnotationConfigDispatcherServletInitializer会同时创建DispatcherServlet和ContextLoaderListener
 * 两个应用上下文，DispatcherServlet主要用于加载web组件的bean，例如控制器，视图解析器，处理器映射，ContextLoaderListener主要是加载
 * 应用的中间层和数据层组件
 * @date 2017/11/16 23:26
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    /**
     * 用于定义ContextLoaderListener创建应用上下文的bean
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    /**
     * 用于定义DispatcherServlet创建的web组件bean
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    /**
     * 将DispatcherServlet映射到"/"，也就是会处理进入应用的所有请求
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
