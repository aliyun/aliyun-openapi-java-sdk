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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribeHanaRetentionSettingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHanaRetentionSettingResponse extends AcsResponse {

	private String requestId;

	private String vaultId;

	private String schedule;

	private Boolean success;

	private String databaseName;

	private Long lastExecuteTime;

	private Boolean disabled;

	private String code;

	private Long retentionDays;

	private String message;

	private String clusterId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVaultId() {
		return this.vaultId;
	}

	public void setVaultId(String vaultId) {
		this.vaultId = vaultId;
	}

	public String getSchedule() {
		return this.schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getDatabaseName() {
		return this.databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public Long getLastExecuteTime() {
		return this.lastExecuteTime;
	}

	public void setLastExecuteTime(Long lastExecuteTime) {
		this.lastExecuteTime = lastExecuteTime;
	}

	public Boolean getDisabled() {
		return this.disabled;
	}

	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getRetentionDays() {
		return this.retentionDays;
	}

	public void setRetentionDays(Long retentionDays) {
		this.retentionDays = retentionDays;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	@Override
	public DescribeHanaRetentionSettingResponse getInstance(UnmarshallerContext context) {
		return	DescribeHanaRetentionSettingResponseUnmarshaller.unmarshall(this, context);
	}
}
