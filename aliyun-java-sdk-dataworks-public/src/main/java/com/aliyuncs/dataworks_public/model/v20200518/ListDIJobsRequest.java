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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListDIJobsRequest extends RpcAcsRequest<ListDIJobsResponse> {
	   

	private String sourceDataSourceType;

	private Integer pageNumber;

	private String destinationDataSourceType;

	private Integer pageSize;

	private Long projectId;

	private String jobName;
	public ListDIJobsRequest() {
		super("dataworks-public", "2020-05-18", "ListDIJobs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceDataSourceType() {
		return this.sourceDataSourceType;
	}

	public void setSourceDataSourceType(String sourceDataSourceType) {
		this.sourceDataSourceType = sourceDataSourceType;
		if(sourceDataSourceType != null){
			putBodyParameter("SourceDataSourceType", sourceDataSourceType);
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

	public String getDestinationDataSourceType() {
		return this.destinationDataSourceType;
	}

	public void setDestinationDataSourceType(String destinationDataSourceType) {
		this.destinationDataSourceType = destinationDataSourceType;
		if(destinationDataSourceType != null){
			putBodyParameter("DestinationDataSourceType", destinationDataSourceType);
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

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId.toString());
		}
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
		if(jobName != null){
			putBodyParameter("JobName", jobName);
		}
	}

	@Override
	public Class<ListDIJobsResponse> getResponseClass() {
		return ListDIJobsResponse.class;
	}

}
