package com.library.library.mapper;

import com.library.library.pojo.authors;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorMapper {
    /**
     * 查询所有作者信息
     * @return
     */
    List<authors> selectAuthors();

    /**
     * 根据id查询作者信息
     * @param auId
     * @return
     */
    authors selectAuthorById(@Param("auId") int auId);

    /**
     * 添加作者信息
     * @param authors
     * @return
     */
    int insertAuthor(authors authors);

    /**
     * 删除作者信息
     * @param auId
     * @return
     */
    int deleteAuthor(@Param("auId") int auId);

    /**
     * 修改作者信息
     * @param authors
     * @return
     */
    int updateAuthor(authors authors);

    /**
     * 分页查询
     * @param pageNo
     * @param pageSize
     * @param auIname
     * @param auSex
     * @return
     */
    List<authors> selectAuthorsByFenye(@Param("pageNo") Integer pageNo, @Param("pageSize") Integer pageSize,@Param("auIname") String auIname,@Param("auSex") Integer auSex);

    /**
     * 查询作者数量
     * @return
     */
    int selectAuCount();


}
