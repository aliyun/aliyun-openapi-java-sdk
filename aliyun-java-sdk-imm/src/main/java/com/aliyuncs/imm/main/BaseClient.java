package com.aliyuncs.imm.main;

import com.aliyuncs.AcsRequest;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.imm.model.v20170906.ActionRequest;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.regions.Endpoint;
import com.aliyuncs.regions.ProductDomain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by guangchun.luo on 17/12/29.
 */
public class BaseClient {

    private final static String PRODUCT_CODE = "imm";
    private String accessKeyId;

    protected IAcsClient client;

    static Map<String,String> regionMap = new HashMap<String,String>();

    public BaseClient(String regionId, String accessKeyId, String accessKeySecret) {
        if(regionMap.get(regionId)==null){
            BaseClient.addEndpoint(regionId, "imm."+regionId+".aliyuncs.com");
        }
        this.accessKeyId = accessKeyId;
        this.client = new DefaultAcsClient(DefaultProfile.getProfile(regionId, accessKeyId, accessKeySecret));
    }

    public BaseClient(String regionId, String accessKeyId, String accessKeySecret, String stsToken) {
        if(regionMap.get(regionId)==null){
            BaseClient.addEndpoint(regionId, "imm."+regionId+".aliyuncs.com");
        }
        this.accessKeyId = accessKeyId;
        this.client = new DefaultAcsClient(DefaultProfile.getProfile(regionId, accessKeyId, accessKeySecret, stsToken));
    }

    /**
     * add region domain mapping
     *
     * @param region "cn-shenzhen"
     * @param domain "batchcompute.cn-shenzhen.aliyuncs.com"
     */
    public static void addEndpoint(String region, String domain) {
        regionMap.put(region, domain);
        try {
            DefaultProfile.addEndpoint(region, region, PRODUCT_CODE, domain);
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, String> listEndpoints() throws ClientException {

        Map<String, String> m = new HashMap<String,String>();

        for(Map.Entry<String, String>  ent : regionMap.entrySet()){
            String region = ent.getKey();

            List<Endpoint> list = DefaultProfile.getProfile().getEndpoints(region, PRODUCT_CODE);

            for(Endpoint ep : list){
                //System.out.println(ep.getName()+":  "+ ep.getProductDomains().size());
                for( ProductDomain pd: ep.getProductDomains()) {
                    if(pd.getProductName().equals(PRODUCT_CODE)) {
                        m.put(ep.getName(), pd.getDomianName());
                        //System.out.println("   "+ep.getName() + ", " + pd.getDomianName() + ", " + pd.getProductName());
                    }
                }
            }
        }
        return m;

    }



    protected static Map<String,String> commonHeaders = new HashMap<String, String>();
    /**
     * add header k-v pairs for every request
     * @param key
     * @param value
     */
    public static void addRequestHeader(String key, String value) {
        commonHeaders.put(key,value);
    }
    private void attachCommonHeaders(AcsRequest request){
        Set<String> keys = commonHeaders.keySet();
        for(String key: keys){
            request.putHeaderParameter(key, commonHeaders.get(key));
        }
    }


    public static boolean verbose = false;

    public String getResponseString(Map<String, String> params) throws ClientException {

        ActionRequest request = new ActionRequest(params);

        request.putHeaderParameter("x-acs-access-key-id", this.accessKeyId);


        if (verbose) {
            printRequest(request);
        }
        //request.setMethod(MethodType.POST);
        request.setAcceptFormat(FormatType.JSON);

        attachCommonHeaders(request);

        HttpResponse baseResponse = this.client.doAction(request);

        String body = new String(baseResponse.getHttpContent());

        if (verbose) {
            printResponse(request, baseResponse);
        }
        return body;
    }


    public String getResponseString(AcsRequest request) throws ClientException {

        request.putHeaderParameter("x-acs-access-key-id", this.accessKeyId);

        if (verbose) {
            printRequest(request);
        }
        //request.setMethod(MethodType.POST);
        request.setAcceptFormat(FormatType.JSON);

        attachCommonHeaders(request);

        HttpResponse baseResponse = this.client.doAction(request);

        String body = new String(baseResponse.getHttpContent());

        if (verbose) {
            printResponse(request, baseResponse);
        }
        return body;
    }


    public  <T extends AcsResponse> T getResponse(AcsRequest<T> request) throws ClientException {

        request.putHeaderParameter("x-acs-access-key-id", this.accessKeyId);

        if (verbose) {
            printRequest(request);
        }
        //request.setMethod(MethodType.POST);
        //request.setAcceptFormat(FormatType.JSON);
        attachCommonHeaders(request);

        HttpResponse baseResponse = this.client.doAction(request);
        if (verbose) {
            printResponse(request, baseResponse);
        }

        return HackAcsClient.parseAcsResponse(request.getResponseClass(), baseResponse);
    }




    private void printRequest(AcsRequest request){
        Map<String, String> reqHeaders = request.getHeaders();

        Set<String> keys = reqHeaders.keySet();
        System.out.println("--->Request.Headers:");
        for (String key : keys) {
            System.out.println("\t" + key + ":" + reqHeaders.get(key));
        }

        byte[] bs = request.getHttpContent();
        if (bs == null) bs = new byte[]{};
        System.out.println("--->Request.Action:"+request.getActionName());
        System.out.println("--->Request.Body:->" +  new String(bs)+"<-");
    }

    private void printResponse(AcsRequest request, HttpResponse baseResponse){
        System.out.println("--->Request.method:" + request.getMethod());
        System.out.println("--->Request.URL:" + request.getUrl());
        System.out.println("--->Response.Status:" + baseResponse.getStatus());

        Map<String, String> headers = baseResponse.getHeaders();
        Set<String> keys = headers.keySet();
        System.out.println("--->Response.Headers:");
        for (String key : keys) {
            System.out.println("\t" + key + ":" + headers.get(key));
        }
        String body = new String(baseResponse.getHttpContent());
        System.out.println("--->Response.body:" + body);
    }

}
