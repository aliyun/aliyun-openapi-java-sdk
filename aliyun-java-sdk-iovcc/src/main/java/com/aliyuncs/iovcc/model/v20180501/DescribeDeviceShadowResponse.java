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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.DescribeDeviceShadowResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeviceShadowResponse extends AcsResponse {

	private String requestId;

	private DeviceShadow deviceShadow;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DeviceShadow getDeviceShadow() {
		return this.deviceShadow;
	}

	public void setDeviceShadow(DeviceShadow deviceShadow) {
		this.deviceShadow = deviceShadow;
	}

	public static class DeviceShadow {

		private String deviceInfo;

		private String deviceShadow;

		public String getDeviceInfo() {
			return this.deviceInfo;
		}

		public void setDeviceInfo(String deviceInfo) {
			this.deviceInfo = deviceInfo;
		}

		public String getDeviceShadow() {
			return this.deviceShadow;
		}

		public void setDeviceShadow(String deviceShadow) {
			this.deviceShadow = deviceShadow;
		}
	}

	@Override
	public DescribeDeviceShadowResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeviceShadowResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
