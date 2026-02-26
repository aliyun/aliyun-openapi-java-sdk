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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oos.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetOpsItemRequest extends RpcAcsRequest<GetOpsItemResponse> {
	   

	private String opsItemId;
	public GetOpsItemRequest() {
		super("oos", "2019-06-01", "GetOpsItem", "oos");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOpsItemId() {
		return this.opsItemId;
	}

	public void setOpsItemId(String opsItemId) {
		this.opsItemId = opsItemId;
		if(opsItemId != null){
			putQueryParameter("OpsItemId", opsItemId);
		}
	}

	@Override
	public Class<GetOpsItemResponse> getResponseClass() {
		return GetOpsItemResponse.class;
	}

}
