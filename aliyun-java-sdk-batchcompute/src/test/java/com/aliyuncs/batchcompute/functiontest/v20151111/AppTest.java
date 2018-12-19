package com.aliyuncs.batchcompute.functiontest.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.BatchCompute;
import com.aliyuncs.batchcompute.main.v20151111.BatchComputeClient;
import com.aliyuncs.batchcompute.model.v20151111.*;
import com.aliyuncs.batchcompute.pojo.v20151111.App;
import com.aliyuncs.batchcompute.pojo.v20151111.AppDescription;
import com.aliyuncs.batchcompute.pojo.v20151111.AppRevision;
import com.aliyuncs.batchcompute.pojo.v20151111.Quotas;
import com.aliyuncs.batchcompute.util.Config;
import com.aliyuncs.exceptions.ClientException;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by guangchun.luo on 2017/10/16.
 */
public class AppTest extends TestCase {
    private static BatchCompute client;

    private String gImageId = "ubuntu";

    private String gAppName = "app1javatest";

    private String gClusterId;

    int DUR = 3000;

    private String gInstanceType;


    @Override
    public void setUp() throws Exception {
        Config cfg = Config.getInstance();

        BatchComputeClient.verbose = true;
        BatchComputeClient.addRequestHeader("x-acs-source-ip", "127.0.0.1");
        BatchComputeClient.addRequestHeader("x-acs-secure-transport", "true");


        client = new BatchComputeClient(cfg.getRegionId(), cfg.getAccessId(), cfg.getAccessKey());
        Quotas quotas = client.getQuotas().getQuotas();
        List<String> arr = quotas.getAvailableClusterInstanceType();
        gInstanceType = arr.get(0);


    }

    @Test
    public void testApp() throws ClientException {

        client.deleteApp(gAppName);


        //1. create
        AppDescription desc = getAppDescription();
        CreateAppResponse res = client.createApp(desc);

        assertEquals(gAppName, res.getAppName());

        //2. list
        ListAppsResponse listRes = client.listApps("Private", "", 100);
        List<App> list = listRes.getItems();
        boolean hasAppName = false;
        for(App app : list){
            if(app.getName().equals(gAppName)){
                hasAppName = true;
            }
        }
        assert hasAppName;

        //3. get
        GetAppResponse getRes = client.getApp(gAppName, "Private");
        App app = getRes.getApp();
        assertEquals(gAppName, app.getName());

        App.InputParameterValue abcValue = app.getInputParameters().get("abc");
        assertEquals("aaaa", abcValue.getDefaultValue() );
        assertEquals("hello", abcValue.getDescription());
        assertEquals("String", abcValue.getType());

        App.OutputParameterValue outValue = app.getOutputParameters().get("out");
        assertEquals("hello2", outValue.getDescription());
        assertEquals("String", abcValue.getType());

        App.Config config = app.getConfig();
        assertEquals(gInstanceType, config.getInstanceType().getDefaultValue());
        assertEquals("de", config.getInstanceType().getDescription());

        assertEquals("/home/mount/", config.getDataDiskMountPoint().getDefaultValue());
        assertEquals("minDataMountPoint", config.getDataDiskMountPoint().getDescription());
        assertEquals("cloud_efficiency", config.getDataDiskType().getDefaultValue());
        assertEquals("dataDiskType", config.getDataDiskType().getDescription());
        assertEquals(40, config.getMinDatDiskSize().getDefaultValue());
        assertEquals("minDataDiskSize", config.getMinDatDiskSize().getDescription());

        //4. update
        AppDescription.Docker docker = new AppDescription.Docker();
        docker.setImage("myubuntu@localhost:5000");
        docker.setRegistryOSSPath("oss://bucket/key/dockers/");
        desc.setDocker(docker);
        desc.setVm(null);

        UpdateAppResponse updateAppResponse = client.updateApp(desc);




        //5. getRevisions
        GetAppRevisionsResponse appRevisionsResponse =  client.getAppRevisions(gAppName);
        List<AppRevision> revisions = appRevisionsResponse.getAppRevisions();


        assert 2==revisions.size();
        assert 1==revisions.get(1).getRevision();


        //6 detail
        GetAppDetailResponse getAppDetailResponse = client.getAppDetail(gAppName, "1");
        AppDescription appDetail = getAppDetailResponse.getAppDetail();
        assertEquals("myubuntu@localhost:5000", appDetail.getDocker().getImage());
        assertEquals("oss://bucket/key/dockers/", appDetail.getDocker().getRegistryOSSPath());

        //7. delete
        client.deleteApp(gAppName);


        try{
            client.getApp(gAppName, "Private");
        }catch (ClientException e){
            e.printStackTrace();
        }


    }


    private AppDescription getAppDescription(){

        AppDescription desc = new AppDescription();
        desc.setName(gAppName);
        desc.setCommandLine("echo 123");
        desc.setDaemonize(false);
        AppDescription.VM  vm = new AppDescription.VM(gImageId);
        desc.setVm(vm);

        AppDescription.Config config = new AppDescription.Config();
        AppDescription.ConfigValue instanceTypeConfigValue = new AppDescription.ConfigValue();

        instanceTypeConfigValue.setDefaultValue(gInstanceType);
        instanceTypeConfigValue.setDescription("de");
        instanceTypeConfigValue.setOverwritable(true);
        config.setInstanceType(instanceTypeConfigValue);

        AppDescription.ConfigValueInteger dataDiskSizeConfigInt = new AppDescription.ConfigValueInteger();
        dataDiskSizeConfigInt.setOverwritable(true);
        dataDiskSizeConfigInt.setDefaultValue(40);
        dataDiskSizeConfigInt.setDescription("minDataDiskSize");
        config.setMinDataDiskSize(dataDiskSizeConfigInt);

        AppDescription.ConfigValue dataDiskMountPoint = new AppDescription.ConfigValue();
        dataDiskMountPoint.setOverwritable(true);
        dataDiskMountPoint.setDefaultValue("/home/mount/");
        dataDiskMountPoint.setDescription("minDataMountPoint");
        config.setDataDiskMountPoint(dataDiskMountPoint);

        AppDescription.ConfigValue dataDiskType = new AppDescription.ConfigValue();
        dataDiskType.setDescription("dataDiskType");
        dataDiskType.setDefaultValue("cloud_efficiency");
        dataDiskType.setOverwritable(true);
        config.setDataDiskType(dataDiskType);

        desc.setConfig(config);

        Map<String, AppDescription.InputParameterValue> inputParameters = new HashMap<String, AppDescription.InputParameterValue>();
        AppDescription.InputParameterValue abcInputParameterValue = new AppDescription.InputParameterValue();
        abcInputParameterValue.setDefaultValue("aaaa");
        abcInputParameterValue.setDescription("hello");
        abcInputParameterValue.setLocalPath("/home/abc");
        abcInputParameterValue.setType("String");

        inputParameters.put("abc", abcInputParameterValue);
        desc.setInputParameters(inputParameters);



        AppDescription.OutputParameterValue outputParameterValue = new AppDescription.OutputParameterValue();

        outputParameterValue.setDescription("hello2");
        outputParameterValue.setLocalPath("/home/abc2");
        outputParameterValue.setType("String");

        desc.addOutputParameters("out", outputParameterValue);

        return desc;
    }
}
