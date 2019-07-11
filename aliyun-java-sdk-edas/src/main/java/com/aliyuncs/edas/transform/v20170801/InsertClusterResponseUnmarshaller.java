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

import com.aliyuncs.edas.model.v20170801.InsertClusterResponse;
import com.aliyuncs.edas.model.v20170801.InsertClusterResponse.Cluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class InsertClusterResponseUnmarshaller {

	public static InsertClusterResponse unmarshall(InsertClusterResponse insertClusterResponse, UnmarshallerContext _ctx) {
		
		insertClusterResponse.setRequestId(_ctx.stringValue("InsertClusterResponse.RequestId"));
		insertClusterResponse.setCode(_ctx.integerValue("InsertClusterResponse.Code"));
		insertClusterResponse.setMessage(_ctx.stringValue("InsertClusterResponse.Message"));

		Cluster cluster = new Cluster();
		cluster.setClusterId(_ctx.stringValue("InsertClusterResponse.Cluster.ClusterId"));
		cluster.setRegionId(_ctx.stringValue("InsertClusterResponse.Cluster.RegionId"));
		cluster.setClusterName(_ctx.stringValue("InsertClusterResponse.Cluster.ClusterName"));
		cluster.setClusterType(_ctx.integerValue("InsertClusterResponse.Cluster.ClusterType"));
		cluster.setOversoldFactor(_ctx.integerValue("InsertClusterResponse.Cluster.OversoldFactor"));
		cluster.setNetworkMode(_ctx.integerValue("InsertClusterResponse.Cluster.NetworkMode"));
		cluster.setVpcId(_ctx.stringValue("InsertClusterResponse.Cluster.VpcId"));
		cluster.setIaasProvider(_ctx.stringValue("InsertClusterResponse.Cluster.IaasProvider"));
		insertClusterResponse.setCluster(cluster);
	 
	 	return insertClusterResponse;
	}
}