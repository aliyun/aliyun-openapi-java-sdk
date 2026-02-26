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

package com.aliyuncs.swas_open.model.v20200601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ResetDatabaseAccountPasswordRequest extends RpcAcsRequest<ResetDatabaseAccountPasswordResponse> {
	   

	private String clientToken;

	private String databaseInstanceId;

	private String accountPassword;
	public ResetDatabaseAccountPasswordRequest() {
		super("SWAS-OPEN", "2020-06-01", "ResetDatabaseAccountPassword", "SWAS-OPEN");
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDatabaseInstanceId() {
		return this.databaseInstanceId;
	}

	public void setDatabaseInstanceId(String databaseInstanceId) {
		this.databaseInstanceId = databaseInstanceId;
		if(databaseInstanceId != null){
			putQueryParameter("DatabaseInstanceId", databaseInstanceId);
		}
	}

	public String getAccountPassword() {
		return this.accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
		if(accountPassword != null){
			putQueryParameter("AccountPassword", accountPassword);
		}
	}

	@Override
	public Class<ResetDatabaseAccountPasswordResponse> getResponseClass() {
		return ResetDatabaseAccountPasswordResponse.class;
	}

}
