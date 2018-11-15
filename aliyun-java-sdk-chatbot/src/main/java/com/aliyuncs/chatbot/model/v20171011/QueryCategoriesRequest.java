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

package com.aliyuncs.chatbot.model.v20171011;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryCategoriesRequest extends RpcAcsRequest<QueryCategoriesResponse> {
	
	public QueryCategoriesRequest() {
		super("Chatbot", "2017-10-11", "QueryCategories", "beebot");
	}

	private Boolean showChildrens;

	private Long parentCategoryId;

	public Boolean getShowChildrens() {
		return this.showChildrens;
	}

	public void setShowChildrens(Boolean showChildrens) {
		this.showChildrens = showChildrens;
		if(showChildrens != null){
			putQueryParameter("ShowChildrens", showChildrens.toString());
		}
	}

	public Long getParentCategoryId() {
		return this.parentCategoryId;
	}

	public void setParentCategoryId(Long parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
		if(parentCategoryId != null){
			putQueryParameter("ParentCategoryId", parentCategoryId.toString());
		}
	}

	@Override
	public Class<QueryCategoriesResponse> getResponseClass() {
		return QueryCategoriesResponse.class;
	}

}
