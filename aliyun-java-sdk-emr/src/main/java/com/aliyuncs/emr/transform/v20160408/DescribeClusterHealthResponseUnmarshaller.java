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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeClusterHealthResponse;
import com.aliyuncs.emr.model.v20160408.DescribeClusterHealthResponse.HealthResult;
import com.aliyuncs.emr.model.v20160408.DescribeClusterHealthResponse.ServiceHealthInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterHealthResponseUnmarshaller {

	public static DescribeClusterHealthResponse unmarshall(DescribeClusterHealthResponse describeClusterHealthResponse, UnmarshallerContext context) {
		
		describeClusterHealthResponse.setRequestId(context.stringValue("DescribeClusterHealthResponse.RequestId"));
		describeClusterHealthResponse.setClusterId(context.longValue("DescribeClusterHealthResponse.ClusterId"));

		HealthResult healthResult = new HealthResult();
		healthResult.setKey(context.stringValue("DescribeClusterHealthResponse.HealthResult.Key"));
		healthResult.setPassNumber(context.integerValue("DescribeClusterHealthResponse.HealthResult.PassNumber"));
		healthResult.setErrorNumber(context.integerValue("DescribeClusterHealthResponse.HealthResult.ErrorNumber"));
		healthResult.setWarningNumber(context.integerValue("DescribeClusterHealthResponse.HealthResult.WarningNumber"));
		healthResult.setUnKnownNumber(context.integerValue("DescribeClusterHealthResponse.HealthResult.UnKnownNumber"));
		describeClusterHealthResponse.setHealthResult(healthResult);

		List<ServiceHealthInfo> serviceHealthInfoList = new ArrayList<ServiceHealthInfo>();
		for (int i = 0; i < context.lengthValue("DescribeClusterHealthResponse.ServiceHealthInfoList.Length"); i++) {
			ServiceHealthInfo serviceHealthInfo = new ServiceHealthInfo();
			serviceHealthInfo.setKey(context.stringValue("DescribeClusterHealthResponse.ServiceHealthInfoList["+ i +"].Key"));
			serviceHealthInfo.setPassNumber(context.integerValue("DescribeClusterHealthResponse.ServiceHealthInfoList["+ i +"].PassNumber"));
			serviceHealthInfo.setErrorNumber(context.integerValue("DescribeClusterHealthResponse.ServiceHealthInfoList["+ i +"].ErrorNumber"));
			serviceHealthInfo.setWarningNumber(context.integerValue("DescribeClusterHealthResponse.ServiceHealthInfoList["+ i +"].WarningNumber"));
			serviceHealthInfo.setUnKnownNumber(context.integerValue("DescribeClusterHealthResponse.ServiceHealthInfoList["+ i +"].UnKnownNumber"));

			serviceHealthInfoList.add(serviceHealthInfo);
		}
		describeClusterHealthResponse.setServiceHealthInfoList(serviceHealthInfoList);
	 
	 	return describeClusterHealthResponse;
	}
}