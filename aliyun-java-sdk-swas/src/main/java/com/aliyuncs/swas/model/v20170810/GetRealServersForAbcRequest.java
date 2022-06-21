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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetRealServersForAbcRequest extends RpcAcsRequest<GetRealServersForAbcResponse> {
	   

	private String loadBalancerId;

	private String querySite;
	public GetRealServersForAbcRequest() {
		super("SWAS", "2017-08-10", "GetRealServersForAbc", "SWAS");
		setMethod(MethodType.POST);
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
		if(loadBalancerId != null){
			putQueryParameter("LoadBalancerId", loadBalancerId);
		}
	}

	public String getQuerySite() {
		return this.querySite;
	}

	public void setQuerySite(String querySite) {
		this.querySite = querySite;
		if(querySite != null){
			putQueryParameter("QuerySite", querySite);
		}
	}

	@Override
	public Class<GetRealServersForAbcResponse> getResponseClass() {
		return GetRealServersForAbcResponse.class;
	}

}
