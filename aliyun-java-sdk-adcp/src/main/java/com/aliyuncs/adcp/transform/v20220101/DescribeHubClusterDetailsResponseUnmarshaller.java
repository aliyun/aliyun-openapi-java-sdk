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

import com.aliyuncs.adcp.model.v20220101.DescribeHubClusterDetailsResponse;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClusterDetailsResponse.Cluster;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClusterDetailsResponse.Cluster.ApiServer;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClusterDetailsResponse.Cluster.ClusterInfo;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClusterDetailsResponse.Cluster.Condition;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClusterDetailsResponse.Cluster.Endpoints;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClusterDetailsResponse.Cluster.LogConfig;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClusterDetailsResponse.Cluster.MeshConfig;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClusterDetailsResponse.Cluster.Network;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClusterDetailsResponse.Cluster.WorkflowConfig;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClusterDetailsResponse.Cluster.WorkflowConfig.WorkflowUnit;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClusterDetailsResponse.Cluster.WorkflowConfig.WorkflowUnit.VSwitch;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHubClusterDetailsResponseUnmarshaller {

	public static DescribeHubClusterDetailsResponse unmarshall(DescribeHubClusterDetailsResponse describeHubClusterDetailsResponse, UnmarshallerContext _ctx) {
		
		describeHubClusterDetailsResponse.setRequestId(_ctx.stringValue("DescribeHubClusterDetailsResponse.RequestId"));

		Cluster cluster = new Cluster();

		Endpoints endpoints = new Endpoints();
		endpoints.setIntranetApiServerEndpoint(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.Endpoints.IntranetApiServerEndpoint"));
		endpoints.setPublicApiServerEndpoint(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.Endpoints.PublicApiServerEndpoint"));
		cluster.setEndpoints(endpoints);

		ClusterInfo clusterInfo = new ClusterInfo();
		clusterInfo.setProfile(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.ClusterInfo.Profile"));
		clusterInfo.setCreationTime(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.ClusterInfo.CreationTime"));
		clusterInfo.setUpdateTime(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.ClusterInfo.UpdateTime"));
		clusterInfo.setErrorMessage(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.ClusterInfo.ErrorMessage"));
		clusterInfo.setVersion(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.ClusterInfo.Version"));
		clusterInfo.setState(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.ClusterInfo.State"));
		clusterInfo.setClusterId(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.ClusterInfo.ClusterId"));
		clusterInfo.setName(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.ClusterInfo.Name"));
		clusterInfo.setRegionId(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.ClusterInfo.RegionId"));
		clusterInfo.setClusterSpec(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.ClusterInfo.ClusterSpec"));
		cluster.setClusterInfo(clusterInfo);

		Network network = new Network();
		network.setVpcId(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.Network.VpcId"));
		network.setIPStack(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.Network.IPStack"));
		network.setClusterDomain(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.Network.ClusterDomain"));

		List<String> vSwitches = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHubClusterDetailsResponse.Cluster.Network.VSwitches.Length"); i++) {
			vSwitches.add(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.Network.VSwitches["+ i +"]"));
		}
		network.setVSwitches(vSwitches);

		List<String> securityGroupIDs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHubClusterDetailsResponse.Cluster.Network.SecurityGroupIDs.Length"); i++) {
			securityGroupIDs.add(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.Network.SecurityGroupIDs["+ i +"]"));
		}
		network.setSecurityGroupIDs(securityGroupIDs);
		cluster.setNetwork(network);

		ApiServer apiServer = new ApiServer();
		apiServer.setEnabledPublic(_ctx.booleanValue("DescribeHubClusterDetailsResponse.Cluster.ApiServer.EnabledPublic"));
		apiServer.setLoadBalancerId(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.ApiServer.LoadBalancerId"));
		apiServer.setApiServerEipId(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.ApiServer.ApiServerEipId"));
		cluster.setApiServer(apiServer);

		MeshConfig meshConfig = new MeshConfig();
		meshConfig.setEnableMesh(_ctx.booleanValue("DescribeHubClusterDetailsResponse.Cluster.MeshConfig.EnableMesh"));
		meshConfig.setMeshId(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.MeshConfig.MeshId"));
		cluster.setMeshConfig(meshConfig);

		LogConfig logConfig = new LogConfig();
		logConfig.setEnableLog(_ctx.booleanValue("DescribeHubClusterDetailsResponse.Cluster.LogConfig.EnableLog"));
		logConfig.setLogProject(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.LogConfig.LogProject"));
		logConfig.setLogStoreTTL(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.LogConfig.LogStoreTTL"));
		cluster.setLogConfig(logConfig);

		WorkflowConfig workflowConfig = new WorkflowConfig();
		workflowConfig.setArgoServerEnabled(_ctx.booleanValue("DescribeHubClusterDetailsResponse.Cluster.WorkflowConfig.ArgoServerEnabled"));
		workflowConfig.setWorkflowScheduleMode(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.WorkflowConfig.WorkflowScheduleMode"));
		workflowConfig.setPriceLimit(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.WorkflowConfig.PriceLimit"));

		List<WorkflowUnit> workflowUnits = new ArrayList<WorkflowUnit>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHubClusterDetailsResponse.Cluster.WorkflowConfig.WorkflowUnits.Length"); i++) {
			WorkflowUnit workflowUnit = new WorkflowUnit();
			workflowUnit.setRegionId(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.WorkflowConfig.WorkflowUnits["+ i +"].RegionId"));
			workflowUnit.setVpcId(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.WorkflowConfig.WorkflowUnits["+ i +"].VpcId"));

			List<VSwitch> vSwitches1 = new ArrayList<VSwitch>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHubClusterDetailsResponse.Cluster.WorkflowConfig.WorkflowUnits["+ i +"].VSwitches.Length"); j++) {
				VSwitch vSwitch = new VSwitch();
				vSwitch.setVswitchId(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.WorkflowConfig.WorkflowUnits["+ i +"].VSwitches["+ j +"].VswitchId"));
				vSwitch.setZoneId(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.WorkflowConfig.WorkflowUnits["+ i +"].VSwitches["+ j +"].ZoneId"));

				vSwitches1.add(vSwitch);
			}
			workflowUnit.setVSwitches1(vSwitches1);

			workflowUnits.add(workflowUnit);
		}
		workflowConfig.setWorkflowUnits(workflowUnits);
		cluster.setWorkflowConfig(workflowConfig);

		List<Condition> conditions = new ArrayList<Condition>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHubClusterDetailsResponse.Cluster.Conditions.Length"); i++) {
			Condition condition = new Condition();
			condition.setType(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.Conditions["+ i +"].Type"));
			condition.setStatus(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.Conditions["+ i +"].Status"));
			condition.setReason(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.Conditions["+ i +"].Reason"));
			condition.setMessage(_ctx.stringValue("DescribeHubClusterDetailsResponse.Cluster.Conditions["+ i +"].Message"));

			conditions.add(condition);
		}
		cluster.setConditions(conditions);
		describeHubClusterDetailsResponse.setCluster(cluster);
	 
	 	return describeHubClusterDetailsResponse;
	}
}