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

package com.aliyuncs.retailcloud.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.ListJobHistoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobHistoriesResponse extends AcsResponse {

	private Integer code;

	private Integer pageNumber;

	private String requestId;

	private Integer pageSize;

	private Long totalCount;

	private String errorMsg;

	private List<JobDetail> data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public List<JobDetail> getData() {
		return this.data;
	}

	public void setData(List<JobDetail> data) {
		this.data = data;
	}

	public static class JobDetail {

		private String name;

		private String completionTime;

		private String startTime;

		private Integer succeeded;

		private Integer failed;

		private String message;

		private Integer activeDeadlineSeconds;

		private Integer backoffLimit;

		private Integer completions;

		private Integer parallelism;

		private List<String> podList;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCompletionTime() {
			return this.completionTime;
		}

		public void setCompletionTime(String completionTime) {
			this.completionTime = completionTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public Integer getSucceeded() {
			return this.succeeded;
		}

		public void setSucceeded(Integer succeeded) {
			this.succeeded = succeeded;
		}

		public Integer getFailed() {
			return this.failed;
		}

		public void setFailed(Integer failed) {
			this.failed = failed;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Integer getActiveDeadlineSeconds() {
			return this.activeDeadlineSeconds;
		}

		public void setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
			this.activeDeadlineSeconds = activeDeadlineSeconds;
		}

		public Integer getBackoffLimit() {
			return this.backoffLimit;
		}

		public void setBackoffLimit(Integer backoffLimit) {
			this.backoffLimit = backoffLimit;
		}

		public Integer getCompletions() {
			return this.completions;
		}

		public void setCompletions(Integer completions) {
			this.completions = completions;
		}

		public Integer getParallelism() {
			return this.parallelism;
		}

		public void setParallelism(Integer parallelism) {
			this.parallelism = parallelism;
		}

		public List<String> getPodList() {
			return this.podList;
		}

		public void setPodList(List<String> podList) {
			this.podList = podList;
		}
	}

	@Override
	public ListJobHistoriesResponse getInstance(UnmarshallerContext context) {
		return	ListJobHistoriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
