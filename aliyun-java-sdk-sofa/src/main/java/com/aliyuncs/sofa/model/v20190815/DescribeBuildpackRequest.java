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

	private List<String> createdFromsRepeatLists;

	private String publicationTimeTo;

	private String creationTimeFrom;

	private String publicationTimeFrom;

	private String creationTimeTo;

	private Long pageSize;

	private Boolean descend;

	private List<String> creatorIdsRepeatLists;

	private List<Long> supportedOsIdsRepeatLists;

	private List<Long> techstackIdsRepeatLists;

	private String modificationTimeFrom;

	private List<String> supportedRegionIdsRepeatLists;

	private Long currentPage;

	private String fullVersion;

	private Boolean isProcessed;

	private String modificationTimeTo;

	private List<String> publisherIdsRepeatLists;

	private List<String> idsRepeatLists;

	private String sortField;

	private String buildCommand;

	private List<String> statusesRepeatLists;
	public DescribeBuildpackRequest() {
		super("SOFA", "2019-08-15", "DescribeBuildpack", "sofacafedeps");
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

	public List<String> getCreatedFromsRepeatLists() {
		return this.createdFromsRepeatLists;
	}

	public void setCreatedFromsRepeatLists(List<String> createdFromsRepeatLists) {
		this.createdFromsRepeatLists = createdFromsRepeatLists;	
		if (createdFromsRepeatLists != null) {
			for (int i = 0; i < createdFromsRepeatLists.size(); i++) {
				putBodyParameter("CreatedFromsRepeatList." + (i + 1) , createdFromsRepeatLists.get(i));
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

	public String getCreationTimeFrom() {
		return this.creationTimeFrom;
	}

	public void setCreationTimeFrom(String creationTimeFrom) {
		this.creationTimeFrom = creationTimeFrom;
		if(creationTimeFrom != null){
			putBodyParameter("CreationTimeFrom", creationTimeFrom);
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

	public String getCreationTimeTo() {
		return this.creationTimeTo;
	}

	public void setCreationTimeTo(String creationTimeTo) {
		this.creationTimeTo = creationTimeTo;
		if(creationTimeTo != null){
			putBodyParameter("CreationTimeTo", creationTimeTo);
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

	public Boolean getDescend() {
		return this.descend;
	}

	public void setDescend(Boolean descend) {
		this.descend = descend;
		if(descend != null){
			putBodyParameter("Descend", descend.toString());
		}
	}

	public List<String> getCreatorIdsRepeatLists() {
		return this.creatorIdsRepeatLists;
	}

	public void setCreatorIdsRepeatLists(List<String> creatorIdsRepeatLists) {
		this.creatorIdsRepeatLists = creatorIdsRepeatLists;	
		if (creatorIdsRepeatLists != null) {
			for (int i = 0; i < creatorIdsRepeatLists.size(); i++) {
				putBodyParameter("CreatorIdsRepeatList." + (i + 1) , creatorIdsRepeatLists.get(i));
			}
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

	public String getModificationTimeFrom() {
		return this.modificationTimeFrom;
	}

	public void setModificationTimeFrom(String modificationTimeFrom) {
		this.modificationTimeFrom = modificationTimeFrom;
		if(modificationTimeFrom != null){
			putBodyParameter("ModificationTimeFrom", modificationTimeFrom);
		}
	}

	public List<String> getSupportedRegionIdsRepeatLists() {
		return this.supportedRegionIdsRepeatLists;
	}

	public void setSupportedRegionIdsRepeatLists(List<String> supportedRegionIdsRepeatLists) {
		this.supportedRegionIdsRepeatLists = supportedRegionIdsRepeatLists;	
		if (supportedRegionIdsRepeatLists != null) {
			for (int i = 0; i < supportedRegionIdsRepeatLists.size(); i++) {
				putBodyParameter("SupportedRegionIdsRepeatList." + (i + 1) , supportedRegionIdsRepeatLists.get(i));
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

	public Boolean getIsProcessed() {
		return this.isProcessed;
	}

	public void setIsProcessed(Boolean isProcessed) {
		this.isProcessed = isProcessed;
		if(isProcessed != null){
			putBodyParameter("IsProcessed", isProcessed.toString());
		}
	}

	public String getModificationTimeTo() {
		return this.modificationTimeTo;
	}

	public void setModificationTimeTo(String modificationTimeTo) {
		this.modificationTimeTo = modificationTimeTo;
		if(modificationTimeTo != null){
			putBodyParameter("ModificationTimeTo", modificationTimeTo);
		}
	}

	public List<String> getPublisherIdsRepeatLists() {
		return this.publisherIdsRepeatLists;
	}

	public void setPublisherIdsRepeatLists(List<String> publisherIdsRepeatLists) {
		this.publisherIdsRepeatLists = publisherIdsRepeatLists;	
		if (publisherIdsRepeatLists != null) {
			for (int i = 0; i < publisherIdsRepeatLists.size(); i++) {
				putBodyParameter("PublisherIdsRepeatList." + (i + 1) , publisherIdsRepeatLists.get(i));
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

	public String getSortField() {
		return this.sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
		if(sortField != null){
			putBodyParameter("SortField", sortField);
		}
	}

	public String getBuildCommand() {
		return this.buildCommand;
	}

	public void setBuildCommand(String buildCommand) {
		this.buildCommand = buildCommand;
		if(buildCommand != null){
			putBodyParameter("BuildCommand", buildCommand);
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
