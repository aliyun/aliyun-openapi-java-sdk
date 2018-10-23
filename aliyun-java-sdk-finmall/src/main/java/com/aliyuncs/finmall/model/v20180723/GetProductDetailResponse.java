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
import com.aliyuncs.finmall.transform.v20180723.GetProductDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProductDetailResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String productId;

		private String productName;

		private String lendingOrganizations;

		private String terms;

		private String dailyRate;

		private String yearRate;

		private String foundPartyName;

		private String foundPartyId;

		private String interestRate;

		private String principalLimit;

		private String financialInfo;

		private String fineAmount;

		private String comment;

		public String getProductId() {
			return this.productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getLendingOrganizations() {
			return this.lendingOrganizations;
		}

		public void setLendingOrganizations(String lendingOrganizations) {
			this.lendingOrganizations = lendingOrganizations;
		}

		public String getTerms() {
			return this.terms;
		}

		public void setTerms(String terms) {
			this.terms = terms;
		}

		public String getDailyRate() {
			return this.dailyRate;
		}

		public void setDailyRate(String dailyRate) {
			this.dailyRate = dailyRate;
		}

		public String getYearRate() {
			return this.yearRate;
		}

		public void setYearRate(String yearRate) {
			this.yearRate = yearRate;
		}

		public String getFoundPartyName() {
			return this.foundPartyName;
		}

		public void setFoundPartyName(String foundPartyName) {
			this.foundPartyName = foundPartyName;
		}

		public String getFoundPartyId() {
			return this.foundPartyId;
		}

		public void setFoundPartyId(String foundPartyId) {
			this.foundPartyId = foundPartyId;
		}

		public String getInterestRate() {
			return this.interestRate;
		}

		public void setInterestRate(String interestRate) {
			this.interestRate = interestRate;
		}

		public String getPrincipalLimit() {
			return this.principalLimit;
		}

		public void setPrincipalLimit(String principalLimit) {
			this.principalLimit = principalLimit;
		}

		public String getFinancialInfo() {
			return this.financialInfo;
		}

		public void setFinancialInfo(String financialInfo) {
			this.financialInfo = financialInfo;
		}

		public String getFineAmount() {
			return this.fineAmount;
		}

		public void setFineAmount(String fineAmount) {
			this.fineAmount = fineAmount;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}
	}

	@Override
	public GetProductDetailResponse getInstance(UnmarshallerContext context) {
		return	GetProductDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
