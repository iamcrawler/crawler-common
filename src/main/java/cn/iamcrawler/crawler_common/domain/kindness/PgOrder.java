package cn.iamcrawler.crawler_common.domain.kindness;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class PgOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String itemName;

    private BigDecimal amount;

    private LocalDateTime createdDate;

    private LocalDateTime updateDate;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


}
