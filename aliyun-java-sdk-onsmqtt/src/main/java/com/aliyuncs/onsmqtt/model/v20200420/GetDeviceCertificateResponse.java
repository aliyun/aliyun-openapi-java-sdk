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

package com.aliyuncs.onsmqtt.model.v20200420;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.onsmqtt.transform.v20200420.GetDeviceCertificateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceCertificateResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String validBegin;

		private String validEnd;

		private String deviceSn;

		private String deviceName;

		private String deviceContent;

		private String caSn;

		private String status;

		public String getValidBegin() {
			return this.validBegin;
		}

		public void setValidBegin(String validBegin) {
			this.validBegin = validBegin;
		}

		public String getValidEnd() {
			return this.validEnd;
		}

		public void setValidEnd(String validEnd) {
			this.validEnd = validEnd;
		}

		public String getDeviceSn() {
			return this.deviceSn;
		}

		public void setDeviceSn(String deviceSn) {
			this.deviceSn = deviceSn;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getDeviceContent() {
			return this.deviceContent;
		}

		public void setDeviceContent(String deviceContent) {
			this.deviceContent = deviceContent;
		}

		public String getCaSn() {
			return this.caSn;
		}

		public void setCaSn(String caSn) {
			this.caSn = caSn;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public GetDeviceCertificateResponse getInstance(UnmarshallerContext context) {
		return	GetDeviceCertificateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
