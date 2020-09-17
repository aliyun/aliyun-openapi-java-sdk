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
public class QueryCasDatabaseSpecRequest extends RpcAcsRequest<QueryCasDatabaseSpecResponse> {
	   

	private Long maxMaxConnections;

	private Long maxMemory;

	private Long minMaxIops;

	private Long maxCpu;

	private List<String> engineVersionsRepeatLists;

	private List<String> enginesRepeatLists;

	private Boolean enable;

	private Long minMaxConnections;

	private Long pageSize;

	private List<String> iaasIdsRepeatLists;

	private Long currentPage;

	private Long minCpu;

	private Long maxMaxIops;

	private List<String> iaasTypesRepeatLists;

	private Boolean customStorage;

	private List<String> idsRepeatLists;

	private List<String> typesRepeatLists;

	private Long minMemory;

	private List<String> providerIdsRepeatLists;
	public QueryCasDatabaseSpecRequest() {
		super("SOFA", "2019-08-15", "QueryCasDatabaseSpec", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getMaxMaxConnections() {
		return this.maxMaxConnections;
	}

	public void setMaxMaxConnections(Long maxMaxConnections) {
		this.maxMaxConnections = maxMaxConnections;
		if(maxMaxConnections != null){
			putBodyParameter("MaxMaxConnections", maxMaxConnections.toString());
		}
	}

	public Long getMaxMemory() {
		return this.maxMemory;
	}

	public void setMaxMemory(Long maxMemory) {
		this.maxMemory = maxMemory;
		if(maxMemory != null){
			putBodyParameter("MaxMemory", maxMemory.toString());
		}
	}

	public Long getMinMaxIops() {
		return this.minMaxIops;
	}

	public void setMinMaxIops(Long minMaxIops) {
		this.minMaxIops = minMaxIops;
		if(minMaxIops != null){
			putBodyParameter("MinMaxIops", minMaxIops.toString());
		}
	}

	public Long getMaxCpu() {
		return this.maxCpu;
	}

	public void setMaxCpu(Long maxCpu) {
		this.maxCpu = maxCpu;
		if(maxCpu != null){
			putBodyParameter("MaxCpu", maxCpu.toString());
		}
	}

	public List<String> getEngineVersionsRepeatLists() {
		return this.engineVersionsRepeatLists;
	}

	public void setEngineVersionsRepeatLists(List<String> engineVersionsRepeatLists) {
		this.engineVersionsRepeatLists = engineVersionsRepeatLists;	
		if (engineVersionsRepeatLists != null) {
			for (int i = 0; i < engineVersionsRepeatLists.size(); i++) {
				putBodyParameter("EngineVersionsRepeatList." + (i + 1) , engineVersionsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getEnginesRepeatLists() {
		return this.enginesRepeatLists;
	}

	public void setEnginesRepeatLists(List<String> enginesRepeatLists) {
		this.enginesRepeatLists = enginesRepeatLists;	
		if (enginesRepeatLists != null) {
			for (int i = 0; i < enginesRepeatLists.size(); i++) {
				putBodyParameter("EnginesRepeatList." + (i + 1) , enginesRepeatLists.get(i));
			}
		}	
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
		if(enable != null){
			putBodyParameter("Enable", enable.toString());
		}
	}

	public Long getMinMaxConnections() {
		return this.minMaxConnections;
	}

	public void setMinMaxConnections(Long minMaxConnections) {
		this.minMaxConnections = minMaxConnections;
		if(minMaxConnections != null){
			putBodyParameter("MinMaxConnections", minMaxConnections.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public List<String> getIaasIdsRepeatLists() {
		return this.iaasIdsRepeatLists;
	}

	public void setIaasIdsRepeatLists(List<String> iaasIdsRepeatLists) {
		this.iaasIdsRepeatLists = iaasIdsRepeatLists;	
		if (iaasIdsRepeatLists != null) {
			for (int i = 0; i < iaasIdsRepeatLists.size(); i++) {
				putBodyParameter("IaasIdsRepeatList." + (i + 1) , iaasIdsRepeatLists.get(i));
			}
		}	
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public Long getMinCpu() {
		return this.minCpu;
	}

	public void setMinCpu(Long minCpu) {
		this.minCpu = minCpu;
		if(minCpu != null){
			putBodyParameter("MinCpu", minCpu.toString());
		}
	}

	public Long getMaxMaxIops() {
		return this.maxMaxIops;
	}

	public void setMaxMaxIops(Long maxMaxIops) {
		this.maxMaxIops = maxMaxIops;
		if(maxMaxIops != null){
			putBodyParameter("MaxMaxIops", maxMaxIops.toString());
		}
	}

	public List<String> getIaasTypesRepeatLists() {
		return this.iaasTypesRepeatLists;
	}

	public void setIaasTypesRepeatLists(List<String> iaasTypesRepeatLists) {
		this.iaasTypesRepeatLists = iaasTypesRepeatLists;	
		if (iaasTypesRepeatLists != null) {
			for (int i = 0; i < iaasTypesRepeatLists.size(); i++) {
				putBodyParameter("IaasTypesRepeatList." + (i + 1) , iaasTypesRepeatLists.get(i));
			}
		}	
	}

	public Boolean getCustomStorage() {
		return this.customStorage;
	}

	public void setCustomStorage(Boolean customStorage) {
		this.customStorage = customStorage;
		if(customStorage != null){
			putBodyParameter("CustomStorage", customStorage.toString());
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

	public List<String> getTypesRepeatLists() {
		return this.typesRepeatLists;
	}

	public void setTypesRepeatLists(List<String> typesRepeatLists) {
		this.typesRepeatLists = typesRepeatLists;	
		if (typesRepeatLists != null) {
			for (int i = 0; i < typesRepeatLists.size(); i++) {
				putBodyParameter("TypesRepeatList." + (i + 1) , typesRepeatLists.get(i));
			}
		}	
	}

	public Long getMinMemory() {
		return this.minMemory;
	}

	public void setMinMemory(Long minMemory) {
		this.minMemory = minMemory;
		if(minMemory != null){
			putBodyParameter("MinMemory", minMemory.toString());
		}
	}

	public List<String> getProviderIdsRepeatLists() {
		return this.providerIdsRepeatLists;
	}

	public void setProviderIdsRepeatLists(List<String> providerIdsRepeatLists) {
		this.providerIdsRepeatLists = providerIdsRepeatLists;	
		if (providerIdsRepeatLists != null) {
			for (int i = 0; i < providerIdsRepeatLists.size(); i++) {
				putBodyParameter("ProviderIdsRepeatList." + (i + 1) , providerIdsRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<QueryCasDatabaseSpecResponse> getResponseClass() {
		return QueryCasDatabaseSpecResponse.class;
	}

}
