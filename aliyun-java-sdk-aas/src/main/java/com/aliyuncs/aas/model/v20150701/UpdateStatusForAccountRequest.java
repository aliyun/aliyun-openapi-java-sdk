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

package com.aliyuncs.aas.model.v20150701;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateStatusForAccountRequest extends RpcAcsRequest<UpdateStatusForAccountResponse> {
	
	public UpdateStatusForAccountRequest() {
		super("Aas", "2015-07-01", "UpdateStatusForAccount");
	}

	private String accountStatus;

	private String pK;

	public String getAccountStatus() {
		return this.accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
		if(accountStatus != null){
			putQueryParameter("AccountStatus", accountStatus);
		}
	}

	public String getPK() {
		return this.pK;
	}

	public void setPK(String pK) {
		this.pK = pK;
		if(pK != null){
			putQueryParameter("PK", pK);
		}
	}

	@Override
	public Class<UpdateStatusForAccountResponse> getResponseClass() {
		return UpdateStatusForAccountResponse.class;
	}

}
