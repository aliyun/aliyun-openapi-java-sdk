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

package com.aliyuncs.ros.model.v20190910;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ros.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListChangeSetsRequest extends RpcAcsRequest<ListChangeSetsResponse> {
	   

	private String stackId;

	private Long pageNumber;

	private Long pageSize;

	private List<String> executionStatuss;

	private List<String> changeSetNames;

	private String changeSetId;

	private List<String> statuss;
	public ListChangeSetsRequest() {
		super("ROS", "2019-09-10", "ListChangeSets", "ros");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
		if(stackId != null){
			putQueryParameter("StackId", stackId);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public List<String> getExecutionStatuss() {
		return this.executionStatuss;
	}

	public void setExecutionStatuss(List<String> executionStatuss) {
		this.executionStatuss = executionStatuss;	
		if (executionStatuss != null) {
			for (int i = 0; i < executionStatuss.size(); i++) {
				putQueryParameter("ExecutionStatus." + (i + 1) , executionStatuss.get(i));
			}
		}	
	}

	public List<String> getChangeSetNames() {
		return this.changeSetNames;
	}

	public void setChangeSetNames(List<String> changeSetNames) {
		this.changeSetNames = changeSetNames;	
		if (changeSetNames != null) {
			for (int i = 0; i < changeSetNames.size(); i++) {
				putQueryParameter("ChangeSetName." + (i + 1) , changeSetNames.get(i));
			}
		}	
	}

	public String getChangeSetId() {
		return this.changeSetId;
	}

	public void setChangeSetId(String changeSetId) {
		this.changeSetId = changeSetId;
		if(changeSetId != null){
			putQueryParameter("ChangeSetId", changeSetId);
		}
	}

	public List<String> getStatuss() {
		return this.statuss;
	}

	public void setStatuss(List<String> statuss) {
		this.statuss = statuss;	
		if (statuss != null) {
			for (int i = 0; i < statuss.size(); i++) {
				putQueryParameter("Status." + (i + 1) , statuss.get(i));
			}
		}	
	}

	@Override
	public Class<ListChangeSetsResponse> getResponseClass() {
		return ListChangeSetsResponse.class;
	}

}
