package com.aliyuncs;

import com.aliyuncs.cds.model.v20170925.RunJobRequest;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.green.model.v20180509.TextScanRequest;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpClientConfig;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.http.clients.ApacheHttpClient;
import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class ErrorHandlingTest extends BaseTest {

    @Test
    public void parameterErrorTest() {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setSysVersion("2014-05-26");
        request.setSysAction("actionError");
        try {
            this.client.getCommonResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("InvalidParameter", e.getErrCode());
            Assert.assertEquals("The specified parameter \"Action or Version\" is not valid.", e.getErrMsg());
        }
    }

    @Test
    public void timeOutErrorTest() throws ClientException, IOException {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setSysVersion("2014-05-26");
        request.setSysAction("DescribeAccessPoints");
        request.setSysReadTimeout(1);
        try {
            this.getReadTimeoutClientWithRegionId(regionId, 1L).getCommonResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("SDK.ServerUnreachable", e.getErrCode());
            Assert.assertEquals("SocketTimeoutException has occurred on a socket read or accept.", e.getErrMsg());
        } finally {
            ApacheHttpClient.getInstance(HttpClientConfig.getDefault()).close();
        }
    }

    @Test
    public void badFormatTypeTest() {
        RunJobRequest request = new RunJobRequest();
        request.setJobName("test");
        try {
            this.client.getAcsResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("CDS.NotFound", e.getErrCode());
            Assert.assertEquals("Job [test] Not Found , Please check whether you spell error", e.getErrMsg());
        }
    }

    @Test
    public void jsonParseErrorTest() throws UnsupportedEncodingException, ClientException {
        TextScanRequest textScanRequest = new TextScanRequest();
        textScanRequest.setSysEncoding("UTF-8");
        textScanRequest.setSysRegionId("cn-hangzhou");

        List<Map<String, Object>> tasks = new ArrayList<Map<String, Object>>();
        Map<String, Object> task = new LinkedHashMap<String, Object>();
        task.put("dataId", UUID.randomUUID().toString());
        task.put("content", "test");
        tasks.add(task);

        Map<String, Object> content = new HashMap<String, Object>();
        content.put("scenes", Arrays.asList("keyword"));
        content.put("tasks", tasks);
        Gson gson = new Gson();
        textScanRequest.setHttpContent(gson.toJson(content).getBytes("UTF-8"), "UTF-8", FormatType.JSON);

        textScanRequest.setSysConnectTimeout(3000);
        textScanRequest.setSysReadTimeout(6000);
        HttpResponse httpResponse = this.client.doAction(textScanRequest);
        String body = new String(httpResponse.getHttpContent(), "UTF-8");
        Map<String, Object> resultMap = gson.fromJson(body, Map.class);

        Assert.assertEquals("OK", resultMap.get("msg"));
        Assert.assertEquals(200.0, resultMap.get("code"));
    }
}
