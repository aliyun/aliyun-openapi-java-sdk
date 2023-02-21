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

package com.aliyuncs.eflo_controller.model.v20221215;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eflo_controller.transform.v20221215.ListClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClustersResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<ClustersItem> clusters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<ClustersItem> getClusters() {
		return this.clusters;
	}

	public void setClusters(List<ClustersItem> clusters) {
		this.clusters = clusters;
	}

	public static class ClustersItem {

		private Object components;

		private String clusterId;

		private String clusterName;

		private String operatingState;

		private String taskId;

		private String clusterType;

		private Long nodeCount;

		private Long nodeGroupCount;

		private String createTime;

		private String updateTime;

		private String clusterDescription;

		private String resourceGroupId;

		public Object getComponents() {
			return this.components;
		}

		public void setComponents(Object components) {
			this.components = components;
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

		public String getOperatingState() {
			return this.operatingState;
		}

		public void setOperatingState(String operatingState) {
			this.operatingState = operatingState;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}

		public Long getNodeCount() {
			return this.nodeCount;
		}

		public void setNodeCount(Long nodeCount) {
			this.nodeCount = nodeCount;
		}

		public Long getNodeGroupCount() {
			return this.nodeGroupCount;
		}

		public void setNodeGroupCount(Long nodeGroupCount) {
			this.nodeGroupCount = nodeGroupCount;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getClusterDescription() {
			return this.clusterDescription;
		}

		public void setClusterDescription(String clusterDescription) {
			this.clusterDescription = clusterDescription;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}
	}

	@Override
	public ListClustersResponse getInstance(UnmarshallerContext context) {
		return	ListClustersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
