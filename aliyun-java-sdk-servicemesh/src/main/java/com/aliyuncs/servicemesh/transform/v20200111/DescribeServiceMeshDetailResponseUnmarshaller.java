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

import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh.Endpoints;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh.ServiceMeshInfo;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh.Spec;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh.Spec.LoadBalancer;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.AccessLog;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Audit;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Kiali;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.MSE;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.OPA;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Pilot;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Prometheus;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.ProtocolSupport;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Proxy;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.SidecarInjector;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.SidecarInjector.InitCNIConfiguration;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.WebAssemblyFilterDeployment;
import com.aliyuncs.servicemesh.model.v20200111.DescribeServiceMeshDetailResponse.ServiceMesh.Spec.Network;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServiceMeshDetailResponseUnmarshaller {

	public static DescribeServiceMeshDetailResponse unmarshall(DescribeServiceMeshDetailResponse describeServiceMeshDetailResponse, UnmarshallerContext _ctx) {
		
		describeServiceMeshDetailResponse.setRequestId(_ctx.stringValue("DescribeServiceMeshDetailResponse.RequestId"));

		ServiceMesh serviceMesh = new ServiceMesh();

		List<String> clusters = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServiceMeshDetailResponse.ServiceMesh.Clusters.Length"); i++) {
			clusters.add(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Clusters["+ i +"]"));
		}
		serviceMesh.setClusters(clusters);

		Endpoints endpoints = new Endpoints();
		endpoints.setIntranetApiServerEndpoint(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Endpoints.IntranetApiServerEndpoint"));
		endpoints.setIntranetPilotEndpoint(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Endpoints.IntranetPilotEndpoint"));
		endpoints.setPublicApiServerEndpoint(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Endpoints.PublicApiServerEndpoint"));
		endpoints.setPublicPilotEndpoint(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Endpoints.PublicPilotEndpoint"));
		serviceMesh.setEndpoints(endpoints);

		ServiceMeshInfo serviceMeshInfo = new ServiceMeshInfo();
		serviceMeshInfo.setCreationTime(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.ServiceMeshInfo.CreationTime"));
		serviceMeshInfo.setErrorMessage(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.ServiceMeshInfo.ErrorMessage"));
		serviceMeshInfo.setName(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.ServiceMeshInfo.Name"));
		serviceMeshInfo.setRegionId(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.ServiceMeshInfo.RegionId"));
		serviceMeshInfo.setServiceMeshId(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.ServiceMeshInfo.ServiceMeshId"));
		serviceMeshInfo.setState(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.ServiceMeshInfo.State"));
		serviceMeshInfo.setUpdateTime(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.ServiceMeshInfo.UpdateTime"));
		serviceMeshInfo.setVersion(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.ServiceMeshInfo.Version"));
		serviceMeshInfo.setProfile(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.ServiceMeshInfo.Profile"));
		serviceMesh.setServiceMeshInfo(serviceMeshInfo);

		Spec spec = new Spec();

		LoadBalancer loadBalancer = new LoadBalancer();
		loadBalancer.setApiServerLoadbalancerId(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.LoadBalancer.ApiServerLoadbalancerId"));
		loadBalancer.setApiServerPublicEip(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.LoadBalancer.ApiServerPublicEip"));
		loadBalancer.setPilotPublicEip(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.LoadBalancer.PilotPublicEip"));
		loadBalancer.setPilotPublicLoadbalancerId(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.LoadBalancer.PilotPublicLoadbalancerId"));
		spec.setLoadBalancer(loadBalancer);

		MeshConfig meshConfig = new MeshConfig();
		meshConfig.setEnableLocalityLB(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.EnableLocalityLB"));
		meshConfig.setTelemetry(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Telemetry"));
		meshConfig.setTracing(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Tracing"));
		meshConfig.setCustomizedZipkin(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.CustomizedZipkin"));
		meshConfig.setOutboundTrafficPolicy(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.OutboundTrafficPolicy"));
		meshConfig.setIncludeIPRanges(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.IncludeIPRanges"));
		meshConfig.setEdition(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Edition"));

		Pilot pilot = new Pilot();
		pilot.setTraceSampling(_ctx.floatValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Pilot.TraceSampling"));
		pilot.setHttp10Enabled(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Pilot.Http10Enabled"));
		meshConfig.setPilot(pilot);

		OPA oPA = new OPA();
		oPA.setEnabled(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.OPA.Enabled"));
		oPA.setLogLevel(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.OPA.LogLevel"));
		oPA.setRequestCPU(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.OPA.RequestCPU"));
		oPA.setRequestMemory(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.OPA.RequestMemory"));
		oPA.setLimitCPU(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.OPA.LimitCPU"));
		oPA.setLimitMemory(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.OPA.LimitMemory"));
		meshConfig.setOPA(oPA);

		Audit audit = new Audit();
		audit.setEnabled(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Audit.Enabled"));
		audit.setProject(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Audit.Project"));
		meshConfig.setAudit(audit);

		Proxy proxy = new Proxy();
		proxy.setClusterDomain(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Proxy.ClusterDomain"));
		proxy.setRequestCPU(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Proxy.RequestCPU"));
		proxy.setRequestMemory(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Proxy.RequestMemory"));
		proxy.setLimitCPU(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Proxy.LimitCPU"));
		proxy.setLimitMemory(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Proxy.LimitMemory"));
		proxy.setEnableDNSProxying(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Proxy.EnableDNSProxying"));
		meshConfig.setProxy(proxy);

		SidecarInjector sidecarInjector = new SidecarInjector();
		sidecarInjector.setEnableNamespacesByDefault(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.SidecarInjector.EnableNamespacesByDefault"));
		sidecarInjector.setAutoInjectionPolicyEnabled(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.SidecarInjector.AutoInjectionPolicyEnabled"));
		sidecarInjector.setRequestCPU(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.SidecarInjector.RequestCPU"));
		sidecarInjector.setRequestMemory(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.SidecarInjector.RequestMemory"));
		sidecarInjector.setLimitCPU(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.SidecarInjector.LimitCPU"));
		sidecarInjector.setLimitMemory(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.SidecarInjector.LimitMemory"));
		sidecarInjector.setSidecarInjectorWebhookAsYaml(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.SidecarInjector.SidecarInjectorWebhookAsYaml"));

		InitCNIConfiguration initCNIConfiguration = new InitCNIConfiguration();
		initCNIConfiguration.setEnabled(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.SidecarInjector.InitCNIConfiguration.Enabled"));
		initCNIConfiguration.setExcludeNamespaces(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.SidecarInjector.InitCNIConfiguration.ExcludeNamespaces"));
		sidecarInjector.setInitCNIConfiguration(initCNIConfiguration);
		meshConfig.setSidecarInjector(sidecarInjector);

		Kiali kiali = new Kiali();
		kiali.setEnabled(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Kiali.Enabled"));
		kiali.setUrl(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Kiali.Url"));
		meshConfig.setKiali(kiali);

		Prometheus prometheus = new Prometheus();
		prometheus.setUseExternal(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Prometheus.UseExternal"));
		prometheus.setExternalUrl(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.Prometheus.ExternalUrl"));
		meshConfig.setPrometheus(prometheus);

		AccessLog accessLog = new AccessLog();
		accessLog.setEnabled(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.AccessLog.Enabled"));
		meshConfig.setAccessLog(accessLog);

		WebAssemblyFilterDeployment webAssemblyFilterDeployment = new WebAssemblyFilterDeployment();
		webAssemblyFilterDeployment.setEnabled(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.WebAssemblyFilterDeployment.Enabled"));
		meshConfig.setWebAssemblyFilterDeployment(webAssemblyFilterDeployment);

		ProtocolSupport protocolSupport = new ProtocolSupport();
		protocolSupport.setRedisFilterEnabled(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.ProtocolSupport.RedisFilterEnabled"));
		protocolSupport.setMysqlFilterEnabled(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.ProtocolSupport.MysqlFilterEnabled"));
		protocolSupport.setThriftFilterEnabled(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.ProtocolSupport.ThriftFilterEnabled"));
		meshConfig.setProtocolSupport(protocolSupport);

		MSE mSE = new MSE();
		mSE.setEnabled(_ctx.booleanValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.MeshConfig.MSE.Enabled"));
		meshConfig.setMSE(mSE);
		spec.setMeshConfig(meshConfig);

		Network network = new Network();
		network.setSecurityGroupId(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.Network.SecurityGroupId"));
		network.setVpcId(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.Network.VpcId"));

		List<String> vSwitches = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.Network.VSwitches.Length"); i++) {
			vSwitches.add(_ctx.stringValue("DescribeServiceMeshDetailResponse.ServiceMesh.Spec.Network.VSwitches["+ i +"]"));
		}
		network.setVSwitches(vSwitches);
		spec.setNetwork(network);
		serviceMesh.setSpec(spec);
		describeServiceMeshDetailResponse.setServiceMesh(serviceMesh);
	 
	 	return describeServiceMeshDetailResponse;
	}
}