package com.library.library.service.impl;

import com.library.library.mapper.UsersnMapper;
import com.library.library.pojo.usersn;
import com.library.library.service.UsersnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("usersnServiceImpl")
@Transactional
public class UsersnServiceImpl implements UsersnService {
    @Autowired
    @Qualifier("usersnMapper")
    private UsersnMapper usersnMapper;


    @Override
    public int insertUsersnByPhone(usersn usersn) {
        return this.usersnMapper.insertUsersnByPhone(usersn);
    }

    @Override
    public int insertUsersnByEmail(usersn usersn) {
        return this.usersnMapper.insertUsersnByEmail(usersn) ;
    }

    @Override
    public List<usersn> selectUsersn() {
        return this.usersnMapper.selectUsersn();
    }

    @Override
    public int removeUsersn(int id) {
        return this.usersnMapper.removeUsersn(id);
    }

    @Override
    public int modifUsersnMail(usersn usersn) {
        return this.usersnMapper.modifUsersnMail(usersn);
    }

    @Override
    public int modifUsersnPhone(usersn usersn) {
        return this.usersnMapper.modifUsersnPhone(usersn);
    }

    @Override
    public usersn selectUsersnById(int id) {
        return this.usersnMapper.selectUsersnById(id);
    }

    @Override
    public usersn selectUsersnByPhone(String phone) {
        return this.usersnMapper.selectUsersnByPhone(phone);
    }

    @Override
    public usersn selectUsersnByMail(String mail) {
        return this.usersnMapper.selectUsersnByMail(mail);
    }

    @Override
    public usersn loginUsersn(String uname, String pwd) {
        return this.usersnMapper.loginUsersn(uname,pwd);
    }

    @Override
    public usersn loginUsersnEmail(String mail, String pwd) {
        return this.usersnMapper.loginUsersnEmail(mail,pwd);
    }

    @Override
    public List<usersn> selectUserByFenye(Integer pageNo, Integer pageSize, String uname, String idCard) {
        return this.usersnMapper.selectUserByFenye(pageNo,pageSize,uname,idCard);
    }

    @Override
    public int selectUserCount() {
        return this.usersnMapper.selectUserCount();
    }
}
