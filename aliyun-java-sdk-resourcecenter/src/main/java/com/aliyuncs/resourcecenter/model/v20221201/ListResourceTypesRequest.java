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

package com.aliyuncs.resourcecenter.model.v20221201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListResourceTypesRequest extends RpcAcsRequest<ListResourceTypesResponse> {
	   

	private List<String> querys;

	private String resourceType;

	private String acceptLanguage;
	public ListResourceTypesRequest() {
		super("ResourceCenter", "2022-12-01", "ListResourceTypes");
		setMethod(MethodType.POST);
	}

	public List<String> getQuerys() {
		return this.querys;
	}

	public void setQuerys(List<String> querys) {
		this.querys = querys;	
		if (querys != null) {
			for (int i = 0; i < querys.size(); i++) {
				putQueryParameter("Query." + (i + 1) , querys.get(i));
			}
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

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	@Override
	public Class<ListResourceTypesResponse> getResponseClass() {
		return ListResourceTypesResponse.class;
	}

}
