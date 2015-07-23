package com.aliyuncs.ubsms_inner;

import org.junit.Test;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.ubsms_inner.model.v20150623.DescribeUserBusinessStatusRequest;
import com.aliyuncs.ubsms_inner.model.v20150623.DescribeUserBusinessStatusResponse;
import com.aliyuncs.ubsms_inner.model.v20150623.DescribeUserBusinessStatusResponse.Status;

/**
 * 类Sample.java的实现描述：TODO 类实现描述
 * 
 * @author boyang 2015年7月20日 下午3:35:17
 */
public class TestDescribeUserBusinessStatus extends TestBase {

    @Test
    public void test_DescribeUserBusinessStatus() {
        DescribeUserBusinessStatusRequest request = new DescribeUserBusinessStatusRequest();

        request.setUid("1250434591322550");
        request.setServiceCode("ecs");

        try {
            DescribeUserBusinessStatusResponse response = client.getAcsResponse(request);

            ////describe statuses
            System.out.println(response.getRequestId());
            System.out.println(response.getSuccess());
            System.out.println(response.getUid());
            System.out.println(response.getServiceCode());

            //statusKeyValue in list 
            for (Status status : response.getStatuses()) {
                System.out.println(status.getStatusKey() + " " + status.getStatusValue());
            }

        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }

}
