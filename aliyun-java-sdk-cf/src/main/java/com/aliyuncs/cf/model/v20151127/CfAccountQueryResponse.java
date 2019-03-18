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

package com.aliyuncs.cf.model.v20151127;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cf.transform.v20151127.CfAccountQueryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CfAccountQueryResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private String detailMessage;

	private AccountQueryResponse accountQueryResponse;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetailMessage() {
		return this.detailMessage;
	}

	public void setDetailMessage(String detailMessage) {
		this.detailMessage = detailMessage;
	}

	public AccountQueryResponse getAccountQueryResponse() {
		return this.accountQueryResponse;
	}

	public void setAccountQueryResponse(AccountQueryResponse accountQueryResponse) {
		this.accountQueryResponse = accountQueryResponse;
	}

	public static class AccountQueryResponse {

		private String riskLevel;

		private String score;

		private String eventId;

		private List<AccountRiskDetail> detail;

		public String getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(String riskLevel) {
			this.riskLevel = riskLevel;
		}

		public String getScore() {
			return this.score;
		}

		public void setScore(String score) {
			this.score = score;
		}

		public String getEventId() {
			return this.eventId;
		}

		public void setEventId(String eventId) {
			this.eventId = eventId;
		}

		public List<AccountRiskDetail> getDetail() {
			return this.detail;
		}

		public void setDetail(List<AccountRiskDetail> detail) {
			this.detail = detail;
		}

		public static class AccountRiskDetail {

			private String name;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public CfAccountQueryResponse getInstance(UnmarshallerContext context) {
		return	CfAccountQueryResponseUnmarshaller.unmarshall(this, context);
	}
}
