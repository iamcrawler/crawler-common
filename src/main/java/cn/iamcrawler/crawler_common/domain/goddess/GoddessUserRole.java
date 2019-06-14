package cn.iamcrawler.crawler_common.domain.goddess;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by liuliang on 2018/11/1.
 */
@TableName("goddess_user_role")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GoddessUserRole {

    private Long id;

    @TableField("user_id")
    private Long userId;

    @TableField("role_id")
    private Long roleId;

}
