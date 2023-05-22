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

package com.aliyuncs.bpstudio.model.v20210931;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListTemplateRequest extends RpcAcsRequest<ListTemplateResponse> {
	   

	private String type;

	private Integer tagList;

	private String resourceGroupId;

	private Integer nextToken;

	private Integer maxResults;

	private String keyword;

	private Long orderType;
	public ListTemplateRequest() {
		super("BPStudio", "2021-09-31", "ListTemplate", "bpstudio");
		setMethod(MethodType.POST);
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public Integer getTagList() {
		return this.tagList;
	}

	public void setTagList(Integer tagList) {
		this.tagList = tagList;
		if(tagList != null){
			putBodyParameter("TagList", tagList.toString());
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putBodyParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public Integer getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(Integer nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putBodyParameter("NextToken", nextToken.toString());
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putBodyParameter("MaxResults", maxResults.toString());
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putBodyParameter("Keyword", keyword);
		}
	}

	public Long getOrderType() {
		return this.orderType;
	}

	public void setOrderType(Long orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putBodyParameter("OrderType", orderType.toString());
		}
	}

	@Override
	public Class<ListTemplateResponse> getResponseClass() {
		return ListTemplateResponse.class;
	}

}
