package com.ppm.controller;

import com.ppm.pojo.Items;
import com.ppm.service.interfaces.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemsController {
    @Autowired
    private IItemsService itemsService;

    @RequestMapping("queryItems")
    public ModelAndView queryItems() throws Exception {
        List<Items> itemsList = new ArrayList<Items>();
        Items items_1 = new Items();
        items_1.setName("联想笔记本2");
//        items_1.setPrize(5000L);
        items_1.setDesc("Thinkpad T430 联想笔记本电脑2");

        Items items_2 = new Items();
        items_2.setName("苹果笔记本2");
//        items_2.setPrize(15000L);
        items_2.setDesc("MAC 2018 带bar 新款2");
        itemsList.add(items_1);
        itemsList.add(items_2);
        itemsService.insertItems(itemsList);
        itemsList.clear();
        itemsList = itemsService.selectAllItems();

        ModelAndView mad = new ModelAndView();
        mad.addObject("itemsList", itemsList);
        mad.setViewName("items/itemsList");
        return mad;
    }
//    @Nullable
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        List<Items> itemsList = new ArrayList<Items>();
//        Items items_1 = new Items();
//        items_1.setName("联想笔记本");
//        items_1.setPrize(5000L);
//        items_1.setDesc("Thinkpad T430 联想笔记本电脑");
//
//        Items items_2 = new Items();
//        items_2.setName("苹果笔记本");
//        items_2.setPrize(15000L);
//        items_2.setDesc("MAC 2018 带bar 新款");
//        itemsList.add(items_1);
//        itemsList.add(items_2);
//
//        ModelAndView mad = new ModelAndView();
//        mad.addObject("itemsList", itemsList);
//        mad.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
//        return mad;
//    }
}
