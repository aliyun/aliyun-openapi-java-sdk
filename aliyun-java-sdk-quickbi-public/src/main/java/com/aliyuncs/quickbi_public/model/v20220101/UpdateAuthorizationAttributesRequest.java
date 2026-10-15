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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateAuthorizationAttributesRequest extends RpcAcsRequest<UpdateAuthorizationAttributesResponse> {
	   

	private Integer usePermissionType;

	private String resourceId;

	private Integer editPermissionType;

	private String resourceType;
	public UpdateAuthorizationAttributesRequest() {
		super("quickbi-public", "2022-01-01", "UpdateAuthorizationAttributes", "QuickBI");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Integer getUsePermissionType() {
		return this.usePermissionType;
	}

	public void setUsePermissionType(Integer usePermissionType) {
		this.usePermissionType = usePermissionType;
		if(usePermissionType != null){
			putQueryParameter("UsePermissionType", usePermissionType.toString());
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public Integer getEditPermissionType() {
		return this.editPermissionType;
	}

	public void setEditPermissionType(Integer editPermissionType) {
		this.editPermissionType = editPermissionType;
		if(editPermissionType != null){
			putQueryParameter("EditPermissionType", editPermissionType.toString());
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	@Override
	public Class<UpdateAuthorizationAttributesResponse> getResponseClass() {
		return UpdateAuthorizationAttributesResponse.class;
	}

}
