package com.papillon.dc.controllers;

import com.papillon.dc.dao.TessMessage;
import com.papillon.dc.service.TessMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
    public String create(TessMessage tessMessage, BindingResult result){
        if(result.hasErrors()){
            System.out.println("Form does not validate");
            List<ObjectError> errors = result.getAllErrors();
            for(ObjectError error : errors){
                System.out.println(error.getDefaultMessage());
            }
        }
        Instant now = Instant.now();
        tessMessage.setDate(now.toString());
        tessMessageService.createMessage(tessMessage);
        return "link";
    }

    @RequestMapping(value = "/messages",method = RequestMethod.GET)
    public String getMessages(Model model){
        model.addAttribute("messages",tessMessageService.getMessages());
        return "index";
    }
}
