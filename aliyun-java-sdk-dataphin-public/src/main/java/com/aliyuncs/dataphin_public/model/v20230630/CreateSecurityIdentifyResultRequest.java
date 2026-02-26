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
public class CreateSecurityIdentifyResultRequest extends RpcAcsRequest<CreateSecurityIdentifyResultResponse> {
	   

	private Long opTenantId;

	@SerializedName("createCommand")
	private CreateCommand createCommand;
	public CreateSecurityIdentifyResultRequest() {
		super("dataphin-public", "2023-06-30", "CreateSecurityIdentifyResult");
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

		@SerializedName("FieldName")
		private String fieldName;

		@SerializedName("ConflictStrategy")
		private String conflictStrategy;

		@SerializedName("TableCatalog")
		private String tableCatalog;

		@SerializedName("ClassifyId")
		private Long classifyId;

		@SerializedName("Enable")
		private Boolean enable;

		@SerializedName("DatasourceName")
		private String datasourceName;

		@SerializedName("IsDatasourceTable")
		private Boolean isDatasourceTable;

		@SerializedName("TableName")
		private String tableName;

		@SerializedName("DatasourceEnv")
		private String datasourceEnv;

		public String getFieldName() {
			return this.fieldName;
		}

		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getConflictStrategy() {
			return this.conflictStrategy;
		}

		public void setConflictStrategy(String conflictStrategy) {
			this.conflictStrategy = conflictStrategy;
		}

		public String getTableCatalog() {
			return this.tableCatalog;
		}

		public void setTableCatalog(String tableCatalog) {
			this.tableCatalog = tableCatalog;
		}

		public Long getClassifyId() {
			return this.classifyId;
		}

		public void setClassifyId(Long classifyId) {
			this.classifyId = classifyId;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public String getDatasourceName() {
			return this.datasourceName;
		}

		public void setDatasourceName(String datasourceName) {
			this.datasourceName = datasourceName;
		}

		public Boolean getIsDatasourceTable() {
			return this.isDatasourceTable;
		}

		public void setIsDatasourceTable(Boolean isDatasourceTable) {
			this.isDatasourceTable = isDatasourceTable;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getDatasourceEnv() {
			return this.datasourceEnv;
		}

		public void setDatasourceEnv(String datasourceEnv) {
			this.datasourceEnv = datasourceEnv;
		}
	}

	@Override
	public Class<CreateSecurityIdentifyResultResponse> getResponseClass() {
		return CreateSecurityIdentifyResultResponse.class;
	}

}
