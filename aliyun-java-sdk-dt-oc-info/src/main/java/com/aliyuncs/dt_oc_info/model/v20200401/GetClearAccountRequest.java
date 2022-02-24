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

package com.aliyuncs.dt_oc_info.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetClearAccountRequest extends RpcAcsRequest<GetClearAccountResponse> {
	   

	private String fetchFieldList;

	private Integer pageNo;

	private Integer pageSize;

	private String searchKey;
	public GetClearAccountRequest() {
		super("dt-oc-info", "2020-04-01", "GetClearAccount");
		setMethod(MethodType.POST);
	}

	public String getFetchFieldList() {
		return this.fetchFieldList;
	}

	public void setFetchFieldList(String fetchFieldList) {
		this.fetchFieldList = fetchFieldList;
		if(fetchFieldList != null){
			putQueryParameter("FetchFieldList", fetchFieldList);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
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

	public String getSearchKey() {
		return this.searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
		if(searchKey != null){
			putQueryParameter("SearchKey", searchKey);
		}
	}

	@Override
	public Class<GetClearAccountResponse> getResponseClass() {
		return GetClearAccountResponse.class;
	}

}
