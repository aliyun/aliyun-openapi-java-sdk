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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribePropertyUserItemRequest extends RpcAcsRequest<DescribePropertyUserItemResponse> {
	   

	private Integer currentPage;

	private Integer pageSize;

	private String user;

	private Boolean forceFlush;
	public DescribePropertyUserItemRequest() {
		super("Sas", "2018-12-03", "DescribePropertyUserItem", "sas");
		setMethod(MethodType.POST);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
		if(user != null){
			putQueryParameter("User", user);
		}
	}

	public Boolean getForceFlush() {
		return this.forceFlush;
	}

	public void setForceFlush(Boolean forceFlush) {
		this.forceFlush = forceFlush;
		if(forceFlush != null){
			putQueryParameter("ForceFlush", forceFlush.toString());
		}
	}

	@Override
	public Class<DescribePropertyUserItemResponse> getResponseClass() {
		return DescribePropertyUserItemResponse.class;
	}

}
