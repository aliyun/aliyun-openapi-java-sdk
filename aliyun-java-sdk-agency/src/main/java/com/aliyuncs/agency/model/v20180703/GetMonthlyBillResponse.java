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

package com.aliyuncs.agency.model.v20180703;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.agency.transform.v20180703.GetMonthlyBillResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMonthlyBillResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

	private Data data;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String refundInvoiceLink;

		private String billType;

		private String invoiceLink;

		private String billLinkCSV;

		private Boolean refundInvoiceFlag;

		private String spendingTime;

		private String billOwner;

		private String billLinkXLSX;

		public String getRefundInvoiceLink() {
			return this.refundInvoiceLink;
		}

		public void setRefundInvoiceLink(String refundInvoiceLink) {
			this.refundInvoiceLink = refundInvoiceLink;
		}

		public String getBillType() {
			return this.billType;
		}

		public void setBillType(String billType) {
			this.billType = billType;
		}

		public String getInvoiceLink() {
			return this.invoiceLink;
		}

		public void setInvoiceLink(String invoiceLink) {
			this.invoiceLink = invoiceLink;
		}

		public String getBillLinkCSV() {
			return this.billLinkCSV;
		}

		public void setBillLinkCSV(String billLinkCSV) {
			this.billLinkCSV = billLinkCSV;
		}

		public Boolean getRefundInvoiceFlag() {
			return this.refundInvoiceFlag;
		}

		public void setRefundInvoiceFlag(Boolean refundInvoiceFlag) {
			this.refundInvoiceFlag = refundInvoiceFlag;
		}

		public String getSpendingTime() {
			return this.spendingTime;
		}

		public void setSpendingTime(String spendingTime) {
			this.spendingTime = spendingTime;
		}

		public String getBillOwner() {
			return this.billOwner;
		}

		public void setBillOwner(String billOwner) {
			this.billOwner = billOwner;
		}

		public String getBillLinkXLSX() {
			return this.billLinkXLSX;
		}

		public void setBillLinkXLSX(String billLinkXLSX) {
			this.billLinkXLSX = billLinkXLSX;
		}
	}

	@Override
	public GetMonthlyBillResponse getInstance(UnmarshallerContext context) {
		return	GetMonthlyBillResponseUnmarshaller.unmarshall(this, context);
	}
}
