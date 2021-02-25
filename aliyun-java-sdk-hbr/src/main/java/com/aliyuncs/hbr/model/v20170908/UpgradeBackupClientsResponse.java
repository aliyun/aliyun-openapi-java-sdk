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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.UpgradeBackupClientsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpgradeBackupClientsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private String taskId;

	private List<InstanceStatusesItem> instanceStatuses;

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

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public List<InstanceStatusesItem> getInstanceStatuses() {
		return this.instanceStatuses;
	}

	public void setInstanceStatuses(List<InstanceStatusesItem> instanceStatuses) {
		this.instanceStatuses = instanceStatuses;
	}

	public static class InstanceStatusesItem {

		private String instanceId;

		private Boolean validInstance;

		private String errorCode;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Boolean getValidInstance() {
			return this.validInstance;
		}

		public void setValidInstance(Boolean validInstance) {
			this.validInstance = validInstance;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
	}

	@Override
	public UpgradeBackupClientsResponse getInstance(UnmarshallerContext context) {
		return	UpgradeBackupClientsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
