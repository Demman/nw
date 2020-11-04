package com.web.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="userform")
@Data
public class UserForm {
    @ApiModelProperty(value="用户id")
    private  String userId;
    @ApiModelProperty(value="用户名称")
    private  String userName;
}

