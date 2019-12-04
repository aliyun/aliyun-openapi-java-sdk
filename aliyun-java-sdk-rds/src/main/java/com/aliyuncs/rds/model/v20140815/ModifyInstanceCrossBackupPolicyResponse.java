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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.ModifyInstanceCrossBackupPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyInstanceCrossBackupPolicyResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private String regionId;

	private String crossBackupRegion;

	private String crossBackupType;

	private String backupEnabled;

	private String logBackupEnabled;

	private String storageOwner;

	private String storageType;

	private String endpoint;

	private Integer retentType;

	private Integer retention;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getCrossBackupRegion() {
		return this.crossBackupRegion;
	}

	public void setCrossBackupRegion(String crossBackupRegion) {
		this.crossBackupRegion = crossBackupRegion;
	}

	public String getCrossBackupType() {
		return this.crossBackupType;
	}

	public void setCrossBackupType(String crossBackupType) {
		this.crossBackupType = crossBackupType;
	}

	public String getBackupEnabled() {
		return this.backupEnabled;
	}

	public void setBackupEnabled(String backupEnabled) {
		this.backupEnabled = backupEnabled;
	}

	public String getLogBackupEnabled() {
		return this.logBackupEnabled;
	}

	public void setLogBackupEnabled(String logBackupEnabled) {
		this.logBackupEnabled = logBackupEnabled;
	}

	public String getStorageOwner() {
		return this.storageOwner;
	}

	public void setStorageOwner(String storageOwner) {
		this.storageOwner = storageOwner;
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	public String getEndpoint() {
		return this.endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public Integer getRetentType() {
		return this.retentType;
	}

	public void setRetentType(Integer retentType) {
		this.retentType = retentType;
	}

	public Integer getRetention() {
		return this.retention;
	}

	public void setRetention(Integer retention) {
		this.retention = retention;
	}

	@Override
	public ModifyInstanceCrossBackupPolicyResponse getInstance(UnmarshallerContext context) {
		return	ModifyInstanceCrossBackupPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
