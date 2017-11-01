/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.KeyPairCredentials;
import com.aliyuncs.auth.STSGetSessionAccessKeyCredentialsProvider;
import com.aliyuncs.exceptions.ClientException;

import org.junit.Before;

import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.utils.SslUtils;

@SuppressWarnings("deprecation")
public class BaseTest {

    protected IAcsClient        client             = null;

    protected IAcsClient        clientV2           = null;

    protected Credential        dailyEnvCredentail = null;

    protected Properties        properties;

    private static final String SETTINGS_FILE_NAME = System.getProperty("user.home")
            + System.getProperty("file.separator") + "aliyun-sdk.properties";

    @Before
    public void init() {
        try {
            SslUtils.ignoreSsl();
        } catch (Exception e) {
        }
        try {
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", "Ft", "ft.aliyuncs.com");
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", "Sts", "sts.aliyuncs.com");
        } catch (ClientException e) {
        }
        properties = getProperties();
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", properties.getProperty("daily_accessKeyId"),
                properties.getProperty("daily_accessSecret"));
        client = new DefaultAcsClient(profile);

        dailyEnvCredentail = new Credential(properties.getProperty("daily_accessKeyId"),
                properties.getProperty("daily_accessSecret"));

        System.setProperty("http.proxyHost", "127.0.0.1");
        System.setProperty("http.proxyPort", "8888");
        
        DefaultProfile profileV2 = DefaultProfile.getProfile("cn-hangzhou");
        KeyPairCredentials keyPairCredentials = new KeyPairCredentials(properties.getProperty("publicKeyId"), properties.getProperty("privateKey"));
        STSGetSessionAccessKeyCredentialsProvider provider = new STSGetSessionAccessKeyCredentialsProvider(keyPairCredentials, profileV2);
        
        clientV2 = new DefaultAcsClient(profileV2, provider);

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
