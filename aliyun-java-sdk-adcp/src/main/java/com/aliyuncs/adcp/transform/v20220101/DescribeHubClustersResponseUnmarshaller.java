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

package com.aliyuncs.adcp.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adcp.model.v20220101.DescribeHubClustersResponse;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClustersResponse.Cluster;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClustersResponse.Cluster.ApiServer;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClustersResponse.Cluster.ClusterInfo;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClustersResponse.Cluster.Condition;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClustersResponse.Cluster.Endpoints;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClustersResponse.Cluster.LogConfig;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClustersResponse.Cluster.MeshConfig;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClustersResponse.Cluster.Network;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHubClustersResponseUnmarshaller {

	public static DescribeHubClustersResponse unmarshall(DescribeHubClustersResponse describeHubClustersResponse, UnmarshallerContext _ctx) {
		
		describeHubClustersResponse.setRequestId(_ctx.stringValue("DescribeHubClustersResponse.RequestId"));

		List<Cluster> clusters = new ArrayList<Cluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHubClustersResponse.Clusters.Length"); i++) {
			Cluster cluster = new Cluster();

			Endpoints endpoints = new Endpoints();
			endpoints.setIntranetApiServerEndpoint(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].Endpoints.IntranetApiServerEndpoint"));
			endpoints.setPublicApiServerEndpoint(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].Endpoints.PublicApiServerEndpoint"));
			cluster.setEndpoints(endpoints);

			ClusterInfo clusterInfo = new ClusterInfo();
			clusterInfo.setProfile(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].ClusterInfo.Profile"));
			clusterInfo.setCreationTime(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].ClusterInfo.CreationTime"));
			clusterInfo.setUpdateTime(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].ClusterInfo.UpdateTime"));
			clusterInfo.setErrorMessage(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].ClusterInfo.ErrorMessage"));
			clusterInfo.setVersion(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].ClusterInfo.Version"));
			clusterInfo.setState(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].ClusterInfo.State"));
			clusterInfo.setClusterId(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].ClusterInfo.ClusterId"));
			clusterInfo.setName(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].ClusterInfo.Name"));
			clusterInfo.setRegionId(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].ClusterInfo.RegionId"));
			clusterInfo.setClusterSpec(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].ClusterInfo.ClusterSpec"));
			cluster.setClusterInfo(clusterInfo);

			Network network = new Network();
			network.setVpcId(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].Network.VpcId"));
			network.setClusterDomain(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].Network.ClusterDomain"));

			List<String> vSwitches = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHubClustersResponse.Clusters["+ i +"].Network.VSwitches.Length"); j++) {
				vSwitches.add(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].Network.VSwitches["+ j +"]"));
			}
			network.setVSwitches(vSwitches);

			List<String> securityGroupIDs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHubClustersResponse.Clusters["+ i +"].Network.SecurityGroupIDs.Length"); j++) {
				securityGroupIDs.add(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].Network.SecurityGroupIDs["+ j +"]"));
			}
			network.setSecurityGroupIDs(securityGroupIDs);
			cluster.setNetwork(network);

			ApiServer apiServer = new ApiServer();
			apiServer.setEnabledPublic(_ctx.booleanValue("DescribeHubClustersResponse.Clusters["+ i +"].ApiServer.EnabledPublic"));
			apiServer.setLoadBalancerId(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].ApiServer.LoadBalancerId"));
			apiServer.setApiServerEipId(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].ApiServer.ApiServerEipId"));
			cluster.setApiServer(apiServer);

			MeshConfig meshConfig = new MeshConfig();
			meshConfig.setEnableMesh(_ctx.booleanValue("DescribeHubClustersResponse.Clusters["+ i +"].MeshConfig.EnableMesh"));
			meshConfig.setMeshId(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].MeshConfig.MeshId"));
			cluster.setMeshConfig(meshConfig);

			LogConfig logConfig = new LogConfig();
			logConfig.setEnableLog(_ctx.booleanValue("DescribeHubClustersResponse.Clusters["+ i +"].LogConfig.EnableLog"));
			logConfig.setLogProject(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].LogConfig.LogProject"));
			logConfig.setLogStoreTTL(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].LogConfig.LogStoreTTL"));
			cluster.setLogConfig(logConfig);

			List<Condition> conditions = new ArrayList<Condition>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHubClustersResponse.Clusters["+ i +"].Conditions.Length"); j++) {
				Condition condition = new Condition();
				condition.setType(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].Conditions["+ j +"].Type"));
				condition.setStatus(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].Conditions["+ j +"].Status"));
				condition.setReason(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].Conditions["+ j +"].Reason"));
				condition.setMessage(_ctx.stringValue("DescribeHubClustersResponse.Clusters["+ i +"].Conditions["+ j +"].Message"));

				conditions.add(condition);
			}
			cluster.setConditions(conditions);

			clusters.add(cluster);
		}
		describeHubClustersResponse.setClusters(clusters);
	 
	 	return describeHubClustersResponse;
	}
}