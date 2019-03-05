package com.library.library.mapper;

import com.library.library.pojo.doubanbookInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {
    /**
     * 查询评分最高的前10本书
     * @return
     */
    List<doubanbookInfo> selectTopBooks();

    /**
     * 根据书名或作者模糊查询
     * @param title
     * @param author
     * @return
     */
    List<doubanbookInfo> selectBooksByMess(@Param("title") String title,@Param("author") String author);

    /**
     * 添加图书信息
     * @param doubanbookInfo
     * @return
     */
    int insertBook(doubanbookInfo doubanbookInfo);

    /**
     * 删除图书信息
     * @param isbn
     * @return
     */
    int deleteBook(@Param("isbn") String isbn);

    /**
     * 修改图书信息
     * @param doubanbookInfo
     * @return
     */
    int modifBook(doubanbookInfo doubanbookInfo);

    /**
     * 根据isbn获取图书信息
     * @param isbn
     * @return
     */
    doubanbookInfo selectBookByIsbn(@Param("isbn") String isbn);

    /**
     * 分页查询图书信息
     * @param pageSize
     * @param pageNo
     * @return
     */
    List<doubanbookInfo> selectBookByFenye(@Param("pageSize") int pageSize,@Param("pageNo") int pageNo);

    /**
     * 分页模糊查询
     * @param pageNo
     * @param pageSize
     * @param title
     * @param author
     * @return
     */
    List<doubanbookInfo> selectBookByMessFenye(@Param("pageNo") Integer pageNo, @Param("pageSize") Integer pageSize, @Param("title") String title,@Param("author") String author);

    /**
     * 模糊查询数量
     * @param title
     * @param author
     * @return
     */
    int selectCountByFenye(@Param("title") String title,@Param("author") String author);

    /**
     * 获取全部图书数量
     * @return
     */
    int selectBookCount();


}
