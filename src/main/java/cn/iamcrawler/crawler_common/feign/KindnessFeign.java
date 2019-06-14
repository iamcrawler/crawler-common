package cn.iamcrawler.crawler_common.feign;

import cn.iamcrawler.crawler_common.domain.kindness.PgOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liuliang on 2019/4/19.
 */
@FeignClient(value = "crawler-kindness")
public interface KindnessFeign {

    @PostMapping("/insert/order")
    Boolean insertOne(@RequestBody PgOrder order);

    @GetMapping("/insert/order")
    void testRedis();

}
