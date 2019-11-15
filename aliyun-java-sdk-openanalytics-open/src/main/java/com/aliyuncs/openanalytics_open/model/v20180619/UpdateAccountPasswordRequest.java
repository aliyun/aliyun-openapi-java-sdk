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
public class UpdateAccountPasswordRequest extends RpcAcsRequest<UpdateAccountPasswordResponse> {
	   

	private Boolean isShort;

	private String password;

	private String accountName;

	private Boolean enableKMS;

	private Boolean useRandomPassword;
	public UpdateAccountPasswordRequest() {
		super("openanalytics-open", "2018-06-19", "UpdateAccountPassword", "openanalytics");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putBodyParameter("Password", password);
		}
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

	public Boolean getEnableKMS() {
		return this.enableKMS;
	}

	public void setEnableKMS(Boolean enableKMS) {
		this.enableKMS = enableKMS;
		if(enableKMS != null){
			putBodyParameter("EnableKMS", enableKMS.toString());
		}
	}

	public Boolean getUseRandomPassword() {
		return this.useRandomPassword;
	}

	public void setUseRandomPassword(Boolean useRandomPassword) {
		this.useRandomPassword = useRandomPassword;
		if(useRandomPassword != null){
			putBodyParameter("UseRandomPassword", useRandomPassword.toString());
		}
	}

	@Override
	public Class<UpdateAccountPasswordResponse> getResponseClass() {
		return UpdateAccountPasswordResponse.class;
	}

}
