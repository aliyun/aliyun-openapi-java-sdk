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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyUserEntitlementRequest extends RpcAcsRequest<ModifyUserEntitlementResponse> {
	   

	private List<String> authorizeDesktopIds;

	private List<String> revokeDesktopIds;

	private List<String> endUserIds;
	public ModifyUserEntitlementRequest() {
		super("ecd", "2020-09-30", "ModifyUserEntitlement", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getAuthorizeDesktopIds() {
		return this.authorizeDesktopIds;
	}

	public void setAuthorizeDesktopIds(List<String> authorizeDesktopIds) {
		this.authorizeDesktopIds = authorizeDesktopIds;	
		if (authorizeDesktopIds != null) {
			for (int i = 0; i < authorizeDesktopIds.size(); i++) {
				putQueryParameter("AuthorizeDesktopId." + (i + 1) , authorizeDesktopIds.get(i));
			}
		}	
	}

	public List<String> getRevokeDesktopIds() {
		return this.revokeDesktopIds;
	}

	public void setRevokeDesktopIds(List<String> revokeDesktopIds) {
		this.revokeDesktopIds = revokeDesktopIds;	
		if (revokeDesktopIds != null) {
			for (int i = 0; i < revokeDesktopIds.size(); i++) {
				putQueryParameter("RevokeDesktopId." + (i + 1) , revokeDesktopIds.get(i));
			}
		}	
	}

	public List<String> getEndUserIds() {
		return this.endUserIds;
	}

	public void setEndUserIds(List<String> endUserIds) {
		this.endUserIds = endUserIds;	
		if (endUserIds != null) {
			for (int i = 0; i < endUserIds.size(); i++) {
				putQueryParameter("EndUserId." + (i + 1) , endUserIds.get(i));
			}
		}	
	}

	@Override
	public Class<ModifyUserEntitlementResponse> getResponseClass() {
		return ModifyUserEntitlementResponse.class;
	}

}
