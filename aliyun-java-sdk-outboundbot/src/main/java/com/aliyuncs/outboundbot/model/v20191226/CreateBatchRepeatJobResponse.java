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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.CreateBatchRepeatJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateBatchRepeatJobResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private JobGroup jobGroup;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public JobGroup getJobGroup() {
		return this.jobGroup;
	}

	public void setJobGroup(JobGroup jobGroup) {
		this.jobGroup = jobGroup;
	}

	public static class JobGroup {

		private String id;

		private Long ringingDuration;

		private String priority;

		private Long minConcurrency;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Long getRingingDuration() {
			return this.ringingDuration;
		}

		public void setRingingDuration(Long ringingDuration) {
			this.ringingDuration = ringingDuration;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public Long getMinConcurrency() {
			return this.minConcurrency;
		}

		public void setMinConcurrency(Long minConcurrency) {
			this.minConcurrency = minConcurrency;
		}
	}

	@Override
	public CreateBatchRepeatJobResponse getInstance(UnmarshallerContext context) {
		return	CreateBatchRepeatJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
