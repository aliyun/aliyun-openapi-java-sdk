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
public class DescribeBuildpackRequest extends RpcAcsRequest<DescribeBuildpackResponse> {
	   

	private List<String> scopesRepeatLists;

	private List<String> techstackNamesRepeatLists;

	private String publicationTimeTo;

	private String publicationTimeFrom;

	private Long pageSize;

	private List<Long> supportedOsIdsRepeatLists;

	private List<Long> techstackIdsRepeatLists;

	private Long currentPage;

	private String fullVersion;

	private List<String> supportedRegionsRepeatLists;

	private List<String> statusesRepeatLists;
	public DescribeBuildpackRequest() {
		super("SOFA", "2019-08-15", "DescribeBuildpack", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getScopesRepeatLists() {
		return this.scopesRepeatLists;
	}

	public void setScopesRepeatLists(List<String> scopesRepeatLists) {
		this.scopesRepeatLists = scopesRepeatLists;	
		if (scopesRepeatLists != null) {
			for (int i = 0; i < scopesRepeatLists.size(); i++) {
				putBodyParameter("ScopesRepeatList." + (i + 1) , scopesRepeatLists.get(i));
			}
		}	
	}

	public List<String> getTechstackNamesRepeatLists() {
		return this.techstackNamesRepeatLists;
	}

	public void setTechstackNamesRepeatLists(List<String> techstackNamesRepeatLists) {
		this.techstackNamesRepeatLists = techstackNamesRepeatLists;	
		if (techstackNamesRepeatLists != null) {
			for (int i = 0; i < techstackNamesRepeatLists.size(); i++) {
				putBodyParameter("TechstackNamesRepeatList." + (i + 1) , techstackNamesRepeatLists.get(i));
			}
		}	
	}

	public String getPublicationTimeTo() {
		return this.publicationTimeTo;
	}

	public void setPublicationTimeTo(String publicationTimeTo) {
		this.publicationTimeTo = publicationTimeTo;
		if(publicationTimeTo != null){
			putBodyParameter("PublicationTimeTo", publicationTimeTo);
		}
	}

	public String getPublicationTimeFrom() {
		return this.publicationTimeFrom;
	}

	public void setPublicationTimeFrom(String publicationTimeFrom) {
		this.publicationTimeFrom = publicationTimeFrom;
		if(publicationTimeFrom != null){
			putBodyParameter("PublicationTimeFrom", publicationTimeFrom);
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

	public List<Long> getSupportedOsIdsRepeatLists() {
		return this.supportedOsIdsRepeatLists;
	}

	public void setSupportedOsIdsRepeatLists(List<Long> supportedOsIdsRepeatLists) {
		this.supportedOsIdsRepeatLists = supportedOsIdsRepeatLists;	
		if (supportedOsIdsRepeatLists != null) {
			for (int i = 0; i < supportedOsIdsRepeatLists.size(); i++) {
				putBodyParameter("SupportedOsIdsRepeatList." + (i + 1) , supportedOsIdsRepeatLists.get(i));
			}
		}	
	}

	public List<Long> getTechstackIdsRepeatLists() {
		return this.techstackIdsRepeatLists;
	}

	public void setTechstackIdsRepeatLists(List<Long> techstackIdsRepeatLists) {
		this.techstackIdsRepeatLists = techstackIdsRepeatLists;	
		if (techstackIdsRepeatLists != null) {
			for (int i = 0; i < techstackIdsRepeatLists.size(); i++) {
				putBodyParameter("TechstackIdsRepeatList." + (i + 1) , techstackIdsRepeatLists.get(i));
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

	public String getFullVersion() {
		return this.fullVersion;
	}

	public void setFullVersion(String fullVersion) {
		this.fullVersion = fullVersion;
		if(fullVersion != null){
			putBodyParameter("FullVersion", fullVersion);
		}
	}

	public List<String> getSupportedRegionsRepeatLists() {
		return this.supportedRegionsRepeatLists;
	}

	public void setSupportedRegionsRepeatLists(List<String> supportedRegionsRepeatLists) {
		this.supportedRegionsRepeatLists = supportedRegionsRepeatLists;	
		if (supportedRegionsRepeatLists != null) {
			for (int i = 0; i < supportedRegionsRepeatLists.size(); i++) {
				putBodyParameter("SupportedRegionsRepeatList." + (i + 1) , supportedRegionsRepeatLists.get(i));
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

	@Override
	public Class<DescribeBuildpackResponse> getResponseClass() {
		return DescribeBuildpackResponse.class;
	}

}
