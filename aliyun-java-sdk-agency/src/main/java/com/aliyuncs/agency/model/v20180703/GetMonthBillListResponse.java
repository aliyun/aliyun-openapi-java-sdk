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
import com.aliyuncs.agency.transform.v20180703.GetMonthBillListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMonthBillListResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

	private BigBillJson bigBillJson;

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

	public BigBillJson getBigBillJson() {
		return this.bigBillJson;
	}

	public void setBigBillJson(BigBillJson bigBillJson) {
		this.bigBillJson = bigBillJson;
	}

	public static class BigBillJson {

		private String userType;

		private String refundInvoiceLink;

		private String productType;

		private String billType;

		private String invoiceLink;

		private String billLinkCSV;

		private Boolean refundInvoiceFlag;

		private String billTime;

		private String billLinkXLSX;

		public String getUserType() {
			return this.userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public String getRefundInvoiceLink() {
			return this.refundInvoiceLink;
		}

		public void setRefundInvoiceLink(String refundInvoiceLink) {
			this.refundInvoiceLink = refundInvoiceLink;
		}

		public String getProductType() {
			return this.productType;
		}

		public void setProductType(String productType) {
			this.productType = productType;
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

		public String getBillTime() {
			return this.billTime;
		}

		public void setBillTime(String billTime) {
			this.billTime = billTime;
		}

		public String getBillLinkXLSX() {
			return this.billLinkXLSX;
		}

		public void setBillLinkXLSX(String billLinkXLSX) {
			this.billLinkXLSX = billLinkXLSX;
		}
	}

	@Override
	public GetMonthBillListResponse getInstance(UnmarshallerContext context) {
		return	GetMonthBillListResponseUnmarshaller.unmarshall(this, context);
	}
}
