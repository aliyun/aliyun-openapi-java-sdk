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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAclRequest extends RpcAcsRequest<CreateAclResponse> {
	   

	private Boolean dryRun;

	private String aclName;

	private String clientToken;

	private List<AclEntries> aclEntriess;

	private String addressIPVersion;
	public CreateAclRequest() {
		super("Ga", "2019-11-20", "CreateAcl", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getAclName() {
		return this.aclName;
	}

	public void setAclName(String aclName) {
		this.aclName = aclName;
		if(aclName != null){
			putQueryParameter("AclName", aclName);
		}
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

	public List<AclEntries> getAclEntriess() {
		return this.aclEntriess;
	}

	public void setAclEntriess(List<AclEntries> aclEntriess) {
		this.aclEntriess = aclEntriess;	
		if (aclEntriess != null) {
			for (int depth1 = 0; depth1 < aclEntriess.size(); depth1++) {
				putQueryParameter("AclEntries." + (depth1 + 1) + ".Entry" , aclEntriess.get(depth1).getEntry());
				putQueryParameter("AclEntries." + (depth1 + 1) + ".EntryDescription" , aclEntriess.get(depth1).getEntryDescription());
			}
		}	
	}

	public String getAddressIPVersion() {
		return this.addressIPVersion;
	}

	public void setAddressIPVersion(String addressIPVersion) {
		this.addressIPVersion = addressIPVersion;
		if(addressIPVersion != null){
			putQueryParameter("AddressIPVersion", addressIPVersion);
		}
	}

	public static class AclEntries {

		private String entry;

		private String entryDescription;

		public String getEntry() {
			return this.entry;
		}

		public void setEntry(String entry) {
			this.entry = entry;
		}

		public String getEntryDescription() {
			return this.entryDescription;
		}

		public void setEntryDescription(String entryDescription) {
			this.entryDescription = entryDescription;
		}
	}

	@Override
	public Class<CreateAclResponse> getResponseClass() {
		return CreateAclResponse.class;
	}

}
