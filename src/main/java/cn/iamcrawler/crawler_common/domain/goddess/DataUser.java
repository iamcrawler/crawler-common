package cn.iamcrawler.crawler_common.domain.goddess;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Created by liuliang on 2019/3/21.
 */
@TableName("data_user")
@Data
public class DataUser {

    private Long id;

    @TableField("nick_name")
    private String nickName;

    private String phone;

    @TableField("register_time_label")
    private String date;

}
