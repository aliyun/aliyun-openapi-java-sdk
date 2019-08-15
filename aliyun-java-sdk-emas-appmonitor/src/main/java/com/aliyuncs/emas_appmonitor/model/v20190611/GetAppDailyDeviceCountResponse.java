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
import com.aliyuncs.emas_appmonitor.transform.v20190611.GetAppDailyDeviceCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAppDailyDeviceCountResponse extends AcsResponse {

	private String requestId;

	private List<DeviceCountItem> deviceCountList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DeviceCountItem> getDeviceCountList() {
		return this.deviceCountList;
	}

	public void setDeviceCountList(List<DeviceCountItem> deviceCountList) {
		this.deviceCountList = deviceCountList;
	}

	public static class DeviceCountItem {

		private Long dateTime;

		private Long deviceCount;

		public Long getDateTime() {
			return this.dateTime;
		}

		public void setDateTime(Long dateTime) {
			this.dateTime = dateTime;
		}

		public Long getDeviceCount() {
			return this.deviceCount;
		}

		public void setDeviceCount(Long deviceCount) {
			this.deviceCount = deviceCount;
		}
	}

	@Override
	public GetAppDailyDeviceCountResponse getInstance(UnmarshallerContext context) {
		return	GetAppDailyDeviceCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
