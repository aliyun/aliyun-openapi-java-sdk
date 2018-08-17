package com.aliyuncs;


import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import org.junit.Before;
import org.junit.Test;

/**
 * @author VK.Gao
 * @date 2017/12/19
 */
public class SimpleTest {

    private IAcsClient client;

    @Before
    public void setUp() throws Exception {
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "123", "2123");
        client = new DefaultAcsClient(profile);
    }

    @Test
    public void getCommonResponse_Rpc_Get_Test() throws ServerException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ft.aliyuncs.com");
        request.setVersion("2016-01-01");
        request.setAction("TestRpcApi");
        request.putQueryParameter("QueryParam", "QUERY_PARAM_CONTENT");

        CommonResponse response = client.getCommonResponse(request);

        System.out.println(new String(response.getData()));
    }


}
