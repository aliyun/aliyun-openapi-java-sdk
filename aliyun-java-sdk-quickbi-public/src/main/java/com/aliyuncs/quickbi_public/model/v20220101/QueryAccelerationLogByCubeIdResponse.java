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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.QueryAccelerationLogByCubeIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAccelerationLogByCubeIdResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer totalPages;

		private Integer totalNum;

		private Integer pageNum;

		private Integer pageSize;

		private Integer pre;

		private Integer next;

		private List<DataItem> data;

		public Integer getTotalPages() {
			return this.totalPages;
		}

		public void setTotalPages(Integer totalPages) {
			this.totalPages = totalPages;
		}

		public Integer getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Integer totalNum) {
			this.totalNum = totalNum;
		}

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPre() {
			return this.pre;
		}

		public void setPre(Integer pre) {
			this.pre = pre;
		}

		public Integer getNext() {
			return this.next;
		}

		public void setNext(Integer next) {
			this.next = next;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private String jobId;

			private String jobHistoryId;

			private String jonStartDate;

			private String jobStatus;

			private String duration;

			private String log;

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public String getJobHistoryId() {
				return this.jobHistoryId;
			}

			public void setJobHistoryId(String jobHistoryId) {
				this.jobHistoryId = jobHistoryId;
			}

			public String getJonStartDate() {
				return this.jonStartDate;
			}

			public void setJonStartDate(String jonStartDate) {
				this.jonStartDate = jonStartDate;
			}

			public String getJobStatus() {
				return this.jobStatus;
			}

			public void setJobStatus(String jobStatus) {
				this.jobStatus = jobStatus;
			}

			public String getDuration() {
				return this.duration;
			}

			public void setDuration(String duration) {
				this.duration = duration;
			}

			public String getLog() {
				return this.log;
			}

			public void setLog(String log) {
				this.log = log;
			}
		}
	}

	@Override
	public QueryAccelerationLogByCubeIdResponse getInstance(UnmarshallerContext context) {
		return	QueryAccelerationLogByCubeIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
