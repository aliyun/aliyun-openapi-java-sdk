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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.QuerySmarttagJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySmarttagJobListResponse extends AcsResponse {

	private String nextPageToken;

	private String requestId;

	private List<SmarttagJob> smarttagJobs;

	private List<String> nonExistJobIds;

	public String getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SmarttagJob> getSmarttagJobs() {
		return this.smarttagJobs;
	}

	public void setSmarttagJobs(List<SmarttagJob> smarttagJobs) {
		this.smarttagJobs = smarttagJobs;
	}

	public List<String> getNonExistJobIds() {
		return this.nonExistJobIds;
	}

	public void setNonExistJobIds(List<String> nonExistJobIds) {
		this.nonExistJobIds = nonExistJobIds;
	}

	public static class SmarttagJob {

		private String status;

		private String creationTime;

		private String finishTime;

		private String jobId;

		private String pipelineId;

		private String templateId;

		private String input;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getPipelineId() {
			return this.pipelineId;
		}

		public void setPipelineId(String pipelineId) {
			this.pipelineId = pipelineId;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getInput() {
			return this.input;
		}

		public void setInput(String input) {
			this.input = input;
		}
	}

	@Override
	public QuerySmarttagJobListResponse getInstance(UnmarshallerContext context) {
		return	QuerySmarttagJobListResponseUnmarshaller.unmarshall(this, context);
	}
}
