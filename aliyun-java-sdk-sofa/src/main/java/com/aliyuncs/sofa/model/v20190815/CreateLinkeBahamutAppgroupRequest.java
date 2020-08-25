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
public class CreateLinkeBahamutAppgroupRequest extends RpcAcsRequest<CreateLinkeBahamutAppgroupResponse> {
	   

	private String remark;

	private String type;

	private String id;

	private List<String> adminsRepeatLists;

	private List<String> appListRepeatLists;

	private String bahamutTenant;

	private String name;
	public CreateLinkeBahamutAppgroupRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeBahamutAppgroup", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putBodyParameter("Remark", remark);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
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

	public List<String> getAdminsRepeatLists() {
		return this.adminsRepeatLists;
	}

	public void setAdminsRepeatLists(List<String> adminsRepeatLists) {
		this.adminsRepeatLists = adminsRepeatLists;	
		if (adminsRepeatLists != null) {
			for (int i = 0; i < adminsRepeatLists.size(); i++) {
				putBodyParameter("AdminsRepeatList." + (i + 1) , adminsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getAppListRepeatLists() {
		return this.appListRepeatLists;
	}

	public void setAppListRepeatLists(List<String> appListRepeatLists) {
		this.appListRepeatLists = appListRepeatLists;	
		if (appListRepeatLists != null) {
			for (int i = 0; i < appListRepeatLists.size(); i++) {
				putBodyParameter("AppListRepeatList." + (i + 1) , appListRepeatLists.get(i));
			}
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	@Override
	public Class<CreateLinkeBahamutAppgroupResponse> getResponseClass() {
		return CreateLinkeBahamutAppgroupResponse.class;
	}

}
