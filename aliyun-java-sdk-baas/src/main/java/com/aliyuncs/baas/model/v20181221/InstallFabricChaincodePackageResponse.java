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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.InstallFabricChaincodePackageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InstallFabricChaincodePackageResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Boolean success;

	private Integer errorCode;

	private Result result;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String organizationId;

		private String label;

		private String checksum;

		private String chaincodePackageId;

		private String md5sum;

		private String providerUid;

		private String providerBid;

		private Integer type;

		private String typeName;

		private String uploadTime;

		private String installTime;

		private String state;

		private String ossURL;

		private String deleteTime;

		private Boolean deleted;

		private String message;

		public String getOrganizationId() {
			return this.organizationId;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}

		public String getLabel() {
			return this.label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getChecksum() {
			return this.checksum;
		}

		public void setChecksum(String checksum) {
			this.checksum = checksum;
		}

		public String getChaincodePackageId() {
			return this.chaincodePackageId;
		}

		public void setChaincodePackageId(String chaincodePackageId) {
			this.chaincodePackageId = chaincodePackageId;
		}

		public String getMd5sum() {
			return this.md5sum;
		}

		public void setMd5sum(String md5sum) {
			this.md5sum = md5sum;
		}

		public String getProviderUid() {
			return this.providerUid;
		}

		public void setProviderUid(String providerUid) {
			this.providerUid = providerUid;
		}

		public String getProviderBid() {
			return this.providerBid;
		}

		public void setProviderBid(String providerBid) {
			this.providerBid = providerBid;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public String getTypeName() {
			return this.typeName;
		}

		public void setTypeName(String typeName) {
			this.typeName = typeName;
		}

		public String getUploadTime() {
			return this.uploadTime;
		}

		public void setUploadTime(String uploadTime) {
			this.uploadTime = uploadTime;
		}

		public String getInstallTime() {
			return this.installTime;
		}

		public void setInstallTime(String installTime) {
			this.installTime = installTime;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getOssURL() {
			return this.ossURL;
		}

		public void setOssURL(String ossURL) {
			this.ossURL = ossURL;
		}

		public String getDeleteTime() {
			return this.deleteTime;
		}

		public void setDeleteTime(String deleteTime) {
			this.deleteTime = deleteTime;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@Override
	public InstallFabricChaincodePackageResponse getInstance(UnmarshallerContext context) {
		return	InstallFabricChaincodePackageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
