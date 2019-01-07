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

import com.aliyuncs.auth.*;
import com.aliyuncs.auth.sts.AssumeRoleRequest;
import com.aliyuncs.auth.sts.AssumeRoleResponse;
import com.aliyuncs.exceptions.ClientException;

import org.junit.Before;

import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.utils.SslUtils;

@SuppressWarnings("deprecation")
public class BaseTest {

    protected DefaultAcsClient client = null;
    protected IAcsClient clientV2 = null;
    protected Credential dailyEnvCredentail = null;
    protected Properties properties = null;
    protected String tokenAccesskeyId = null;
    protected String tokenAccesskeySecret = null;
    protected String roleArn = null;
    protected String regionId = null;

    private static final String SETTINGS_FILE_NAME = System.getProperty("user.home")
            + System.getProperty("file.separator") + "aliyun-sdk.properties";

    public DefaultAcsClient getClientWithRegionId(String regionId) {
        IClientProfile profile = DefaultProfile.getProfile(
                regionId,
                properties.getProperty("daily_accessKeyId"),
                properties.getProperty("daily_accessSecret")
        );
        return new DefaultAcsClient(profile);
    }

    @Before
    public void init() {
        try {
            SslUtils.ignoreSsl();
        } catch (Exception e) {
        }
        this.regionId = "cn-hangzhou";
        properties = getProperties();
        client = getClientWithRegionId(this.regionId);

        dailyEnvCredentail = new Credential(properties.getProperty("daily_accessKeyId"),
                properties.getProperty("daily_accessSecret"));

        System.setProperty("http.proxyHost", "127.0.0.1");
        System.setProperty("http.proxyPort", "8888");
        this.tokenAccesskeyId = properties.getProperty("RAMAccessKeyId");
        this.tokenAccesskeySecret = properties.getProperty("RAMAccessKeySecret");
        this.roleArn = properties.getProperty("roleArn");
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

    protected String getToken() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(
                this.regionId,
                this.tokenAccesskeyId,
                this.tokenAccesskeySecret
        );
        IAcsClient client = new DefaultAcsClient(profile);
        AssumeRoleRequest assumeRoleRequest = new AssumeRoleRequest();
        assumeRoleRequest.setRoleArn(this.roleArn);
        assumeRoleRequest.setRoleSessionName("alice_test");
        AssumeRoleResponse assumeRoleResponse = client.getAcsResponse(assumeRoleRequest);
        return assumeRoleResponse.getCredentials().getSecurityToken();
    }

    protected DefaultAcsClient creatDefaultAcsClient() throws ClientException {
        BasicSessionCredentials credentials = new BasicSessionCredentials(
                this.tokenAccesskeyId,
                this.tokenAccesskeySecret,
                getToken()
        );
        DefaultProfile profile = DefaultProfile.getProfile(this.regionId);
        return new DefaultAcsClient(profile, credentials);
    }
}
