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
import com.aliyuncs.dataphin_public.transform.v20230630.ListApiByAppResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApiByAppResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private ListResult listResult;

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

	public ListResult getListResult() {
		return this.listResult;
	}

	public void setListResult(ListResult listResult) {
		this.listResult = listResult;
	}

	public static class ListResult {

		private Integer totalCount;

		private List<DataServiceApiDetailList> data;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<DataServiceApiDetailList> getData() {
			return this.data;
		}

		public void setData(List<DataServiceApiDetailList> data) {
			this.data = data;
		}

		public static class DataServiceApiDetailList {

			private Long id;

			private String name;

			private Long groupId;

			private String groupName;

			private Long requestMethod;

			private String requestMethodName;

			private Long updateRate;

			private String updateRateName;

			private String description;

			private Long returnType;

			private String returnTypeName;

			private Long protocol;

			private String protocolName;

			private String sqlStatement;

			private Long specialSql;

			private Long createType;

			private Long apiNo;

			private Long modelType;

			private Long dbEnv;

			private String resultSample;

			private String bizModuleEnName;

			private String tableName;

			private Boolean isLogicalTable;

			private Long directDatasourceId;

			private String directDatasourceName;

			private Long apiTimeout;

			private Long maxReturnNum;

			private Long projId;

			private String projName;

			private String appName;

			private String rsGrpId;

			private String resourceGroupName;

			private String cacheSwitch;

			private String cacheTime;

			private String timeout;

			private String scriptType;

			private String version;

			private Long isPagedQuery;

			private List<RequestParamListItem> requestParamList;

			private List<ResponseParamListItem> responseParamList;

			private List<PublicParamListItem> publicParamList;

			private RegisterApi registerApi;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getGroupId() {
				return this.groupId;
			}

			public void setGroupId(Long groupId) {
				this.groupId = groupId;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public Long getRequestMethod() {
				return this.requestMethod;
			}

			public void setRequestMethod(Long requestMethod) {
				this.requestMethod = requestMethod;
			}

			public String getRequestMethodName() {
				return this.requestMethodName;
			}

			public void setRequestMethodName(String requestMethodName) {
				this.requestMethodName = requestMethodName;
			}

			public Long getUpdateRate() {
				return this.updateRate;
			}

			public void setUpdateRate(Long updateRate) {
				this.updateRate = updateRate;
			}

			public String getUpdateRateName() {
				return this.updateRateName;
			}

			public void setUpdateRateName(String updateRateName) {
				this.updateRateName = updateRateName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Long getReturnType() {
				return this.returnType;
			}

			public void setReturnType(Long returnType) {
				this.returnType = returnType;
			}

			public String getReturnTypeName() {
				return this.returnTypeName;
			}

			public void setReturnTypeName(String returnTypeName) {
				this.returnTypeName = returnTypeName;
			}

			public Long getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(Long protocol) {
				this.protocol = protocol;
			}

			public String getProtocolName() {
				return this.protocolName;
			}

			public void setProtocolName(String protocolName) {
				this.protocolName = protocolName;
			}

			public String getSqlStatement() {
				return this.sqlStatement;
			}

			public void setSqlStatement(String sqlStatement) {
				this.sqlStatement = sqlStatement;
			}

			public Long getSpecialSql() {
				return this.specialSql;
			}

			public void setSpecialSql(Long specialSql) {
				this.specialSql = specialSql;
			}

			public Long getCreateType() {
				return this.createType;
			}

			public void setCreateType(Long createType) {
				this.createType = createType;
			}

			public Long getApiNo() {
				return this.apiNo;
			}

			public void setApiNo(Long apiNo) {
				this.apiNo = apiNo;
			}

			public Long getModelType() {
				return this.modelType;
			}

			public void setModelType(Long modelType) {
				this.modelType = modelType;
			}

			public Long getDbEnv() {
				return this.dbEnv;
			}

			public void setDbEnv(Long dbEnv) {
				this.dbEnv = dbEnv;
			}

			public String getResultSample() {
				return this.resultSample;
			}

			public void setResultSample(String resultSample) {
				this.resultSample = resultSample;
			}

			public String getBizModuleEnName() {
				return this.bizModuleEnName;
			}

			public void setBizModuleEnName(String bizModuleEnName) {
				this.bizModuleEnName = bizModuleEnName;
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

			public Long getApiTimeout() {
				return this.apiTimeout;
			}

			public void setApiTimeout(Long apiTimeout) {
				this.apiTimeout = apiTimeout;
			}

			public Long getMaxReturnNum() {
				return this.maxReturnNum;
			}

			public void setMaxReturnNum(Long maxReturnNum) {
				this.maxReturnNum = maxReturnNum;
			}

			public Long getProjId() {
				return this.projId;
			}

			public void setProjId(Long projId) {
				this.projId = projId;
			}

			public String getProjName() {
				return this.projName;
			}

			public void setProjName(String projName) {
				this.projName = projName;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getRsGrpId() {
				return this.rsGrpId;
			}

			public void setRsGrpId(String rsGrpId) {
				this.rsGrpId = rsGrpId;
			}

			public String getResourceGroupName() {
				return this.resourceGroupName;
			}

			public void setResourceGroupName(String resourceGroupName) {
				this.resourceGroupName = resourceGroupName;
			}

			public String getCacheSwitch() {
				return this.cacheSwitch;
			}

			public void setCacheSwitch(String cacheSwitch) {
				this.cacheSwitch = cacheSwitch;
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

			public Long getIsPagedQuery() {
				return this.isPagedQuery;
			}

			public void setIsPagedQuery(Long isPagedQuery) {
				this.isPagedQuery = isPagedQuery;
			}

			public List<RequestParamListItem> getRequestParamList() {
				return this.requestParamList;
			}

			public void setRequestParamList(List<RequestParamListItem> requestParamList) {
				this.requestParamList = requestParamList;
			}

			public List<ResponseParamListItem> getResponseParamList() {
				return this.responseParamList;
			}

			public void setResponseParamList(List<ResponseParamListItem> responseParamList) {
				this.responseParamList = responseParamList;
			}

			public List<PublicParamListItem> getPublicParamList() {
				return this.publicParamList;
			}

			public void setPublicParamList(List<PublicParamListItem> publicParamList) {
				this.publicParamList = publicParamList;
			}

			public RegisterApi getRegisterApi() {
				return this.registerApi;
			}

			public void setRegisterApi(RegisterApi registerApi) {
				this.registerApi = registerApi;
			}

			public static class RequestParamListItem {

				private Long id;

				private String paramName;

				private String mappingColumn;

				private String paramType;

				private String sample;

				private String description;

				private String descriptionCode;

				private Long must;

				private Long optional;

				private String dateFormat;

				private String operator;

				private String originalColumn;

				private String initialValue;

				private String parameterLocation;

				private String defaultValue;

				private List<TableAndDsListItem> tableAndDsList;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getParamName() {
					return this.paramName;
				}

				public void setParamName(String paramName) {
					this.paramName = paramName;
				}

				public String getMappingColumn() {
					return this.mappingColumn;
				}

				public void setMappingColumn(String mappingColumn) {
					this.mappingColumn = mappingColumn;
				}

				public String getParamType() {
					return this.paramType;
				}

				public void setParamType(String paramType) {
					this.paramType = paramType;
				}

				public String getSample() {
					return this.sample;
				}

				public void setSample(String sample) {
					this.sample = sample;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getDescriptionCode() {
					return this.descriptionCode;
				}

				public void setDescriptionCode(String descriptionCode) {
					this.descriptionCode = descriptionCode;
				}

				public Long getMust() {
					return this.must;
				}

				public void setMust(Long must) {
					this.must = must;
				}

				public Long getOptional() {
					return this.optional;
				}

				public void setOptional(Long optional) {
					this.optional = optional;
				}

				public String getDateFormat() {
					return this.dateFormat;
				}

				public void setDateFormat(String dateFormat) {
					this.dateFormat = dateFormat;
				}

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}

				public String getOriginalColumn() {
					return this.originalColumn;
				}

				public void setOriginalColumn(String originalColumn) {
					this.originalColumn = originalColumn;
				}

				public String getInitialValue() {
					return this.initialValue;
				}

				public void setInitialValue(String initialValue) {
					this.initialValue = initialValue;
				}

				public String getParameterLocation() {
					return this.parameterLocation;
				}

				public void setParameterLocation(String parameterLocation) {
					this.parameterLocation = parameterLocation;
				}

				public String getDefaultValue() {
					return this.defaultValue;
				}

				public void setDefaultValue(String defaultValue) {
					this.defaultValue = defaultValue;
				}

				public List<TableAndDsListItem> getTableAndDsList() {
					return this.tableAndDsList;
				}

				public void setTableAndDsList(List<TableAndDsListItem> tableAndDsList) {
					this.tableAndDsList = tableAndDsList;
				}

				public static class TableAndDsListItem {

					private String datasourceId;

					private String datasourceName;

					private Long datasourceType;

					private String datasourceUrl;

					private String tableName;

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

					public Long getDatasourceType() {
						return this.datasourceType;
					}

					public void setDatasourceType(Long datasourceType) {
						this.datasourceType = datasourceType;
					}

					public String getDatasourceUrl() {
						return this.datasourceUrl;
					}

					public void setDatasourceUrl(String datasourceUrl) {
						this.datasourceUrl = datasourceUrl;
					}

					public String getTableName() {
						return this.tableName;
					}

					public void setTableName(String tableName) {
						this.tableName = tableName;
					}
				}
			}

			public static class ResponseParamListItem {

				private Long id;

				private String paramName;

				private String mappingColumn;

				private String paramType;

				private String sample;

				private String description;

				private String descriptionCode;

				private Long must;

				private Long optional;

				private String dateFormat;

				private String operator;

				private String originalColumn;

				private String initialValue;

				private String parameterLocation;

				private String defaultValue;

				private List<TableAndDsListItem2> tableAndDsList1;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getParamName() {
					return this.paramName;
				}

				public void setParamName(String paramName) {
					this.paramName = paramName;
				}

				public String getMappingColumn() {
					return this.mappingColumn;
				}

				public void setMappingColumn(String mappingColumn) {
					this.mappingColumn = mappingColumn;
				}

				public String getParamType() {
					return this.paramType;
				}

				public void setParamType(String paramType) {
					this.paramType = paramType;
				}

				public String getSample() {
					return this.sample;
				}

				public void setSample(String sample) {
					this.sample = sample;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getDescriptionCode() {
					return this.descriptionCode;
				}

				public void setDescriptionCode(String descriptionCode) {
					this.descriptionCode = descriptionCode;
				}

				public Long getMust() {
					return this.must;
				}

				public void setMust(Long must) {
					this.must = must;
				}

				public Long getOptional() {
					return this.optional;
				}

				public void setOptional(Long optional) {
					this.optional = optional;
				}

				public String getDateFormat() {
					return this.dateFormat;
				}

				public void setDateFormat(String dateFormat) {
					this.dateFormat = dateFormat;
				}

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}

				public String getOriginalColumn() {
					return this.originalColumn;
				}

				public void setOriginalColumn(String originalColumn) {
					this.originalColumn = originalColumn;
				}

				public String getInitialValue() {
					return this.initialValue;
				}

				public void setInitialValue(String initialValue) {
					this.initialValue = initialValue;
				}

				public String getParameterLocation() {
					return this.parameterLocation;
				}

				public void setParameterLocation(String parameterLocation) {
					this.parameterLocation = parameterLocation;
				}

				public String getDefaultValue() {
					return this.defaultValue;
				}

				public void setDefaultValue(String defaultValue) {
					this.defaultValue = defaultValue;
				}

				public List<TableAndDsListItem2> getTableAndDsList1() {
					return this.tableAndDsList1;
				}

				public void setTableAndDsList1(List<TableAndDsListItem2> tableAndDsList1) {
					this.tableAndDsList1 = tableAndDsList1;
				}

				public static class TableAndDsListItem2 {

					private String datasourceId;

					private String datasourceName;

					private Long datasourceType;

					private String datasourceUrl;

					private String tableName;

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

					public Long getDatasourceType() {
						return this.datasourceType;
					}

					public void setDatasourceType(Long datasourceType) {
						this.datasourceType = datasourceType;
					}

					public String getDatasourceUrl() {
						return this.datasourceUrl;
					}

					public void setDatasourceUrl(String datasourceUrl) {
						this.datasourceUrl = datasourceUrl;
					}

					public String getTableName() {
						return this.tableName;
					}

					public void setTableName(String tableName) {
						this.tableName = tableName;
					}
				}
			}

			public static class PublicParamListItem {

				private Long id;

				private String paramName;

				private String mappingColumn;

				private String paramType;

				private String sample;

				private String description;

				private String descriptionCode;

				private Long must;

				private Long optional;

				private String dateFormat;

				private String operator;

				private String originalColumn;

				private String initialValue;

				private String parameterLocation;

				private String defaultValue;

				private List<TableAndDsListItem4> tableAndDsList3;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getParamName() {
					return this.paramName;
				}

				public void setParamName(String paramName) {
					this.paramName = paramName;
				}

				public String getMappingColumn() {
					return this.mappingColumn;
				}

				public void setMappingColumn(String mappingColumn) {
					this.mappingColumn = mappingColumn;
				}

				public String getParamType() {
					return this.paramType;
				}

				public void setParamType(String paramType) {
					this.paramType = paramType;
				}

				public String getSample() {
					return this.sample;
				}

				public void setSample(String sample) {
					this.sample = sample;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getDescriptionCode() {
					return this.descriptionCode;
				}

				public void setDescriptionCode(String descriptionCode) {
					this.descriptionCode = descriptionCode;
				}

				public Long getMust() {
					return this.must;
				}

				public void setMust(Long must) {
					this.must = must;
				}

				public Long getOptional() {
					return this.optional;
				}

				public void setOptional(Long optional) {
					this.optional = optional;
				}

				public String getDateFormat() {
					return this.dateFormat;
				}

				public void setDateFormat(String dateFormat) {
					this.dateFormat = dateFormat;
				}

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}

				public String getOriginalColumn() {
					return this.originalColumn;
				}

				public void setOriginalColumn(String originalColumn) {
					this.originalColumn = originalColumn;
				}

				public String getInitialValue() {
					return this.initialValue;
				}

				public void setInitialValue(String initialValue) {
					this.initialValue = initialValue;
				}

				public String getParameterLocation() {
					return this.parameterLocation;
				}

				public void setParameterLocation(String parameterLocation) {
					this.parameterLocation = parameterLocation;
				}

				public String getDefaultValue() {
					return this.defaultValue;
				}

				public void setDefaultValue(String defaultValue) {
					this.defaultValue = defaultValue;
				}

				public List<TableAndDsListItem4> getTableAndDsList3() {
					return this.tableAndDsList3;
				}

				public void setTableAndDsList3(List<TableAndDsListItem4> tableAndDsList3) {
					this.tableAndDsList3 = tableAndDsList3;
				}

				public static class TableAndDsListItem4 {

					private String datasourceId;

					private String datasourceName;

					private Long datasourceType;

					private String datasourceUrl;

					private String tableName;

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

					public Long getDatasourceType() {
						return this.datasourceType;
					}

					public void setDatasourceType(Long datasourceType) {
						this.datasourceType = datasourceType;
					}

					public String getDatasourceUrl() {
						return this.datasourceUrl;
					}

					public void setDatasourceUrl(String datasourceUrl) {
						this.datasourceUrl = datasourceUrl;
					}

					public String getTableName() {
						return this.tableName;
					}

					public void setTableName(String tableName) {
						this.tableName = tableName;
					}
				}
			}

			public static class RegisterApi {

				private Long apiId;

				private Long modelType;

				private Long httpMethod;

				private String datasourceId;

				private String datasourceName;

				private String url;

				private String authenticationMode;

				private String protocol;

				private String path;

				private Long timeout;

				private String successExample;

				private String failExample;

				public Long getApiId() {
					return this.apiId;
				}

				public void setApiId(Long apiId) {
					this.apiId = apiId;
				}

				public Long getModelType() {
					return this.modelType;
				}

				public void setModelType(Long modelType) {
					this.modelType = modelType;
				}

				public Long getHttpMethod() {
					return this.httpMethod;
				}

				public void setHttpMethod(Long httpMethod) {
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

				public String getAuthenticationMode() {
					return this.authenticationMode;
				}

				public void setAuthenticationMode(String authenticationMode) {
					this.authenticationMode = authenticationMode;
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

				public Long getTimeout() {
					return this.timeout;
				}

				public void setTimeout(Long timeout) {
					this.timeout = timeout;
				}

				public String getSuccessExample() {
					return this.successExample;
				}

				public void setSuccessExample(String successExample) {
					this.successExample = successExample;
				}

				public String getFailExample() {
					return this.failExample;
				}

				public void setFailExample(String failExample) {
					this.failExample = failExample;
				}
			}
		}
	}

	@Override
	public ListApiByAppResponse getInstance(UnmarshallerContext context) {
		return	ListApiByAppResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
