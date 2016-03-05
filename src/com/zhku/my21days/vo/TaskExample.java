package com.zhku.my21days.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.zhku.my21days.base.AbstractExample;

/**

 * <p>表名称：tasklist</p> 
 * <p>域对象：Task.java</p> 
 * <p>SQL映射文件：com.zhku.my21days.vo.tasklist_SqlMap.xml</p>
 * @see com.zhku.my21days.vo.Task
 * @see com.zhku.my21days.dao.TaskDAO
 * @author 陈凯浩
 * @Create On：2014-04-26 23:05:33
 */
public class TaskExample extends AbstractExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected TaskExample(TaskExample example) {
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
        return  "tasklist";
    }

    /**
     * 对应关联的表名为:  tasklist
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTaIdIsNull() {
            addCriterion("id is null");
            return this;
        }

        public Criteria andTaIdIsNotNull() {
            addCriterion("id is not null");
            return this;
        }

        public Criteria andTaIdEqualTo(Integer value) {
            addCriterion("id =", value, "taId");
            return this;
        }

        public Criteria andTaIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "taId");
            return this;
        }

        public Criteria andTaIdGreaterThan(Integer value) {
            addCriterion("id >", value, "taId");
            return this;
        }

        public Criteria andTaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "taId");
            return this;
        }

        public Criteria andTaIdLessThan(Integer value) {
            addCriterion("id <", value, "taId");
            return this;
        }

        public Criteria andTaIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "taId");
            return this;
        }

        public Criteria andTaIdIn(List<Integer> values) {
            addCriterion("id in", values, "taId");
            return this;
        }

        public Criteria andTaIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "taId");
            return this;
        }

        public Criteria andTaIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "taId");
            return this;
        }

        public Criteria andTaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "taId");
            return this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("userId is null");
            return this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("userId is not null");
            return this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("userId =", value, "userId");
            return this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("userId <>", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("userId >", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("userId <", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userId");
            return this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("userId like", value, "userId");
            return this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("userId not like", value, "userId");
            return this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("userId in", values, "userId");
            return this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("userId not in", values, "userId");
            return this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userId");
            return this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userId");
            return this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return this;
        }

        public Criteria andChangeSelfIsNull() {
            addCriterion("changeself is null");
            return this;
        }

        public Criteria andChangeSelfIsNotNull() {
            addCriterion("changeself is not null");
            return this;
        }

        public Criteria andChangeSelfEqualTo(String value) {
            addCriterion("changeself =", value, "changeSelf");
            return this;
        }

        public Criteria andChangeSelfNotEqualTo(String value) {
            addCriterion("changeself <>", value, "changeSelf");
            return this;
        }

        public Criteria andChangeSelfGreaterThan(String value) {
            addCriterion("changeself >", value, "changeSelf");
            return this;
        }

        public Criteria andChangeSelfGreaterThanOrEqualTo(String value) {
            addCriterion("changeself >=", value, "changeSelf");
            return this;
        }

        public Criteria andChangeSelfLessThan(String value) {
            addCriterion("changeself <", value, "changeSelf");
            return this;
        }

        public Criteria andChangeSelfLessThanOrEqualTo(String value) {
            addCriterion("changeself <=", value, "changeSelf");
            return this;
        }

        public Criteria andChangeSelfLike(String value) {
            addCriterion("changeself like", value, "changeSelf");
            return this;
        }

        public Criteria andChangeSelfNotLike(String value) {
            addCriterion("changeself not like", value, "changeSelf");
            return this;
        }

        public Criteria andChangeSelfIn(List<String> values) {
            addCriterion("changeself in", values, "changeSelf");
            return this;
        }

        public Criteria andChangeSelfNotIn(List<String> values) {
            addCriterion("changeself not in", values, "changeSelf");
            return this;
        }

        public Criteria andChangeSelfBetween(String value1, String value2) {
            addCriterion("changeself between", value1, value2, "changeSelf");
            return this;
        }

        public Criteria andChangeSelfNotBetween(String value1, String value2) {
            addCriterion("changeself not between", value1, value2, "changeSelf");
            return this;
        }

        public Criteria andDate1IsNull() {
            addCriterion("date1 is null");
            return this;
        }

        public Criteria andDate1IsNotNull() {
            addCriterion("date1 is not null");
            return this;
        }

        public Criteria andDate1EqualTo(String value) {
            addCriterion("date1 =", value, "date1");
            return this;
        }

        public Criteria andDate1NotEqualTo(String value) {
            addCriterion("date1 <>", value, "date1");
            return this;
        }

        public Criteria andDate1GreaterThan(String value) {
            addCriterion("date1 >", value, "date1");
            return this;
        }

        public Criteria andDate1GreaterThanOrEqualTo(String value) {
            addCriterion("date1 >=", value, "date1");
            return this;
        }

        public Criteria andDate1LessThan(String value) {
            addCriterion("date1 <", value, "date1");
            return this;
        }

        public Criteria andDate1LessThanOrEqualTo(String value) {
            addCriterion("date1 <=", value, "date1");
            return this;
        }

        public Criteria andDate1Like(String value) {
            addCriterion("date1 like", value, "date1");
            return this;
        }

        public Criteria andDate1NotLike(String value) {
            addCriterion("date1 not like", value, "date1");
            return this;
        }

        public Criteria andDate1In(List<String> values) {
            addCriterion("date1 in", values, "date1");
            return this;
        }

        public Criteria andDate1NotIn(List<String> values) {
            addCriterion("date1 not in", values, "date1");
            return this;
        }

        public Criteria andDate1Between(String value1, String value2) {
            addCriterion("date1 between", value1, value2, "date1");
            return this;
        }

        public Criteria andDate1NotBetween(String value1, String value2) {
            addCriterion("date1 not between", value1, value2, "date1");
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

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return this;
        }

        public Criteria andOnoffIsNull() {
            addCriterion("onoff is null");
            return this;
        }

        public Criteria andOnoffIsNotNull() {
            addCriterion("onoff is not null");
            return this;
        }

        public Criteria andOnoffEqualTo(Integer value) {
            addCriterion("onoff =", value, "onoff");
            return this;
        }

        public Criteria andOnoffNotEqualTo(Integer value) {
            addCriterion("onoff <>", value, "onoff");
            return this;
        }

        public Criteria andOnoffGreaterThan(Integer value) {
            addCriterion("onoff >", value, "onoff");
            return this;
        }

        public Criteria andOnoffGreaterThanOrEqualTo(Integer value) {
            addCriterion("onoff >=", value, "onoff");
            return this;
        }

        public Criteria andOnoffLessThan(Integer value) {
            addCriterion("onoff <", value, "onoff");
            return this;
        }

        public Criteria andOnoffLessThanOrEqualTo(Integer value) {
            addCriterion("onoff <=", value, "onoff");
            return this;
        }

        public Criteria andOnoffIn(List<Integer> values) {
            addCriterion("onoff in", values, "onoff");
            return this;
        }

        public Criteria andOnoffNotIn(List<Integer> values) {
            addCriterion("onoff not in", values, "onoff");
            return this;
        }

        public Criteria andOnoffBetween(Integer value1, Integer value2) {
            addCriterion("onoff between", value1, value2, "onoff");
            return this;
        }

        public Criteria andOnoffNotBetween(Integer value1, Integer value2) {
            addCriterion("onoff not between", value1, value2, "onoff");
            return this;
        }

        public Criteria andAlarmIsNull() {
            addCriterion("alarm is null");
            return this;
        }

        public Criteria andAlarmIsNotNull() {
            addCriterion("alarm is not null");
            return this;
        }

        public Criteria andAlarmEqualTo(Integer value) {
            addCriterion("alarm =", value, "alarm");
            return this;
        }

        public Criteria andAlarmNotEqualTo(Integer value) {
            addCriterion("alarm <>", value, "alarm");
            return this;
        }

        public Criteria andAlarmGreaterThan(Integer value) {
            addCriterion("alarm >", value, "alarm");
            return this;
        }

        public Criteria andAlarmGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm >=", value, "alarm");
            return this;
        }

        public Criteria andAlarmLessThan(Integer value) {
            addCriterion("alarm <", value, "alarm");
            return this;
        }

        public Criteria andAlarmLessThanOrEqualTo(Integer value) {
            addCriterion("alarm <=", value, "alarm");
            return this;
        }

        public Criteria andAlarmIn(List<Integer> values) {
            addCriterion("alarm in", values, "alarm");
            return this;
        }

        public Criteria andAlarmNotIn(List<Integer> values) {
            addCriterion("alarm not in", values, "alarm");
            return this;
        }

        public Criteria andAlarmBetween(Integer value1, Integer value2) {
            addCriterion("alarm between", value1, value2, "alarm");
            return this;
        }

        public Criteria andAlarmNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm not between", value1, value2, "alarm");
            return this;
        }

        public Criteria andDatesIsNull() {
            addCriterion("dates is null");
            return this;
        }

        public Criteria andDatesIsNotNull() {
            addCriterion("dates is not null");
            return this;
        }

        public Criteria andDatesEqualTo(Integer value) {
            addCriterion("dates =", value, "dates");
            return this;
        }

        public Criteria andDatesNotEqualTo(Integer value) {
            addCriterion("dates <>", value, "dates");
            return this;
        }

        public Criteria andDatesGreaterThan(Integer value) {
            addCriterion("dates >", value, "dates");
            return this;
        }

        public Criteria andDatesGreaterThanOrEqualTo(Integer value) {
            addCriterion("dates >=", value, "dates");
            return this;
        }

        public Criteria andDatesLessThan(Integer value) {
            addCriterion("dates <", value, "dates");
            return this;
        }

        public Criteria andDatesLessThanOrEqualTo(Integer value) {
            addCriterion("dates <=", value, "dates");
            return this;
        }

        public Criteria andDatesIn(List<Integer> values) {
            addCriterion("dates in", values, "dates");
            return this;
        }

        public Criteria andDatesNotIn(List<Integer> values) {
            addCriterion("dates not in", values, "dates");
            return this;
        }

        public Criteria andDatesBetween(Integer value1, Integer value2) {
            addCriterion("dates between", value1, value2, "dates");
            return this;
        }

        public Criteria andDatesNotBetween(Integer value1, Integer value2) {
            addCriterion("dates not between", value1, value2, "dates");
            return this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return this;
        }

        public Criteria andRewardIsNull() {
            addCriterion("reward is null");
            return this;
        }

        public Criteria andRewardIsNotNull() {
            addCriterion("reward is not null");
            return this;
        }

        public Criteria andRewardEqualTo(String value) {
            addCriterion("reward =", value, "reward");
            return this;
        }

        public Criteria andRewardNotEqualTo(String value) {
            addCriterion("reward <>", value, "reward");
            return this;
        }

        public Criteria andRewardGreaterThan(String value) {
            addCriterion("reward >", value, "reward");
            return this;
        }

        public Criteria andRewardGreaterThanOrEqualTo(String value) {
            addCriterion("reward >=", value, "reward");
            return this;
        }

        public Criteria andRewardLessThan(String value) {
            addCriterion("reward <", value, "reward");
            return this;
        }

        public Criteria andRewardLessThanOrEqualTo(String value) {
            addCriterion("reward <=", value, "reward");
            return this;
        }

        public Criteria andRewardLike(String value) {
            addCriterion("reward like", value, "reward");
            return this;
        }

        public Criteria andRewardNotLike(String value) {
            addCriterion("reward not like", value, "reward");
            return this;
        }

        public Criteria andRewardIn(List<String> values) {
            addCriterion("reward in", values, "reward");
            return this;
        }

        public Criteria andRewardNotIn(List<String> values) {
            addCriterion("reward not in", values, "reward");
            return this;
        }

        public Criteria andRewardBetween(String value1, String value2) {
            addCriterion("reward between", value1, value2, "reward");
            return this;
        }

        public Criteria andRewardNotBetween(String value1, String value2) {
            addCriterion("reward not between", value1, value2, "reward");
            return this;
        }

        public Criteria andPunishmentIsNull() {
            addCriterion("punishment is null");
            return this;
        }

        public Criteria andPunishmentIsNotNull() {
            addCriterion("punishment is not null");
            return this;
        }

        public Criteria andPunishmentEqualTo(String value) {
            addCriterion("punishment =", value, "punishment");
            return this;
        }

        public Criteria andPunishmentNotEqualTo(String value) {
            addCriterion("punishment <>", value, "punishment");
            return this;
        }

        public Criteria andPunishmentGreaterThan(String value) {
            addCriterion("punishment >", value, "punishment");
            return this;
        }

        public Criteria andPunishmentGreaterThanOrEqualTo(String value) {
            addCriterion("punishment >=", value, "punishment");
            return this;
        }

        public Criteria andPunishmentLessThan(String value) {
            addCriterion("punishment <", value, "punishment");
            return this;
        }

        public Criteria andPunishmentLessThanOrEqualTo(String value) {
            addCriterion("punishment <=", value, "punishment");
            return this;
        }

        public Criteria andPunishmentLike(String value) {
            addCriterion("punishment like", value, "punishment");
            return this;
        }

        public Criteria andPunishmentNotLike(String value) {
            addCriterion("punishment not like", value, "punishment");
            return this;
        }

        public Criteria andPunishmentIn(List<String> values) {
            addCriterion("punishment in", values, "punishment");
            return this;
        }

        public Criteria andPunishmentNotIn(List<String> values) {
            addCriterion("punishment not in", values, "punishment");
            return this;
        }

        public Criteria andPunishmentBetween(String value1, String value2) {
            addCriterion("punishment between", value1, value2, "punishment");
            return this;
        }

        public Criteria andPunishmentNotBetween(String value1, String value2) {
            addCriterion("punishment not between", value1, value2, "punishment");
            return this;
        }

        public Criteria andAlarmnumIsNull() {
            addCriterion("alarmnum is null");
            return this;
        }

        public Criteria andAlarmnumIsNotNull() {
            addCriterion("alarmnum is not null");
            return this;
        }

        public Criteria andAlarmnumEqualTo(Integer value) {
            addCriterion("alarmnum =", value, "alarmnum");
            return this;
        }

        public Criteria andAlarmnumNotEqualTo(Integer value) {
            addCriterion("alarmnum <>", value, "alarmnum");
            return this;
        }

        public Criteria andAlarmnumGreaterThan(Integer value) {
            addCriterion("alarmnum >", value, "alarmnum");
            return this;
        }

        public Criteria andAlarmnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarmnum >=", value, "alarmnum");
            return this;
        }

        public Criteria andAlarmnumLessThan(Integer value) {
            addCriterion("alarmnum <", value, "alarmnum");
            return this;
        }

        public Criteria andAlarmnumLessThanOrEqualTo(Integer value) {
            addCriterion("alarmnum <=", value, "alarmnum");
            return this;
        }

        public Criteria andAlarmnumIn(List<Integer> values) {
            addCriterion("alarmnum in", values, "alarmnum");
            return this;
        }

        public Criteria andAlarmnumNotIn(List<Integer> values) {
            addCriterion("alarmnum not in", values, "alarmnum");
            return this;
        }

        public Criteria andAlarmnumBetween(Integer value1, Integer value2) {
            addCriterion("alarmnum between", value1, value2, "alarmnum");
            return this;
        }

        public Criteria andAlarmnumNotBetween(Integer value1, Integer value2) {
            addCriterion("alarmnum not between", value1, value2, "alarmnum");
            return this;
        }

        public Criteria andCreateIsNull() {
            addCriterion("created is null");
            return this;
        }

        public Criteria andCreateIsNotNull() {
            addCriterion("created is not null");
            return this;
        }

        public Criteria andCreateEqualTo(Date value) {
            addCriterionForJDBCDate("created =", value, "create");
            return this;
        }

        public Criteria andCreateNotEqualTo(Date value) {
            addCriterionForJDBCDate("created <>", value, "create");
            return this;
        }

        public Criteria andCreateGreaterThan(Date value) {
            addCriterionForJDBCDate("created >", value, "create");
            return this;
        }

        public Criteria andCreateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("created >=", value, "create");
            return this;
        }

        public Criteria andCreateLessThan(Date value) {
            addCriterionForJDBCDate("created <", value, "create");
            return this;
        }

        public Criteria andCreateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("created <=", value, "create");
            return this;
        }

        public Criteria andCreateIn(List<Date> values) {
            addCriterionForJDBCDate("created in", values, "create");
            return this;
        }

        public Criteria andCreateNotIn(List<Date> values) {
            addCriterionForJDBCDate("created not in", values, "create");
            return this;
        }

        public Criteria andCreateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("created between", value1, value2, "create");
            return this;
        }

        public Criteria andCreateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("created not between", value1, value2, "create");
            return this;
        }
    }
}