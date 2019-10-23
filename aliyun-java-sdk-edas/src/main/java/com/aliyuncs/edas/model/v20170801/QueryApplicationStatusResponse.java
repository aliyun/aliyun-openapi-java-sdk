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
import com.aliyuncs.edas.transform.v20170801.QueryApplicationStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryApplicationStatusResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private AppInfo appInfo;

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

	public AppInfo getAppInfo() {
		return this.appInfo;
	}

	public void setAppInfo(AppInfo appInfo) {
		this.appInfo = appInfo;
	}

	public static class AppInfo {

		private List<Ecu> ecuList;

		private List<Ecc> eccList;

		private List<Group> groupList;

		private List<DeployRecord> deployRecordList;

		private Application application;

		public List<Ecu> getEcuList() {
			return this.ecuList;
		}

		public void setEcuList(List<Ecu> ecuList) {
			this.ecuList = ecuList;
		}

		public List<Ecc> getEccList() {
			return this.eccList;
		}

		public void setEccList(List<Ecc> eccList) {
			this.eccList = eccList;
		}

		public List<Group> getGroupList() {
			return this.groupList;
		}

		public void setGroupList(List<Group> groupList) {
			this.groupList = groupList;
		}

		public List<DeployRecord> getDeployRecordList() {
			return this.deployRecordList;
		}

		public void setDeployRecordList(List<DeployRecord> deployRecordList) {
			this.deployRecordList = deployRecordList;
		}

		public Application getApplication() {
			return this.application;
		}

		public void setApplication(Application application) {
			this.application = application;
		}

		public static class Ecu {

			private String ecuId;

			private Boolean online;

			private Boolean dockerEnv;

			private Long createTime;

			private Long updateTime;

			private String ipAddr;

			private Long heartbeatTime;

			private String userId;

			private String groupId;

			private String name;

			private String zoneId;

			private String regionId;

			private String instanceId;

			private String vpcId;

			private String regionId1;

			private Integer availableCpu;

			private Integer availableMem;

			public String getEcuId() {
				return this.ecuId;
			}

			public void setEcuId(String ecuId) {
				this.ecuId = ecuId;
			}

			public Boolean getOnline() {
				return this.online;
			}

			public void setOnline(Boolean online) {
				this.online = online;
			}

			public Boolean getDockerEnv() {
				return this.dockerEnv;
			}

			public void setDockerEnv(Boolean dockerEnv) {
				this.dockerEnv = dockerEnv;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Long getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Long updateTime) {
				this.updateTime = updateTime;
			}

			public String getIpAddr() {
				return this.ipAddr;
			}

			public void setIpAddr(String ipAddr) {
				this.ipAddr = ipAddr;
			}

			public Long getHeartbeatTime() {
				return this.heartbeatTime;
			}

			public void setHeartbeatTime(Long heartbeatTime) {
				this.heartbeatTime = heartbeatTime;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getRegionId1() {
				return this.regionId1;
			}

			public void setRegionId1(String regionId1) {
				this.regionId1 = regionId1;
			}

			public Integer getAvailableCpu() {
				return this.availableCpu;
			}

			public void setAvailableCpu(Integer availableCpu) {
				this.availableCpu = availableCpu;
			}

			public Integer getAvailableMem() {
				return this.availableMem;
			}

			public void setAvailableMem(Integer availableMem) {
				this.availableMem = availableMem;
			}
		}

		public static class Ecc {

			private String eccId;

			private String ecuId;

			private String appId;

			private Integer appState;

			private Integer taskState;

			private Long createTime;

			private Long updateTime;

			private String ip;

			private String vpcId;

			private String groupId;

			private String containerStatus;

			public String getEccId() {
				return this.eccId;
			}

			public void setEccId(String eccId) {
				this.eccId = eccId;
			}

			public String getEcuId() {
				return this.ecuId;
			}

			public void setEcuId(String ecuId) {
				this.ecuId = ecuId;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public Integer getAppState() {
				return this.appState;
			}

			public void setAppState(Integer appState) {
				this.appState = appState;
			}

			public Integer getTaskState() {
				return this.taskState;
			}

			public void setTaskState(Integer taskState) {
				this.taskState = taskState;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Long getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Long updateTime) {
				this.updateTime = updateTime;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getContainerStatus() {
				return this.containerStatus;
			}

			public void setContainerStatus(String containerStatus) {
				this.containerStatus = containerStatus;
			}
		}

		public static class Group {

			private String groupId;

			private String groupName;

			private String appId;

			private String packageVersionId;

			private String appVersionId;

			private Integer groupType;

			private String clusterId;

			private Long createTime;

			private Long updateTime;

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getPackageVersionId() {
				return this.packageVersionId;
			}

			public void setPackageVersionId(String packageVersionId) {
				this.packageVersionId = packageVersionId;
			}

			public String getAppVersionId() {
				return this.appVersionId;
			}

			public void setAppVersionId(String appVersionId) {
				this.appVersionId = appVersionId;
			}

			public Integer getGroupType() {
				return this.groupType;
			}

			public void setGroupType(Integer groupType) {
				this.groupType = groupType;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Long getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Long updateTime) {
				this.updateTime = updateTime;
			}
		}

		public static class DeployRecord {

			private String deployRecordId;

			private String eccId;

			private String ecuId;

			private String packageVersionId;

			private String packageMd5;

			private Long createTime;

			public String getDeployRecordId() {
				return this.deployRecordId;
			}

			public void setDeployRecordId(String deployRecordId) {
				this.deployRecordId = deployRecordId;
			}

			public String getEccId() {
				return this.eccId;
			}

			public void setEccId(String eccId) {
				this.eccId = eccId;
			}

			public String getEcuId() {
				return this.ecuId;
			}

			public void setEcuId(String ecuId) {
				this.ecuId = ecuId;
			}

			public String getPackageVersionId() {
				return this.packageVersionId;
			}

			public void setPackageVersionId(String packageVersionId) {
				this.packageVersionId = packageVersionId;
			}

			public String getPackageMd5() {
				return this.packageMd5;
			}

			public void setPackageMd5(String packageMd5) {
				this.packageMd5 = packageMd5;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}
		}

		public static class Application {

			private String applicationId;

			private Integer buildPackageId;

			private String clusterId;

			private Integer cpu;

			private Long createTime;

			private Boolean dockerize;

			private String email;

			private String healthCheckUrl;

			private Integer instanceCount;

			private Long launchTime;

			private Integer memory;

			private String name;

			private String owner;

			private String phone;

			private Integer port;

			private String regionId;

			private Integer runningInstanceCount;

			private String userId;

			public String getApplicationId() {
				return this.applicationId;
			}

			public void setApplicationId(String applicationId) {
				this.applicationId = applicationId;
			}

			public Integer getBuildPackageId() {
				return this.buildPackageId;
			}

			public void setBuildPackageId(Integer buildPackageId) {
				this.buildPackageId = buildPackageId;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public Integer getCpu() {
				return this.cpu;
			}

			public void setCpu(Integer cpu) {
				this.cpu = cpu;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Boolean getDockerize() {
				return this.dockerize;
			}

			public void setDockerize(Boolean dockerize) {
				this.dockerize = dockerize;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getHealthCheckUrl() {
				return this.healthCheckUrl;
			}

			public void setHealthCheckUrl(String healthCheckUrl) {
				this.healthCheckUrl = healthCheckUrl;
			}

			public Integer getInstanceCount() {
				return this.instanceCount;
			}

			public void setInstanceCount(Integer instanceCount) {
				this.instanceCount = instanceCount;
			}

			public Long getLaunchTime() {
				return this.launchTime;
			}

			public void setLaunchTime(Long launchTime) {
				this.launchTime = launchTime;
			}

			public Integer getMemory() {
				return this.memory;
			}

			public void setMemory(Integer memory) {
				this.memory = memory;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getPhone() {
				return this.phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public Integer getRunningInstanceCount() {
				return this.runningInstanceCount;
			}

			public void setRunningInstanceCount(Integer runningInstanceCount) {
				this.runningInstanceCount = runningInstanceCount;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}
	}

	@Override
	public QueryApplicationStatusResponse getInstance(UnmarshallerContext context) {
		return	QueryApplicationStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
