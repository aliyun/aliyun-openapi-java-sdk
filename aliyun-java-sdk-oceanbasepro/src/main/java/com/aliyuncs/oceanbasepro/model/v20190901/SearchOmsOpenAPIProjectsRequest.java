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

/**
 * @author auto create
 * @version 
 */
public class SearchOmsOpenAPIProjectsRequest extends RpcAcsRequest<SearchOmsOpenAPIProjectsResponse> {
	   

	@SerializedName("destDbTypes")
	private List<String> destDbTypes;

	@SerializedName("statusList")
	private List<String> statusList;

	private String searchKey;

	private Integer pageNumber;

	@SerializedName("sourceDbTypes")
	private List<String> sourceDbTypes;

	private Integer pageSize;

	private String workerGradeId;

	@SerializedName("labelIds")
	private List<String> labelIds;
	public SearchOmsOpenAPIProjectsRequest() {
		super("OceanBasePro", "2019-09-01", "SearchOmsOpenAPIProjects");
		setMethod(MethodType.POST);
	}

	public List<String> getDestDbTypes() {
		return this.destDbTypes;
	}

	public void setDestDbTypes(List<String> destDbTypes) {
		this.destDbTypes = destDbTypes;	
		if (destDbTypes != null) {
			putBodyParameter("DestDbTypes" , new Gson().toJson(destDbTypes));
		}	
	}

	public List<String> getStatusList() {
		return this.statusList;
	}

	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;	
		if (statusList != null) {
			putBodyParameter("StatusList" , new Gson().toJson(statusList));
		}	
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public List<String> getSourceDbTypes() {
		return this.sourceDbTypes;
	}

	public void setSourceDbTypes(List<String> sourceDbTypes) {
		this.sourceDbTypes = sourceDbTypes;	
		if (sourceDbTypes != null) {
			putBodyParameter("SourceDbTypes" , new Gson().toJson(sourceDbTypes));
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

	public String getWorkerGradeId() {
		return this.workerGradeId;
	}

	public void setWorkerGradeId(String workerGradeId) {
		this.workerGradeId = workerGradeId;
		if(workerGradeId != null){
			putBodyParameter("WorkerGradeId", workerGradeId);
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

	@Override
	public Class<SearchOmsOpenAPIProjectsResponse> getResponseClass() {
		return SearchOmsOpenAPIProjectsResponse.class;
	}

}
