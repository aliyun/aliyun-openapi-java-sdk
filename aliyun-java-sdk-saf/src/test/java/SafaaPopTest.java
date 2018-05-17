import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.saf.model.v20170331.ExecuteRequestRequest;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SafaaPopTest extends BaseSample{

    public static void main(String[] args) throws ClientException, UnsupportedEncodingException {
        IClientProfile profile = DefaultProfile.getProfile(regionId, accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint(getEndPointName(), regionId, "saf", getDomain());
        IAcsClient client = new DefaultAcsClient(profile);

        ExecuteRequestRequest executeRequestRequest = new ExecuteRequestRequest();
        executeRequestRequest.setAcceptFormat(FormatType.JSON); // 指定api返回格式
        executeRequestRequest.setMethod(com.aliyuncs.http.MethodType.POST); // 指定请求方法
        executeRequestRequest.setHttpContentType(FormatType.JSON);
        executeRequestRequest.setEncoding("utf-8");
        //服务的产品码：address_validation/email_risk/coupon_abuse/account_abuse。
        executeRequestRequest.setService("account_abuse");


        List<Map<String, Object>> tasks = new ArrayList<Map<String, Object>>();
        Map<String, String> params = new HashMap<String, String>();


        // 业务详细参数，具体见文档里的业务参数部分,不需要的参数就不需要设置
        Map<String, Object> serviceParams = new HashMap<String, Object>();
        serviceParams.put("email", "c2asdas23dsdcpasd83asdfwcxfgjv3中+文@hotmail.cn");
        //手机号，国内11位，国外参照文档
//        serviceParams.put("mobile", "*********");
        params.put("ServiceParameters", JSONObject.toJSONString(serviceParams));

        executeRequestRequest.setServiceParameters(JSONObject.toJSONString(serviceParams));

        /**
         * 请务必设置超时时间
         */
        executeRequestRequest.setConnectTimeout(10000);
        executeRequestRequest.setReadTimeout(12000);
        executeRequestRequest.setHttpContent(JSONObject.toJSONString(serviceParams).getBytes("UTF-8"),"UTF-8", FormatType.JSON);

        try {
            HttpResponse httpResponse = client.doAction(executeRequestRequest);
            System.out.println("detect not success. code:" +JSONObject.toJSONString(httpResponse));
            if(httpResponse.isSuccess()){
                JSONObject scrResponse = JSON.parseObject(new String(httpResponse.getHttpContent(), "UTF-8"));
                System.out.println(JSON.toJSONString(scrResponse, true));
                if (200 == scrResponse.getInteger("Code")) {
                    JSONObject data = scrResponse.getJSONObject("Data");
                    if(data!=null){
                        String score = data.getString("score");
                        System.out.println("args = [" + score + "]");
                    }

                } else {
                    System.out.println("detect not success. code:" + scrResponse.getInteger("Code"));
                }
            }else{
                System.out.println("response not success. status:" + httpResponse.getStatus());
            }
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
