package com.library.library.mapper;

import com.library.library.pojo.publishers;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublishersMapper {
    /**
     * 获取出版社信息
     * @return
     */
    List<publishers> selectPublishers();

    /**
     * 添加出版社信息
     * @param publishers
     * @return
     */
    int insertPublisher(publishers publishers);

    /**
     * 删除出版社
     * @param pubId
     * @return
     */
    int deletePiublisher(@Param("pubId") int pubId);

    /**
     * 根据id获取出版社信息
     * @param pubId
     * @return
     */
    publishers selectPubById(@Param("pubId") int pubId);

    /**
     * 分页查询
     * @param pageNo
     * @param pageSize
     * @param pubName
     * @param city
     * @return
     */
    List<publishers> selectPubByFenye(@Param("pageNo") Integer pageNo, @Param("pageSize") Integer pageSize,@Param("pubName") String pubName,@Param("city") String city);

    /**
     * 查询总数量
     * @return
     */
    int selectPubCount();




}
