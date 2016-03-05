package com.zhku.my21days.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>系统名称： <b>NETARK-通用网管平台V1.0</b></p>
 * <p>公司：  中通服软件科技有限公司</p>
 * <p>表名称：test_question</p> 
 * <p>域对象：Question.java</p> 
 * <p>SQL映射文件：org.androidpn.server.model.test_question_SqlMap.xml</p>
 * @see org.androidpn.server.model.QuestionExample
 * @see org.androidpn.server.dao.QuestionDAO
 * @author 戈亮锋
 * @Create On：2014-03-22 16:35:35
 */
public class Question implements Serializable {
    private Integer qId;

    private Integer qnum;

    private String question;

    private Date time;

    private static final long serialVersionUID = 1L;

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public Integer getQnum() {
        return qnum;
    }

    public void setQnum(Integer qnum) {
        this.qnum = qnum;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTableName() {
        return  "test_question";
    }
}