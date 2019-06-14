package cn.iamcrawler.crawler_common.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by liuliang on 2019/4/19.
 */
@FeignClient(value = "crawler-goddess")
public interface GoddessFeign {
}
