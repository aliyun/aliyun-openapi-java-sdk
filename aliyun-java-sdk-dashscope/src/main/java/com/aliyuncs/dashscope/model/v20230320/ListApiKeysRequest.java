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

package com.aliyuncs.dashscope.model.v20230320;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListApiKeysRequest extends RpcAcsRequest<ListApiKeysResponse> {
	   

	private Boolean validApiKey;

	private Long pageNo;

	private Long pageSize;
	public ListApiKeysRequest() {
		super("dashscope", "2023-03-20", "ListApiKeys");
		setMethod(MethodType.POST);
	}

	public Boolean getValidApiKey() {
		return this.validApiKey;
	}

	public void setValidApiKey(Boolean validApiKey) {
		this.validApiKey = validApiKey;
		if(validApiKey != null){
			putBodyParameter("ValidApiKey", validApiKey.toString());
		}
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putBodyParameter("PageNo", pageNo.toString());
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

	@Override
	public Class<ListApiKeysResponse> getResponseClass() {
		return ListApiKeysResponse.class;
	}

}
