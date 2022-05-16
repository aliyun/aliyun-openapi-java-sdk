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
public class CreateApplicationRequest extends RoaAcsRequest<CreateApplicationResponse> {
	   

	private String nasId;

	private String jarStartArgs;

	private String ossAkSecret;

	private String mountHost;

	private Boolean autoConfig;

	private String envs;

	private String kafkaInstanceId;

	private String phpArmsConfigLocation;

	private String programmingLanguage;

	private String customHostAlias;

	private Boolean deploy;

	private String jarStartOptions;

	private String appName;

	private String namespaceId;

	private String configMapMountDesc;

	private String ossMountDescs;

	private String kafkaEndpoint;

	private String preStop;

	private Integer cpu;

	private String vSwitchId;

	private String packageType;

	private String postStart;

	private Boolean associateEip;

	private String webContainer;

	private Integer memory;

	private String slsConfigs;

	private String kafkaConfigs;

	private Boolean openCollectToKafka;

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

	private String packageUrl;

	private Integer terminationGracePeriodSeconds;

	private String phpConfig;

	private Integer replicas;

	private String command;

	private String mountDesc;

	private String jdk;

	private String appDescription;

	private String kafkaLogfileConfig;

	private String acrInstanceId;

	private String vpcId;

	private String imageUrl;

	private String phpConfigLocation;
	public CreateApplicationRequest() {
		super("sae", "2019-05-06", "CreateApplication", "serverless");
		setUriPattern("/pop/v1/sam/app/createApplication");
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

	public String getMountHost() {
		return this.mountHost;
	}

	public void setMountHost(String mountHost) {
		this.mountHost = mountHost;
		if(mountHost != null){
			putQueryParameter("MountHost", mountHost);
		}
	}

	public Boolean getAutoConfig() {
		return this.autoConfig;
	}

	public void setAutoConfig(Boolean autoConfig) {
		this.autoConfig = autoConfig;
		if(autoConfig != null){
			putQueryParameter("AutoConfig", autoConfig.toString());
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

	public String getKafkaInstanceId() {
		return this.kafkaInstanceId;
	}

	public void setKafkaInstanceId(String kafkaInstanceId) {
		this.kafkaInstanceId = kafkaInstanceId;
		if(kafkaInstanceId != null){
			putQueryParameter("KafkaInstanceId", kafkaInstanceId);
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

	public String getProgrammingLanguage() {
		return this.programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
		if(programmingLanguage != null){
			putQueryParameter("ProgrammingLanguage", programmingLanguage);
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

	public Boolean getDeploy() {
		return this.deploy;
	}

	public void setDeploy(Boolean deploy) {
		this.deploy = deploy;
		if(deploy != null){
			putQueryParameter("Deploy", deploy.toString());
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

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getNamespaceId() {
		return this.namespaceId;
	}

	public void setNamespaceId(String namespaceId) {
		this.namespaceId = namespaceId;
		if(namespaceId != null){
			putQueryParameter("NamespaceId", namespaceId);
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

	public String getKafkaEndpoint() {
		return this.kafkaEndpoint;
	}

	public void setKafkaEndpoint(String kafkaEndpoint) {
		this.kafkaEndpoint = kafkaEndpoint;
		if(kafkaEndpoint != null){
			putQueryParameter("KafkaEndpoint", kafkaEndpoint);
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

	public Integer getCpu() {
		return this.cpu;
	}

	public void setCpu(Integer cpu) {
		this.cpu = cpu;
		if(cpu != null){
			putQueryParameter("Cpu", cpu.toString());
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

	public Integer getMemory() {
		return this.memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
		if(memory != null){
			putQueryParameter("Memory", memory.toString());
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

	public Boolean getOpenCollectToKafka() {
		return this.openCollectToKafka;
	}

	public void setOpenCollectToKafka(Boolean openCollectToKafka) {
		this.openCollectToKafka = openCollectToKafka;
		if(openCollectToKafka != null){
			putQueryParameter("OpenCollectToKafka", openCollectToKafka.toString());
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

	public String getPackageUrl() {
		return this.packageUrl;
	}

	public void setPackageUrl(String packageUrl) {
		this.packageUrl = packageUrl;
		if(packageUrl != null){
			putQueryParameter("PackageUrl", packageUrl);
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

	public String getAppDescription() {
		return this.appDescription;
	}

	public void setAppDescription(String appDescription) {
		this.appDescription = appDescription;
		if(appDescription != null){
			putQueryParameter("AppDescription", appDescription);
		}
	}

	public String getKafkaLogfileConfig() {
		return this.kafkaLogfileConfig;
	}

	public void setKafkaLogfileConfig(String kafkaLogfileConfig) {
		this.kafkaLogfileConfig = kafkaLogfileConfig;
		if(kafkaLogfileConfig != null){
			putQueryParameter("KafkaLogfileConfig", kafkaLogfileConfig);
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

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
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
	public Class<CreateApplicationResponse> getResponseClass() {
		return CreateApplicationResponse.class;
	}

}
