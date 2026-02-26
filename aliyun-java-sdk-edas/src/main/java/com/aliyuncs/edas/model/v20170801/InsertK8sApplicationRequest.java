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
public class InsertK8sApplicationRequest extends RoaAcsRequest<InsertK8sApplicationResponse> {
	   

	private String nasId;

	private String sidecars;

	private String intranetSlbId;

	private Integer requestsEphemeralStorage;

	private String envs;

	private String annotations;

	private Integer requestsMem;

	private String storageType;

	private String resourceGroupId;

	private String configMountDescs;

	private String appName;

	private String startup;

	private Integer requestsmCpu;

	private String imagePlatforms;

	private String deployAcrossZones;

	private Integer terminateGracePeriod;

	private Integer intranetSlbPort;

	private String deployAcrossNodes;

	private String preStop;

	private String buildPackId;

	private Boolean enableEmptyPushReject;

	private String localVolume;

	private String workloadType;

	private String labels;

	private String userBaseImageUrl;

	private Boolean useBodyEncoding;

	private Integer limitEphemeralStorage;

	private Integer losslessRuleFuncType;

	private String emptyDirs;

	private String packageType;

	private Boolean losslessRuleRelated;

	private String secretName;

	private String runtimeClassName;

	private String postStart;

	private String customAffinity;

	private Boolean enableLosslessRule;

	private Integer losslessRuleWarmupTime;

	private String repoId;

	private Integer internetTargetPort;

	private String webContainer;

	private Boolean enableAsm;

	private Boolean enableAhas;

	private String slsConfigs;

	private String commandArgs;

	private String readiness;

	private String liveness;

	private String csClusterId;

	private String appConfig;

	private String initContainers;

	private Integer internetSlbPort;

	private String packageVersion;

	private Integer timeout;

	private String envFroms;

	private Integer limitMem;

	private Integer limitmCpu;

	private String edasContainerVersion;

	private String internetSlbId;

	private String logicalRegionId;

	private String packageUrl;

	private String internetSlbProtocol;

	private Integer losslessRuleDelayTime;

	private String mountDescs;

	private String featureConfig;

	private Integer replicas;

	private Integer limitCpu;

	private String customTolerations;

	private String webContainerConfig;

	private Boolean isMultilingualApp;

	private String clusterId;

	private String serviceConfigs;

	private Integer intranetTargetPort;

	private String command;

	private String jDK;

	private String uriEncoding;

	private String intranetSlbProtocol;

	private String imageUrl;

	private String pvcMountDescs;

	private String namespace;

	private String containerRegistryId;

	private String appTemplateName;

	private String applicationDescription;

	private Boolean losslessRuleAligned;

	private Integer requestsCpu;

	private String javaStartUpConfig;
	public InsertK8sApplicationRequest() {
		super("Edas", "2017-08-01", "InsertK8sApplication", "Edas");
		setUriPattern("/pop/v5/k8s/acs/create_k8s_app");
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

	public String getSidecars() {
		return this.sidecars;
	}

	public void setSidecars(String sidecars) {
		this.sidecars = sidecars;
		if(sidecars != null){
			putQueryParameter("Sidecars", sidecars);
		}
	}

	public String getIntranetSlbId() {
		return this.intranetSlbId;
	}

	public void setIntranetSlbId(String intranetSlbId) {
		this.intranetSlbId = intranetSlbId;
		if(intranetSlbId != null){
			putQueryParameter("IntranetSlbId", intranetSlbId);
		}
	}

	public Integer getRequestsEphemeralStorage() {
		return this.requestsEphemeralStorage;
	}

	public void setRequestsEphemeralStorage(Integer requestsEphemeralStorage) {
		this.requestsEphemeralStorage = requestsEphemeralStorage;
		if(requestsEphemeralStorage != null){
			putQueryParameter("RequestsEphemeralStorage", requestsEphemeralStorage.toString());
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

	public String getAnnotations() {
		return this.annotations;
	}

	public void setAnnotations(String annotations) {
		this.annotations = annotations;
		if(annotations != null){
			putQueryParameter("Annotations", annotations);
		}
	}

	public Integer getRequestsMem() {
		return this.requestsMem;
	}

	public void setRequestsMem(Integer requestsMem) {
		this.requestsMem = requestsMem;
		if(requestsMem != null){
			putQueryParameter("RequestsMem", requestsMem.toString());
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getStartup() {
		return this.startup;
	}

	public void setStartup(String startup) {
		this.startup = startup;
		if(startup != null){
			putQueryParameter("Startup", startup);
		}
	}

	public Integer getRequestsmCpu() {
		return this.requestsmCpu;
	}

	public void setRequestsmCpu(Integer requestsmCpu) {
		this.requestsmCpu = requestsmCpu;
		if(requestsmCpu != null){
			putQueryParameter("RequestsmCpu", requestsmCpu.toString());
		}
	}

	public String getImagePlatforms() {
		return this.imagePlatforms;
	}

	public void setImagePlatforms(String imagePlatforms) {
		this.imagePlatforms = imagePlatforms;
		if(imagePlatforms != null){
			putQueryParameter("ImagePlatforms", imagePlatforms);
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

	public Integer getTerminateGracePeriod() {
		return this.terminateGracePeriod;
	}

	public void setTerminateGracePeriod(Integer terminateGracePeriod) {
		this.terminateGracePeriod = terminateGracePeriod;
		if(terminateGracePeriod != null){
			putQueryParameter("TerminateGracePeriod", terminateGracePeriod.toString());
		}
	}

	public Integer getIntranetSlbPort() {
		return this.intranetSlbPort;
	}

	public void setIntranetSlbPort(Integer intranetSlbPort) {
		this.intranetSlbPort = intranetSlbPort;
		if(intranetSlbPort != null){
			putQueryParameter("IntranetSlbPort", intranetSlbPort.toString());
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

	public String getPreStop() {
		return this.preStop;
	}

	public void setPreStop(String preStop) {
		this.preStop = preStop;
		if(preStop != null){
			putQueryParameter("PreStop", preStop);
		}
	}

	public String getBuildPackId() {
		return this.buildPackId;
	}

	public void setBuildPackId(String buildPackId) {
		this.buildPackId = buildPackId;
		if(buildPackId != null){
			putQueryParameter("BuildPackId", buildPackId);
		}
	}

	public Boolean getEnableEmptyPushReject() {
		return this.enableEmptyPushReject;
	}

	public void setEnableEmptyPushReject(Boolean enableEmptyPushReject) {
		this.enableEmptyPushReject = enableEmptyPushReject;
		if(enableEmptyPushReject != null){
			putQueryParameter("EnableEmptyPushReject", enableEmptyPushReject.toString());
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

	public String getWorkloadType() {
		return this.workloadType;
	}

	public void setWorkloadType(String workloadType) {
		this.workloadType = workloadType;
		if(workloadType != null){
			putQueryParameter("WorkloadType", workloadType);
		}
	}

	public String getLabels() {
		return this.labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
		if(labels != null){
			putQueryParameter("Labels", labels);
		}
	}

	public String getUserBaseImageUrl() {
		return this.userBaseImageUrl;
	}

	public void setUserBaseImageUrl(String userBaseImageUrl) {
		this.userBaseImageUrl = userBaseImageUrl;
		if(userBaseImageUrl != null){
			putQueryParameter("UserBaseImageUrl", userBaseImageUrl);
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

	public Integer getLimitEphemeralStorage() {
		return this.limitEphemeralStorage;
	}

	public void setLimitEphemeralStorage(Integer limitEphemeralStorage) {
		this.limitEphemeralStorage = limitEphemeralStorage;
		if(limitEphemeralStorage != null){
			putQueryParameter("LimitEphemeralStorage", limitEphemeralStorage.toString());
		}
	}

	public Integer getLosslessRuleFuncType() {
		return this.losslessRuleFuncType;
	}

	public void setLosslessRuleFuncType(Integer losslessRuleFuncType) {
		this.losslessRuleFuncType = losslessRuleFuncType;
		if(losslessRuleFuncType != null){
			putQueryParameter("LosslessRuleFuncType", losslessRuleFuncType.toString());
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

	public String getPackageType() {
		return this.packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
		if(packageType != null){
			putQueryParameter("PackageType", packageType);
		}
	}

	public Boolean getLosslessRuleRelated() {
		return this.losslessRuleRelated;
	}

	public void setLosslessRuleRelated(Boolean losslessRuleRelated) {
		this.losslessRuleRelated = losslessRuleRelated;
		if(losslessRuleRelated != null){
			putQueryParameter("LosslessRuleRelated", losslessRuleRelated.toString());
		}
	}

	public String getSecretName() {
		return this.secretName;
	}

	public void setSecretName(String secretName) {
		this.secretName = secretName;
		if(secretName != null){
			putQueryParameter("SecretName", secretName);
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

	public Boolean getEnableLosslessRule() {
		return this.enableLosslessRule;
	}

	public void setEnableLosslessRule(Boolean enableLosslessRule) {
		this.enableLosslessRule = enableLosslessRule;
		if(enableLosslessRule != null){
			putQueryParameter("EnableLosslessRule", enableLosslessRule.toString());
		}
	}

	public Integer getLosslessRuleWarmupTime() {
		return this.losslessRuleWarmupTime;
	}

	public void setLosslessRuleWarmupTime(Integer losslessRuleWarmupTime) {
		this.losslessRuleWarmupTime = losslessRuleWarmupTime;
		if(losslessRuleWarmupTime != null){
			putQueryParameter("LosslessRuleWarmupTime", losslessRuleWarmupTime.toString());
		}
	}

	public String getRepoId() {
		return this.repoId;
	}

	public void setRepoId(String repoId) {
		this.repoId = repoId;
		if(repoId != null){
			putQueryParameter("RepoId", repoId);
		}
	}

	public Integer getInternetTargetPort() {
		return this.internetTargetPort;
	}

	public void setInternetTargetPort(Integer internetTargetPort) {
		this.internetTargetPort = internetTargetPort;
		if(internetTargetPort != null){
			putQueryParameter("InternetTargetPort", internetTargetPort.toString());
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

	public Boolean getEnableAsm() {
		return this.enableAsm;
	}

	public void setEnableAsm(Boolean enableAsm) {
		this.enableAsm = enableAsm;
		if(enableAsm != null){
			putQueryParameter("EnableAsm", enableAsm.toString());
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

	public String getCommandArgs() {
		return this.commandArgs;
	}

	public void setCommandArgs(String commandArgs) {
		this.commandArgs = commandArgs;
		if(commandArgs != null){
			putQueryParameter("CommandArgs", commandArgs);
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

	public String getCsClusterId() {
		return this.csClusterId;
	}

	public void setCsClusterId(String csClusterId) {
		this.csClusterId = csClusterId;
		if(csClusterId != null){
			putQueryParameter("CsClusterId", csClusterId);
		}
	}

	public String getAppConfig() {
		return this.appConfig;
	}

	public void setAppConfig(String appConfig) {
		this.appConfig = appConfig;
		if(appConfig != null){
			putQueryParameter("AppConfig", appConfig);
		}
	}

	public String getInitContainers() {
		return this.initContainers;
	}

	public void setInitContainers(String initContainers) {
		this.initContainers = initContainers;
		if(initContainers != null){
			putQueryParameter("InitContainers", initContainers);
		}
	}

	public Integer getInternetSlbPort() {
		return this.internetSlbPort;
	}

	public void setInternetSlbPort(Integer internetSlbPort) {
		this.internetSlbPort = internetSlbPort;
		if(internetSlbPort != null){
			putQueryParameter("InternetSlbPort", internetSlbPort.toString());
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

	public Integer getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putQueryParameter("Timeout", timeout.toString());
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

	public Integer getLimitMem() {
		return this.limitMem;
	}

	public void setLimitMem(Integer limitMem) {
		this.limitMem = limitMem;
		if(limitMem != null){
			putQueryParameter("LimitMem", limitMem.toString());
		}
	}

	public Integer getLimitmCpu() {
		return this.limitmCpu;
	}

	public void setLimitmCpu(Integer limitmCpu) {
		this.limitmCpu = limitmCpu;
		if(limitmCpu != null){
			putQueryParameter("LimitmCpu", limitmCpu.toString());
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

	public String getInternetSlbId() {
		return this.internetSlbId;
	}

	public void setInternetSlbId(String internetSlbId) {
		this.internetSlbId = internetSlbId;
		if(internetSlbId != null){
			putQueryParameter("InternetSlbId", internetSlbId);
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

	public String getPackageUrl() {
		return this.packageUrl;
	}

	public void setPackageUrl(String packageUrl) {
		this.packageUrl = packageUrl;
		if(packageUrl != null){
			putQueryParameter("PackageUrl", packageUrl);
		}
	}

	public String getInternetSlbProtocol() {
		return this.internetSlbProtocol;
	}

	public void setInternetSlbProtocol(String internetSlbProtocol) {
		this.internetSlbProtocol = internetSlbProtocol;
		if(internetSlbProtocol != null){
			putQueryParameter("InternetSlbProtocol", internetSlbProtocol);
		}
	}

	public Integer getLosslessRuleDelayTime() {
		return this.losslessRuleDelayTime;
	}

	public void setLosslessRuleDelayTime(Integer losslessRuleDelayTime) {
		this.losslessRuleDelayTime = losslessRuleDelayTime;
		if(losslessRuleDelayTime != null){
			putQueryParameter("LosslessRuleDelayTime", losslessRuleDelayTime.toString());
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

	public String getFeatureConfig() {
		return this.featureConfig;
	}

	public void setFeatureConfig(String featureConfig) {
		this.featureConfig = featureConfig;
		if(featureConfig != null){
			putQueryParameter("FeatureConfig", featureConfig);
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

	public Integer getLimitCpu() {
		return this.limitCpu;
	}

	public void setLimitCpu(Integer limitCpu) {
		this.limitCpu = limitCpu;
		if(limitCpu != null){
			putQueryParameter("LimitCpu", limitCpu.toString());
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

	public String getWebContainerConfig() {
		return this.webContainerConfig;
	}

	public void setWebContainerConfig(String webContainerConfig) {
		this.webContainerConfig = webContainerConfig;
		if(webContainerConfig != null){
			putQueryParameter("WebContainerConfig", webContainerConfig);
		}
	}

	public Boolean getIsMultilingualApp() {
		return this.isMultilingualApp;
	}

	public void setIsMultilingualApp(Boolean isMultilingualApp) {
		this.isMultilingualApp = isMultilingualApp;
		if(isMultilingualApp != null){
			putQueryParameter("IsMultilingualApp", isMultilingualApp.toString());
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

	public String getServiceConfigs() {
		return this.serviceConfigs;
	}

	public void setServiceConfigs(String serviceConfigs) {
		this.serviceConfigs = serviceConfigs;
		if(serviceConfigs != null){
			putQueryParameter("ServiceConfigs", serviceConfigs);
		}
	}

	public Integer getIntranetTargetPort() {
		return this.intranetTargetPort;
	}

	public void setIntranetTargetPort(Integer intranetTargetPort) {
		this.intranetTargetPort = intranetTargetPort;
		if(intranetTargetPort != null){
			putQueryParameter("IntranetTargetPort", intranetTargetPort.toString());
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

	public String getIntranetSlbProtocol() {
		return this.intranetSlbProtocol;
	}

	public void setIntranetSlbProtocol(String intranetSlbProtocol) {
		this.intranetSlbProtocol = intranetSlbProtocol;
		if(intranetSlbProtocol != null){
			putQueryParameter("IntranetSlbProtocol", intranetSlbProtocol);
		}
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		if(imageUrl != null){
			putQueryParameter("ImageUrl", imageUrl);
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

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public String getContainerRegistryId() {
		return this.containerRegistryId;
	}

	public void setContainerRegistryId(String containerRegistryId) {
		this.containerRegistryId = containerRegistryId;
		if(containerRegistryId != null){
			putQueryParameter("ContainerRegistryId", containerRegistryId);
		}
	}

	public String getAppTemplateName() {
		return this.appTemplateName;
	}

	public void setAppTemplateName(String appTemplateName) {
		this.appTemplateName = appTemplateName;
		if(appTemplateName != null){
			putQueryParameter("AppTemplateName", appTemplateName);
		}
	}

	public String getApplicationDescription() {
		return this.applicationDescription;
	}

	public void setApplicationDescription(String applicationDescription) {
		this.applicationDescription = applicationDescription;
		if(applicationDescription != null){
			putQueryParameter("ApplicationDescription", applicationDescription);
		}
	}

	public Boolean getLosslessRuleAligned() {
		return this.losslessRuleAligned;
	}

	public void setLosslessRuleAligned(Boolean losslessRuleAligned) {
		this.losslessRuleAligned = losslessRuleAligned;
		if(losslessRuleAligned != null){
			putQueryParameter("LosslessRuleAligned", losslessRuleAligned.toString());
		}
	}

	public Integer getRequestsCpu() {
		return this.requestsCpu;
	}

	public void setRequestsCpu(Integer requestsCpu) {
		this.requestsCpu = requestsCpu;
		if(requestsCpu != null){
			putQueryParameter("RequestsCpu", requestsCpu.toString());
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
	public Class<InsertK8sApplicationResponse> getResponseClass() {
		return InsertK8sApplicationResponse.class;
	}

}
