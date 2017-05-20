package com.papillon.dc.controllers;

import com.papillon.dc.dao.TessMessage;
import com.papillon.dc.service.TessMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by papillon on 5/19/2017.
 */
@Controller
public class TessMessageController {

    private TessMessageService tessMessageService;

    @Autowired
    public void setTessMessageService(TessMessageService tessMessageService) {
        this.tessMessageService = tessMessageService;
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public void create(TessMessage tessMessage){
        tessMessageService.createMessage(tessMessage);
    }

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String get(Model model){
        model.addAttribute("messages",tessMessageService.getMessages());
        return "messages";
    }
}
