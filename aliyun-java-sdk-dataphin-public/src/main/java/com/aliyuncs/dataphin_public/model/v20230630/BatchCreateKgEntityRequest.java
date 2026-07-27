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
public class BatchCreateKgEntityRequest extends RpcAcsRequest<BatchCreateKgEntityResponse> {
	   

	private Long opTenantId;

	@SerializedName("createCommand")
	private CreateCommand createCommand;

	private String workspaceId;
	public BatchCreateKgEntityRequest() {
		super("dataphin-public", "2023-06-30", "BatchCreateKgEntity");
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

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	public static class CreateCommand {

		@SerializedName("EntityList")
		private List<EntityListItem> entityList;

		public List<EntityListItem> getEntityList() {
			return this.entityList;
		}

		public void setEntityList(List<EntityListItem> entityList) {
			this.entityList = entityList;
		}

		public static class EntityListItem {

			@SerializedName("PropertyList")
			private List<PropertyListItem> propertyList;

			@SerializedName("EntityType")
			private String entityType;

			public List<PropertyListItem> getPropertyList() {
				return this.propertyList;
			}

			public void setPropertyList(List<PropertyListItem> propertyList) {
				this.propertyList = propertyList;
			}

			public String getEntityType() {
				return this.entityType;
			}

			public void setEntityType(String entityType) {
				this.entityType = entityType;
			}

			public static class PropertyListItem {

				@SerializedName("Code")
				private String code;

				@SerializedName("Value")
				private String value;

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public Class<BatchCreateKgEntityResponse> getResponseClass() {
		return BatchCreateKgEntityResponse.class;
	}

}
