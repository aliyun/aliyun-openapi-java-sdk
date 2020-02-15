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
public class CreateAntChainAccountWithKeyPairAutoCreationRequest extends RpcAcsRequest<CreateAntChainAccountWithKeyPairAutoCreationResponse> {
	   

	private String password;

	private String antChainId;

	private String recoverPassword;

	private String account;
	public CreateAntChainAccountWithKeyPairAutoCreationRequest() {
		super("Baas", "2018-12-21", "CreateAntChainAccountWithKeyPairAutoCreation", "baas");
		setMethod(MethodType.PUT);
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putBodyParameter("Password", password);
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

	public String getRecoverPassword() {
		return this.recoverPassword;
	}

	public void setRecoverPassword(String recoverPassword) {
		this.recoverPassword = recoverPassword;
		if(recoverPassword != null){
			putBodyParameter("RecoverPassword", recoverPassword);
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
	public Class<CreateAntChainAccountWithKeyPairAutoCreationResponse> getResponseClass() {
		return CreateAntChainAccountWithKeyPairAutoCreationResponse.class;
	}

}
