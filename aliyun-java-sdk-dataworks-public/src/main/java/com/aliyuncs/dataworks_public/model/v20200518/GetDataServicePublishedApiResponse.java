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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetDataServicePublishedApiResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataServicePublishedApiResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String errorCode;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer timeout;

		private Integer status;

		private Long apiId;

		private Integer apiMode;

		private Long projectId;

		private Integer responseContentType;

		private String creatorId;

		private Integer visibleRange;

		private String modifiedTime;

		private String operatorId;

		private String groupId;

		private String description;

		private Integer requestMethod;

		private String createdTime;

		private String apiName;

		private Long tenantId;

		private String apiPath;

		private List<Integer> protocols;

		private RegistrationDetails registrationDetails;

		private ScriptDetails scriptDetails;

		private WizardDetails wizardDetails;

		public Integer getTimeout() {
			return this.timeout;
		}

		public void setTimeout(Integer timeout) {
			this.timeout = timeout;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getApiId() {
			return this.apiId;
		}

		public void setApiId(Long apiId) {
			this.apiId = apiId;
		}

		public Integer getApiMode() {
			return this.apiMode;
		}

		public void setApiMode(Integer apiMode) {
			this.apiMode = apiMode;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public Integer getResponseContentType() {
			return this.responseContentType;
		}

		public void setResponseContentType(Integer responseContentType) {
			this.responseContentType = responseContentType;
		}

		public String getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}

		public Integer getVisibleRange() {
			return this.visibleRange;
		}

		public void setVisibleRange(Integer visibleRange) {
			this.visibleRange = visibleRange;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getOperatorId() {
			return this.operatorId;
		}

		public void setOperatorId(String operatorId) {
			this.operatorId = operatorId;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getRequestMethod() {
			return this.requestMethod;
		}

		public void setRequestMethod(Integer requestMethod) {
			this.requestMethod = requestMethod;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getApiName() {
			return this.apiName;
		}

		public void setApiName(String apiName) {
			this.apiName = apiName;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public String getApiPath() {
			return this.apiPath;
		}

		public void setApiPath(String apiPath) {
			this.apiPath = apiPath;
		}

		public List<Integer> getProtocols() {
			return this.protocols;
		}

		public void setProtocols(List<Integer> protocols) {
			this.protocols = protocols;
		}

		public RegistrationDetails getRegistrationDetails() {
			return this.registrationDetails;
		}

		public void setRegistrationDetails(RegistrationDetails registrationDetails) {
			this.registrationDetails = registrationDetails;
		}

		public ScriptDetails getScriptDetails() {
			return this.scriptDetails;
		}

		public void setScriptDetails(ScriptDetails scriptDetails) {
			this.scriptDetails = scriptDetails;
		}

		public WizardDetails getWizardDetails() {
			return this.wizardDetails;
		}

		public void setWizardDetails(WizardDetails wizardDetails) {
			this.wizardDetails = wizardDetails;
		}

		public static class RegistrationDetails {

			private String serviceHost;

			private Integer serviceContentType;

			private String servicePath;

			private String successfulResultSample;

			private String failedResultSample;

			private String serviceRequestBodyDescription;

			private List<RegistrationErrorCode> registrationErrorCodes;

			private List<RegistrationRequestParameter> registrationRequestParameters;

			public String getServiceHost() {
				return this.serviceHost;
			}

			public void setServiceHost(String serviceHost) {
				this.serviceHost = serviceHost;
			}

			public Integer getServiceContentType() {
				return this.serviceContentType;
			}

			public void setServiceContentType(Integer serviceContentType) {
				this.serviceContentType = serviceContentType;
			}

			public String getServicePath() {
				return this.servicePath;
			}

			public void setServicePath(String servicePath) {
				this.servicePath = servicePath;
			}

			public String getSuccessfulResultSample() {
				return this.successfulResultSample;
			}

			public void setSuccessfulResultSample(String successfulResultSample) {
				this.successfulResultSample = successfulResultSample;
			}

			public String getFailedResultSample() {
				return this.failedResultSample;
			}

			public void setFailedResultSample(String failedResultSample) {
				this.failedResultSample = failedResultSample;
			}

			public String getServiceRequestBodyDescription() {
				return this.serviceRequestBodyDescription;
			}

			public void setServiceRequestBodyDescription(String serviceRequestBodyDescription) {
				this.serviceRequestBodyDescription = serviceRequestBodyDescription;
			}

			public List<RegistrationErrorCode> getRegistrationErrorCodes() {
				return this.registrationErrorCodes;
			}

			public void setRegistrationErrorCodes(List<RegistrationErrorCode> registrationErrorCodes) {
				this.registrationErrorCodes = registrationErrorCodes;
			}

			public List<RegistrationRequestParameter> getRegistrationRequestParameters() {
				return this.registrationRequestParameters;
			}

			public void setRegistrationRequestParameters(List<RegistrationRequestParameter> registrationRequestParameters) {
				this.registrationRequestParameters = registrationRequestParameters;
			}

			public static class RegistrationErrorCode {

				private String errorMessage;

				private String errorCode;

				private String errorSolution;

				public String getErrorMessage() {
					return this.errorMessage;
				}

				public void setErrorMessage(String errorMessage) {
					this.errorMessage = errorMessage;
				}

				public String getErrorCode() {
					return this.errorCode;
				}

				public void setErrorCode(String errorCode) {
					this.errorCode = errorCode;
				}

				public String getErrorSolution() {
					return this.errorSolution;
				}

				public void setErrorSolution(String errorSolution) {
					this.errorSolution = errorSolution;
				}
			}

			public static class RegistrationRequestParameter {

				private String parameterName;

				private Integer parameterPosition;

				private String parameterDescription;

				private String defaultValue;

				private Integer parameterOperator;

				private String exampleValue;

				private Integer parameterDataType;

				private Boolean isRequiredParameter;

				public String getParameterName() {
					return this.parameterName;
				}

				public void setParameterName(String parameterName) {
					this.parameterName = parameterName;
				}

				public Integer getParameterPosition() {
					return this.parameterPosition;
				}

				public void setParameterPosition(Integer parameterPosition) {
					this.parameterPosition = parameterPosition;
				}

				public String getParameterDescription() {
					return this.parameterDescription;
				}

				public void setParameterDescription(String parameterDescription) {
					this.parameterDescription = parameterDescription;
				}

				public String getDefaultValue() {
					return this.defaultValue;
				}

				public void setDefaultValue(String defaultValue) {
					this.defaultValue = defaultValue;
				}

				public Integer getParameterOperator() {
					return this.parameterOperator;
				}

				public void setParameterOperator(Integer parameterOperator) {
					this.parameterOperator = parameterOperator;
				}

				public String getExampleValue() {
					return this.exampleValue;
				}

				public void setExampleValue(String exampleValue) {
					this.exampleValue = exampleValue;
				}

				public Integer getParameterDataType() {
					return this.parameterDataType;
				}

				public void setParameterDataType(Integer parameterDataType) {
					this.parameterDataType = parameterDataType;
				}

				public Boolean getIsRequiredParameter() {
					return this.isRequiredParameter;
				}

				public void setIsRequiredParameter(Boolean isRequiredParameter) {
					this.isRequiredParameter = isRequiredParameter;
				}
			}
		}

		public static class ScriptDetails {

			private Boolean isPagedResponse;

			private String successfulResultSample;

			private String failedResultSample;

			private String script;

			private List<ScriptErrorCode> scriptErrorCodes;

			private List<ScriptRequestParameter> scriptRequestParameters;

			private List<ScriptResponseParameter> scriptResponseParameters;

			private ScriptConnection scriptConnection;

			public Boolean getIsPagedResponse() {
				return this.isPagedResponse;
			}

			public void setIsPagedResponse(Boolean isPagedResponse) {
				this.isPagedResponse = isPagedResponse;
			}

			public String getSuccessfulResultSample() {
				return this.successfulResultSample;
			}

			public void setSuccessfulResultSample(String successfulResultSample) {
				this.successfulResultSample = successfulResultSample;
			}

			public String getFailedResultSample() {
				return this.failedResultSample;
			}

			public void setFailedResultSample(String failedResultSample) {
				this.failedResultSample = failedResultSample;
			}

			public String getScript() {
				return this.script;
			}

			public void setScript(String script) {
				this.script = script;
			}

			public List<ScriptErrorCode> getScriptErrorCodes() {
				return this.scriptErrorCodes;
			}

			public void setScriptErrorCodes(List<ScriptErrorCode> scriptErrorCodes) {
				this.scriptErrorCodes = scriptErrorCodes;
			}

			public List<ScriptRequestParameter> getScriptRequestParameters() {
				return this.scriptRequestParameters;
			}

			public void setScriptRequestParameters(List<ScriptRequestParameter> scriptRequestParameters) {
				this.scriptRequestParameters = scriptRequestParameters;
			}

			public List<ScriptResponseParameter> getScriptResponseParameters() {
				return this.scriptResponseParameters;
			}

			public void setScriptResponseParameters(List<ScriptResponseParameter> scriptResponseParameters) {
				this.scriptResponseParameters = scriptResponseParameters;
			}

			public ScriptConnection getScriptConnection() {
				return this.scriptConnection;
			}

			public void setScriptConnection(ScriptConnection scriptConnection) {
				this.scriptConnection = scriptConnection;
			}

			public static class ScriptErrorCode {

				private String errorMessage;

				private String errorCode;

				private String errorSolution;

				public String getErrorMessage() {
					return this.errorMessage;
				}

				public void setErrorMessage(String errorMessage) {
					this.errorMessage = errorMessage;
				}

				public String getErrorCode() {
					return this.errorCode;
				}

				public void setErrorCode(String errorCode) {
					this.errorCode = errorCode;
				}

				public String getErrorSolution() {
					return this.errorSolution;
				}

				public void setErrorSolution(String errorSolution) {
					this.errorSolution = errorSolution;
				}
			}

			public static class ScriptRequestParameter {

				private String parameterName;

				private Integer parameterPosition;

				private String parameterDescription;

				private String defaultValue;

				private Integer parameterOperator;

				private String exampleValue;

				private Integer parameterDataType;

				private Boolean isRequiredParameter;

				public String getParameterName() {
					return this.parameterName;
				}

				public void setParameterName(String parameterName) {
					this.parameterName = parameterName;
				}

				public Integer getParameterPosition() {
					return this.parameterPosition;
				}

				public void setParameterPosition(Integer parameterPosition) {
					this.parameterPosition = parameterPosition;
				}

				public String getParameterDescription() {
					return this.parameterDescription;
				}

				public void setParameterDescription(String parameterDescription) {
					this.parameterDescription = parameterDescription;
				}

				public String getDefaultValue() {
					return this.defaultValue;
				}

				public void setDefaultValue(String defaultValue) {
					this.defaultValue = defaultValue;
				}

				public Integer getParameterOperator() {
					return this.parameterOperator;
				}

				public void setParameterOperator(Integer parameterOperator) {
					this.parameterOperator = parameterOperator;
				}

				public String getExampleValue() {
					return this.exampleValue;
				}

				public void setExampleValue(String exampleValue) {
					this.exampleValue = exampleValue;
				}

				public Integer getParameterDataType() {
					return this.parameterDataType;
				}

				public void setParameterDataType(Integer parameterDataType) {
					this.parameterDataType = parameterDataType;
				}

				public Boolean getIsRequiredParameter() {
					return this.isRequiredParameter;
				}

				public void setIsRequiredParameter(Boolean isRequiredParameter) {
					this.isRequiredParameter = isRequiredParameter;
				}
			}

			public static class ScriptResponseParameter {

				private String parameterDescription;

				private String parameterName;

				private String exampleValue;

				private Integer parameterDataType;

				public String getParameterDescription() {
					return this.parameterDescription;
				}

				public void setParameterDescription(String parameterDescription) {
					this.parameterDescription = parameterDescription;
				}

				public String getParameterName() {
					return this.parameterName;
				}

				public void setParameterName(String parameterName) {
					this.parameterName = parameterName;
				}

				public String getExampleValue() {
					return this.exampleValue;
				}

				public void setExampleValue(String exampleValue) {
					this.exampleValue = exampleValue;
				}

				public Integer getParameterDataType() {
					return this.parameterDataType;
				}

				public void setParameterDataType(Integer parameterDataType) {
					this.parameterDataType = parameterDataType;
				}
			}

			public static class ScriptConnection {

				private String tableName;

				private Long connectionId;

				public String getTableName() {
					return this.tableName;
				}

				public void setTableName(String tableName) {
					this.tableName = tableName;
				}

				public Long getConnectionId() {
					return this.connectionId;
				}

				public void setConnectionId(Long connectionId) {
					this.connectionId = connectionId;
				}
			}
		}

		public static class WizardDetails {

			private Boolean isPagedResponse;

			private String successfulResultSample;

			private String failedResultSample;

			private List<WizardErrorCode> wizardErrorCodes;

			private List<WizardRequestParameter> wizardRequestParameters;

			private List<WizardResponseParameter> wizardResponseParameters;

			private WizardConnection wizardConnection;

			public Boolean getIsPagedResponse() {
				return this.isPagedResponse;
			}

			public void setIsPagedResponse(Boolean isPagedResponse) {
				this.isPagedResponse = isPagedResponse;
			}

			public String getSuccessfulResultSample() {
				return this.successfulResultSample;
			}

			public void setSuccessfulResultSample(String successfulResultSample) {
				this.successfulResultSample = successfulResultSample;
			}

			public String getFailedResultSample() {
				return this.failedResultSample;
			}

			public void setFailedResultSample(String failedResultSample) {
				this.failedResultSample = failedResultSample;
			}

			public List<WizardErrorCode> getWizardErrorCodes() {
				return this.wizardErrorCodes;
			}

			public void setWizardErrorCodes(List<WizardErrorCode> wizardErrorCodes) {
				this.wizardErrorCodes = wizardErrorCodes;
			}

			public List<WizardRequestParameter> getWizardRequestParameters() {
				return this.wizardRequestParameters;
			}

			public void setWizardRequestParameters(List<WizardRequestParameter> wizardRequestParameters) {
				this.wizardRequestParameters = wizardRequestParameters;
			}

			public List<WizardResponseParameter> getWizardResponseParameters() {
				return this.wizardResponseParameters;
			}

			public void setWizardResponseParameters(List<WizardResponseParameter> wizardResponseParameters) {
				this.wizardResponseParameters = wizardResponseParameters;
			}

			public WizardConnection getWizardConnection() {
				return this.wizardConnection;
			}

			public void setWizardConnection(WizardConnection wizardConnection) {
				this.wizardConnection = wizardConnection;
			}

			public static class WizardErrorCode {

				private String errorMessage;

				private String errorCode;

				private String errorSolution;

				public String getErrorMessage() {
					return this.errorMessage;
				}

				public void setErrorMessage(String errorMessage) {
					this.errorMessage = errorMessage;
				}

				public String getErrorCode() {
					return this.errorCode;
				}

				public void setErrorCode(String errorCode) {
					this.errorCode = errorCode;
				}

				public String getErrorSolution() {
					return this.errorSolution;
				}

				public void setErrorSolution(String errorSolution) {
					this.errorSolution = errorSolution;
				}
			}

			public static class WizardRequestParameter {

				private String parameterName;

				private Integer parameterPosition;

				private String parameterDescription;

				private String defaultValue;

				private Integer parameterOperator;

				private String exampleValue;

				private Integer parameterDataType;

				private Boolean isRequiredParameter;

				public String getParameterName() {
					return this.parameterName;
				}

				public void setParameterName(String parameterName) {
					this.parameterName = parameterName;
				}

				public Integer getParameterPosition() {
					return this.parameterPosition;
				}

				public void setParameterPosition(Integer parameterPosition) {
					this.parameterPosition = parameterPosition;
				}

				public String getParameterDescription() {
					return this.parameterDescription;
				}

				public void setParameterDescription(String parameterDescription) {
					this.parameterDescription = parameterDescription;
				}

				public String getDefaultValue() {
					return this.defaultValue;
				}

				public void setDefaultValue(String defaultValue) {
					this.defaultValue = defaultValue;
				}

				public Integer getParameterOperator() {
					return this.parameterOperator;
				}

				public void setParameterOperator(Integer parameterOperator) {
					this.parameterOperator = parameterOperator;
				}

				public String getExampleValue() {
					return this.exampleValue;
				}

				public void setExampleValue(String exampleValue) {
					this.exampleValue = exampleValue;
				}

				public Integer getParameterDataType() {
					return this.parameterDataType;
				}

				public void setParameterDataType(Integer parameterDataType) {
					this.parameterDataType = parameterDataType;
				}

				public Boolean getIsRequiredParameter() {
					return this.isRequiredParameter;
				}

				public void setIsRequiredParameter(Boolean isRequiredParameter) {
					this.isRequiredParameter = isRequiredParameter;
				}
			}

			public static class WizardResponseParameter {

				private String parameterDescription;

				private String parameterName;

				private String exampleValue;

				private Integer parameterDataType;

				public String getParameterDescription() {
					return this.parameterDescription;
				}

				public void setParameterDescription(String parameterDescription) {
					this.parameterDescription = parameterDescription;
				}

				public String getParameterName() {
					return this.parameterName;
				}

				public void setParameterName(String parameterName) {
					this.parameterName = parameterName;
				}

				public String getExampleValue() {
					return this.exampleValue;
				}

				public void setExampleValue(String exampleValue) {
					this.exampleValue = exampleValue;
				}

				public Integer getParameterDataType() {
					return this.parameterDataType;
				}

				public void setParameterDataType(Integer parameterDataType) {
					this.parameterDataType = parameterDataType;
				}
			}

			public static class WizardConnection {

				private String tableName;

				private Long connectionId;

				public String getTableName() {
					return this.tableName;
				}

				public void setTableName(String tableName) {
					this.tableName = tableName;
				}

				public Long getConnectionId() {
					return this.connectionId;
				}

				public void setConnectionId(Long connectionId) {
					this.connectionId = connectionId;
				}
			}
		}
	}

	@Override
	public GetDataServicePublishedApiResponse getInstance(UnmarshallerContext context) {
		return	GetDataServicePublishedApiResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
