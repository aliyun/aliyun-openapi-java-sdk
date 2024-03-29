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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTaskFlowsByPageRequest extends RpcAcsRequest<ListTaskFlowsByPageResponse> {
	   

	private String searchKey;

	@SerializedName("dagIdList")
	private List<Long> dagIdList;

	private Long tid;

	private Integer pageSize;

	private Integer pageIndex;

	private Long scenarioId;
	public ListTaskFlowsByPageRequest() {
		super("dms-enterprise", "2018-11-01", "ListTaskFlowsByPage", "dms-enterprise");
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
			putQueryParameter("SearchKey", searchKey);
		}
	}

	public List<Long> getDagIdList() {
		return this.dagIdList;
	}

	public void setDagIdList(List<Long> dagIdList) {
		this.dagIdList = dagIdList;	
		if (dagIdList != null) {
			putQueryParameter("DagIdList" , new Gson().toJson(dagIdList));
		}	
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("PageIndex", pageIndex.toString());
		}
	}

	public Long getScenarioId() {
		return this.scenarioId;
	}

	public void setScenarioId(Long scenarioId) {
		this.scenarioId = scenarioId;
		if(scenarioId != null){
			putQueryParameter("ScenarioId", scenarioId.toString());
		}
	}

	@Override
	public Class<ListTaskFlowsByPageResponse> getResponseClass() {
		return ListTaskFlowsByPageResponse.class;
	}

}
