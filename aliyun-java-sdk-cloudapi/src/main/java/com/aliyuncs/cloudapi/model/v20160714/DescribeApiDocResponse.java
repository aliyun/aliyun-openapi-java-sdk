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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeApiDocResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApiDocResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private String groupId;

	private String groupName;

	private String stageName;

	private String apiId;

	private String apiName;

	private String description;

	private String visibility;

	private String authType;

	private String resultType;

	private String resultSample;

	private String failResultSample;

	private String deployedTime;

	private Boolean forceNonceCheck;

	private Boolean disableInternet;

	private List<ErrorCodeSample> errorCodeSamples;

	private List<ResultDescription> resultDescriptions;

	private List<RequestParameter> requestParameters;

	private RequestConfig requestConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizRegionId() {
		return this.regionId;
	}

	public void setBizRegionId(String regionId) {
		this.regionId = regionId;
	}

	/**
	 * @deprecated use getBizRegionId instead of this.
	 */
	@Deprecated
	public String getRegionId() {
		return this.regionId;
	}

	/**
	 * @deprecated use setBizRegionId instead of this.
	 */
	@Deprecated
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getStageName() {
		return this.stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public String getApiId() {
		return this.apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getApiName() {
		return this.apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getAuthType() {
		return this.authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getResultType() {
		return this.resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	public String getResultSample() {
		return this.resultSample;
	}

	public void setResultSample(String resultSample) {
		this.resultSample = resultSample;
	}

	public String getFailResultSample() {
		return this.failResultSample;
	}

	public void setFailResultSample(String failResultSample) {
		this.failResultSample = failResultSample;
	}

	public String getDeployedTime() {
		return this.deployedTime;
	}

	public void setDeployedTime(String deployedTime) {
		this.deployedTime = deployedTime;
	}

	public Boolean getForceNonceCheck() {
		return this.forceNonceCheck;
	}

	public void setForceNonceCheck(Boolean forceNonceCheck) {
		this.forceNonceCheck = forceNonceCheck;
	}

	public Boolean getDisableInternet() {
		return this.disableInternet;
	}

	public void setDisableInternet(Boolean disableInternet) {
		this.disableInternet = disableInternet;
	}

	public List<ErrorCodeSample> getErrorCodeSamples() {
		return this.errorCodeSamples;
	}

	public void setErrorCodeSamples(List<ErrorCodeSample> errorCodeSamples) {
		this.errorCodeSamples = errorCodeSamples;
	}

	public List<ResultDescription> getResultDescriptions() {
		return this.resultDescriptions;
	}

	public void setResultDescriptions(List<ResultDescription> resultDescriptions) {
		this.resultDescriptions = resultDescriptions;
	}

	public List<RequestParameter> getRequestParameters() {
		return this.requestParameters;
	}

	public void setRequestParameters(List<RequestParameter> requestParameters) {
		this.requestParameters = requestParameters;
	}

	public RequestConfig getRequestConfig() {
		return this.requestConfig;
	}

	public void setRequestConfig(RequestConfig requestConfig) {
		this.requestConfig = requestConfig;
	}

	public static class ErrorCodeSample {

		private String code;

		private String message;

		private String description;

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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	public static class ResultDescription {

		private String id;

		private String pid;

		private Boolean hasChild;

		private String key;

		private String name;

		private Boolean mandatory;

		private String type;

		private String description;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPid() {
			return this.pid;
		}

		public void setPid(String pid) {
			this.pid = pid;
		}

		public Boolean getHasChild() {
			return this.hasChild;
		}

		public void setHasChild(Boolean hasChild) {
			this.hasChild = hasChild;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getMandatory() {
			return this.mandatory;
		}

		public void setMandatory(Boolean mandatory) {
			this.mandatory = mandatory;
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
	}

	public static class RequestParameter {

		private String apiParameterName;

		private String location;

		private String parameterType;

		private String required;

		private String defaultValue;

		private String demoValue;

		private Long maxValue;

		private Long minValue;

		private Long maxLength;

		private Long minLength;

		private String regularExpression;

		private String jsonScheme;

		private String enumValue;

		private String docShow;

		private Integer docOrder;

		private String description;

		public String getApiParameterName() {
			return this.apiParameterName;
		}

		public void setApiParameterName(String apiParameterName) {
			this.apiParameterName = apiParameterName;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getParameterType() {
			return this.parameterType;
		}

		public void setParameterType(String parameterType) {
			this.parameterType = parameterType;
		}

		public String getRequired() {
			return this.required;
		}

		public void setRequired(String required) {
			this.required = required;
		}

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}

		public String getDemoValue() {
			return this.demoValue;
		}

		public void setDemoValue(String demoValue) {
			this.demoValue = demoValue;
		}

		public Long getMaxValue() {
			return this.maxValue;
		}

		public void setMaxValue(Long maxValue) {
			this.maxValue = maxValue;
		}

		public Long getMinValue() {
			return this.minValue;
		}

		public void setMinValue(Long minValue) {
			this.minValue = minValue;
		}

		public Long getMaxLength() {
			return this.maxLength;
		}

		public void setMaxLength(Long maxLength) {
			this.maxLength = maxLength;
		}

		public Long getMinLength() {
			return this.minLength;
		}

		public void setMinLength(Long minLength) {
			this.minLength = minLength;
		}

		public String getRegularExpression() {
			return this.regularExpression;
		}

		public void setRegularExpression(String regularExpression) {
			this.regularExpression = regularExpression;
		}

		public String getJsonScheme() {
			return this.jsonScheme;
		}

		public void setJsonScheme(String jsonScheme) {
			this.jsonScheme = jsonScheme;
		}

		public String getEnumValue() {
			return this.enumValue;
		}

		public void setEnumValue(String enumValue) {
			this.enumValue = enumValue;
		}

		public String getDocShow() {
			return this.docShow;
		}

		public void setDocShow(String docShow) {
			this.docShow = docShow;
		}

		public Integer getDocOrder() {
			return this.docOrder;
		}

		public void setDocOrder(Integer docOrder) {
			this.docOrder = docOrder;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	public static class RequestConfig {

		private String requestProtocol;

		private String requestHttpMethod;

		private String requestPath;

		private String bodyFormat;

		private String postBodyDescription;

		private String requestMode;

		public String getRequestProtocol() {
			return this.requestProtocol;
		}

		public void setRequestProtocol(String requestProtocol) {
			this.requestProtocol = requestProtocol;
		}

		public String getRequestHttpMethod() {
			return this.requestHttpMethod;
		}

		public void setRequestHttpMethod(String requestHttpMethod) {
			this.requestHttpMethod = requestHttpMethod;
		}

		public String getRequestPath() {
			return this.requestPath;
		}

		public void setRequestPath(String requestPath) {
			this.requestPath = requestPath;
		}

		public String getBodyFormat() {
			return this.bodyFormat;
		}

		public void setBodyFormat(String bodyFormat) {
			this.bodyFormat = bodyFormat;
		}

		public String getPostBodyDescription() {
			return this.postBodyDescription;
		}

		public void setPostBodyDescription(String postBodyDescription) {
			this.postBodyDescription = postBodyDescription;
		}

		public String getRequestMode() {
			return this.requestMode;
		}

		public void setRequestMode(String requestMode) {
			this.requestMode = requestMode;
		}
	}

	@Override
	public DescribeApiDocResponse getInstance(UnmarshallerContext context) {
		return	DescribeApiDocResponseUnmarshaller.unmarshall(this, context);
	}
}
