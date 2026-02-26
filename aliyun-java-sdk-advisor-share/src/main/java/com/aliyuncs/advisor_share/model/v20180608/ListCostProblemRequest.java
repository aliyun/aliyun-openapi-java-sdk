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

package com.aliyuncs.advisor_share.model.v20180608;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListCostProblemRequest extends RpcAcsRequest<ListCostProblemResponse> {
	   

	private String queryGroupType;

	private Long pageNumber;

	private String sorting;

	private Long pageSize;

	private String sortField;

	private String queryGroupId;
	public ListCostProblemRequest() {
		super("Advisor-Share", "2018-06-08", "ListCostProblem", "advisor");
		setMethod(MethodType.POST);
	}

	public String getQueryGroupType() {
		return this.queryGroupType;
	}

	public void setQueryGroupType(String queryGroupType) {
		this.queryGroupType = queryGroupType;
		if(queryGroupType != null){
			putQueryParameter("QueryGroupType", queryGroupType);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getSorting() {
		return this.sorting;
	}

	public void setSorting(String sorting) {
		this.sorting = sorting;
		if(sorting != null){
			putQueryParameter("Sorting", sorting);
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

	public String getSortField() {
		return this.sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
		if(sortField != null){
			putQueryParameter("SortField", sortField);
		}
	}

	public String getQueryGroupId() {
		return this.queryGroupId;
	}

	public void setQueryGroupId(String queryGroupId) {
		this.queryGroupId = queryGroupId;
		if(queryGroupId != null){
			putQueryParameter("QueryGroupId", queryGroupId);
		}
	}

	@Override
	public Class<ListCostProblemResponse> getResponseClass() {
		return ListCostProblemResponse.class;
	}

}
