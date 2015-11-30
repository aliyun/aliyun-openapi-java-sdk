package com.aliyun.test;

import junit.framework.TestCase;

import org.junit.Test;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.cf.model.v20151125.AuthenticateRequest;
import com.aliyuncs.cf.model.v20151125.AuthenticateResponse;
import com.aliyuncs.cf.model.v20151125.QuerySimpleRequest;
import com.aliyuncs.cf.model.v20151125.QuerySimpleResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.X509TrustAll;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    IAcsClient client = null;

    /**
     * 取得原始的api调用结果 天眼
     */
    @Test
    public void testActionSample() {

        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "Access Key", "Access Key Secret");
        client = new DefaultAcsClient(profile);

        QuerySimpleRequest querySimpleRequest = new QuerySimpleRequest();
        querySimpleRequest.setAppKey("0003");
        querySimpleRequest.setSerialNo("1111111111");
        querySimpleRequest.setTokenId("00031448422433640975566901271448422433640336");
        querySimpleRequest.setTimeStamp(System.currentTimeMillis());
        querySimpleRequest.setSceneId("login");
        querySimpleRequest.setTrans("{\"IP\":\"192.168.0.1\"}");
        X509TrustAll.ignoreSSLCertificate();
        try {

            QuerySimpleResponse httpResponse = client.getAcsResponse(querySimpleRequest);

            System.out.println("status:" + httpResponse.getCollinadataQueryResult().getScore());

        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }

    /**
     * 签名串
     */
    @Test
    public void testActionSample2() {

        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "Access Key", "Access Key Secret");
        client = new DefaultAcsClient(profile);

        AuthenticateRequest authenticateRequest = new AuthenticateRequest();
        authenticateRequest.setAccessKey("123456789012345678901234567890TB");
        authenticateRequest.setAppKey("1111");
        authenticateRequest.setRemoteIp("192.168.100.112");
        authenticateRequest.setSessionId("e60dfa0a84c7c67d286debc5d66b2c0e");
        authenticateRequest.setToken("14295953402576729");
        authenticateRequest.setSig("34bKRpB6AgmecnuuZ8JmDUaqiUJApVUEUQ9eqbNeLGrxSz8wP2ErKy85bzCW9WBlIIiP6Y7em4ui2eB2l0ARJFZKaGYNj4yB9");

        X509TrustAll.ignoreSSLCertificate();
        try {

            AuthenticateResponse httpResponse = client.getAcsResponse(authenticateRequest);

            System.out.println("code:" + httpResponse.getSigAuthenticateResult().getCode());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
