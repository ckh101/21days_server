package com.zhku.my21days.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.zhku.my21days.base.AbstractExample;

/**
 
 * <p>表名称：user</p> 
 * <p>域对象：SysUser.java</p> 
 * <p>SQL映射文件：com.zhku.my21days.vo.user_SqlMap.xml</p>
 * @see com.zhku.my21days.vo.SysUser
 * @see com.zhku.my21days.dao.SysUserDAO
 * @author 陈凯浩
 * @Create On：2014-04-28 01:03:59
 */
public class SysUserExample extends AbstractExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected SysUserExample(SysUserExample example) {
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
        return  "user";
    }

    /**
     * 对应关联的表名为:  user
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

        public Criteria andUserIdIsNull() {
            addCriterion("id is null");
            return this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("id is not null");
            return this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("id =", value, "userId");
            return this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("id >", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("id <", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "userId");
            return this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("id in", values, "userId");
            return this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "userId");
            return this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "userId");
            return this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "userId");
            return this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("username is null");
            return this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("username is not null");
            return this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("username =", value, "userName");
            return this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("username <>", value, "userName");
            return this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("username >", value, "userName");
            return this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "userName");
            return this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("username <", value, "userName");
            return this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "userName");
            return this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("username like", value, "userName");
            return this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("username not like", value, "userName");
            return this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("username in", values, "userName");
            return this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("username not in", values, "userName");
            return this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "userName");
            return this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "userName");
            return this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("realname is null");
            return this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("realname is not null");
            return this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("realname =", value, "realName");
            return this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realName");
            return this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("realname >", value, "realName");
            return this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realName");
            return this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("realname <", value, "realName");
            return this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realName");
            return this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("realname like", value, "realName");
            return this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("realname not like", value, "realName");
            return this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("realname in", values, "realName");
            return this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realName");
            return this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realName");
            return this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realName");
            return this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return this;
        }

        public Criteria andEmaliIsNull() {
            addCriterion("email is null");
            return this;
        }

        public Criteria andEmaliIsNotNull() {
            addCriterion("email is not null");
            return this;
        }

        public Criteria andEmaliEqualTo(String value) {
            addCriterion("email =", value, "emali");
            return this;
        }

        public Criteria andEmaliNotEqualTo(String value) {
            addCriterion("email <>", value, "emali");
            return this;
        }

        public Criteria andEmaliGreaterThan(String value) {
            addCriterion("email >", value, "emali");
            return this;
        }

        public Criteria andEmaliGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "emali");
            return this;
        }

        public Criteria andEmaliLessThan(String value) {
            addCriterion("email <", value, "emali");
            return this;
        }

        public Criteria andEmaliLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "emali");
            return this;
        }

        public Criteria andEmaliLike(String value) {
            addCriterion("email like", value, "emali");
            return this;
        }

        public Criteria andEmaliNotLike(String value) {
            addCriterion("email not like", value, "emali");
            return this;
        }

        public Criteria andEmaliIn(List<String> values) {
            addCriterion("email in", values, "emali");
            return this;
        }

        public Criteria andEmaliNotIn(List<String> values) {
            addCriterion("email not in", values, "emali");
            return this;
        }

        public Criteria andEmaliBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "emali");
            return this;
        }

        public Criteria andEmaliNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "emali");
            return this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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

        public Criteria andRegistetimeIsNull() {
            addCriterion("registetime is null");
            return this;
        }

        public Criteria andRegistetimeIsNotNull() {
            addCriterion("registetime is not null");
            return this;
        }

        public Criteria andRegistetimeEqualTo(Date value) {
            addCriterionForJDBCDate("registetime =", value, "registetime");
            return this;
        }

        public Criteria andRegistetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("registetime <>", value, "registetime");
            return this;
        }

        public Criteria andRegistetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("registetime >", value, "registetime");
            return this;
        }

        public Criteria andRegistetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registetime >=", value, "registetime");
            return this;
        }

        public Criteria andRegistetimeLessThan(Date value) {
            addCriterionForJDBCDate("registetime <", value, "registetime");
            return this;
        }

        public Criteria andRegistetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registetime <=", value, "registetime");
            return this;
        }

        public Criteria andRegistetimeIn(List<Date> values) {
            addCriterionForJDBCDate("registetime in", values, "registetime");
            return this;
        }

        public Criteria andRegistetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("registetime not in", values, "registetime");
            return this;
        }

        public Criteria andRegistetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registetime between", value1, value2, "registetime");
            return this;
        }

        public Criteria andRegistetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registetime not between", value1, value2, "registetime");
            return this;
        }

        public Criteria andDescnIsNull() {
            addCriterion("descn is null");
            return this;
        }

        public Criteria andDescnIsNotNull() {
            addCriterion("descn is not null");
            return this;
        }

        public Criteria andDescnEqualTo(String value) {
            addCriterion("descn =", value, "descn");
            return this;
        }

        public Criteria andDescnNotEqualTo(String value) {
            addCriterion("descn <>", value, "descn");
            return this;
        }

        public Criteria andDescnGreaterThan(String value) {
            addCriterion("descn >", value, "descn");
            return this;
        }

        public Criteria andDescnGreaterThanOrEqualTo(String value) {
            addCriterion("descn >=", value, "descn");
            return this;
        }

        public Criteria andDescnLessThan(String value) {
            addCriterion("descn <", value, "descn");
            return this;
        }

        public Criteria andDescnLessThanOrEqualTo(String value) {
            addCriterion("descn <=", value, "descn");
            return this;
        }

        public Criteria andDescnLike(String value) {
            addCriterion("descn like", value, "descn");
            return this;
        }

        public Criteria andDescnNotLike(String value) {
            addCriterion("descn not like", value, "descn");
            return this;
        }

        public Criteria andDescnIn(List<String> values) {
            addCriterion("descn in", values, "descn");
            return this;
        }

        public Criteria andDescnNotIn(List<String> values) {
            addCriterion("descn not in", values, "descn");
            return this;
        }

        public Criteria andDescnBetween(String value1, String value2) {
            addCriterion("descn between", value1, value2, "descn");
            return this;
        }

        public Criteria andDescnNotBetween(String value1, String value2) {
            addCriterion("descn not between", value1, value2, "descn");
            return this;
        }
    }
}