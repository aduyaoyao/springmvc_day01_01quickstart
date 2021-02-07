package cn.itcast.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将字符串转换成日期
 */
public class StringToDateConverter implements Converter<String, Date> {
    /**
     *
     * @param source     传入进来的字符串
     * @return
     */
    @Override
    public Date convert(String source) {//source
        //判断
        if(source==null){
            throw new RuntimeException ("请你输入数据");
        }
        DateFormat df = new SimpleDateFormat ("yyyy-MM-dd");
        try {
            return df.parse (source);
        } catch (ParseException e) {
            throw new RuntimeException ("数据类型转换出现错误");
        }
    }
}
