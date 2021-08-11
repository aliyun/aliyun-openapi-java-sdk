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
public class InstallBackupClientRequest extends RpcAcsRequest<InstallBackupClientResponse> {
	   

	private Long resourceOwnerId;

	private String uuid;

	private String sourceIp;

	private List<String> uuidLists;

	private String policyVersion;
	public InstallBackupClientRequest() {
		super("Sas", "2018-12-03", "InstallBackupClient", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
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

	public String getPolicyVersion() {
		return this.policyVersion;
	}

	public void setPolicyVersion(String policyVersion) {
		this.policyVersion = policyVersion;
		if(policyVersion != null){
			putQueryParameter("PolicyVersion", policyVersion);
		}
	}

	@Override
	public Class<InstallBackupClientResponse> getResponseClass() {
		return InstallBackupClientResponse.class;
	}

}
