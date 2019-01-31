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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListClusterResponse;
import com.aliyuncs.edas.model.v20170801.ListClusterResponse.Cluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterResponseUnmarshaller {

	public static ListClusterResponse unmarshall(ListClusterResponse listClusterResponse, UnmarshallerContext context) {
		
		listClusterResponse.setRequestId(context.stringValue("ListClusterResponse.RequestId"));
		listClusterResponse.setCode(context.integerValue("ListClusterResponse.Code"));
		listClusterResponse.setMessage(context.stringValue("ListClusterResponse.Message"));

		List<Cluster> clusterList = new ArrayList<Cluster>();
		for (int i = 0; i < context.lengthValue("ListClusterResponse.ClusterList.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setClusterId(context.stringValue("ListClusterResponse.ClusterList["+ i +"].ClusterId"));
			cluster.setRegionId(context.stringValue("ListClusterResponse.ClusterList["+ i +"].RegionId"));
			cluster.setDescription(context.stringValue("ListClusterResponse.ClusterList["+ i +"].Description"));
			cluster.setClusterName(context.stringValue("ListClusterResponse.ClusterList["+ i +"].ClusterName"));
			cluster.setClusterType(context.integerValue("ListClusterResponse.ClusterList["+ i +"].ClusterType"));
			cluster.setOversoldFactor(context.integerValue("ListClusterResponse.ClusterList["+ i +"].OversoldFactor"));
			cluster.setNetworkMode(context.integerValue("ListClusterResponse.ClusterList["+ i +"].NetworkMode"));
			cluster.setVpcId(context.stringValue("ListClusterResponse.ClusterList["+ i +"].VpcId"));
			cluster.setNodeNum(context.integerValue("ListClusterResponse.ClusterList["+ i +"].NodeNum"));
			cluster.setCpu(context.integerValue("ListClusterResponse.ClusterList["+ i +"].Cpu"));
			cluster.setMem(context.integerValue("ListClusterResponse.ClusterList["+ i +"].Mem"));
			cluster.setCpuUsed(context.integerValue("ListClusterResponse.ClusterList["+ i +"].CpuUsed"));
			cluster.setMemUsed(context.integerValue("ListClusterResponse.ClusterList["+ i +"].MemUsed"));
			cluster.setCreateTime(context.longValue("ListClusterResponse.ClusterList["+ i +"].CreateTime"));
			cluster.setUpdateTime(context.longValue("ListClusterResponse.ClusterList["+ i +"].UpdateTime"));
			cluster.setIaasProvider(context.stringValue("ListClusterResponse.ClusterList["+ i +"].IaasProvider"));

			clusterList.add(cluster);
		}
		listClusterResponse.setClusterList(clusterList);
	 
	 	return listClusterResponse;
	}
}