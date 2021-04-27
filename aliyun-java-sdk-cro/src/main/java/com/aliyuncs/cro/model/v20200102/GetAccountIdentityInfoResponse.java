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

package com.aliyuncs.cro.model.v20200102;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cro.transform.v20200102.GetAccountIdentityInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccountIdentityInfoResponse extends AcsResponse {

	private String requestId;

	private AccountIdentityInfo accountIdentityInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AccountIdentityInfo getAccountIdentityInfo() {
		return this.accountIdentityInfo;
	}

	public void setAccountIdentityInfo(AccountIdentityInfo accountIdentityInfo) {
		this.accountIdentityInfo = accountIdentityInfo;
	}

	public static class AccountIdentityInfo {

		private String name;

		private String cardNumber;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCardNumber() {
			return this.cardNumber;
		}

		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}
	}

	@Override
	public GetAccountIdentityInfoResponse getInstance(UnmarshallerContext context) {
		return	GetAccountIdentityInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
