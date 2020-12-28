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
import com.aliyuncs.aliyuncvc.transform.v20191030.GetDeviceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceListResponse extends AcsResponse {

	private Integer errorCode;

	private String message;

	private Boolean success;

	private String requestId;

	private List<DataItem> data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String activationCode;

		private String castScreenCode;

		private String iP;

		private String mac;

		private String sN;

		private Integer status;

		private String port;

		public String getActivationCode() {
			return this.activationCode;
		}

		public void setActivationCode(String activationCode) {
			this.activationCode = activationCode;
		}

		public String getCastScreenCode() {
			return this.castScreenCode;
		}

		public void setCastScreenCode(String castScreenCode) {
			this.castScreenCode = castScreenCode;
		}

		public String getIP() {
			return this.iP;
		}

		public void setIP(String iP) {
			this.iP = iP;
		}

		public String getMac() {
			return this.mac;
		}

		public void setMac(String mac) {
			this.mac = mac;
		}

		public String getSN() {
			return this.sN;
		}

		public void setSN(String sN) {
			this.sN = sN;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}
	}

	@Override
	public GetDeviceListResponse getInstance(UnmarshallerContext context) {
		return	GetDeviceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
