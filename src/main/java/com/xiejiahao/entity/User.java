package com.xiejiahao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author XieJiaHao
 * @since 2021-12-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="User对象", description="用户表")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增ID")
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "账户名")
    private String name;

    @ApiModelProperty(value = "密码")
    private String pwd;

    @ApiModelProperty(value = "用户头像")
    private String avatarUrl;

    @ApiModelProperty(value = "用户昵称")
    private String nickname;

    @ApiModelProperty(value = "签名")
    private String signature;

    @ApiModelProperty(value = "性别：0：女、1：男")
    private Integer sex;

    @ApiModelProperty(value = "创建时间")
      @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建时间")
      @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "最后登录时间")
    private Long lastSignIn;

    @ApiModelProperty(value = "登陆次数")
    private Long loginCount;

    @ApiModelProperty(value = "连续登录天数")
    private Integer continuityDays;

    @ApiModelProperty(value = "授权标识：0 允许，1 禁止")
    private Integer auth;

    @ApiModelProperty(value = "删除标识：0 未删除，1 已删除")
    @TableLogic
    private Integer deleteFlag;

    @ApiModelProperty(value = "注册IP")
    private String regIp;

    @ApiModelProperty(value = "最后登录IP")
    private String lastLoginIp;


}
