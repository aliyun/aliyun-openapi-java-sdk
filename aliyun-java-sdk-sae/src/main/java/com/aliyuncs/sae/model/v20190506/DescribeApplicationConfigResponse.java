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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.DescribeApplicationConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApplicationConfigResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String traceId;

	private String errorCode;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String vpcId;

		private String readiness;

		private String securityGroupId;

		private Integer batchWaitTime;

		private String jdk;

		private String imageUrl;

		private String slsConfigs;

		private String liveness;

		private String packageUrl;

		private String packageType;

		private String preStop;

		private String packageVersion;

		private String jarStartArgs;

		private String appName;

		private String appId;

		private String jarStartOptions;

		private Integer replicas;

		private String updateStrategy;

		private Integer minReadyInstances;

		private Integer minReadyInstanceRatio;

		private Integer memory;

		private String php;

		private String phpConfig;

		private String phpConfigLocation;

		private String phpExtensions;

		private String phpPECLExtensions;

		private String postStart;

		private Integer terminationGracePeriodSeconds;

		private String commandArgs;

		private String namespaceId;

		private String mountHost;

		private String tomcatConfig;

		private String regionId;

		private String vSwitchId;

		private Integer cpu;

		private String envs;

		private String enableAhas;

		private String customHostAlias;

		private String webContainer;

		private String command;

		private String warStartOptions;

		private String phpArmsConfigLocation;

		private String nasId;

		private String ossAkId;

		private String ossAkSecret;

		private String edasContainerVersion;

		private String timezone;

		private String appDescription;

		private Boolean enableGreyTagRoute;

		private String mseApplicationId;

		private String acrInstanceId;

		private String acrAssumeRoleArn;

		private Boolean associateEip;

		private String kafkaConfigs;

		private String programmingLanguage;

		private List<ConfigMapMountDescItem> configMapMountDesc;

		private List<Tag> tags;

		private List<MountDescItem> mountDesc;

		private List<OssMountDesc> ossMountDescs;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getReadiness() {
			return this.readiness;
		}

		public void setReadiness(String readiness) {
			this.readiness = readiness;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public Integer getBatchWaitTime() {
			return this.batchWaitTime;
		}

		public void setBatchWaitTime(Integer batchWaitTime) {
			this.batchWaitTime = batchWaitTime;
		}

		public String getJdk() {
			return this.jdk;
		}

		public void setJdk(String jdk) {
			this.jdk = jdk;
		}

		public String getImageUrl() {
			return this.imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public String getSlsConfigs() {
			return this.slsConfigs;
		}

		public void setSlsConfigs(String slsConfigs) {
			this.slsConfigs = slsConfigs;
		}

		public String getLiveness() {
			return this.liveness;
		}

		public void setLiveness(String liveness) {
			this.liveness = liveness;
		}

		public String getPackageUrl() {
			return this.packageUrl;
		}

		public void setPackageUrl(String packageUrl) {
			this.packageUrl = packageUrl;
		}

		public String getPackageType() {
			return this.packageType;
		}

		public void setPackageType(String packageType) {
			this.packageType = packageType;
		}

		public String getPreStop() {
			return this.preStop;
		}

		public void setPreStop(String preStop) {
			this.preStop = preStop;
		}

		public String getPackageVersion() {
			return this.packageVersion;
		}

		public void setPackageVersion(String packageVersion) {
			this.packageVersion = packageVersion;
		}

		public String getJarStartArgs() {
			return this.jarStartArgs;
		}

		public void setJarStartArgs(String jarStartArgs) {
			this.jarStartArgs = jarStartArgs;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getJarStartOptions() {
			return this.jarStartOptions;
		}

		public void setJarStartOptions(String jarStartOptions) {
			this.jarStartOptions = jarStartOptions;
		}

		public Integer getReplicas() {
			return this.replicas;
		}

		public void setReplicas(Integer replicas) {
			this.replicas = replicas;
		}

		public String getUpdateStrategy() {
			return this.updateStrategy;
		}

		public void setUpdateStrategy(String updateStrategy) {
			this.updateStrategy = updateStrategy;
		}

		public Integer getMinReadyInstances() {
			return this.minReadyInstances;
		}

		public void setMinReadyInstances(Integer minReadyInstances) {
			this.minReadyInstances = minReadyInstances;
		}

		public Integer getMinReadyInstanceRatio() {
			return this.minReadyInstanceRatio;
		}

		public void setMinReadyInstanceRatio(Integer minReadyInstanceRatio) {
			this.minReadyInstanceRatio = minReadyInstanceRatio;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public String getPhp() {
			return this.php;
		}

		public void setPhp(String php) {
			this.php = php;
		}

		public String getPhpConfig() {
			return this.phpConfig;
		}

		public void setPhpConfig(String phpConfig) {
			this.phpConfig = phpConfig;
		}

		public String getPhpConfigLocation() {
			return this.phpConfigLocation;
		}

		public void setPhpConfigLocation(String phpConfigLocation) {
			this.phpConfigLocation = phpConfigLocation;
		}

		public String getPhpExtensions() {
			return this.phpExtensions;
		}

		public void setPhpExtensions(String phpExtensions) {
			this.phpExtensions = phpExtensions;
		}

		public String getPhpPECLExtensions() {
			return this.phpPECLExtensions;
		}

		public void setPhpPECLExtensions(String phpPECLExtensions) {
			this.phpPECLExtensions = phpPECLExtensions;
		}

		public String getPostStart() {
			return this.postStart;
		}

		public void setPostStart(String postStart) {
			this.postStart = postStart;
		}

		public Integer getTerminationGracePeriodSeconds() {
			return this.terminationGracePeriodSeconds;
		}

		public void setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
			this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
		}

		public String getCommandArgs() {
			return this.commandArgs;
		}

		public void setCommandArgs(String commandArgs) {
			this.commandArgs = commandArgs;
		}

		public String getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(String namespaceId) {
			this.namespaceId = namespaceId;
		}

		public String getMountHost() {
			return this.mountHost;
		}

		public void setMountHost(String mountHost) {
			this.mountHost = mountHost;
		}

		public String getTomcatConfig() {
			return this.tomcatConfig;
		}

		public void setTomcatConfig(String tomcatConfig) {
			this.tomcatConfig = tomcatConfig;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public String getEnvs() {
			return this.envs;
		}

		public void setEnvs(String envs) {
			this.envs = envs;
		}

		public String getEnableAhas() {
			return this.enableAhas;
		}

		public void setEnableAhas(String enableAhas) {
			this.enableAhas = enableAhas;
		}

		public String getCustomHostAlias() {
			return this.customHostAlias;
		}

		public void setCustomHostAlias(String customHostAlias) {
			this.customHostAlias = customHostAlias;
		}

		public String getWebContainer() {
			return this.webContainer;
		}

		public void setWebContainer(String webContainer) {
			this.webContainer = webContainer;
		}

		public String getCommand() {
			return this.command;
		}

		public void setCommand(String command) {
			this.command = command;
		}

		public String getWarStartOptions() {
			return this.warStartOptions;
		}

		public void setWarStartOptions(String warStartOptions) {
			this.warStartOptions = warStartOptions;
		}

		public String getPhpArmsConfigLocation() {
			return this.phpArmsConfigLocation;
		}

		public void setPhpArmsConfigLocation(String phpArmsConfigLocation) {
			this.phpArmsConfigLocation = phpArmsConfigLocation;
		}

		public String getNasId() {
			return this.nasId;
		}

		public void setNasId(String nasId) {
			this.nasId = nasId;
		}

		public String getOssAkId() {
			return this.ossAkId;
		}

		public void setOssAkId(String ossAkId) {
			this.ossAkId = ossAkId;
		}

		public String getOssAkSecret() {
			return this.ossAkSecret;
		}

		public void setOssAkSecret(String ossAkSecret) {
			this.ossAkSecret = ossAkSecret;
		}

		public String getEdasContainerVersion() {
			return this.edasContainerVersion;
		}

		public void setEdasContainerVersion(String edasContainerVersion) {
			this.edasContainerVersion = edasContainerVersion;
		}

		public String getTimezone() {
			return this.timezone;
		}

		public void setTimezone(String timezone) {
			this.timezone = timezone;
		}

		public String getAppDescription() {
			return this.appDescription;
		}

		public void setAppDescription(String appDescription) {
			this.appDescription = appDescription;
		}

		public Boolean getEnableGreyTagRoute() {
			return this.enableGreyTagRoute;
		}

		public void setEnableGreyTagRoute(Boolean enableGreyTagRoute) {
			this.enableGreyTagRoute = enableGreyTagRoute;
		}

		public String getMseApplicationId() {
			return this.mseApplicationId;
		}

		public void setMseApplicationId(String mseApplicationId) {
			this.mseApplicationId = mseApplicationId;
		}

		public String getAcrInstanceId() {
			return this.acrInstanceId;
		}

		public void setAcrInstanceId(String acrInstanceId) {
			this.acrInstanceId = acrInstanceId;
		}

		public String getAcrAssumeRoleArn() {
			return this.acrAssumeRoleArn;
		}

		public void setAcrAssumeRoleArn(String acrAssumeRoleArn) {
			this.acrAssumeRoleArn = acrAssumeRoleArn;
		}

		public Boolean getAssociateEip() {
			return this.associateEip;
		}

		public void setAssociateEip(Boolean associateEip) {
			this.associateEip = associateEip;
		}

		public String getKafkaConfigs() {
			return this.kafkaConfigs;
		}

		public void setKafkaConfigs(String kafkaConfigs) {
			this.kafkaConfigs = kafkaConfigs;
		}

		public String getProgrammingLanguage() {
			return this.programmingLanguage;
		}

		public void setProgrammingLanguage(String programmingLanguage) {
			this.programmingLanguage = programmingLanguage;
		}

		public List<ConfigMapMountDescItem> getConfigMapMountDesc() {
			return this.configMapMountDesc;
		}

		public void setConfigMapMountDesc(List<ConfigMapMountDescItem> configMapMountDesc) {
			this.configMapMountDesc = configMapMountDesc;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<MountDescItem> getMountDesc() {
			return this.mountDesc;
		}

		public void setMountDesc(List<MountDescItem> mountDesc) {
			this.mountDesc = mountDesc;
		}

		public List<OssMountDesc> getOssMountDescs() {
			return this.ossMountDescs;
		}

		public void setOssMountDescs(List<OssMountDesc> ossMountDescs) {
			this.ossMountDescs = ossMountDescs;
		}

		public static class ConfigMapMountDescItem {

			private String key;

			private String configMapName;

			private String mountPath;

			private Long configMapId;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getConfigMapName() {
				return this.configMapName;
			}

			public void setConfigMapName(String configMapName) {
				this.configMapName = configMapName;
			}

			public String getMountPath() {
				return this.mountPath;
			}

			public void setMountPath(String mountPath) {
				this.mountPath = mountPath;
			}

			public Long getConfigMapId() {
				return this.configMapId;
			}

			public void setConfigMapId(Long configMapId) {
				this.configMapId = configMapId;
			}
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class MountDescItem {

			private String mountPath;

			private String nasPath;

			public String getMountPath() {
				return this.mountPath;
			}

			public void setMountPath(String mountPath) {
				this.mountPath = mountPath;
			}

			public String getNasPath() {
				return this.nasPath;
			}

			public void setNasPath(String nasPath) {
				this.nasPath = nasPath;
			}
		}

		public static class OssMountDesc {

			private String bucketName;

			private String bucketPath;

			private String mountPath;

			private Boolean readOnly;

			public String getBucketName() {
				return this.bucketName;
			}

			public void setBucketName(String bucketName) {
				this.bucketName = bucketName;
			}

			public String getBucketPath() {
				return this.bucketPath;
			}

			public void setBucketPath(String bucketPath) {
				this.bucketPath = bucketPath;
			}

			public String getMountPath() {
				return this.mountPath;
			}

			public void setMountPath(String mountPath) {
				this.mountPath = mountPath;
			}

			public Boolean getReadOnly() {
				return this.readOnly;
			}

			public void setReadOnly(Boolean readOnly) {
				this.readOnly = readOnly;
			}
		}
	}

	@Override
	public DescribeApplicationConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeApplicationConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
