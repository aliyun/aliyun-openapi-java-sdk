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
public class RebootNodesRequest extends RpcAcsRequest<RebootNodesResponse> {
	   

	private Boolean ignoreFailedNodeTasks;

	private String clusterId;

	@SerializedName("nodes")
	private List<String> nodes;
	public RebootNodesRequest() {
		super("eflo-controller", "2022-12-15", "RebootNodes");
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

	public List<String> getNodes() {
		return this.nodes;
	}

	public void setNodes(List<String> nodes) {
		this.nodes = nodes;	
		if (nodes != null) {
			putBodyParameter("Nodes" , new Gson().toJson(nodes));
		}	
	}

	@Override
	public Class<RebootNodesResponse> getResponseClass() {
		return RebootNodesResponse.class;
	}

}
