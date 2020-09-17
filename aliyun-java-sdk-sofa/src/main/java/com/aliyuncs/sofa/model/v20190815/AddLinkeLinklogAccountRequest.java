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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddLinkeLinklogAccountRequest extends RpcAcsRequest<AddLinkeLinklogAccountResponse> {
	   

	private Long role;

	private List<Long> storeIdsRepeatLists;

	private String nick;

	private String empId;

	private String roleName;
	public AddLinkeLinklogAccountRequest() {
		super("SOFA", "2019-08-15", "AddLinkeLinklogAccount", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getRole() {
		return this.role;
	}

	public void setRole(Long role) {
		this.role = role;
		if(role != null){
			putBodyParameter("Role", role.toString());
		}
	}

	public List<Long> getStoreIdsRepeatLists() {
		return this.storeIdsRepeatLists;
	}

	public void setStoreIdsRepeatLists(List<Long> storeIdsRepeatLists) {
		this.storeIdsRepeatLists = storeIdsRepeatLists;	
		if (storeIdsRepeatLists != null) {
			for (int i = 0; i < storeIdsRepeatLists.size(); i++) {
				putBodyParameter("StoreIdsRepeatList." + (i + 1) , storeIdsRepeatLists.get(i));
			}
		}	
	}

	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
		if(nick != null){
			putBodyParameter("Nick", nick);
		}
	}

	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
		if(empId != null){
			putBodyParameter("EmpId", empId);
		}
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
		if(roleName != null){
			putBodyParameter("RoleName", roleName);
		}
	}

	@Override
	public Class<AddLinkeLinklogAccountResponse> getResponseClass() {
		return AddLinkeLinklogAccountResponse.class;
	}

}
