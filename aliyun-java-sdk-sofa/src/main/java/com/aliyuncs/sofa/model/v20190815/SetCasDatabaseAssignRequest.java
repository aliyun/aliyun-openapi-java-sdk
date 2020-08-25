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
public class SetCasDatabaseAssignRequest extends RpcAcsRequest<SetCasDatabaseAssignResponse> {
	   

	private String workspace;

	private List<String> appServiceIdsRepeatLists;

	private List<String> appIdsRepeatLists;

	private List<String> idsRepeatLists;
	public SetCasDatabaseAssignRequest() {
		super("SOFA", "2019-08-15", "SetCasDatabaseAssign", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putBodyParameter("Workspace", workspace);
		}
	}

	public List<String> getAppServiceIdsRepeatLists() {
		return this.appServiceIdsRepeatLists;
	}

	public void setAppServiceIdsRepeatLists(List<String> appServiceIdsRepeatLists) {
		this.appServiceIdsRepeatLists = appServiceIdsRepeatLists;	
		if (appServiceIdsRepeatLists != null) {
			for (int i = 0; i < appServiceIdsRepeatLists.size(); i++) {
				putBodyParameter("AppServiceIdsRepeatList." + (i + 1) , appServiceIdsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getAppIdsRepeatLists() {
		return this.appIdsRepeatLists;
	}

	public void setAppIdsRepeatLists(List<String> appIdsRepeatLists) {
		this.appIdsRepeatLists = appIdsRepeatLists;	
		if (appIdsRepeatLists != null) {
			for (int i = 0; i < appIdsRepeatLists.size(); i++) {
				putBodyParameter("AppIdsRepeatList." + (i + 1) , appIdsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getIdsRepeatLists() {
		return this.idsRepeatLists;
	}

	public void setIdsRepeatLists(List<String> idsRepeatLists) {
		this.idsRepeatLists = idsRepeatLists;	
		if (idsRepeatLists != null) {
			for (int i = 0; i < idsRepeatLists.size(); i++) {
				putBodyParameter("IdsRepeatList." + (i + 1) , idsRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<SetCasDatabaseAssignResponse> getResponseClass() {
		return SetCasDatabaseAssignResponse.class;
	}

}
