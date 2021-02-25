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

package com.aliyuncs.servicemesh.model.v20200111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.servicemesh.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateServiceMeshRequest extends RpcAcsRequest<CreateServiceMeshResponse> {
	   

	private String proxyRequestCPU;

	private String oPALimitCPU;

	private Boolean openAgentPolicy;

	private Boolean opaEnabled;

	private String proxyLimitMemory;

	private Boolean customizedPrometheus;

	private Boolean accessLogEnabled;

	private String oPALogLevel;

	private String excludeIPRanges;

	private String istioVersion;

	private Boolean tracing;

	private String includeIPRanges;

	private String excludeInboundPorts;

	private String oPALimitMemory;

	private String prometheusUrl;

	private String vSwitches;

	private String proxyLimitCPU;

	private String proxyRequestMemory;

	private String name;

	private Boolean telemetry;

	private String oPARequestCPU;

	private String oPARequestMemory;

	private Boolean enableAudit;

	private Boolean localityLoadBalancing;

	private Boolean apiServerPublicEip;

	private Float traceSampling;

	private Boolean kialiEnabled;

	private Boolean pilotPublicEip;

	private String auditProject;

	private String vpcId;

	private String excludeOutboundPorts;
	public CreateServiceMeshRequest() {
		super("servicemesh", "2020-01-11", "CreateServiceMesh", "servicemesh");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProxyRequestCPU() {
		return this.proxyRequestCPU;
	}

	public void setProxyRequestCPU(String proxyRequestCPU) {
		this.proxyRequestCPU = proxyRequestCPU;
		if(proxyRequestCPU != null){
			putBodyParameter("ProxyRequestCPU", proxyRequestCPU);
		}
	}

	public String getOPALimitCPU() {
		return this.oPALimitCPU;
	}

	public void setOPALimitCPU(String oPALimitCPU) {
		this.oPALimitCPU = oPALimitCPU;
		if(oPALimitCPU != null){
			putBodyParameter("OPALimitCPU", oPALimitCPU);
		}
	}

	public Boolean getOpenAgentPolicy() {
		return this.openAgentPolicy;
	}

	public void setOpenAgentPolicy(Boolean openAgentPolicy) {
		this.openAgentPolicy = openAgentPolicy;
		if(openAgentPolicy != null){
			putBodyParameter("OpenAgentPolicy", openAgentPolicy.toString());
		}
	}

	public Boolean getOpaEnabled() {
		return this.opaEnabled;
	}

	public void setOpaEnabled(Boolean opaEnabled) {
		this.opaEnabled = opaEnabled;
		if(opaEnabled != null){
			putBodyParameter("OpaEnabled", opaEnabled.toString());
		}
	}

	public String getProxyLimitMemory() {
		return this.proxyLimitMemory;
	}

	public void setProxyLimitMemory(String proxyLimitMemory) {
		this.proxyLimitMemory = proxyLimitMemory;
		if(proxyLimitMemory != null){
			putBodyParameter("ProxyLimitMemory", proxyLimitMemory);
		}
	}

	public Boolean getCustomizedPrometheus() {
		return this.customizedPrometheus;
	}

	public void setCustomizedPrometheus(Boolean customizedPrometheus) {
		this.customizedPrometheus = customizedPrometheus;
		if(customizedPrometheus != null){
			putBodyParameter("CustomizedPrometheus", customizedPrometheus.toString());
		}
	}

	public Boolean getAccessLogEnabled() {
		return this.accessLogEnabled;
	}

	public void setAccessLogEnabled(Boolean accessLogEnabled) {
		this.accessLogEnabled = accessLogEnabled;
		if(accessLogEnabled != null){
			putBodyParameter("AccessLogEnabled", accessLogEnabled.toString());
		}
	}

	public String getOPALogLevel() {
		return this.oPALogLevel;
	}

	public void setOPALogLevel(String oPALogLevel) {
		this.oPALogLevel = oPALogLevel;
		if(oPALogLevel != null){
			putBodyParameter("OPALogLevel", oPALogLevel);
		}
	}

	public String getExcludeIPRanges() {
		return this.excludeIPRanges;
	}

	public void setExcludeIPRanges(String excludeIPRanges) {
		this.excludeIPRanges = excludeIPRanges;
		if(excludeIPRanges != null){
			putBodyParameter("ExcludeIPRanges", excludeIPRanges);
		}
	}

	public String getIstioVersion() {
		return this.istioVersion;
	}

	public void setIstioVersion(String istioVersion) {
		this.istioVersion = istioVersion;
		if(istioVersion != null){
			putBodyParameter("IstioVersion", istioVersion);
		}
	}

	public Boolean getTracing() {
		return this.tracing;
	}

	public void setTracing(Boolean tracing) {
		this.tracing = tracing;
		if(tracing != null){
			putBodyParameter("Tracing", tracing.toString());
		}
	}

	public String getIncludeIPRanges() {
		return this.includeIPRanges;
	}

	public void setIncludeIPRanges(String includeIPRanges) {
		this.includeIPRanges = includeIPRanges;
		if(includeIPRanges != null){
			putBodyParameter("IncludeIPRanges", includeIPRanges);
		}
	}

	public String getExcludeInboundPorts() {
		return this.excludeInboundPorts;
	}

	public void setExcludeInboundPorts(String excludeInboundPorts) {
		this.excludeInboundPorts = excludeInboundPorts;
		if(excludeInboundPorts != null){
			putBodyParameter("ExcludeInboundPorts", excludeInboundPorts);
		}
	}

	public String getOPALimitMemory() {
		return this.oPALimitMemory;
	}

	public void setOPALimitMemory(String oPALimitMemory) {
		this.oPALimitMemory = oPALimitMemory;
		if(oPALimitMemory != null){
			putBodyParameter("OPALimitMemory", oPALimitMemory);
		}
	}

	public String getPrometheusUrl() {
		return this.prometheusUrl;
	}

	public void setPrometheusUrl(String prometheusUrl) {
		this.prometheusUrl = prometheusUrl;
		if(prometheusUrl != null){
			putBodyParameter("PrometheusUrl", prometheusUrl);
		}
	}

	public String getVSwitches() {
		return this.vSwitches;
	}

	public void setVSwitches(String vSwitches) {
		this.vSwitches = vSwitches;
		if(vSwitches != null){
			putBodyParameter("VSwitches", vSwitches);
		}
	}

	public String getProxyLimitCPU() {
		return this.proxyLimitCPU;
	}

	public void setProxyLimitCPU(String proxyLimitCPU) {
		this.proxyLimitCPU = proxyLimitCPU;
		if(proxyLimitCPU != null){
			putBodyParameter("ProxyLimitCPU", proxyLimitCPU);
		}
	}

	public String getProxyRequestMemory() {
		return this.proxyRequestMemory;
	}

	public void setProxyRequestMemory(String proxyRequestMemory) {
		this.proxyRequestMemory = proxyRequestMemory;
		if(proxyRequestMemory != null){
			putBodyParameter("ProxyRequestMemory", proxyRequestMemory);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public Boolean getTelemetry() {
		return this.telemetry;
	}

	public void setTelemetry(Boolean telemetry) {
		this.telemetry = telemetry;
		if(telemetry != null){
			putBodyParameter("Telemetry", telemetry.toString());
		}
	}

	public String getOPARequestCPU() {
		return this.oPARequestCPU;
	}

	public void setOPARequestCPU(String oPARequestCPU) {
		this.oPARequestCPU = oPARequestCPU;
		if(oPARequestCPU != null){
			putBodyParameter("OPARequestCPU", oPARequestCPU);
		}
	}

	public String getOPARequestMemory() {
		return this.oPARequestMemory;
	}

	public void setOPARequestMemory(String oPARequestMemory) {
		this.oPARequestMemory = oPARequestMemory;
		if(oPARequestMemory != null){
			putBodyParameter("OPARequestMemory", oPARequestMemory);
		}
	}

	public Boolean getEnableAudit() {
		return this.enableAudit;
	}

	public void setEnableAudit(Boolean enableAudit) {
		this.enableAudit = enableAudit;
		if(enableAudit != null){
			putBodyParameter("EnableAudit", enableAudit.toString());
		}
	}

	public Boolean getLocalityLoadBalancing() {
		return this.localityLoadBalancing;
	}

	public void setLocalityLoadBalancing(Boolean localityLoadBalancing) {
		this.localityLoadBalancing = localityLoadBalancing;
		if(localityLoadBalancing != null){
			putBodyParameter("LocalityLoadBalancing", localityLoadBalancing.toString());
		}
	}

	public Boolean getApiServerPublicEip() {
		return this.apiServerPublicEip;
	}

	public void setApiServerPublicEip(Boolean apiServerPublicEip) {
		this.apiServerPublicEip = apiServerPublicEip;
		if(apiServerPublicEip != null){
			putBodyParameter("ApiServerPublicEip", apiServerPublicEip.toString());
		}
	}

	public Float getTraceSampling() {
		return this.traceSampling;
	}

	public void setTraceSampling(Float traceSampling) {
		this.traceSampling = traceSampling;
		if(traceSampling != null){
			putBodyParameter("TraceSampling", traceSampling.toString());
		}
	}

	public Boolean getKialiEnabled() {
		return this.kialiEnabled;
	}

	public void setKialiEnabled(Boolean kialiEnabled) {
		this.kialiEnabled = kialiEnabled;
		if(kialiEnabled != null){
			putBodyParameter("KialiEnabled", kialiEnabled.toString());
		}
	}

	public Boolean getPilotPublicEip() {
		return this.pilotPublicEip;
	}

	public void setPilotPublicEip(Boolean pilotPublicEip) {
		this.pilotPublicEip = pilotPublicEip;
		if(pilotPublicEip != null){
			putBodyParameter("PilotPublicEip", pilotPublicEip.toString());
		}
	}

	public String getAuditProject() {
		return this.auditProject;
	}

	public void setAuditProject(String auditProject) {
		this.auditProject = auditProject;
		if(auditProject != null){
			putBodyParameter("AuditProject", auditProject);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putBodyParameter("VpcId", vpcId);
		}
	}

	public String getExcludeOutboundPorts() {
		return this.excludeOutboundPorts;
	}

	public void setExcludeOutboundPorts(String excludeOutboundPorts) {
		this.excludeOutboundPorts = excludeOutboundPorts;
		if(excludeOutboundPorts != null){
			putBodyParameter("ExcludeOutboundPorts", excludeOutboundPorts);
		}
	}

	@Override
	public Class<CreateServiceMeshResponse> getResponseClass() {
		return CreateServiceMeshResponse.class;
	}

}
