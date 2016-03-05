package com.zhku.my21days.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>表名称：user</p> 
 * <p>域对象：SysUser.java</p> 
 * <p>SQL映射文件：com.zhku.my21days.vo.user_SqlMap.xml</p>
 * @see com.zhku.my21days.vo.SysUserExample
 * @see com.zhku.my21days.dao.SysUserDAO
 * @author 戈亮锋
 * @Create On：2014-04-28 01:03:59
 */
public class SysUser implements Serializable {
    private Integer userId;

    private String userName;

    private String password;

    private String realName;

    private String sex;

    private String address;

    private String emali;

    private String phone;

    private Integer status;

    private Date registetime;

    private String descn;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmali() {
        return emali;
    }

    public void setEmali(String emali) {
        this.emali = emali;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRegistetime() {
        return registetime;
    }

    public void setRegistetime(Date registetime) {
        this.registetime = registetime;
    }

    public String getDescn() {
        return descn;
    }

    public void setDescn(String descn) {
        this.descn = descn;
    }

    public String getTableName() {
        return  "user";
    }
}