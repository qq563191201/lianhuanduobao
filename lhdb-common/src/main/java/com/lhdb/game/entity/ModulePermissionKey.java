package com.lhdb.game.entity;

public class ModulePermissionKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ModulePermission.ModuleID
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    private Integer moduleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ModulePermission.PermissionValue
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    private Long permissionvalue;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ModulePermission.ModuleID
     *
     * @return the value of ModulePermission.ModuleID
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    public Integer getModuleid() {
        return moduleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ModulePermission.ModuleID
     *
     * @param moduleid the value for ModulePermission.ModuleID
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ModulePermission.PermissionValue
     *
     * @return the value of ModulePermission.PermissionValue
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    public Long getPermissionvalue() {
        return permissionvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ModulePermission.PermissionValue
     *
     * @param permissionvalue the value for ModulePermission.PermissionValue
     *
     * @mbggenerated Fri Oct 31 15:08:52 CST 2014
     */
    public void setPermissionvalue(Long permissionvalue) {
        this.permissionvalue = permissionvalue;
    }
}