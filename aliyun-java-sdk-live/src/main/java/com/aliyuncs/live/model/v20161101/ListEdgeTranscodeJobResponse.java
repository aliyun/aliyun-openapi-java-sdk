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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.ListEdgeTranscodeJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEdgeTranscodeJobResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<Job> jobList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Job> getJobList() {
		return this.jobList;
	}

	public void setJobList(List<Job> jobList) {
		this.jobList = jobList;
	}

	public static class Job {

		private String createTime;

		private String jobId;

		private String lastStartAt;

		private String lastStopAt;

		private String name;

		private String status;

		private String streamInput;

		private String streamOutput;

		private String templateId;

		private String templateName;

		private String type;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getLastStartAt() {
			return this.lastStartAt;
		}

		public void setLastStartAt(String lastStartAt) {
			this.lastStartAt = lastStartAt;
		}

		public String getLastStopAt() {
			return this.lastStopAt;
		}

		public void setLastStopAt(String lastStopAt) {
			this.lastStopAt = lastStopAt;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStreamInput() {
			return this.streamInput;
		}

		public void setStreamInput(String streamInput) {
			this.streamInput = streamInput;
		}

		public String getStreamOutput() {
			return this.streamOutput;
		}

		public void setStreamOutput(String streamOutput) {
			this.streamOutput = streamOutput;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public ListEdgeTranscodeJobResponse getInstance(UnmarshallerContext context) {
		return	ListEdgeTranscodeJobResponseUnmarshaller.unmarshall(this, context);
	}
}
