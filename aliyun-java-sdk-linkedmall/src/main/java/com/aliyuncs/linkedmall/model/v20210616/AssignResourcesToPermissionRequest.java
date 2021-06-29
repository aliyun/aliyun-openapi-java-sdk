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
public class AssignResourcesToPermissionRequest extends RpcAcsRequest<AssignResourcesToPermissionResponse> {
	   

	private String permissionId;

	private String resourceCodes;

	private String permissionCode;

	private String requestId;

	private String tenantId;

	private String resourceIds;
	public AssignResourcesToPermissionRequest() {
		super("linkedmall", "2021-06-16", "AssignResourcesToPermission", "linkedmall");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPermissionId() {
		return this.permissionId;
	}

	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
		if(permissionId != null){
			putQueryParameter("PermissionId", permissionId);
		}
	}

	public String getResourceCodes() {
		return this.resourceCodes;
	}

	public void setResourceCodes(String resourceCodes) {
		this.resourceCodes = resourceCodes;
		if(resourceCodes != null){
			putQueryParameter("ResourceCodes", resourceCodes);
		}
	}

	public String getPermissionCode() {
		return this.permissionCode;
	}

	public void setPermissionCode(String permissionCode) {
		this.permissionCode = permissionCode;
		if(permissionCode != null){
			putQueryParameter("PermissionCode", permissionCode);
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

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId);
		}
	}

	public String getResourceIds() {
		return this.resourceIds;
	}

	public void setResourceIds(String resourceIds) {
		this.resourceIds = resourceIds;
		if(resourceIds != null){
			putQueryParameter("ResourceIds", resourceIds);
		}
	}

	@Override
	public Class<AssignResourcesToPermissionResponse> getResponseClass() {
		return AssignResourcesToPermissionResponse.class;
	}

}
