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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class FindPkByHidForLoginWithLegacyRequest extends RpcAcsRequest<FindPkByHidForLoginWithLegacyResponse> {
	   

	private String hid;

	private String securityToken;
	public FindPkByHidForLoginWithLegacyRequest() {
		super("account-crm", "2016-06-06", "FindPkByHidForLoginWithLegacy");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public String getHid() {
		return this.hid;
	}

	public void setHid(String hid) {
		this.hid = hid;
		if(hid != null){
			putQueryParameter("Hid", hid);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	@Override
	public Class<FindPkByHidForLoginWithLegacyResponse> getResponseClass() {
		return FindPkByHidForLoginWithLegacyResponse.class;
	}

}
