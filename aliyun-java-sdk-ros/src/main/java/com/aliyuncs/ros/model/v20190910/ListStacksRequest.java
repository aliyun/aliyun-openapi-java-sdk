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
public class ListStacksRequest extends RpcAcsRequest<ListStacksResponse> {
	   

	private Boolean showNestedStack;

	private String stackId;

	private Long pageNumber;

	private Long pageSize;

	private List<String> stackNames;

	private List<Tag> tags;

	private String parentStackId;

	private List<String> statuss;
	public ListStacksRequest() {
		super("ROS", "2019-09-10", "ListStacks", "ROS");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getShowNestedStack() {
		return this.showNestedStack;
	}

	public void setShowNestedStack(Boolean showNestedStack) {
		this.showNestedStack = showNestedStack;
		if(showNestedStack != null){
			putQueryParameter("ShowNestedStack", showNestedStack.toString());
		}
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

	public List<String> getStackNames() {
		return this.stackNames;
	}

	public void setStackNames(List<String> stackNames) {
		this.stackNames = stackNames;	
		if (stackNames != null) {
			for (int i = 0; i < stackNames.size(); i++) {
				putQueryParameter("StackName." + (i + 1) , stackNames.get(i));
			}
		}	
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public String getParentStackId() {
		return this.parentStackId;
	}

	public void setParentStackId(String parentStackId) {
		this.parentStackId = parentStackId;
		if(parentStackId != null){
			putQueryParameter("ParentStackId", parentStackId);
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

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<ListStacksResponse> getResponseClass() {
		return ListStacksResponse.class;
	}

}
