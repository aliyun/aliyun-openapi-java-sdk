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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateAntChainAccountRequest extends RpcAcsRequest<CreateAntChainAccountResponse> {
	   

	private String accountRecoverPubKey;

	private String accountPubKey;

	private String antChainId;

	private String account;
	public CreateAntChainAccountRequest() {
		super("Baas", "2018-12-21", "CreateAntChainAccount", "baas");
		setMethod(MethodType.PUT);
	}

	public String getAccountRecoverPubKey() {
		return this.accountRecoverPubKey;
	}

	public void setAccountRecoverPubKey(String accountRecoverPubKey) {
		this.accountRecoverPubKey = accountRecoverPubKey;
		if(accountRecoverPubKey != null){
			putBodyParameter("AccountRecoverPubKey", accountRecoverPubKey);
		}
	}

	public String getAccountPubKey() {
		return this.accountPubKey;
	}

	public void setAccountPubKey(String accountPubKey) {
		this.accountPubKey = accountPubKey;
		if(accountPubKey != null){
			putBodyParameter("AccountPubKey", accountPubKey);
		}
	}

	public String getAntChainId() {
		return this.antChainId;
	}

	public void setAntChainId(String antChainId) {
		this.antChainId = antChainId;
		if(antChainId != null){
			putBodyParameter("AntChainId", antChainId);
		}
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
		if(account != null){
			putBodyParameter("Account", account);
		}
	}

	@Override
	public Class<CreateAntChainAccountResponse> getResponseClass() {
		return CreateAntChainAccountResponse.class;
	}

}
