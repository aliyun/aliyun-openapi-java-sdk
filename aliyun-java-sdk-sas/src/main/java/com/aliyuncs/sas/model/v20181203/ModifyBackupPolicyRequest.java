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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyBackupPolicyRequest extends RpcAcsRequest<ModifyBackupPolicyResponse> {
	   

	private List<String> uuidLists;

	private Long id;

	private String policy;

	private String policyVersion;

	private String policyRegionId;

	private String name;
	public ModifyBackupPolicyRequest() {
		super("Sas", "2018-12-03", "ModifyBackupPolicy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getUuidLists() {
		return this.uuidLists;
	}

	public void setUuidLists(List<String> uuidLists) {
		this.uuidLists = uuidLists;	
		if (uuidLists != null) {
			for (int i = 0; i < uuidLists.size(); i++) {
				putQueryParameter("UuidList." + (i + 1) , uuidLists.get(i));
			}
		}	
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
		if(policy != null){
			putQueryParameter("Policy", policy);
		}
	}

	public String getPolicyVersion() {
		return this.policyVersion;
	}

	public void setPolicyVersion(String policyVersion) {
		this.policyVersion = policyVersion;
		if(policyVersion != null){
			putQueryParameter("PolicyVersion", policyVersion);
		}
	}

	public String getPolicyRegionId() {
		return this.policyRegionId;
	}

	public void setPolicyRegionId(String policyRegionId) {
		this.policyRegionId = policyRegionId;
		if(policyRegionId != null){
			putQueryParameter("PolicyRegionId", policyRegionId);
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
	public Class<ModifyBackupPolicyResponse> getResponseClass() {
		return ModifyBackupPolicyResponse.class;
	}

}
