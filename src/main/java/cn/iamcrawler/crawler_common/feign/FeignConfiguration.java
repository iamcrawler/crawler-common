package cn.iamcrawler.crawler_common.feign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liuliang on 2019/4/19.
 */
@ComponentScan
@Configuration
@EnableFeignClients
public class FeignConfiguration {
}
