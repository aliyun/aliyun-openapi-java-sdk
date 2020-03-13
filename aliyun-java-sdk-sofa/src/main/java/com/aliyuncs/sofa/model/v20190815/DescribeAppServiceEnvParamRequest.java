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
public class DescribeAppServiceEnvParamRequest extends RpcAcsRequest<DescribeAppServiceEnvParamResponse> {
	   

	private List<String> buildpackIdsRepeatLists;

	private String creationTimeFrom;

	private String creationTimeTo;

	private Long pageSize;

	private String value;

	private String key;

	private List<String> appServiceIdsRepeatLists;

	private Boolean descend;

	private List<String> appIdsRepeatLists;

	private String defaultValue;

	private String modificationTimeFrom;

	private Long currentPage;

	private Boolean isProcessed;

	private String modificationTimeTo;

	private Long startIndex;

	private List<String> idsRepeatLists;

	private String sortField;

	private String workspaceId;
	public DescribeAppServiceEnvParamRequest() {
		super("SOFA", "2019-08-15", "DescribeAppServiceEnvParam", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getBuildpackIdsRepeatLists() {
		return this.buildpackIdsRepeatLists;
	}

	public void setBuildpackIdsRepeatLists(List<String> buildpackIdsRepeatLists) {
		this.buildpackIdsRepeatLists = buildpackIdsRepeatLists;	
		if (buildpackIdsRepeatLists != null) {
			for (int i = 0; i < buildpackIdsRepeatLists.size(); i++) {
				putBodyParameter("BuildpackIdsRepeatList." + (i + 1) , buildpackIdsRepeatLists.get(i));
			}
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

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
		if(value != null){
			putBodyParameter("Value", value);
		}
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putBodyParameter("Key", key);
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

	public Boolean getDescend() {
		return this.descend;
	}

	public void setDescend(Boolean descend) {
		this.descend = descend;
		if(descend != null){
			putBodyParameter("Descend", descend.toString());
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

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
		if(defaultValue != null){
			putBodyParameter("DefaultValue", defaultValue);
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

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
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

	public Long getStartIndex() {
		return this.startIndex;
	}

	public void setStartIndex(Long startIndex) {
		this.startIndex = startIndex;
		if(startIndex != null){
			putBodyParameter("StartIndex", startIndex.toString());
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

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<DescribeAppServiceEnvParamResponse> getResponseClass() {
		return DescribeAppServiceEnvParamResponse.class;
	}

}
