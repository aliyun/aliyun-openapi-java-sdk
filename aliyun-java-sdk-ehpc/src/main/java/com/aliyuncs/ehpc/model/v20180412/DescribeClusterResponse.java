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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.DescribeClusterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterResponse extends AcsResponse {

	private String requestId;

	private ClusterInfo clusterInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ClusterInfo getClusterInfo() {
		return this.clusterInfo;
	}

	public void setClusterInfo(ClusterInfo clusterInfo) {
		this.clusterInfo = clusterInfo;
	}

	public static class ClusterInfo {

		private String status;

		private String vpcId;

		private String keyPairName;

		private String ecsChargeType;

		private String securityGroupId;

		private String sccClusterId;

		private String createTime;

		private String accountType;

		private String volumeProtocol;

		private String description;

		private String volumeId;

		private Boolean haEnable;

		private String baseOsTag;

		private String name;

		private String imageId;

		private String schedulerType;

		private String deployMode;

		private String imageOwnerAlias;

		private String osTag;

		private String volumeMountpoint;

		private String remoteDirectory;

		private String regionId;

		private String vSwitchId;

		private String imageName;

		private String volumeType;

		private String location;

		private String id;

		private String clientVersion;

		private String ramRoleName;

		private String ramNodeTypes;

		private List<ApplicationInfo> applications;

		private List<PostInstallScriptInfo> postInstallScripts;

		private List<OnPremiseInfoItem> onPremiseInfo;

		private EcsInfo ecsInfo;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getKeyPairName() {
			return this.keyPairName;
		}

		public void setKeyPairName(String keyPairName) {
			this.keyPairName = keyPairName;
		}

		public String getEcsChargeType() {
			return this.ecsChargeType;
		}

		public void setEcsChargeType(String ecsChargeType) {
			this.ecsChargeType = ecsChargeType;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getSccClusterId() {
			return this.sccClusterId;
		}

		public void setSccClusterId(String sccClusterId) {
			this.sccClusterId = sccClusterId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getVolumeProtocol() {
			return this.volumeProtocol;
		}

		public void setVolumeProtocol(String volumeProtocol) {
			this.volumeProtocol = volumeProtocol;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getVolumeId() {
			return this.volumeId;
		}

		public void setVolumeId(String volumeId) {
			this.volumeId = volumeId;
		}

		public Boolean getHaEnable() {
			return this.haEnable;
		}

		public void setHaEnable(Boolean haEnable) {
			this.haEnable = haEnable;
		}

		public String getBaseOsTag() {
			return this.baseOsTag;
		}

		public void setBaseOsTag(String baseOsTag) {
			this.baseOsTag = baseOsTag;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getSchedulerType() {
			return this.schedulerType;
		}

		public void setSchedulerType(String schedulerType) {
			this.schedulerType = schedulerType;
		}

		public String getDeployMode() {
			return this.deployMode;
		}

		public void setDeployMode(String deployMode) {
			this.deployMode = deployMode;
		}

		public String getImageOwnerAlias() {
			return this.imageOwnerAlias;
		}

		public void setImageOwnerAlias(String imageOwnerAlias) {
			this.imageOwnerAlias = imageOwnerAlias;
		}

		public String getOsTag() {
			return this.osTag;
		}

		public void setOsTag(String osTag) {
			this.osTag = osTag;
		}

		public String getVolumeMountpoint() {
			return this.volumeMountpoint;
		}

		public void setVolumeMountpoint(String volumeMountpoint) {
			this.volumeMountpoint = volumeMountpoint;
		}

		public String getRemoteDirectory() {
			return this.remoteDirectory;
		}

		public void setRemoteDirectory(String remoteDirectory) {
			this.remoteDirectory = remoteDirectory;
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

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getVolumeType() {
			return this.volumeType;
		}

		public void setVolumeType(String volumeType) {
			this.volumeType = volumeType;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getClientVersion() {
			return this.clientVersion;
		}

		public void setClientVersion(String clientVersion) {
			this.clientVersion = clientVersion;
		}

		public String getRamRoleName() {
			return this.ramRoleName;
		}

		public void setRamRoleName(String ramRoleName) {
			this.ramRoleName = ramRoleName;
		}

		public String getRamNodeTypes() {
			return this.ramNodeTypes;
		}

		public void setRamNodeTypes(String ramNodeTypes) {
			this.ramNodeTypes = ramNodeTypes;
		}

		public List<ApplicationInfo> getApplications() {
			return this.applications;
		}

		public void setApplications(List<ApplicationInfo> applications) {
			this.applications = applications;
		}

		public List<PostInstallScriptInfo> getPostInstallScripts() {
			return this.postInstallScripts;
		}

		public void setPostInstallScripts(List<PostInstallScriptInfo> postInstallScripts) {
			this.postInstallScripts = postInstallScripts;
		}

		public List<OnPremiseInfoItem> getOnPremiseInfo() {
			return this.onPremiseInfo;
		}

		public void setOnPremiseInfo(List<OnPremiseInfoItem> onPremiseInfo) {
			this.onPremiseInfo = onPremiseInfo;
		}

		public EcsInfo getEcsInfo() {
			return this.ecsInfo;
		}

		public void setEcsInfo(EcsInfo ecsInfo) {
			this.ecsInfo = ecsInfo;
		}

		public static class ApplicationInfo {

			private String tag;

			private String name;

			private String version;

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}
		}

		public static class PostInstallScriptInfo {

			private String url;

			private String args;

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getArgs() {
				return this.args;
			}

			public void setArgs(String args) {
				this.args = args;
			}
		}

		public static class OnPremiseInfoItem {

			private String type;

			private String hostName;

			private String iP;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getHostName() {
				return this.hostName;
			}

			public void setHostName(String hostName) {
				this.hostName = hostName;
			}

			public String getIP() {
				return this.iP;
			}

			public void setIP(String iP) {
				this.iP = iP;
			}
		}

		public static class EcsInfo {

			private Manager manager;

			private Compute compute;

			private Login login;

			private ProxyMgr proxyMgr;

			public Manager getManager() {
				return this.manager;
			}

			public void setManager(Manager manager) {
				this.manager = manager;
			}

			public Compute getCompute() {
				return this.compute;
			}

			public void setCompute(Compute compute) {
				this.compute = compute;
			}

			public Login getLogin() {
				return this.login;
			}

			public void setLogin(Login login) {
				this.login = login;
			}

			public ProxyMgr getProxyMgr() {
				return this.proxyMgr;
			}

			public void setProxyMgr(ProxyMgr proxyMgr) {
				this.proxyMgr = proxyMgr;
			}

			public static class Manager {

				private String instanceType;

				private Integer count;

				public String getInstanceType() {
					return this.instanceType;
				}

				public void setInstanceType(String instanceType) {
					this.instanceType = instanceType;
				}

				public Integer getCount() {
					return this.count;
				}

				public void setCount(Integer count) {
					this.count = count;
				}
			}

			public static class Compute {

				private String instanceType;

				private Integer count;

				public String getInstanceType() {
					return this.instanceType;
				}

				public void setInstanceType(String instanceType) {
					this.instanceType = instanceType;
				}

				public Integer getCount() {
					return this.count;
				}

				public void setCount(Integer count) {
					this.count = count;
				}
			}

			public static class Login {

				private String instanceType;

				private Integer count;

				public String getInstanceType() {
					return this.instanceType;
				}

				public void setInstanceType(String instanceType) {
					this.instanceType = instanceType;
				}

				public Integer getCount() {
					return this.count;
				}

				public void setCount(Integer count) {
					this.count = count;
				}
			}

			public static class ProxyMgr {

				private String instanceType;

				private Integer count;

				public String getInstanceType() {
					return this.instanceType;
				}

				public void setInstanceType(String instanceType) {
					this.instanceType = instanceType;
				}

				public Integer getCount() {
					return this.count;
				}

				public void setCount(Integer count) {
					this.count = count;
				}
			}
		}
	}

	@Override
	public DescribeClusterResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterResponseUnmarshaller.unmarshall(this, context);
	}
}
