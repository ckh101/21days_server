package com.zhku.my21days.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zhku.my21days.base.AbstractExample;

/**
 * <p>系统名称： <b>NETARK-通用网管平台V1.0</b></p>
 * <p>公司：  中通服软件科技有限公司</p>
 * <p>表名称：test_analys</p> 
 * <p>域对象：Analys.java</p> 
 * <p>SQL映射文件：org.androidpn.server.model.test_analys_SqlMap.xml</p>
 * @see org.androidpn.server.model.Analys
 * @see org.androidpn.server.dao.AnalysDAO
 * @author 戈亮锋
 * @Create On：2014-03-22 16:35:35
 */
public class AnalysExample extends AbstractExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public AnalysExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected AnalysExample(AnalysExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
    }

    public String getTableName() {
        return  "test_analys";
    }

    /**
     * 对应关联的表名为:  test_analys
     */
    public static class Criteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andAIdIsNull() {
            addCriterion("id is null");
            return this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("id is not null");
            return this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("id =", value, "aId");
            return this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "aId");
            return this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("id >", value, "aId");
            return this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "aId");
            return this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("id <", value, "aId");
            return this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "aId");
            return this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("id in", values, "aId");
            return this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "aId");
            return this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "aId");
            return this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "aId");
            return this;
        }

        public Criteria andAnimalIsNull() {
            addCriterion("animal is null");
            return this;
        }

        public Criteria andAnimalIsNotNull() {
            addCriterion("animal is not null");
            return this;
        }

        public Criteria andAnimalEqualTo(String value) {
            addCriterion("animal =", value, "animal");
            return this;
        }

        public Criteria andAnimalNotEqualTo(String value) {
            addCriterion("animal <>", value, "animal");
            return this;
        }

        public Criteria andAnimalGreaterThan(String value) {
            addCriterion("animal >", value, "animal");
            return this;
        }

        public Criteria andAnimalGreaterThanOrEqualTo(String value) {
            addCriterion("animal >=", value, "animal");
            return this;
        }

        public Criteria andAnimalLessThan(String value) {
            addCriterion("animal <", value, "animal");
            return this;
        }

        public Criteria andAnimalLessThanOrEqualTo(String value) {
            addCriterion("animal <=", value, "animal");
            return this;
        }

        public Criteria andAnimalLike(String value) {
            addCriterion("animal like", value, "animal");
            return this;
        }

        public Criteria andAnimalNotLike(String value) {
            addCriterion("animal not like", value, "animal");
            return this;
        }

        public Criteria andAnimalIn(List<String> values) {
            addCriterion("animal in", values, "animal");
            return this;
        }

        public Criteria andAnimalNotIn(List<String> values) {
            addCriterion("animal not in", values, "animal");
            return this;
        }

        public Criteria andAnimalBetween(String value1, String value2) {
            addCriterion("animal between", value1, value2, "animal");
            return this;
        }

        public Criteria andAnimalNotBetween(String value1, String value2) {
            addCriterion("animal not between", value1, value2, "animal");
            return this;
        }

        public Criteria andDicripIsNull() {
            addCriterion("dicrip is null");
            return this;
        }

        public Criteria andDicripIsNotNull() {
            addCriterion("dicrip is not null");
            return this;
        }

        public Criteria andDicripEqualTo(String value) {
            addCriterion("dicrip =", value, "dicrip");
            return this;
        }

        public Criteria andDicripNotEqualTo(String value) {
            addCriterion("dicrip <>", value, "dicrip");
            return this;
        }

        public Criteria andDicripGreaterThan(String value) {
            addCriterion("dicrip >", value, "dicrip");
            return this;
        }

        public Criteria andDicripGreaterThanOrEqualTo(String value) {
            addCriterion("dicrip >=", value, "dicrip");
            return this;
        }

        public Criteria andDicripLessThan(String value) {
            addCriterion("dicrip <", value, "dicrip");
            return this;
        }

        public Criteria andDicripLessThanOrEqualTo(String value) {
            addCriterion("dicrip <=", value, "dicrip");
            return this;
        }

        public Criteria andDicripLike(String value) {
            addCriterion("dicrip like", value, "dicrip");
            return this;
        }

        public Criteria andDicripNotLike(String value) {
            addCriterion("dicrip not like", value, "dicrip");
            return this;
        }

        public Criteria andDicripIn(List<String> values) {
            addCriterion("dicrip in", values, "dicrip");
            return this;
        }

        public Criteria andDicripNotIn(List<String> values) {
            addCriterion("dicrip not in", values, "dicrip");
            return this;
        }

        public Criteria andDicripBetween(String value1, String value2) {
            addCriterion("dicrip between", value1, value2, "dicrip");
            return this;
        }

        public Criteria andDicripNotBetween(String value1, String value2) {
            addCriterion("dicrip not between", value1, value2, "dicrip");
            return this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return this;
        }
    }
}