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
public class CreateSecurityClassifyCatalogRequest extends RpcAcsRequest<CreateSecurityClassifyCatalogResponse> {
	   

	private Long opTenantId;

	@SerializedName("createCommand")
	private CreateCommand createCommand;
	public CreateSecurityClassifyCatalogRequest() {
		super("dataphin-public", "2023-06-30", "CreateSecurityClassifyCatalog");
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

		@SerializedName("Name")
		private String name;

		@SerializedName("ParentPath")
		private String parentPath;

		@SerializedName("OwnerList")
		private List<String> ownerList;

		@SerializedName("VisibleType")
		private String visibleType;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getParentPath() {
			return this.parentPath;
		}

		public void setParentPath(String parentPath) {
			this.parentPath = parentPath;
		}

		public List<String> getOwnerList() {
			return this.ownerList;
		}

		public void setOwnerList(List<String> ownerList) {
			this.ownerList = ownerList;
		}

		public String getVisibleType() {
			return this.visibleType;
		}

		public void setVisibleType(String visibleType) {
			this.visibleType = visibleType;
		}
	}

	@Override
	public Class<CreateSecurityClassifyCatalogResponse> getResponseClass() {
		return CreateSecurityClassifyCatalogResponse.class;
	}

}
