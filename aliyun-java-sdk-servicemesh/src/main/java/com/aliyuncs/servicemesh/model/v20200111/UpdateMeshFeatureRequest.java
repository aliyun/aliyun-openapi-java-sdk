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
public class UpdateMeshFeatureRequest extends RpcAcsRequest<UpdateMeshFeatureResponse> {
	   

	private String proxyRequestCPU;

	private String oPALimitCPU;

	private Boolean openAgentPolicy;

	private Boolean opaEnabled;

	private Boolean mSEEnabled;

	private String proxyLimitMemory;

	private Boolean customizedPrometheus;

	private String cniExcludeNamespaces;

	private Boolean accessLogEnabled;

	private String oPALogLevel;

	private Boolean redisFilterEnabled;

	private Boolean customizedZipkin;

	private String sidecarInjectorRequestCPU;

	private Boolean cniEnabled;

	private Boolean tracing;

	private String includeIPRanges;

	private String oPALimitMemory;

	private String prometheusUrl;

	private String proxyLimitCPU;

	private String proxyRequestMemory;

	private Boolean thriftFilterEnabled;

	private Boolean telemetry;

	private Boolean webAssemblyFilterEnabled;

	private String oPARequestCPU;

	private String sidecarInjectorWebhookAsYaml;

	private String oPARequestMemory;

	private Boolean autoInjectionPolicyEnabled;

	private String sidecarInjectorLimitMemory;

	private Boolean enableAudit;

	private String clusterDomain;

	private String sidecarInjectorRequestMemory;

	private String serviceMeshId;

	private Boolean localityLoadBalancing;

	private String sidecarInjectorLimitCPU;

	private Boolean dNSProxyingEnabled;

	private Float traceSampling;

	private Boolean mysqlFilterEnabled;

	private Boolean http10Enabled;

	private Boolean kialiEnabled;

	private String auditProject;

	private String outboundTrafficPolicy;

	private Boolean enableNamespacesByDefault;
	public UpdateMeshFeatureRequest() {
		super("servicemesh", "2020-01-11", "UpdateMeshFeature", "servicemesh");
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

	public Boolean getMSEEnabled() {
		return this.mSEEnabled;
	}

	public void setMSEEnabled(Boolean mSEEnabled) {
		this.mSEEnabled = mSEEnabled;
		if(mSEEnabled != null){
			putBodyParameter("MSEEnabled", mSEEnabled.toString());
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

	public String getCniExcludeNamespaces() {
		return this.cniExcludeNamespaces;
	}

	public void setCniExcludeNamespaces(String cniExcludeNamespaces) {
		this.cniExcludeNamespaces = cniExcludeNamespaces;
		if(cniExcludeNamespaces != null){
			putBodyParameter("CniExcludeNamespaces", cniExcludeNamespaces);
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

	public Boolean getRedisFilterEnabled() {
		return this.redisFilterEnabled;
	}

	public void setRedisFilterEnabled(Boolean redisFilterEnabled) {
		this.redisFilterEnabled = redisFilterEnabled;
		if(redisFilterEnabled != null){
			putBodyParameter("RedisFilterEnabled", redisFilterEnabled.toString());
		}
	}

	public Boolean getCustomizedZipkin() {
		return this.customizedZipkin;
	}

	public void setCustomizedZipkin(Boolean customizedZipkin) {
		this.customizedZipkin = customizedZipkin;
		if(customizedZipkin != null){
			putBodyParameter("CustomizedZipkin", customizedZipkin.toString());
		}
	}

	public String getSidecarInjectorRequestCPU() {
		return this.sidecarInjectorRequestCPU;
	}

	public void setSidecarInjectorRequestCPU(String sidecarInjectorRequestCPU) {
		this.sidecarInjectorRequestCPU = sidecarInjectorRequestCPU;
		if(sidecarInjectorRequestCPU != null){
			putBodyParameter("SidecarInjectorRequestCPU", sidecarInjectorRequestCPU);
		}
	}

	public Boolean getCniEnabled() {
		return this.cniEnabled;
	}

	public void setCniEnabled(Boolean cniEnabled) {
		this.cniEnabled = cniEnabled;
		if(cniEnabled != null){
			putBodyParameter("CniEnabled", cniEnabled.toString());
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

	public Boolean getThriftFilterEnabled() {
		return this.thriftFilterEnabled;
	}

	public void setThriftFilterEnabled(Boolean thriftFilterEnabled) {
		this.thriftFilterEnabled = thriftFilterEnabled;
		if(thriftFilterEnabled != null){
			putBodyParameter("ThriftFilterEnabled", thriftFilterEnabled.toString());
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

	public Boolean getWebAssemblyFilterEnabled() {
		return this.webAssemblyFilterEnabled;
	}

	public void setWebAssemblyFilterEnabled(Boolean webAssemblyFilterEnabled) {
		this.webAssemblyFilterEnabled = webAssemblyFilterEnabled;
		if(webAssemblyFilterEnabled != null){
			putBodyParameter("WebAssemblyFilterEnabled", webAssemblyFilterEnabled.toString());
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

	public String getSidecarInjectorWebhookAsYaml() {
		return this.sidecarInjectorWebhookAsYaml;
	}

	public void setSidecarInjectorWebhookAsYaml(String sidecarInjectorWebhookAsYaml) {
		this.sidecarInjectorWebhookAsYaml = sidecarInjectorWebhookAsYaml;
		if(sidecarInjectorWebhookAsYaml != null){
			putBodyParameter("SidecarInjectorWebhookAsYaml", sidecarInjectorWebhookAsYaml);
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

	public Boolean getAutoInjectionPolicyEnabled() {
		return this.autoInjectionPolicyEnabled;
	}

	public void setAutoInjectionPolicyEnabled(Boolean autoInjectionPolicyEnabled) {
		this.autoInjectionPolicyEnabled = autoInjectionPolicyEnabled;
		if(autoInjectionPolicyEnabled != null){
			putBodyParameter("AutoInjectionPolicyEnabled", autoInjectionPolicyEnabled.toString());
		}
	}

	public String getSidecarInjectorLimitMemory() {
		return this.sidecarInjectorLimitMemory;
	}

	public void setSidecarInjectorLimitMemory(String sidecarInjectorLimitMemory) {
		this.sidecarInjectorLimitMemory = sidecarInjectorLimitMemory;
		if(sidecarInjectorLimitMemory != null){
			putBodyParameter("SidecarInjectorLimitMemory", sidecarInjectorLimitMemory);
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

	public String getClusterDomain() {
		return this.clusterDomain;
	}

	public void setClusterDomain(String clusterDomain) {
		this.clusterDomain = clusterDomain;
		if(clusterDomain != null){
			putBodyParameter("ClusterDomain", clusterDomain);
		}
	}

	public String getSidecarInjectorRequestMemory() {
		return this.sidecarInjectorRequestMemory;
	}

	public void setSidecarInjectorRequestMemory(String sidecarInjectorRequestMemory) {
		this.sidecarInjectorRequestMemory = sidecarInjectorRequestMemory;
		if(sidecarInjectorRequestMemory != null){
			putBodyParameter("SidecarInjectorRequestMemory", sidecarInjectorRequestMemory);
		}
	}

	public String getServiceMeshId() {
		return this.serviceMeshId;
	}

	public void setServiceMeshId(String serviceMeshId) {
		this.serviceMeshId = serviceMeshId;
		if(serviceMeshId != null){
			putBodyParameter("ServiceMeshId", serviceMeshId);
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

	public String getSidecarInjectorLimitCPU() {
		return this.sidecarInjectorLimitCPU;
	}

	public void setSidecarInjectorLimitCPU(String sidecarInjectorLimitCPU) {
		this.sidecarInjectorLimitCPU = sidecarInjectorLimitCPU;
		if(sidecarInjectorLimitCPU != null){
			putBodyParameter("SidecarInjectorLimitCPU", sidecarInjectorLimitCPU);
		}
	}

	public Boolean getDNSProxyingEnabled() {
		return this.dNSProxyingEnabled;
	}

	public void setDNSProxyingEnabled(Boolean dNSProxyingEnabled) {
		this.dNSProxyingEnabled = dNSProxyingEnabled;
		if(dNSProxyingEnabled != null){
			putBodyParameter("DNSProxyingEnabled", dNSProxyingEnabled.toString());
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

	public Boolean getMysqlFilterEnabled() {
		return this.mysqlFilterEnabled;
	}

	public void setMysqlFilterEnabled(Boolean mysqlFilterEnabled) {
		this.mysqlFilterEnabled = mysqlFilterEnabled;
		if(mysqlFilterEnabled != null){
			putBodyParameter("MysqlFilterEnabled", mysqlFilterEnabled.toString());
		}
	}

	public Boolean getHttp10Enabled() {
		return this.http10Enabled;
	}

	public void setHttp10Enabled(Boolean http10Enabled) {
		this.http10Enabled = http10Enabled;
		if(http10Enabled != null){
			putBodyParameter("Http10Enabled", http10Enabled.toString());
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

	public String getAuditProject() {
		return this.auditProject;
	}

	public void setAuditProject(String auditProject) {
		this.auditProject = auditProject;
		if(auditProject != null){
			putBodyParameter("AuditProject", auditProject);
		}
	}

	public String getOutboundTrafficPolicy() {
		return this.outboundTrafficPolicy;
	}

	public void setOutboundTrafficPolicy(String outboundTrafficPolicy) {
		this.outboundTrafficPolicy = outboundTrafficPolicy;
		if(outboundTrafficPolicy != null){
			putBodyParameter("OutboundTrafficPolicy", outboundTrafficPolicy);
		}
	}

	public Boolean getEnableNamespacesByDefault() {
		return this.enableNamespacesByDefault;
	}

	public void setEnableNamespacesByDefault(Boolean enableNamespacesByDefault) {
		this.enableNamespacesByDefault = enableNamespacesByDefault;
		if(enableNamespacesByDefault != null){
			putBodyParameter("EnableNamespacesByDefault", enableNamespacesByDefault.toString());
		}
	}

	@Override
	public Class<UpdateMeshFeatureResponse> getResponseClass() {
		return UpdateMeshFeatureResponse.class;
	}

}
