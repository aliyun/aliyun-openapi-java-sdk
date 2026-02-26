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

package com.aliyuncs.cams.model.v20200606;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cams.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetPermissionByCodeRequest extends RpcAcsRequest<GetPermissionByCodeResponse> {
	   

	private String code;

	@SerializedName("permissions")
	private List<String> permissions;

	private String custSpaceId;
	public GetPermissionByCodeRequest() {
		super("cams", "2020-06-06", "GetPermissionByCode", "cams");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
		if(code != null){
			putBodyParameter("Code", code);
		}
	}

	public List<String> getPermissions() {
		return this.permissions;
	}

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;	
		if (permissions != null) {
			putBodyParameter("Permissions" , new Gson().toJson(permissions));
		}	
	}

	public String getCustSpaceId() {
		return this.custSpaceId;
	}

	public void setCustSpaceId(String custSpaceId) {
		this.custSpaceId = custSpaceId;
		if(custSpaceId != null){
			putBodyParameter("CustSpaceId", custSpaceId);
		}
	}

	@Override
	public Class<GetPermissionByCodeResponse> getResponseClass() {
		return GetPermissionByCodeResponse.class;
	}

}
