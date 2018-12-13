package com.aliyuncs.green.extension.uploader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.PutObjectResult;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.green.model.v20180509.UploadCredentialsRequest;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.http.ProtocolType;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 用于本地图片文件检测时，上传本地图片
 */
public class ClientUploader {

    private IAcsClient client;
    private volatile UploadCredentials uploadCredentials;
    private Map<String, String> headers;
    private String prefix;

    private ClientUploader(IAcsClient client, String prefix) {
        this.client = client;
        this.uploadCredentials = null;
        this.headers = new HashMap<String, String>();
        this.prefix = prefix;
    }


    public static ClientUploader getImageClientUploader(IAcsClient client){
        return  new ClientUploader(client, "images");
    }

    public static ClientUploader getVideoClientUploader(IAcsClient client){
        return  new ClientUploader(client, "videos");
    }

    public static ClientUploader getVoiceClientUploader(IAcsClient client){
        return  new ClientUploader(client, "voices");
    }

    public static ClientUploader getFileClientUploader(IAcsClient client){
        return  new ClientUploader(client, "files");
    }

    /**
     * 上传并获取上传后的图片链接
     * @param filePath
     * @return
     */
    public String uploadFile(String filePath){
        FileInputStream inputStream = null;
        OSSClient ossClient = null;
        try {
            File file = new File(filePath);
            UploadCredentials uploadCredentials = getCredentials();
            if(uploadCredentials == null){
                throw new RuntimeException("can not get upload credentials");
            }
            ObjectMetadata meta = new ObjectMetadata();
            meta.setContentLength(file.length());
            inputStream = new FileInputStream(file);

            ossClient = new OSSClient(uploadCredentials.getOssEndpoint(), uploadCredentials.getAccessKeyId(), uploadCredentials.getAccessKeySecret(), uploadCredentials.getSecurityToken());

            String object = uploadCredentials.getUploadFolder() + '/' + this.prefix + '/' + String.valueOf(filePath.hashCode());
            PutObjectResult ret = ossClient.putObject(uploadCredentials.getUploadBucket(), object, inputStream, meta);
            return "oss://" + uploadCredentials.getUploadBucket() + "/" + object;
        } catch (Exception e) {
            throw new RuntimeException("upload file fail.", e);
        } finally {
            if(ossClient != null){
                ossClient.shutdown();
            }
            if(inputStream != null){
                try {
                    inputStream.close();
                }catch (Exception e){

                }
            }
        }
    }



    /**
     * 上传并获取上传后的图片链接
     * @param bytes
     * @return
     */
    public String uploadBytes(byte[] bytes){
        OSSClient ossClient = null;
        try {
            UploadCredentials uploadCredentials = getCredentials();
            if(uploadCredentials == null){
                throw new RuntimeException("can not get upload credentials");
            }

            ossClient = new OSSClient(uploadCredentials.getOssEndpoint(), uploadCredentials.getAccessKeyId(), uploadCredentials.getAccessKeySecret(), uploadCredentials.getSecurityToken());

            String object = uploadCredentials.getUploadFolder() + '/' + this.prefix + '/' + UUID.randomUUID().toString();
            PutObjectResult ret = ossClient.putObject(uploadCredentials.getUploadBucket(), object, new ByteArrayInputStream(bytes));
            return "oss://" + uploadCredentials.getUploadBucket() + "/" + object;
        } catch (Exception e) {
            throw new RuntimeException("upload file fail.", e);
        } finally {
            if(ossClient != null){
                ossClient.shutdown();
            }
        }
    }


    public void addHeader(String key, String value){
        this.headers.put(key, value);
    }


    private UploadCredentials getCredentials() throws Exception{
        if(this.uploadCredentials == null || this.uploadCredentials.getExpiredTime() < System.currentTimeMillis()){
            synchronized(ClientUploader.class){
                if(this.uploadCredentials == null || this.uploadCredentials.getExpiredTime() < System.currentTimeMillis()){
                    this.uploadCredentials = getCredentialsFromServer();
                }
            }
        }
        return this.uploadCredentials;
    }

    /**
     * 从服务器端获取上传凭证
     * @return
     * @throws Exception
     */
    private UploadCredentials getCredentialsFromServer() throws Exception{
        UploadCredentialsRequest uploadCredentialsRequest =  new UploadCredentialsRequest();
        uploadCredentialsRequest.setAcceptFormat(FormatType.JSON); // 指定api返回格式
        uploadCredentialsRequest.setMethod(com.aliyuncs.http.MethodType.POST); // 指定请求方法
        uploadCredentialsRequest.setEncoding("utf-8");
        uploadCredentialsRequest.setProtocol(ProtocolType.HTTP);
        for (Map.Entry<String, String> kv : this.headers.entrySet()) {
            uploadCredentialsRequest.putHeaderParameter(kv.getKey(), kv.getValue());
        }

        uploadCredentialsRequest.setHttpContent(new JSONObject().toJSONString().getBytes("UTF-8"), "UTF-8", FormatType.JSON);
        HttpResponse httpResponse =  this.client.doAction(uploadCredentialsRequest);
        if (httpResponse.isSuccess()) {
            JSONObject scrResponse = JSON.parseObject(new String(httpResponse.getHttpContent(), "UTF-8"));
            if (200 == scrResponse.getInteger("code")) {
                JSONObject data = scrResponse.getJSONObject("data");
                return new UploadCredentials(data.getString("accessKeyId"), data.getString("accessKeySecret"),
                        data.getString("securityToken"), data.getLongValue("expiredTime"),
                        data.getString("ossEndpoint"), data.getString("uploadBucket"), data.getString("uploadFolder"));
            }

            String requestId = scrResponse.getString("requestId");
            throw new RuntimeException("get upload credential from server fail. requestId:" + requestId + ", code:" + scrResponse.getInteger("code"));
        }
        throw new RuntimeException("get upload credential from server fail. http response status:" + httpResponse.getStatus());
    }



}