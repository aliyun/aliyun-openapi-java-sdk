import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.saf.model.v20180919.ExecuteRequestRequest;
import com.aliyuncs.saf.model.v20180919.ExecuteRequestResponse;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
public class SafaaPopTest {


    private static String regionId="cn-shanghai";
    public static final String AcesskeyId ="******";
    public static final String secertKey ="**********";


    protected static String getDomain(boolean isVpc){
        String product = "saf";

        if(isVpc){
            product +="-vpc";
        }

        if("cn-shanghai".equals(regionId)){
            return product+".cn-shanghai.aliyuncs.com";
        }

        if("cn-hangzhou".equals(regionId)){
            return product+".cn-hangzhou.aliyuncs.com";
        }

        if("cn-shenzhen".equals(regionId)){
            return product+".cn-shenzhen.aliyuncs.com";
        }

        if("cn-zhangjiakou".equals(regionId)){
            return product+".cn-zhangjiakou.aliyuncs.com";
        }
        if("cn-beijing".equals(regionId)){
            return product+".cn-beijing.aliyuncs.com";
        }


        return "saf.cn-shanghai.aliyuncs.com";
    }


    public static void main(String[] args) throws ClientException, UnsupportedEncodingException {
        IClientProfile profile = DefaultProfile.getProfile(regionId, AcesskeyId, secertKey);

        DefaultProfile.addEndpoint( regionId, "saf", getDomain(false));

        IAcsClient client = new DefaultAcsClient(profile);

        ExecuteRequestRequest executeRequestRequest = new ExecuteRequestRequest();
        executeRequestRequest.setMethod(com.aliyuncs.http.MethodType.POST); // 指定请求方法
        //服务的产品码：address_validation/email_risk/coupon_abuse/account_abuse。
        String service ="account_abuse_pro";
        executeRequestRequest.setService(service);

        // 业务详细参数，具体见文档里的业务参数部分,不需要的参数就不需要设置
        Map<String, Object> serviceParams = new HashMap<String, Object>();

        //手机号，国内11位，国外参照文档
        serviceParams.put("email", "safd@sina.com");
        serviceParams.put("mobile", "*****");

        System.out.println(JSONObject.toJSONString(serviceParams));
        executeRequestRequest.setServiceParameters(JSONObject.toJSONString(serviceParams));

        /**
         * 请务必设置超时时间
         */
       // executeRequestRequest.setConnectTimeout(10000);
        executeRequestRequest.setReadTimeout(12000);
        executeRequestRequest.setHttpContent(JSONObject.toJSONString(serviceParams).getBytes("UTF-8"),"UTF-8", FormatType.JSON);

        try {
            ExecuteRequestResponse httpResponse = client.getAcsResponse(executeRequestRequest);
                System.out.println("detect not success. code:" +JSONObject.toJSONString(httpResponse));
//            httpResponse.getData().getScore()
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }




}
