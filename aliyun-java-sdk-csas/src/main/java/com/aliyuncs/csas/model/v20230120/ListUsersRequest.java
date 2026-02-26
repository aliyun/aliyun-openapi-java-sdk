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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListUsersRequest extends RpcAcsRequest<ListUsersResponse> {
	   

	private String fuzzyUsername;

	private Long pageSize;

	private String department;

	private Long currentPage;

	private String preciseUsername;

	private List<String> saseUserIds;

	private String status;
	public ListUsersRequest() {
		super("csas", "2023-01-20", "ListUsers");
		setMethod(MethodType.GET);
	}

	public String getFuzzyUsername() {
		return this.fuzzyUsername;
	}

	public void setFuzzyUsername(String fuzzyUsername) {
		this.fuzzyUsername = fuzzyUsername;
		if(fuzzyUsername != null){
			putQueryParameter("FuzzyUsername", fuzzyUsername);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
		if(department != null){
			putQueryParameter("Department", department);
		}
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getPreciseUsername() {
		return this.preciseUsername;
	}

	public void setPreciseUsername(String preciseUsername) {
		this.preciseUsername = preciseUsername;
		if(preciseUsername != null){
			putQueryParameter("PreciseUsername", preciseUsername);
		}
	}

	public List<String> getSaseUserIds() {
		return this.saseUserIds;
	}

	public void setSaseUserIds(List<String> saseUserIds) {
		this.saseUserIds = saseUserIds;	
		if (saseUserIds != null) {
			for (int depth1 = 0; depth1 < saseUserIds.size(); depth1++) {
				putQueryParameter("SaseUserIds." + (depth1 + 1) , saseUserIds.get(depth1));
			}
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
	public Class<ListUsersResponse> getResponseClass() {
		return ListUsersResponse.class;
	}

}
