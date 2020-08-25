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
public class QueryCasDatabaseRequest extends RpcAcsRequest<QueryCasDatabaseResponse> {
	   

	private Long minMaxIops;

	private String networkType;

	private Long minStorage;

	private List<String> appIdsRepeatLists;

	private Long minPort;

	private List<String> vpcIdsRepeatLists;

	private Long maxMaxIops;

	private String netType;

	private Boolean includeShared;

	private String name;

	private Long maxPort;

	private List<String> workspaceIdsRepeatLists;

	private List<String> statusesRepeatLists;

	private Long maxMaxConnections;

	private List<String> connectionAddressesRepeatLists;

	private Long maxMemory;

	private Long maxCpu;

	private List<String> engineVersionsRepeatLists;

	private List<String> enginesRepeatLists;

	private Long minMaxConnections;

	private Long pageSize;

	private List<String> masterIdsRepeatLists;

	private List<String> vSwitchIaasIdsRepeatLists;

	private List<String> appServiceIdsRepeatLists;

	private Long maxStorage;

	private List<String> specIaasIdsRepeatLists;

	private Long currentPage;

	private Long minCpu;

	private List<String> typesRepeatLists;

	private Long minMemory;
	public QueryCasDatabaseRequest() {
		super("SOFA", "2019-08-15", "QueryCasDatabase", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putBodyParameter("NetworkType", networkType);
		}
	}

	public Long getMinStorage() {
		return this.minStorage;
	}

	public void setMinStorage(Long minStorage) {
		this.minStorage = minStorage;
		if(minStorage != null){
			putBodyParameter("MinStorage", minStorage.toString());
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

	public Long getMinPort() {
		return this.minPort;
	}

	public void setMinPort(Long minPort) {
		this.minPort = minPort;
		if(minPort != null){
			putBodyParameter("MinPort", minPort.toString());
		}
	}

	public List<String> getVpcIdsRepeatLists() {
		return this.vpcIdsRepeatLists;
	}

	public void setVpcIdsRepeatLists(List<String> vpcIdsRepeatLists) {
		this.vpcIdsRepeatLists = vpcIdsRepeatLists;	
		if (vpcIdsRepeatLists != null) {
			for (int i = 0; i < vpcIdsRepeatLists.size(); i++) {
				putBodyParameter("VpcIdsRepeatList." + (i + 1) , vpcIdsRepeatLists.get(i));
			}
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

	public String getNetType() {
		return this.netType;
	}

	public void setNetType(String netType) {
		this.netType = netType;
		if(netType != null){
			putBodyParameter("NetType", netType);
		}
	}

	public Boolean getIncludeShared() {
		return this.includeShared;
	}

	public void setIncludeShared(Boolean includeShared) {
		this.includeShared = includeShared;
		if(includeShared != null){
			putBodyParameter("IncludeShared", includeShared.toString());
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

	public Long getMaxPort() {
		return this.maxPort;
	}

	public void setMaxPort(Long maxPort) {
		this.maxPort = maxPort;
		if(maxPort != null){
			putBodyParameter("MaxPort", maxPort.toString());
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

	public List<String> getStatusesRepeatLists() {
		return this.statusesRepeatLists;
	}

	public void setStatusesRepeatLists(List<String> statusesRepeatLists) {
		this.statusesRepeatLists = statusesRepeatLists;	
		if (statusesRepeatLists != null) {
			for (int i = 0; i < statusesRepeatLists.size(); i++) {
				putBodyParameter("StatusesRepeatList." + (i + 1) , statusesRepeatLists.get(i));
			}
		}	
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

	public List<String> getConnectionAddressesRepeatLists() {
		return this.connectionAddressesRepeatLists;
	}

	public void setConnectionAddressesRepeatLists(List<String> connectionAddressesRepeatLists) {
		this.connectionAddressesRepeatLists = connectionAddressesRepeatLists;	
		if (connectionAddressesRepeatLists != null) {
			for (int i = 0; i < connectionAddressesRepeatLists.size(); i++) {
				putBodyParameter("ConnectionAddressesRepeatList." + (i + 1) , connectionAddressesRepeatLists.get(i));
			}
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

	public List<String> getMasterIdsRepeatLists() {
		return this.masterIdsRepeatLists;
	}

	public void setMasterIdsRepeatLists(List<String> masterIdsRepeatLists) {
		this.masterIdsRepeatLists = masterIdsRepeatLists;	
		if (masterIdsRepeatLists != null) {
			for (int i = 0; i < masterIdsRepeatLists.size(); i++) {
				putBodyParameter("MasterIdsRepeatList." + (i + 1) , masterIdsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getVSwitchIaasIdsRepeatLists() {
		return this.vSwitchIaasIdsRepeatLists;
	}

	public void setVSwitchIaasIdsRepeatLists(List<String> vSwitchIaasIdsRepeatLists) {
		this.vSwitchIaasIdsRepeatLists = vSwitchIaasIdsRepeatLists;	
		if (vSwitchIaasIdsRepeatLists != null) {
			for (int i = 0; i < vSwitchIaasIdsRepeatLists.size(); i++) {
				putBodyParameter("VSwitchIaasIdsRepeatList." + (i + 1) , vSwitchIaasIdsRepeatLists.get(i));
			}
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

	public Long getMaxStorage() {
		return this.maxStorage;
	}

	public void setMaxStorage(Long maxStorage) {
		this.maxStorage = maxStorage;
		if(maxStorage != null){
			putBodyParameter("MaxStorage", maxStorage.toString());
		}
	}

	public List<String> getSpecIaasIdsRepeatLists() {
		return this.specIaasIdsRepeatLists;
	}

	public void setSpecIaasIdsRepeatLists(List<String> specIaasIdsRepeatLists) {
		this.specIaasIdsRepeatLists = specIaasIdsRepeatLists;	
		if (specIaasIdsRepeatLists != null) {
			for (int i = 0; i < specIaasIdsRepeatLists.size(); i++) {
				putBodyParameter("SpecIaasIdsRepeatList." + (i + 1) , specIaasIdsRepeatLists.get(i));
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

	@Override
	public Class<QueryCasDatabaseResponse> getResponseClass() {
		return QueryCasDatabaseResponse.class;
	}

}
