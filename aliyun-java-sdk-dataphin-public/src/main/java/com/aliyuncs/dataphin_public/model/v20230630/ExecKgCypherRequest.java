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
public class ExecKgCypherRequest extends RpcAcsRequest<ExecKgCypherResponse> {
	   

	private Long opTenantId;

	@SerializedName("execCommand")
	private ExecCommand execCommand;

	private String workspaceId;
	public ExecKgCypherRequest() {
		super("dataphin-public", "2023-06-30", "ExecKgCypher");
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

	public ExecCommand getExecCommand() {
		return this.execCommand;
	}

	public void setExecCommand(ExecCommand execCommand) {
		this.execCommand = execCommand;	
		if (execCommand != null) {
			putBodyParameter("ExecCommand" , new Gson().toJson(execCommand));
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

	public static class ExecCommand {

		@SerializedName("Query")
		private String query;

		@SerializedName("Limit")
		private Integer limit;

		@SerializedName("Params")
		private List<ParamsItem> params;

		public String getQuery() {
			return this.query;
		}

		public void setQuery(String query) {
			this.query = query;
		}

		public Integer getLimit() {
			return this.limit;
		}

		public void setLimit(Integer limit) {
			this.limit = limit;
		}

		public List<ParamsItem> getParams() {
			return this.params;
		}

		public void setParams(List<ParamsItem> params) {
			this.params = params;
		}

		public static class ParamsItem {

			@SerializedName("DataType")
			private String dataType;

			@SerializedName("Value")
			private String value;

			@SerializedName("Key")
			private String key;

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

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
	public Class<ExecKgCypherResponse> getResponseClass() {
		return ExecKgCypherResponse.class;
	}

}
