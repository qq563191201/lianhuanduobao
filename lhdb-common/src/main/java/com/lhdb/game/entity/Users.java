package com.lhdb.game.entity;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.lhdb.game.util.CustomDateSerializer;
import com.lhdb.game.util.CustomDateSerializeryyyyMMddHHmmss;

public class Users {
	
	private String spreaderIds;
	
	private List<SpreadRateInfo> spreaderList;
	
	public String getSpreaderIds() {
		return spreaderIds;
	}

	public void setSpreaderIds(String spreaderIds) {
		this.spreaderIds = spreaderIds;
	}
	
	public List<SpreadRateInfo> getSpreaderList() {
		return spreaderList;
	}

	public void setSpreaderList(List<SpreadRateInfo> spreaderList) {
		this.spreaderList = spreaderList;
	}
	
	private String secret;
	
	/**
     * 角色ID
     */
    private Integer roleid;
    
    /**
     * 
     * @return 角色id
     */
    public Integer getRoleid() {
        return roleid;
    }
    
    /**
     * 
     * @param roleid
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    } 
    
    /**
     * 角色名称
     */
    private String rolename;
    
    /**
     * 
     * @return 角色名称
     */
    public String getRolename() {
        return rolename;
    }
    
    /**
     * 
     * @param rolename
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    } 
    
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Users.UserID
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Users.Username
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Users.Password
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Users.Nullity
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    private Byte nullity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Users.PreLogintime
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    private Date prelogintime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Users.PreLoginIP
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    private String preloginip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Users.LastLogintime
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    private Date lastlogintime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Users.LastLoginIP
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    private String lastloginip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Users.LoginTimes
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    private Integer logintimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Users.IsBand
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    private Integer isband;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Users.BandIP
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    private String bandip;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Users.UserID
     *
     * @return the value of Users.UserID
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Users.UserID
     *
     * @param userid the value for Users.UserID
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Users.Username
     *
     * @return the value of Users.Username
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Users.Username
     *
     * @param username the value for Users.Username
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Users.Password
     *
     * @return the value of Users.Password
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Users.Password
     *
     * @param password the value for Users.Password
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Users.Nullity
     *
     * @return the value of Users.Nullity
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public Byte getNullity() {
        return nullity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Users.Nullity
     *
     * @param nullity the value for Users.Nullity
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public void setNullity(Byte nullity) {
        this.nullity = nullity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Users.PreLogintime
     *
     * @return the value of Users.PreLogintime
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getPrelogintime() {
        return prelogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Users.PreLogintime
     *
     * @param prelogintime the value for Users.PreLogintime
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public void setPrelogintime(Date prelogintime) {
        this.prelogintime = prelogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Users.PreLoginIP
     *
     * @return the value of Users.PreLoginIP
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public String getPreloginip() {
        return preloginip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Users.PreLoginIP
     *
     * @param preloginip the value for Users.PreLoginIP
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public void setPreloginip(String preloginip) {
        this.preloginip = preloginip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Users.LastLogintime
     *
     * @return the value of Users.LastLogintime
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    @JsonSerialize(using = CustomDateSerializeryyyyMMddHHmmss.class)
    public Date getLastlogintime() {
        return lastlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Users.LastLogintime
     *
     * @param lastlogintime the value for Users.LastLogintime
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Users.LastLoginIP
     *
     * @return the value of Users.LastLoginIP
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public String getLastloginip() {
        return lastloginip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Users.LastLoginIP
     *
     * @param lastloginip the value for Users.LastLoginIP
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Users.LoginTimes
     *
     * @return the value of Users.LoginTimes
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public Integer getLogintimes() {
        return logintimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Users.LoginTimes
     *
     * @param logintimes the value for Users.LoginTimes
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public void setLogintimes(Integer logintimes) {
        this.logintimes = logintimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Users.IsBand
     *
     * @return the value of Users.IsBand
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public Integer getIsband() {
        return isband;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Users.IsBand
     *
     * @param isband the value for Users.IsBand
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public void setIsband(Integer isband) {
        this.isband = isband;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Users.BandIP
     *
     * @return the value of Users.BandIP
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public String getBandip() {
        return bandip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Users.BandIP
     *
     * @param bandip the value for Users.BandIP
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public void setBandip(String bandip) {
        this.bandip = bandip;
    }

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}
    
}