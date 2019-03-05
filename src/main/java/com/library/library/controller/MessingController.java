package com.library.library.controller;

import com.library.library.pojo.messing;
import com.library.library.service.MessingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mess")
public class MessingController {

    @Autowired
    @Qualifier("messingServiceImpl")
    private MessingService messingService;
    String VerificationNum;
    Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 查询公告
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "messlist", method = RequestMethod.GET)
    public String getBookList(Model model) {
        List<messing> messList = new ArrayList<messing>();
        messList=messingService.selectMesslist(0,6,"");
        Integer result=messingService.selectMesslistCount("");
        double r=(double)result/6;
        List<messing> messlist1=messingService.selctTopFour();
        List<messing> messlist2=messingService.selectMesBy();
        model.addAttribute("messList", messList);
        model.addAttribute("messlist1", messlist1);
        model.addAttribute("messlist2", messlist2);
        result=(int)  Math.ceil(r);
        model.addAttribute("messNum", result);
        return "blog-right-sidebar";
    }

    @RequestMapping(value = "messlist/{page}", method = RequestMethod.GET)
    public String getBooks(@PathVariable int page,Model model) {
        List<messing> messList = new ArrayList<messing>();
        messList=messingService.selectMesslist((page-1)*6,6,"");
        Integer result=messingService.selectMesslistCount("");
        double r=(double)result/6;
        List<messing> messlist1=messingService.selctTopFour();
        List<messing> messlist2=messingService.selectMesBy();
        model.addAttribute("messList", messList);
        model.addAttribute("messlist1", messlist1);
        model.addAttribute("messlist2", messlist2);
        result=(int)  Math.ceil(r);
        logger.info(String.valueOf(result));
        model.addAttribute("messNum", result);
        return "blog-right-sidebar";
    }
    /**
     * 查询公告
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "messlistBy", method = RequestMethod.GET)
    public String getBookListBy(String mesBy,Model model) {
        List<messing> messList = new ArrayList<messing>();
        messList=messingService.selectMesByMes(mesBy);
        int result=messingService.selectMesslistCount("");
        List<messing> messlist1=messingService.selctTopFour();
        List<messing> messlist2=messingService.selectMesBy();
        model.addAttribute("messList", messList);
        model.addAttribute("messlist1", messlist1);
        model.addAttribute("messlist2", messlist2);
        model.addAttribute("messNum", result);
        return "blog-right-sidebar";
    }

    @RequestMapping(value = "searchMess", method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    public String getBookListByFenye(String mess,Model model) {
        List<messing> messList = new ArrayList<messing>();
        messList=messingService.selectMesslist(0,6,mess);
        List<messing> messlist1=messingService.selctTopFour();
        List<messing> messlist2=messingService.selectMesBy();
        int result=messingService.selectMesslistCount(mess);
        model.addAttribute("messList", messList);
        model.addAttribute("messlist1", messlist1);
        model.addAttribute("messlist2", messlist2);
        model.addAttribute("messNum", result);
        return "blog-right-sidebar";
    }

    /**
     * 查询公告
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "getMess/{id}", method = RequestMethod.GET)
    public String getBookById(@PathVariable int id, Model model) {
        messing messing=messingService.selectMessById(id);
        model.addAttribute("mess", messing);
        return "blog-details";
    }
}
