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
public class ReimageNodesRequest extends RpcAcsRequest<ReimageNodesResponse> {
	   

	private Boolean ignoreFailedNodeTasks;

	private String clusterId;

	@SerializedName("nodes")
	private List<Nodes> nodes;
	public ReimageNodesRequest() {
		super("eflo-controller", "2022-12-15", "ReimageNodes");
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

	public List<Nodes> getNodes() {
		return this.nodes;
	}

	public void setNodes(List<Nodes> nodes) {
		this.nodes = nodes;	
		if (nodes != null) {
			putBodyParameter("Nodes" , new Gson().toJson(nodes));
		}	
	}

	public static class Nodes {

		@SerializedName("Hostname")
		private String hostname;

		@SerializedName("ImageId")
		private String imageId;

		@SerializedName("LoginPassword")
		private String loginPassword;

		@SerializedName("NodeId")
		private String nodeId;

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getLoginPassword() {
			return this.loginPassword;
		}

		public void setLoginPassword(String loginPassword) {
			this.loginPassword = loginPassword;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}
	}

	@Override
	public Class<ReimageNodesResponse> getResponseClass() {
		return ReimageNodesResponse.class;
	}

}
