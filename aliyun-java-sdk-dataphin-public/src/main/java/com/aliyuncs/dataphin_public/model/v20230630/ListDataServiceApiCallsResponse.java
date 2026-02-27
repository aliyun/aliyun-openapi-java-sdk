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

			private Long apiId;

			private Long appKey;

			private String appKeyStr;

			private String sql;

			private String clientIp;

			private String startTime;

			private String endTime;

			private Integer costTime;

			private String requestParameter;

			private String responseParameter;

			private Integer requestSize;

			private Integer responseSize;

			private Integer resultCount;

			private Boolean successful;

			private String httpStatusCode;

			private String httpStatusDescription;

			private String bizCode;

			private String bizCodeDescription;

			private String requestId;

			private Integer projectId;

			private String appName;

			private String apiName;

			private String projectName;

			private Integer env;

			private String jobId;

			private Integer status;

			private Integer executeMode;

			private Integer executeCostTime;

			public Long getApiId() {
				return this.apiId;
			}

			public void setApiId(Long apiId) {
				this.apiId = apiId;
			}

			public Long getAppKey() {
				return this.appKey;
			}

			public void setAppKey(Long appKey) {
				this.appKey = appKey;
			}

			public String getAppKeyStr() {
				return this.appKeyStr;
			}

			public void setAppKeyStr(String appKeyStr) {
				this.appKeyStr = appKeyStr;
			}

			public String getSql() {
				return this.sql;
			}

			public void setSql(String sql) {
				this.sql = sql;
			}

			public String getClientIp() {
				return this.clientIp;
			}

			public void setClientIp(String clientIp) {
				this.clientIp = clientIp;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public Integer getCostTime() {
				return this.costTime;
			}

			public void setCostTime(Integer costTime) {
				this.costTime = costTime;
			}

			public String getRequestParameter() {
				return this.requestParameter;
			}

			public void setRequestParameter(String requestParameter) {
				this.requestParameter = requestParameter;
			}

			public String getResponseParameter() {
				return this.responseParameter;
			}

			public void setResponseParameter(String responseParameter) {
				this.responseParameter = responseParameter;
			}

			public Integer getRequestSize() {
				return this.requestSize;
			}

			public void setRequestSize(Integer requestSize) {
				this.requestSize = requestSize;
			}

			public Integer getResponseSize() {
				return this.responseSize;
			}

			public void setResponseSize(Integer responseSize) {
				this.responseSize = responseSize;
			}

			public Integer getResultCount() {
				return this.resultCount;
			}

			public void setResultCount(Integer resultCount) {
				this.resultCount = resultCount;
			}

			public Boolean getSuccessful() {
				return this.successful;
			}

			public void setSuccessful(Boolean successful) {
				this.successful = successful;
			}

			public String getHttpStatusCode() {
				return this.httpStatusCode;
			}

			public void setHttpStatusCode(String httpStatusCode) {
				this.httpStatusCode = httpStatusCode;
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

			public String getBizCodeDescription() {
				return this.bizCodeDescription;
			}

			public void setBizCodeDescription(String bizCodeDescription) {
				this.bizCodeDescription = bizCodeDescription;
			}

			public String getRequestId() {
				return this.requestId;
			}

			public void setRequestId(String requestId) {
				this.requestId = requestId;
			}

			public Integer getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Integer projectId) {
				this.projectId = projectId;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getApiName() {
				return this.apiName;
			}

			public void setApiName(String apiName) {
				this.apiName = apiName;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public Integer getEnv() {
				return this.env;
			}

			public void setEnv(Integer env) {
				this.env = env;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Integer getExecuteMode() {
				return this.executeMode;
			}

			public void setExecuteMode(Integer executeMode) {
				this.executeMode = executeMode;
			}

			public Integer getExecuteCostTime() {
				return this.executeCostTime;
			}

			public void setExecuteCostTime(Integer executeCostTime) {
				this.executeCostTime = executeCostTime;
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
