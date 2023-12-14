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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeTenantEncryptionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTenantEncryptionResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<TenantEncryptionsItem> tenantEncryptions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<TenantEncryptionsItem> getTenantEncryptions() {
		return this.tenantEncryptions;
	}

	public void setTenantEncryptions(List<TenantEncryptionsItem> tenantEncryptions) {
		this.tenantEncryptions = tenantEncryptions;
	}

	public static class TenantEncryptionsItem {

		private String tenantId;

		private String tenantMode;

		private String tenantName;

		private Boolean enableEncryption;

		private String tenantStatus;

		private String status;

		private String encryptionType;

		private String encryptionKeyId;

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getTenantMode() {
			return this.tenantMode;
		}

		public void setTenantMode(String tenantMode) {
			this.tenantMode = tenantMode;
		}

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public Boolean getEnableEncryption() {
			return this.enableEncryption;
		}

		public void setEnableEncryption(Boolean enableEncryption) {
			this.enableEncryption = enableEncryption;
		}

		public String getTenantStatus() {
			return this.tenantStatus;
		}

		public void setTenantStatus(String tenantStatus) {
			this.tenantStatus = tenantStatus;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getEncryptionType() {
			return this.encryptionType;
		}

		public void setEncryptionType(String encryptionType) {
			this.encryptionType = encryptionType;
		}

		public String getEncryptionKeyId() {
			return this.encryptionKeyId;
		}

		public void setEncryptionKeyId(String encryptionKeyId) {
			this.encryptionKeyId = encryptionKeyId;
		}
	}

	@Override
	public DescribeTenantEncryptionResponse getInstance(UnmarshallerContext context) {
		return	DescribeTenantEncryptionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
