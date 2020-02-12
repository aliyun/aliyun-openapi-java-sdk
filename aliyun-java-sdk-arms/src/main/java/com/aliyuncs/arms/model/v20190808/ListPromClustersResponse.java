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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.ListPromClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPromClustersResponse extends AcsResponse {

	private String requestId;

	private List<PromCluster> promClusterList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PromCluster> getPromClusterList() {
		return this.promClusterList;
	}

	public void setPromClusterList(List<PromCluster> promClusterList) {
		this.promClusterList = promClusterList;
	}

	public static class PromCluster {

		private Long id;

		private String clusterId;

		private String clusterName;

		private String agentStatus;

		private String clusterType;

		private String controllerId;

		private Boolean isControllerInstalled;

		private String userId;

		private String regionId;

		private String pluginsJsonArray;

		private String stateJson;

		private Integer nodeNum;

		private Long createTime;

		private Long updateTime;

		private Long lastHeartBeatTime;

		private Long installTime;

		private String extra;

		private String options;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getAgentStatus() {
			return this.agentStatus;
		}

		public void setAgentStatus(String agentStatus) {
			this.agentStatus = agentStatus;
		}

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}

		public String getControllerId() {
			return this.controllerId;
		}

		public void setControllerId(String controllerId) {
			this.controllerId = controllerId;
		}

		public Boolean getIsControllerInstalled() {
			return this.isControllerInstalled;
		}

		public void setIsControllerInstalled(Boolean isControllerInstalled) {
			this.isControllerInstalled = isControllerInstalled;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getPluginsJsonArray() {
			return this.pluginsJsonArray;
		}

		public void setPluginsJsonArray(String pluginsJsonArray) {
			this.pluginsJsonArray = pluginsJsonArray;
		}

		public String getStateJson() {
			return this.stateJson;
		}

		public void setStateJson(String stateJson) {
			this.stateJson = stateJson;
		}

		public Integer getNodeNum() {
			return this.nodeNum;
		}

		public void setNodeNum(Integer nodeNum) {
			this.nodeNum = nodeNum;
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

		public Long getLastHeartBeatTime() {
			return this.lastHeartBeatTime;
		}

		public void setLastHeartBeatTime(Long lastHeartBeatTime) {
			this.lastHeartBeatTime = lastHeartBeatTime;
		}

		public Long getInstallTime() {
			return this.installTime;
		}

		public void setInstallTime(Long installTime) {
			this.installTime = installTime;
		}

		public String getExtra() {
			return this.extra;
		}

		public void setExtra(String extra) {
			this.extra = extra;
		}

		public String getOptions() {
			return this.options;
		}

		public void setOptions(String options) {
			this.options = options;
		}
	}

	@Override
	public ListPromClustersResponse getInstance(UnmarshallerContext context) {
		return	ListPromClustersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
