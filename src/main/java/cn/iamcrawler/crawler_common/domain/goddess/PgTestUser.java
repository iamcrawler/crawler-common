package cn.iamcrawler.crawler_common.domain.goddess;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuliang
 * @since 2019-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("pg_test_user")
public class PgTestUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private Integer age;

    private String remark;

    private BigDecimal salary;

    private LocalDate birthday;

    private LocalDateTime createdDate;

    private LocalDateTime updateDate;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
