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

package com.aliyuncs.itag.model.v20210517;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.itag.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTntConfigRequest extends RoaAcsRequest<ListTntConfigResponse> {
	   

	private String body;
	public ListTntConfigRequest() {
		super("Itag", "2021-05-17", "ListTntConfig");
		setUriPattern("/mng/api/v1/tnt/listTntConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("body", body);
		}
	}

	@Override
	public Class<ListTntConfigResponse> getResponseClass() {
		return ListTntConfigResponse.class;
	}

}
