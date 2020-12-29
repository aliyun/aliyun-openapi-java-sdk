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

package com.aliyuncs.paistudio.model.v20201123;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.paistudio.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListJobsRequest extends RoaAcsRequest<ListJobsResponse> {
	   

	private String sortDirection;

	private String creator;

	private Integer pageSize;

	private String experimentId;

	private String sortField;

	private Integer pageNumber;
	public ListJobsRequest() {
		super("PaiStudio", "2020-11-23", "ListJobs");
		setUriPattern("/api/core/v1.0/jobs");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSortDirection() {
		return this.sortDirection;
	}

	public void setSortDirection(String sortDirection) {
		this.sortDirection = sortDirection;
		if(sortDirection != null){
			putQueryParameter("SortDirection", sortDirection);
		}
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
		if(creator != null){
			putQueryParameter("Creator", creator);
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

	public String getExperimentId() {
		return this.experimentId;
	}

	public void setExperimentId(String experimentId) {
		this.experimentId = experimentId;
		if(experimentId != null){
			putQueryParameter("ExperimentId", experimentId);
		}
	}

	public String getSortField() {
		return this.sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
		if(sortField != null){
			putQueryParameter("SortField", sortField);
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

	@Override
	public Class<ListJobsResponse> getResponseClass() {
		return ListJobsResponse.class;
	}

}
