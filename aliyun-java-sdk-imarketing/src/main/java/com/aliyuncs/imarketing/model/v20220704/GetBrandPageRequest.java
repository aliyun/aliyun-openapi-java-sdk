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

package com.aliyuncs.imarketing.model.v20220704;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetBrandPageRequest extends RpcAcsRequest<GetBrandPageResponse> {
	   

	private String accountNo;

	private Integer pageSize;

	private Integer pageIndex;

	private Long mainId;

	private String mainName;
	public GetBrandPageRequest() {
		super("imarketing", "2022-07-04", "GetBrandPage");
		setMethod(MethodType.POST);
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
		if(accountNo != null){
			putQueryParameter("AccountNo", accountNo);
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

	public Long getMainId() {
		return this.mainId;
	}

	public void setMainId(Long mainId) {
		this.mainId = mainId;
		if(mainId != null){
			putQueryParameter("MainId", mainId.toString());
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
	public Class<GetBrandPageResponse> getResponseClass() {
		return GetBrandPageResponse.class;
	}

}
