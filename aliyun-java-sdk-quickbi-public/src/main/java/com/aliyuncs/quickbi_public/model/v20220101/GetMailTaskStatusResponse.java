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
import com.aliyuncs.quickbi_public.transform.v20220101.GetMailTaskStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMailTaskStatusResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<DATA> result;

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

	public List<DATA> getResult() {
		return this.result;
	}

	public void setResult(List<DATA> result) {
		this.result = result;
	}

	public static class DATA {

		private String execTime;

		private String mailId;

		private String status;

		private Long taskId;

		public String getExecTime() {
			return this.execTime;
		}

		public void setExecTime(String execTime) {
			this.execTime = execTime;
		}

		public String getMailId() {
			return this.mailId;
		}

		public void setMailId(String mailId) {
			this.mailId = mailId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}
	}

	@Override
	public GetMailTaskStatusResponse getInstance(UnmarshallerContext context) {
		return	GetMailTaskStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
