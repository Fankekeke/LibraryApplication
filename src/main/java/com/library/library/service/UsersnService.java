package com.library.library.service;

import com.library.library.pojo.usersn;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersnService {
    /**
     * 添加手机用户
     * @param usersn
     */
    int insertUsersnByPhone(usersn usersn);

    /**
     * 添加邮箱用户
     * @param usersn
     */
    int insertUsersnByEmail(usersn usersn);

    /**
     * 查询用户
     * @return
     */
    List<usersn>selectUsersn();

    /**
     * 删除用户
     * @param id
     * @return
     */
    int removeUsersn(@Param("uid") int id);

    /**
     * 修改用户邮箱
     * @param usersn
     * @return
     */
    int modifUsersnMail(usersn usersn);

    /**
     * 修改用户手机号码
     * @param usersn
     * @return
     */
    int modifUsersnPhone(usersn usersn);

    /**
     * 根据id获取用户信息
     * @param id
     * @return
     */
    usersn selectUsersnById(@Param("uid") int id);

    /**
     * 注册判断手机号码是否重复
     * @param phone
     * @return
     */
    usersn selectUsersnByPhone(@Param("phone") String phone);

    /**
     * 注册判断邮箱地址是否重复
     * @param mail
     * @return
     */
    usersn selectUsersnByMail(@Param("mail") String mail);

    /**
     * 手机登录
     * @param uname
     * @param pwd
     * @return
     */
    usersn loginUsersn(@Param("uname") String uname,@Param("pwd") String pwd);

    /**
     * 邮箱登录
     * @param mail
     * @param pwd
     * @return
     */
    usersn loginUsersnEmail(@Param("mail") String mail,@Param("pwd") String pwd);

    /**
     * 模糊查询
     * @param pageNo
     * @param pageSize
     * @param uname
     * @param idCard
     * @return
     */
    List<usersn> selectUserByFenye(@Param("pageNo") Integer pageNo, @Param("pageSize") Integer pageSize,@Param("uname") String uname,@Param("idCard") String idCard);

    /**
     * 查询总数量
     * @return
     */
    int selectUserCount();
}
