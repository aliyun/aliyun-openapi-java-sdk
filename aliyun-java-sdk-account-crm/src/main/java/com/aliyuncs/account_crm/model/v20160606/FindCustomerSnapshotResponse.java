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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.account_crm.transform.v20160606.FindCustomerSnapshotResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindCustomerSnapshotResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private CustomerSnapshot customerSnapshot;

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

	public CustomerSnapshot getCustomerSnapshot() {
		return this.customerSnapshot;
	}

	public void setCustomerSnapshot(CustomerSnapshot customerSnapshot) {
		this.customerSnapshot = customerSnapshot;
	}

	public static class CustomerSnapshot {

		private String gmtCreate;

		private String infoType;

		private Long kpId;

		private Long id;

		private AccountInfoSnapshotModel accountInfoSnapshotModel;

		private AccountTaxSnapshotModel accountTaxSnapshotModel;

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getInfoType() {
			return this.infoType;
		}

		public void setInfoType(String infoType) {
			this.infoType = infoType;
		}

		public Long getKpId() {
			return this.kpId;
		}

		public void setKpId(Long kpId) {
			this.kpId = kpId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public AccountInfoSnapshotModel getAccountInfoSnapshotModel() {
			return this.accountInfoSnapshotModel;
		}

		public void setAccountInfoSnapshotModel(AccountInfoSnapshotModel accountInfoSnapshotModel) {
			this.accountInfoSnapshotModel = accountInfoSnapshotModel;
		}

		public AccountTaxSnapshotModel getAccountTaxSnapshotModel() {
			return this.accountTaxSnapshotModel;
		}

		public void setAccountTaxSnapshotModel(AccountTaxSnapshotModel accountTaxSnapshotModel) {
			this.accountTaxSnapshotModel = accountTaxSnapshotModel;
		}

		public static class AccountInfoSnapshotModel {

			private String address6;

			private String postCode;

			private String provinceName;

			private String cityId;

			private String address4;

			private String provinceId;

			private String address3;

			private String address5;

			private String cityName;

			private String address;

			private String address2;

			private String trueName;

			public String getAddress6() {
				return this.address6;
			}

			public void setAddress6(String address6) {
				this.address6 = address6;
			}

			public String getPostCode() {
				return this.postCode;
			}

			public void setPostCode(String postCode) {
				this.postCode = postCode;
			}

			public String getProvinceName() {
				return this.provinceName;
			}

			public void setProvinceName(String provinceName) {
				this.provinceName = provinceName;
			}

			public String getCityId() {
				return this.cityId;
			}

			public void setCityId(String cityId) {
				this.cityId = cityId;
			}

			public String getAddress4() {
				return this.address4;
			}

			public void setAddress4(String address4) {
				this.address4 = address4;
			}

			public String getProvinceId() {
				return this.provinceId;
			}

			public void setProvinceId(String provinceId) {
				this.provinceId = provinceId;
			}

			public String getAddress3() {
				return this.address3;
			}

			public void setAddress3(String address3) {
				this.address3 = address3;
			}

			public String getAddress5() {
				return this.address5;
			}

			public void setAddress5(String address5) {
				this.address5 = address5;
			}

			public String getCityName() {
				return this.cityName;
			}

			public void setCityName(String cityName) {
				this.cityName = cityName;
			}

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getAddress2() {
				return this.address2;
			}

			public void setAddress2(String address2) {
				this.address2 = address2;
			}

			public String getTrueName() {
				return this.trueName;
			}

			public void setTrueName(String trueName) {
				this.trueName = trueName;
			}
		}

		public static class AccountTaxSnapshotModel {

			private String financeTaxCertificateImgName;

			private String financeTaxCertificateImgUrl;

			private String secondFinanceTaxCertificateImgUrl;

			private String tax;

			private String secondFinanceTax;

			private String secondFinanceTaxCertificateImgName;

			public String getFinanceTaxCertificateImgName() {
				return this.financeTaxCertificateImgName;
			}

			public void setFinanceTaxCertificateImgName(String financeTaxCertificateImgName) {
				this.financeTaxCertificateImgName = financeTaxCertificateImgName;
			}

			public String getFinanceTaxCertificateImgUrl() {
				return this.financeTaxCertificateImgUrl;
			}

			public void setFinanceTaxCertificateImgUrl(String financeTaxCertificateImgUrl) {
				this.financeTaxCertificateImgUrl = financeTaxCertificateImgUrl;
			}

			public String getSecondFinanceTaxCertificateImgUrl() {
				return this.secondFinanceTaxCertificateImgUrl;
			}

			public void setSecondFinanceTaxCertificateImgUrl(String secondFinanceTaxCertificateImgUrl) {
				this.secondFinanceTaxCertificateImgUrl = secondFinanceTaxCertificateImgUrl;
			}

			public String getTax() {
				return this.tax;
			}

			public void setTax(String tax) {
				this.tax = tax;
			}

			public String getSecondFinanceTax() {
				return this.secondFinanceTax;
			}

			public void setSecondFinanceTax(String secondFinanceTax) {
				this.secondFinanceTax = secondFinanceTax;
			}

			public String getSecondFinanceTaxCertificateImgName() {
				return this.secondFinanceTaxCertificateImgName;
			}

			public void setSecondFinanceTaxCertificateImgName(String secondFinanceTaxCertificateImgName) {
				this.secondFinanceTaxCertificateImgName = secondFinanceTaxCertificateImgName;
			}
		}
	}

	@Override
	public FindCustomerSnapshotResponse getInstance(UnmarshallerContext context) {
		return	FindCustomerSnapshotResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
