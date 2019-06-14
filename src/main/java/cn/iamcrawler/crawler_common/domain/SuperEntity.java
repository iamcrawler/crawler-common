package cn.iamcrawler.crawler_common.domain;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

import java.util.Date;

/**
 * Created by liuliang on 2019/4/19.
 */
@Data
public class SuperEntity {
    private Long id;

    private Date createDate;

    private Date updateDate;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;
}
