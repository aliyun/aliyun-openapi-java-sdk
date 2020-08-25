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
public class QueryCasLoadbalanceListenerRequest extends RpcAcsRequest<QueryCasLoadbalanceListenerResponse> {
	   

	private String workspace;

	private List<String> certificateIaasIdsRepeatLists;

	private List<String> gmCryptoCertIaasIdsRepeatLists;

	private List<Long> listenerPortsRepeatLists;

	private Long pageSize;

	private List<String> gmSignCertIaasIdsRepeatLists;

	private List<String> vComputerGroupIdsRepeatLists;

	private Long currentPage;

	private List<String> loadBalancerIdsRepeatLists;

	private List<String> certificateIdsRepeatLists;

	private List<Long> backendServerPortsRepeatLists;

	private List<String> typesRepeatLists;
	public QueryCasLoadbalanceListenerRequest() {
		super("SOFA", "2019-08-15", "QueryCasLoadbalanceListener", "sofa");
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

	public List<String> getCertificateIaasIdsRepeatLists() {
		return this.certificateIaasIdsRepeatLists;
	}

	public void setCertificateIaasIdsRepeatLists(List<String> certificateIaasIdsRepeatLists) {
		this.certificateIaasIdsRepeatLists = certificateIaasIdsRepeatLists;	
		if (certificateIaasIdsRepeatLists != null) {
			for (int i = 0; i < certificateIaasIdsRepeatLists.size(); i++) {
				putBodyParameter("CertificateIaasIdsRepeatList." + (i + 1) , certificateIaasIdsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getGmCryptoCertIaasIdsRepeatLists() {
		return this.gmCryptoCertIaasIdsRepeatLists;
	}

	public void setGmCryptoCertIaasIdsRepeatLists(List<String> gmCryptoCertIaasIdsRepeatLists) {
		this.gmCryptoCertIaasIdsRepeatLists = gmCryptoCertIaasIdsRepeatLists;	
		if (gmCryptoCertIaasIdsRepeatLists != null) {
			for (int i = 0; i < gmCryptoCertIaasIdsRepeatLists.size(); i++) {
				putBodyParameter("GmCryptoCertIaasIdsRepeatList." + (i + 1) , gmCryptoCertIaasIdsRepeatLists.get(i));
			}
		}	
	}

	public List<Long> getListenerPortsRepeatLists() {
		return this.listenerPortsRepeatLists;
	}

	public void setListenerPortsRepeatLists(List<Long> listenerPortsRepeatLists) {
		this.listenerPortsRepeatLists = listenerPortsRepeatLists;	
		if (listenerPortsRepeatLists != null) {
			for (int i = 0; i < listenerPortsRepeatLists.size(); i++) {
				putBodyParameter("ListenerPortsRepeatList." + (i + 1) , listenerPortsRepeatLists.get(i));
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

	public List<String> getGmSignCertIaasIdsRepeatLists() {
		return this.gmSignCertIaasIdsRepeatLists;
	}

	public void setGmSignCertIaasIdsRepeatLists(List<String> gmSignCertIaasIdsRepeatLists) {
		this.gmSignCertIaasIdsRepeatLists = gmSignCertIaasIdsRepeatLists;	
		if (gmSignCertIaasIdsRepeatLists != null) {
			for (int i = 0; i < gmSignCertIaasIdsRepeatLists.size(); i++) {
				putBodyParameter("GmSignCertIaasIdsRepeatList." + (i + 1) , gmSignCertIaasIdsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getVComputerGroupIdsRepeatLists() {
		return this.vComputerGroupIdsRepeatLists;
	}

	public void setVComputerGroupIdsRepeatLists(List<String> vComputerGroupIdsRepeatLists) {
		this.vComputerGroupIdsRepeatLists = vComputerGroupIdsRepeatLists;	
		if (vComputerGroupIdsRepeatLists != null) {
			for (int i = 0; i < vComputerGroupIdsRepeatLists.size(); i++) {
				putBodyParameter("VComputerGroupIdsRepeatList." + (i + 1) , vComputerGroupIdsRepeatLists.get(i));
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

	public List<String> getLoadBalancerIdsRepeatLists() {
		return this.loadBalancerIdsRepeatLists;
	}

	public void setLoadBalancerIdsRepeatLists(List<String> loadBalancerIdsRepeatLists) {
		this.loadBalancerIdsRepeatLists = loadBalancerIdsRepeatLists;	
		if (loadBalancerIdsRepeatLists != null) {
			for (int i = 0; i < loadBalancerIdsRepeatLists.size(); i++) {
				putBodyParameter("LoadBalancerIdsRepeatList." + (i + 1) , loadBalancerIdsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getCertificateIdsRepeatLists() {
		return this.certificateIdsRepeatLists;
	}

	public void setCertificateIdsRepeatLists(List<String> certificateIdsRepeatLists) {
		this.certificateIdsRepeatLists = certificateIdsRepeatLists;	
		if (certificateIdsRepeatLists != null) {
			for (int i = 0; i < certificateIdsRepeatLists.size(); i++) {
				putBodyParameter("CertificateIdsRepeatList." + (i + 1) , certificateIdsRepeatLists.get(i));
			}
		}	
	}

	public List<Long> getBackendServerPortsRepeatLists() {
		return this.backendServerPortsRepeatLists;
	}

	public void setBackendServerPortsRepeatLists(List<Long> backendServerPortsRepeatLists) {
		this.backendServerPortsRepeatLists = backendServerPortsRepeatLists;	
		if (backendServerPortsRepeatLists != null) {
			for (int i = 0; i < backendServerPortsRepeatLists.size(); i++) {
				putBodyParameter("BackendServerPortsRepeatList." + (i + 1) , backendServerPortsRepeatLists.get(i));
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

	@Override
	public Class<QueryCasLoadbalanceListenerResponse> getResponseClass() {
		return QueryCasLoadbalanceListenerResponse.class;
	}

}
