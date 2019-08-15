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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emas_appmonitor.transform.v20190611.GetAppStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAppStatusResponse extends AcsResponse {

	private String requestId;

	private AppStatus appStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AppStatus getAppStatus() {
		return this.appStatus;
	}

	public void setAppStatus(AppStatus appStatus) {
		this.appStatus = appStatus;
	}

	public static class AppStatus {

		private Boolean crashStatus;

		private Boolean apmStatus;

		private Boolean tlogStatus;

		public Boolean getCrashStatus() {
			return this.crashStatus;
		}

		public void setCrashStatus(Boolean crashStatus) {
			this.crashStatus = crashStatus;
		}

		public Boolean getApmStatus() {
			return this.apmStatus;
		}

		public void setApmStatus(Boolean apmStatus) {
			this.apmStatus = apmStatus;
		}

		public Boolean getTlogStatus() {
			return this.tlogStatus;
		}

		public void setTlogStatus(Boolean tlogStatus) {
			this.tlogStatus = tlogStatus;
		}
	}

	@Override
	public GetAppStatusResponse getInstance(UnmarshallerContext context) {
		return	GetAppStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
