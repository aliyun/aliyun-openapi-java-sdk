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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetMiddlewareInstanceRequest extends RpcAcsRequest<GetMiddlewareInstanceResponse> {
	   

	private String currWorkspace;

	private String currTenant;
	public GetMiddlewareInstanceRequest() {
		super("SOFA", "2019-08-15", "GetMiddlewareInstance", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCurrWorkspace() {
		return this.currWorkspace;
	}

	public void setCurrWorkspace(String currWorkspace) {
		this.currWorkspace = currWorkspace;
		if(currWorkspace != null){
			putBodyParameter("CurrWorkspace", currWorkspace);
		}
	}

	public String getCurrTenant() {
		return this.currTenant;
	}

	public void setCurrTenant(String currTenant) {
		this.currTenant = currTenant;
		if(currTenant != null){
			putBodyParameter("CurrTenant", currTenant);
		}
	}

	@Override
	public Class<GetMiddlewareInstanceResponse> getResponseClass() {
		return GetMiddlewareInstanceResponse.class;
	}

}
