package com.library.library.service.impl;

import com.library.library.mapper.MessingMapper;
import com.library.library.pojo.messing;
import com.library.library.service.MessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("messingServiceImpl")
@Transactional
public class MessingServiceImpl implements MessingService {

    @Autowired
    @Qualifier("messingMapper")
    private MessingMapper messingMapper;

    @Override
    public int insertMess(messing messing) {
        return 0;
    }

    @Override
    public int updateMess(messing messing) {
        return 0;
}

    @Override
    public messing selectMessById(Integer mesId) {
        return this.messingMapper.selectMessById(mesId);
    }

    @Override
    public List<messing> selectMesslist(Integer pageNo, Integer pageSize, String mesTitle) {
        return this.messingMapper.selectMesslist(pageNo,pageSize,mesTitle);
    }

    @Override
    public int selectMesslistCount(String mesTitle) {
        return this.messingMapper.selectMesslistCount(mesTitle);
    }

    @Override
    public List<messing> selectAll() {
        return this.messingMapper.selectAll();
    }

    @Override
    public int selectCount() {
        return this.messingMapper.selectCount();
    }

    @Override
    public List<messing> selctTopFour() {
        return this.messingMapper.selctTopFour();
    }

    @Override
    public List<messing> selectMesBy() {
        return this.messingMapper.selectMesBy();
    }

    @Override
    public List<messing> selectMesByMes(String mesBy) {
        return this.messingMapper.selectMesByMes(mesBy);
    }
}
