package com.aliyuncs.batchcompute.main.v20151111;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by guangchun on 16/1/26.
 */
public class CustomJsonDateDeserializer extends JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String date = jsonParser.getText();
        return parseDate(date);
    }

    public Date parseDate(String d){

        if(d!=null && d.length() >0){

            if(d.contains("T") && d.contains("Z")) {

                if(d.length()==27) d = d.substring(0,23)+'Z';

                String format = "yyyy-MM-dd'T'HH:mm:ss.SSS";

                SimpleDateFormat sdf = new SimpleDateFormat(format);
                sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
                try {
                    return sdf.parse(d);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            else if(d.matches("^\\d+$")) {

                if(d.length()==10)
                    try {
                        if(d.length()==10) {
                            // d = "1453776664"  seconds
                            return new Date(Long.parseLong(d) * 1000);
                        }
                        else if(d.length()==13){
                            return new Date(Long.parseLong(d));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }
        }
        return null;
    }

}
