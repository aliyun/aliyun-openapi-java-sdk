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

package com.aliyuncs.computenestsupplier.model.v20210521;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.computenestsupplier.transform.v20210521.GetSupplierInformationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSupplierInformationResponse extends AcsResponse {

	private String requestId;

	private String supplierName;

	private String supplierUrl;

	private String supplierDesc;

	private String operationIp;

	private Boolean operationMfaPresent;

	private DeliverySettings deliverySettings;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierUrl() {
		return this.supplierUrl;
	}

	public void setSupplierUrl(String supplierUrl) {
		this.supplierUrl = supplierUrl;
	}

	public String getSupplierDesc() {
		return this.supplierDesc;
	}

	public void setSupplierDesc(String supplierDesc) {
		this.supplierDesc = supplierDesc;
	}

	public String getOperationIp() {
		return this.operationIp;
	}

	public void setOperationIp(String operationIp) {
		this.operationIp = operationIp;
	}

	public Boolean getOperationMfaPresent() {
		return this.operationMfaPresent;
	}

	public void setOperationMfaPresent(Boolean operationMfaPresent) {
		this.operationMfaPresent = operationMfaPresent;
	}

	public DeliverySettings getDeliverySettings() {
		return this.deliverySettings;
	}

	public void setDeliverySettings(DeliverySettings deliverySettings) {
		this.deliverySettings = deliverySettings;
	}

	public static class DeliverySettings {

		private Boolean ossEnabled;

		private String ossBucketName;

		private String ossPath;

		private Long ossExpirationDays;

		public Boolean getOssEnabled() {
			return this.ossEnabled;
		}

		public void setOssEnabled(Boolean ossEnabled) {
			this.ossEnabled = ossEnabled;
		}

		public String getOssBucketName() {
			return this.ossBucketName;
		}

		public void setOssBucketName(String ossBucketName) {
			this.ossBucketName = ossBucketName;
		}

		public String getOssPath() {
			return this.ossPath;
		}

		public void setOssPath(String ossPath) {
			this.ossPath = ossPath;
		}

		public Long getOssExpirationDays() {
			return this.ossExpirationDays;
		}

		public void setOssExpirationDays(Long ossExpirationDays) {
			this.ossExpirationDays = ossExpirationDays;
		}
	}

	@Override
	public GetSupplierInformationResponse getInstance(UnmarshallerContext context) {
		return	GetSupplierInformationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
