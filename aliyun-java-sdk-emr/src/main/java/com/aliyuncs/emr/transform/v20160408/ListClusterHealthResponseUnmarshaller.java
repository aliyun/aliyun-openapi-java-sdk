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

import com.aliyuncs.emr.model.v20160408.ListClusterHealthResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterHealthResponse.ClusterHealthResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterHealthResponse.ClusterHealthResponse.HealthResult;
import com.aliyuncs.emr.model.v20160408.ListClusterHealthResponse.ClusterHealthResponse.ServiceHealthInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterHealthResponseUnmarshaller {

	public static ListClusterHealthResponse unmarshall(ListClusterHealthResponse listClusterHealthResponse, UnmarshallerContext context) {
		
		listClusterHealthResponse.setRequestId(context.stringValue("ListClusterHealthResponse.RequestId"));

		List<ClusterHealthResponse> clusterHealthResponseList = new ArrayList<ClusterHealthResponse>();
		for (int i = 0; i < context.lengthValue("ListClusterHealthResponse.ClusterHealthResponseList.Length"); i++) {
			ClusterHealthResponse clusterHealthResponse = new ClusterHealthResponse();
			clusterHealthResponse.setClusterId(context.longValue("ListClusterHealthResponse.ClusterHealthResponseList["+ i +"].ClusterId"));

			HealthResult healthResult = new HealthResult();
			healthResult.setKey(context.stringValue("ListClusterHealthResponse.ClusterHealthResponseList["+ i +"].HealthResult.Key"));
			healthResult.setPassNumber(context.integerValue("ListClusterHealthResponse.ClusterHealthResponseList["+ i +"].HealthResult.PassNumber"));
			healthResult.setErrorNumber(context.integerValue("ListClusterHealthResponse.ClusterHealthResponseList["+ i +"].HealthResult.ErrorNumber"));
			healthResult.setWarningNumber(context.integerValue("ListClusterHealthResponse.ClusterHealthResponseList["+ i +"].HealthResult.WarningNumber"));
			healthResult.setUnKnownNumber(context.integerValue("ListClusterHealthResponse.ClusterHealthResponseList["+ i +"].HealthResult.UnKnownNumber"));
			clusterHealthResponse.setHealthResult(healthResult);

			List<ServiceHealthInfo> serviceHealthInfoList = new ArrayList<ServiceHealthInfo>();
			for (int j = 0; j < context.lengthValue("ListClusterHealthResponse.ClusterHealthResponseList["+ i +"].ServiceHealthInfoList.Length"); j++) {
				ServiceHealthInfo serviceHealthInfo = new ServiceHealthInfo();
				serviceHealthInfo.setKey(context.stringValue("ListClusterHealthResponse.ClusterHealthResponseList["+ i +"].ServiceHealthInfoList["+ j +"].Key"));
				serviceHealthInfo.setPassNumber(context.integerValue("ListClusterHealthResponse.ClusterHealthResponseList["+ i +"].ServiceHealthInfoList["+ j +"].PassNumber"));
				serviceHealthInfo.setErrorNumber(context.integerValue("ListClusterHealthResponse.ClusterHealthResponseList["+ i +"].ServiceHealthInfoList["+ j +"].ErrorNumber"));
				serviceHealthInfo.setWarningNumber(context.integerValue("ListClusterHealthResponse.ClusterHealthResponseList["+ i +"].ServiceHealthInfoList["+ j +"].WarningNumber"));
				serviceHealthInfo.setUnKnownNumber(context.integerValue("ListClusterHealthResponse.ClusterHealthResponseList["+ i +"].ServiceHealthInfoList["+ j +"].UnKnownNumber"));

				serviceHealthInfoList.add(serviceHealthInfo);
			}
			clusterHealthResponse.setServiceHealthInfoList(serviceHealthInfoList);

			clusterHealthResponseList.add(clusterHealthResponse);
		}
		listClusterHealthResponse.setClusterHealthResponseList(clusterHealthResponseList);
	 
	 	return listClusterHealthResponse;
	}
}