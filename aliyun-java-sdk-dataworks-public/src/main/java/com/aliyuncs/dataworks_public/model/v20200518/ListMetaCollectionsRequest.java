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
public class ListMetaCollectionsRequest extends RpcAcsRequest<ListMetaCollectionsResponse> {
	   

	private String creator;

	private String follower;

	private String parentQualifiedName;

	private String orderBy;

	private String collectionType;

	private String administrator;

	private String nextToken;

	private Integer pageSize;

	private String keyword;
	public ListMetaCollectionsRequest() {
		super("dataworks-public", "2020-05-18", "ListMetaCollections");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
		if(creator != null){
			putQueryParameter("Creator", creator);
		}
	}

	public String getFollower() {
		return this.follower;
	}

	public void setFollower(String follower) {
		this.follower = follower;
		if(follower != null){
			putQueryParameter("Follower", follower);
		}
	}

	public String getParentQualifiedName() {
		return this.parentQualifiedName;
	}

	public void setParentQualifiedName(String parentQualifiedName) {
		this.parentQualifiedName = parentQualifiedName;
		if(parentQualifiedName != null){
			putQueryParameter("ParentQualifiedName", parentQualifiedName);
		}
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putQueryParameter("OrderBy", orderBy);
		}
	}

	public String getCollectionType() {
		return this.collectionType;
	}

	public void setCollectionType(String collectionType) {
		this.collectionType = collectionType;
		if(collectionType != null){
			putQueryParameter("CollectionType", collectionType);
		}
	}

	public String getAdministrator() {
		return this.administrator;
	}

	public void setAdministrator(String administrator) {
		this.administrator = administrator;
		if(administrator != null){
			putQueryParameter("Administrator", administrator);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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
	public Class<ListMetaCollectionsResponse> getResponseClass() {
		return ListMetaCollectionsResponse.class;
	}

}
