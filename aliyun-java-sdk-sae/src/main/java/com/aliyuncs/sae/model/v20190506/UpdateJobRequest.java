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
public class UpdateJobRequest extends RoaAcsRequest<UpdateJobResponse> {
	   

	private String nasId;

	private String jarStartArgs;

	private String concurrencyPolicy;

	private String triggerConfig;

	private String ossAkSecret;

	private String mountHost;

	private String envs;

	private String programmingLanguage;

	private String customHostAlias;

	private String jarStartOptions;

	private Boolean slice;

	private String configMapMountDesc;

	private String ossMountDescs;

	private String imagePullSecrets;

	private String preStop;

	private String python;

	private Long backoffLimit;

	private String postStart;

	private String webContainer;

	private String slsConfigs;

	private String commandArgs;

	private String acrAssumeRoleArn;

	private String timezone;

	private String ossAkId;

	private String packageVersion;

	private String tomcatConfig;

	private Long timeout;

	private String warStartOptions;

	private String edasContainerVersion;

	private String packageUrl;

	private Integer terminationGracePeriodSeconds;

	private String phpConfig;

	private String sliceEnvs;

	private Boolean enableImageAccl;

	private String replicas;

	private String command;

	private String mountDesc;

	private String jdk;

	private String acrInstanceId;

	private String appId;

	private String imageUrl;

	private String php;

	private String refAppId;

	private String pythonModules;

	private String phpConfigLocation;
	public UpdateJobRequest() {
		super("sae", "2019-05-06", "UpdateJob", "serverless");
		setUriPattern("/pop/v1/sam/job/updateJob");
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

	public String getConcurrencyPolicy() {
		return this.concurrencyPolicy;
	}

	public void setConcurrencyPolicy(String concurrencyPolicy) {
		this.concurrencyPolicy = concurrencyPolicy;
		if(concurrencyPolicy != null){
			putQueryParameter("ConcurrencyPolicy", concurrencyPolicy);
		}
	}

	public String getTriggerConfig() {
		return this.triggerConfig;
	}

	public void setTriggerConfig(String triggerConfig) {
		this.triggerConfig = triggerConfig;
		if(triggerConfig != null){
			putQueryParameter("TriggerConfig", triggerConfig);
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

	public String getEnvs() {
		return this.envs;
	}

	public void setEnvs(String envs) {
		this.envs = envs;
		if(envs != null){
			putQueryParameter("Envs", envs);
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

	public String getJarStartOptions() {
		return this.jarStartOptions;
	}

	public void setJarStartOptions(String jarStartOptions) {
		this.jarStartOptions = jarStartOptions;
		if(jarStartOptions != null){
			putQueryParameter("JarStartOptions", jarStartOptions);
		}
	}

	public Boolean getSlice() {
		return this.slice;
	}

	public void setSlice(Boolean slice) {
		this.slice = slice;
		if(slice != null){
			putQueryParameter("Slice", slice.toString());
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

	public Long getBackoffLimit() {
		return this.backoffLimit;
	}

	public void setBackoffLimit(Long backoffLimit) {
		this.backoffLimit = backoffLimit;
		if(backoffLimit != null){
			putQueryParameter("BackoffLimit", backoffLimit.toString());
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

	public String getWebContainer() {
		return this.webContainer;
	}

	public void setWebContainer(String webContainer) {
		this.webContainer = webContainer;
		if(webContainer != null){
			putQueryParameter("WebContainer", webContainer);
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

	public String getAcrAssumeRoleArn() {
		return this.acrAssumeRoleArn;
	}

	public void setAcrAssumeRoleArn(String acrAssumeRoleArn) {
		this.acrAssumeRoleArn = acrAssumeRoleArn;
		if(acrAssumeRoleArn != null){
			putQueryParameter("AcrAssumeRoleArn", acrAssumeRoleArn);
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

	public Long getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Long timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putQueryParameter("Timeout", timeout.toString());
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

	public String getSliceEnvs() {
		return this.sliceEnvs;
	}

	public void setSliceEnvs(String sliceEnvs) {
		this.sliceEnvs = sliceEnvs;
		if(sliceEnvs != null){
			putQueryParameter("SliceEnvs", sliceEnvs);
		}
	}

	public Boolean getEnableImageAccl() {
		return this.enableImageAccl;
	}

	public void setEnableImageAccl(Boolean enableImageAccl) {
		this.enableImageAccl = enableImageAccl;
		if(enableImageAccl != null){
			putBodyParameter("EnableImageAccl", enableImageAccl.toString());
		}
	}

	public String getReplicas() {
		return this.replicas;
	}

	public void setReplicas(String replicas) {
		this.replicas = replicas;
		if(replicas != null){
			putQueryParameter("Replicas", replicas);
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

	public String getRefAppId() {
		return this.refAppId;
	}

	public void setRefAppId(String refAppId) {
		this.refAppId = refAppId;
		if(refAppId != null){
			putQueryParameter("RefAppId", refAppId);
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
	public Class<UpdateJobResponse> getResponseClass() {
		return UpdateJobResponse.class;
	}

}
