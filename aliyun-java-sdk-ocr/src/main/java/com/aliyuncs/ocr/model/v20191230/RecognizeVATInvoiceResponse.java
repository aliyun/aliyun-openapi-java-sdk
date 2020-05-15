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

package com.aliyuncs.ocr.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocr.transform.v20191230.RecognizeVATInvoiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeVATInvoiceResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Content content;

		private Box box;

		public Content getContent() {
			return this.content;
		}

		public void setContent(Content content) {
			this.content = content;
		}

		public Box getBox() {
			return this.box;
		}

		public void setBox(Box box) {
			this.box = box;
		}

		public static class Content {

			private String invoiceCode;

			private String invoiceNo;

			private String invoiceDate;

			private String antiFakeCode;

			private String payerName;

			private String payerRegisterNo;

			private String payerAddress;

			private String payerBankName;

			private String withoutTaxAmount;

			private String taxAmount;

			private String sumAmount;

			private String invoiceAmount;

			private String payeeName;

			private String payeeRegisterNo;

			private String payeeAddress;

			private String payeeBankName;

			private String payee;

			private String checker;

			private String clerk;

			public String getInvoiceCode() {
				return this.invoiceCode;
			}

			public void setInvoiceCode(String invoiceCode) {
				this.invoiceCode = invoiceCode;
			}

			public String getInvoiceNo() {
				return this.invoiceNo;
			}

			public void setInvoiceNo(String invoiceNo) {
				this.invoiceNo = invoiceNo;
			}

			public String getInvoiceDate() {
				return this.invoiceDate;
			}

			public void setInvoiceDate(String invoiceDate) {
				this.invoiceDate = invoiceDate;
			}

			public String getAntiFakeCode() {
				return this.antiFakeCode;
			}

			public void setAntiFakeCode(String antiFakeCode) {
				this.antiFakeCode = antiFakeCode;
			}

			public String getPayerName() {
				return this.payerName;
			}

			public void setPayerName(String payerName) {
				this.payerName = payerName;
			}

			public String getPayerRegisterNo() {
				return this.payerRegisterNo;
			}

			public void setPayerRegisterNo(String payerRegisterNo) {
				this.payerRegisterNo = payerRegisterNo;
			}

			public String getPayerAddress() {
				return this.payerAddress;
			}

			public void setPayerAddress(String payerAddress) {
				this.payerAddress = payerAddress;
			}

			public String getPayerBankName() {
				return this.payerBankName;
			}

			public void setPayerBankName(String payerBankName) {
				this.payerBankName = payerBankName;
			}

			public String getWithoutTaxAmount() {
				return this.withoutTaxAmount;
			}

			public void setWithoutTaxAmount(String withoutTaxAmount) {
				this.withoutTaxAmount = withoutTaxAmount;
			}

			public String getTaxAmount() {
				return this.taxAmount;
			}

			public void setTaxAmount(String taxAmount) {
				this.taxAmount = taxAmount;
			}

			public String getSumAmount() {
				return this.sumAmount;
			}

			public void setSumAmount(String sumAmount) {
				this.sumAmount = sumAmount;
			}

			public String getInvoiceAmount() {
				return this.invoiceAmount;
			}

			public void setInvoiceAmount(String invoiceAmount) {
				this.invoiceAmount = invoiceAmount;
			}

			public String getPayeeName() {
				return this.payeeName;
			}

			public void setPayeeName(String payeeName) {
				this.payeeName = payeeName;
			}

			public String getPayeeRegisterNo() {
				return this.payeeRegisterNo;
			}

			public void setPayeeRegisterNo(String payeeRegisterNo) {
				this.payeeRegisterNo = payeeRegisterNo;
			}

			public String getPayeeAddress() {
				return this.payeeAddress;
			}

			public void setPayeeAddress(String payeeAddress) {
				this.payeeAddress = payeeAddress;
			}

			public String getPayeeBankName() {
				return this.payeeBankName;
			}

			public void setPayeeBankName(String payeeBankName) {
				this.payeeBankName = payeeBankName;
			}

			public String getPayee() {
				return this.payee;
			}

			public void setPayee(String payee) {
				this.payee = payee;
			}

			public String getChecker() {
				return this.checker;
			}

			public void setChecker(String checker) {
				this.checker = checker;
			}

			public String getClerk() {
				return this.clerk;
			}

			public void setClerk(String clerk) {
				this.clerk = clerk;
			}
		}

		public static class Box {

			private List<Float> invoiceCodes;

			private List<Float> invoiceNoes;

			private List<Float> invoiceDates;

			private List<Float> invoiceFakeCodes;

			private List<Float> payerNames;

			private List<Float> payerRegisterNoes;

			private List<Float> payerAddresses;

			private List<Float> payerBankNames;

			private List<Float> withoutTaxAmounts;

			private List<Float> taxAmounts;

			private List<Float> sumAmounts;

			private List<Float> invoiceAmounts;

			private List<Float> payeeNames;

			private List<Float> payeeRegisterNoes;

			private List<Float> payeeAddresses;

			private List<Float> payeeBankNames;

			private List<Float> payees;

			private List<Float> checkers;

			private List<Float> clerks;

			public List<Float> getInvoiceCodes() {
				return this.invoiceCodes;
			}

			public void setInvoiceCodes(List<Float> invoiceCodes) {
				this.invoiceCodes = invoiceCodes;
			}

			public List<Float> getInvoiceNoes() {
				return this.invoiceNoes;
			}

			public void setInvoiceNoes(List<Float> invoiceNoes) {
				this.invoiceNoes = invoiceNoes;
			}

			public List<Float> getInvoiceDates() {
				return this.invoiceDates;
			}

			public void setInvoiceDates(List<Float> invoiceDates) {
				this.invoiceDates = invoiceDates;
			}

			public List<Float> getInvoiceFakeCodes() {
				return this.invoiceFakeCodes;
			}

			public void setInvoiceFakeCodes(List<Float> invoiceFakeCodes) {
				this.invoiceFakeCodes = invoiceFakeCodes;
			}

			public List<Float> getPayerNames() {
				return this.payerNames;
			}

			public void setPayerNames(List<Float> payerNames) {
				this.payerNames = payerNames;
			}

			public List<Float> getPayerRegisterNoes() {
				return this.payerRegisterNoes;
			}

			public void setPayerRegisterNoes(List<Float> payerRegisterNoes) {
				this.payerRegisterNoes = payerRegisterNoes;
			}

			public List<Float> getPayerAddresses() {
				return this.payerAddresses;
			}

			public void setPayerAddresses(List<Float> payerAddresses) {
				this.payerAddresses = payerAddresses;
			}

			public List<Float> getPayerBankNames() {
				return this.payerBankNames;
			}

			public void setPayerBankNames(List<Float> payerBankNames) {
				this.payerBankNames = payerBankNames;
			}

			public List<Float> getWithoutTaxAmounts() {
				return this.withoutTaxAmounts;
			}

			public void setWithoutTaxAmounts(List<Float> withoutTaxAmounts) {
				this.withoutTaxAmounts = withoutTaxAmounts;
			}

			public List<Float> getTaxAmounts() {
				return this.taxAmounts;
			}

			public void setTaxAmounts(List<Float> taxAmounts) {
				this.taxAmounts = taxAmounts;
			}

			public List<Float> getSumAmounts() {
				return this.sumAmounts;
			}

			public void setSumAmounts(List<Float> sumAmounts) {
				this.sumAmounts = sumAmounts;
			}

			public List<Float> getInvoiceAmounts() {
				return this.invoiceAmounts;
			}

			public void setInvoiceAmounts(List<Float> invoiceAmounts) {
				this.invoiceAmounts = invoiceAmounts;
			}

			public List<Float> getPayeeNames() {
				return this.payeeNames;
			}

			public void setPayeeNames(List<Float> payeeNames) {
				this.payeeNames = payeeNames;
			}

			public List<Float> getPayeeRegisterNoes() {
				return this.payeeRegisterNoes;
			}

			public void setPayeeRegisterNoes(List<Float> payeeRegisterNoes) {
				this.payeeRegisterNoes = payeeRegisterNoes;
			}

			public List<Float> getPayeeAddresses() {
				return this.payeeAddresses;
			}

			public void setPayeeAddresses(List<Float> payeeAddresses) {
				this.payeeAddresses = payeeAddresses;
			}

			public List<Float> getPayeeBankNames() {
				return this.payeeBankNames;
			}

			public void setPayeeBankNames(List<Float> payeeBankNames) {
				this.payeeBankNames = payeeBankNames;
			}

			public List<Float> getPayees() {
				return this.payees;
			}

			public void setPayees(List<Float> payees) {
				this.payees = payees;
			}

			public List<Float> getCheckers() {
				return this.checkers;
			}

			public void setCheckers(List<Float> checkers) {
				this.checkers = checkers;
			}

			public List<Float> getClerks() {
				return this.clerks;
			}

			public void setClerks(List<Float> clerks) {
				this.clerks = clerks;
			}
		}
	}

	@Override
	public RecognizeVATInvoiceResponse getInstance(UnmarshallerContext context) {
		return	RecognizeVATInvoiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
