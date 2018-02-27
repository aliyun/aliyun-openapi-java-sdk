package com.aliyuncs.imm.test.v20170906.ft;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.imm.main.IMMClient;
import com.aliyuncs.imm.model.v20170906.*;
import com.aliyuncs.imm.test.v20170906.util.Config;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ActionTest extends TestCase {

    private static IMMClient client;

    @Override
    public void setUp() throws Exception {
        Config cfg = Config.getInstance();

        String regionId = cfg.getRegionId();
        String accessKeyId = cfg.getAccessKeyId();
        String accessKeySecret = cfg.getAccessKeySecret();

        IMMClient.verbose = true;

        this.client = new IMMClient(regionId, accessKeyId, accessKeySecret);
    }

    @Test
    public void test1() throws ClientException {

        ListProjectsRequest req = new ListProjectsRequest();

        ListProjectsResponse res = client.getResponse(req);

        assertTrue(null!=res.getRequestId());
        assertTrue(res.getProjects().size()>=0);

        if(res.getProjects().size()>0){
            assertTrue(null!=res.getProjects().get(0).getProject());
        }




    }
    @Test
    public void test2() throws ClientException {

        ListProjectsRequest req = new ListProjectsRequest();

        String resultJson = client.getResponseString(req);

        assertTrue(resultJson.indexOf("Projects")!=-1);

    }

    @Test
    public void test3() throws ClientException {

        Map<String, String> map = new HashMap<String,String>();

        map.put("Action","ListProjects");

        String resultJson = client.getResponseString(map);

        assertTrue(resultJson.indexOf("Projects")!=-1);

    }
}
