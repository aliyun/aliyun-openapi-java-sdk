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
import com.aliyuncs.dataphin_public.transform.v20230630.ListDataServiceApiCallsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataServiceApiCallsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private PageResult pageResult;

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

	public PageResult getPageResult() {
		return this.pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public static class PageResult {

		private Long totalCount;

		private List<CallLog> callLogList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<CallLog> getCallLogList() {
			return this.callLogList;
		}

		public void setCallLogList(List<CallLog> callLogList) {
			this.callLogList = callLogList;
		}

		public static class CallLog {

			private String endTime;

			private String projectName;

			private Integer resultCount;

			private Integer env;

			private String clientIp;

			private String appName;

			private Integer costTime;

			private Integer responseSize;

			private String responseParameter;

			private Long appKey;

			private String httpStatusCode;

			private String bizCodeDescription;

			private Integer executeMode;

			private String jobId;

			private String httpStatusDescription;

			private String bizCode;

			private Integer status;

			private String requestId;

			private String apiName;

			private String requestParameter;

			private Integer requestSize;

			private String startTime;

			private Integer projectId;

			private Boolean successful;

			private String sql;

			private Integer executeCostTime;

			private Long apiId;

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public Integer getResultCount() {
				return this.resultCount;
			}

			public void setResultCount(Integer resultCount) {
				this.resultCount = resultCount;
			}

			public Integer getEnv() {
				return this.env;
			}

			public void setEnv(Integer env) {
				this.env = env;
			}

			public String getClientIp() {
				return this.clientIp;
			}

			public void setClientIp(String clientIp) {
				this.clientIp = clientIp;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public Integer getCostTime() {
				return this.costTime;
			}

			public void setCostTime(Integer costTime) {
				this.costTime = costTime;
			}

			public Integer getResponseSize() {
				return this.responseSize;
			}

			public void setResponseSize(Integer responseSize) {
				this.responseSize = responseSize;
			}

			public String getResponseParameter() {
				return this.responseParameter;
			}

			public void setResponseParameter(String responseParameter) {
				this.responseParameter = responseParameter;
			}

			public Long getAppKey() {
				return this.appKey;
			}

			public void setAppKey(Long appKey) {
				this.appKey = appKey;
			}

			public String getHttpStatusCode() {
				return this.httpStatusCode;
			}

			public void setHttpStatusCode(String httpStatusCode) {
				this.httpStatusCode = httpStatusCode;
			}

			public String getBizCodeDescription() {
				return this.bizCodeDescription;
			}

			public void setBizCodeDescription(String bizCodeDescription) {
				this.bizCodeDescription = bizCodeDescription;
			}

			public Integer getExecuteMode() {
				return this.executeMode;
			}

			public void setExecuteMode(Integer executeMode) {
				this.executeMode = executeMode;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public String getHttpStatusDescription() {
				return this.httpStatusDescription;
			}

			public void setHttpStatusDescription(String httpStatusDescription) {
				this.httpStatusDescription = httpStatusDescription;
			}

			public String getBizCode() {
				return this.bizCode;
			}

			public void setBizCode(String bizCode) {
				this.bizCode = bizCode;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getRequestId() {
				return this.requestId;
			}

			public void setRequestId(String requestId) {
				this.requestId = requestId;
			}

			public String getApiName() {
				return this.apiName;
			}

			public void setApiName(String apiName) {
				this.apiName = apiName;
			}

			public String getRequestParameter() {
				return this.requestParameter;
			}

			public void setRequestParameter(String requestParameter) {
				this.requestParameter = requestParameter;
			}

			public Integer getRequestSize() {
				return this.requestSize;
			}

			public void setRequestSize(Integer requestSize) {
				this.requestSize = requestSize;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public Integer getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Integer projectId) {
				this.projectId = projectId;
			}

			public Boolean getSuccessful() {
				return this.successful;
			}

			public void setSuccessful(Boolean successful) {
				this.successful = successful;
			}

			public String getSql() {
				return this.sql;
			}

			public void setSql(String sql) {
				this.sql = sql;
			}

			public Integer getExecuteCostTime() {
				return this.executeCostTime;
			}

			public void setExecuteCostTime(Integer executeCostTime) {
				this.executeCostTime = executeCostTime;
			}

			public Long getApiId() {
				return this.apiId;
			}

			public void setApiId(Long apiId) {
				this.apiId = apiId;
			}
		}
	}

	@Override
	public ListDataServiceApiCallsResponse getInstance(UnmarshallerContext context) {
		return	ListDataServiceApiCallsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
