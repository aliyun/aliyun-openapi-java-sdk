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

package com.aliyuncs.datalake.model.v20200710;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.datalake.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListWorkflowInstantencesRequest extends RoaAcsRequest<ListWorkflowInstantencesResponse> {
	   

	private String statusList;

	private Integer pageSize;

	private Integer pageNumber;

	private String blueprintInstanceId;
	public ListWorkflowInstantencesRequest() {
		super("DataLake", "2020-07-10", "ListWorkflowInstantences");
		setUriPattern("/webapi/blueprintinstance/listWorkflowInstances");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStatusList() {
		return this.statusList;
	}

	public void setStatusList(String statusList) {
		this.statusList = statusList;
		if(statusList != null){
			putQueryParameter("StatusList", statusList);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getBlueprintInstanceId() {
		return this.blueprintInstanceId;
	}

	public void setBlueprintInstanceId(String blueprintInstanceId) {
		this.blueprintInstanceId = blueprintInstanceId;
		if(blueprintInstanceId != null){
			putQueryParameter("BlueprintInstanceId", blueprintInstanceId);
		}
	}

	@Override
	public Class<ListWorkflowInstantencesResponse> getResponseClass() {
		return ListWorkflowInstantencesResponse.class;
	}

}
