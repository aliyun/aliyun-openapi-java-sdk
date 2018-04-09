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

package com.aliyuncs.cms.model.v20180308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20180308.TaskConfigUnhealthyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TaskConfigUnhealthyResponse extends AcsResponse {

	private Integer errorCode;

	private String errorMessage;

	private Boolean success;

	private String requestId;

	private List<NodeTaskInstance> unhealthyList;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<NodeTaskInstance> getUnhealthyList() {
		return this.unhealthyList;
	}

	public void setUnhealthyList(List<NodeTaskInstance> unhealthyList) {
		this.unhealthyList = unhealthyList;
	}

	public static class NodeTaskInstance {

		private Long taskId;

		private List<String> instanceList;

		public Long getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}

		public List<String> getInstanceList() {
			return this.instanceList;
		}

		public void setInstanceList(List<String> instanceList) {
			this.instanceList = instanceList;
		}
	}

	@Override
	public TaskConfigUnhealthyResponse getInstance(UnmarshallerContext context) {
		return	TaskConfigUnhealthyResponseUnmarshaller.unmarshall(this, context);
	}
}
