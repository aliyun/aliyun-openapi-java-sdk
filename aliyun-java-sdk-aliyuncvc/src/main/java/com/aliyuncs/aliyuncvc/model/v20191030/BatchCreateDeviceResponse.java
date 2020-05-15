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

package com.aliyuncs.aliyuncvc.model.v20191030;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aliyuncvc.transform.v20191030.BatchCreateDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchCreateDeviceResponse extends AcsResponse {

	private Integer errorCode;

	private String message;

	private Boolean success;

	private List<Data> devices;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Data> getDevices() {
		return this.devices;
	}

	public void setDevices(List<Data> devices) {
		this.devices = devices;
	}

	public static class Data {

		private Integer deviceErrorCode;

		private String deviceMessage;

		private String sN;

		private String activeCode;

		public Integer getDeviceErrorCode() {
			return this.deviceErrorCode;
		}

		public void setDeviceErrorCode(Integer deviceErrorCode) {
			this.deviceErrorCode = deviceErrorCode;
		}

		public String getDeviceMessage() {
			return this.deviceMessage;
		}

		public void setDeviceMessage(String deviceMessage) {
			this.deviceMessage = deviceMessage;
		}

		public String getSN() {
			return this.sN;
		}

		public void setSN(String sN) {
			this.sN = sN;
		}

		public String getActiveCode() {
			return this.activeCode;
		}

		public void setActiveCode(String activeCode) {
			this.activeCode = activeCode;
		}
	}

	@Override
	public BatchCreateDeviceResponse getInstance(UnmarshallerContext context) {
		return	BatchCreateDeviceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
