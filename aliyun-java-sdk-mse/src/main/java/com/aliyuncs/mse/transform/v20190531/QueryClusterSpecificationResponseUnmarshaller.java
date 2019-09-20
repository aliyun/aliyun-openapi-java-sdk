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

import com.aliyuncs.mse.model.v20190531.QueryClusterSpecificationResponse;
import com.aliyuncs.mse.model.v20190531.QueryClusterSpecificationResponse.ClusterSpecificationData;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryClusterSpecificationResponseUnmarshaller {

	public static QueryClusterSpecificationResponse unmarshall(QueryClusterSpecificationResponse queryClusterSpecificationResponse, UnmarshallerContext _ctx) {
		
		queryClusterSpecificationResponse.setRequestId(_ctx.stringValue("QueryClusterSpecificationResponse.RequestId"));
		queryClusterSpecificationResponse.setSuccess(_ctx.stringValue("QueryClusterSpecificationResponse.Success"));
		queryClusterSpecificationResponse.setMessage(_ctx.stringValue("QueryClusterSpecificationResponse.Message"));
		queryClusterSpecificationResponse.setErrorCode(_ctx.stringValue("QueryClusterSpecificationResponse.ErrorCode"));

		List<ClusterSpecificationData> data = new ArrayList<ClusterSpecificationData>();
		for (int i = 0; i < _ctx.lengthValue("QueryClusterSpecificationResponse.Data.Length"); i++) {
			ClusterSpecificationData clusterSpecificationData = new ClusterSpecificationData();
			clusterSpecificationData.setClusterSpecificationName(_ctx.stringValue("QueryClusterSpecificationResponse.Data["+ i +"].ClusterSpecificationName"));
			clusterSpecificationData.setCpuCapacity(_ctx.stringValue("QueryClusterSpecificationResponse.Data["+ i +"].CpuCapacity"));
			clusterSpecificationData.setMemoryCapacity(_ctx.stringValue("QueryClusterSpecificationResponse.Data["+ i +"].MemoryCapacity"));
			clusterSpecificationData.setDiskCapacity(_ctx.stringValue("QueryClusterSpecificationResponse.Data["+ i +"].DiskCapacity"));
			clusterSpecificationData.setInstanceCount(_ctx.stringValue("QueryClusterSpecificationResponse.Data["+ i +"].InstanceCount"));
			clusterSpecificationData.setMaxTps(_ctx.stringValue("QueryClusterSpecificationResponse.Data["+ i +"].MaxTps"));
			clusterSpecificationData.setMaxCon(_ctx.stringValue("QueryClusterSpecificationResponse.Data["+ i +"].MaxCon"));

			data.add(clusterSpecificationData);
		}
		queryClusterSpecificationResponse.setData(data);
	 
	 	return queryClusterSpecificationResponse;
	}
}