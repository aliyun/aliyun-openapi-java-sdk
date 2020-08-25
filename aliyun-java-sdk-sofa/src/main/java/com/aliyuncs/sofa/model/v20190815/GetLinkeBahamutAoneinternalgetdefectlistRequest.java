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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutAoneinternalgetdefectlistRequest extends RpcAcsRequest<GetLinkeBahamutAoneinternalgetdefectlistResponse> {
	   

	private Long toPage;

	private String externalId;

	private String search;

	private Long pageSize;

	private String author;

	private String status;
	public GetLinkeBahamutAoneinternalgetdefectlistRequest() {
		super("SOFA", "2019-08-15", "GetLinkeBahamutAoneinternalgetdefectlist", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getToPage() {
		return this.toPage;
	}

	public void setToPage(Long toPage) {
		this.toPage = toPage;
		if(toPage != null){
			putBodyParameter("ToPage", toPage.toString());
		}
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
		if(externalId != null){
			putBodyParameter("ExternalId", externalId);
		}
	}

	public String getSearch() {
		return this.search;
	}

	public void setSearch(String search) {
		this.search = search;
		if(search != null){
			putBodyParameter("Search", search);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
		if(author != null){
			putBodyParameter("Author", author);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<GetLinkeBahamutAoneinternalgetdefectlistResponse> getResponseClass() {
		return GetLinkeBahamutAoneinternalgetdefectlistResponse.class;
	}

}
