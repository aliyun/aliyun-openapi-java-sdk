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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oceanbasepro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListProjectsRequest extends RpcAcsRequest<ListProjectsResponse> {
	   

	private String searchKey;

	private String type;

	private Boolean visibleSubProject;

	private Integer pageNumber;

	@SerializedName("sinkEndpointTypes")
	private List<String> sinkEndpointTypes;

	private Integer pageSize;

	private String order;

	@SerializedName("sourceEndpointTypes")
	private List<String> sourceEndpointTypes;

	private String sortField;

	private Boolean needRelatedInfo;

	@SerializedName("labelIds")
	private List<String> labelIds;

	@SerializedName("status")
	private List<String> status;
	public ListProjectsRequest() {
		super("OceanBasePro", "2019-09-01", "ListProjects", "oceanbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSearchKey() {
		return this.searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
		if(searchKey != null){
			putBodyParameter("SearchKey", searchKey);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public Boolean getVisibleSubProject() {
		return this.visibleSubProject;
	}

	public void setVisibleSubProject(Boolean visibleSubProject) {
		this.visibleSubProject = visibleSubProject;
		if(visibleSubProject != null){
			putBodyParameter("VisibleSubProject", visibleSubProject.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public List<String> getSinkEndpointTypes() {
		return this.sinkEndpointTypes;
	}

	public void setSinkEndpointTypes(List<String> sinkEndpointTypes) {
		this.sinkEndpointTypes = sinkEndpointTypes;	
		if (sinkEndpointTypes != null) {
			putBodyParameter("SinkEndpointTypes" , new Gson().toJson(sinkEndpointTypes));
		}	
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putBodyParameter("Order", order);
		}
	}

	public List<String> getSourceEndpointTypes() {
		return this.sourceEndpointTypes;
	}

	public void setSourceEndpointTypes(List<String> sourceEndpointTypes) {
		this.sourceEndpointTypes = sourceEndpointTypes;	
		if (sourceEndpointTypes != null) {
			putBodyParameter("SourceEndpointTypes" , new Gson().toJson(sourceEndpointTypes));
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

	public Boolean getNeedRelatedInfo() {
		return this.needRelatedInfo;
	}

	public void setNeedRelatedInfo(Boolean needRelatedInfo) {
		this.needRelatedInfo = needRelatedInfo;
		if(needRelatedInfo != null){
			putBodyParameter("NeedRelatedInfo", needRelatedInfo.toString());
		}
	}

	public List<String> getLabelIds() {
		return this.labelIds;
	}

	public void setLabelIds(List<String> labelIds) {
		this.labelIds = labelIds;	
		if (labelIds != null) {
			putBodyParameter("LabelIds" , new Gson().toJson(labelIds));
		}	
	}

	public List<String> getStatus() {
		return this.status;
	}

	public void setStatus(List<String> status) {
		this.status = status;	
		if (status != null) {
			putBodyParameter("Status" , new Gson().toJson(status));
		}	
	}

	@Override
	public Class<ListProjectsResponse> getResponseClass() {
		return ListProjectsResponse.class;
	}

}
