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
import com.aliyuncs.finmall.transform.v20180723.GetLatestOverdueRecordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLatestOverdueRecordResponse extends AcsResponse {

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

		private String overdueId;

		private String creditId;

		private String overdueType;

		private String creditAccount;

		private String principal;

		private String interestAmount;

		private String interestOfInterest;

		private String fineAmount;

		private String fineInterest;

		private String overdueStartDate;

		private String overdueDays;

		public String getOverdueId() {
			return this.overdueId;
		}

		public void setOverdueId(String overdueId) {
			this.overdueId = overdueId;
		}

		public String getCreditId() {
			return this.creditId;
		}

		public void setCreditId(String creditId) {
			this.creditId = creditId;
		}

		public String getOverdueType() {
			return this.overdueType;
		}

		public void setOverdueType(String overdueType) {
			this.overdueType = overdueType;
		}

		public String getCreditAccount() {
			return this.creditAccount;
		}

		public void setCreditAccount(String creditAccount) {
			this.creditAccount = creditAccount;
		}

		public String getPrincipal() {
			return this.principal;
		}

		public void setPrincipal(String principal) {
			this.principal = principal;
		}

		public String getInterestAmount() {
			return this.interestAmount;
		}

		public void setInterestAmount(String interestAmount) {
			this.interestAmount = interestAmount;
		}

		public String getInterestOfInterest() {
			return this.interestOfInterest;
		}

		public void setInterestOfInterest(String interestOfInterest) {
			this.interestOfInterest = interestOfInterest;
		}

		public String getFineAmount() {
			return this.fineAmount;
		}

		public void setFineAmount(String fineAmount) {
			this.fineAmount = fineAmount;
		}

		public String getFineInterest() {
			return this.fineInterest;
		}

		public void setFineInterest(String fineInterest) {
			this.fineInterest = fineInterest;
		}

		public String getOverdueStartDate() {
			return this.overdueStartDate;
		}

		public void setOverdueStartDate(String overdueStartDate) {
			this.overdueStartDate = overdueStartDate;
		}

		public String getOverdueDays() {
			return this.overdueDays;
		}

		public void setOverdueDays(String overdueDays) {
			this.overdueDays = overdueDays;
		}
	}

	@Override
	public GetLatestOverdueRecordResponse getInstance(UnmarshallerContext context) {
		return	GetLatestOverdueRecordResponseUnmarshaller.unmarshall(this, context);
	}
}
