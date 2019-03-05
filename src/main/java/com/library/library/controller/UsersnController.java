package com.library.library.controller;

import com.library.library.pojo.authors;
import com.library.library.pojo.doubanbookInfo;
import com.library.library.pojo.sales;
import com.library.library.pojo.usersn;
import com.library.library.service.*;
import com.library.library.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class UsersnController {
    @Autowired
    @Qualifier("usersnServiceImpl")
    private UsersnService usersnService;

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @Autowired
    @Qualifier("authorServiceImpl")
    private AuthorService authorService;

    @Autowired
    @Qualifier("salesServiceImpl")
    private SalesService salesService;

    String VerificationNum;
    Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 页面跳转
     */
    /*@RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }*/

    /**
     * 查询用户
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "userlist", method = RequestMethod.GET)
    public String getUserList(Model model) {
        List<usersn> userList = new ArrayList<usersn>();
        usersn user = usersnService.selectUsersnById(1);
        System.out.println("用户姓名为" + user.getUname());
        userList = usersnService.selectUsersn();
        for (usersn usersn : userList) {
            System.out.println(usersn.getUname());
        }
        model.addAttribute("userList", userList);
        return "index";
    }

    // 实现跳转到登录页
    @RequestMapping(value = "login.html")
    public String login(HttpSession session) {
        logger.info("用户跳转到登录页====================>");
        if (session.getAttribute("user") != null) {
            return "redirect:/users/main.html";
        }
        return "login";
    }

    // 主页面
    @RequestMapping(value = "main.html")
    public String hetmain(Model model) {
        logger.info("用户跳转到主页面====================>");
        List<doubanbookInfo> bookList = new ArrayList<doubanbookInfo>();
        bookList=bookService.selectTopBooks();
        model.addAttribute("bookList", bookList);

        List<authors> authorsList=new ArrayList<authors>();
        authorsList=authorService.selectAuthorsByFenye(0,6,"",null);
        model.addAttribute("authorsList", authorsList);

        List<doubanbookInfo> bookList1 = new ArrayList<doubanbookInfo>();
        bookList1=bookService.selectBookByMessFenye(0,6,"","太宰治");
        model.addAttribute("bookList1", bookList1);

        List<doubanbookInfo> bookList2 = new ArrayList<doubanbookInfo>();
        bookList2=bookService.selectBookByFenye(6,20);
        model.addAttribute("bookList2", bookList2);
        return "index";
    }

    // 实现登录
    @RequestMapping(value = "dologin.html", method = RequestMethod.POST)
    public String doLogin(String userName, String userPwd, HttpSession session,
                          HttpServletRequest request, RedirectAttributes attr,Model model) throws Exception {
        logger.info("登录中======================>");
        usersn usersn2 = new usersn();
        /*判断邮箱还是手机号码*/
        if (Verification.checkEmail(userName)) {
            // 调用service方法进行用户匹配
            usersn2 = usersnService.loginUsersnEmail(userName, MD5.md5(userPwd));
        } else {
            usersn2 = usersnService.loginUsersn(userName, MD5.md5(userPwd));
        }

        if (null != usersn2) {//登陆成功
            attr.addFlashAttribute("u1", usersn2);
            session.setAttribute("user",usersn2);
            session.setMaxInactiveInterval(3600);
            List<doubanbookInfo> bookList = new ArrayList<doubanbookInfo>();
            bookList=bookService.selectTopBooks();
            model.addAttribute("bookList", bookList);

            List<authors> authorsList=new ArrayList<authors>();
            authorsList=authorService.selectAuthorsByFenye(0,6,"",null);
            model.addAttribute("authorsList", authorsList);

            List<doubanbookInfo> bookList1 = new ArrayList<doubanbookInfo>();
            bookList1=bookService.selectBookByMessFenye(0,6,"","太宰治");
            model.addAttribute("bookList1", bookList1);

            List<doubanbookInfo> bookList2 = new ArrayList<doubanbookInfo>();
            bookList2=bookService.selectBookByFenye(6,20);
            model.addAttribute("bookList2", bookList2);
            return "index";
        } else {
            request.setAttribute("error", "密码错误了哦");
            return "login";
        }

    }

    //添加
    @RequestMapping(value = "addUser.html", method = RequestMethod.GET)
    public String add(@ModelAttribute("user") usersn usersn, Model model) {
        return "register";
    }

    /**
     * 发送邮件
     *
     * @param userName
     */
    @ResponseBody
    @RequestMapping(value = "sendEmail", method = RequestMethod.GET)
    public void sendEmail(String userName) {
        //创建验证码
        logger.info("发送邮件验证码中........");
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder(4);
        for (int i = 0; i < 4; i++) {
            char ch = str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }
        try {
            this.VerificationNum = sb.toString();
            email.sendEmail(sb.toString(), userName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 发送短信
     *
     * @param userName
     */
    @ResponseBody
    @RequestMapping(value = "sendSms", method = RequestMethod.GET)
    public void sendSms(String userName) {
        logger.info("发送短信验证码中........");
        //创建验证码
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder(4);
        for (int i = 0; i < 4; i++) {
            char ch = str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }
        this.VerificationNum = sb.toString();
        HttpUtil.sendSms(userName, sb.toString());
    }


    /**
     * 添加用户
     *
     * @param session
     * @return
     */
    @RequestMapping(value = "addUsersave.html", method = RequestMethod.POST)
    public String addSaveMail(String email, String uname, String pwd, String idcard, String verify, String ipAddress, HttpServletRequest request, HttpSession session) {
        logger.info("验证码为=="+VerificationNum);
        if (VerificationNum.equals(verify)) {
            usersn usersn = new usersn();

            try {
                System.out.println(Verification.checkEmail(email));
                System.out.println(Verification.checkMobileNumber(email));
                if(Verification.checkEmail(email)==true){
                    usersn.setMail(email);
                    logger.info("邮箱添加");
                }
                else if (Verification.checkMobileNumber(email)==true){
                    usersn.setPhone(email);
                    logger.info("手机添加");
                }
                usersn.setUname(uname);
                usersn.setIpAddress(ipAddress);
                //获取身份信息
                usersn.setIdcard(idcard);
                IdCardService.getIdCardDetail(idcard, usersn);
                getComputer.getHost(usersn);
                try {
                    usersn.setPwd(MD5.md5(pwd));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            int num = usersnService.insertUsersnByPhone(usersn);
            logger.info("添加用户========>" + num);
            if (num > 0) {
                return "register_success";
            }
        }
        return "missnum";
    }

    // 实现跳转到登录页
    @RequestMapping(value = "about.html")
    public String aboutme(Model model) {
        logger.info("用户跳转到about页====================>");
        model.addAttribute("peoperNum",usersnService.selectUserCount());
        model.addAttribute("bookNum",bookService.selectBookCount());
        return "about";
    }

    // 实现跳转到查询页
    @RequestMapping(value = "search.html")
    public String search() {
        logger.info("用户跳转到查询页====================>");
        return "portfolio-4-column";
    }

    // 主页面
    @RequestMapping(value = "getSale.html")
    public String getSale(Model model,HttpSession session) {
        List<sales> saleList = new ArrayList<sales>();
        usersn usersn= (usersn) session.getAttribute("user");
        saleList=salesService.selectSalesByFenye(0,10,null,usersn.getUid());
        Integer result=salesService.selectSalesCount();
        double r=(double)result/6;
        result=(int)  Math.ceil(r);
        model.addAttribute("saleList", saleList);
        model.addAttribute("saleNum", result);
        return "services";
    }

    // 主页面
    @RequestMapping(value = "setMail.html")
    public String setMail(Model model,HttpSession session) {
        return "register_mail";
    }

    /**
     * 添加邮箱
     *
     * @param session
     * @return
     */
    @RequestMapping(value = "addmail.html", method = RequestMethod.POST)
    public String addMail(String email,String verify,HttpServletRequest request, HttpSession session) {
        logger.info("验证码为=="+VerificationNum);
        if (VerificationNum.equals(verify)) {

            usersn user= (usersn) session.getAttribute("user");
            usersn usersn = new usersn();
            usersn.setUid(user.getUid());

            if(Verification.checkEmail(email)==true){
                usersn.setMail(email);
                logger.info("邮箱添加");
            }
            int num = usersnService.modifUsersnMail(usersn);
            logger.info("添加用户========>" + num);
            if (num > 0) {
                return "redirect:/users/getSale.html";
            }
        }
        return "missnum";
    }




}
