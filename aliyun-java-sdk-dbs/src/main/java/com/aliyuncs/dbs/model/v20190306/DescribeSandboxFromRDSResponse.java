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

package com.aliyuncs.dbs.model.v20190306;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dbs.transform.v20190306.DescribeSandboxFromRDSResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSandboxFromRDSResponse extends AcsResponse {

	private Boolean success;

	private String errCode;

	private String errMessage;

	private Integer httpStatusCode;

	private String requestId;

	private String sourceId;

	private String backupPlanName;

	private String backupLog;

	private String dbsInstanceId;

	private Boolean supportSandbox;

	private Integer sandboxInstanceCount;

	private Long sandboxRecoverStartTime;

	private Long sandboxRecoverEndTime;

	private Boolean enabledSandbox;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getBackupPlanName() {
		return this.backupPlanName;
	}

	public void setBackupPlanName(String backupPlanName) {
		this.backupPlanName = backupPlanName;
	}

	public String getBackupLog() {
		return this.backupLog;
	}

	public void setBackupLog(String backupLog) {
		this.backupLog = backupLog;
	}

	public String getDbsInstanceId() {
		return this.dbsInstanceId;
	}

	public void setDbsInstanceId(String dbsInstanceId) {
		this.dbsInstanceId = dbsInstanceId;
	}

	public Boolean getSupportSandbox() {
		return this.supportSandbox;
	}

	public void setSupportSandbox(Boolean supportSandbox) {
		this.supportSandbox = supportSandbox;
	}

	public Integer getSandboxInstanceCount() {
		return this.sandboxInstanceCount;
	}

	public void setSandboxInstanceCount(Integer sandboxInstanceCount) {
		this.sandboxInstanceCount = sandboxInstanceCount;
	}

	public Long getSandboxRecoverStartTime() {
		return this.sandboxRecoverStartTime;
	}

	public void setSandboxRecoverStartTime(Long sandboxRecoverStartTime) {
		this.sandboxRecoverStartTime = sandboxRecoverStartTime;
	}

	public Long getSandboxRecoverEndTime() {
		return this.sandboxRecoverEndTime;
	}

	public void setSandboxRecoverEndTime(Long sandboxRecoverEndTime) {
		this.sandboxRecoverEndTime = sandboxRecoverEndTime;
	}

	public Boolean getEnabledSandbox() {
		return this.enabledSandbox;
	}

	public void setEnabledSandbox(Boolean enabledSandbox) {
		this.enabledSandbox = enabledSandbox;
	}

	@Override
	public DescribeSandboxFromRDSResponse getInstance(UnmarshallerContext context) {
		return	DescribeSandboxFromRDSResponseUnmarshaller.unmarshall(this, context);
	}
}
