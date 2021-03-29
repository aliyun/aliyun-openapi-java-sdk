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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InsertApplicationRequest extends RoaAcsRequest<InsertApplicationResponse> {
	   

	private String webContainer;

	private String ecuInfo;

	private Integer minHeapSize;

	private Integer buildPackId;

	private String componentIds;

	private String healthCheckUrl;

	private String reservedPortStr;

	private String jvmOptions;

	private String description;

	private Integer cpu;

	private Integer maxPermSize;

	private String clusterId;

	private Integer maxHeapSize;

	private Boolean enablePortCheck;

	private String applicationName;

	private String jdk;

	private Integer mem;

	private String logicalRegionId;

	private Boolean enableUrlCheck;

	private String packageType;

	private String hooks;
	public InsertApplicationRequest() {
		super("Edas", "2017-08-01", "InsertApplication", "Edas");
		setUriPattern("/pop/v5/changeorder/co_create_app");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWebContainer() {
		return this.webContainer;
	}

	public void setWebContainer(String webContainer) {
		this.webContainer = webContainer;
		if(webContainer != null){
			putQueryParameter("WebContainer", webContainer);
		}
	}

	public String getEcuInfo() {
		return this.ecuInfo;
	}

	public void setEcuInfo(String ecuInfo) {
		this.ecuInfo = ecuInfo;
		if(ecuInfo != null){
			putQueryParameter("EcuInfo", ecuInfo);
		}
	}

	public Integer getMinHeapSize() {
		return this.minHeapSize;
	}

	public void setMinHeapSize(Integer minHeapSize) {
		this.minHeapSize = minHeapSize;
		if(minHeapSize != null){
			putQueryParameter("MinHeapSize", minHeapSize.toString());
		}
	}

	public Integer getBuildPackId() {
		return this.buildPackId;
	}

	public void setBuildPackId(Integer buildPackId) {
		this.buildPackId = buildPackId;
		if(buildPackId != null){
			putQueryParameter("BuildPackId", buildPackId.toString());
		}
	}

	public String getComponentIds() {
		return this.componentIds;
	}

	public void setComponentIds(String componentIds) {
		this.componentIds = componentIds;
		if(componentIds != null){
			putQueryParameter("ComponentIds", componentIds);
		}
	}

	public String getHealthCheckUrl() {
		return this.healthCheckUrl;
	}

	public void setHealthCheckUrl(String healthCheckUrl) {
		this.healthCheckUrl = healthCheckUrl;
		if(healthCheckUrl != null){
			putQueryParameter("HealthCheckUrl", healthCheckUrl);
		}
	}

	public String getReservedPortStr() {
		return this.reservedPortStr;
	}

	public void setReservedPortStr(String reservedPortStr) {
		this.reservedPortStr = reservedPortStr;
		if(reservedPortStr != null){
			putQueryParameter("ReservedPortStr", reservedPortStr);
		}
	}

	public String getJvmOptions() {
		return this.jvmOptions;
	}

	public void setJvmOptions(String jvmOptions) {
		this.jvmOptions = jvmOptions;
		if(jvmOptions != null){
			putQueryParameter("JvmOptions", jvmOptions);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Integer getCpu() {
		return this.cpu;
	}

	public void setCpu(Integer cpu) {
		this.cpu = cpu;
		if(cpu != null){
			putQueryParameter("Cpu", cpu.toString());
		}
	}

	public Integer getMaxPermSize() {
		return this.maxPermSize;
	}

	public void setMaxPermSize(Integer maxPermSize) {
		this.maxPermSize = maxPermSize;
		if(maxPermSize != null){
			putQueryParameter("MaxPermSize", maxPermSize.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public Integer getMaxHeapSize() {
		return this.maxHeapSize;
	}

	public void setMaxHeapSize(Integer maxHeapSize) {
		this.maxHeapSize = maxHeapSize;
		if(maxHeapSize != null){
			putQueryParameter("MaxHeapSize", maxHeapSize.toString());
		}
	}

	public Boolean getEnablePortCheck() {
		return this.enablePortCheck;
	}

	public void setEnablePortCheck(Boolean enablePortCheck) {
		this.enablePortCheck = enablePortCheck;
		if(enablePortCheck != null){
			putQueryParameter("EnablePortCheck", enablePortCheck.toString());
		}
	}

	public String getApplicationName() {
		return this.applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
		if(applicationName != null){
			putQueryParameter("ApplicationName", applicationName);
		}
	}

	public String getJdk() {
		return this.jdk;
	}

	public void setJdk(String jdk) {
		this.jdk = jdk;
		if(jdk != null){
			putQueryParameter("Jdk", jdk);
		}
	}

	public Integer getMem() {
		return this.mem;
	}

	public void setMem(Integer mem) {
		this.mem = mem;
		if(mem != null){
			putQueryParameter("Mem", mem.toString());
		}
	}

	public String getLogicalRegionId() {
		return this.logicalRegionId;
	}

	public void setLogicalRegionId(String logicalRegionId) {
		this.logicalRegionId = logicalRegionId;
		if(logicalRegionId != null){
			putQueryParameter("LogicalRegionId", logicalRegionId);
		}
	}

	public Boolean getEnableUrlCheck() {
		return this.enableUrlCheck;
	}

	public void setEnableUrlCheck(Boolean enableUrlCheck) {
		this.enableUrlCheck = enableUrlCheck;
		if(enableUrlCheck != null){
			putQueryParameter("EnableUrlCheck", enableUrlCheck.toString());
		}
	}

	public String getPackageType() {
		return this.packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
		if(packageType != null){
			putQueryParameter("PackageType", packageType);
		}
	}

	public String getHooks() {
		return this.hooks;
	}

	public void setHooks(String hooks) {
		this.hooks = hooks;
		if(hooks != null){
			putQueryParameter("Hooks", hooks);
		}
	}

	@Override
	public Class<InsertApplicationResponse> getResponseClass() {
		return InsertApplicationResponse.class;
	}

}
