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
public class CreateBasicProjectRequest extends RpcAcsRequest<CreateBasicProjectResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("createCommand")
	private CreateCommand createCommand;
	public CreateBasicProjectRequest() {
		super("dataphin-public", "2023-06-30", "CreateBasicProject", "Dataphin");
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

	public CreateCommand getCreateCommand() {
		return this.createCommand;
	}

	public void setCreateCommand(CreateCommand createCommand) {
		this.createCommand = createCommand;	
		if (createCommand != null) {
			putBodyParameter("CreateCommand" , new Gson().toJson(createCommand));
		}	
	}

	public static class CreateCommand {

		@SerializedName("NameSpaceTag")
		private String nameSpaceTag;

		@SerializedName("StreamComputeSourceId")
		private Long streamComputeSourceId;

		@SerializedName("WhiteLists")
		private List<WhiteListsItem> whiteLists;

		@SerializedName("DisplayName")
		private String displayName;

		@SerializedName("ComputeSourceId")
		private Long computeSourceId;

		@SerializedName("Name")
		private String name;

		@SerializedName("Description")
		private String description;

		@SerializedName("Type")
		private String type;

		@SerializedName("BizUnitId")
		private Long bizUnitId;

		public String getNameSpaceTag() {
			return this.nameSpaceTag;
		}

		public void setNameSpaceTag(String nameSpaceTag) {
			this.nameSpaceTag = nameSpaceTag;
		}

		public Long getStreamComputeSourceId() {
			return this.streamComputeSourceId;
		}

		public void setStreamComputeSourceId(Long streamComputeSourceId) {
			this.streamComputeSourceId = streamComputeSourceId;
		}

		public List<WhiteListsItem> getWhiteLists() {
			return this.whiteLists;
		}

		public void setWhiteLists(List<WhiteListsItem> whiteLists) {
			this.whiteLists = whiteLists;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public Long getComputeSourceId() {
			return this.computeSourceId;
		}

		public void setComputeSourceId(Long computeSourceId) {
			this.computeSourceId = computeSourceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getBizUnitId() {
			return this.bizUnitId;
		}

		public void setBizUnitId(Long bizUnitId) {
			this.bizUnitId = bizUnitId;
		}

		public static class WhiteListsItem {

			@SerializedName("Port")
			private String port;

			@SerializedName("Ip")
			private String ip;

			@SerializedName("Description")
			private String description;

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}
	}

	@Override
	public Class<CreateBasicProjectResponse> getResponseClass() {
		return CreateBasicProjectResponse.class;
	}

}
