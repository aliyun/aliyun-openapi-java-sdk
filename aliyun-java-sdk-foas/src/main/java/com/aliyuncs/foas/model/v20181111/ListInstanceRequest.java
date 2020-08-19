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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.foas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceRequest extends RoaAcsRequest<ListInstanceResponse> {
	   

	private String projectName;

	private Long endBeginTs;

	private String expectState;

	private String jobType;

	private String apiType;

	private String actualState;

	private Long endEndTs;

	private Long startEndTs;

	private Integer pageSize;

	private Long startBeginTs;

	private Integer pageIndex;

	private Boolean isArchived;

	private String jobName;
	public ListInstanceRequest() {
		super("foas", "2018-11-11", "ListInstance", "foas");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v2/projects/[projectName]/instances");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putPathParameter("projectName", projectName);
		}
	}

	public Long getEndBeginTs() {
		return this.endBeginTs;
	}

	public void setEndBeginTs(Long endBeginTs) {
		this.endBeginTs = endBeginTs;
		if(endBeginTs != null){
			putQueryParameter("endBeginTs", endBeginTs.toString());
		}
	}

	public String getExpectState() {
		return this.expectState;
	}

	public void setExpectState(String expectState) {
		this.expectState = expectState;
		if(expectState != null){
			putQueryParameter("expectState", expectState);
		}
	}

	public String getJobType() {
		return this.jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
		if(jobType != null){
			putQueryParameter("jobType", jobType);
		}
	}

	public String getApiType() {
		return this.apiType;
	}

	public void setApiType(String apiType) {
		this.apiType = apiType;
		if(apiType != null){
			putQueryParameter("apiType", apiType);
		}
	}

	public String getActualState() {
		return this.actualState;
	}

	public void setActualState(String actualState) {
		this.actualState = actualState;
		if(actualState != null){
			putQueryParameter("actualState", actualState);
		}
	}

	public Long getEndEndTs() {
		return this.endEndTs;
	}

	public void setEndEndTs(Long endEndTs) {
		this.endEndTs = endEndTs;
		if(endEndTs != null){
			putQueryParameter("endEndTs", endEndTs.toString());
		}
	}

	public Long getStartEndTs() {
		return this.startEndTs;
	}

	public void setStartEndTs(Long startEndTs) {
		this.startEndTs = startEndTs;
		if(startEndTs != null){
			putQueryParameter("startEndTs", startEndTs.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("pageSize", pageSize.toString());
		}
	}

	public Long getStartBeginTs() {
		return this.startBeginTs;
	}

	public void setStartBeginTs(Long startBeginTs) {
		this.startBeginTs = startBeginTs;
		if(startBeginTs != null){
			putQueryParameter("startBeginTs", startBeginTs.toString());
		}
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("pageIndex", pageIndex.toString());
		}
	}

	public Boolean getIsArchived() {
		return this.isArchived;
	}

	public void setIsArchived(Boolean isArchived) {
		this.isArchived = isArchived;
		if(isArchived != null){
			putQueryParameter("isArchived", isArchived.toString());
		}
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
		if(jobName != null){
			putQueryParameter("jobName", jobName);
		}
	}

	@Override
	public Class<ListInstanceResponse> getResponseClass() {
		return ListInstanceResponse.class;
	}

}
