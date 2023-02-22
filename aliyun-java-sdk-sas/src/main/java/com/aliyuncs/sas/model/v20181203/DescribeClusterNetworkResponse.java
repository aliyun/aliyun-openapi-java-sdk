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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeClusterNetworkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterNetworkResponse extends AcsResponse {

	private String requestId;

	private ClusterNetwork clusterNetwork;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ClusterNetwork getClusterNetwork() {
		return this.clusterNetwork;
	}

	public void setClusterNetwork(ClusterNetwork clusterNetwork) {
		this.clusterNetwork = clusterNetwork;
	}

	public static class ClusterNetwork {

		private List<ClusterNode> node;

		private List<BasicEdge> edge;

		public List<ClusterNode> getNode() {
			return this.node;
		}

		public void setNode(List<ClusterNode> node) {
			this.node = node;
		}

		public List<BasicEdge> getEdge() {
			return this.edge;
		}

		public void setEdge(List<BasicEdge> edge) {
			this.edge = edge;
		}

		public static class ClusterNode {

			private String type;

			private String riskLevel;

			private String netTopoSwitch;

			private Integer interceptionType;

			private Integer cnnfSwitch;

			private String name;

			private String id;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getRiskLevel() {
				return this.riskLevel;
			}

			public void setRiskLevel(String riskLevel) {
				this.riskLevel = riskLevel;
			}

			public String getNetTopoSwitch() {
				return this.netTopoSwitch;
			}

			public void setNetTopoSwitch(String netTopoSwitch) {
				this.netTopoSwitch = netTopoSwitch;
			}

			public Integer getInterceptionType() {
				return this.interceptionType;
			}

			public void setInterceptionType(Integer interceptionType) {
				this.interceptionType = interceptionType;
			}

			public Integer getCnnfSwitch() {
				return this.cnnfSwitch;
			}

			public void setCnnfSwitch(Integer cnnfSwitch) {
				this.cnnfSwitch = cnnfSwitch;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class BasicEdge {

			private String dstNodeId;

			private String port;

			private String srcNodeId;

			private String srcNodeType;

			private String dstNodeType;

			private String id;

			public String getDstNodeId() {
				return this.dstNodeId;
			}

			public void setDstNodeId(String dstNodeId) {
				this.dstNodeId = dstNodeId;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}

			public String getSrcNodeId() {
				return this.srcNodeId;
			}

			public void setSrcNodeId(String srcNodeId) {
				this.srcNodeId = srcNodeId;
			}

			public String getSrcNodeType() {
				return this.srcNodeType;
			}

			public void setSrcNodeType(String srcNodeType) {
				this.srcNodeType = srcNodeType;
			}

			public String getDstNodeType() {
				return this.dstNodeType;
			}

			public void setDstNodeType(String dstNodeType) {
				this.dstNodeType = dstNodeType;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}
	}

	@Override
	public DescribeClusterNetworkResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterNetworkResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
