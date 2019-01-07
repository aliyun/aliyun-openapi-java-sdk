package com.aliyuncs.http;

import com.aliyuncs.http.clients.CompatibleUrlConnClient;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class HttpsTest {

    @Test
    public void testIgnore() {
        HttpRequest request = new HttpRequest("https://acs.aliyun-inc.com/");
        request.setMethod(MethodType.GET);
        try {
            X509TrustAll.ignoreSSLCertificate();
            HttpResponse response = CompatibleUrlConnClient.compatibleGetResponse(request);
            String strResult = new String(response.getHttpContent(), response.getEncoding());
            assertEquals(400, response.getStatus());
            assertNotNull(strResult);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            CompatibleUrlConnClient.HttpsCertIgnoreHelper.restoreSSLCertificate()
        }
    }

    @Test
    public void testHttpsPut() {
        String content = "<Product name=\"Yundun\" domain=\"yundun.aliyuncs.com\"/>";
        HttpRequest request = new HttpRequest("https://acs.aliyun-inc.com/");
        request.setMethod(MethodType.PUT);
        try {
            request.setHttpContent(content.getBytes("UTF-8"), "UTF-8", FormatType.XML);
            HttpResponse response = CompatibleUrlConnClient.compatibleGetResponse(request);
            String strResult = new String(response.getHttpContent(), response.getEncoding());
            assertEquals(400, response.getStatus());
            assertNotNull(strResult);
        } catch (Exception e) {
            fail(e.toString());
            e.printStackTrace();
        }
    }
}
