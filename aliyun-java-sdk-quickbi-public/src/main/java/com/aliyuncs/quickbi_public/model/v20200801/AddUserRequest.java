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

package com.aliyuncs.quickbi_public.model.v20200801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.quickbi_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddUserRequest extends RpcAcsRequest<AddUserResponse> {
	   

	private Boolean adminUser;

	private Integer userType;

	private String accountId;

	private String accountName;

	private String nickName;

	private Boolean authAdminUser;
	public AddUserRequest() {
		super("quickbi-public", "2020-08-01", "AddUser", "quickbi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAdminUser() {
		return this.adminUser;
	}

	public void setAdminUser(Boolean adminUser) {
		this.adminUser = adminUser;
		if(adminUser != null){
			putQueryParameter("AdminUser", adminUser.toString());
		}
	}

	public Integer getUserType() {
		return this.userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
		if(userType != null){
			putQueryParameter("UserType", userType.toString());
		}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putQueryParameter("AccountId", accountId);
		}
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putQueryParameter("AccountName", accountName);
		}
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
		if(nickName != null){
			putQueryParameter("NickName", nickName);
		}
	}

	public Boolean getAuthAdminUser() {
		return this.authAdminUser;
	}

	public void setAuthAdminUser(Boolean authAdminUser) {
		this.authAdminUser = authAdminUser;
		if(authAdminUser != null){
			putQueryParameter("AuthAdminUser", authAdminUser.toString());
		}
	}

	@Override
	public Class<AddUserResponse> getResponseClass() {
		return AddUserResponse.class;
	}

}
