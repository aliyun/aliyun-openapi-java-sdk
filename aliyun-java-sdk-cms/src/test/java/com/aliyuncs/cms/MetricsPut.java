package com.aliyuncs.cms;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.cms.model.v20150420.DescribeMetricDatumRequest;
import com.aliyuncs.cms.model.v20150420.DescribeMetricDatumResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by fray.yangb-然诺 on 15/5/8.
 */
public class MetricsPut {
    IAcsClient client = null;

    @Before
    public void init() throws ClientException {
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "", "");
        client = new DefaultAcsClient(profile);
        //System.setProperty("http.proxyHost", "127.0.0.1"); //此设置用于设置代理，可用fiddler拦截查看http请求，便于调试。
        //System.setProperty("http.proxyPort", "8888");
    }
    /**
     * 取得反序列化的实例对象
     */
    @Test
    public void sample() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -10);
        cal.add(Calendar.HOUR_OF_DAY, -8);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        String endTime = format.format(cal.getTime());
        cal.add(Calendar.MINUTE, -10);
        String startTime = format.format(cal.getTime());

        DescribeMetricDatumRequest describeMetricDatumRequest = new DescribeMetricDatumRequest();
        describeMetricDatumRequest.setAcceptFormat(FormatType.JSON);
        describeMetricDatumRequest.setNamespace("acs/ecs");
        describeMetricDatumRequest.setMetricName("vm.Process.number");
        describeMetricDatumRequest.setStartTime(startTime);
        describeMetricDatumRequest.setEndTime(endTime);
        describeMetricDatumRequest.setDimensions("{instanceId:'F10101001'}");
        describeMetricDatumRequest.setLength(1000);

        try {
            DescribeMetricDatumResponse describeRegionsResponse = client.getAcsResponse(describeMetricDatumRequest);
            //todo something.
            Assert.assertNotNull(describeRegionsResponse);
            Assert.assertNotNull(describeRegionsResponse.getCode());
            Assert.assertNotNull(describeRegionsResponse.getDatapoints());
            //Assert.assertTrue(!describeRegionsResponse.getDatapoints().isEmpty());

        } catch (ClientException e) {

        }
    }


    /**
     * 取得原始的api调用结果
     */
    @Test
    public void doActionSample() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -10);
        cal.add(Calendar.HOUR_OF_DAY, -8);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        String endTime = format.format(cal.getTime());
        cal.add(Calendar.MINUTE, -10);
        String startTime = format.format(cal.getTime());

        DescribeMetricDatumRequest describeMetricDatumRequest = new DescribeMetricDatumRequest();
        describeMetricDatumRequest.setAcceptFormat(FormatType.JSON);
        describeMetricDatumRequest.setNamespace("acs/ecs");
        describeMetricDatumRequest.setMetricName("vm.Process.number");
        describeMetricDatumRequest.setStartTime(startTime);
        describeMetricDatumRequest.setEndTime(endTime);
        describeMetricDatumRequest.setDimensions("{instanceId:'F10101002'}");
        describeMetricDatumRequest.setLength(1000);
        try {
            HttpResponse httpResponse = client.doAction(describeMetricDatumRequest);

            System.out.println(httpResponse.getUrl());
            System.out.println(new String(httpResponse.getContent()));
            //todo something.
        } catch (ServerException e) {
            //todo something.
        } catch (ClientException e) {
            //todo something.
        }
    }
}
