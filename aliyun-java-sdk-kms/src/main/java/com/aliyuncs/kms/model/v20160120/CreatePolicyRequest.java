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

package com.aliyuncs.kms.model.v20160120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.kms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreatePolicyRequest extends RpcAcsRequest<CreatePolicyResponse> {
	   

	private String accessControlRules;

	private String description;

	private String resources;

	private String kmsInstance;

	private String permissions;

	private String name;
	public CreatePolicyRequest() {
		super("Kms", "2016-01-20", "CreatePolicy", "kms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccessControlRules() {
		return this.accessControlRules;
	}

	public void setAccessControlRules(String accessControlRules) {
		this.accessControlRules = accessControlRules;
		if(accessControlRules != null){
			putQueryParameter("AccessControlRules", accessControlRules);
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

	public String getResources() {
		return this.resources;
	}

	public void setResources(String resources) {
		this.resources = resources;
		if(resources != null){
			putQueryParameter("Resources", resources);
		}
	}

	public String getKmsInstance() {
		return this.kmsInstance;
	}

	public void setKmsInstance(String kmsInstance) {
		this.kmsInstance = kmsInstance;
		if(kmsInstance != null){
			putQueryParameter("KmsInstance", kmsInstance);
		}
	}

	public String getPermissions() {
		return this.permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
		if(permissions != null){
			putQueryParameter("Permissions", permissions);
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

	@Override
	public Class<CreatePolicyResponse> getResponseClass() {
		return CreatePolicyResponse.class;
	}

}
