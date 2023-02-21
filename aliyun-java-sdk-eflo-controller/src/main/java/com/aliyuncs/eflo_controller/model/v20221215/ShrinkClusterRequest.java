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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ShrinkClusterRequest extends RpcAcsRequest<ShrinkClusterResponse> {
	   

	private Boolean ignoreFailedNodeTasks;

	private String clusterId;

	@SerializedName("nodeGroups")
	private List<NodeGroups> nodeGroups;
	public ShrinkClusterRequest() {
		super("eflo-controller", "2022-12-15", "ShrinkCluster");
		setMethod(MethodType.POST);
	}

	public Boolean getIgnoreFailedNodeTasks() {
		return this.ignoreFailedNodeTasks;
	}

	public void setIgnoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
		this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
		if(ignoreFailedNodeTasks != null){
			putBodyParameter("IgnoreFailedNodeTasks", ignoreFailedNodeTasks.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putBodyParameter("ClusterId", clusterId);
		}
	}

	public List<NodeGroups> getNodeGroups() {
		return this.nodeGroups;
	}

	public void setNodeGroups(List<NodeGroups> nodeGroups) {
		this.nodeGroups = nodeGroups;	
		if (nodeGroups != null) {
			putBodyParameter("NodeGroups" , new Gson().toJson(nodeGroups));
		}	
	}

	public static class NodeGroups {

		@SerializedName("Nodes")
		private List<NodesItem> nodes;

		@SerializedName("NodeGroupId")
		private String nodeGroupId;

		public List<NodesItem> getNodes() {
			return this.nodes;
		}

		public void setNodes(List<NodesItem> nodes) {
			this.nodes = nodes;
		}

		public String getNodeGroupId() {
			return this.nodeGroupId;
		}

		public void setNodeGroupId(String nodeGroupId) {
			this.nodeGroupId = nodeGroupId;
		}

		public static class NodesItem {

			@SerializedName("NodeId")
			private String nodeId;

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}
		}
	}

	@Override
	public Class<ShrinkClusterResponse> getResponseClass() {
		return ShrinkClusterResponse.class;
	}

}
