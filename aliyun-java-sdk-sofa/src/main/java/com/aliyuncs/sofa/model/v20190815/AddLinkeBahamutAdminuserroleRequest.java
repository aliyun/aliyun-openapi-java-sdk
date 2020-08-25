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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddLinkeBahamutAdminuserroleRequest extends RpcAcsRequest<AddLinkeBahamutAdminuserroleResponse> {
	   

	private String role;

	private String id;

	private Long created;

	private Boolean deleted;

	private Long lastModified;

	private String bahamutTenant;

	private String account;
	public AddLinkeBahamutAdminuserroleRequest() {
		super("SOFA", "2019-08-15", "AddLinkeBahamutAdminuserrole", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
		if(role != null){
			putBodyParameter("Role", role);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public Long getCreated() {
		return this.created;
	}

	public void setCreated(Long created) {
		this.created = created;
		if(created != null){
			putBodyParameter("Created", created.toString());
		}
	}

	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
		if(deleted != null){
			putBodyParameter("Deleted", deleted.toString());
		}
	}

	public Long getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Long lastModified) {
		this.lastModified = lastModified;
		if(lastModified != null){
			putBodyParameter("LastModified", lastModified.toString());
		}
	}

	public String getBahamutTenant() {
		return this.bahamutTenant;
	}

	public void setBahamutTenant(String bahamutTenant) {
		this.bahamutTenant = bahamutTenant;
		if(bahamutTenant != null){
			putBodyParameter("BahamutTenant", bahamutTenant);
		}
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
		if(account != null){
			putBodyParameter("Account", account);
		}
	}

	@Override
	public Class<AddLinkeBahamutAdminuserroleResponse> getResponseClass() {
		return AddLinkeBahamutAdminuserroleResponse.class;
	}

}
