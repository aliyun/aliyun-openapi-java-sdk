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
public class ImportKgSchemaRequest extends RpcAcsRequest<ImportKgSchemaResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("importCommand")
	private ImportCommand importCommand;

	private String workspaceId;
	public ImportKgSchemaRequest() {
		super("dataphin-public", "2023-06-30", "ImportKgSchema", "Dataphin");
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

	public ImportCommand getImportCommand() {
		return this.importCommand;
	}

	public void setImportCommand(ImportCommand importCommand) {
		this.importCommand = importCommand;	
		if (importCommand != null) {
			putBodyParameter("ImportCommand" , new Gson().toJson(importCommand));
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

	public static class ImportCommand {

		@SerializedName("MergeStrategy")
		private String mergeStrategy;

		@SerializedName("InputFormat")
		private String inputFormat;

		@SerializedName("Content")
		private String content;

		public String getMergeStrategy() {
			return this.mergeStrategy;
		}

		public void setMergeStrategy(String mergeStrategy) {
			this.mergeStrategy = mergeStrategy;
		}

		public String getInputFormat() {
			return this.inputFormat;
		}

		public void setInputFormat(String inputFormat) {
			this.inputFormat = inputFormat;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

	@Override
	public Class<ImportKgSchemaResponse> getResponseClass() {
		return ImportKgSchemaResponse.class;
	}

}
