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

package com.aliyuncs.dyiotapi.model.v20171111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyiotapi.transform.v20171111.QueryCardStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCardStatusResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private CardStatus cardStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public CardStatus getCardStatus() {
		return this.cardStatus;
	}

	public void setCardStatus(CardStatus cardStatus) {
		this.cardStatus = cardStatus;
	}

	public static class CardStatus {

		private String iccid;

		private String msisdn;

		private String userStatus;

		public String getIccid() {
			return this.iccid;
		}

		public void setIccid(String iccid) {
			this.iccid = iccid;
		}

		public String getMsisdn() {
			return this.msisdn;
		}

		public void setMsisdn(String msisdn) {
			this.msisdn = msisdn;
		}

		public String getUserStatus() {
			return this.userStatus;
		}

		public void setUserStatus(String userStatus) {
			this.userStatus = userStatus;
		}
	}

	@Override
	public QueryCardStatusResponse getInstance(UnmarshallerContext context) {
		return	QueryCardStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
