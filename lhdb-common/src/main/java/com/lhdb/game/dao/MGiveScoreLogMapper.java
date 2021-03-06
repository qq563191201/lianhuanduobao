package com.lhdb.game.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lhdb.game.entity.MGiveScoreLog;
import com.lhdb.game.entity.MGiveScoreLogExample;

public interface MGiveScoreLogMapper {
	
	List<MGiveScoreLog> searchOnPage(MGiveScoreLog record);
	
	MGiveScoreLog count(MGiveScoreLog record);
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_give_score_log
     *
     * @mbggenerated Wed Dec 07 21:17:25 CST 2016
     */
    int countByExample(MGiveScoreLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_give_score_log
     *
     * @mbggenerated Wed Dec 07 21:17:25 CST 2016
     */
    int deleteByExample(MGiveScoreLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_give_score_log
     *
     * @mbggenerated Wed Dec 07 21:17:25 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_give_score_log
     *
     * @mbggenerated Wed Dec 07 21:17:25 CST 2016
     */
    int insert(MGiveScoreLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_give_score_log
     *
     * @mbggenerated Wed Dec 07 21:17:25 CST 2016
     */
    int insertSelective(MGiveScoreLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_give_score_log
     *
     * @mbggenerated Wed Dec 07 21:17:25 CST 2016
     */
    List<MGiveScoreLog> selectByExample(MGiveScoreLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_give_score_log
     *
     * @mbggenerated Wed Dec 07 21:17:25 CST 2016
     */
    MGiveScoreLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_give_score_log
     *
     * @mbggenerated Wed Dec 07 21:17:25 CST 2016
     */
    int updateByExampleSelective(@Param("record") MGiveScoreLog record, @Param("example") MGiveScoreLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_give_score_log
     *
     * @mbggenerated Wed Dec 07 21:17:25 CST 2016
     */
    int updateByExample(@Param("record") MGiveScoreLog record, @Param("example") MGiveScoreLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_give_score_log
     *
     * @mbggenerated Wed Dec 07 21:17:25 CST 2016
     */
    int updateByPrimaryKeySelective(MGiveScoreLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_give_score_log
     *
     * @mbggenerated Wed Dec 07 21:17:25 CST 2016
     */
    int updateByPrimaryKey(MGiveScoreLog record);
}