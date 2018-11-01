package cn.iamcrawler.crawlercommon.domain.goddess;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by liuliang on 2018/11/1.
 */
@TableName("goddess_role")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoddessRole {

    private Long id;

    private String role;

}
