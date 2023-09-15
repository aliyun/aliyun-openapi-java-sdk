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

package com.aliyuncs.cams.model.v20200606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cams.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ChatappBindWabaRequest extends RpcAcsRequest<ChatappBindWabaResponse> {
	   

	private String wabaId;
	public ChatappBindWabaRequest() {
		super("cams", "2020-06-06", "ChatappBindWaba");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWabaId() {
		return this.wabaId;
	}

	public void setWabaId(String wabaId) {
		this.wabaId = wabaId;
		if(wabaId != null){
			putBodyParameter("WabaId", wabaId);
		}
	}

	@Override
	public Class<ChatappBindWabaResponse> getResponseClass() {
		return ChatappBindWabaResponse.class;
	}

}
