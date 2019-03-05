package com.library.library.service.impl;

import com.library.library.mapper.AuthorMapper;
import com.library.library.pojo.authors;
import com.library.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("authorServiceImpl")
@Transactional
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    @Qualifier("authorMapper")
    private AuthorMapper authorMapper;
    @Override
    public List<authors> selectAuthors() {
        return this.authorMapper.selectAuthors();
    }

    @Override
    public authors selectAuthorById(int auId) {
        return this.authorMapper.selectAuthorById(auId);
    }

    @Override
    public int insertAuthor(authors authors) {
        return this.authorMapper.insertAuthor(authors);
    }

    @Override
    public int deleteAuthor(int auId) {
        return this.authorMapper.deleteAuthor(auId);
    }

    @Override
    public int updateAuthor(authors authors) {
        return this.authorMapper.updateAuthor(authors);
    }

    @Override
    public List<authors> selectAuthorsByFenye(Integer pageNo, Integer pageSize, String auIname, Integer auSex) {
        return this.authorMapper.selectAuthorsByFenye(pageNo,pageSize,auIname,auSex);
    }

    @Override
    public int selectAuCount() {
        return this.authorMapper.selectAuCount();
    }
}
