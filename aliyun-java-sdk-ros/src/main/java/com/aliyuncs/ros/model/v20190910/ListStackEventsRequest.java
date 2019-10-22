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
public class ListStackEventsRequest extends RpcAcsRequest<ListStackEventsResponse> {
	   

	private String stackId;

	private Long pageNumber;

	private Long pageSize;

	private List<String> logicalResourceIds;

	private List<String> resourceTypes;

	private List<String> statuss;
	public ListStackEventsRequest() {
		super("ROS", "2019-09-10", "ListStackEvents");
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

	public List<String> getLogicalResourceIds() {
		return this.logicalResourceIds;
	}

	public void setLogicalResourceIds(List<String> logicalResourceIds) {
		this.logicalResourceIds = logicalResourceIds;	
		if (logicalResourceIds != null) {
			for (int i = 0; i < logicalResourceIds.size(); i++) {
				putQueryParameter("LogicalResourceId." + (i + 1) , logicalResourceIds.get(i));
			}
		}	
	}

	public List<String> getResourceTypes() {
		return this.resourceTypes;
	}

	public void setResourceTypes(List<String> resourceTypes) {
		this.resourceTypes = resourceTypes;	
		if (resourceTypes != null) {
			for (int i = 0; i < resourceTypes.size(); i++) {
				putQueryParameter("ResourceType." + (i + 1) , resourceTypes.get(i));
			}
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
	public Class<ListStackEventsResponse> getResponseClass() {
		return ListStackEventsResponse.class;
	}

}
