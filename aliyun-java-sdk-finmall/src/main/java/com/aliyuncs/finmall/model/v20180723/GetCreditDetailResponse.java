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

package com.aliyuncs.finmall.model.v20180723;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.finmall.transform.v20180723.GetCreditDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCreditDetailResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

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

		private String creditId;

		private String productName;

		private String lineOfCredit;

		private String amount;

		private String debtorName;

		private String loanBalance;

		private String repayPhase;

		private String state;

		private String createDate;

		private String updateDate;

		private String productId;

		private String fundPartyId;

		private String downPaymentAmount;

		private String downPaymentRate;

		public String getCreditId() {
			return this.creditId;
		}

		public void setCreditId(String creditId) {
			this.creditId = creditId;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getLineOfCredit() {
			return this.lineOfCredit;
		}

		public void setLineOfCredit(String lineOfCredit) {
			this.lineOfCredit = lineOfCredit;
		}

		public String getAmount() {
			return this.amount;
		}

		public void setAmount(String amount) {
			this.amount = amount;
		}

		public String getDebtorName() {
			return this.debtorName;
		}

		public void setDebtorName(String debtorName) {
			this.debtorName = debtorName;
		}

		public String getLoanBalance() {
			return this.loanBalance;
		}

		public void setLoanBalance(String loanBalance) {
			this.loanBalance = loanBalance;
		}

		public String getRepayPhase() {
			return this.repayPhase;
		}

		public void setRepayPhase(String repayPhase) {
			this.repayPhase = repayPhase;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getProductId() {
			return this.productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public String getFundPartyId() {
			return this.fundPartyId;
		}

		public void setFundPartyId(String fundPartyId) {
			this.fundPartyId = fundPartyId;
		}

		public String getDownPaymentAmount() {
			return this.downPaymentAmount;
		}

		public void setDownPaymentAmount(String downPaymentAmount) {
			this.downPaymentAmount = downPaymentAmount;
		}

		public String getDownPaymentRate() {
			return this.downPaymentRate;
		}

		public void setDownPaymentRate(String downPaymentRate) {
			this.downPaymentRate = downPaymentRate;
		}
	}

	@Override
	public GetCreditDetailResponse getInstance(UnmarshallerContext context) {
		return	GetCreditDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
