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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AsyncCreateAgAccountRequest extends RpcAcsRequest<AsyncCreateAgAccountResponse> {
	   

	private String loginEmail;

	private String maserAccountInfo;

	private String mpk;
	public AsyncCreateAgAccountRequest() {
		super("account-crm", "2016-06-06", "AsyncCreateAgAccount");
		setMethod(MethodType.POST);
	}

	public String getLoginEmail() {
		return this.loginEmail;
	}

	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
		if(loginEmail != null){
			putQueryParameter("LoginEmail", loginEmail);
		}
	}

	public String getMaserAccountInfo() {
		return this.maserAccountInfo;
	}

	public void setMaserAccountInfo(String maserAccountInfo) {
		this.maserAccountInfo = maserAccountInfo;
		if(maserAccountInfo != null){
			putQueryParameter("MaserAccountInfo", maserAccountInfo);
		}
	}

	public String getMpk() {
		return this.mpk;
	}

	public void setMpk(String mpk) {
		this.mpk = mpk;
		if(mpk != null){
			putQueryParameter("Mpk", mpk);
		}
	}

	@Override
	public Class<AsyncCreateAgAccountResponse> getResponseClass() {
		return AsyncCreateAgAccountResponse.class;
	}

}
