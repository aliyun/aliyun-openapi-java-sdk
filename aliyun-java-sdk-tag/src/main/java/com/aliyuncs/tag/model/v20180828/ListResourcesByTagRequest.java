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

package com.aliyuncs.tag.model.v20180828;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.tag.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListResourcesByTagRequest extends RpcAcsRequest<ListResourcesByTagResponse> {
	   

	private String tagFilterKey;

	private String nextToken;

	private Boolean includeAllTags;

	private String tagFilterValue;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String resourceType;

	private Integer maxResult;

	private String fuzzyType;
	public ListResourcesByTagRequest() {
		super("Tag", "2018-08-28", "ListResourcesByTag", "tag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTagFilterKey() {
		return this.tagFilterKey;
	}

	public void setTagFilterKey(String tagFilterKey) {
		this.tagFilterKey = tagFilterKey;
		if(tagFilterKey != null){
			putQueryParameter("TagFilter.Key", tagFilterKey);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Boolean getIncludeAllTags() {
		return this.includeAllTags;
	}

	public void setIncludeAllTags(Boolean includeAllTags) {
		this.includeAllTags = includeAllTags;
		if(includeAllTags != null){
			putQueryParameter("IncludeAllTags", includeAllTags.toString());
		}
	}

	public String getTagFilterValue() {
		return this.tagFilterValue;
	}

	public void setTagFilterValue(String tagFilterValue) {
		this.tagFilterValue = tagFilterValue;
		if(tagFilterValue != null){
			putQueryParameter("TagFilter.Value", tagFilterValue);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public Integer getMaxResult() {
		return this.maxResult;
	}

	public void setMaxResult(Integer maxResult) {
		this.maxResult = maxResult;
		if(maxResult != null){
			putQueryParameter("MaxResult", maxResult.toString());
		}
	}

	public String getFuzzyType() {
		return this.fuzzyType;
	}

	public void setFuzzyType(String fuzzyType) {
		this.fuzzyType = fuzzyType;
		if(fuzzyType != null){
			putQueryParameter("FuzzyType", fuzzyType);
		}
	}

	@Override
	public Class<ListResourcesByTagResponse> getResponseClass() {
		return ListResourcesByTagResponse.class;
	}

}
