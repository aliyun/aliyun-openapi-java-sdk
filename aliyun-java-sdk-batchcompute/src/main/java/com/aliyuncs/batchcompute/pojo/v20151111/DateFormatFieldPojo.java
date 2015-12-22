package com.aliyuncs.batchcompute.pojo.v20151111;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by guangchun.luo on 15/12/8.
 */
public class DateFormatFieldPojo {

    protected Date parseDate(String d){
        if(d!=null && d.length() >0){

            /*"yyyy-MM-dd'T'HH:mm:ss.SSSZ"
            <td><code>"yyyy-MM-dd'T'HH:mm:ss.SSSZ"</code>
            *         <td><code>2001-07-04T12:08:56.235-0700</code>
            *     <tr style="background-color: rgb(238, 238, 255);">
            *         <td><code>"yyyy-MM-dd'T'HH:mm:ss.SSSXXX"</code>
            *         <td><code>2001-07-04T12:08:56.235-07:00</code>
                    */
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            try {
                return sdf.parse(d);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
