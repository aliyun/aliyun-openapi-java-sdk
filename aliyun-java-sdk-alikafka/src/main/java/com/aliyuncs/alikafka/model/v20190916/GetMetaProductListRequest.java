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

package com.aliyuncs.alikafka.model.v20190916;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alikafka.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetMetaProductListRequest extends RpcAcsRequest<GetMetaProductListResponse> {
	   

	private String listNormal;
	public GetMetaProductListRequest() {
		super("alikafka", "2019-09-16", "GetMetaProductList", "alikafka");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getListNormal() {
		return this.listNormal;
	}

	public void setListNormal(String listNormal) {
		this.listNormal = listNormal;
		if(listNormal != null){
			putQueryParameter("ListNormal", listNormal);
		}
	}

	@Override
	public Class<GetMetaProductListResponse> getResponseClass() {
		return GetMetaProductListResponse.class;
	}

}
