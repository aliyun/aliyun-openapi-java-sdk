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
public class ParseBatchTaskDependencyRequest extends RpcAcsRequest<ParseBatchTaskDependencyResponse> {
	   

	private Long opTenantId;

	@SerializedName("parseCommand")
	private ParseCommand parseCommand;
	public ParseBatchTaskDependencyRequest() {
		super("dataphin-public", "2023-06-30", "ParseBatchTaskDependency");
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

	public ParseCommand getParseCommand() {
		return this.parseCommand;
	}

	public void setParseCommand(ParseCommand parseCommand) {
		this.parseCommand = parseCommand;	
		if (parseCommand != null) {
			putBodyParameter("ParseCommand" , new Gson().toJson(parseCommand));
		}	
	}

	public static class ParseCommand {

		@SerializedName("IncludeAllInputTables")
		private Boolean includeAllInputTables;

		@SerializedName("NeedQueryLineages")
		private Boolean needQueryLineages;

		@SerializedName("Code")
		private String code;

		@SerializedName("DataSourceId")
		private Long dataSourceId;

		@SerializedName("DataSourceSchema")
		private String dataSourceSchema;

		@SerializedName("DataSourceCatalog")
		private String dataSourceCatalog;

		@SerializedName("ProjectId")
		private Long projectId;

		@SerializedName("OperatorType")
		private String operatorType;

		public Boolean getIncludeAllInputTables() {
			return this.includeAllInputTables;
		}

		public void setIncludeAllInputTables(Boolean includeAllInputTables) {
			this.includeAllInputTables = includeAllInputTables;
		}

		public Boolean getNeedQueryLineages() {
			return this.needQueryLineages;
		}

		public void setNeedQueryLineages(Boolean needQueryLineages) {
			this.needQueryLineages = needQueryLineages;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Long getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(Long dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public String getDataSourceSchema() {
			return this.dataSourceSchema;
		}

		public void setDataSourceSchema(String dataSourceSchema) {
			this.dataSourceSchema = dataSourceSchema;
		}

		public String getDataSourceCatalog() {
			return this.dataSourceCatalog;
		}

		public void setDataSourceCatalog(String dataSourceCatalog) {
			this.dataSourceCatalog = dataSourceCatalog;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getOperatorType() {
			return this.operatorType;
		}

		public void setOperatorType(String operatorType) {
			this.operatorType = operatorType;
		}
	}

	@Override
	public Class<ParseBatchTaskDependencyResponse> getResponseClass() {
		return ParseBatchTaskDependencyResponse.class;
	}

}
