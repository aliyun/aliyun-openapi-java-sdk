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

package com.aliyuncs.emas_appmonitor.model.v20190611;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emas_appmonitor.transform.v20190611.GetCrashSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCrashSummaryResponse extends AcsResponse {

	private String requestId;

	private List<CrashSummaryItem> crashSummaryList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CrashSummaryItem> getCrashSummaryList() {
		return this.crashSummaryList;
	}

	public void setCrashSummaryList(List<CrashSummaryItem> crashSummaryList) {
		this.crashSummaryList = crashSummaryList;
	}

	public static class CrashSummaryItem {

		private String crashId;

		private String crashName;

		private String errorType;

		private Float crashRate;

		private Long devicesAffected;

		private Long crashCount;

		private Float deviceAffectedRate;

		public String getCrashId() {
			return this.crashId;
		}

		public void setCrashId(String crashId) {
			this.crashId = crashId;
		}

		public String getCrashName() {
			return this.crashName;
		}

		public void setCrashName(String crashName) {
			this.crashName = crashName;
		}

		public String getErrorType() {
			return this.errorType;
		}

		public void setErrorType(String errorType) {
			this.errorType = errorType;
		}

		public Float getCrashRate() {
			return this.crashRate;
		}

		public void setCrashRate(Float crashRate) {
			this.crashRate = crashRate;
		}

		public Long getDevicesAffected() {
			return this.devicesAffected;
		}

		public void setDevicesAffected(Long devicesAffected) {
			this.devicesAffected = devicesAffected;
		}

		public Long getCrashCount() {
			return this.crashCount;
		}

		public void setCrashCount(Long crashCount) {
			this.crashCount = crashCount;
		}

		public Float getDeviceAffectedRate() {
			return this.deviceAffectedRate;
		}

		public void setDeviceAffectedRate(Float deviceAffectedRate) {
			this.deviceAffectedRate = deviceAffectedRate;
		}
	}

	@Override
	public GetCrashSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetCrashSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
