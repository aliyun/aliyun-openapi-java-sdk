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

		private String availableAmount;

		private String availableCashAmount;

		private String creditAmount;

		private String mybankCreditAmount;

		private String currency;

		public String getAvailableAmount() {
			return this.availableAmount;
		}

		public void setAvailableAmount(String availableAmount) {
			this.availableAmount = availableAmount;
		}

		public String getAvailableCashAmount() {
			return this.availableCashAmount;
		}

		public void setAvailableCashAmount(String availableCashAmount) {
			this.availableCashAmount = availableCashAmount;
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
	}

	@Override
	public QueryAccountBalanceResponse getInstance(UnmarshallerContext context) {
		return	QueryAccountBalanceResponseUnmarshaller.unmarshall(this, context);
	}
}
