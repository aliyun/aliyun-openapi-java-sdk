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

package com.aliyuncs.resourcemanager.model.v20200331;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcemanager.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeregisterDelegatedAdministratorRequest extends RpcAcsRequest<DeregisterDelegatedAdministratorResponse> {
	   

	private String accountId;

	private String servicePrincipal;
	public DeregisterDelegatedAdministratorRequest() {
		super("ResourceManager", "2020-03-31", "DeregisterDelegatedAdministrator", "resourcemanager");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getServicePrincipal() {
		return this.servicePrincipal;
	}

	public void setServicePrincipal(String servicePrincipal) {
		this.servicePrincipal = servicePrincipal;
		if(servicePrincipal != null){
			putQueryParameter("ServicePrincipal", servicePrincipal);
		}
	}

	@Override
	public Class<DeregisterDelegatedAdministratorResponse> getResponseClass() {
		return DeregisterDelegatedAdministratorResponse.class;
	}

}
