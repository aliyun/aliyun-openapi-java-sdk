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
public class DeployK8sApplicationRequest extends RoaAcsRequest<DeployK8sApplicationResponse> {
	   

	private String nasId;

	private String packageVersionId;

	private Integer batchWaitTime;

	private String envs;

	private Integer cpuLimit;

	private String storageType;

	private String configMountDescs;

	private Integer memoryLimit;

	private String imageTag;

	private String deployAcrossZones;

	private String deployAcrossNodes;

	private Integer memoryRequest;

	private String image;

	private String preStop;

	private String localVolume;

	private String updateStrategy;

	private Boolean useBodyEncoding;

	private String changeOrderDesc;

	private String emptyDirs;

	private Integer mcpuLimit;

	private String runtimeClassName;

	private String trafficControlStrategy;

	private String postStart;

	private String customAffinity;

	private String webContainer;

	private Boolean enableAhas;

	private String slsConfigs;

	private String readiness;

	private String liveness;

	private String packageVersion;

	private String envFroms;

	private String edasContainerVersion;

	private String packageUrl;

	private String mountDescs;

	private Integer replicas;

	private String customTolerations;

	private Integer cpuRequest;

	private String webContainerConfig;

	private String command;

	private String args;

	private String jDK;

	private String uriEncoding;

	private String appId;

	private Integer batchTimeout;

	private String pvcMountDescs;

	private Integer mcpuRequest;

	private String volumesStr;

	private String javaStartUpConfig;
	public DeployK8sApplicationRequest() {
		super("Edas", "2017-08-01", "DeployK8sApplication", "Edas");
		setUriPattern("/pop/v5/k8s/acs/k8s_apps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNasId() {
		return this.nasId;
	}

	public void setNasId(String nasId) {
		this.nasId = nasId;
		if(nasId != null){
			putQueryParameter("NasId", nasId);
		}
	}

	public String getPackageVersionId() {
		return this.packageVersionId;
	}

	public void setPackageVersionId(String packageVersionId) {
		this.packageVersionId = packageVersionId;
		if(packageVersionId != null){
			putQueryParameter("PackageVersionId", packageVersionId);
		}
	}

	public Integer getBatchWaitTime() {
		return this.batchWaitTime;
	}

	public void setBatchWaitTime(Integer batchWaitTime) {
		this.batchWaitTime = batchWaitTime;
		if(batchWaitTime != null){
			putQueryParameter("BatchWaitTime", batchWaitTime.toString());
		}
	}

	public String getEnvs() {
		return this.envs;
	}

	public void setEnvs(String envs) {
		this.envs = envs;
		if(envs != null){
			putQueryParameter("Envs", envs);
		}
	}

	public Integer getCpuLimit() {
		return this.cpuLimit;
	}

	public void setCpuLimit(Integer cpuLimit) {
		this.cpuLimit = cpuLimit;
		if(cpuLimit != null){
			putQueryParameter("CpuLimit", cpuLimit.toString());
		}
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
		if(storageType != null){
			putQueryParameter("StorageType", storageType);
		}
	}

	public String getConfigMountDescs() {
		return this.configMountDescs;
	}

	public void setConfigMountDescs(String configMountDescs) {
		this.configMountDescs = configMountDescs;
		if(configMountDescs != null){
			putQueryParameter("ConfigMountDescs", configMountDescs);
		}
	}

	public Integer getMemoryLimit() {
		return this.memoryLimit;
	}

	public void setMemoryLimit(Integer memoryLimit) {
		this.memoryLimit = memoryLimit;
		if(memoryLimit != null){
			putQueryParameter("MemoryLimit", memoryLimit.toString());
		}
	}

	public String getImageTag() {
		return this.imageTag;
	}

	public void setImageTag(String imageTag) {
		this.imageTag = imageTag;
		if(imageTag != null){
			putQueryParameter("ImageTag", imageTag);
		}
	}

	public String getDeployAcrossZones() {
		return this.deployAcrossZones;
	}

	public void setDeployAcrossZones(String deployAcrossZones) {
		this.deployAcrossZones = deployAcrossZones;
		if(deployAcrossZones != null){
			putQueryParameter("DeployAcrossZones", deployAcrossZones);
		}
	}

	public String getDeployAcrossNodes() {
		return this.deployAcrossNodes;
	}

	public void setDeployAcrossNodes(String deployAcrossNodes) {
		this.deployAcrossNodes = deployAcrossNodes;
		if(deployAcrossNodes != null){
			putQueryParameter("DeployAcrossNodes", deployAcrossNodes);
		}
	}

	public Integer getMemoryRequest() {
		return this.memoryRequest;
	}

	public void setMemoryRequest(Integer memoryRequest) {
		this.memoryRequest = memoryRequest;
		if(memoryRequest != null){
			putQueryParameter("MemoryRequest", memoryRequest.toString());
		}
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
		if(image != null){
			putQueryParameter("Image", image);
		}
	}

	public String getPreStop() {
		return this.preStop;
	}

	public void setPreStop(String preStop) {
		this.preStop = preStop;
		if(preStop != null){
			putQueryParameter("PreStop", preStop);
		}
	}

	public String getLocalVolume() {
		return this.localVolume;
	}

	public void setLocalVolume(String localVolume) {
		this.localVolume = localVolume;
		if(localVolume != null){
			putQueryParameter("LocalVolume", localVolume);
		}
	}

	public String getUpdateStrategy() {
		return this.updateStrategy;
	}

	public void setUpdateStrategy(String updateStrategy) {
		this.updateStrategy = updateStrategy;
		if(updateStrategy != null){
			putQueryParameter("UpdateStrategy", updateStrategy);
		}
	}

	public Boolean getUseBodyEncoding() {
		return this.useBodyEncoding;
	}

	public void setUseBodyEncoding(Boolean useBodyEncoding) {
		this.useBodyEncoding = useBodyEncoding;
		if(useBodyEncoding != null){
			putQueryParameter("UseBodyEncoding", useBodyEncoding.toString());
		}
	}

	public String getChangeOrderDesc() {
		return this.changeOrderDesc;
	}

	public void setChangeOrderDesc(String changeOrderDesc) {
		this.changeOrderDesc = changeOrderDesc;
		if(changeOrderDesc != null){
			putQueryParameter("ChangeOrderDesc", changeOrderDesc);
		}
	}

	public String getEmptyDirs() {
		return this.emptyDirs;
	}

	public void setEmptyDirs(String emptyDirs) {
		this.emptyDirs = emptyDirs;
		if(emptyDirs != null){
			putQueryParameter("EmptyDirs", emptyDirs);
		}
	}

	public Integer getMcpuLimit() {
		return this.mcpuLimit;
	}

	public void setMcpuLimit(Integer mcpuLimit) {
		this.mcpuLimit = mcpuLimit;
		if(mcpuLimit != null){
			putQueryParameter("McpuLimit", mcpuLimit.toString());
		}
	}

	public String getRuntimeClassName() {
		return this.runtimeClassName;
	}

	public void setRuntimeClassName(String runtimeClassName) {
		this.runtimeClassName = runtimeClassName;
		if(runtimeClassName != null){
			putQueryParameter("RuntimeClassName", runtimeClassName);
		}
	}

	public String getTrafficControlStrategy() {
		return this.trafficControlStrategy;
	}

	public void setTrafficControlStrategy(String trafficControlStrategy) {
		this.trafficControlStrategy = trafficControlStrategy;
		if(trafficControlStrategy != null){
			putQueryParameter("TrafficControlStrategy", trafficControlStrategy);
		}
	}

	public String getPostStart() {
		return this.postStart;
	}

	public void setPostStart(String postStart) {
		this.postStart = postStart;
		if(postStart != null){
			putQueryParameter("PostStart", postStart);
		}
	}

	public String getCustomAffinity() {
		return this.customAffinity;
	}

	public void setCustomAffinity(String customAffinity) {
		this.customAffinity = customAffinity;
		if(customAffinity != null){
			putQueryParameter("CustomAffinity", customAffinity);
		}
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

	public Boolean getEnableAhas() {
		return this.enableAhas;
	}

	public void setEnableAhas(Boolean enableAhas) {
		this.enableAhas = enableAhas;
		if(enableAhas != null){
			putQueryParameter("EnableAhas", enableAhas.toString());
		}
	}

	public String getSlsConfigs() {
		return this.slsConfigs;
	}

	public void setSlsConfigs(String slsConfigs) {
		this.slsConfigs = slsConfigs;
		if(slsConfigs != null){
			putQueryParameter("SlsConfigs", slsConfigs);
		}
	}

	public String getReadiness() {
		return this.readiness;
	}

	public void setReadiness(String readiness) {
		this.readiness = readiness;
		if(readiness != null){
			putQueryParameter("Readiness", readiness);
		}
	}

	public String getLiveness() {
		return this.liveness;
	}

	public void setLiveness(String liveness) {
		this.liveness = liveness;
		if(liveness != null){
			putQueryParameter("Liveness", liveness);
		}
	}

	public String getPackageVersion() {
		return this.packageVersion;
	}

	public void setPackageVersion(String packageVersion) {
		this.packageVersion = packageVersion;
		if(packageVersion != null){
			putQueryParameter("PackageVersion", packageVersion);
		}
	}

	public String getEnvFroms() {
		return this.envFroms;
	}

	public void setEnvFroms(String envFroms) {
		this.envFroms = envFroms;
		if(envFroms != null){
			putQueryParameter("EnvFroms", envFroms);
		}
	}

	public String getEdasContainerVersion() {
		return this.edasContainerVersion;
	}

	public void setEdasContainerVersion(String edasContainerVersion) {
		this.edasContainerVersion = edasContainerVersion;
		if(edasContainerVersion != null){
			putQueryParameter("EdasContainerVersion", edasContainerVersion);
		}
	}

	public String getPackageUrl() {
		return this.packageUrl;
	}

	public void setPackageUrl(String packageUrl) {
		this.packageUrl = packageUrl;
		if(packageUrl != null){
			putQueryParameter("PackageUrl", packageUrl);
		}
	}

	public String getMountDescs() {
		return this.mountDescs;
	}

	public void setMountDescs(String mountDescs) {
		this.mountDescs = mountDescs;
		if(mountDescs != null){
			putQueryParameter("MountDescs", mountDescs);
		}
	}

	public Integer getReplicas() {
		return this.replicas;
	}

	public void setReplicas(Integer replicas) {
		this.replicas = replicas;
		if(replicas != null){
			putQueryParameter("Replicas", replicas.toString());
		}
	}

	public String getCustomTolerations() {
		return this.customTolerations;
	}

	public void setCustomTolerations(String customTolerations) {
		this.customTolerations = customTolerations;
		if(customTolerations != null){
			putQueryParameter("CustomTolerations", customTolerations);
		}
	}

	public Integer getCpuRequest() {
		return this.cpuRequest;
	}

	public void setCpuRequest(Integer cpuRequest) {
		this.cpuRequest = cpuRequest;
		if(cpuRequest != null){
			putQueryParameter("CpuRequest", cpuRequest.toString());
		}
	}

	public String getWebContainerConfig() {
		return this.webContainerConfig;
	}

	public void setWebContainerConfig(String webContainerConfig) {
		this.webContainerConfig = webContainerConfig;
		if(webContainerConfig != null){
			putQueryParameter("WebContainerConfig", webContainerConfig);
		}
	}

	public String getCommand() {
		return this.command;
	}

	public void setCommand(String command) {
		this.command = command;
		if(command != null){
			putQueryParameter("Command", command);
		}
	}

	public String getArgs() {
		return this.args;
	}

	public void setArgs(String args) {
		this.args = args;
		if(args != null){
			putQueryParameter("Args", args);
		}
	}

	public String getJDK() {
		return this.jDK;
	}

	public void setJDK(String jDK) {
		this.jDK = jDK;
		if(jDK != null){
			putQueryParameter("JDK", jDK);
		}
	}

	public String getUriEncoding() {
		return this.uriEncoding;
	}

	public void setUriEncoding(String uriEncoding) {
		this.uriEncoding = uriEncoding;
		if(uriEncoding != null){
			putQueryParameter("UriEncoding", uriEncoding);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public Integer getBatchTimeout() {
		return this.batchTimeout;
	}

	public void setBatchTimeout(Integer batchTimeout) {
		this.batchTimeout = batchTimeout;
		if(batchTimeout != null){
			putQueryParameter("BatchTimeout", batchTimeout.toString());
		}
	}

	public String getPvcMountDescs() {
		return this.pvcMountDescs;
	}

	public void setPvcMountDescs(String pvcMountDescs) {
		this.pvcMountDescs = pvcMountDescs;
		if(pvcMountDescs != null){
			putQueryParameter("PvcMountDescs", pvcMountDescs);
		}
	}

	public Integer getMcpuRequest() {
		return this.mcpuRequest;
	}

	public void setMcpuRequest(Integer mcpuRequest) {
		this.mcpuRequest = mcpuRequest;
		if(mcpuRequest != null){
			putQueryParameter("McpuRequest", mcpuRequest.toString());
		}
	}

	public String getVolumesStr() {
		return this.volumesStr;
	}

	public void setVolumesStr(String volumesStr) {
		this.volumesStr = volumesStr;
		if(volumesStr != null){
			putQueryParameter("VolumesStr", volumesStr);
		}
	}

	public String getJavaStartUpConfig() {
		return this.javaStartUpConfig;
	}

	public void setJavaStartUpConfig(String javaStartUpConfig) {
		this.javaStartUpConfig = javaStartUpConfig;
		if(javaStartUpConfig != null){
			putQueryParameter("JavaStartUpConfig", javaStartUpConfig);
		}
	}

	@Override
	public Class<DeployK8sApplicationResponse> getResponseClass() {
		return DeployK8sApplicationResponse.class;
	}

}
