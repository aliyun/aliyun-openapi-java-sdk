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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.BatchGetDeviceDriverResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchGetDeviceDriverResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private List<DeviceDriver> deviceDriverList;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<DeviceDriver> getDeviceDriverList() {
		return this.deviceDriverList;
	}

	public void setDeviceDriverList(List<DeviceDriver> deviceDriverList) {
		this.deviceDriverList = deviceDriverList;
	}

	public static class DeviceDriver {

		private String driverId;

		private String iotId;

		public String getDriverId() {
			return this.driverId;
		}

		public void setDriverId(String driverId) {
			this.driverId = driverId;
		}

		public String getIotId() {
			return this.iotId;
		}

		public void setIotId(String iotId) {
			this.iotId = iotId;
		}
	}

	@Override
	public BatchGetDeviceDriverResponse getInstance(UnmarshallerContext context) {
		return	BatchGetDeviceDriverResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
