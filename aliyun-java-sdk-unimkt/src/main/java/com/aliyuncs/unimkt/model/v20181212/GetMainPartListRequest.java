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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetMainPartListRequest extends RpcAcsRequest<GetMainPartListResponse> {
	   

	private String accountType;

	private Integer pageSize;

	private Integer pageIndex;

	private Integer mainType;

	private Long parentMainId;

	private String mainName;
	public GetMainPartListRequest() {
		super("UniMkt", "2018-12-12", "GetMainPartList");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
		if(accountType != null){
			putQueryParameter("AccountType", accountType);
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

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("PageIndex", pageIndex.toString());
		}
	}

	public Integer getMainType() {
		return this.mainType;
	}

	public void setMainType(Integer mainType) {
		this.mainType = mainType;
		if(mainType != null){
			putQueryParameter("MainType", mainType.toString());
		}
	}

	public Long getParentMainId() {
		return this.parentMainId;
	}

	public void setParentMainId(Long parentMainId) {
		this.parentMainId = parentMainId;
		if(parentMainId != null){
			putQueryParameter("ParentMainId", parentMainId.toString());
		}
	}

	public String getMainName() {
		return this.mainName;
	}

	public void setMainName(String mainName) {
		this.mainName = mainName;
		if(mainName != null){
			putQueryParameter("MainName", mainName);
		}
	}

	@Override
	public Class<GetMainPartListResponse> getResponseClass() {
		return GetMainPartListResponse.class;
	}

}
