package com.aliyuncs.cloudauth.extension;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.PutObjectResult;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.cloudauth.model.v20190307.DescribeOssUploadTokenRequest;
import com.aliyuncs.cloudauth.model.v20190307.DescribeOssUploadTokenResponse;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.http.ProtocolType;
import org.apache.commons.codec.binary.Base64;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 工具类
 *
 * 用于图片上传
 */
public class CloudAuthClientUploader {

    private IAcsClient client;
    private volatile DescribeOssUploadTokenResponse.OssUploadToken ossUploadToken;
    private volatile OSSClient ossClient;
    private Map<String, String> headers;

    private CloudAuthClientUploader(IAcsClient client) {
        this.client = client;
        this.ossUploadToken = null;
        this.ossClient = null;
        this.headers = new HashMap<String, String>();
    }

    public static CloudAuthClientUploader getClentUploader(IAcsClient client) {
        return new CloudAuthClientUploader(client);
    }

    public void addHeader(String key, String value) {
        this.headers.put(key, value);
    }

    /**
     * 根据base64String decode后调用uploadBytes
     *
     * @param base64String
     * @return
     */
    public String uploadBase64(String base64String) {
        return uploadBytes(Base64.decodeBase64(base64String));
    }

    /**
     * 上传并获取上传后的图片链接
     *
     * @param bytes
     * @return
     */
    public String uploadBytes(byte[] bytes) {
        try {
            DescribeOssUploadTokenResponse.OssUploadToken ossUploadToken = getOssUploadToken();
            if (ossUploadToken == null) {
                throw new RuntimeException("can not get upload credentials");
            }

            String object = ossUploadToken.getPath() + '/' + UUID.randomUUID().toString();
            PutObjectResult ret = this.ossClient.putObject(ossUploadToken.getBucket(), object, new ByteArrayInputStream(bytes));
            return "oss://" + ossUploadToken.getBucket() + ":" + object;
        } catch (Exception e) {
            throw new RuntimeException("upload file fail.", e);
        }
    }

    /**
     * 回收资源
     */
    public void release() {
        if (ossClient != null) {
            ossClient.shutdown();
        }
    }

    private DescribeOssUploadTokenResponse.OssUploadToken getOssUploadToken() throws Exception {
        if (this.ossUploadToken == null || this.ossUploadToken.getExpired() < System.currentTimeMillis()) {
            synchronized (CloudAuthClientUploader.class) {
                if (this.ossUploadToken == null || this.ossUploadToken.getExpired() < System.currentTimeMillis()) {

                    if (this.ossClient != null) {
                        this.ossClient.shutdown();
                    }

                    this.ossUploadToken = getCredentialsFromServer();
                    this.ossClient = new OSSClient(ossUploadToken.getEndPoint(), ossUploadToken.getKey(), ossUploadToken.getSecret(), ossUploadToken.getToken());
                }
            }
        }

        return this.ossUploadToken;
    }

    /**
     * 从服务器端获取上传凭证
     *
     * @return
     * @throws Exception
     */
    private DescribeOssUploadTokenResponse.OssUploadToken getCredentialsFromServer() throws Exception {
        DescribeOssUploadTokenRequest describeOssUploadTokenRequest = new DescribeOssUploadTokenRequest();
        describeOssUploadTokenRequest.setAcceptFormat(FormatType.JSON); // 指定api返回格式
        describeOssUploadTokenRequest.setMethod(com.aliyuncs.http.MethodType.POST); // 指定请求方法
        describeOssUploadTokenRequest.setEncoding("utf-8");
        describeOssUploadTokenRequest.setProtocol(ProtocolType.HTTP);
        for (Map.Entry<String, String> kv : this.headers.entrySet()) {
            describeOssUploadTokenRequest.putHeaderParameter(kv.getKey(), kv.getValue());
        }

        describeOssUploadTokenRequest.setHttpContent(new JSONObject().toJSONString().getBytes("UTF-8"), "UTF-8", FormatType.JSON);

        HttpResponse httpResponse = this.client.doAction(describeOssUploadTokenRequest);
        if (httpResponse.isSuccess()) {
            JSONObject scrResponse = JSON.parseObject(new String(httpResponse.getHttpContent(), "UTF-8"));
            if (200 == httpResponse.getStatus()) {
                JSONObject data = scrResponse.getJSONObject("OssUploadToken");

                DescribeOssUploadTokenResponse.OssUploadToken ossUploadToken = new DescribeOssUploadTokenResponse.OssUploadToken();
                ossUploadToken.setBucket(data.getString("Bucket"));
                ossUploadToken.setEndPoint(data.getString("EndPoint"));
                ossUploadToken.setPath(data.getString("Path"));
                ossUploadToken.setExpired(data.getLongValue("Expired"));
                ossUploadToken.setToken(data.getString("Token"));
                ossUploadToken.setKey(data.getString("Key"));
                ossUploadToken.setSecret(data.getString("Secret"));
                return ossUploadToken;
            }

            String requestId = scrResponse.getString("requestId");
            throw new RuntimeException("get upload credential from server fail. requestId:" + requestId + ", code:" + scrResponse.getInteger("code"));
        }
        throw new RuntimeException("get upload credential from server fail. http response status:" + httpResponse.getStatus());
    }
}
