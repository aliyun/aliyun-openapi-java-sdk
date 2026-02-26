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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.ListPipelineJobHistorysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPipelineJobHistorysResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String errorCode;

	private String nextToken;

	private Integer totalCount;

	private List<Job> jobs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Job> getJobs() {
		return this.jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	public static class Job {

		private String jobName;

		private String identifier;

		private Long pipelineId;

		private Integer executeNumber;

		private Long jobId;

		private Long pipelineRunId;

		private String sources;

		private String status;

		private String operatorAccountId;

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public Long getPipelineId() {
			return this.pipelineId;
		}

		public void setPipelineId(Long pipelineId) {
			this.pipelineId = pipelineId;
		}

		public Integer getExecuteNumber() {
			return this.executeNumber;
		}

		public void setExecuteNumber(Integer executeNumber) {
			this.executeNumber = executeNumber;
		}

		public Long getJobId() {
			return this.jobId;
		}

		public void setJobId(Long jobId) {
			this.jobId = jobId;
		}

		public Long getPipelineRunId() {
			return this.pipelineRunId;
		}

		public void setPipelineRunId(Long pipelineRunId) {
			this.pipelineRunId = pipelineRunId;
		}

		public String getSources() {
			return this.sources;
		}

		public void setSources(String sources) {
			this.sources = sources;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getOperatorAccountId() {
			return this.operatorAccountId;
		}

		public void setOperatorAccountId(String operatorAccountId) {
			this.operatorAccountId = operatorAccountId;
		}
	}

	@Override
	public ListPipelineJobHistorysResponse getInstance(UnmarshallerContext context) {
		return	ListPipelineJobHistorysResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
