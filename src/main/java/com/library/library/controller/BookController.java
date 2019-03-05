package com.library.library.controller;

import com.library.library.pojo.doubanbookInfo;
import com.library.library.pojo.usersn;
import com.library.library.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;
    String VerificationNum;
    Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 查询书籍
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "booklist", method = RequestMethod.GET)
    public String getBookList(Model model) {
        List<doubanbookInfo> bookList = new ArrayList<doubanbookInfo>();
        bookList=bookService.selectTopBooks();
        model.addAttribute("bookList", bookList);
        return "index";
    }

    @RequestMapping(value = "searchBook", method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    public String getBookListByFenye(String mess,Model model) {
        List<doubanbookInfo> bookList = new ArrayList<doubanbookInfo>();
        bookList=bookService.selectBookByMessFenye(0,20,mess,mess);
        model.addAttribute("bookList", bookList);
        return "portfolio-4-column";
    }

    /**
     * 查询书籍
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "getBook", method = RequestMethod.GET)
    public String getBookById(String isbn,Model model) {
        doubanbookInfo doubanbookInfo=bookService.selectBookByIsbn(isbn);
        model.addAttribute("book", doubanbookInfo);
        return "portfolio-details";
    }



}
