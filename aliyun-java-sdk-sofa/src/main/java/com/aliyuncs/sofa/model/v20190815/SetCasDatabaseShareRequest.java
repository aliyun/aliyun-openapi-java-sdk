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
public class SetCasDatabaseShareRequest extends RpcAcsRequest<SetCasDatabaseShareResponse> {
	   

	private List<String> idsRepeatLists;

	private List<String> workspaceIdsRepeatLists;
	public SetCasDatabaseShareRequest() {
		super("SOFA", "2019-08-15", "SetCasDatabaseShare", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getWorkspaceIdsRepeatLists() {
		return this.workspaceIdsRepeatLists;
	}

	public void setWorkspaceIdsRepeatLists(List<String> workspaceIdsRepeatLists) {
		this.workspaceIdsRepeatLists = workspaceIdsRepeatLists;	
		if (workspaceIdsRepeatLists != null) {
			for (int i = 0; i < workspaceIdsRepeatLists.size(); i++) {
				putBodyParameter("WorkspaceIdsRepeatList." + (i + 1) , workspaceIdsRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<SetCasDatabaseShareResponse> getResponseClass() {
		return SetCasDatabaseShareResponse.class;
	}

}
