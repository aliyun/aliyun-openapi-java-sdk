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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTrademarkSbjKeyRequest extends RpcAcsRequest<ListTrademarkSbjKeyResponse> {
	   

	private String principalKey;

	private String principalName;
	public ListTrademarkSbjKeyRequest() {
		super("Trademark", "2018-07-24", "ListTrademarkSbjKey");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPrincipalKey() {
		return this.principalKey;
	}

	public void setPrincipalKey(String principalKey) {
		this.principalKey = principalKey;
		if(principalKey != null){
			putQueryParameter("PrincipalKey", principalKey);
		}
	}

	public String getPrincipalName() {
		return this.principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
		if(principalName != null){
			putQueryParameter("PrincipalName", principalName);
		}
	}

	@Override
	public Class<ListTrademarkSbjKeyResponse> getResponseClass() {
		return ListTrademarkSbjKeyResponse.class;
	}

}
