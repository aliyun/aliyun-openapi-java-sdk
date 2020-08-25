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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryCasTaskLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCasTaskLogResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String host;

		private String logTime;

		private String message;

		private String resourceId;

		private String resourceType;

		private String severity;

		private String source;

		private String taskId;

		private Long taskTimes;

		private String type;

		private IaasErrorInfo iaasErrorInfo;

		private IaasRequest iaasRequest;

		private IaasResponse iaasResponse;

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public String getLogTime() {
			return this.logTime;
		}

		public void setLogTime(String logTime) {
			this.logTime = logTime;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getSeverity() {
			return this.severity;
		}

		public void setSeverity(String severity) {
			this.severity = severity;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public Long getTaskTimes() {
			return this.taskTimes;
		}

		public void setTaskTimes(Long taskTimes) {
			this.taskTimes = taskTimes;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public IaasErrorInfo getIaasErrorInfo() {
			return this.iaasErrorInfo;
		}

		public void setIaasErrorInfo(IaasErrorInfo iaasErrorInfo) {
			this.iaasErrorInfo = iaasErrorInfo;
		}

		public IaasRequest getIaasRequest() {
			return this.iaasRequest;
		}

		public void setIaasRequest(IaasRequest iaasRequest) {
			this.iaasRequest = iaasRequest;
		}

		public IaasResponse getIaasResponse() {
			return this.iaasResponse;
		}

		public void setIaasResponse(IaasResponse iaasResponse) {
			this.iaasResponse = iaasResponse;
		}

		public static class IaasErrorInfo {

			private String errorCode;

			private String errorMessage;

			private String hostId;

			private String requestId;

			private Long statusCode;

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getHostId() {
				return this.hostId;
			}

			public void setHostId(String hostId) {
				this.hostId = hostId;
			}

			public String getRequestId() {
				return this.requestId;
			}

			public void setRequestId(String requestId) {
				this.requestId = requestId;
			}

			public Long getStatusCode() {
				return this.statusCode;
			}

			public void setStatusCode(Long statusCode) {
				this.statusCode = statusCode;
			}
		}

		public static class IaasRequest {

			private String requestBody;

			private String requestMethod;

			private String requestUrl;

			private List<RequestHeadersItem> requestHeaders;

			public String getRequestBody() {
				return this.requestBody;
			}

			public void setRequestBody(String requestBody) {
				this.requestBody = requestBody;
			}

			public String getRequestMethod() {
				return this.requestMethod;
			}

			public void setRequestMethod(String requestMethod) {
				this.requestMethod = requestMethod;
			}

			public String getRequestUrl() {
				return this.requestUrl;
			}

			public void setRequestUrl(String requestUrl) {
				this.requestUrl = requestUrl;
			}

			public List<RequestHeadersItem> getRequestHeaders() {
				return this.requestHeaders;
			}

			public void setRequestHeaders(List<RequestHeadersItem> requestHeaders) {
				this.requestHeaders = requestHeaders;
			}

			public static class RequestHeadersItem {

				private String key;

				private String value;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class IaasResponse {

			private String responseBody;

			private List<ResponseHeadersItem> responseHeaders;

			public String getResponseBody() {
				return this.responseBody;
			}

			public void setResponseBody(String responseBody) {
				this.responseBody = responseBody;
			}

			public List<ResponseHeadersItem> getResponseHeaders() {
				return this.responseHeaders;
			}

			public void setResponseHeaders(List<ResponseHeadersItem> responseHeaders) {
				this.responseHeaders = responseHeaders;
			}

			public static class ResponseHeadersItem {

				private String key;

				private String value;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public QueryCasTaskLogResponse getInstance(UnmarshallerContext context) {
		return	QueryCasTaskLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
