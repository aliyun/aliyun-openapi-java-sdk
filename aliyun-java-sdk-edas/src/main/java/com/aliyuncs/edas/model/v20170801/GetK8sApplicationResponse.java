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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.GetK8sApplicationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetK8sApplicationResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Applcation applcation;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Applcation getApplcation() {
		return this.applcation;
	}

	public void setApplcation(Applcation applcation) {
		this.applcation = applcation;
	}

	public static class Applcation {

		private String appId;

		private List<DeployGroup> deployGroups;

		private ImageInfo imageInfo;

		private App app;

		private Conf conf;

		private LatestVersion latestVersion;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public List<DeployGroup> getDeployGroups() {
			return this.deployGroups;
		}

		public void setDeployGroups(List<DeployGroup> deployGroups) {
			this.deployGroups = deployGroups;
		}

		public ImageInfo getImageInfo() {
			return this.imageInfo;
		}

		public void setImageInfo(ImageInfo imageInfo) {
			this.imageInfo = imageInfo;
		}

		public App getApp() {
			return this.app;
		}

		public void setApp(App app) {
			this.app = app;
		}

		public Conf getConf() {
			return this.conf;
		}

		public void setConf(Conf conf) {
			this.conf = conf;
		}

		public LatestVersion getLatestVersion() {
			return this.latestVersion;
		}

		public void setLatestVersion(LatestVersion latestVersion) {
			this.latestVersion = latestVersion;
		}

		public static class DeployGroup {

			private List<ComponentsItem> components;

			public List<ComponentsItem> getComponents() {
				return this.components;
			}

			public void setComponents(List<ComponentsItem> components) {
				this.components = components;
			}

			public static class ComponentsItem {

				private String componentId;

				private String componentKey;

				private String type;

				public String getComponentId() {
					return this.componentId;
				}

				public void setComponentId(String componentId) {
					this.componentId = componentId;
				}

				public String getComponentKey() {
					return this.componentKey;
				}

				public void setComponentKey(String componentKey) {
					this.componentKey = componentKey;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}
		}

		public static class ImageInfo {

			private String imageUrl;

			private String repoName;

			private String regionId;

			private String repoId;

			private String repoNamespace;

			private String repoOriginType;

			private String tag;

			public String getImageUrl() {
				return this.imageUrl;
			}

			public void setImageUrl(String imageUrl) {
				this.imageUrl = imageUrl;
			}

			public String getRepoName() {
				return this.repoName;
			}

			public void setRepoName(String repoName) {
				this.repoName = repoName;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getRepoId() {
				return this.repoId;
			}

			public void setRepoId(String repoId) {
				this.repoId = repoId;
			}

			public String getRepoNamespace() {
				return this.repoNamespace;
			}

			public void setRepoNamespace(String repoNamespace) {
				this.repoNamespace = repoNamespace;
			}

			public String getRepoOriginType() {
				return this.repoOriginType;
			}

			public void setRepoOriginType(String repoOriginType) {
				this.repoOriginType = repoOriginType;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}
		}

		public static class App {

			private String applicationType;

			private String cmd;

			private String deployType;

			private String edasContainerVersion;

			private Integer buildpackId;

			private String tomcatVersion;

			private Integer instancesBeforeScaling;

			private String appId;

			private String applicationName;

			private String clusterId;

			private Integer instances;

			private String csClusterId;

			private Integer limitCpuM;

			private Integer requestCpuM;

			private Integer limitMem;

			private Integer requestMem;

			private String k8sNamespace;

			private String regionId;

			private List<Env> envList;

			private List<String> cmdArgs;

			public String getApplicationType() {
				return this.applicationType;
			}

			public void setApplicationType(String applicationType) {
				this.applicationType = applicationType;
			}

			public String getCmd() {
				return this.cmd;
			}

			public void setCmd(String cmd) {
				this.cmd = cmd;
			}

			public String getDeployType() {
				return this.deployType;
			}

			public void setDeployType(String deployType) {
				this.deployType = deployType;
			}

			public String getEdasContainerVersion() {
				return this.edasContainerVersion;
			}

			public void setEdasContainerVersion(String edasContainerVersion) {
				this.edasContainerVersion = edasContainerVersion;
			}

			public Integer getBuildpackId() {
				return this.buildpackId;
			}

			public void setBuildpackId(Integer buildpackId) {
				this.buildpackId = buildpackId;
			}

			public String getTomcatVersion() {
				return this.tomcatVersion;
			}

			public void setTomcatVersion(String tomcatVersion) {
				this.tomcatVersion = tomcatVersion;
			}

			public Integer getInstancesBeforeScaling() {
				return this.instancesBeforeScaling;
			}

			public void setInstancesBeforeScaling(Integer instancesBeforeScaling) {
				this.instancesBeforeScaling = instancesBeforeScaling;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getApplicationName() {
				return this.applicationName;
			}

			public void setApplicationName(String applicationName) {
				this.applicationName = applicationName;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public Integer getInstances() {
				return this.instances;
			}

			public void setInstances(Integer instances) {
				this.instances = instances;
			}

			public String getCsClusterId() {
				return this.csClusterId;
			}

			public void setCsClusterId(String csClusterId) {
				this.csClusterId = csClusterId;
			}

			public Integer getLimitCpuM() {
				return this.limitCpuM;
			}

			public void setLimitCpuM(Integer limitCpuM) {
				this.limitCpuM = limitCpuM;
			}

			public Integer getRequestCpuM() {
				return this.requestCpuM;
			}

			public void setRequestCpuM(Integer requestCpuM) {
				this.requestCpuM = requestCpuM;
			}

			public Integer getLimitMem() {
				return this.limitMem;
			}

			public void setLimitMem(Integer limitMem) {
				this.limitMem = limitMem;
			}

			public Integer getRequestMem() {
				return this.requestMem;
			}

			public void setRequestMem(Integer requestMem) {
				this.requestMem = requestMem;
			}

			public String getK8sNamespace() {
				return this.k8sNamespace;
			}

			public void setK8sNamespace(String k8sNamespace) {
				this.k8sNamespace = k8sNamespace;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public List<Env> getEnvList() {
				return this.envList;
			}

			public void setEnvList(List<Env> envList) {
				this.envList = envList;
			}

			public List<String> getCmdArgs() {
				return this.cmdArgs;
			}

			public void setCmdArgs(List<String> cmdArgs) {
				this.cmdArgs = cmdArgs;
			}

			public static class Env {

				private String name;

				private String value;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class Conf {

			private String jarStartArgs;

			private String jarStartOptions;

			private String k8sCmd;

			private String k8sCmdArgs;

			private String k8sLocalvolumeInfo;

			private String k8sNasInfo;

			private String k8sVolumeInfo;

			private String liveness;

			private String postStart;

			private String preStop;

			private String readiness;

			private String runtimeClassName;

			private String deployAcrossZones;

			private Boolean ahasEnabled;

			private String deployAcrossNodes;

			public String getJarStartArgs() {
				return this.jarStartArgs;
			}

			public void setJarStartArgs(String jarStartArgs) {
				this.jarStartArgs = jarStartArgs;
			}

			public String getJarStartOptions() {
				return this.jarStartOptions;
			}

			public void setJarStartOptions(String jarStartOptions) {
				this.jarStartOptions = jarStartOptions;
			}

			public String getK8sCmd() {
				return this.k8sCmd;
			}

			public void setK8sCmd(String k8sCmd) {
				this.k8sCmd = k8sCmd;
			}

			public String getK8sCmdArgs() {
				return this.k8sCmdArgs;
			}

			public void setK8sCmdArgs(String k8sCmdArgs) {
				this.k8sCmdArgs = k8sCmdArgs;
			}

			public String getK8sLocalvolumeInfo() {
				return this.k8sLocalvolumeInfo;
			}

			public void setK8sLocalvolumeInfo(String k8sLocalvolumeInfo) {
				this.k8sLocalvolumeInfo = k8sLocalvolumeInfo;
			}

			public String getK8sNasInfo() {
				return this.k8sNasInfo;
			}

			public void setK8sNasInfo(String k8sNasInfo) {
				this.k8sNasInfo = k8sNasInfo;
			}

			public String getK8sVolumeInfo() {
				return this.k8sVolumeInfo;
			}

			public void setK8sVolumeInfo(String k8sVolumeInfo) {
				this.k8sVolumeInfo = k8sVolumeInfo;
			}

			public String getLiveness() {
				return this.liveness;
			}

			public void setLiveness(String liveness) {
				this.liveness = liveness;
			}

			public String getPostStart() {
				return this.postStart;
			}

			public void setPostStart(String postStart) {
				this.postStart = postStart;
			}

			public String getPreStop() {
				return this.preStop;
			}

			public void setPreStop(String preStop) {
				this.preStop = preStop;
			}

			public String getReadiness() {
				return this.readiness;
			}

			public void setReadiness(String readiness) {
				this.readiness = readiness;
			}

			public String getRuntimeClassName() {
				return this.runtimeClassName;
			}

			public void setRuntimeClassName(String runtimeClassName) {
				this.runtimeClassName = runtimeClassName;
			}

			public String getDeployAcrossZones() {
				return this.deployAcrossZones;
			}

			public void setDeployAcrossZones(String deployAcrossZones) {
				this.deployAcrossZones = deployAcrossZones;
			}

			public Boolean getAhasEnabled() {
				return this.ahasEnabled;
			}

			public void setAhasEnabled(Boolean ahasEnabled) {
				this.ahasEnabled = ahasEnabled;
			}

			public String getDeployAcrossNodes() {
				return this.deployAcrossNodes;
			}

			public void setDeployAcrossNodes(String deployAcrossNodes) {
				this.deployAcrossNodes = deployAcrossNodes;
			}
		}

		public static class LatestVersion {

			private String packageVersion;

			private String url;

			private String warUrl;

			public String getPackageVersion() {
				return this.packageVersion;
			}

			public void setPackageVersion(String packageVersion) {
				this.packageVersion = packageVersion;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getWarUrl() {
				return this.warUrl;
			}

			public void setWarUrl(String warUrl) {
				this.warUrl = warUrl;
			}
		}
	}

	@Override
	public GetK8sApplicationResponse getInstance(UnmarshallerContext context) {
		return	GetK8sApplicationResponseUnmarshaller.unmarshall(this, context);
	}
}
