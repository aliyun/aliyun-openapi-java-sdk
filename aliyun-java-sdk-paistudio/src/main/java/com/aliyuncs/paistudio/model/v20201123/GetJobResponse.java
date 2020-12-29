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

package com.aliyuncs.paistudio.model.v20201123;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.paistudio.transform.v20201123.GetJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetJobResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String jobId;

		private String experimentId;

		private String creator;

		private String createTime;

		private String executeType;

		private String anchorNodeId;

		private String runId;

		private String status;

		private String snapshot;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getExperimentId() {
			return this.experimentId;
		}

		public void setExperimentId(String experimentId) {
			this.experimentId = experimentId;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getExecuteType() {
			return this.executeType;
		}

		public void setExecuteType(String executeType) {
			this.executeType = executeType;
		}

		public String getAnchorNodeId() {
			return this.anchorNodeId;
		}

		public void setAnchorNodeId(String anchorNodeId) {
			this.anchorNodeId = anchorNodeId;
		}

		public String getRunId() {
			return this.runId;
		}

		public void setRunId(String runId) {
			this.runId = runId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSnapshot() {
			return this.snapshot;
		}

		public void setSnapshot(String snapshot) {
			this.snapshot = snapshot;
		}
	}

	@Override
	public GetJobResponse getInstance(UnmarshallerContext context) {
		return	GetJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
