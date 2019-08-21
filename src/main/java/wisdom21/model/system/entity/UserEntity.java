package wisdom21.model.system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@TableName("sys_user")
public class UserEntity {
    /**
     *   `id` bigint(20) NOT NULL COMMENT '用户主键',
     *   `username` varchar(255) NOT NULL COMMENT '用户名',
     *   `password` varchar(255) NOT NULL COMMENT '密码',
     *   `type` int(10) DEFAULT '2' COMMENT '账户类型，0是超级管理员，1是普通管理员，2是普通用户',
     *   `age` int(11) DEFAULT NULL COMMENT '年龄',
     *   `surname` varchar(255) DEFAULT NULL COMMENT '姓',
     *   `name` varchar(255) DEFAULT NULL COMMENT '名字',
     *   `avatar_url` varchar(500) DEFAULT NULL COMMENT '头像',
     *   `gender` int(10) DEFAULT '0' COMMENT '性别，0是保密，1是女，2是男',
     *   `birth_time` date DEFAULT NULL COMMENT '出生日期',
     *   `personal_profile` varchar(255) DEFAULT NULL COMMENT '个人简介',
     *   `phone_number` varchar(20) DEFAULT NULL COMMENT '手机号码',
     *   `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
     *   `create_time` datetime DEFAULT NULL COMMENT '创建时间',
     *   `update_time` datetime DEFAULT NULL COMMENT '更改时间',
     *   `delete_flag` int(1) DEFAULT NULL COMMENT '删除标志，0正常，-1为删除',
     */

    @TableId
    private Integer id;
    //用户名
    @NotBlank(message = "用户名不能为空")
    private String username;
    //密码
    @NotBlank(message = "密码不能为空")
    private String password;

    private Integer type;

    @Min(value = 0,message = "年龄不能小于0")
    private Integer age;

    private String surname;

    private String name;

    private String avatarUrl;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthTime;

    private String personalProfile;

    private String phoneNumber;

    private String email;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    @TableField(value = "delete_flag")
    @TableLogic(value = "0",delval = "-1")
    private Integer deleteFlag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getType() {
        return type;
    }

    public Date getBirthTime() {
        return birthTime;
    }

    public void setBirthTime(Date birthTime) {
        this.birthTime = birthTime;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalProfile() {
        return personalProfile;
    }

    public void setPersonalProfile(String personalProfile) {
        this.personalProfile = personalProfile;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
