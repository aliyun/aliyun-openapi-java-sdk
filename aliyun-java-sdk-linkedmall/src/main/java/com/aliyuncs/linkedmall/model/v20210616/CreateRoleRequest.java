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

package com.aliyuncs.linkedmall.model.v20210616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkedmall.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRoleRequest extends RpcAcsRequest<CreateRoleResponse> {
	   

	private String code;

	private String requestId;

	private String name;

	private String extendRoleIds;

	private String tenantId;

	private String description;

	private String mutexRoleIds;
	public CreateRoleRequest() {
		super("linkedmall", "2021-06-16", "CreateRole", "linkedmall");
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
			putQueryParameter("Code", code);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getExtendRoleIds() {
		return this.extendRoleIds;
	}

	public void setExtendRoleIds(String extendRoleIds) {
		this.extendRoleIds = extendRoleIds;
		if(extendRoleIds != null){
			putQueryParameter("ExtendRoleIds", extendRoleIds);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getMutexRoleIds() {
		return this.mutexRoleIds;
	}

	public void setMutexRoleIds(String mutexRoleIds) {
		this.mutexRoleIds = mutexRoleIds;
		if(mutexRoleIds != null){
			putQueryParameter("MutexRoleIds", mutexRoleIds);
		}
	}

	@Override
	public Class<CreateRoleResponse> getResponseClass() {
		return CreateRoleResponse.class;
	}

}
