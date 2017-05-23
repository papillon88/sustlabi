package com.papillon.dc.service;

import com.papillon.dc.dao.TessMessage;
import com.papillon.dc.dao.TessMessageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        List<TessMessage> messagesRev = new ArrayList<>();
        List<TessMessage> messages = tessMessageDAO.getTessMessages();
        for(int i=messages.size()-1;i>=0;i--){
            messagesRev.add(messages.size()-i-1,messages.get(i));
        }
        return messagesRev;
    }

    public void createMessage(TessMessage tessMessage){
        tessMessageDAO.createTessMessage(tessMessage);
    }
}
