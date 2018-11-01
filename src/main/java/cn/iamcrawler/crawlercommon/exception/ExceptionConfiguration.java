package cn.iamcrawler.crawlercommon.exception;

import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by liuliang on 2018/11/1.
 */
@Configuration
public class ExceptionConfiguration  extends WebMvcConfigurerAdapter implements EnvironmentAware {

    private RelaxedPropertyResolver propertyResolver;
    @Override
    public void setEnvironment(Environment environment) {
        this.propertyResolver = new RelaxedPropertyResolver(environment, "spring.messageSource.");
    }
    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:/exceptionMessage/exceptions");//指定到待读的properties文件
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setCacheSeconds(propertyResolver.getProperty("cacheSeconds", Integer.class, 1000));
        return messageSource;
    }

}
