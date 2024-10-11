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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetNodeUpDownStreamRequest extends RpcAcsRequest<GetNodeUpDownStreamResponse> {
	   

	private Long opTenantId;

	private Integer upStreamDepth;

	private String env;

	private Long projectId;

	@SerializedName("nodeId")
	private NodeId nodeId;

	private Integer downStreamDepth;
	public GetNodeUpDownStreamRequest() {
		super("dataphin-public", "2023-06-30", "GetNodeUpDownStream");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public Integer getUpStreamDepth() {
		return this.upStreamDepth;
	}

	public void setUpStreamDepth(Integer upStreamDepth) {
		this.upStreamDepth = upStreamDepth;
		if(upStreamDepth != null){
			putQueryParameter("UpStreamDepth", upStreamDepth.toString());
		}
	}

	public String getEnv() {
		return this.env;
	}

	public void setEnv(String env) {
		this.env = env;
		if(env != null){
			putQueryParameter("Env", env);
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId.toString());
		}
	}

	public NodeId getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(NodeId nodeId) {
		this.nodeId = nodeId;	
		if (nodeId != null) {
			putBodyParameter("NodeId" , new Gson().toJson(nodeId));
		}	
	}

	public Integer getDownStreamDepth() {
		return this.downStreamDepth;
	}

	public void setDownStreamDepth(Integer downStreamDepth) {
		this.downStreamDepth = downStreamDepth;
		if(downStreamDepth != null){
			putQueryParameter("DownStreamDepth", downStreamDepth.toString());
		}
	}

	public static class NodeId {

		@SerializedName("Id")
		private String id;

		@SerializedName("FieldIdList")
		private String fieldIdList;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getFieldIdList() {
			return this.fieldIdList;
		}

		public void setFieldIdList(String fieldIdList) {
			this.fieldIdList = fieldIdList;
		}
	}

	@Override
	public Class<GetNodeUpDownStreamResponse> getResponseClass() {
		return GetNodeUpDownStreamResponse.class;
	}

}
