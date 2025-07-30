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
import com.aliyuncs.dataphin_public.transform.v20230630.ListDataServiceApiImpactsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataServiceApiImpactsResponse extends AcsResponse {

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

		private List<Impact> impactList;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<Impact> getImpactList() {
			return this.impactList;
		}

		public void setImpactList(List<Impact> impactList) {
			this.impactList = impactList;
		}

		public static class Impact {

			private Long clientFailCount;

			private String totalTimeCost;

			private String successTimeCost;

			private Long errorCount;

			private String clientIp;

			private String appName;

			private Long errorApiCount;

			private Long totalCount;

			private String lastCallTime;

			private String minute;

			private Long offlineCount;

			private Long appKey;

			private Long callCount;

			private Long apiId;

			private String errorRate;

			public Long getClientFailCount() {
				return this.clientFailCount;
			}

			public void setClientFailCount(Long clientFailCount) {
				this.clientFailCount = clientFailCount;
			}

			public String getTotalTimeCost() {
				return this.totalTimeCost;
			}

			public void setTotalTimeCost(String totalTimeCost) {
				this.totalTimeCost = totalTimeCost;
			}

			public String getSuccessTimeCost() {
				return this.successTimeCost;
			}

			public void setSuccessTimeCost(String successTimeCost) {
				this.successTimeCost = successTimeCost;
			}

			public Long getErrorCount() {
				return this.errorCount;
			}

			public void setErrorCount(Long errorCount) {
				this.errorCount = errorCount;
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

			public Long getErrorApiCount() {
				return this.errorApiCount;
			}

			public void setErrorApiCount(Long errorApiCount) {
				this.errorApiCount = errorApiCount;
			}

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}

			public String getLastCallTime() {
				return this.lastCallTime;
			}

			public void setLastCallTime(String lastCallTime) {
				this.lastCallTime = lastCallTime;
			}

			public String getMinute() {
				return this.minute;
			}

			public void setMinute(String minute) {
				this.minute = minute;
			}

			public Long getOfflineCount() {
				return this.offlineCount;
			}

			public void setOfflineCount(Long offlineCount) {
				this.offlineCount = offlineCount;
			}

			public Long getAppKey() {
				return this.appKey;
			}

			public void setAppKey(Long appKey) {
				this.appKey = appKey;
			}

			public Long getCallCount() {
				return this.callCount;
			}

			public void setCallCount(Long callCount) {
				this.callCount = callCount;
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
		}
	}

	@Override
	public ListDataServiceApiImpactsResponse getInstance(UnmarshallerContext context) {
		return	ListDataServiceApiImpactsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
