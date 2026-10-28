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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.quotas.transform.v20200510.StartQuotaUtilizationReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StartQuotaUtilizationReportResponse extends AcsResponse {

	private Boolean refreshSuccess;

	private String message;

	private String requestId;

	private String errorMsg;

	private String errorCode;

	private String nextRefreshTime;

	private Boolean success;

	public Boolean getRefreshSuccess() {
		return this.refreshSuccess;
	}

	public void setRefreshSuccess(Boolean refreshSuccess) {
		this.refreshSuccess = refreshSuccess;
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

	public String getNextRefreshTime() {
		return this.nextRefreshTime;
	}

	public void setNextRefreshTime(String nextRefreshTime) {
		this.nextRefreshTime = nextRefreshTime;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	@Override
	public StartQuotaUtilizationReportResponse getInstance(UnmarshallerContext context) {
		return	StartQuotaUtilizationReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
