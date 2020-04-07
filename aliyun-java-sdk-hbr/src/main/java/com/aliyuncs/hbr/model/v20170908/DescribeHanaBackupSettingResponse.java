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
import com.aliyuncs.hbr.transform.v20170908.DescribeHanaBackupSettingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHanaBackupSettingResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private HanaBackupSetting hanaBackupSetting;

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

	public HanaBackupSetting getHanaBackupSetting() {
		return this.hanaBackupSetting;
	}

	public void setHanaBackupSetting(HanaBackupSetting hanaBackupSetting) {
		this.hanaBackupSetting = hanaBackupSetting;
	}

	public static class HanaBackupSetting {

		private String databaseName;

		private Boolean enableAutoLogBackup;

		private String dataBackupParameterFile;

		private String logBackupParameterFile;

		private Boolean logBackupUsingBackint;

		private Long logBackupTimeout;

		private Boolean catalogBackupUsingBackint;

		private String catalogBackupParameterFile;

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public Boolean getEnableAutoLogBackup() {
			return this.enableAutoLogBackup;
		}

		public void setEnableAutoLogBackup(Boolean enableAutoLogBackup) {
			this.enableAutoLogBackup = enableAutoLogBackup;
		}

		public String getDataBackupParameterFile() {
			return this.dataBackupParameterFile;
		}

		public void setDataBackupParameterFile(String dataBackupParameterFile) {
			this.dataBackupParameterFile = dataBackupParameterFile;
		}

		public String getLogBackupParameterFile() {
			return this.logBackupParameterFile;
		}

		public void setLogBackupParameterFile(String logBackupParameterFile) {
			this.logBackupParameterFile = logBackupParameterFile;
		}

		public Boolean getLogBackupUsingBackint() {
			return this.logBackupUsingBackint;
		}

		public void setLogBackupUsingBackint(Boolean logBackupUsingBackint) {
			this.logBackupUsingBackint = logBackupUsingBackint;
		}

		public Long getLogBackupTimeout() {
			return this.logBackupTimeout;
		}

		public void setLogBackupTimeout(Long logBackupTimeout) {
			this.logBackupTimeout = logBackupTimeout;
		}

		public Boolean getCatalogBackupUsingBackint() {
			return this.catalogBackupUsingBackint;
		}

		public void setCatalogBackupUsingBackint(Boolean catalogBackupUsingBackint) {
			this.catalogBackupUsingBackint = catalogBackupUsingBackint;
		}

		public String getCatalogBackupParameterFile() {
			return this.catalogBackupParameterFile;
		}

		public void setCatalogBackupParameterFile(String catalogBackupParameterFile) {
			this.catalogBackupParameterFile = catalogBackupParameterFile;
		}
	}

	@Override
	public DescribeHanaBackupSettingResponse getInstance(UnmarshallerContext context) {
		return	DescribeHanaBackupSettingResponseUnmarshaller.unmarshall(this, context);
	}
}
