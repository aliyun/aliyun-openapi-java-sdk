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
public class CreateDataServiceApiRequest extends RpcAcsRequest<CreateDataServiceApiResponse> {
	   

	private Long opTenantId;

	@SerializedName("createCommand")
	private CreateCommand createCommand;
	public CreateDataServiceApiRequest() {
		super("dataphin-public", "2023-06-30", "CreateDataServiceApi");
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

		@SerializedName("UpdateRate")
		private Integer updateRate;

		@SerializedName("CallMode")
		private Integer callMode;

		@SerializedName("ScriptDetails")
		private ScriptDetails scriptDetails;

		@SerializedName("Description")
		private String description;

		@SerializedName("ExecutionTimeout")
		private Integer executionTimeout;

		@SerializedName("CacheTimeout")
		private Integer cacheTimeout;

		@SerializedName("Version")
		private String version;

		@SerializedName("ApiType")
		private Integer apiType;

		@SerializedName("Timeout")
		private Integer timeout;

		@SerializedName("Mode")
		private Integer mode;

		@SerializedName("RequestType")
		private Integer requestType;

		@SerializedName("ApiName")
		private String apiName;

		@SerializedName("ApiGroupName")
		private String apiGroupName;

		@SerializedName("BizProtocol")
		private List<Integer> bizProtocol;

		@SerializedName("CustomUpdateRate")
		private String customUpdateRate;

		@SerializedName("ProjectId")
		private Long projectId;

		@SerializedName("ApiGroupId")
		private Long apiGroupId;

		public Integer getUpdateRate() {
			return this.updateRate;
		}

		public void setUpdateRate(Integer updateRate) {
			this.updateRate = updateRate;
		}

		public Integer getCallMode() {
			return this.callMode;
		}

		public void setCallMode(Integer callMode) {
			this.callMode = callMode;
		}

		public ScriptDetails getScriptDetails() {
			return this.scriptDetails;
		}

		public void setScriptDetails(ScriptDetails scriptDetails) {
			this.scriptDetails = scriptDetails;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getExecutionTimeout() {
			return this.executionTimeout;
		}

		public void setExecutionTimeout(Integer executionTimeout) {
			this.executionTimeout = executionTimeout;
		}

		public Integer getCacheTimeout() {
			return this.cacheTimeout;
		}

		public void setCacheTimeout(Integer cacheTimeout) {
			this.cacheTimeout = cacheTimeout;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public Integer getApiType() {
			return this.apiType;
		}

		public void setApiType(Integer apiType) {
			this.apiType = apiType;
		}

		public Integer getTimeout() {
			return this.timeout;
		}

		public void setTimeout(Integer timeout) {
			this.timeout = timeout;
		}

		public Integer getMode() {
			return this.mode;
		}

		public void setMode(Integer mode) {
			this.mode = mode;
		}

		public Integer getRequestType() {
			return this.requestType;
		}

		public void setRequestType(Integer requestType) {
			this.requestType = requestType;
		}

		public String getApiName() {
			return this.apiName;
		}

		public void setApiName(String apiName) {
			this.apiName = apiName;
		}

		public String getApiGroupName() {
			return this.apiGroupName;
		}

		public void setApiGroupName(String apiGroupName) {
			this.apiGroupName = apiGroupName;
		}

		public List<Integer> getBizProtocol() {
			return this.bizProtocol;
		}

		public void setBizProtocol(List<Integer> bizProtocol) {
			this.bizProtocol = bizProtocol;
		}

		public String getCustomUpdateRate() {
			return this.customUpdateRate;
		}

		public void setCustomUpdateRate(String customUpdateRate) {
			this.customUpdateRate = customUpdateRate;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public Long getApiGroupId() {
			return this.apiGroupId;
		}

		public void setApiGroupId(Long apiGroupId) {
			this.apiGroupId = apiGroupId;
		}

		public static class ScriptDetails {

			@SerializedName("DatasourceType")
			private Integer datasourceType;

			@SerializedName("ScriptResponseParameters")
			private List<ScriptResponseParametersItem> scriptResponseParameters;

			@SerializedName("SqlMode")
			private Integer sqlMode;

			@SerializedName("SortPriority")
			private Integer sortPriority;

			@SerializedName("DatasourceID")
			private Long datasourceID;

			@SerializedName("IsPaginated")
			private Boolean isPaginated;

			@SerializedName("ScriptRequestParameters")
			private List<ScriptRequestParametersItem> scriptRequestParameters;

			@SerializedName("Script")
			private String script;

			public Integer getDatasourceType() {
				return this.datasourceType;
			}

			public void setDatasourceType(Integer datasourceType) {
				this.datasourceType = datasourceType;
			}

			public List<ScriptResponseParametersItem> getScriptResponseParameters() {
				return this.scriptResponseParameters;
			}

			public void setScriptResponseParameters(List<ScriptResponseParametersItem> scriptResponseParameters) {
				this.scriptResponseParameters = scriptResponseParameters;
			}

			public Integer getSqlMode() {
				return this.sqlMode;
			}

			public void setSqlMode(Integer sqlMode) {
				this.sqlMode = sqlMode;
			}

			public Integer getSortPriority() {
				return this.sortPriority;
			}

			public void setSortPriority(Integer sortPriority) {
				this.sortPriority = sortPriority;
			}

			public Long getDatasourceID() {
				return this.datasourceID;
			}

			public void setDatasourceID(Long datasourceID) {
				this.datasourceID = datasourceID;
			}

			public Boolean getIsPaginated() {
				return this.isPaginated;
			}

			public void setIsPaginated(Boolean isPaginated) {
				this.isPaginated = isPaginated;
			}

			public List<ScriptRequestParametersItem> getScriptRequestParameters() {
				return this.scriptRequestParameters;
			}

			public void setScriptRequestParameters(List<ScriptRequestParametersItem> scriptRequestParameters) {
				this.scriptRequestParameters = scriptRequestParameters;
			}

			public String getScript() {
				return this.script;
			}

			public void setScript(String script) {
				this.script = script;
			}

			public static class ScriptResponseParametersItem {

				@SerializedName("ParameterDataType")
				private String parameterDataType;

				@SerializedName("ParameterName")
				private String parameterName;

				@SerializedName("ParameterDescription")
				private String parameterDescription;

				@SerializedName("ExampleValue")
				private String exampleValue;

				public String getParameterDataType() {
					return this.parameterDataType;
				}

				public void setParameterDataType(String parameterDataType) {
					this.parameterDataType = parameterDataType;
				}

				public String getParameterName() {
					return this.parameterName;
				}

				public void setParameterName(String parameterName) {
					this.parameterName = parameterName;
				}

				public String getParameterDescription() {
					return this.parameterDescription;
				}

				public void setParameterDescription(String parameterDescription) {
					this.parameterDescription = parameterDescription;
				}

				public String getExampleValue() {
					return this.exampleValue;
				}

				public void setExampleValue(String exampleValue) {
					this.exampleValue = exampleValue;
				}
			}

			public static class ScriptRequestParametersItem {

				@SerializedName("ParameterValueType")
				private String parameterValueType;

				@SerializedName("IsRequiredParameter")
				private Boolean isRequiredParameter;

				@SerializedName("ParameterDataType")
				private String parameterDataType;

				@SerializedName("ParameterName")
				private String parameterName;

				@SerializedName("ParameterDescription")
				private String parameterDescription;

				@SerializedName("ExampleValue")
				private String exampleValue;

				public String getParameterValueType() {
					return this.parameterValueType;
				}

				public void setParameterValueType(String parameterValueType) {
					this.parameterValueType = parameterValueType;
				}

				public Boolean getIsRequiredParameter() {
					return this.isRequiredParameter;
				}

				public void setIsRequiredParameter(Boolean isRequiredParameter) {
					this.isRequiredParameter = isRequiredParameter;
				}

				public String getParameterDataType() {
					return this.parameterDataType;
				}

				public void setParameterDataType(String parameterDataType) {
					this.parameterDataType = parameterDataType;
				}

				public String getParameterName() {
					return this.parameterName;
				}

				public void setParameterName(String parameterName) {
					this.parameterName = parameterName;
				}

				public String getParameterDescription() {
					return this.parameterDescription;
				}

				public void setParameterDescription(String parameterDescription) {
					this.parameterDescription = parameterDescription;
				}

				public String getExampleValue() {
					return this.exampleValue;
				}

				public void setExampleValue(String exampleValue) {
					this.exampleValue = exampleValue;
				}
			}
		}
	}

	@Override
	public Class<CreateDataServiceApiResponse> getResponseClass() {
		return CreateDataServiceApiResponse.class;
	}

}
