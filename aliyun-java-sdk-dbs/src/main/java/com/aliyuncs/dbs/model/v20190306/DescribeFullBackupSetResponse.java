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
import com.aliyuncs.dbs.transform.v20190306.DescribeFullBackupSetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFullBackupSetResponse extends AcsResponse {

	private Boolean success;

	private String errCode;

	private String errMessage;

	private Integer httpStatusCode;

	private String requestId;

	private String backupSetId;

	private String sourceEndpointIpPort;

	private Long startTime;

	private Long endTime;

	private String backupStatus;

	private Long backupSetExpiredTime;

	private Long backupSize;

	private String storageMethod;

	private String errMessage1;

	private String backupObjects;

	private Long createTime;

	private Long finishTime;

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

	public String getBackupSetId() {
		return this.backupSetId;
	}

	public void setBackupSetId(String backupSetId) {
		this.backupSetId = backupSetId;
	}

	public String getSourceEndpointIpPort() {
		return this.sourceEndpointIpPort;
	}

	public void setSourceEndpointIpPort(String sourceEndpointIpPort) {
		this.sourceEndpointIpPort = sourceEndpointIpPort;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public String getBackupStatus() {
		return this.backupStatus;
	}

	public void setBackupStatus(String backupStatus) {
		this.backupStatus = backupStatus;
	}

	public Long getBackupSetExpiredTime() {
		return this.backupSetExpiredTime;
	}

	public void setBackupSetExpiredTime(Long backupSetExpiredTime) {
		this.backupSetExpiredTime = backupSetExpiredTime;
	}

	public Long getBackupSize() {
		return this.backupSize;
	}

	public void setBackupSize(Long backupSize) {
		this.backupSize = backupSize;
	}

	public String getStorageMethod() {
		return this.storageMethod;
	}

	public void setStorageMethod(String storageMethod) {
		this.storageMethod = storageMethod;
	}

	public String getErrMessage1() {
		return this.errMessage1;
	}

	public void setErrMessage1(String errMessage1) {
		this.errMessage1 = errMessage1;
	}

	public String getBackupObjects() {
		return this.backupObjects;
	}

	public void setBackupObjects(String backupObjects) {
		this.backupObjects = backupObjects;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getFinishTime() {
		return this.finishTime;
	}

	public void setFinishTime(Long finishTime) {
		this.finishTime = finishTime;
	}

	@Override
	public DescribeFullBackupSetResponse getInstance(UnmarshallerContext context) {
		return	DescribeFullBackupSetResponseUnmarshaller.unmarshall(this, context);
	}
}
