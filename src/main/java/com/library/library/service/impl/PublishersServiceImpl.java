package com.library.library.service.impl;

import com.library.library.mapper.PublishersMapper;
import com.library.library.pojo.publishers;
import com.library.library.service.PublishersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("publishersServiceImpl")
@Transactional
public class PublishersServiceImpl implements PublishersService {
    @Autowired
    @Qualifier("publishersMapper")
    private PublishersMapper publishersMapper;

    @Override
    public List<publishers> selectPublishers() {
        return this.publishersMapper.selectPublishers();
    }

    @Override
    public int insertPublisher(publishers publishers) {
        return this.publishersMapper.insertPublisher(publishers);
    }

    @Override
    public int deletePiublisher(int pubId) {
        return this.publishersMapper.deletePiublisher(pubId);
    }

    @Override
    public publishers selectPubById(int pubId) {
        return this.publishersMapper.selectPubById(pubId);
    }

    @Override
    public List<publishers> selectPubByFenye(Integer pageNo, Integer pageSize, String pubName, String city) {
        return this.publishersMapper.selectPubByFenye(pageNo,pageSize,pubName,city);
    }

    @Override
    public int selectPubCount() {
        return this.publishersMapper.selectPubCount();
    }
}
