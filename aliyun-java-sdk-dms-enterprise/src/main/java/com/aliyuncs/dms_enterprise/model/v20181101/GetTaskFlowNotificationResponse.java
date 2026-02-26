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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetTaskFlowNotificationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskFlowNotificationResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Notification notification;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
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

	public Notification getNotification() {
		return this.notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

	public static class Notification {

		private Boolean dagNotificationFail;

		private Boolean dagNotificationSuccess;

		private Boolean dagNotificationSla;

		public Boolean getDagNotificationFail() {
			return this.dagNotificationFail;
		}

		public void setDagNotificationFail(Boolean dagNotificationFail) {
			this.dagNotificationFail = dagNotificationFail;
		}

		public Boolean getDagNotificationSuccess() {
			return this.dagNotificationSuccess;
		}

		public void setDagNotificationSuccess(Boolean dagNotificationSuccess) {
			this.dagNotificationSuccess = dagNotificationSuccess;
		}

		public Boolean getDagNotificationSla() {
			return this.dagNotificationSla;
		}

		public void setDagNotificationSla(Boolean dagNotificationSla) {
			this.dagNotificationSla = dagNotificationSla;
		}
	}

	@Override
	public GetTaskFlowNotificationResponse getInstance(UnmarshallerContext context) {
		return	GetTaskFlowNotificationResponseUnmarshaller.unmarshall(this, context);
	}
}
