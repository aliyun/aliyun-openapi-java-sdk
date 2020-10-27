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

package com.aliyuncs.cloudesl.model.v20200201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddRoleActionsRequest extends RpcAcsRequest<AddRoleActionsResponse> {
	   

	private String roleCode;

	private String extraParams;

	private String clientToken;

	private String accessControlLists;
	public AddRoleActionsRequest() {
		super("cloudesl", "2020-02-01", "AddRoleActions", "cloudesl");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRoleCode() {
		return this.roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
		if(roleCode != null){
			putBodyParameter("RoleCode", roleCode);
		}
	}

	public String getExtraParams() {
		return this.extraParams;
	}

	public void setExtraParams(String extraParams) {
		this.extraParams = extraParams;
		if(extraParams != null){
			putBodyParameter("ExtraParams", extraParams);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getAccessControlLists() {
		return this.accessControlLists;
	}

	public void setAccessControlLists(String accessControlLists) {
		this.accessControlLists = accessControlLists;
		if(accessControlLists != null){
			putBodyParameter("AccessControlLists", accessControlLists);
		}
	}

	@Override
	public Class<AddRoleActionsResponse> getResponseClass() {
		return AddRoleActionsResponse.class;
	}

}
