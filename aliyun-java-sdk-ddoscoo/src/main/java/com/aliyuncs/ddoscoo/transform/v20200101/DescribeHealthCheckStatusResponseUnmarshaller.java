/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeHealthCheckStatusResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeHealthCheckStatusResponse.Status;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeHealthCheckStatusResponse.Status.RealServerStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHealthCheckStatusResponseUnmarshaller {

	public static DescribeHealthCheckStatusResponse unmarshall(DescribeHealthCheckStatusResponse describeHealthCheckStatusResponse, UnmarshallerContext _ctx) {
		
		describeHealthCheckStatusResponse.setRequestId(_ctx.stringValue("DescribeHealthCheckStatusResponse.RequestId"));

		List<Status> healthCheckStatus = new ArrayList<Status>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHealthCheckStatusResponse.HealthCheckStatus.Length"); i++) {
			Status status = new Status();
			status.setInstanceId(_ctx.stringValue("DescribeHealthCheckStatusResponse.HealthCheckStatus["+ i +"].InstanceId"));
			status.setBizProtocol(_ctx.stringValue("DescribeHealthCheckStatusResponse.HealthCheckStatus["+ i +"].Protocol"));
			status.setFrontendPort(_ctx.integerValue("DescribeHealthCheckStatusResponse.HealthCheckStatus["+ i +"].FrontendPort"));
			status.setStatus(_ctx.stringValue("DescribeHealthCheckStatusResponse.HealthCheckStatus["+ i +"].Status"));

			List<RealServerStatus> realServerStatusList = new ArrayList<RealServerStatus>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHealthCheckStatusResponse.HealthCheckStatus["+ i +"].RealServerStatusList.Length"); j++) {
				RealServerStatus realServerStatus = new RealServerStatus();
				realServerStatus.setAddress(_ctx.stringValue("DescribeHealthCheckStatusResponse.HealthCheckStatus["+ i +"].RealServerStatusList["+ j +"].Address"));
				realServerStatus.setStatus(_ctx.stringValue("DescribeHealthCheckStatusResponse.HealthCheckStatus["+ i +"].RealServerStatusList["+ j +"].Status"));

				realServerStatusList.add(realServerStatus);
			}
			status.setRealServerStatusList(realServerStatusList);

			healthCheckStatus.add(status);
		}
		describeHealthCheckStatusResponse.setHealthCheckStatus(healthCheckStatus);
	 
	 	return describeHealthCheckStatusResponse;
	}
}