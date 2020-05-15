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

	public static GetClusterResponse unmarshall(GetClusterResponse getClusterResponse, UnmarshallerContext _ctx) {
		
		getClusterResponse.setRequestId(_ctx.stringValue("GetClusterResponse.RequestId"));
		getClusterResponse.setCode(_ctx.integerValue("GetClusterResponse.Code"));
		getClusterResponse.setMessage(_ctx.stringValue("GetClusterResponse.Message"));

		Cluster cluster = new Cluster();
		cluster.setClusterId(_ctx.stringValue("GetClusterResponse.Cluster.ClusterId"));
		cluster.setRegionId(_ctx.stringValue("GetClusterResponse.Cluster.RegionId"));
		cluster.setDescription(_ctx.stringValue("GetClusterResponse.Cluster.Description"));
		cluster.setClusterName(_ctx.stringValue("GetClusterResponse.Cluster.ClusterName"));
		cluster.setClusterType(_ctx.integerValue("GetClusterResponse.Cluster.ClusterType"));
		cluster.setOversoldFactor(_ctx.integerValue("GetClusterResponse.Cluster.OversoldFactor"));
		cluster.setNetworkMode(_ctx.integerValue("GetClusterResponse.Cluster.NetworkMode"));
		cluster.setVpcId(_ctx.stringValue("GetClusterResponse.Cluster.VpcId"));
		cluster.setNodeNum(_ctx.integerValue("GetClusterResponse.Cluster.NodeNum"));
		cluster.setCpu(_ctx.integerValue("GetClusterResponse.Cluster.Cpu"));
		cluster.setMem(_ctx.integerValue("GetClusterResponse.Cluster.Mem"));
		cluster.setCpuUsed(_ctx.integerValue("GetClusterResponse.Cluster.CpuUsed"));
		cluster.setMemUsed(_ctx.integerValue("GetClusterResponse.Cluster.MemUsed"));
		cluster.setCreateTime(_ctx.longValue("GetClusterResponse.Cluster.CreateTime"));
		cluster.setUpdateTime(_ctx.longValue("GetClusterResponse.Cluster.UpdateTime"));
		cluster.setIaasProvider(_ctx.stringValue("GetClusterResponse.Cluster.IaasProvider"));
		cluster.setCsClusterId(_ctx.stringValue("GetClusterResponse.Cluster.CsClusterId"));
		cluster.setClusterImportStatus(_ctx.integerValue("GetClusterResponse.Cluster.ClusterImportStatus"));
		getClusterResponse.setCluster(cluster);
	 
	 	return getClusterResponse;
	}
}