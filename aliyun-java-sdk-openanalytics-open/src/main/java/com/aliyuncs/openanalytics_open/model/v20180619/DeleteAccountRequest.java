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

package com.aliyuncs.openanalytics_open.model.v20180619;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.openanalytics_open.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteAccountRequest extends RpcAcsRequest<DeleteAccountResponse> {
	   

	private String accountName;

	private Boolean isShort;

	private Boolean isServiceUser;
	public DeleteAccountRequest() {
		super("openanalytics-open", "2018-06-19", "DeleteAccount", "openanalytics");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putBodyParameter("AccountName", accountName);
		}
	}

	public Boolean getIsShort() {
		return this.isShort;
	}

	public void setIsShort(Boolean isShort) {
		this.isShort = isShort;
		if(isShort != null){
			putBodyParameter("IsShort", isShort.toString());
		}
	}

	public Boolean getIsServiceUser() {
		return this.isServiceUser;
	}

	public void setIsServiceUser(Boolean isServiceUser) {
		this.isServiceUser = isServiceUser;
		if(isServiceUser != null){
			putBodyParameter("IsServiceUser", isServiceUser.toString());
		}
	}

	@Override
	public Class<DeleteAccountResponse> getResponseClass() {
		return DeleteAccountResponse.class;
	}

}
