package com.papillon.dc.controllers;

import com.papillon.dc.dao.TessMessage;
import com.papillon.dc.dao.TessMessageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by papillon on 5/19/2017.
 */
@Service("service")
public class TessMessageService {

    private TessMessageDAO tessMessageDAO;

    @Autowired
    public void setTessMessageDAO(TessMessageDAO tessMessageDAO) {
        this.tessMessageDAO = tessMessageDAO;
    }


    public List<TessMessage> getMessages(){
        return tessMessageDAO.getTessMessages();
    }

    public void createMessage(TessMessage tessMessage){
        tessMessageDAO.createTessMessage(tessMessage);
    }
}
