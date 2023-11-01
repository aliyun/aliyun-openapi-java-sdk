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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetQuickQueryRequest extends RpcAcsRequest<GetQuickQueryResponse> {
	   

	private String searchName;
	public GetQuickQueryRequest() {
		super("cloud-siem", "2022-06-16", "GetQuickQuery", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public String getSearchName() {
		return this.searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
		if(searchName != null){
			putBodyParameter("SearchName", searchName);
		}
	}

	@Override
	public Class<GetQuickQueryResponse> getResponseClass() {
		return GetQuickQueryResponse.class;
	}

}
