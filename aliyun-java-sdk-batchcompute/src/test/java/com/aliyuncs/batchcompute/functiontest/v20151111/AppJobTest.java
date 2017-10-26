package com.aliyuncs.batchcompute.functiontest.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.BatchCompute;
import com.aliyuncs.batchcompute.main.v20151111.BatchComputeClient;
import com.aliyuncs.batchcompute.model.v20151111.*;
import com.aliyuncs.batchcompute.pojo.v20151111.*;
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
public class AppJobTest extends TestCase {
    private static BatchCompute client;

    private String gImageId = "ubuntu";

    private String gAppName = "app1javatest2";

    private String gJobId = "";

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
        AppDescription appDesc = getAppDescription();
        CreateAppResponse res = client.createApp(appDesc);

        assertEquals(gAppName, res.getAppName());


        JobDescription jobDesc = new JobDescription();
        AppJobDescription app = new AppJobDescription();
        app.setAppName(gAppName);
        app.addInputs("abc", "oss://bucket/inp");
        app.addOutputs("out", "oss://bucket/out");

        AppJobDescription.Logging logging = new AppJobDescription.Logging();
        logging.setStderrPath("oss://bucket/key/logs");
        logging.setStdoutPath("oss://bucket/key/logs");
        app.setLogging(logging);

        jobDesc.setName("java-sdk-test");
        jobDesc.setDescription("java sdk test job");
        jobDesc.setType("App");

        jobDesc.setApp(app);

        //create
        CreateJobResponse resp=  client.createJob(jobDesc);
        gJobId= resp.getJobId();
        assert null != resp.getJobId();

        // delete
        client.stopJob(gJobId);
        client.deleteJob(gJobId);
        client.deleteApp(gAppName);
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
