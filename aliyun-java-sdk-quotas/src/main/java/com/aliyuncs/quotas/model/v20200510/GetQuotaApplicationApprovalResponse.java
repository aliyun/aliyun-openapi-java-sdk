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

package com.aliyuncs.quotas.model.v20200510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quotas.transform.v20200510.GetQuotaApplicationApprovalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQuotaApplicationApprovalResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String dynamicCode;

	private String dynamicMessage;

	private String errorMsg;

	private String errorCode;

	private Boolean success;

	private Boolean allowRetry;

	private List<String> errorArgs;

	private Module module;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Boolean getAllowRetry() {
		return this.allowRetry;
	}

	public void setAllowRetry(Boolean allowRetry) {
		this.allowRetry = allowRetry;
	}

	public List<String> getErrorArgs() {
		return this.errorArgs;
	}

	public void setErrorArgs(List<String> errorArgs) {
		this.errorArgs = errorArgs;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public static class Module {

		private Integer approvalHours;

		private Boolean supportReminder;

		private String unsupportReminderReason;

		private Integer reminderIntervalHours;

		public Integer getApprovalHours() {
			return this.approvalHours;
		}

		public void setApprovalHours(Integer approvalHours) {
			this.approvalHours = approvalHours;
		}

		public Boolean getSupportReminder() {
			return this.supportReminder;
		}

		public void setSupportReminder(Boolean supportReminder) {
			this.supportReminder = supportReminder;
		}

		public String getUnsupportReminderReason() {
			return this.unsupportReminderReason;
		}

		public void setUnsupportReminderReason(String unsupportReminderReason) {
			this.unsupportReminderReason = unsupportReminderReason;
		}

		public Integer getReminderIntervalHours() {
			return this.reminderIntervalHours;
		}

		public void setReminderIntervalHours(Integer reminderIntervalHours) {
			this.reminderIntervalHours = reminderIntervalHours;
		}
	}

	@Override
	public GetQuotaApplicationApprovalResponse getInstance(UnmarshallerContext context) {
		return	GetQuotaApplicationApprovalResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
