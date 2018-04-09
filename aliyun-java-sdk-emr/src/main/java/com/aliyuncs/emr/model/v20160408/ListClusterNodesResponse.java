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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListClusterNodesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterNodesResponse extends AcsResponse {

	private String requestId;

	private List<ClusterNode> clusterNodes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ClusterNode> getClusterNodes() {
		return this.clusterNodes;
	}

	public void setClusterNodes(List<ClusterNode> clusterNodes) {
		this.clusterNodes = clusterNodes;
	}

	public static class ClusterNode {

		private String nodeId;

		private String nodeIp;

		private String status;

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getNodeIp() {
			return this.nodeIp;
		}

		public void setNodeIp(String nodeIp) {
			this.nodeIp = nodeIp;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public ListClusterNodesResponse getInstance(UnmarshallerContext context) {
		return	ListClusterNodesResponseUnmarshaller.unmarshall(this, context);
	}
}
