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
public class CreateApplicationTemplateRequest extends RoaAcsRequest<CreateApplicationTemplateResponse> {
	   

	private String nasId;

	private Boolean enableAhas;

	private String slsConfigs;

	private String commandArgs;

	private String readiness;

	private String liveness;

	private String description;

	private String envs;

	private String envFroms;

	private String requestCpu;

	private String requestMem;

	private String showName;

	private String limitMem;

	private String configMountDescs;

	private Boolean deployAcrossZones;

	private Boolean deployAcrossNodes;

	private String preStop;

	private Long replicas;

	private String limitCpu;

	private String webContainerConfig;

	private String packageConfig;

	private Boolean isMultilingualApp;

	private String nasMountDescs;

	private String localVolumes;

	private String command;

	private String nasStorageType;

	private String imageConfig;

	private String sourceConfig;

	private String emptyDirs;

	private String pvcMountDescs;

	private String name;

	private String attributes;

	private String runtimeClassName;

	private String javaStartUpConfig;

	private String postStart;
	public CreateApplicationTemplateRequest() {
		super("Edas", "2017-08-01", "CreateApplicationTemplate", "Edas");
		setUriPattern("/pop/v5/cnedas/app_template");
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
			putBodyParameter("NasId", nasId);
		}
	}

	public Boolean getEnableAhas() {
		return this.enableAhas;
	}

	public void setEnableAhas(Boolean enableAhas) {
		this.enableAhas = enableAhas;
		if(enableAhas != null){
			putBodyParameter("EnableAhas", enableAhas.toString());
		}
	}

	public String getSlsConfigs() {
		return this.slsConfigs;
	}

	public void setSlsConfigs(String slsConfigs) {
		this.slsConfigs = slsConfigs;
		if(slsConfigs != null){
			putBodyParameter("SlsConfigs", slsConfigs);
		}
	}

	public String getCommandArgs() {
		return this.commandArgs;
	}

	public void setCommandArgs(String commandArgs) {
		this.commandArgs = commandArgs;
		if(commandArgs != null){
			putBodyParameter("CommandArgs", commandArgs);
		}
	}

	public String getReadiness() {
		return this.readiness;
	}

	public void setReadiness(String readiness) {
		this.readiness = readiness;
		if(readiness != null){
			putBodyParameter("Readiness", readiness);
		}
	}

	public String getLiveness() {
		return this.liveness;
	}

	public void setLiveness(String liveness) {
		this.liveness = liveness;
		if(liveness != null){
			putBodyParameter("Liveness", liveness);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getEnvs() {
		return this.envs;
	}

	public void setEnvs(String envs) {
		this.envs = envs;
		if(envs != null){
			putBodyParameter("Envs", envs);
		}
	}

	public String getEnvFroms() {
		return this.envFroms;
	}

	public void setEnvFroms(String envFroms) {
		this.envFroms = envFroms;
		if(envFroms != null){
			putBodyParameter("EnvFroms", envFroms);
		}
	}

	public String getRequestCpu() {
		return this.requestCpu;
	}

	public void setRequestCpu(String requestCpu) {
		this.requestCpu = requestCpu;
		if(requestCpu != null){
			putBodyParameter("RequestCpu", requestCpu);
		}
	}

	public String getRequestMem() {
		return this.requestMem;
	}

	public void setRequestMem(String requestMem) {
		this.requestMem = requestMem;
		if(requestMem != null){
			putBodyParameter("RequestMem", requestMem);
		}
	}

	public String getShowName() {
		return this.showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
		if(showName != null){
			putBodyParameter("ShowName", showName);
		}
	}

	public String getLimitMem() {
		return this.limitMem;
	}

	public void setLimitMem(String limitMem) {
		this.limitMem = limitMem;
		if(limitMem != null){
			putBodyParameter("LimitMem", limitMem);
		}
	}

	public String getConfigMountDescs() {
		return this.configMountDescs;
	}

	public void setConfigMountDescs(String configMountDescs) {
		this.configMountDescs = configMountDescs;
		if(configMountDescs != null){
			putBodyParameter("ConfigMountDescs", configMountDescs);
		}
	}

	public Boolean getDeployAcrossZones() {
		return this.deployAcrossZones;
	}

	public void setDeployAcrossZones(Boolean deployAcrossZones) {
		this.deployAcrossZones = deployAcrossZones;
		if(deployAcrossZones != null){
			putBodyParameter("DeployAcrossZones", deployAcrossZones.toString());
		}
	}

	public Boolean getDeployAcrossNodes() {
		return this.deployAcrossNodes;
	}

	public void setDeployAcrossNodes(Boolean deployAcrossNodes) {
		this.deployAcrossNodes = deployAcrossNodes;
		if(deployAcrossNodes != null){
			putBodyParameter("DeployAcrossNodes", deployAcrossNodes.toString());
		}
	}

	public String getPreStop() {
		return this.preStop;
	}

	public void setPreStop(String preStop) {
		this.preStop = preStop;
		if(preStop != null){
			putBodyParameter("PreStop", preStop);
		}
	}

	public Long getReplicas() {
		return this.replicas;
	}

	public void setReplicas(Long replicas) {
		this.replicas = replicas;
		if(replicas != null){
			putBodyParameter("Replicas", replicas.toString());
		}
	}

	public String getLimitCpu() {
		return this.limitCpu;
	}

	public void setLimitCpu(String limitCpu) {
		this.limitCpu = limitCpu;
		if(limitCpu != null){
			putBodyParameter("LimitCpu", limitCpu);
		}
	}

	public String getWebContainerConfig() {
		return this.webContainerConfig;
	}

	public void setWebContainerConfig(String webContainerConfig) {
		this.webContainerConfig = webContainerConfig;
		if(webContainerConfig != null){
			putBodyParameter("WebContainerConfig", webContainerConfig);
		}
	}

	public String getPackageConfig() {
		return this.packageConfig;
	}

	public void setPackageConfig(String packageConfig) {
		this.packageConfig = packageConfig;
		if(packageConfig != null){
			putBodyParameter("PackageConfig", packageConfig);
		}
	}

	public Boolean getIsMultilingualApp() {
		return this.isMultilingualApp;
	}

	public void setIsMultilingualApp(Boolean isMultilingualApp) {
		this.isMultilingualApp = isMultilingualApp;
		if(isMultilingualApp != null){
			putBodyParameter("IsMultilingualApp", isMultilingualApp.toString());
		}
	}

	public String getNasMountDescs() {
		return this.nasMountDescs;
	}

	public void setNasMountDescs(String nasMountDescs) {
		this.nasMountDescs = nasMountDescs;
		if(nasMountDescs != null){
			putBodyParameter("NasMountDescs", nasMountDescs);
		}
	}

	public String getLocalVolumes() {
		return this.localVolumes;
	}

	public void setLocalVolumes(String localVolumes) {
		this.localVolumes = localVolumes;
		if(localVolumes != null){
			putBodyParameter("LocalVolumes", localVolumes);
		}
	}

	public String getCommand() {
		return this.command;
	}

	public void setCommand(String command) {
		this.command = command;
		if(command != null){
			putBodyParameter("Command", command);
		}
	}

	public String getNasStorageType() {
		return this.nasStorageType;
	}

	public void setNasStorageType(String nasStorageType) {
		this.nasStorageType = nasStorageType;
		if(nasStorageType != null){
			putBodyParameter("NasStorageType", nasStorageType);
		}
	}

	public String getImageConfig() {
		return this.imageConfig;
	}

	public void setImageConfig(String imageConfig) {
		this.imageConfig = imageConfig;
		if(imageConfig != null){
			putBodyParameter("ImageConfig", imageConfig);
		}
	}

	public String getSourceConfig() {
		return this.sourceConfig;
	}

	public void setSourceConfig(String sourceConfig) {
		this.sourceConfig = sourceConfig;
		if(sourceConfig != null){
			putBodyParameter("SourceConfig", sourceConfig);
		}
	}

	public String getEmptyDirs() {
		return this.emptyDirs;
	}

	public void setEmptyDirs(String emptyDirs) {
		this.emptyDirs = emptyDirs;
		if(emptyDirs != null){
			putBodyParameter("EmptyDirs", emptyDirs);
		}
	}

	public String getPvcMountDescs() {
		return this.pvcMountDescs;
	}

	public void setPvcMountDescs(String pvcMountDescs) {
		this.pvcMountDescs = pvcMountDescs;
		if(pvcMountDescs != null){
			putBodyParameter("PvcMountDescs", pvcMountDescs);
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

	public String getAttributes() {
		return this.attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
		if(attributes != null){
			putBodyParameter("Attributes", attributes);
		}
	}

	public String getRuntimeClassName() {
		return this.runtimeClassName;
	}

	public void setRuntimeClassName(String runtimeClassName) {
		this.runtimeClassName = runtimeClassName;
		if(runtimeClassName != null){
			putBodyParameter("RuntimeClassName", runtimeClassName);
		}
	}

	public String getJavaStartUpConfig() {
		return this.javaStartUpConfig;
	}

	public void setJavaStartUpConfig(String javaStartUpConfig) {
		this.javaStartUpConfig = javaStartUpConfig;
		if(javaStartUpConfig != null){
			putBodyParameter("JavaStartUpConfig", javaStartUpConfig);
		}
	}

	public String getPostStart() {
		return this.postStart;
	}

	public void setPostStart(String postStart) {
		this.postStart = postStart;
		if(postStart != null){
			putBodyParameter("PostStart", postStart);
		}
	}

	@Override
	public Class<CreateApplicationTemplateResponse> getResponseClass() {
		return CreateApplicationTemplateResponse.class;
	}

}
