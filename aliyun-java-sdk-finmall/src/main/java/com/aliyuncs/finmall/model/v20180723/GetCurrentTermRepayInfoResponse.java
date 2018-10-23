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
import com.aliyuncs.finmall.transform.v20180723.GetCurrentTermRepayInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCurrentTermRepayInfoResponse extends AcsResponse {

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

		private String balAmt;

		private String interAmt;

		private String fineAmt;

		private String interInter;

		private String fineInter;

		private String expiryDate;

		private String loanBalance;

		private String totalLoanAmount;

		private String repayPrincipalAmount;

		public String getCreditId() {
			return this.creditId;
		}

		public void setCreditId(String creditId) {
			this.creditId = creditId;
		}

		public String getBalAmt() {
			return this.balAmt;
		}

		public void setBalAmt(String balAmt) {
			this.balAmt = balAmt;
		}

		public String getInterAmt() {
			return this.interAmt;
		}

		public void setInterAmt(String interAmt) {
			this.interAmt = interAmt;
		}

		public String getFineAmt() {
			return this.fineAmt;
		}

		public void setFineAmt(String fineAmt) {
			this.fineAmt = fineAmt;
		}

		public String getInterInter() {
			return this.interInter;
		}

		public void setInterInter(String interInter) {
			this.interInter = interInter;
		}

		public String getFineInter() {
			return this.fineInter;
		}

		public void setFineInter(String fineInter) {
			this.fineInter = fineInter;
		}

		public String getExpiryDate() {
			return this.expiryDate;
		}

		public void setExpiryDate(String expiryDate) {
			this.expiryDate = expiryDate;
		}

		public String getLoanBalance() {
			return this.loanBalance;
		}

		public void setLoanBalance(String loanBalance) {
			this.loanBalance = loanBalance;
		}

		public String getTotalLoanAmount() {
			return this.totalLoanAmount;
		}

		public void setTotalLoanAmount(String totalLoanAmount) {
			this.totalLoanAmount = totalLoanAmount;
		}

		public String getRepayPrincipalAmount() {
			return this.repayPrincipalAmount;
		}

		public void setRepayPrincipalAmount(String repayPrincipalAmount) {
			this.repayPrincipalAmount = repayPrincipalAmount;
		}
	}

	@Override
	public GetCurrentTermRepayInfoResponse getInstance(UnmarshallerContext context) {
		return	GetCurrentTermRepayInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
