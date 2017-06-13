/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.push.model.v20160801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.push.transform.v20160801.CheckDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckDevicesResponse extends AcsResponse {

	private String requestId;

	private List<DeviceCheckInfo> deviceCheckInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DeviceCheckInfo> getDeviceCheckInfos() {
		return this.deviceCheckInfos;
	}

	public void setDeviceCheckInfos(List<DeviceCheckInfo> deviceCheckInfos) {
		this.deviceCheckInfos = deviceCheckInfos;
	}

	public static class DeviceCheckInfo {

		private String deviceId;

		private Boolean available;

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public Boolean getAvailable() {
			return this.available;
		}

		public void setAvailable(Boolean available) {
			this.available = available;
		}
	}

	@Override
	public CheckDevicesResponse getInstance(UnmarshallerContext context) {
		return	CheckDevicesResponseUnmarshaller.unmarshall(this, context);
	}
}
