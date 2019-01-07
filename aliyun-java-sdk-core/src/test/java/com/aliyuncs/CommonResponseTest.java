package com.aliyuncs;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class CommonResponseTest {
    private CommonResponse response;

    @Before
    public void creatResponse() {
        response = new CommonResponse();
    }

    @Test
    public void getSetTest() {
        response.setData("test");
        Assert.assertEquals("test", response.getData());

        response.setHttpStatus(200);
        Assert.assertEquals(200, response.getHttpStatus());

        HttpResponse httpResponse = mock(HttpResponse.class);
        response.setHttpResponse(httpResponse);
        Assert.assertTrue(httpResponse == response.getHttpResponse());
    }

    @Test
    public void getInstanceTest() throws ClientException {
        UnmarshallerContext context = mock(UnmarshallerContext.class);
        Assert.assertNull(response.getInstance(context));
    }

    @Test
    public void checkShowJsonItemNameTest() {
        Assert.assertTrue(response.checkShowJsonItemName());
    }
}
