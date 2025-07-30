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

package com.aliyuncs.ciomarketpop.model.v20250709;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetEveryOneSellsFormListRequest extends RpcAcsRequest<GetEveryOneSellsFormListResponse> {
	   

	private String auth;
	public GetEveryOneSellsFormListRequest() {
		super("CioMarketPop", "2025-07-09", "GetEveryOneSellsFormList");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public String getAuth() {
		return this.auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
		if(auth != null){
			putQueryParameter("Auth", auth);
		}
	}

	@Override
	public Class<GetEveryOneSellsFormListResponse> getResponseClass() {
		return GetEveryOneSellsFormListResponse.class;
	}

}
