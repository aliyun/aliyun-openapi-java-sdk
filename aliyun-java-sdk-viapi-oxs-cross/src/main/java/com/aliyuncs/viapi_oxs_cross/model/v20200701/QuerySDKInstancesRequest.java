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

package com.aliyuncs.viapi_oxs_cross.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QuerySDKInstancesRequest extends RpcAcsRequest<QuerySDKInstancesResponse> {
	   

	private String codeList;

	private Integer pageNumber;

	private String createdBeforeDate;

	private String createdAfterDate;

	private Integer pageSize;

	private String pk;
	public QuerySDKInstancesRequest() {
		super("viapi-oxs-cross", "2020-07-01", "QuerySDKInstances");
		setMethod(MethodType.POST);
	}

	public String getCodeList() {
		return this.codeList;
	}

	public void setCodeList(String codeList) {
		this.codeList = codeList;
		if(codeList != null){
			putQueryParameter("CodeList", codeList);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getCreatedBeforeDate() {
		return this.createdBeforeDate;
	}

	public void setCreatedBeforeDate(String createdBeforeDate) {
		this.createdBeforeDate = createdBeforeDate;
		if(createdBeforeDate != null){
			putQueryParameter("CreatedBeforeDate", createdBeforeDate);
		}
	}

	public String getCreatedAfterDate() {
		return this.createdAfterDate;
	}

	public void setCreatedAfterDate(String createdAfterDate) {
		this.createdAfterDate = createdAfterDate;
		if(createdAfterDate != null){
			putQueryParameter("CreatedAfterDate", createdAfterDate);
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

	public String getPk() {
		return this.pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
		if(pk != null){
			putQueryParameter("Pk", pk);
		}
	}

	@Override
	public Class<QuerySDKInstancesResponse> getResponseClass() {
		return QuerySDKInstancesResponse.class;
	}

}
