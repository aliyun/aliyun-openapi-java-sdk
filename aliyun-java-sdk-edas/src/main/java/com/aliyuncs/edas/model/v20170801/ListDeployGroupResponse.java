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
import com.aliyuncs.edas.transform.v20170801.ListDeployGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDeployGroupResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<DeployGroup> deployGroupList;

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

	public List<DeployGroup> getDeployGroupList() {
		return this.deployGroupList;
	}

	public void setDeployGroupList(List<DeployGroup> deployGroupList) {
		this.deployGroupList = deployGroupList;
	}

	public static class DeployGroup {

		private String vServerGroupId;

		private String status;

		private String cpuRequest;

		private Long updateTime;

		private String memoryRequest;

		private String nameSpace;

		private String appVersionId;

		private Long createTime;

		private String deploymentName;

		private String preStop;

		private String packageUrl;

		private String packageVersion;

		private String baseComponentMetaName;

		private String csClusterId;

		private String appId;

		private Long lastUpdateTime;

		private String env;

		private String cpuLimit;

		private Integer groupType;

		private String clusterId;

		private String postStart;

		private String labels;

		private String memoryLimit;

		private String strategy;

		private String selector;

		private String groupId;

		private String groupName;

		private String clusterName;

		private String packageVersionId;

		private String reversion;

		private String vExtServerGroupId;

		private String packagePublicUrl;

		public String getVServerGroupId() {
			return this.vServerGroupId;
		}

		public void setVServerGroupId(String vServerGroupId) {
			this.vServerGroupId = vServerGroupId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCpuRequest() {
			return this.cpuRequest;
		}

		public void setCpuRequest(String cpuRequest) {
			this.cpuRequest = cpuRequest;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getMemoryRequest() {
			return this.memoryRequest;
		}

		public void setMemoryRequest(String memoryRequest) {
			this.memoryRequest = memoryRequest;
		}

		public String getNameSpace() {
			return this.nameSpace;
		}

		public void setNameSpace(String nameSpace) {
			this.nameSpace = nameSpace;
		}

		public String getAppVersionId() {
			return this.appVersionId;
		}

		public void setAppVersionId(String appVersionId) {
			this.appVersionId = appVersionId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getDeploymentName() {
			return this.deploymentName;
		}

		public void setDeploymentName(String deploymentName) {
			this.deploymentName = deploymentName;
		}

		public String getPreStop() {
			return this.preStop;
		}

		public void setPreStop(String preStop) {
			this.preStop = preStop;
		}

		public String getPackageUrl() {
			return this.packageUrl;
		}

		public void setPackageUrl(String packageUrl) {
			this.packageUrl = packageUrl;
		}

		public String getPackageVersion() {
			return this.packageVersion;
		}

		public void setPackageVersion(String packageVersion) {
			this.packageVersion = packageVersion;
		}

		public String getBaseComponentMetaName() {
			return this.baseComponentMetaName;
		}

		public void setBaseComponentMetaName(String baseComponentMetaName) {
			this.baseComponentMetaName = baseComponentMetaName;
		}

		public String getCsClusterId() {
			return this.csClusterId;
		}

		public void setCsClusterId(String csClusterId) {
			this.csClusterId = csClusterId;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public Long getLastUpdateTime() {
			return this.lastUpdateTime;
		}

		public void setLastUpdateTime(Long lastUpdateTime) {
			this.lastUpdateTime = lastUpdateTime;
		}

		public String getEnv() {
			return this.env;
		}

		public void setEnv(String env) {
			this.env = env;
		}

		public String getCpuLimit() {
			return this.cpuLimit;
		}

		public void setCpuLimit(String cpuLimit) {
			this.cpuLimit = cpuLimit;
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

		public String getPostStart() {
			return this.postStart;
		}

		public void setPostStart(String postStart) {
			this.postStart = postStart;
		}

		public String getLabels() {
			return this.labels;
		}

		public void setLabels(String labels) {
			this.labels = labels;
		}

		public String getMemoryLimit() {
			return this.memoryLimit;
		}

		public void setMemoryLimit(String memoryLimit) {
			this.memoryLimit = memoryLimit;
		}

		public String getStrategy() {
			return this.strategy;
		}

		public void setStrategy(String strategy) {
			this.strategy = strategy;
		}

		public String getSelector() {
			return this.selector;
		}

		public void setSelector(String selector) {
			this.selector = selector;
		}

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

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getPackageVersionId() {
			return this.packageVersionId;
		}

		public void setPackageVersionId(String packageVersionId) {
			this.packageVersionId = packageVersionId;
		}

		public String getReversion() {
			return this.reversion;
		}

		public void setReversion(String reversion) {
			this.reversion = reversion;
		}

		public String getVExtServerGroupId() {
			return this.vExtServerGroupId;
		}

		public void setVExtServerGroupId(String vExtServerGroupId) {
			this.vExtServerGroupId = vExtServerGroupId;
		}

		public String getPackagePublicUrl() {
			return this.packagePublicUrl;
		}

		public void setPackagePublicUrl(String packagePublicUrl) {
			this.packagePublicUrl = packagePublicUrl;
		}
	}

	@Override
	public ListDeployGroupResponse getInstance(UnmarshallerContext context) {
		return	ListDeployGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
