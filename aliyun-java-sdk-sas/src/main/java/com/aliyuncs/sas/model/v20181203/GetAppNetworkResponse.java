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
import com.aliyuncs.sas.transform.v20181203.GetAppNetworkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAppNetworkResponse extends AcsResponse {

	private String requestId;

	private AppNetwork appNetwork;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AppNetwork getAppNetwork() {
		return this.appNetwork;
	}

	public void setAppNetwork(AppNetwork appNetwork) {
		this.appNetwork = appNetwork;
	}

	public static class AppNetwork {

		private List<AppNode> node;

		private List<BasicEdge> edge;

		private List<NamespaceItem> namespace;

		public List<AppNode> getNode() {
			return this.node;
		}

		public void setNode(List<AppNode> node) {
			this.node = node;
		}

		public List<BasicEdge> getEdge() {
			return this.edge;
		}

		public void setEdge(List<BasicEdge> edge) {
			this.edge = edge;
		}

		public List<NamespaceItem> getNamespace() {
			return this.namespace;
		}

		public void setNamespace(List<NamespaceItem> namespace) {
			this.namespace = namespace;
		}

		public static class AppNode {

			private String riskLevel;

			private String id;

			private String namespaceId;

			private String type;

			private String name;

			private List<String> containerIds;

			public String getRiskLevel() {
				return this.riskLevel;
			}

			public void setRiskLevel(String riskLevel) {
				this.riskLevel = riskLevel;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getNamespaceId() {
				return this.namespaceId;
			}

			public void setNamespaceId(String namespaceId) {
				this.namespaceId = namespaceId;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<String> getContainerIds() {
				return this.containerIds;
			}

			public void setContainerIds(List<String> containerIds) {
				this.containerIds = containerIds;
			}
		}

		public static class BasicEdge {

			private String id;

			private String srcNodeId;

			private String srcNodeType;

			private String dstNodeId;

			private String dstNodeType;

			private String port;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
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

			public String getDstNodeId() {
				return this.dstNodeId;
			}

			public void setDstNodeId(String dstNodeId) {
				this.dstNodeId = dstNodeId;
			}

			public String getDstNodeType() {
				return this.dstNodeType;
			}

			public void setDstNodeType(String dstNodeType) {
				this.dstNodeType = dstNodeType;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}
		}

		public static class NamespaceItem {

			private String id;

			private String name;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public GetAppNetworkResponse getInstance(UnmarshallerContext context) {
		return	GetAppNetworkResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
