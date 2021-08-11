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

package com.aliyuncs.alb.model.v20200616;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddEntriesToAclRequest extends RpcAcsRequest<AddEntriesToAclResponse> {
	   

	private String clientToken;

	private String aclId;

	private Boolean dryRun;

	private List<AclEntries> aclEntries;
	public AddEntriesToAclRequest() {
		super("Alb", "2020-06-16", "AddEntriesToAcl", "alb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getAclId() {
		return this.aclId;
	}

	public void setAclId(String aclId) {
		this.aclId = aclId;
		if(aclId != null){
			putQueryParameter("AclId", aclId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public List<AclEntries> getAclEntries() {
		return this.aclEntries;
	}

	public void setAclEntries(List<AclEntries> aclEntries) {
		this.aclEntries = aclEntries;	
		if (aclEntries != null) {
			for (int depth1 = 0; depth1 < aclEntries.size(); depth1++) {
				if (aclEntries.get(depth1) != null) {
					
						putQueryParameter("AclEntries." + (depth1 + 1) + ".Entry" , aclEntries.get(depth1).getEntry());
						putQueryParameter("AclEntries." + (depth1 + 1) + ".Description" , aclEntries.get(depth1).getDescription());
				}
			}
		}	
	}

	public static class AclEntries {

		private String entry;

		private String description;

		public String getEntry() {
			return this.entry;
		}

		public void setEntry(String entry) {
			this.entry = entry;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public Class<AddEntriesToAclResponse> getResponseClass() {
		return AddEntriesToAclResponse.class;
	}

}
