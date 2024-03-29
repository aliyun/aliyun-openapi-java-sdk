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

	public static ListClusterResponse unmarshall(ListClusterResponse listClusterResponse, UnmarshallerContext _ctx) {
		
		listClusterResponse.setRequestId(_ctx.stringValue("ListClusterResponse.RequestId"));
		listClusterResponse.setCode(_ctx.integerValue("ListClusterResponse.Code"));
		listClusterResponse.setMessage(_ctx.stringValue("ListClusterResponse.Message"));

		List<Cluster> clusterList = new ArrayList<Cluster>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterResponse.ClusterList.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setVpcId(_ctx.stringValue("ListClusterResponse.ClusterList["+ i +"].VpcId"));
			cluster.setOversoldFactor(_ctx.integerValue("ListClusterResponse.ClusterList["+ i +"].OversoldFactor"));
			cluster.setUpdateTime(_ctx.longValue("ListClusterResponse.ClusterList["+ i +"].UpdateTime"));
			cluster.setMemUsed(_ctx.integerValue("ListClusterResponse.ClusterList["+ i +"].MemUsed"));
			cluster.setIaasProvider(_ctx.stringValue("ListClusterResponse.ClusterList["+ i +"].IaasProvider"));
			cluster.setCreateTime(_ctx.longValue("ListClusterResponse.ClusterList["+ i +"].CreateTime"));
			cluster.setCpuUsed(_ctx.integerValue("ListClusterResponse.ClusterList["+ i +"].CpuUsed"));
			cluster.setMem(_ctx.integerValue("ListClusterResponse.ClusterList["+ i +"].Mem"));
			cluster.setRegionId(_ctx.stringValue("ListClusterResponse.ClusterList["+ i +"].RegionId"));
			cluster.setCpu(_ctx.integerValue("ListClusterResponse.ClusterList["+ i +"].Cpu"));
			cluster.setCsClusterId(_ctx.stringValue("ListClusterResponse.ClusterList["+ i +"].CsClusterId"));
			cluster.setNetworkMode(_ctx.integerValue("ListClusterResponse.ClusterList["+ i +"].NetworkMode"));
			cluster.setDescription(_ctx.stringValue("ListClusterResponse.ClusterList["+ i +"].Description"));
			cluster.setClusterType(_ctx.integerValue("ListClusterResponse.ClusterList["+ i +"].ClusterType"));
			cluster.setResourceGroupId(_ctx.stringValue("ListClusterResponse.ClusterList["+ i +"].ResourceGroupId"));
			cluster.setClusterName(_ctx.stringValue("ListClusterResponse.ClusterList["+ i +"].ClusterName"));
			cluster.setNodeNum(_ctx.integerValue("ListClusterResponse.ClusterList["+ i +"].NodeNum"));
			cluster.setClusterId(_ctx.stringValue("ListClusterResponse.ClusterList["+ i +"].ClusterId"));

			clusterList.add(cluster);
		}
		listClusterResponse.setClusterList(clusterList);
	 
	 	return listClusterResponse;
	}
}