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
package com.aliyuncs.iot.model.v20170420;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20170420.BatchGetDeviceStateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchGetDeviceStateResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private List<DeviceStatus> deviceStatusList;

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

	public List<DeviceStatus> getDeviceStatusList() {
		return this.deviceStatusList;
	}

	public void setDeviceStatusList(List<DeviceStatus> deviceStatusList) {
		this.deviceStatusList = deviceStatusList;
	}

	public static class DeviceStatus {

		private String deviceId;

		private String deviceName;

		private String status;

		private String asAddress;

		private String lastOnlineTime;

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAsAddress() {
			return this.asAddress;
		}

		public void setAsAddress(String asAddress) {
			this.asAddress = asAddress;
		}

		public String getLastOnlineTime() {
			return this.lastOnlineTime;
		}

		public void setLastOnlineTime(String lastOnlineTime) {
			this.lastOnlineTime = lastOnlineTime;
		}
	}

	@Override
	public BatchGetDeviceStateResponse getInstance(UnmarshallerContext context) {
		return	BatchGetDeviceStateResponseUnmarshaller.unmarshall(this, context);
	}
}
