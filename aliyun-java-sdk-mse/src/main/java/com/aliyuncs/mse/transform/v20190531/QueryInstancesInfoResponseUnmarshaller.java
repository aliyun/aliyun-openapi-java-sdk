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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.QueryInstancesInfoResponse;
import com.aliyuncs.mse.model.v20190531.QueryInstancesInfoResponse.InstanceModels;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInstancesInfoResponseUnmarshaller {

	public static QueryInstancesInfoResponse unmarshall(QueryInstancesInfoResponse queryInstancesInfoResponse, UnmarshallerContext _ctx) {
		
		queryInstancesInfoResponse.setRequestId(_ctx.stringValue("QueryInstancesInfoResponse.RequestId"));
		queryInstancesInfoResponse.setSuccess(_ctx.booleanValue("QueryInstancesInfoResponse.Success"));
		queryInstancesInfoResponse.setMessage(_ctx.stringValue("QueryInstancesInfoResponse.Message"));
		queryInstancesInfoResponse.setErrorCode(_ctx.stringValue("QueryInstancesInfoResponse.ErrorCode"));
		queryInstancesInfoResponse.setHttpCode(_ctx.stringValue("QueryInstancesInfoResponse.HttpCode"));

		List<InstanceModels> data = new ArrayList<InstanceModels>();
		for (int i = 0; i < _ctx.lengthValue("QueryInstancesInfoResponse.Data.Length"); i++) {
			InstanceModels instanceModels = new InstanceModels();
			instanceModels.setHealthStatus(_ctx.stringValue("QueryInstancesInfoResponse.Data["+ i +"].HealthStatus"));
			instanceModels.setRole(_ctx.stringValue("QueryInstancesInfoResponse.Data["+ i +"].Role"));
			instanceModels.setPodName(_ctx.stringValue("QueryInstancesInfoResponse.Data["+ i +"].PodName"));
			instanceModels.setIp(_ctx.stringValue("QueryInstancesInfoResponse.Data["+ i +"].Ip"));
			instanceModels.setInternetIp(_ctx.stringValue("QueryInstancesInfoResponse.Data["+ i +"].InternetIp"));
			instanceModels.setSingleTunnelVip(_ctx.stringValue("QueryInstancesInfoResponse.Data["+ i +"].SingleTunnelVip"));
			instanceModels.setCreationTimestamp(_ctx.stringValue("QueryInstancesInfoResponse.Data["+ i +"].CreationTimestamp"));
			instanceModels.setClientPort(_ctx.stringValue("QueryInstancesInfoResponse.Data["+ i +"].ClientPort"));
			instanceModels.setZone(_ctx.stringValue("QueryInstancesInfoResponse.Data["+ i +"].Zone"));

			data.add(instanceModels);
		}
		queryInstancesInfoResponse.setData(data);
	 
	 	return queryInstancesInfoResponse;
	}
}