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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateNodeOpsOwnerRequest extends RpcAcsRequest<UpdateNodeOpsOwnerResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("command")
	private Command command;
	public UpdateNodeOpsOwnerRequest() {
		super("dataphin-public", "2023-06-30", "UpdateNodeOpsOwner", "Dataphin");
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

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
		if(opUserId != null){
			putQueryParameter("OpUserId", opUserId);
		}
	}

	public Command getCommand() {
		return this.command;
	}

	public void setCommand(Command command) {
		this.command = command;	
		if (command != null) {
			putBodyParameter("Command" , new Gson().toJson(command));
		}	
	}

	public static class Command {

		@SerializedName("OpsOwnerList")
		private List<String> opsOwnerList;

		@SerializedName("NodeIdList")
		private List<NodeIdListItem> nodeIdList;

		public List<String> getOpsOwnerList() {
			return this.opsOwnerList;
		}

		public void setOpsOwnerList(List<String> opsOwnerList) {
			this.opsOwnerList = opsOwnerList;
		}

		public List<NodeIdListItem> getNodeIdList() {
			return this.nodeIdList;
		}

		public void setNodeIdList(List<NodeIdListItem> nodeIdList) {
			this.nodeIdList = nodeIdList;
		}

		public static class NodeIdListItem {

			@SerializedName("NodeType")
			private String nodeType;

			@SerializedName("NodeFromType")
			private String nodeFromType;

			@SerializedName("Id")
			private String id;

			public String getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}

			public String getNodeFromType() {
				return this.nodeFromType;
			}

			public void setNodeFromType(String nodeFromType) {
				this.nodeFromType = nodeFromType;
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
	public Class<UpdateNodeOpsOwnerResponse> getResponseClass() {
		return UpdateNodeOpsOwnerResponse.class;
	}

}
