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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InnerCallServiceRequest extends RpcAcsRequest<InnerCallServiceResponse> {
	   

	@SerializedName("body")
	private Map<String,String> body;
	public InnerCallServiceRequest() {
		super("UniMkt", "2018-12-12", "InnerCallService", "1.0.0");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Map<String,String> getBody() {
		return this.body;
	}

	public void setBody(Map<String,String> body) {
		this.body = body;	
		if (body != null) {
			putBodyParameter("body" , new Gson().toJson(body));
		}	
	}

	@Override
	public Class<InnerCallServiceResponse> getResponseClass() {
		return InnerCallServiceResponse.class;
	}

}
