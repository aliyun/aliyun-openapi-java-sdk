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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListResourceGroupsRequest extends RpcAcsRequest<ListResourceGroupsResponse> {
	   

	private String bizExtKey;

	@SerializedName("tags")
	private List<Tags> tags;

	private String resourceManagerResourceGroupId;

	private Integer resourceGroupType;

	private String keyword;
	public ListResourceGroupsRequest() {
		super("dataworks-public", "2020-05-18", "ListResourceGroups");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBizExtKey() {
		return this.bizExtKey;
	}

	public void setBizExtKey(String bizExtKey) {
		this.bizExtKey = bizExtKey;
		if(bizExtKey != null){
			putQueryParameter("BizExtKey", bizExtKey);
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

	public String getResourceManagerResourceGroupId() {
		return this.resourceManagerResourceGroupId;
	}

	public void setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
		this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
		if(resourceManagerResourceGroupId != null){
			putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
		}
	}

	public Integer getResourceGroupType() {
		return this.resourceGroupType;
	}

	public void setResourceGroupType(Integer resourceGroupType) {
		this.resourceGroupType = resourceGroupType;
		if(resourceGroupType != null){
			putQueryParameter("ResourceGroupType", resourceGroupType.toString());
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
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
	public Class<ListResourceGroupsResponse> getResponseClass() {
		return ListResourceGroupsResponse.class;
	}

}
