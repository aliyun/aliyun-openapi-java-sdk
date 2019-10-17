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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryDeviceCertResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDeviceCertResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private DeviceCertInfo deviceCertInfo;

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

	public DeviceCertInfo getDeviceCertInfo() {
		return this.deviceCertInfo;
	}

	public void setDeviceCertInfo(DeviceCertInfo deviceCertInfo) {
		this.deviceCertInfo = deviceCertInfo;
	}

	public static class DeviceCertInfo {

		private Integer status;

		private String certificate;

		private String privateKey;

		private String certSN;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getCertificate() {
			return this.certificate;
		}

		public void setCertificate(String certificate) {
			this.certificate = certificate;
		}

		public String getPrivateKey() {
			return this.privateKey;
		}

		public void setPrivateKey(String privateKey) {
			this.privateKey = privateKey;
		}

		public String getCertSN() {
			return this.certSN;
		}

		public void setCertSN(String certSN) {
			this.certSN = certSN;
		}
	}

	@Override
	public QueryDeviceCertResponse getInstance(UnmarshallerContext context) {
		return	QueryDeviceCertResponseUnmarshaller.unmarshall(this, context);
	}
}
