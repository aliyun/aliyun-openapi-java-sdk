package com.aliyuncs.imm.test.v20170906.ft;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.imm.main.IMMClient;
import com.aliyuncs.imm.model.v20170906.*;
import com.aliyuncs.imm.test.v20170906.util.Config;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.*;

public class ProjectTest extends TestCase {

    private static IMMClient client;

    @Override
    public void setUp() throws Exception {
        Config cfg = Config.getInstance();

        String regionId = cfg.getRegionId();
        String accessKeyId = cfg.getAccessKeyId();
        String accessKeySecret = cfg.getAccessKeySecret();

        IMMClient.verbose = true;

        this.client = new IMMClient(regionId, accessKeyId, accessKeySecret);

//        DefaultProfile.addEndpoint("imm."+regionId , regionId,"imm", "batchcompute."+regionId+".aliyuncs.com");
//
//        this.client = new DefaultAcsClient(DefaultProfile.getProfile(regionId, accessKeyId, accessKeySecret));
    }

    @Test
    public void testAll() throws ClientException {

        String projectName = "myproject-"+((Math.random()+"").substring(2));

        //create project
        PutProjectRequest putProjectRequest = new PutProjectRequest();
        putProjectRequest.setProject(projectName);
        putProjectRequest.setServiceRole("test");
        putProjectRequest.setType("DocStarter"); 
        PutProjectResponse putProjectResponse = client.getResponse(putProjectRequest);

        assertEquals(projectName, putProjectResponse.getProject());


        //listAllProject
        List<ListProjectsResponse.ProjectsItem> projectList = listAllProjects();
        assertTrue(projectList.size() > 0);


        //get Project
        GetProjectRequest getProjectRequest = new GetProjectRequest();
        getProjectRequest.setProject(projectName);
        GetProjectResponse getProjectResponse = client.getResponse(getProjectRequest);
        assertEquals(projectName, getProjectResponse.getProject());


        //delete project
        DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();
        deleteProjectRequest.setProject(projectName);
        DeleteProjectResponse deleteProjectResponse = client.getResponse(deleteProjectRequest);

        try {
            client.getResponse(getProjectRequest);
        } catch (ClientException e) {
            assertEquals("InvalidProject.NotFound", e.getErrCode());
        }

    }

    private List<ListProjectsResponse.ProjectsItem> listAllProjects() throws ClientException {
        List<ListProjectsResponse.ProjectsItem> list = new ArrayList<ListProjectsResponse.ProjectsItem>();

        String nextMarker = null;
        do {
            ListProjectsRequest req = new ListProjectsRequest();
            req.setMaxKeys(100);
            req.setMarker(nextMarker);

            ListProjectsResponse res = client.getResponse(req);
            nextMarker = res.getNextMarker();
            System.out.println(nextMarker);
            System.out.println(res.getProjects());
            list.addAll(res.getProjects());

        } while (nextMarker != null && !nextMarker.equals(""));

        return list;
    }

//    @Test
//    public void test() throws ClientException {
//
//        String projectName = "xxx";
//
//        String srcUris = "[\"oss://xxx/xxx.png\"]";
//
//        IndexFaceRequest req = new IndexFaceRequest();
//
//        req.setSetId("FACE-bcfa3d6f-7524-4dce-a19c-37603bbf3c9c");
//        req.setProject(projectName);
//        req.setSrcUris(srcUris);
//
//        IndexFaceResponse res = client.getResponse(req);
//
//        System.out.println(res);
//
//    }
}
