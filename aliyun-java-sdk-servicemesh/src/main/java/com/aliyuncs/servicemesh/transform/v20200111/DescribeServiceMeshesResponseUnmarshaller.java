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

package com.aliyuncs.servicemesh.transform.v20200111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshesResponse;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshesResponse.ServiceMesh;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshesResponse.ServiceMesh.Endpoints;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshesResponse.ServiceMesh.ServiceMeshInfo;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshesResponse.ServiceMesh.Spec;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshesResponse.ServiceMesh.Spec.LoadBalancer;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshesResponse.ServiceMesh.Spec.MeshConfig;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshesResponse.ServiceMesh.Spec.MeshConfig.Pilot;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshesResponse.ServiceMesh.Spec.MeshConfig.SidecarInjector;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshesResponse.ServiceMesh.Spec.MeshConfig.SidecarInjector.InitCNIConfiguration;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshesResponse.ServiceMesh.Spec.Network;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServiceMeshesResponseUnmarshaller {

	public static DescribeServiceMeshesResponse unmarshall(DescribeServiceMeshesResponse describeServiceMeshesResponse, UnmarshallerContext _ctx) {
		
		describeServiceMeshesResponse.setRequestId(_ctx.stringValue("DescribeServiceMeshesResponse.RequestId"));

		List<ServiceMesh> serviceMeshes = new ArrayList<ServiceMesh>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServiceMeshesResponse.ServiceMeshes.Length"); i++) {
			ServiceMesh serviceMesh = new ServiceMesh();

			List<String> clusters = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Clusters.Length"); j++) {
				clusters.add(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Clusters["+ j +"]"));
			}
			serviceMesh.setClusters(clusters);

			Endpoints endpoints = new Endpoints();
			endpoints.setIntranetApiServerEndpoint(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Endpoints.IntranetApiServerEndpoint"));
			endpoints.setIntranetPilotEndpoint(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Endpoints.IntranetPilotEndpoint"));
			endpoints.setPublicApiServerEndpoint(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Endpoints.PublicApiServerEndpoint"));
			endpoints.setPublicPilotEndpoint(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Endpoints.PublicPilotEndpoint"));
			endpoints.setReverseTunnelEndpoint(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Endpoints.ReverseTunnelEndpoint"));
			serviceMesh.setEndpoints(endpoints);

			ServiceMeshInfo serviceMeshInfo = new ServiceMeshInfo();
			serviceMeshInfo.setCreationTime(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].ServiceMeshInfo.CreationTime"));
			serviceMeshInfo.setErrorMessage(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].ServiceMeshInfo.ErrorMessage"));
			serviceMeshInfo.setName(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].ServiceMeshInfo.Name"));
			serviceMeshInfo.setRegionId(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].ServiceMeshInfo.RegionId"));
			serviceMeshInfo.setServiceMeshId(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].ServiceMeshInfo.ServiceMeshId"));
			serviceMeshInfo.setState(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].ServiceMeshInfo.State"));
			serviceMeshInfo.setUpdateTime(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].ServiceMeshInfo.UpdateTime"));
			serviceMeshInfo.setVersion(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].ServiceMeshInfo.Version"));
			serviceMeshInfo.setProfile(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].ServiceMeshInfo.Profile"));
			serviceMesh.setServiceMeshInfo(serviceMeshInfo);

			Spec spec = new Spec();

			LoadBalancer loadBalancer = new LoadBalancer();
			loadBalancer.setApiServerLoadbalancerId(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.LoadBalancer.ApiServerLoadbalancerId"));
			loadBalancer.setApiServerPublicEip(_ctx.booleanValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.LoadBalancer.ApiServerPublicEip"));
			loadBalancer.setPilotPublicEip(_ctx.booleanValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.LoadBalancer.PilotPublicEip"));
			loadBalancer.setPilotPublicLoadbalancerId(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.LoadBalancer.PilotPublicLoadbalancerId"));
			spec.setLoadBalancer(loadBalancer);

			MeshConfig meshConfig = new MeshConfig();
			meshConfig.setMtls(_ctx.booleanValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.MeshConfig.Mtls"));
			meshConfig.setOutboundTrafficPolicy(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.MeshConfig.OutboundTrafficPolicy"));
			meshConfig.setStrictMtls(_ctx.booleanValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.MeshConfig.StrictMtls"));
			meshConfig.setTracing(_ctx.booleanValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.MeshConfig.Tracing"));
			meshConfig.setTelemetry(_ctx.booleanValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.MeshConfig.Telemetry"));

			Pilot pilot = new Pilot();
			pilot.setTraceSampling(_ctx.floatValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.MeshConfig.Pilot.TraceSampling"));
			pilot.setHttp10Enabled(_ctx.booleanValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.MeshConfig.Pilot.Http10Enabled"));
			meshConfig.setPilot(pilot);

			SidecarInjector sidecarInjector = new SidecarInjector();
			sidecarInjector.setEnableNamespacesByDefault(_ctx.booleanValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.MeshConfig.SidecarInjector.EnableNamespacesByDefault"));
			sidecarInjector.setAutoInjectionPolicyEnabled(_ctx.booleanValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.MeshConfig.SidecarInjector.AutoInjectionPolicyEnabled"));

			InitCNIConfiguration initCNIConfiguration = new InitCNIConfiguration();
			initCNIConfiguration.setEnabled(_ctx.booleanValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.MeshConfig.SidecarInjector.InitCNIConfiguration.Enabled"));
			initCNIConfiguration.setExcludeNamespaces(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.MeshConfig.SidecarInjector.InitCNIConfiguration.ExcludeNamespaces"));
			sidecarInjector.setInitCNIConfiguration(initCNIConfiguration);
			meshConfig.setSidecarInjector(sidecarInjector);
			spec.setMeshConfig(meshConfig);

			Network network = new Network();
			network.setSecurityGroupId(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.Network.SecurityGroupId"));
			network.setVpcId(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.Network.VpcId"));

			List<String> vSwitches = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.Network.VSwitches.Length"); j++) {
				vSwitches.add(_ctx.stringValue("DescribeServiceMeshesResponse.ServiceMeshes["+ i +"].Spec.Network.VSwitches["+ j +"]"));
			}
			network.setVSwitches(vSwitches);
			spec.setNetwork(network);
			serviceMesh.setSpec(spec);

			serviceMeshes.add(serviceMesh);
		}
		describeServiceMeshesResponse.setServiceMeshes(serviceMeshes);
	 
	 	return describeServiceMeshesResponse;
	}
}