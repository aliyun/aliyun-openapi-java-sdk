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
import com.aliyuncs.iot.transform.v20180120.QueryOTAFirmwareResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOTAFirmwareResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private FirmwareInfo firmwareInfo;

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

	public FirmwareInfo getFirmwareInfo() {
		return this.firmwareInfo;
	}

	public void setFirmwareInfo(FirmwareInfo firmwareInfo) {
		this.firmwareInfo = firmwareInfo;
	}

	public static class FirmwareInfo {

		private String firmwareName;

		private String firmwareId;

		private String srcVersion;

		private String destVersion;

		private String utcCreate;

		private String utcModified;

		private Integer status;

		private String firmwareDesc;

		private String firmwareSign;

		private Integer firmwareSize;

		private String firmwareUrl;

		private String productKey;

		private String signMethod;

		private String productName;

		private Integer type;

		private Integer verifyProgress;

		private String moduleName;

		public String getFirmwareName() {
			return this.firmwareName;
		}

		public void setFirmwareName(String firmwareName) {
			this.firmwareName = firmwareName;
		}

		public String getFirmwareId() {
			return this.firmwareId;
		}

		public void setFirmwareId(String firmwareId) {
			this.firmwareId = firmwareId;
		}

		public String getSrcVersion() {
			return this.srcVersion;
		}

		public void setSrcVersion(String srcVersion) {
			this.srcVersion = srcVersion;
		}

		public String getDestVersion() {
			return this.destVersion;
		}

		public void setDestVersion(String destVersion) {
			this.destVersion = destVersion;
		}

		public String getUtcCreate() {
			return this.utcCreate;
		}

		public void setUtcCreate(String utcCreate) {
			this.utcCreate = utcCreate;
		}

		public String getUtcModified() {
			return this.utcModified;
		}

		public void setUtcModified(String utcModified) {
			this.utcModified = utcModified;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getFirmwareDesc() {
			return this.firmwareDesc;
		}

		public void setFirmwareDesc(String firmwareDesc) {
			this.firmwareDesc = firmwareDesc;
		}

		public String getFirmwareSign() {
			return this.firmwareSign;
		}

		public void setFirmwareSign(String firmwareSign) {
			this.firmwareSign = firmwareSign;
		}

		public Integer getFirmwareSize() {
			return this.firmwareSize;
		}

		public void setFirmwareSize(Integer firmwareSize) {
			this.firmwareSize = firmwareSize;
		}

		public String getFirmwareUrl() {
			return this.firmwareUrl;
		}

		public void setFirmwareUrl(String firmwareUrl) {
			this.firmwareUrl = firmwareUrl;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public String getSignMethod() {
			return this.signMethod;
		}

		public void setSignMethod(String signMethod) {
			this.signMethod = signMethod;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Integer getVerifyProgress() {
			return this.verifyProgress;
		}

		public void setVerifyProgress(Integer verifyProgress) {
			this.verifyProgress = verifyProgress;
		}

		public String getModuleName() {
			return this.moduleName;
		}

		public void setModuleName(String moduleName) {
			this.moduleName = moduleName;
		}
	}

	@Override
	public QueryOTAFirmwareResponse getInstance(UnmarshallerContext context) {
		return	QueryOTAFirmwareResponseUnmarshaller.unmarshall(this, context);
	}
}
