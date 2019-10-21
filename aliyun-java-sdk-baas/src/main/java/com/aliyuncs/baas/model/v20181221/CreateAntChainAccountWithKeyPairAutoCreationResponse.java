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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.CreateAntChainAccountWithKeyPairAutoCreationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateAntChainAccountWithKeyPairAutoCreationResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String accountPrivateKey;

		private String accountPublicKey;

		private String accountRecoverPrivateKey;

		private String accountRecoverPublicKey;

		private String antChainId;

		private String account;

		public String getAccountPrivateKey() {
			return this.accountPrivateKey;
		}

		public void setAccountPrivateKey(String accountPrivateKey) {
			this.accountPrivateKey = accountPrivateKey;
		}

		public String getAccountPublicKey() {
			return this.accountPublicKey;
		}

		public void setAccountPublicKey(String accountPublicKey) {
			this.accountPublicKey = accountPublicKey;
		}

		public String getAccountRecoverPrivateKey() {
			return this.accountRecoverPrivateKey;
		}

		public void setAccountRecoverPrivateKey(String accountRecoverPrivateKey) {
			this.accountRecoverPrivateKey = accountRecoverPrivateKey;
		}

		public String getAccountRecoverPublicKey() {
			return this.accountRecoverPublicKey;
		}

		public void setAccountRecoverPublicKey(String accountRecoverPublicKey) {
			this.accountRecoverPublicKey = accountRecoverPublicKey;
		}

		public String getAntChainId() {
			return this.antChainId;
		}

		public void setAntChainId(String antChainId) {
			this.antChainId = antChainId;
		}

		public String getAccount() {
			return this.account;
		}

		public void setAccount(String account) {
			this.account = account;
		}
	}

	@Override
	public CreateAntChainAccountWithKeyPairAutoCreationResponse getInstance(UnmarshallerContext context) {
		return	CreateAntChainAccountWithKeyPairAutoCreationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
