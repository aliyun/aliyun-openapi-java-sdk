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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QueryAccountBalanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAccountBalanceResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String availableAmount;

		private String creditAmount;

		private String mybankCreditAmount;

		private String currency;

		private String availableCashAmount;

		private String quotaLimit;

		public String getAvailableAmount() {
			return this.availableAmount;
		}

		public void setAvailableAmount(String availableAmount) {
			this.availableAmount = availableAmount;
		}

		public String getCreditAmount() {
			return this.creditAmount;
		}

		public void setCreditAmount(String creditAmount) {
			this.creditAmount = creditAmount;
		}

		public String getMybankCreditAmount() {
			return this.mybankCreditAmount;
		}

		public void setMybankCreditAmount(String mybankCreditAmount) {
			this.mybankCreditAmount = mybankCreditAmount;
		}

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public String getAvailableCashAmount() {
			return this.availableCashAmount;
		}

		public void setAvailableCashAmount(String availableCashAmount) {
			this.availableCashAmount = availableCashAmount;
		}

		public String getQuotaLimit() {
			return this.quotaLimit;
		}

		public void setQuotaLimit(String quotaLimit) {
			this.quotaLimit = quotaLimit;
		}
	}

	@Override
	public QueryAccountBalanceResponse getInstance(UnmarshallerContext context) {
		return	QueryAccountBalanceResponseUnmarshaller.unmarshall(this, context);
	}
}
