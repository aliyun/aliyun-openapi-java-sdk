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

package com.aliyuncs.rdc.model.v20180821;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.rdc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetBindedUserByDingIdRequest extends RpcAcsRequest<GetBindedUserByDingIdResponse> {
	
	public GetBindedUserByDingIdRequest() {
		super("Rdc", "2018-08-21", "GetBindedUserByDingId");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String dingId;

	public String getDingId() {
		return this.dingId;
	}

	public void setDingId(String dingId) {
		this.dingId = dingId;
		if(dingId != null){
			putQueryParameter("DingId", dingId);
		}
	}

	@Override
	public Class<GetBindedUserByDingIdResponse> getResponseClass() {
		return GetBindedUserByDingIdResponse.class;
	}

}
