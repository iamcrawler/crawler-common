package cn.iamcrawler.crawler_common.domain.goddess;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by liuliang on 2018/11/1.
 */
@TableName("goddess_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GoddessUser {

    private Long id;

    private String code;

    @TableField("user_name")
    private String userName;

    private String password;

    private String mail;

    private String phone;


}
