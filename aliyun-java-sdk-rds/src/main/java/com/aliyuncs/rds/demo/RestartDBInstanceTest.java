package com.aliyuncs.rds.demo;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.rds.model.v20140815.RestartDBInstanceRequest;
import com.aliyuncs.rds.model.v20140815.RestartDBInstanceResponse;

// 重启实例
public class RestartDBInstanceTest {
    public static void main(String[] args) {
        try {
            RestartDBInstanceRequest restartDBInstanceRequest = new RestartDBInstanceRequest();
            // 必填项,如:rm-wz934c9ky80f90038
            restartDBInstanceRequest.setDBInstanceId("<your instance id>");
            // 资源在某个region内，必须指定region
            IClientProfile profile= DefaultProfile
                    .getProfile("cn-hangzhou", "<your access key id>", "<your access key secret>");
            IAcsClient client = new DefaultAcsClient(profile);

            RestartDBInstanceResponse response= client.getAcsResponse(restartDBInstanceRequest);
            // 重启实例当只返回RequestId公共参数是，表示接口调用成功，重启成功。
            System.out.println(response.getRequestId());
        }
        catch(ClientException e) {
            System.out.println(e.getErrCode());
            System.out.println(e.getMessage());
        }
    }
}
