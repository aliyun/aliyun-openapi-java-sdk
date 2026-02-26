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

package com.aliyuncs.eds_aic.model.v20230930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_aic.transform.v20230930.BatchGetAcpConnectionTicketResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchGetAcpConnectionTicketResponse extends AcsResponse {

	private String requestId;

	private List<Data> instanceConnectionModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getInstanceConnectionModels() {
		return this.instanceConnectionModels;
	}

	public void setInstanceConnectionModels(List<Data> instanceConnectionModels) {
		this.instanceConnectionModels = instanceConnectionModels;
	}

	public static class Data {

		private String appInstanceGroupId;

		private String instanceId;

		private String taskStatus;

		private String taskId;

		private String ticket;

		private String errorCode;

		private String persistentAppInstanceId;

		private String appInstanceId;

		public String getAppInstanceGroupId() {
			return this.appInstanceGroupId;
		}

		public void setAppInstanceGroupId(String appInstanceGroupId) {
			this.appInstanceGroupId = appInstanceGroupId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getTicket() {
			return this.ticket;
		}

		public void setTicket(String ticket) {
			this.ticket = ticket;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getPersistentAppInstanceId() {
			return this.persistentAppInstanceId;
		}

		public void setPersistentAppInstanceId(String persistentAppInstanceId) {
			this.persistentAppInstanceId = persistentAppInstanceId;
		}

		public String getAppInstanceId() {
			return this.appInstanceId;
		}

		public void setAppInstanceId(String appInstanceId) {
			this.appInstanceId = appInstanceId;
		}
	}

	@Override
	public BatchGetAcpConnectionTicketResponse getInstance(UnmarshallerContext context) {
		return	BatchGetAcpConnectionTicketResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
