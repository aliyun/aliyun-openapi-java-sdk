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
public class ExecuteAdHocTaskRequest extends RpcAcsRequest<ExecuteAdHocTaskResponse> {
	   

	private Long opTenantId;

	@SerializedName("executeCommand")
	private ExecuteCommand executeCommand;
	public ExecuteAdHocTaskRequest() {
		super("dataphin-public", "2023-06-30", "ExecuteAdHocTask");
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

	public ExecuteCommand getExecuteCommand() {
		return this.executeCommand;
	}

	public void setExecuteCommand(ExecuteCommand executeCommand) {
		this.executeCommand = executeCommand;	
		if (executeCommand != null) {
			putBodyParameter("ExecuteCommand" , new Gson().toJson(executeCommand));
		}	
	}

	public static class ExecuteCommand {

		@SerializedName("Code")
		private String code;

		@SerializedName("DataSourceId")
		private Long dataSourceId;

		@SerializedName("DataSourceSchema")
		private String dataSourceSchema;

		@SerializedName("ParamList")
		private List<ParamListItem> paramList;

		@SerializedName("DataSourceCatalog")
		private String dataSourceCatalog;

		@SerializedName("OperatorType")
		private String operatorType;

		@SerializedName("ProjectId")
		private Long projectId;

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

		public List<ParamListItem> getParamList() {
			return this.paramList;
		}

		public void setParamList(List<ParamListItem> paramList) {
			this.paramList = paramList;
		}

		public String getDataSourceCatalog() {
			return this.dataSourceCatalog;
		}

		public void setDataSourceCatalog(String dataSourceCatalog) {
			this.dataSourceCatalog = dataSourceCatalog;
		}

		public String getOperatorType() {
			return this.operatorType;
		}

		public void setOperatorType(String operatorType) {
			this.operatorType = operatorType;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public static class ParamListItem {

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
	public Class<ExecuteAdHocTaskResponse> getResponseClass() {
		return ExecuteAdHocTaskResponse.class;
	}

}
