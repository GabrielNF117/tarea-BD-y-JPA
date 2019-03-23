package com.uabc.database.example.examplejpa.components;

import com.uabc.database.example.examplejpa.entity.Log;
import com.uabc.database.example.examplejpa.model.LogModel;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Component("logConverter")
public class LogConverter {

    public Log convertToLogModel2Log(LogModel logModel){
        Log log = new Log();
        Date fecha = (Date) logModel.getDate();
        log.setDate(fecha);
        log.setDetails(logModel.getDetails());
        log.setUsername(logModel.getUsername());
        log.setUrl(logModel.getUrl());
        log.setId(logModel.getId());
        return log;
    }

    public LogModel convertLog2LogModel(Log log){
        LogModel logModel = new LogModel();
        logModel.setDate(log.getDate());
        logModel.setDetails(log.getDetails());
        logModel.setUsername(log.getUsername());
        logModel.setUrl(log.getUrl());
        logModel.setId(log.getId());
        return logModel;
    }

}
