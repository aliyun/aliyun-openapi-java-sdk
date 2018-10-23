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
import com.aliyuncs.finmall.transform.v20180723.GetRepayPlanTrialResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRepayPlanTrialResponse extends AcsResponse {

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

		private String amount;

		private String plan;

		private String terms;

		private String loanRate;

		private String repayMethod;

		private String prepayment;

		public String getAmount() {
			return this.amount;
		}

		public void setAmount(String amount) {
			this.amount = amount;
		}

		public String getPlan() {
			return this.plan;
		}

		public void setPlan(String plan) {
			this.plan = plan;
		}

		public String getTerms() {
			return this.terms;
		}

		public void setTerms(String terms) {
			this.terms = terms;
		}

		public String getLoanRate() {
			return this.loanRate;
		}

		public void setLoanRate(String loanRate) {
			this.loanRate = loanRate;
		}

		public String getRepayMethod() {
			return this.repayMethod;
		}

		public void setRepayMethod(String repayMethod) {
			this.repayMethod = repayMethod;
		}

		public String getPrepayment() {
			return this.prepayment;
		}

		public void setPrepayment(String prepayment) {
			this.prepayment = prepayment;
		}
	}

	@Override
	public GetRepayPlanTrialResponse getInstance(UnmarshallerContext context) {
		return	GetRepayPlanTrialResponseUnmarshaller.unmarshall(this, context);
	}
}
