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

package com.aliyuncs.idaas_doraemon.model.v20210520;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.idaas_doraemon.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListPwnedPasswordsRequest extends RpcAcsRequest<ListPwnedPasswordsResponse> {
	   

	private String prefixHexPasswordSha1Hash;
	public ListPwnedPasswordsRequest() {
		super("idaas-doraemon", "2021-05-20", "ListPwnedPasswords", "idaasauth");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPrefixHexPasswordSha1Hash() {
		return this.prefixHexPasswordSha1Hash;
	}

	public void setPrefixHexPasswordSha1Hash(String prefixHexPasswordSha1Hash) {
		this.prefixHexPasswordSha1Hash = prefixHexPasswordSha1Hash;
		if(prefixHexPasswordSha1Hash != null){
			putQueryParameter("PrefixHexPasswordSha1Hash", prefixHexPasswordSha1Hash);
		}
	}

	@Override
	public Class<ListPwnedPasswordsResponse> getResponseClass() {
		return ListPwnedPasswordsResponse.class;
	}

}
