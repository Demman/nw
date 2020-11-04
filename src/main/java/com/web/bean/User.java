package com.web.bean;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.Entity;
import java.io.Serializable;


@Alias("uservo")
@Data
@Entity
public class User implements Serializable {

    @ApiModelProperty(value="用户id")
    private  String userId;
    @ApiModelProperty(value="用户名称")
    private  String userName;
}
