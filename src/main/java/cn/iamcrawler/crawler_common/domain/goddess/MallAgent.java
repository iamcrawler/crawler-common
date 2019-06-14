package cn.iamcrawler.crawler_common.domain.goddess;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by liuliang on 2019/3/30.
 */

@TableName("mall_agent")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MallAgent {
    @ApiModelProperty(value = "id")
    @TableId(type = IdType.ID_WORKER)
    private String id;
    @ApiModelProperty(value = "用户id")
    @TableField("user_id")
    private String userId;
    @ApiModelProperty(value = "代理等级（0，1，2，3，4）")
    @TableField("agent_level")
    private String agentLevel;
    @ApiModelProperty(value = "行业")
    @TableField("agent_industry")
    private String agentIndustry;
    @ApiModelProperty(value = "子行业")
    @TableField("agent_sub_industry")
    private String agentSubIndustry;
    @ApiModelProperty(value = "职业")
    @TableField("agent_profession")
    private String agentProfession;
    @TableField("agent_school")
    @ApiModelProperty(value = "学校")
    private String agentSchool;
    @TableField("agent_major")
    @ApiModelProperty(value = "专业")
    private String agentMajor;
    @ApiModelProperty(value = "学历")
    @TableField("agent_education")
    private String agentEducation;
    @ApiModelProperty(value = "单位")
    @TableField("agent_company")
    private String agentCompany;
    @TableField("agent_type")
    @ApiModelProperty(value = "类型")
    private String agentType;
    @TableField("create_date")
    @ApiModelProperty(value = "")
    private Date createDate;
    @TableField("update_date")
    @ApiModelProperty(value = "")
    private Date updateDate;
    @TableField("if_info")
    @ApiModelProperty(value = "是否完善代理信息")
    private Boolean ifInfo;
    @ApiModelProperty(value = "状态")
    private String status;
    @ApiModelProperty(value = "")
    @TableField("is_del")
    private String isDel;
    @ApiModelProperty(value = "上级节点id")
    @TableField("parent_id")
    private String parentId;
    @ApiModelProperty(value = "权值（目前最大的权值是10000）")
    private Integer value;
    @ApiModelProperty(value = "通讯地址")
    private String address;
    @ApiModelProperty(value = "是否总监")
    @TableField("if_major")
    private Boolean ifMajor;
    @ApiModelProperty(value = "是否后台升级 0=否1=是")
    @TableField("is_admin_upgrade")
    private String isAdminUpgrade;
    @ApiModelProperty(value = "备注")
    private String memo;
    @TableField("province")
    private String province;
    @TableField("city")
    private String city;
    @TableField("senior_adviser")
    private String seniorAdviser;
    @TableField("back_flag")
    private String backFlag;
    @ApiModelProperty(value = "是否是虚拟代理, 0是/1否")
    @TableField("invented")
    private String invented;
    @TableField("recovery_date")
    private Date recoveryDate;
    @TableField("top_flag")
    private String topFlag;
    @TableField("business_flag")
    private String businessFlag;
    @TableField("auth_book_url")
    private String authBookUrl;
    @TableField("last_parent_id")
    private String lastParentId;

//
//    @ApiModelProperty(value = "直属团队")
//    @TableField(exist = false)
//    private List<MallUser> direct;
//    @ApiModelProperty(value = "直属团队数量（即direct.size）")
//    @TableField(exist = false)
//    private Integer directNumber;
//    @ApiModelProperty(value = "关系链")
//    @TableField(exist = false)
//    private List<MallUser> relationChain;
//    @ApiModelProperty(value = "个人订单金额")
//    @TableField(exist = false)
//    private BigDecimal orderAmount;
//    @ApiModelProperty(value = "团队订单金额")
//    @TableField(exist = false)
//    private BigDecimal teamAmount;
//    @ApiModelProperty(value = "云库存")
//    @TableField(exist = false)
//    private List<CloudStockDto> cloudStock;
//    @ApiModelProperty(value = "用户信息")
//    @TableField(exist = false)
//    private MallUser user;

//    @ApiModelProperty(value = "用户信息")
//    @TableField(exist = false)
//    private MallUser user;

    @TableField(exist = false)
    @ApiModelProperty(value = "昵称")
    private String nickName;

    @TableField(exist = false)
    @ApiModelProperty(value = "姓名")
    private String name;

    @TableField(exist = false)
    @ApiModelProperty(value = "手机")
    private String phone;

    @TableField(exist = false)
    @ApiModelProperty(value = "性别")
    private String sex;

    @TableField(exist = false)
    @ApiModelProperty(value = "头像")
    private String icon;

    @TableField(exist = false)
    @ApiModelProperty(value = "职业")
    private String profession;

    @TableField(exist = false)
    @ApiModelProperty(value = "地区")
    private String area;

    @ApiModelProperty(value = "区")
    @TableField("city_area")
    private String cityArea;

    @TableField(exist = false)
    @ApiModelProperty(value = "微信登录ID")
    private String unionId;

    @TableField(exist = false)
    @ApiModelProperty(value = "生日")
    private Date birthday;

    @TableField(exist = false)
    @ApiModelProperty(value = "推荐人ID")
    private String referrerId;

    @TableField(exist = false)
    @ApiModelProperty(value = "推荐人名称")
    private String referrerName;

    @TableField(exist = false)
    @ApiModelProperty(value = "推荐人电话")
    private String referrerPhone;

    @TableField(exist = false)
    @ApiModelProperty(value = "推荐人等级")
    private String referrerLevel;

    @TableField(exist = false)
    @ApiModelProperty(value = "团队总人数")
    private String teamNumber;

    @ApiModelProperty(value = "身份证号")
    @TableField(exist = false)
    private String idCard;

    @TableField(exist = false)
    private List<String> agentIdList;

    @TableField(exist = false)
    private List<String> userIdList;

//    @TableField(exist = false)
//    private MallUser parentUser;
}

