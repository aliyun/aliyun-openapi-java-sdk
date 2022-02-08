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

package com.aliyuncs.market.model.v20151101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.DescribeLicenseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLicenseResponse extends AcsResponse {

	private String requestId;

	private License license;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public License getLicense() {
		return this.license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

	public static class License {

		private String activateTime;

		private String licenseStatus;

		private String productName;

		private String expiredTime;

		private String productSkuId;

		private String createTime;

		private String licenseCode;

		private String instanceId;

		private String supplierName;

		private String productCode;

		private List<LicenseAttribute> extendArray;

		private ExtendInfo extendInfo;

		public String getActivateTime() {
			return this.activateTime;
		}

		public void setActivateTime(String activateTime) {
			this.activateTime = activateTime;
		}

		public String getLicenseStatus() {
			return this.licenseStatus;
		}

		public void setLicenseStatus(String licenseStatus) {
			this.licenseStatus = licenseStatus;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getProductSkuId() {
			return this.productSkuId;
		}

		public void setProductSkuId(String productSkuId) {
			this.productSkuId = productSkuId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getLicenseCode() {
			return this.licenseCode;
		}

		public void setLicenseCode(String licenseCode) {
			this.licenseCode = licenseCode;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getSupplierName() {
			return this.supplierName;
		}

		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public List<LicenseAttribute> getExtendArray() {
			return this.extendArray;
		}

		public void setExtendArray(List<LicenseAttribute> extendArray) {
			this.extendArray = extendArray;
		}

		public ExtendInfo getExtendInfo() {
			return this.extendInfo;
		}

		public void setExtendInfo(ExtendInfo extendInfo) {
			this.extendInfo = extendInfo;
		}

		public static class LicenseAttribute {

			private String code;

			private String value;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class ExtendInfo {

			private Long aliUid;

			private Long accountQuantity;

			private String email;

			private String mobile;

			public Long getAliUid() {
				return this.aliUid;
			}

			public void setAliUid(Long aliUid) {
				this.aliUid = aliUid;
			}

			public Long getAccountQuantity() {
				return this.accountQuantity;
			}

			public void setAccountQuantity(Long accountQuantity) {
				this.accountQuantity = accountQuantity;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getMobile() {
				return this.mobile;
			}

			public void setMobile(String mobile) {
				this.mobile = mobile;
			}
		}
	}

	@Override
	public DescribeLicenseResponse getInstance(UnmarshallerContext context) {
		return	DescribeLicenseResponseUnmarshaller.unmarshall(this, context);
	}
}
