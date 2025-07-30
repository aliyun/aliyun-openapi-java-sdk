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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetDataServiceApiDocumentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataServiceApiDocumentResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String name;

		private Integer groupId;

		private String groupName;

		private Integer requestMethod;

		private Integer updateRate;

		private String description;

		private Integer returnType;

		private Integer protocol;

		private String sql;

		private Boolean isSpecialSql;

		private Integer createType;

		private Long apiId;

		private Integer mode;

		private Integer env;

		private String resultSample;

		private String bizUnitName;

		private String tableName;

		private Boolean isLogicalTable;

		private Long directDatasourceId;

		private String directDatasourceName;

		private Integer apiTimeout;

		private Integer returnLimit;

		private Integer projectId;

		private String projectName;

		private String resourceGroupId;

		private String resourceGroupName;

		private Boolean openCache;

		private String cacheTime;

		private String timeout;

		private String scriptType;

		private String version;

		private Boolean isPagedQuery;

		private List<RequestParam> requestParamList;

		private List<ResponseParam> responseParamList;

		private List<PublicParam> publicParamList;

		private ApiRegisterInfo apiRegisterInfo;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Integer groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public Integer getRequestMethod() {
			return this.requestMethod;
		}

		public void setRequestMethod(Integer requestMethod) {
			this.requestMethod = requestMethod;
		}

		public Integer getUpdateRate() {
			return this.updateRate;
		}

		public void setUpdateRate(Integer updateRate) {
			this.updateRate = updateRate;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getReturnType() {
			return this.returnType;
		}

		public void setReturnType(Integer returnType) {
			this.returnType = returnType;
		}

		public Integer getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(Integer protocol) {
			this.protocol = protocol;
		}

		public String getSql() {
			return this.sql;
		}

		public void setSql(String sql) {
			this.sql = sql;
		}

		public Boolean getIsSpecialSql() {
			return this.isSpecialSql;
		}

		public void setIsSpecialSql(Boolean isSpecialSql) {
			this.isSpecialSql = isSpecialSql;
		}

		public Integer getCreateType() {
			return this.createType;
		}

		public void setCreateType(Integer createType) {
			this.createType = createType;
		}

		public Long getApiId() {
			return this.apiId;
		}

		public void setApiId(Long apiId) {
			this.apiId = apiId;
		}

		public Integer getMode() {
			return this.mode;
		}

		public void setMode(Integer mode) {
			this.mode = mode;
		}

		public Integer getEnv() {
			return this.env;
		}

		public void setEnv(Integer env) {
			this.env = env;
		}

		public String getResultSample() {
			return this.resultSample;
		}

		public void setResultSample(String resultSample) {
			this.resultSample = resultSample;
		}

		public String getBizUnitName() {
			return this.bizUnitName;
		}

		public void setBizUnitName(String bizUnitName) {
			this.bizUnitName = bizUnitName;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public Boolean getIsLogicalTable() {
			return this.isLogicalTable;
		}

		public void setIsLogicalTable(Boolean isLogicalTable) {
			this.isLogicalTable = isLogicalTable;
		}

		public Long getDirectDatasourceId() {
			return this.directDatasourceId;
		}

		public void setDirectDatasourceId(Long directDatasourceId) {
			this.directDatasourceId = directDatasourceId;
		}

		public String getDirectDatasourceName() {
			return this.directDatasourceName;
		}

		public void setDirectDatasourceName(String directDatasourceName) {
			this.directDatasourceName = directDatasourceName;
		}

		public Integer getApiTimeout() {
			return this.apiTimeout;
		}

		public void setApiTimeout(Integer apiTimeout) {
			this.apiTimeout = apiTimeout;
		}

		public Integer getReturnLimit() {
			return this.returnLimit;
		}

		public void setReturnLimit(Integer returnLimit) {
			this.returnLimit = returnLimit;
		}

		public Integer getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Integer projectId) {
			this.projectId = projectId;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getResourceGroupName() {
			return this.resourceGroupName;
		}

		public void setResourceGroupName(String resourceGroupName) {
			this.resourceGroupName = resourceGroupName;
		}

		public Boolean getOpenCache() {
			return this.openCache;
		}

		public void setOpenCache(Boolean openCache) {
			this.openCache = openCache;
		}

		public String getCacheTime() {
			return this.cacheTime;
		}

		public void setCacheTime(String cacheTime) {
			this.cacheTime = cacheTime;
		}

		public String getTimeout() {
			return this.timeout;
		}

		public void setTimeout(String timeout) {
			this.timeout = timeout;
		}

		public String getScriptType() {
			return this.scriptType;
		}

		public void setScriptType(String scriptType) {
			this.scriptType = scriptType;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public Boolean getIsPagedQuery() {
			return this.isPagedQuery;
		}

		public void setIsPagedQuery(Boolean isPagedQuery) {
			this.isPagedQuery = isPagedQuery;
		}

		public List<RequestParam> getRequestParamList() {
			return this.requestParamList;
		}

		public void setRequestParamList(List<RequestParam> requestParamList) {
			this.requestParamList = requestParamList;
		}

		public List<ResponseParam> getResponseParamList() {
			return this.responseParamList;
		}

		public void setResponseParamList(List<ResponseParam> responseParamList) {
			this.responseParamList = responseParamList;
		}

		public List<PublicParam> getPublicParamList() {
			return this.publicParamList;
		}

		public void setPublicParamList(List<PublicParam> publicParamList) {
			this.publicParamList = publicParamList;
		}

		public ApiRegisterInfo getApiRegisterInfo() {
			return this.apiRegisterInfo;
		}

		public void setApiRegisterInfo(ApiRegisterInfo apiRegisterInfo) {
			this.apiRegisterInfo = apiRegisterInfo;
		}

		public static class RequestParam {

			private String defaultValue;

			private String type;

			private String description;

			private Boolean isRequired;

			private String sample;

			private String name;

			public String getDefaultValue() {
				return this.defaultValue;
			}

			public void setDefaultValue(String defaultValue) {
				this.defaultValue = defaultValue;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Boolean getIsRequired() {
				return this.isRequired;
			}

			public void setIsRequired(Boolean isRequired) {
				this.isRequired = isRequired;
			}

			public String getSample() {
				return this.sample;
			}

			public void setSample(String sample) {
				this.sample = sample;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class ResponseParam {

			private String type;

			private String description;

			private String sample;

			private String name;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getSample() {
				return this.sample;
			}

			public void setSample(String sample) {
				this.sample = sample;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class PublicParam {

			private String type;

			private String description;

			private Boolean isRequired;

			private String sample;

			private String name;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Boolean getIsRequired() {
				return this.isRequired;
			}

			public void setIsRequired(Boolean isRequired) {
				this.isRequired = isRequired;
			}

			public String getSample() {
				return this.sample;
			}

			public void setSample(String sample) {
				this.sample = sample;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class ApiRegisterInfo {

			private Integer mode;

			private Integer httpMethod;

			private String datasourceId;

			private String datasourceName;

			private String url;

			private String authType;

			private String protocol;

			private String path;

			private Integer timeout;

			public Integer getMode() {
				return this.mode;
			}

			public void setMode(Integer mode) {
				this.mode = mode;
			}

			public Integer getHttpMethod() {
				return this.httpMethod;
			}

			public void setHttpMethod(Integer httpMethod) {
				this.httpMethod = httpMethod;
			}

			public String getDatasourceId() {
				return this.datasourceId;
			}

			public void setDatasourceId(String datasourceId) {
				this.datasourceId = datasourceId;
			}

			public String getDatasourceName() {
				return this.datasourceName;
			}

			public void setDatasourceName(String datasourceName) {
				this.datasourceName = datasourceName;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getAuthType() {
				return this.authType;
			}

			public void setAuthType(String authType) {
				this.authType = authType;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public Integer getTimeout() {
				return this.timeout;
			}

			public void setTimeout(Integer timeout) {
				this.timeout = timeout;
			}
		}
	}

	@Override
	public GetDataServiceApiDocumentResponse getInstance(UnmarshallerContext context) {
		return	GetDataServiceApiDocumentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
