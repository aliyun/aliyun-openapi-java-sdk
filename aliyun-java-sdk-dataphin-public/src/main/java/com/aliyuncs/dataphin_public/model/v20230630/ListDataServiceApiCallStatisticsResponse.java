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
import com.aliyuncs.dataphin_public.transform.v20230630.ListDataServiceApiCallStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataServiceApiCallStatisticsResponse extends AcsResponse {

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

		private Integer totalCount;

		private List<CallStatistics> callStatisticsList;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<CallStatistics> getCallStatisticsList() {
			return this.callStatisticsList;
		}

		public void setCallStatisticsList(List<CallStatistics> callStatisticsList) {
			this.callStatisticsList = callStatisticsList;
		}

		public static class CallStatistics {

			private String apiName;

			private String projectName;

			private Integer projectId;

			private String creator;

			private String errorCount;

			private Integer authorizedAppCount;

			private Integer sqlId;

			private String offlineRate;

			private String lastCallTime;

			private Long callCount;

			private Double avgResponseTime;

			private Long apiId;

			private String errorRate;

			private List<String> appNameList;

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

			public Integer getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Integer projectId) {
				this.projectId = projectId;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getErrorCount() {
				return this.errorCount;
			}

			public void setErrorCount(String errorCount) {
				this.errorCount = errorCount;
			}

			public Integer getAuthorizedAppCount() {
				return this.authorizedAppCount;
			}

			public void setAuthorizedAppCount(Integer authorizedAppCount) {
				this.authorizedAppCount = authorizedAppCount;
			}

			public Integer getSqlId() {
				return this.sqlId;
			}

			public void setSqlId(Integer sqlId) {
				this.sqlId = sqlId;
			}

			public String getOfflineRate() {
				return this.offlineRate;
			}

			public void setOfflineRate(String offlineRate) {
				this.offlineRate = offlineRate;
			}

			public String getLastCallTime() {
				return this.lastCallTime;
			}

			public void setLastCallTime(String lastCallTime) {
				this.lastCallTime = lastCallTime;
			}

			public Long getCallCount() {
				return this.callCount;
			}

			public void setCallCount(Long callCount) {
				this.callCount = callCount;
			}

			public Double getAvgResponseTime() {
				return this.avgResponseTime;
			}

			public void setAvgResponseTime(Double avgResponseTime) {
				this.avgResponseTime = avgResponseTime;
			}

			public Long getApiId() {
				return this.apiId;
			}

			public void setApiId(Long apiId) {
				this.apiId = apiId;
			}

			public String getErrorRate() {
				return this.errorRate;
			}

			public void setErrorRate(String errorRate) {
				this.errorRate = errorRate;
			}

			public List<String> getAppNameList() {
				return this.appNameList;
			}

			public void setAppNameList(List<String> appNameList) {
				this.appNameList = appNameList;
			}
		}
	}

	@Override
	public ListDataServiceApiCallStatisticsResponse getInstance(UnmarshallerContext context) {
		return	ListDataServiceApiCallStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
