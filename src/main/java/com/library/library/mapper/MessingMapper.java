package com.library.library.mapper;

import com.library.library.pojo.messing;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessingMapper {
    /**
     * 添加公告
     * @param messing
     * @return
     */
    int insertMess(messing messing);

    /**
     * 修改公告
     * @param messing
     * @return
     */
    int updateMess(messing messing);

    /**
     * 根据id获取公告
     * @param mesId
     * @return
     */
    messing selectMessById(@Param("mesId") Integer mesId);

    /**
     * 分页查询公告
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<messing> selectMesslist(@Param("pageNo") Integer pageNo, @Param("pageSize") Integer pageSize,@Param("mesTitle") String mesTitle);

    /**
     * 分页查询数量
     * @return
     */
    int selectMesslistCount(@Param("mesTitle") String mesTitle);

    /**
     * 查询全部
     * @return
     */
    List<messing> selectAll();

    /**
     * 查询总数量
     * @return
     */
    int selectCount();

    /**
     * 查询近期的四篇公告
     * @return
     */
    List<messing> selctTopFour();

    /**
     * 根据作者group by
     * @return
     */
    List<messing> selectMesBy();

    /**
     * 根据作者查询
     * @return
     */
    List<messing> selectMesByMes(String mesBy);
}
