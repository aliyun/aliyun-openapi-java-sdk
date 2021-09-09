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

package com.aliyuncs.companyreg.model.v20201022;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20201022.GetLastMonthInvoiceCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLastMonthInvoiceCountResponse extends AcsResponse {

	private String requestId;

	private InvoiceIncome invoiceIncome;

	private InvoiceOut invoiceOut;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public InvoiceIncome getInvoiceIncome() {
		return this.invoiceIncome;
	}

	public void setInvoiceIncome(InvoiceIncome invoiceIncome) {
		this.invoiceIncome = invoiceIncome;
	}

	public InvoiceOut getInvoiceOut() {
		return this.invoiceOut;
	}

	public void setInvoiceOut(InvoiceOut invoiceOut) {
		this.invoiceOut = invoiceOut;
	}

	public static class InvoiceIncome {

		private String amount;

		private String amountWithTax;

		private Integer count;

		private String taxAmount;

		public String getAmount() {
			return this.amount;
		}

		public void setAmount(String amount) {
			this.amount = amount;
		}

		public String getAmountWithTax() {
			return this.amountWithTax;
		}

		public void setAmountWithTax(String amountWithTax) {
			this.amountWithTax = amountWithTax;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public String getTaxAmount() {
			return this.taxAmount;
		}

		public void setTaxAmount(String taxAmount) {
			this.taxAmount = taxAmount;
		}
	}

	public static class InvoiceOut {

		private String amount;

		private String amountWithTax;

		private Integer count;

		private String taxAmount;

		public String getAmount() {
			return this.amount;
		}

		public void setAmount(String amount) {
			this.amount = amount;
		}

		public String getAmountWithTax() {
			return this.amountWithTax;
		}

		public void setAmountWithTax(String amountWithTax) {
			this.amountWithTax = amountWithTax;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public String getTaxAmount() {
			return this.taxAmount;
		}

		public void setTaxAmount(String taxAmount) {
			this.taxAmount = taxAmount;
		}
	}

	@Override
	public GetLastMonthInvoiceCountResponse getInstance(UnmarshallerContext context) {
		return	GetLastMonthInvoiceCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
