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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListUserPrivateAccessPoliciesRequest extends RpcAcsRequest<ListUserPrivateAccessPoliciesResponse> {
	   

	private Integer currentPage;

	private String saseUserId;

	private Integer pageSize;

	private String name;
	public ListUserPrivateAccessPoliciesRequest() {
		super("csas", "2023-01-20", "ListUserPrivateAccessPolicies");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getSaseUserId() {
		return this.saseUserId;
	}

	public void setSaseUserId(String saseUserId) {
		this.saseUserId = saseUserId;
		if(saseUserId != null){
			putQueryParameter("SaseUserId", saseUserId);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<ListUserPrivateAccessPoliciesResponse> getResponseClass() {
		return ListUserPrivateAccessPoliciesResponse.class;
	}

}
