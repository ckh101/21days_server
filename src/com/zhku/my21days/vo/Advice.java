package com.zhku.my21days.vo;

import java.io.Serializable;
import java.util.Date;

/**
 
 * <p>表名称：advices</p> 
 * <p>域对象：Advice.java</p> 
 * <p>SQL映射文件：com.zhku.my21days.vo.advices_SqlMap.xml</p>
 * @see com.zhku.my21days.vo.AdviceExample
 * @see com.zhku.my21days.dao.AdviceDAO
 * @author 陈凯浩
 * @Create On：2014-04-24 23:10:35
 */
public class Advice implements Serializable {
    private Integer adId;

    private Integer type;

    private String name;

    private String part1;

    private String part2;

    private String part3;

    private Date time;

    private static final long serialVersionUID = 1L;

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public String getPart3() {
        return part3;
    }

    public void setPart3(String part3) {
        this.part3 = part3;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTableName() {
        return  "advices";
    }
}