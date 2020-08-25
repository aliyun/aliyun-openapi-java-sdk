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
public class QueryCasLoadbalanceRequest extends RpcAcsRequest<QueryCasLoadbalanceResponse> {
	   

	private String workspace;

	private String networkType;

	private List<String> vipAddressesRepeatLists;

	private List<String> clusterIdsRepeatLists;

	private Long pageSize;

	private String vipAddressType;

	private List<String> iaasIdsRepeatLists;

	private Boolean clusterMode;

	private List<String> vswitchIaasIdsRepeatLists;

	private List<String> healthLevelsRepeatLists;

	private List<String> appServiceIdsRepeatLists;

	private List<String> appIdsRepeatLists;

	private Long currentPage;

	private List<String> vpcIdsRepeatLists;

	private List<String> domainsRepeatLists;

	private String name;

	private String vipType;

	private Boolean shareMode;

	private List<String> statusesRepeatLists;
	public QueryCasLoadbalanceRequest() {
		super("SOFA", "2019-08-15", "QueryCasLoadbalance", "sofa");
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

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putBodyParameter("NetworkType", networkType);
		}
	}

	public List<String> getVipAddressesRepeatLists() {
		return this.vipAddressesRepeatLists;
	}

	public void setVipAddressesRepeatLists(List<String> vipAddressesRepeatLists) {
		this.vipAddressesRepeatLists = vipAddressesRepeatLists;	
		if (vipAddressesRepeatLists != null) {
			for (int i = 0; i < vipAddressesRepeatLists.size(); i++) {
				putBodyParameter("VipAddressesRepeatList." + (i + 1) , vipAddressesRepeatLists.get(i));
			}
		}	
	}

	public List<String> getClusterIdsRepeatLists() {
		return this.clusterIdsRepeatLists;
	}

	public void setClusterIdsRepeatLists(List<String> clusterIdsRepeatLists) {
		this.clusterIdsRepeatLists = clusterIdsRepeatLists;	
		if (clusterIdsRepeatLists != null) {
			for (int i = 0; i < clusterIdsRepeatLists.size(); i++) {
				putBodyParameter("ClusterIdsRepeatList." + (i + 1) , clusterIdsRepeatLists.get(i));
			}
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

	public String getVipAddressType() {
		return this.vipAddressType;
	}

	public void setVipAddressType(String vipAddressType) {
		this.vipAddressType = vipAddressType;
		if(vipAddressType != null){
			putBodyParameter("VipAddressType", vipAddressType);
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

	public Boolean getClusterMode() {
		return this.clusterMode;
	}

	public void setClusterMode(Boolean clusterMode) {
		this.clusterMode = clusterMode;
		if(clusterMode != null){
			putBodyParameter("ClusterMode", clusterMode.toString());
		}
	}

	public List<String> getVswitchIaasIdsRepeatLists() {
		return this.vswitchIaasIdsRepeatLists;
	}

	public void setVswitchIaasIdsRepeatLists(List<String> vswitchIaasIdsRepeatLists) {
		this.vswitchIaasIdsRepeatLists = vswitchIaasIdsRepeatLists;	
		if (vswitchIaasIdsRepeatLists != null) {
			for (int i = 0; i < vswitchIaasIdsRepeatLists.size(); i++) {
				putBodyParameter("VswitchIaasIdsRepeatList." + (i + 1) , vswitchIaasIdsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getHealthLevelsRepeatLists() {
		return this.healthLevelsRepeatLists;
	}

	public void setHealthLevelsRepeatLists(List<String> healthLevelsRepeatLists) {
		this.healthLevelsRepeatLists = healthLevelsRepeatLists;	
		if (healthLevelsRepeatLists != null) {
			for (int i = 0; i < healthLevelsRepeatLists.size(); i++) {
				putBodyParameter("HealthLevelsRepeatList." + (i + 1) , healthLevelsRepeatLists.get(i));
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

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getVipType() {
		return this.vipType;
	}

	public void setVipType(String vipType) {
		this.vipType = vipType;
		if(vipType != null){
			putBodyParameter("VipType", vipType);
		}
	}

	public Boolean getShareMode() {
		return this.shareMode;
	}

	public void setShareMode(Boolean shareMode) {
		this.shareMode = shareMode;
		if(shareMode != null){
			putBodyParameter("ShareMode", shareMode.toString());
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

	@Override
	public Class<QueryCasLoadbalanceResponse> getResponseClass() {
		return QueryCasLoadbalanceResponse.class;
	}

}
