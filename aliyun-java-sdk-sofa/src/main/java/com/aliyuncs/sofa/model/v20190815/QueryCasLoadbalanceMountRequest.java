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
public class QueryCasLoadbalanceMountRequest extends RpcAcsRequest<QueryCasLoadbalanceMountResponse> {
	   

	private String workspace;

	private List<String> loadbalanceIdsRepeatLists;

	private Boolean mounted;

	private List<String> domainsRepeatLists;
	public QueryCasLoadbalanceMountRequest() {
		super("SOFA", "2019-08-15", "QueryCasLoadbalanceMount", "sofa");
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

	public List<String> getLoadbalanceIdsRepeatLists() {
		return this.loadbalanceIdsRepeatLists;
	}

	public void setLoadbalanceIdsRepeatLists(List<String> loadbalanceIdsRepeatLists) {
		this.loadbalanceIdsRepeatLists = loadbalanceIdsRepeatLists;	
		if (loadbalanceIdsRepeatLists != null) {
			for (int i = 0; i < loadbalanceIdsRepeatLists.size(); i++) {
				putBodyParameter("LoadbalanceIdsRepeatList." + (i + 1) , loadbalanceIdsRepeatLists.get(i));
			}
		}	
	}

	public Boolean getMounted() {
		return this.mounted;
	}

	public void setMounted(Boolean mounted) {
		this.mounted = mounted;
		if(mounted != null){
			putBodyParameter("Mounted", mounted.toString());
		}
	}

	public List<String> getDomainsRepeatLists() {
		return this.domainsRepeatLists;
	}

	public void setDomainsRepeatLists(List<String> domainsRepeatLists) {
		this.domainsRepeatLists = domainsRepeatLists;	
		if (domainsRepeatLists != null) {
			for (int i = 0; i < domainsRepeatLists.size(); i++) {
				putBodyParameter("DomainsRepeatList." + (i + 1) , domainsRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<QueryCasLoadbalanceMountResponse> getResponseClass() {
		return QueryCasLoadbalanceMountResponse.class;
	}

}
