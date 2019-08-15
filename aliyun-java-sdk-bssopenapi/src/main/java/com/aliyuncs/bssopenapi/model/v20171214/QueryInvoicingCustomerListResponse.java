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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QueryInvoicingCustomerListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryInvoicingCustomerListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<CustomerInvoice> customerInvoiceList;

		public List<CustomerInvoice> getCustomerInvoiceList() {
			return this.customerInvoiceList;
		}

		public void setCustomerInvoiceList(List<CustomerInvoice> customerInvoiceList) {
			this.customerInvoiceList = customerInvoiceList;
		}

		public static class CustomerInvoice {

			private Long id;

			private Long userId;

			private String userNick;

			private String invoiceTitle;

			private Long customerType;

			private Long taxpayerType;

			private String bank;

			private String bankNo;

			private String operatingLicenseAddress;

			private String operatingLicensePhone;

			private String registerNo;

			private Long startCycle;

			private Long status;

			private String gmtCreate;

			private String taxationLicense;

			private Long adjustType;

			private Long endCycle;

			private String titleChangeInstructions;

			private Long issueType;

			private Long type;

			private String defaultRemark;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getUserId() {
				return this.userId;
			}

			public void setUserId(Long userId) {
				this.userId = userId;
			}

			public String getUserNick() {
				return this.userNick;
			}

			public void setUserNick(String userNick) {
				this.userNick = userNick;
			}

			public String getInvoiceTitle() {
				return this.invoiceTitle;
			}

			public void setInvoiceTitle(String invoiceTitle) {
				this.invoiceTitle = invoiceTitle;
			}

			public Long getCustomerType() {
				return this.customerType;
			}

			public void setCustomerType(Long customerType) {
				this.customerType = customerType;
			}

			public Long getTaxpayerType() {
				return this.taxpayerType;
			}

			public void setTaxpayerType(Long taxpayerType) {
				this.taxpayerType = taxpayerType;
			}

			public String getBank() {
				return this.bank;
			}

			public void setBank(String bank) {
				this.bank = bank;
			}

			public String getBankNo() {
				return this.bankNo;
			}

			public void setBankNo(String bankNo) {
				this.bankNo = bankNo;
			}

			public String getOperatingLicenseAddress() {
				return this.operatingLicenseAddress;
			}

			public void setOperatingLicenseAddress(String operatingLicenseAddress) {
				this.operatingLicenseAddress = operatingLicenseAddress;
			}

			public String getOperatingLicensePhone() {
				return this.operatingLicensePhone;
			}

			public void setOperatingLicensePhone(String operatingLicensePhone) {
				this.operatingLicensePhone = operatingLicensePhone;
			}

			public String getRegisterNo() {
				return this.registerNo;
			}

			public void setRegisterNo(String registerNo) {
				this.registerNo = registerNo;
			}

			public Long getStartCycle() {
				return this.startCycle;
			}

			public void setStartCycle(Long startCycle) {
				this.startCycle = startCycle;
			}

			public Long getStatus() {
				return this.status;
			}

			public void setStatus(Long status) {
				this.status = status;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getTaxationLicense() {
				return this.taxationLicense;
			}

			public void setTaxationLicense(String taxationLicense) {
				this.taxationLicense = taxationLicense;
			}

			public Long getAdjustType() {
				return this.adjustType;
			}

			public void setAdjustType(Long adjustType) {
				this.adjustType = adjustType;
			}

			public Long getEndCycle() {
				return this.endCycle;
			}

			public void setEndCycle(Long endCycle) {
				this.endCycle = endCycle;
			}

			public String getTitleChangeInstructions() {
				return this.titleChangeInstructions;
			}

			public void setTitleChangeInstructions(String titleChangeInstructions) {
				this.titleChangeInstructions = titleChangeInstructions;
			}

			public Long getIssueType() {
				return this.issueType;
			}

			public void setIssueType(Long issueType) {
				this.issueType = issueType;
			}

			public Long getType() {
				return this.type;
			}

			public void setType(Long type) {
				this.type = type;
			}

			public String getDefaultRemark() {
				return this.defaultRemark;
			}

			public void setDefaultRemark(String defaultRemark) {
				this.defaultRemark = defaultRemark;
			}
		}
	}

	@Override
	public QueryInvoicingCustomerListResponse getInstance(UnmarshallerContext context) {
		return	QueryInvoicingCustomerListResponseUnmarshaller.unmarshall(this, context);
	}
}
