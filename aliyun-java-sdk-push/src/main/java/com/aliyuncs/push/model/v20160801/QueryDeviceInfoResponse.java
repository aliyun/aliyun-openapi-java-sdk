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

package com.aliyuncs.push.model.v20160801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.push.transform.v20160801.QueryDeviceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDeviceInfoResponse extends AcsResponse {

	private String requestId;

	private DeviceInfo deviceInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DeviceInfo getDeviceInfo() {
		return this.deviceInfo;
	}

	public void setDeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public static class DeviceInfo {

		private String account;

		private String alias;

		private String brand;

		private String deviceId;

		private String deviceToken;

		private String deviceType;

		private String lastOnlineTime;

		private String model;

		private Boolean online;

		private String phoneNumber;

		private Boolean pushEnabled;

		private String tags;

		public String getAccount() {
			return this.account;
		}

		public void setAccount(String account) {
			this.account = account;
		}

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}

		public String getBrand() {
			return this.brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getDeviceToken() {
			return this.deviceToken;
		}

		public void setDeviceToken(String deviceToken) {
			this.deviceToken = deviceToken;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getLastOnlineTime() {
			return this.lastOnlineTime;
		}

		public void setLastOnlineTime(String lastOnlineTime) {
			this.lastOnlineTime = lastOnlineTime;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public Boolean getOnline() {
			return this.online;
		}

		public void setOnline(Boolean online) {
			this.online = online;
		}

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public Boolean getPushEnabled() {
			return this.pushEnabled;
		}

		public void setPushEnabled(Boolean pushEnabled) {
			this.pushEnabled = pushEnabled;
		}

		public String getTags() {
			return this.tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}
	}

	@Override
	public QueryDeviceInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryDeviceInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
