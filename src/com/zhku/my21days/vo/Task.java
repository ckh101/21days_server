package com.zhku.my21days.vo;

import java.io.Serializable;
import java.util.Date;

/**

 * <p>表名称：tasklist</p> 
 * <p>域对象：Task.java</p> 
 * <p>SQL映射文件：com.zhku.my21days.vo.tasklist_SqlMap.xml</p>
 * @see com.zhku.my21days.vo.TaskExample
 * @see com.zhku.my21days.dao.TaskDAO
 * @author 陈凯浩
 * @Create On：2014-04-26 23:05:33
 */
public class Task implements Serializable {
    private Integer taId;

    private String userId;

    private String content;

    private String changeSelf;

    private String date1;

    private String time;

    private Integer onoff;

    private Integer alarm;

    private Integer dates;

    private Integer status;

    private String reward;

    private String punishment;

    private Integer alarmnum;

    private Date create;

    private static final long serialVersionUID = 1L;

    public Integer getTaId() {
        return taId;
    }

    public void setTaId(Integer taId) {
        this.taId = taId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getChangeSelf() {
        return changeSelf;
    }

    public void setChangeSelf(String changeSelf) {
        this.changeSelf = changeSelf;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getOnoff() {
        return onoff;
    }

    public void setOnoff(Integer onoff) {
        this.onoff = onoff;
    }

    public Integer getAlarm() {
        return alarm;
    }

    public void setAlarm(Integer alarm) {
        this.alarm = alarm;
    }

    public Integer getDates() {
        return dates;
    }

    public void setDates(Integer dates) {
        this.dates = dates;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public String getPunishment() {
        return punishment;
    }

    public void setPunishment(String punishment) {
        this.punishment = punishment;
    }

    public Integer getAlarmnum() {
        return alarmnum;
    }

    public void setAlarmnum(Integer alarmnum) {
        this.alarmnum = alarmnum;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public String getTableName() {
        return  "tasklist";
    }
}