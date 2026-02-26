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
import com.aliyuncs.eflo_controller.transform.v20221215.DescribeClusterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterResponse extends AcsResponse {

	private String requestId;

	private String createTime;

	private Long nodeCount;

	private Long nodeGroupCount;

	private String updateTime;

	private String clusterDescription;

	private String operatingState;

	private String clusterId;

	private String clusterName;

	private String taskId;

	private String clusterType;

	private String resourceGroupId;

	private List<ComponentsItem> components;

	private List<NetworksItem> networks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
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

	public String getOperatingState() {
		return this.operatingState;
	}

	public void setOperatingState(String operatingState) {
		this.operatingState = operatingState;
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public List<ComponentsItem> getComponents() {
		return this.components;
	}

	public void setComponents(List<ComponentsItem> components) {
		this.components = components;
	}

	public List<NetworksItem> getNetworks() {
		return this.networks;
	}

	public void setNetworks(List<NetworksItem> networks) {
		this.networks = networks;
	}

	public static class ComponentsItem {

		private String componentType;

		private String componentId;

		public String getComponentType() {
			return this.componentType;
		}

		public void setComponentType(String componentType) {
			this.componentType = componentType;
		}

		public String getComponentId() {
			return this.componentId;
		}

		public void setComponentId(String componentId) {
			this.componentId = componentId;
		}
	}

	public static class NetworksItem {

		private String vpdId;

		public String getVpdId() {
			return this.vpdId;
		}

		public void setVpdId(String vpdId) {
			this.vpdId = vpdId;
		}
	}

	@Override
	public DescribeClusterResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
