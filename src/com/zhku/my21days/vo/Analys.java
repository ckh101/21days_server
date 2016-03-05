package com.zhku.my21days.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>系统名称： <b>NETARK-通用网管平台V1.0</b></p>
 * <p>公司：  中通服软件科技有限公司</p>
 * <p>表名称：test_analys</p> 
 * <p>域对象：Analys.java</p> 
 * <p>SQL映射文件：com.zhku.my21days.vo.test_analys_SqlMap.xml</p>
 * @see com.zhku.my21days.vo.AnalysExample
 * @see org.androidpn.server.dao.AnalysDAO
 * @author 戈亮锋
 * @Create On：2014-03-22 16:35:35
 */
public class Analys implements Serializable {
    private Integer aId;

    private String animal;

    private String dicrip;

    private Date time;

    private static final long serialVersionUID = 1L;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getDicrip() {
        return dicrip;
    }

    public void setDicrip(String dicrip) {
        this.dicrip = dicrip;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTableName() {
        return  "test_analys";
    }
}