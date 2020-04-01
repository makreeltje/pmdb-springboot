package com.pmdb.api.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateServiceImpl implements DateService {

    @Override
    public String ConvertDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateFormatted = formatter.format(date);

        return dateFormatted;
    }
}
