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

import com.aliyuncs.edas.model.v20170801.GetClusterResponse;
import com.aliyuncs.edas.model.v20170801.GetClusterResponse.Cluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClusterResponseUnmarshaller {

	public static GetClusterResponse unmarshall(GetClusterResponse getClusterResponse, UnmarshallerContext context) {
		
		getClusterResponse.setRequestId(context.stringValue("GetClusterResponse.RequestId"));
		getClusterResponse.setCode(context.integerValue("GetClusterResponse.Code"));
		getClusterResponse.setMessage(context.stringValue("GetClusterResponse.Message"));

		Cluster cluster = new Cluster();
		cluster.setClusterId(context.stringValue("GetClusterResponse.Cluster.ClusterId"));
		cluster.setRegionId(context.stringValue("GetClusterResponse.Cluster.RegionId"));
		cluster.setDescription(context.stringValue("GetClusterResponse.Cluster.Description"));
		cluster.setClusterName(context.stringValue("GetClusterResponse.Cluster.ClusterName"));
		cluster.setClusterType(context.integerValue("GetClusterResponse.Cluster.ClusterType"));
		cluster.setOversoldFactor(context.integerValue("GetClusterResponse.Cluster.OversoldFactor"));
		cluster.setNetworkMode(context.integerValue("GetClusterResponse.Cluster.NetworkMode"));
		cluster.setVpcId(context.stringValue("GetClusterResponse.Cluster.VpcId"));
		cluster.setNodeNum(context.integerValue("GetClusterResponse.Cluster.NodeNum"));
		cluster.setCpu(context.integerValue("GetClusterResponse.Cluster.Cpu"));
		cluster.setMem(context.integerValue("GetClusterResponse.Cluster.Mem"));
		cluster.setCpuUsed(context.integerValue("GetClusterResponse.Cluster.CpuUsed"));
		cluster.setMemUsed(context.integerValue("GetClusterResponse.Cluster.MemUsed"));
		cluster.setCreateTime(context.longValue("GetClusterResponse.Cluster.CreateTime"));
		cluster.setUpdateTime(context.longValue("GetClusterResponse.Cluster.UpdateTime"));
		cluster.setIaasProvider(context.stringValue("GetClusterResponse.Cluster.IaasProvider"));
		getClusterResponse.setCluster(cluster);
	 
	 	return getClusterResponse;
	}
}