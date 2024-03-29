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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.TestNetworkConnectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TestNetworkConnectionResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private TaskList taskList;

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

	public TaskList getTaskList() {
		return this.taskList;
	}

	public void setTaskList(TaskList taskList) {
		this.taskList = taskList;
	}

	public static class TaskList {

		private String connectMessage;

		private Boolean connectStatus;

		public String getConnectMessage() {
			return this.connectMessage;
		}

		public void setConnectMessage(String connectMessage) {
			this.connectMessage = connectMessage;
		}

		public Boolean getConnectStatus() {
			return this.connectStatus;
		}

		public void setConnectStatus(Boolean connectStatus) {
			this.connectStatus = connectStatus;
		}
	}

	@Override
	public TestNetworkConnectionResponse getInstance(UnmarshallerContext context) {
		return	TestNetworkConnectionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
