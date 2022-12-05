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
import com.aliyuncs.cloudapi.transform.v20160714.QueryRequestLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRequestLogsResponse extends AcsResponse {

	private String requestId;

	private List<RequestLog> requestLogs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RequestLog> getRequestLogs() {
		return this.requestLogs;
	}

	public void setRequestLogs(List<RequestLog> requestLogs) {
		this.requestLogs = requestLogs;
	}

	public static class RequestLog {

		private String apiId;

		private String apiName;

		private String consumerAppKey;

		private String totalLatency;

		private String httpMethod;

		private String domain;

		private String errorMessage;

		private String consumerAppId;

		private String instanceId;

		private String clientNonce;

		private String requestSize;

		private String stageId;

		private String stageName;

		private String httpPath;

		private String requestId;

		private String groupId;

		private String groupName;

		private String errorCode;

		private String responseSize;

		private String region;

		private String statusCode;

		private String clientIp;

		private String serviceLatency;

		private String requestTime;

		private String exception;

		private String customTraceId;

		private String jwtClaims;

		private String requestProtocol;

		private String requestHeaders;

		private String requestQueryString;

		private String requestBody;

		private String responseHeaders;

		private String responseBody;

		private String plugin;

		private String initialRequestId;

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

		public String getConsumerAppKey() {
			return this.consumerAppKey;
		}

		public void setConsumerAppKey(String consumerAppKey) {
			this.consumerAppKey = consumerAppKey;
		}

		public String getTotalLatency() {
			return this.totalLatency;
		}

		public void setTotalLatency(String totalLatency) {
			this.totalLatency = totalLatency;
		}

		public String getHttpMethod() {
			return this.httpMethod;
		}

		public void setHttpMethod(String httpMethod) {
			this.httpMethod = httpMethod;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getConsumerAppId() {
			return this.consumerAppId;
		}

		public void setConsumerAppId(String consumerAppId) {
			this.consumerAppId = consumerAppId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getClientNonce() {
			return this.clientNonce;
		}

		public void setClientNonce(String clientNonce) {
			this.clientNonce = clientNonce;
		}

		public String getRequestSize() {
			return this.requestSize;
		}

		public void setRequestSize(String requestSize) {
			this.requestSize = requestSize;
		}

		public String getStageId() {
			return this.stageId;
		}

		public void setStageId(String stageId) {
			this.stageId = stageId;
		}

		public String getStageName() {
			return this.stageName;
		}

		public void setStageName(String stageName) {
			this.stageName = stageName;
		}

		public String getHttpPath() {
			return this.httpPath;
		}

		public void setHttpPath(String httpPath) {
			this.httpPath = httpPath;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
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

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getResponseSize() {
			return this.responseSize;
		}

		public void setResponseSize(String responseSize) {
			this.responseSize = responseSize;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}

		public String getClientIp() {
			return this.clientIp;
		}

		public void setClientIp(String clientIp) {
			this.clientIp = clientIp;
		}

		public String getServiceLatency() {
			return this.serviceLatency;
		}

		public void setServiceLatency(String serviceLatency) {
			this.serviceLatency = serviceLatency;
		}

		public String getRequestTime() {
			return this.requestTime;
		}

		public void setRequestTime(String requestTime) {
			this.requestTime = requestTime;
		}

		public String getException() {
			return this.exception;
		}

		public void setException(String exception) {
			this.exception = exception;
		}

		public String getCustomTraceId() {
			return this.customTraceId;
		}

		public void setCustomTraceId(String customTraceId) {
			this.customTraceId = customTraceId;
		}

		public String getJwtClaims() {
			return this.jwtClaims;
		}

		public void setJwtClaims(String jwtClaims) {
			this.jwtClaims = jwtClaims;
		}

		public String getRequestProtocol() {
			return this.requestProtocol;
		}

		public void setRequestProtocol(String requestProtocol) {
			this.requestProtocol = requestProtocol;
		}

		public String getRequestHeaders() {
			return this.requestHeaders;
		}

		public void setRequestHeaders(String requestHeaders) {
			this.requestHeaders = requestHeaders;
		}

		public String getRequestQueryString() {
			return this.requestQueryString;
		}

		public void setRequestQueryString(String requestQueryString) {
			this.requestQueryString = requestQueryString;
		}

		public String getRequestBody() {
			return this.requestBody;
		}

		public void setRequestBody(String requestBody) {
			this.requestBody = requestBody;
		}

		public String getResponseHeaders() {
			return this.responseHeaders;
		}

		public void setResponseHeaders(String responseHeaders) {
			this.responseHeaders = responseHeaders;
		}

		public String getResponseBody() {
			return this.responseBody;
		}

		public void setResponseBody(String responseBody) {
			this.responseBody = responseBody;
		}

		public String getPlugin() {
			return this.plugin;
		}

		public void setPlugin(String plugin) {
			this.plugin = plugin;
		}

		public String getInitialRequestId() {
			return this.initialRequestId;
		}

		public void setInitialRequestId(String initialRequestId) {
			this.initialRequestId = initialRequestId;
		}
	}

	@Override
	public QueryRequestLogsResponse getInstance(UnmarshallerContext context) {
		return	QueryRequestLogsResponseUnmarshaller.unmarshall(this, context);
	}
}
