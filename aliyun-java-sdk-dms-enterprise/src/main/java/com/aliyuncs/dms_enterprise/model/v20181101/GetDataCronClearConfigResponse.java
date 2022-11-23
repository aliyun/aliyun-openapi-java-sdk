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
import com.aliyuncs.dms_enterprise.transform.v20181101.GetDataCronClearConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataCronClearConfigResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private DataCronClearConfig dataCronClearConfig;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public DataCronClearConfig getDataCronClearConfig() {
		return this.dataCronClearConfig;
	}

	public void setDataCronClearConfig(DataCronClearConfig dataCronClearConfig) {
		this.dataCronClearConfig = dataCronClearConfig;
	}

	public static class DataCronClearConfig {

		private String cronFormat;

		private String duration;

		private String cronStatus;

		private String cronCallTimes;

		private String cronLastCallStartTime;

		private String cronNextCallTime;

		private Long optimizeTableAfterEveryClearTimes;

		private Long currentClearTaskCount;

		public String getCronFormat() {
			return this.cronFormat;
		}

		public void setCronFormat(String cronFormat) {
			this.cronFormat = cronFormat;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getCronStatus() {
			return this.cronStatus;
		}

		public void setCronStatus(String cronStatus) {
			this.cronStatus = cronStatus;
		}

		public String getCronCallTimes() {
			return this.cronCallTimes;
		}

		public void setCronCallTimes(String cronCallTimes) {
			this.cronCallTimes = cronCallTimes;
		}

		public String getCronLastCallStartTime() {
			return this.cronLastCallStartTime;
		}

		public void setCronLastCallStartTime(String cronLastCallStartTime) {
			this.cronLastCallStartTime = cronLastCallStartTime;
		}

		public String getCronNextCallTime() {
			return this.cronNextCallTime;
		}

		public void setCronNextCallTime(String cronNextCallTime) {
			this.cronNextCallTime = cronNextCallTime;
		}

		public Long getOptimizeTableAfterEveryClearTimes() {
			return this.optimizeTableAfterEveryClearTimes;
		}

		public void setOptimizeTableAfterEveryClearTimes(Long optimizeTableAfterEveryClearTimes) {
			this.optimizeTableAfterEveryClearTimes = optimizeTableAfterEveryClearTimes;
		}

		public Long getCurrentClearTaskCount() {
			return this.currentClearTaskCount;
		}

		public void setCurrentClearTaskCount(Long currentClearTaskCount) {
			this.currentClearTaskCount = currentClearTaskCount;
		}
	}

	@Override
	public GetDataCronClearConfigResponse getInstance(UnmarshallerContext context) {
		return	GetDataCronClearConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
