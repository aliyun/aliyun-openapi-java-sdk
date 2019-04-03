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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.PreCheckSqlFlashbackTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PreCheckSqlFlashbackTaskResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private CheckResult checkResult;

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

	public CheckResult getCheckResult() {
		return this.checkResult;
	}

	public void setCheckResult(CheckResult checkResult) {
		this.checkResult = checkResult;
	}

	public static class CheckResult {

		private Boolean binlogExists;

		private Boolean supportBinlogRowQueryEvents;

		private Boolean binlogRowQueryEventEnabled;

		private Boolean canUpgradeSupportBinlogRowQueryEvents;

		public Boolean getBinlogExists() {
			return this.binlogExists;
		}

		public void setBinlogExists(Boolean binlogExists) {
			this.binlogExists = binlogExists;
		}

		public Boolean getSupportBinlogRowQueryEvents() {
			return this.supportBinlogRowQueryEvents;
		}

		public void setSupportBinlogRowQueryEvents(Boolean supportBinlogRowQueryEvents) {
			this.supportBinlogRowQueryEvents = supportBinlogRowQueryEvents;
		}

		public Boolean getBinlogRowQueryEventEnabled() {
			return this.binlogRowQueryEventEnabled;
		}

		public void setBinlogRowQueryEventEnabled(Boolean binlogRowQueryEventEnabled) {
			this.binlogRowQueryEventEnabled = binlogRowQueryEventEnabled;
		}

		public Boolean getCanUpgradeSupportBinlogRowQueryEvents() {
			return this.canUpgradeSupportBinlogRowQueryEvents;
		}

		public void setCanUpgradeSupportBinlogRowQueryEvents(Boolean canUpgradeSupportBinlogRowQueryEvents) {
			this.canUpgradeSupportBinlogRowQueryEvents = canUpgradeSupportBinlogRowQueryEvents;
		}
	}

	@Override
	public PreCheckSqlFlashbackTaskResponse getInstance(UnmarshallerContext context) {
		return	PreCheckSqlFlashbackTaskResponseUnmarshaller.unmarshall(this, context);
	}
}
