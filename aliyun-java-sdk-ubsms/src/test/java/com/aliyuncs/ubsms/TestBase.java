package com.aliyuncs.ubsms;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import junit.framework.TestCase;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

/*
 * Copyright 2015 Aliyun.com All right reserved. This software is the
 * confidential and proprietary information of Aliyun.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Aliyun.com .
 */
/**
 * 类UbsmsDemo.java的实现描述：TODO 类实现描述 
 * @author shaobo.asb 2015年7月17日 上午11:50:14
 */
public class TestBase extends TestCase {
    
    
    protected IAcsClient client = null;
    
    private static final String SETTINGS_FILE_NAME =
            System.getProperty("user.home") +
            System.getProperty("file.separator") +
            "aliyun-sdk.properties";
    
    public void setUp() {
        Properties properties =getProperties();
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou",properties.getProperty("accessKeyId"), properties.getProperty("accessSecret"));
        client = new DefaultAcsClient(profile);
    }
    
    private Properties getProperties() {
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
