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
public class CreateStandardMappingRequest extends RpcAcsRequest<CreateStandardMappingResponse> {
	   

	private Long opTenantId;

	@SerializedName("createCommand")
	private CreateCommand createCommand;
	public CreateStandardMappingRequest() {
		super("dataphin-public", "2023-06-30", "CreateStandardMapping");
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

		@SerializedName("RelationType")
		private String relationType;

		@SerializedName("StandardId")
		private Long standardId;

		@SerializedName("InvalidMappingRelationOperationType")
		private String invalidMappingRelationOperationType;

		@SerializedName("AssetGuidList")
		private List<String> assetGuidList;

		public String getRelationType() {
			return this.relationType;
		}

		public void setRelationType(String relationType) {
			this.relationType = relationType;
		}

		public Long getStandardId() {
			return this.standardId;
		}

		public void setStandardId(Long standardId) {
			this.standardId = standardId;
		}

		public String getInvalidMappingRelationOperationType() {
			return this.invalidMappingRelationOperationType;
		}

		public void setInvalidMappingRelationOperationType(String invalidMappingRelationOperationType) {
			this.invalidMappingRelationOperationType = invalidMappingRelationOperationType;
		}

		public List<String> getAssetGuidList() {
			return this.assetGuidList;
		}

		public void setAssetGuidList(List<String> assetGuidList) {
			this.assetGuidList = assetGuidList;
		}
	}

	@Override
	public Class<CreateStandardMappingResponse> getResponseClass() {
		return CreateStandardMappingResponse.class;
	}

}
