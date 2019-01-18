package com.aliyuncs.publicopinion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Assert;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.auth.Credential;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.publicopinion.model.v20170731.CreateTopicRequest;
import com.aliyuncs.publicopinion.model.v20170731.CreateTopicResponse;

/**
 * @author VK.Gao
 * @date 2017/08/16
 */
public class Test {

    private static final String SETTINGS_FILE_NAME = System.getProperty("user.home") + System.getProperty(
            "file.separator") + "aliyun-sdk.properties";
    static IAcsClient client = null;
    static Credential dailyEnvCredentail = null;

    public static void main(String[] args) throws Exception {
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", "publicopinion", "publicopinion.aliyuncs.com");
        Properties properties = getProperties();
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", properties.getProperty("accessKeyId"),
                properties.getProperty("accessSecret"));
        client = new DefaultAcsClient(profile);

        dailyEnvCredentail = new Credential(properties.getProperty("daily_accessKeyId"), properties.getProperty(
                "daily_accessSecret"));

        CreateTopicRequest request = new CreateTopicRequest();
        request.setAcceptFormat(FormatType.JSON);
        request.setDesc("pop测试");
        request.setName("pop测试");

        Assert.assertTrue(client.getAcsResponse(request, "cn-hangzhou",
                dailyEnvCredentail) instanceof CreateTopicResponse);
    }

    static Properties getProperties() {
        Properties pr = null;
        InputStream is = null;
        try {
            pr = new Properties();
            is = new FileInputStream(SETTINGS_FILE_NAME);
            pr.load(is);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pr;
    }
}
