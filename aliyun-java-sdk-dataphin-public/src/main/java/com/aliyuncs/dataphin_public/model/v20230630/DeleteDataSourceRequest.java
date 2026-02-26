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
public class DeleteDataSourceRequest extends RpcAcsRequest<DeleteDataSourceResponse> {
	   

	private Long opTenantId;

	@SerializedName("deleteCommand")
	private DeleteCommand deleteCommand;
	public DeleteDataSourceRequest() {
		super("dataphin-public", "2023-06-30", "DeleteDataSource");
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

		@SerializedName("Mode")
		private String mode;

		@SerializedName("ProdDataSourceId")
		private Long prodDataSourceId;

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public Long getProdDataSourceId() {
			return this.prodDataSourceId;
		}

		public void setProdDataSourceId(Long prodDataSourceId) {
			this.prodDataSourceId = prodDataSourceId;
		}
	}

	@Override
	public Class<DeleteDataSourceResponse> getResponseClass() {
		return DeleteDataSourceResponse.class;
	}

}
