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

package com.aliyuncs.viapi.model.v20230117;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.viapi.transform.v20230117.QueryAsyncJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAsyncJobListResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Boolean success;

	private String httpCode;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalPage;

		private Integer totalRecord;

		private List<ResultItem> result;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Integer totalPage) {
			this.totalPage = totalPage;
		}

		public Integer getTotalRecord() {
			return this.totalRecord;
		}

		public void setTotalRecord(Integer totalRecord) {
			this.totalRecord = totalRecord;
		}

		public List<ResultItem> getResult() {
			return this.result;
		}

		public void setResult(List<ResultItem> result) {
			this.result = result;
		}

		public static class ResultItem {

			private String callerParentId;

			private String endTime;

			private String gmtCreate;

			private String jobId;

			private String popApiName;

			private String popProduct;

			private String startTime;

			private String status;

			public String getCallerParentId() {
				return this.callerParentId;
			}

			public void setCallerParentId(String callerParentId) {
				this.callerParentId = callerParentId;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public String getPopApiName() {
				return this.popApiName;
			}

			public void setPopApiName(String popApiName) {
				this.popApiName = popApiName;
			}

			public String getPopProduct() {
				return this.popProduct;
			}

			public void setPopProduct(String popProduct) {
				this.popProduct = popProduct;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public QueryAsyncJobListResponse getInstance(UnmarshallerContext context) {
		return	QueryAsyncJobListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
