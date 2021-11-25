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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.BindDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BindDevicesResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<SubDevice> subDeviceList;

		public List<SubDevice> getSubDeviceList() {
			return this.subDeviceList;
		}

		public void setSubDeviceList(List<SubDevice> subDeviceList) {
			this.subDeviceList = subDeviceList;
		}

		public static class SubDevice {

			private String subDeviceIp;

			private String subDevicePort;

			private String subDeviceName;

			private String subDeviceId;

			private String subDeviceNum;

			private String code;

			private String message;

			public String getSubDeviceIp() {
				return this.subDeviceIp;
			}

			public void setSubDeviceIp(String subDeviceIp) {
				this.subDeviceIp = subDeviceIp;
			}

			public String getSubDevicePort() {
				return this.subDevicePort;
			}

			public void setSubDevicePort(String subDevicePort) {
				this.subDevicePort = subDevicePort;
			}

			public String getSubDeviceName() {
				return this.subDeviceName;
			}

			public void setSubDeviceName(String subDeviceName) {
				this.subDeviceName = subDeviceName;
			}

			public String getSubDeviceId() {
				return this.subDeviceId;
			}

			public void setSubDeviceId(String subDeviceId) {
				this.subDeviceId = subDeviceId;
			}

			public String getSubDeviceNum() {
				return this.subDeviceNum;
			}

			public void setSubDeviceNum(String subDeviceNum) {
				this.subDeviceNum = subDeviceNum;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}
		}
	}

	@Override
	public BindDevicesResponse getInstance(UnmarshallerContext context) {
		return	BindDevicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
