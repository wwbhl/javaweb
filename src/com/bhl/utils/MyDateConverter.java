package com.bhl.utils;


import org.apache.commons.beanutils.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MyDateConverter implements Converter {
    @Override
    public Object convert(Class type, Object value) {
        String str = (String) value;
        //把字符串转成 Date 类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
