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

	private Boolean success;

	private Integer code;

	private String errorCode;

	private Integer httpStatusCode;

	private String message;

	private Data data;

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

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalSize;

		private List<ApplicationList> results;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Integer totalSize) {
			this.totalSize = totalSize;
		}

		public List<ApplicationList> getResults() {
			return this.results;
		}

		public void setResults(List<ApplicationList> results) {
			this.results = results;
		}

		public static class ApplicationList {

			private String appName;

			private String appId;

			private Integer count;

			private Boolean enable;

			private Integer warmupTime;

			private Integer delayTime;

			private Integer funcType;

			private Boolean aligned;

			private Boolean related;

			private Boolean lossLessDetail;

			private Boolean notice;

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public Boolean getEnable() {
				return this.enable;
			}

			public void setEnable(Boolean enable) {
				this.enable = enable;
			}

			public Integer getWarmupTime() {
				return this.warmupTime;
			}

			public void setWarmupTime(Integer warmupTime) {
				this.warmupTime = warmupTime;
			}

			public Integer getDelayTime() {
				return this.delayTime;
			}

			public void setDelayTime(Integer delayTime) {
				this.delayTime = delayTime;
			}

			public Integer getFuncType() {
				return this.funcType;
			}

			public void setFuncType(Integer funcType) {
				this.funcType = funcType;
			}

			public Boolean getAligned() {
				return this.aligned;
			}

			public void setAligned(Boolean aligned) {
				this.aligned = aligned;
			}

			public Boolean getRelated() {
				return this.related;
			}

			public void setRelated(Boolean related) {
				this.related = related;
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
