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
public class ListResourceGroupsRequest extends RpcAcsRequest<ListResourceGroupsResponse> {
	   

	private String bizExtKey;

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

	@Override
	public Class<ListResourceGroupsResponse> getResponseClass() {
		return ListResourceGroupsResponse.class;
	}

}
