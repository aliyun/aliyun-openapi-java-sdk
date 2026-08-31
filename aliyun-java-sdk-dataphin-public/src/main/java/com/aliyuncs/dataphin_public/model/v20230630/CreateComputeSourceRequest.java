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
public class CreateComputeSourceRequest extends RpcAcsRequest<CreateComputeSourceResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("createCommand")
	private CreateCommand createCommand;
	public CreateComputeSourceRequest() {
		super("dataphin-public", "2023-06-30", "CreateComputeSource", "Dataphin");
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

		@SerializedName("Name")
		private String name;

		@SerializedName("Description")
		private String description;

		@SerializedName("ConfigList")
		private List<ConfigListItem> configList;

		@SerializedName("ClusterId")
		private Long clusterId;

		@SerializedName("Type")
		private String type;

		@SerializedName("CreateType")
		private String createType;

		@SerializedName("TypeVersion")
		private String typeVersion;

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

		public List<ConfigListItem> getConfigList() {
			return this.configList;
		}

		public void setConfigList(List<ConfigListItem> configList) {
			this.configList = configList;
		}

		public Long getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(Long clusterId) {
			this.clusterId = clusterId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getCreateType() {
			return this.createType;
		}

		public void setCreateType(String createType) {
			this.createType = createType;
		}

		public String getTypeVersion() {
			return this.typeVersion;
		}

		public void setTypeVersion(String typeVersion) {
			this.typeVersion = typeVersion;
		}

		public static class ConfigListItem {

			@SerializedName("Value")
			private String value;

			@SerializedName("Key")
			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}
	}

	@Override
	public Class<CreateComputeSourceResponse> getResponseClass() {
		return CreateComputeSourceResponse.class;
	}

}
