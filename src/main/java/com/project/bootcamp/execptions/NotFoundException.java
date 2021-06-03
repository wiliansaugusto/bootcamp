package com.project.bootcamp.execptions;

import com.project.bootcamp.util.MessageUtils;

public class NotFoundException extends RuntimeException{
    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
