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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.FetchLosslessRuleListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FetchLosslessRuleListResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String httpCode;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pageNumber;

		private Long pageSize;

		private Long totalSize;

		private List<ApplicationList> results;

		public Long getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Long pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Long totalSize) {
			this.totalSize = totalSize;
		}

		public List<ApplicationList> getResults() {
			return this.results;
		}

		public void setResults(List<ApplicationList> results) {
			this.results = results;
		}

		public static class ApplicationList {

			private Boolean aligned;

			private String appId;

			private String appName;

			private Long count;

			private Long delayTime;

			private Boolean enable;

			private Long funcType;

			private Boolean related;

			private Long warmupTime;

			private Integer shutdownWaitSeconds;

			private Boolean lossLessDetail;

			private Boolean notice;

			public Boolean getAligned() {
				return this.aligned;
			}

			public void setAligned(Boolean aligned) {
				this.aligned = aligned;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}

			public Long getDelayTime() {
				return this.delayTime;
			}

			public void setDelayTime(Long delayTime) {
				this.delayTime = delayTime;
			}

			public Boolean getEnable() {
				return this.enable;
			}

			public void setEnable(Boolean enable) {
				this.enable = enable;
			}

			public Long getFuncType() {
				return this.funcType;
			}

			public void setFuncType(Long funcType) {
				this.funcType = funcType;
			}

			public Boolean getRelated() {
				return this.related;
			}

			public void setRelated(Boolean related) {
				this.related = related;
			}

			public Long getWarmupTime() {
				return this.warmupTime;
			}

			public void setWarmupTime(Long warmupTime) {
				this.warmupTime = warmupTime;
			}

			public Integer getShutdownWaitSeconds() {
				return this.shutdownWaitSeconds;
			}

			public void setShutdownWaitSeconds(Integer shutdownWaitSeconds) {
				this.shutdownWaitSeconds = shutdownWaitSeconds;
			}

			public Boolean getLossLessDetail() {
				return this.lossLessDetail;
			}

			public void setLossLessDetail(Boolean lossLessDetail) {
				this.lossLessDetail = lossLessDetail;
			}

			public Boolean getNotice() {
				return this.notice;
			}

			public void setNotice(Boolean notice) {
				this.notice = notice;
			}
		}
	}

	@Override
	public FetchLosslessRuleListResponse getInstance(UnmarshallerContext context) {
		return	FetchLosslessRuleListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
