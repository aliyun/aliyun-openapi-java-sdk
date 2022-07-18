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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.onsmqtt.transform.v20200420.ListDeviceCertificateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDeviceCertificateResponse extends AcsResponse {

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

		private Integer total;

		private Integer pageNo;

		private Integer pageSize;

		private List<DeviceCertificateVO> deviceCertificateVOS;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<DeviceCertificateVO> getDeviceCertificateVOS() {
			return this.deviceCertificateVOS;
		}

		public void setDeviceCertificateVOS(List<DeviceCertificateVO> deviceCertificateVOS) {
			this.deviceCertificateVOS = deviceCertificateVOS;
		}

		public static class DeviceCertificateVO {

			private String validBegin;

			private String validEnd;

			private String deviceSn;

			private String deviceContent;

			private String status;

			private String caSn;

			private String deviceName;

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

			public String getDeviceContent() {
				return this.deviceContent;
			}

			public void setDeviceContent(String deviceContent) {
				this.deviceContent = deviceContent;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getCaSn() {
				return this.caSn;
			}

			public void setCaSn(String caSn) {
				this.caSn = caSn;
			}

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}
		}
	}

	@Override
	public ListDeviceCertificateResponse getInstance(UnmarshallerContext context) {
		return	ListDeviceCertificateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
