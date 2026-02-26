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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeRCClusterNodesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRCClusterNodesResponse extends AcsResponse {

	private String requestId;

	private List<Node> nodes;

	private Page page;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Node> getNodes() {
		return this.nodes;
	}

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}

	public Page getPage() {
		return this.page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public static class Node {

		private String creationTime;

		private String dockerVersion;

		private String imageId;

		private String instanceId;

		private String instanceRole;

		private Boolean isAliyunNode;

		private String nodeName;

		private String nodeStatus;

		private String nodePoolId;

		private String runtimeVersion;

		private String state;

		private List<String> ipAddresses;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getDockerVersion() {
			return this.dockerVersion;
		}

		public void setDockerVersion(String dockerVersion) {
			this.dockerVersion = dockerVersion;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceRole() {
			return this.instanceRole;
		}

		public void setInstanceRole(String instanceRole) {
			this.instanceRole = instanceRole;
		}

		public Boolean getIsAliyunNode() {
			return this.isAliyunNode;
		}

		public void setIsAliyunNode(Boolean isAliyunNode) {
			this.isAliyunNode = isAliyunNode;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public String getNodeStatus() {
			return this.nodeStatus;
		}

		public void setNodeStatus(String nodeStatus) {
			this.nodeStatus = nodeStatus;
		}

		public String getNodePoolId() {
			return this.nodePoolId;
		}

		public void setNodePoolId(String nodePoolId) {
			this.nodePoolId = nodePoolId;
		}

		public String getRuntimeVersion() {
			return this.runtimeVersion;
		}

		public void setRuntimeVersion(String runtimeVersion) {
			this.runtimeVersion = runtimeVersion;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public List<String> getIpAddresses() {
			return this.ipAddresses;
		}

		public void setIpAddresses(List<String> ipAddresses) {
			this.ipAddresses = ipAddresses;
		}
	}

	public static class Page {

		private Long pageNumber;

		private Long pageSize;

		private Long totalCount;

		public Long getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Long pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}
	}

	@Override
	public DescribeRCClusterNodesResponse getInstance(UnmarshallerContext context) {
		return	DescribeRCClusterNodesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
