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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeployApplicationRequest extends RoaAcsRequest<DeployApplicationResponse> {
	   

	private String nasId;

	private String jarStartArgs;

	private String ossAkSecret;

	private String nasConfigs;

	private String mountHost;

	private Integer batchWaitTime;

	private String envs;

	private String phpArmsConfigLocation;

	private String customHostAlias;

	private String deploy;

	private String jarStartOptions;

	private String pvtzDiscoverySvc;

	private String configMapMountDesc;

	private String ossMountDescs;

	private String imagePullSecrets;

	private String preStop;

	private String python;

	private Integer cpu;

	private String updateStrategy;

	private String vSwitchId;

	private String changeOrderDesc;

	private Integer minReadyInstanceRatio;

	private Boolean autoEnableApplicationScalingRule;

	private String packageType;

	private String postStart;

	private Boolean associateEip;

	private String webContainer;

	private String enableAhas;

	private String slsConfigs;

	private String kafkaConfigs;

	private String dotnet;

	private Integer memory;

	private String commandArgs;

	private String acrAssumeRoleArn;

	private String readiness;

	private String timezone;

	private String ossAkId;

	private String liveness;

	private String securityGroupId;

	private String packageVersion;

	private String tomcatConfig;

	private String warStartOptions;

	private String edasContainerVersion;

	private String serviceTags;

	private String packageUrl;

	private Boolean enableNewArms;

	private String microRegistrationConfig;

	private Integer terminationGracePeriodSeconds;

	private String phpConfig;

	private String microRegistration;

	private Boolean enableGreyTagRoute;

	private Integer replicas;

	private String command;

	private String mountDesc;

	private String jdk;

	private Integer minReadyInstances;

	private String acrInstanceId;

	private String appId;

	private String imageUrl;

	private String php;

	private String pythonModules;

	private String phpConfigLocation;
	public DeployApplicationRequest() {
		super("sae", "2019-05-06", "DeployApplication", "serverless");
		setUriPattern("/pop/v1/sam/app/deployApplication");
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

	public String getJarStartArgs() {
		return this.jarStartArgs;
	}

	public void setJarStartArgs(String jarStartArgs) {
		this.jarStartArgs = jarStartArgs;
		if(jarStartArgs != null){
			putQueryParameter("JarStartArgs", jarStartArgs);
		}
	}

	public String getOssAkSecret() {
		return this.ossAkSecret;
	}

	public void setOssAkSecret(String ossAkSecret) {
		this.ossAkSecret = ossAkSecret;
		if(ossAkSecret != null){
			putBodyParameter("OssAkSecret", ossAkSecret);
		}
	}

	public String getNasConfigs() {
		return this.nasConfigs;
	}

	public void setNasConfigs(String nasConfigs) {
		this.nasConfigs = nasConfigs;
		if(nasConfigs != null){
			putQueryParameter("NasConfigs", nasConfigs);
		}
	}

	public String getMountHost() {
		return this.mountHost;
	}

	public void setMountHost(String mountHost) {
		this.mountHost = mountHost;
		if(mountHost != null){
			putQueryParameter("MountHost", mountHost);
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

	public String getPhpArmsConfigLocation() {
		return this.phpArmsConfigLocation;
	}

	public void setPhpArmsConfigLocation(String phpArmsConfigLocation) {
		this.phpArmsConfigLocation = phpArmsConfigLocation;
		if(phpArmsConfigLocation != null){
			putQueryParameter("PhpArmsConfigLocation", phpArmsConfigLocation);
		}
	}

	public String getCustomHostAlias() {
		return this.customHostAlias;
	}

	public void setCustomHostAlias(String customHostAlias) {
		this.customHostAlias = customHostAlias;
		if(customHostAlias != null){
			putQueryParameter("CustomHostAlias", customHostAlias);
		}
	}

	public String getDeploy() {
		return this.deploy;
	}

	public void setDeploy(String deploy) {
		this.deploy = deploy;
		if(deploy != null){
			putQueryParameter("Deploy", deploy);
		}
	}

	public String getJarStartOptions() {
		return this.jarStartOptions;
	}

	public void setJarStartOptions(String jarStartOptions) {
		this.jarStartOptions = jarStartOptions;
		if(jarStartOptions != null){
			putQueryParameter("JarStartOptions", jarStartOptions);
		}
	}

	public String getPvtzDiscoverySvc() {
		return this.pvtzDiscoverySvc;
	}

	public void setPvtzDiscoverySvc(String pvtzDiscoverySvc) {
		this.pvtzDiscoverySvc = pvtzDiscoverySvc;
		if(pvtzDiscoverySvc != null){
			putQueryParameter("PvtzDiscoverySvc", pvtzDiscoverySvc);
		}
	}

	public String getConfigMapMountDesc() {
		return this.configMapMountDesc;
	}

	public void setConfigMapMountDesc(String configMapMountDesc) {
		this.configMapMountDesc = configMapMountDesc;
		if(configMapMountDesc != null){
			putBodyParameter("ConfigMapMountDesc", configMapMountDesc);
		}
	}

	public String getOssMountDescs() {
		return this.ossMountDescs;
	}

	public void setOssMountDescs(String ossMountDescs) {
		this.ossMountDescs = ossMountDescs;
		if(ossMountDescs != null){
			putBodyParameter("OssMountDescs", ossMountDescs);
		}
	}

	public String getImagePullSecrets() {
		return this.imagePullSecrets;
	}

	public void setImagePullSecrets(String imagePullSecrets) {
		this.imagePullSecrets = imagePullSecrets;
		if(imagePullSecrets != null){
			putQueryParameter("ImagePullSecrets", imagePullSecrets);
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

	public String getPython() {
		return this.python;
	}

	public void setPython(String python) {
		this.python = python;
		if(python != null){
			putQueryParameter("Python", python);
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

	public String getUpdateStrategy() {
		return this.updateStrategy;
	}

	public void setUpdateStrategy(String updateStrategy) {
		this.updateStrategy = updateStrategy;
		if(updateStrategy != null){
			putQueryParameter("UpdateStrategy", updateStrategy);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
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

	public Integer getMinReadyInstanceRatio() {
		return this.minReadyInstanceRatio;
	}

	public void setMinReadyInstanceRatio(Integer minReadyInstanceRatio) {
		this.minReadyInstanceRatio = minReadyInstanceRatio;
		if(minReadyInstanceRatio != null){
			putQueryParameter("MinReadyInstanceRatio", minReadyInstanceRatio.toString());
		}
	}

	public Boolean getAutoEnableApplicationScalingRule() {
		return this.autoEnableApplicationScalingRule;
	}

	public void setAutoEnableApplicationScalingRule(Boolean autoEnableApplicationScalingRule) {
		this.autoEnableApplicationScalingRule = autoEnableApplicationScalingRule;
		if(autoEnableApplicationScalingRule != null){
			putQueryParameter("AutoEnableApplicationScalingRule", autoEnableApplicationScalingRule.toString());
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

	public String getPostStart() {
		return this.postStart;
	}

	public void setPostStart(String postStart) {
		this.postStart = postStart;
		if(postStart != null){
			putQueryParameter("PostStart", postStart);
		}
	}

	public Boolean getAssociateEip() {
		return this.associateEip;
	}

	public void setAssociateEip(Boolean associateEip) {
		this.associateEip = associateEip;
		if(associateEip != null){
			putBodyParameter("AssociateEip", associateEip.toString());
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

	public String getEnableAhas() {
		return this.enableAhas;
	}

	public void setEnableAhas(String enableAhas) {
		this.enableAhas = enableAhas;
		if(enableAhas != null){
			putQueryParameter("EnableAhas", enableAhas);
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

	public String getKafkaConfigs() {
		return this.kafkaConfigs;
	}

	public void setKafkaConfigs(String kafkaConfigs) {
		this.kafkaConfigs = kafkaConfigs;
		if(kafkaConfigs != null){
			putQueryParameter("KafkaConfigs", kafkaConfigs);
		}
	}

	public String getDotnet() {
		return this.dotnet;
	}

	public void setDotnet(String dotnet) {
		this.dotnet = dotnet;
		if(dotnet != null){
			putQueryParameter("Dotnet", dotnet);
		}
	}

	public Integer getMemory() {
		return this.memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
		if(memory != null){
			putQueryParameter("Memory", memory.toString());
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

	public String getAcrAssumeRoleArn() {
		return this.acrAssumeRoleArn;
	}

	public void setAcrAssumeRoleArn(String acrAssumeRoleArn) {
		this.acrAssumeRoleArn = acrAssumeRoleArn;
		if(acrAssumeRoleArn != null){
			putQueryParameter("AcrAssumeRoleArn", acrAssumeRoleArn);
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

	public String getTimezone() {
		return this.timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
		if(timezone != null){
			putQueryParameter("Timezone", timezone);
		}
	}

	public String getOssAkId() {
		return this.ossAkId;
	}

	public void setOssAkId(String ossAkId) {
		this.ossAkId = ossAkId;
		if(ossAkId != null){
			putBodyParameter("OssAkId", ossAkId);
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

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
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

	public String getTomcatConfig() {
		return this.tomcatConfig;
	}

	public void setTomcatConfig(String tomcatConfig) {
		this.tomcatConfig = tomcatConfig;
		if(tomcatConfig != null){
			putQueryParameter("TomcatConfig", tomcatConfig);
		}
	}

	public String getWarStartOptions() {
		return this.warStartOptions;
	}

	public void setWarStartOptions(String warStartOptions) {
		this.warStartOptions = warStartOptions;
		if(warStartOptions != null){
			putQueryParameter("WarStartOptions", warStartOptions);
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

	public String getServiceTags() {
		return this.serviceTags;
	}

	public void setServiceTags(String serviceTags) {
		this.serviceTags = serviceTags;
		if(serviceTags != null){
			putBodyParameter("ServiceTags", serviceTags);
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

	public Boolean getEnableNewArms() {
		return this.enableNewArms;
	}

	public void setEnableNewArms(Boolean enableNewArms) {
		this.enableNewArms = enableNewArms;
		if(enableNewArms != null){
			putQueryParameter("EnableNewArms", enableNewArms.toString());
		}
	}

	public String getMicroRegistrationConfig() {
		return this.microRegistrationConfig;
	}

	public void setMicroRegistrationConfig(String microRegistrationConfig) {
		this.microRegistrationConfig = microRegistrationConfig;
		if(microRegistrationConfig != null){
			putBodyParameter("MicroRegistrationConfig", microRegistrationConfig);
		}
	}

	public Integer getTerminationGracePeriodSeconds() {
		return this.terminationGracePeriodSeconds;
	}

	public void setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
		this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
		if(terminationGracePeriodSeconds != null){
			putQueryParameter("TerminationGracePeriodSeconds", terminationGracePeriodSeconds.toString());
		}
	}

	public String getPhpConfig() {
		return this.phpConfig;
	}

	public void setPhpConfig(String phpConfig) {
		this.phpConfig = phpConfig;
		if(phpConfig != null){
			putBodyParameter("PhpConfig", phpConfig);
		}
	}

	public String getMicroRegistration() {
		return this.microRegistration;
	}

	public void setMicroRegistration(String microRegistration) {
		this.microRegistration = microRegistration;
		if(microRegistration != null){
			putQueryParameter("MicroRegistration", microRegistration);
		}
	}

	public Boolean getEnableGreyTagRoute() {
		return this.enableGreyTagRoute;
	}

	public void setEnableGreyTagRoute(Boolean enableGreyTagRoute) {
		this.enableGreyTagRoute = enableGreyTagRoute;
		if(enableGreyTagRoute != null){
			putQueryParameter("EnableGreyTagRoute", enableGreyTagRoute.toString());
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

	public String getCommand() {
		return this.command;
	}

	public void setCommand(String command) {
		this.command = command;
		if(command != null){
			putQueryParameter("Command", command);
		}
	}

	public String getMountDesc() {
		return this.mountDesc;
	}

	public void setMountDesc(String mountDesc) {
		this.mountDesc = mountDesc;
		if(mountDesc != null){
			putQueryParameter("MountDesc", mountDesc);
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

	public Integer getMinReadyInstances() {
		return this.minReadyInstances;
	}

	public void setMinReadyInstances(Integer minReadyInstances) {
		this.minReadyInstances = minReadyInstances;
		if(minReadyInstances != null){
			putQueryParameter("MinReadyInstances", minReadyInstances.toString());
		}
	}

	public String getAcrInstanceId() {
		return this.acrInstanceId;
	}

	public void setAcrInstanceId(String acrInstanceId) {
		this.acrInstanceId = acrInstanceId;
		if(acrInstanceId != null){
			putBodyParameter("AcrInstanceId", acrInstanceId);
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

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		if(imageUrl != null){
			putQueryParameter("ImageUrl", imageUrl);
		}
	}

	public String getPhp() {
		return this.php;
	}

	public void setPhp(String php) {
		this.php = php;
		if(php != null){
			putBodyParameter("Php", php);
		}
	}

	public String getPythonModules() {
		return this.pythonModules;
	}

	public void setPythonModules(String pythonModules) {
		this.pythonModules = pythonModules;
		if(pythonModules != null){
			putQueryParameter("PythonModules", pythonModules);
		}
	}

	public String getPhpConfigLocation() {
		return this.phpConfigLocation;
	}

	public void setPhpConfigLocation(String phpConfigLocation) {
		this.phpConfigLocation = phpConfigLocation;
		if(phpConfigLocation != null){
			putQueryParameter("PhpConfigLocation", phpConfigLocation);
		}
	}

	@Override
	public Class<DeployApplicationResponse> getResponseClass() {
		return DeployApplicationResponse.class;
	}

}
