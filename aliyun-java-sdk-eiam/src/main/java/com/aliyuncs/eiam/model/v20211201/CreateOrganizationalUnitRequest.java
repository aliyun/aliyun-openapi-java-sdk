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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateOrganizationalUnitRequest extends RpcAcsRequest<CreateOrganizationalUnitResponse> {
	   

	private String organizationalUnitExternalId;

	private String description;

	private String parentId;

	private String organizationalUnitName;

	private String instanceId;
	public CreateOrganizationalUnitRequest() {
		super("Eiam", "2021-12-01", "CreateOrganizationalUnit", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getOrganizationalUnitExternalId() {
		return this.organizationalUnitExternalId;
	}

	public void setOrganizationalUnitExternalId(String organizationalUnitExternalId) {
		this.organizationalUnitExternalId = organizationalUnitExternalId;
		if(organizationalUnitExternalId != null){
			putQueryParameter("OrganizationalUnitExternalId", organizationalUnitExternalId);
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

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
		if(parentId != null){
			putQueryParameter("ParentId", parentId);
		}
	}

	public String getOrganizationalUnitName() {
		return this.organizationalUnitName;
	}

	public void setOrganizationalUnitName(String organizationalUnitName) {
		this.organizationalUnitName = organizationalUnitName;
		if(organizationalUnitName != null){
			putQueryParameter("OrganizationalUnitName", organizationalUnitName);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<CreateOrganizationalUnitResponse> getResponseClass() {
		return CreateOrganizationalUnitResponse.class;
	}

}
