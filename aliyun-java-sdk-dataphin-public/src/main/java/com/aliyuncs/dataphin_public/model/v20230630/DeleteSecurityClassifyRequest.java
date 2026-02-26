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
public class DeleteSecurityClassifyRequest extends RpcAcsRequest<DeleteSecurityClassifyResponse> {
	   

	private Long opTenantId;

	@SerializedName("deleteCommand")
	private DeleteCommand deleteCommand;
	public DeleteSecurityClassifyRequest() {
		super("dataphin-public", "2023-06-30", "DeleteSecurityClassify");
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

	public DeleteCommand getDeleteCommand() {
		return this.deleteCommand;
	}

	public void setDeleteCommand(DeleteCommand deleteCommand) {
		this.deleteCommand = deleteCommand;	
		if (deleteCommand != null) {
			putBodyParameter("DeleteCommand" , new Gson().toJson(deleteCommand));
		}	
	}

	public static class DeleteCommand {

		@SerializedName("Name")
		private String name;

		@SerializedName("ParentPath")
		private String parentPath;

		@SerializedName("Id")
		private Long id;

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

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public Class<DeleteSecurityClassifyResponse> getResponseClass() {
		return DeleteSecurityClassifyResponse.class;
	}

}
