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

package com.aliyuncs.premiumpics.model.v20200505;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetTemplateCategoriesRequest extends RpcAcsRequest<GetTemplateCategoriesResponse> {
	   

	private Long parentId;

	private Boolean recursive;

	private String status;
	public GetTemplateCategoriesRequest() {
		super("Premiumpics", "2020-05-05", "GetTemplateCategories");
		setMethod(MethodType.GET);
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
		if(parentId != null){
			putQueryParameter("ParentId", parentId.toString());
		}
	}

	public Boolean getRecursive() {
		return this.recursive;
	}

	public void setRecursive(Boolean recursive) {
		this.recursive = recursive;
		if(recursive != null){
			putQueryParameter("Recursive", recursive.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<GetTemplateCategoriesResponse> getResponseClass() {
		return GetTemplateCategoriesResponse.class;
	}

}
