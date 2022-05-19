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

package com.aliyuncs.lmztest.model.v20100101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.lmztest.transform.v20100101.SportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SportResponse extends AcsResponse {

	private String requestId;

	private Job job;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public static class Job {

		private String status;

		private String response;

		private String type;

		private String createTime;

		private Boolean completed;

		private String error;

		private String id;

		private Integer progess;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getResponse() {
			return this.response;
		}

		public void setResponse(String response) {
			this.response = response;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Boolean getCompleted() {
			return this.completed;
		}

		public void setCompleted(Boolean completed) {
			this.completed = completed;
		}

		public String getError() {
			return this.error;
		}

		public void setError(String error) {
			this.error = error;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Integer getProgess() {
			return this.progess;
		}

		public void setProgess(Integer progess) {
			this.progess = progess;
		}
	}

	@Override
	public SportResponse getInstance(UnmarshallerContext context) {
		return	SportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
