package com.lhdb.game.entity;

import java.util.ArrayList;
import java.util.List;

public class RolePermissionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RolePermission
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RolePermission
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RolePermission
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RolePermission
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    public RolePermissionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RolePermission
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RolePermission
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RolePermission
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RolePermission
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RolePermission
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RolePermission
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RolePermission
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RolePermission
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RolePermission
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RolePermission
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table RolePermission
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRoleidIsNull() {
            addCriterion("RoleID is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("RoleID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("RoleID =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("RoleID <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("RoleID >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RoleID >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("RoleID <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("RoleID <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("RoleID in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("RoleID not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("RoleID between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("RoleID not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andModuleidIsNull() {
            addCriterion("ModuleID is null");
            return (Criteria) this;
        }

        public Criteria andModuleidIsNotNull() {
            addCriterion("ModuleID is not null");
            return (Criteria) this;
        }

        public Criteria andModuleidEqualTo(Integer value) {
            addCriterion("ModuleID =", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotEqualTo(Integer value) {
            addCriterion("ModuleID <>", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidGreaterThan(Integer value) {
            addCriterion("ModuleID >", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ModuleID >=", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidLessThan(Integer value) {
            addCriterion("ModuleID <", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidLessThanOrEqualTo(Integer value) {
            addCriterion("ModuleID <=", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidIn(List<Integer> values) {
            addCriterion("ModuleID in", values, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotIn(List<Integer> values) {
            addCriterion("ModuleID not in", values, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidBetween(Integer value1, Integer value2) {
            addCriterion("ModuleID between", value1, value2, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotBetween(Integer value1, Integer value2) {
            addCriterion("ModuleID not between", value1, value2, "moduleid");
            return (Criteria) this;
        }

        public Criteria andManagerpermissionIsNull() {
            addCriterion("ManagerPermission is null");
            return (Criteria) this;
        }

        public Criteria andManagerpermissionIsNotNull() {
            addCriterion("ManagerPermission is not null");
            return (Criteria) this;
        }

        public Criteria andManagerpermissionEqualTo(Long value) {
            addCriterion("ManagerPermission =", value, "managerpermission");
            return (Criteria) this;
        }

        public Criteria andManagerpermissionNotEqualTo(Long value) {
            addCriterion("ManagerPermission <>", value, "managerpermission");
            return (Criteria) this;
        }

        public Criteria andManagerpermissionGreaterThan(Long value) {
            addCriterion("ManagerPermission >", value, "managerpermission");
            return (Criteria) this;
        }

        public Criteria andManagerpermissionGreaterThanOrEqualTo(Long value) {
            addCriterion("ManagerPermission >=", value, "managerpermission");
            return (Criteria) this;
        }

        public Criteria andManagerpermissionLessThan(Long value) {
            addCriterion("ManagerPermission <", value, "managerpermission");
            return (Criteria) this;
        }

        public Criteria andManagerpermissionLessThanOrEqualTo(Long value) {
            addCriterion("ManagerPermission <=", value, "managerpermission");
            return (Criteria) this;
        }

        public Criteria andManagerpermissionIn(List<Long> values) {
            addCriterion("ManagerPermission in", values, "managerpermission");
            return (Criteria) this;
        }

        public Criteria andManagerpermissionNotIn(List<Long> values) {
            addCriterion("ManagerPermission not in", values, "managerpermission");
            return (Criteria) this;
        }

        public Criteria andManagerpermissionBetween(Long value1, Long value2) {
            addCriterion("ManagerPermission between", value1, value2, "managerpermission");
            return (Criteria) this;
        }

        public Criteria andManagerpermissionNotBetween(Long value1, Long value2) {
            addCriterion("ManagerPermission not between", value1, value2, "managerpermission");
            return (Criteria) this;
        }

        public Criteria andOperationpermissionIsNull() {
            addCriterion("OperationPermission is null");
            return (Criteria) this;
        }

        public Criteria andOperationpermissionIsNotNull() {
            addCriterion("OperationPermission is not null");
            return (Criteria) this;
        }

        public Criteria andOperationpermissionEqualTo(Long value) {
            addCriterion("OperationPermission =", value, "operationpermission");
            return (Criteria) this;
        }

        public Criteria andOperationpermissionNotEqualTo(Long value) {
            addCriterion("OperationPermission <>", value, "operationpermission");
            return (Criteria) this;
        }

        public Criteria andOperationpermissionGreaterThan(Long value) {
            addCriterion("OperationPermission >", value, "operationpermission");
            return (Criteria) this;
        }

        public Criteria andOperationpermissionGreaterThanOrEqualTo(Long value) {
            addCriterion("OperationPermission >=", value, "operationpermission");
            return (Criteria) this;
        }

        public Criteria andOperationpermissionLessThan(Long value) {
            addCriterion("OperationPermission <", value, "operationpermission");
            return (Criteria) this;
        }

        public Criteria andOperationpermissionLessThanOrEqualTo(Long value) {
            addCriterion("OperationPermission <=", value, "operationpermission");
            return (Criteria) this;
        }

        public Criteria andOperationpermissionIn(List<Long> values) {
            addCriterion("OperationPermission in", values, "operationpermission");
            return (Criteria) this;
        }

        public Criteria andOperationpermissionNotIn(List<Long> values) {
            addCriterion("OperationPermission not in", values, "operationpermission");
            return (Criteria) this;
        }

        public Criteria andOperationpermissionBetween(Long value1, Long value2) {
            addCriterion("OperationPermission between", value1, value2, "operationpermission");
            return (Criteria) this;
        }

        public Criteria andOperationpermissionNotBetween(Long value1, Long value2) {
            addCriterion("OperationPermission not between", value1, value2, "operationpermission");
            return (Criteria) this;
        }

        public Criteria andStateflagIsNull() {
            addCriterion("StateFlag is null");
            return (Criteria) this;
        }

        public Criteria andStateflagIsNotNull() {
            addCriterion("StateFlag is not null");
            return (Criteria) this;
        }

        public Criteria andStateflagEqualTo(Integer value) {
            addCriterion("StateFlag =", value, "stateflag");
            return (Criteria) this;
        }

        public Criteria andStateflagNotEqualTo(Integer value) {
            addCriterion("StateFlag <>", value, "stateflag");
            return (Criteria) this;
        }

        public Criteria andStateflagGreaterThan(Integer value) {
            addCriterion("StateFlag >", value, "stateflag");
            return (Criteria) this;
        }

        public Criteria andStateflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("StateFlag >=", value, "stateflag");
            return (Criteria) this;
        }

        public Criteria andStateflagLessThan(Integer value) {
            addCriterion("StateFlag <", value, "stateflag");
            return (Criteria) this;
        }

        public Criteria andStateflagLessThanOrEqualTo(Integer value) {
            addCriterion("StateFlag <=", value, "stateflag");
            return (Criteria) this;
        }

        public Criteria andStateflagIn(List<Integer> values) {
            addCriterion("StateFlag in", values, "stateflag");
            return (Criteria) this;
        }

        public Criteria andStateflagNotIn(List<Integer> values) {
            addCriterion("StateFlag not in", values, "stateflag");
            return (Criteria) this;
        }

        public Criteria andStateflagBetween(Integer value1, Integer value2) {
            addCriterion("StateFlag between", value1, value2, "stateflag");
            return (Criteria) this;
        }

        public Criteria andStateflagNotBetween(Integer value1, Integer value2) {
            addCriterion("StateFlag not between", value1, value2, "stateflag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table RolePermission
     *
     * @mbggenerated do_not_delete_during_merge Fri Oct 31 15:08:52 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table RolePermission
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}