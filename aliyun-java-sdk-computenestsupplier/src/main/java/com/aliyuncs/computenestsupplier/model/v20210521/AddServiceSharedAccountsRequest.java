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

package com.aliyuncs.computenestsupplier.model.v20210521;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.computenestsupplier.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddServiceSharedAccountsRequest extends RpcAcsRequest<AddServiceSharedAccountsResponse> {
	   

	private String clientToken;

	private String type;

	private List<SharedAccounts> sharedAccountss;

	private String serviceId;
	public AddServiceSharedAccountsRequest() {
		super("ComputeNestSupplier", "2021-05-21", "AddServiceSharedAccounts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public List<SharedAccounts> getSharedAccountss() {
		return this.sharedAccountss;
	}

	public void setSharedAccountss(List<SharedAccounts> sharedAccountss) {
		this.sharedAccountss = sharedAccountss;	
		if (sharedAccountss != null) {
			for (int depth1 = 0; depth1 < sharedAccountss.size(); depth1++) {
				putQueryParameter("SharedAccounts." + (depth1 + 1) + ".UserAliUid" , sharedAccountss.get(depth1).getUserAliUid());
				putQueryParameter("SharedAccounts." + (depth1 + 1) + ".Permission" , sharedAccountss.get(depth1).getPermission());
			}
		}	
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId);
		}
	}

	public static class SharedAccounts {

		private String userAliUid;

		private String permission;

		public String getUserAliUid() {
			return this.userAliUid;
		}

		public void setUserAliUid(String userAliUid) {
			this.userAliUid = userAliUid;
		}

		public String getPermission() {
			return this.permission;
		}

		public void setPermission(String permission) {
			this.permission = permission;
		}
	}

	@Override
	public Class<AddServiceSharedAccountsResponse> getResponseClass() {
		return AddServiceSharedAccountsResponse.class;
	}

}
