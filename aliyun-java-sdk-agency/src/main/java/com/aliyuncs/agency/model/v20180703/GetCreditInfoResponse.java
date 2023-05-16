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
import com.aliyuncs.agency.transform.v20180703.GetCreditInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCreditInfoResponse extends AcsResponse {

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

		private String outstandingBalance;

		private String creditLine;

		private String accountStatus;

		private String availableCredit;

		private String alarmThreshold;

		private String zeroCreditShutdownPolicy;

		private String newBuyStatus;

		public String getOutstandingBalance() {
			return this.outstandingBalance;
		}

		public void setOutstandingBalance(String outstandingBalance) {
			this.outstandingBalance = outstandingBalance;
		}

		public String getCreditLine() {
			return this.creditLine;
		}

		public void setCreditLine(String creditLine) {
			this.creditLine = creditLine;
		}

		public String getAccountStatus() {
			return this.accountStatus;
		}

		public void setAccountStatus(String accountStatus) {
			this.accountStatus = accountStatus;
		}

		public String getAvailableCredit() {
			return this.availableCredit;
		}

		public void setAvailableCredit(String availableCredit) {
			this.availableCredit = availableCredit;
		}

		public String getAlarmThreshold() {
			return this.alarmThreshold;
		}

		public void setAlarmThreshold(String alarmThreshold) {
			this.alarmThreshold = alarmThreshold;
		}

		public String getZeroCreditShutdownPolicy() {
			return this.zeroCreditShutdownPolicy;
		}

		public void setZeroCreditShutdownPolicy(String zeroCreditShutdownPolicy) {
			this.zeroCreditShutdownPolicy = zeroCreditShutdownPolicy;
		}

		public String getNewBuyStatus() {
			return this.newBuyStatus;
		}

		public void setNewBuyStatus(String newBuyStatus) {
			this.newBuyStatus = newBuyStatus;
		}
	}

	@Override
	public GetCreditInfoResponse getInstance(UnmarshallerContext context) {
		return	GetCreditInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
