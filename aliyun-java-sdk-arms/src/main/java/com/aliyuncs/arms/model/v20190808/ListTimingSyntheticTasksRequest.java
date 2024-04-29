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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTimingSyntheticTasksRequest extends RpcAcsRequest<ListTimingSyntheticTasksResponse> {
	   

	private String resourceGroupId;

	@SerializedName("search")
	private Search search;

	@SerializedName("tags")
	private List<Tags> tags;
	public ListTimingSyntheticTasksRequest() {
		super("ARMS", "2019-08-08", "ListTimingSyntheticTasks", "arms");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public Search getSearch() {
		return this.search;
	}

	public void setSearch(Search search) {
		this.search = search;	
		if (search != null) {
			putQueryParameter("Search" , new Gson().toJson(search));
		}	
	}

	public List<Tags> getTags() {
		return this.tags;
	}

	public void setTags(List<Tags> tags) {
		this.tags = tags;	
		if (tags != null) {
			putQueryParameter("Tags" , new Gson().toJson(tags));
		}	
	}

	public static class Search {

		@SerializedName("TaskTypes")
		private List<Integer> taskTypes;

		@SerializedName("Name")
		private String name;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("Page")
		private Integer page;

		@SerializedName("TaskIds")
		private List<String> taskIds;

		@SerializedName("Status")
		private String status;

		@SerializedName("OrderField")
		private String orderField;

		@SerializedName("Order")
		private Integer order;

		public List<Integer> getTaskTypes() {
			return this.taskTypes;
		}

		public void setTaskTypes(List<Integer> taskTypes) {
			this.taskTypes = taskTypes;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}

		public List<String> getTaskIds() {
			return this.taskIds;
		}

		public void setTaskIds(List<String> taskIds) {
			this.taskIds = taskIds;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getOrderField() {
			return this.orderField;
		}

		public void setOrderField(String orderField) {
			this.orderField = orderField;
		}

		public Integer getOrder() {
			return this.order;
		}

		public void setOrder(Integer order) {
			this.order = order;
		}
	}

	public static class Tags {

		@SerializedName("Value")
		private String value;

		@SerializedName("Key")
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
	public Class<ListTimingSyntheticTasksResponse> getResponseClass() {
		return ListTimingSyntheticTasksResponse.class;
	}

}
