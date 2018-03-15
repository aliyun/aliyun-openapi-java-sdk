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

package com.aliyuncs.teslamaxcompute.transform.v20180104;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.teslamaxcompute.model.v20180104.QueryResourceInventoryResponse;
import com.aliyuncs.teslamaxcompute.model.v20180104.QueryResourceInventoryResponse.Data;
import com.aliyuncs.teslamaxcompute.model.v20180104.QueryResourceInventoryResponse.Data.Cluster;
import com.aliyuncs.teslamaxcompute.model.v20180104.QueryResourceInventoryResponse.Data.Cluster.ResourceInventory;
import com.aliyuncs.teslamaxcompute.model.v20180104.QueryResourceInventoryResponse.Data.Cluster.ResourceParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryResourceInventoryResponseUnmarshaller {

	public static QueryResourceInventoryResponse unmarshall(QueryResourceInventoryResponse queryResourceInventoryResponse, UnmarshallerContext context) {
		
		queryResourceInventoryResponse.setRequestId(context.stringValue("QueryResourceInventoryResponse.RequestId"));
		queryResourceInventoryResponse.setCode(context.integerValue("QueryResourceInventoryResponse.Code"));
		queryResourceInventoryResponse.setMessage(context.stringValue("QueryResourceInventoryResponse.Message"));

		Data data = new Data();
		data.setLastUpdate(context.stringValue("QueryResourceInventoryResponse.Data.LastUpdate"));

		List<Cluster> clusters = new ArrayList<Cluster>();
		for (int i = 0; i < context.lengthValue("QueryResourceInventoryResponse.Data.Clusters.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setStatus(context.stringValue("QueryResourceInventoryResponse.Data.Clusters["+ i +"].Status"));
			cluster.setCluster(context.stringValue("QueryResourceInventoryResponse.Data.Clusters["+ i +"].Cluster"));
			cluster.setMachineRoom(context.stringValue("QueryResourceInventoryResponse.Data.Clusters["+ i +"].MachineRoom"));
			cluster.setRegion(context.stringValue("QueryResourceInventoryResponse.Data.Clusters["+ i +"].Region"));

			List<ResourceParameter> resourceParameters = new ArrayList<ResourceParameter>();
			for (int j = 0; j < context.lengthValue("QueryResourceInventoryResponse.Data.Clusters["+ i +"].ResourceParameters.Length"); j++) {
				ResourceParameter resourceParameter = new ResourceParameter();
				resourceParameter.setParaName(context.stringValue("QueryResourceInventoryResponse.Data.Clusters["+ i +"].ResourceParameters["+ j +"].ParaName"));
				resourceParameter.setParaValue(context.stringValue("QueryResourceInventoryResponse.Data.Clusters["+ i +"].ResourceParameters["+ j +"].ParaValue"));

				resourceParameters.add(resourceParameter);
			}
			cluster.setResourceParameters(resourceParameters);

			List<ResourceInventory> resourceInventories = new ArrayList<ResourceInventory>();
			for (int j = 0; j < context.lengthValue("QueryResourceInventoryResponse.Data.Clusters["+ i +"].ResourceInventories.Length"); j++) {
				ResourceInventory resourceInventory = new ResourceInventory();
				resourceInventory.setTotal(context.longValue("QueryResourceInventoryResponse.Data.Clusters["+ i +"].ResourceInventories["+ j +"].Total"));
				resourceInventory.setAvailable(context.longValue("QueryResourceInventoryResponse.Data.Clusters["+ i +"].ResourceInventories["+ j +"].Available"));
				resourceInventory.setUsed(context.longValue("QueryResourceInventoryResponse.Data.Clusters["+ i +"].ResourceInventories["+ j +"].Used"));
				resourceInventory.setResourceType(context.stringValue("QueryResourceInventoryResponse.Data.Clusters["+ i +"].ResourceInventories["+ j +"].ResourceType"));

				resourceInventories.add(resourceInventory);
			}
			cluster.setResourceInventories(resourceInventories);

			clusters.add(cluster);
		}
		data.setClusters(clusters);
		queryResourceInventoryResponse.setData(data);
	 
	 	return queryResourceInventoryResponse;
	}
}