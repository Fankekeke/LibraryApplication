package com.library.library.service.impl;

import com.library.library.mapper.BookMapper;
import com.library.library.pojo.doubanbookInfo;
import com.library.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("bookServiceImpl")
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    @Qualifier("bookMapper")
    private BookMapper bookMapper;

    @Override
    public List<doubanbookInfo> selectTopBooks() {
        return this.bookMapper.selectTopBooks();
    }

    @Override
    public List<doubanbookInfo> selectBooksByMess(String title, String author) {
        return this.bookMapper.selectBooksByMess(title, author);
    }

    @Override
    public int insertBook(doubanbookInfo doubanbookInfo) {
        return this.bookMapper.insertBook(doubanbookInfo);
    }

    @Override
    public int deleteBook(String isbn) {
        return this.bookMapper.deleteBook(isbn);
    }

    @Override
    public int modifBook(doubanbookInfo doubanbookInfo) {
        return this.bookMapper.modifBook(doubanbookInfo);
    }

    @Override
    public doubanbookInfo selectBookByIsbn(String isbn) {
        return this.bookMapper.selectBookByIsbn(isbn);
    }

    @Override
    public List<doubanbookInfo> selectBookByFenye(int pageSize, int pageNo) {
        return this.bookMapper.selectBookByFenye(pageSize,pageNo);
    }

    @Override
    public List<doubanbookInfo> selectBookByMessFenye(Integer pageNo, Integer pageSize, String title, String author) {
        return this.bookMapper.selectBookByMessFenye(pageNo,pageSize,title,author);
    }

    @Override
    public int selectCountByFenye(String title, String author) {
        return this.bookMapper.selectCountByFenye(title,author);
    }

    @Override
    public int selectBookCount() {
        return this.bookMapper.selectBookCount();
    }
}
