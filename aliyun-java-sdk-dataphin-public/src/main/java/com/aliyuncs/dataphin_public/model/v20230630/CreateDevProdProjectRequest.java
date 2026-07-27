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
public class CreateDevProdProjectRequest extends RpcAcsRequest<CreateDevProdProjectResponse> {
	   

	private Long opTenantId;

	@SerializedName("createCommand")
	private CreateCommand createCommand;
	public CreateDevProdProjectRequest() {
		super("dataphin-public", "2023-06-30", "CreateDevProdProject");
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

		@SerializedName("DevStreamComputeSourceId")
		private Long devStreamComputeSourceId;

		@SerializedName("WhiteLists")
		private List<WhiteListsItem> whiteLists;

		@SerializedName("DisplayName")
		private String displayName;

		@SerializedName("Name")
		private String name;

		@SerializedName("ProdDescription")
		private String prodDescription;

		@SerializedName("ProdStreamComputeSourceId")
		private Long prodStreamComputeSourceId;

		@SerializedName("ProdComputeSourceId")
		private Long prodComputeSourceId;

		@SerializedName("DevDescription")
		private String devDescription;

		@SerializedName("BizUnitId")
		private Long bizUnitId;

		@SerializedName("DevComputeSourceId")
		private Long devComputeSourceId;

		public String getNameSpaceTag() {
			return this.nameSpaceTag;
		}

		public void setNameSpaceTag(String nameSpaceTag) {
			this.nameSpaceTag = nameSpaceTag;
		}

		public Long getDevStreamComputeSourceId() {
			return this.devStreamComputeSourceId;
		}

		public void setDevStreamComputeSourceId(Long devStreamComputeSourceId) {
			this.devStreamComputeSourceId = devStreamComputeSourceId;
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

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getProdDescription() {
			return this.prodDescription;
		}

		public void setProdDescription(String prodDescription) {
			this.prodDescription = prodDescription;
		}

		public Long getProdStreamComputeSourceId() {
			return this.prodStreamComputeSourceId;
		}

		public void setProdStreamComputeSourceId(Long prodStreamComputeSourceId) {
			this.prodStreamComputeSourceId = prodStreamComputeSourceId;
		}

		public Long getProdComputeSourceId() {
			return this.prodComputeSourceId;
		}

		public void setProdComputeSourceId(Long prodComputeSourceId) {
			this.prodComputeSourceId = prodComputeSourceId;
		}

		public String getDevDescription() {
			return this.devDescription;
		}

		public void setDevDescription(String devDescription) {
			this.devDescription = devDescription;
		}

		public Long getBizUnitId() {
			return this.bizUnitId;
		}

		public void setBizUnitId(Long bizUnitId) {
			this.bizUnitId = bizUnitId;
		}

		public Long getDevComputeSourceId() {
			return this.devComputeSourceId;
		}

		public void setDevComputeSourceId(Long devComputeSourceId) {
			this.devComputeSourceId = devComputeSourceId;
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
	public Class<CreateDevProdProjectResponse> getResponseClass() {
		return CreateDevProdProjectResponse.class;
	}

}
