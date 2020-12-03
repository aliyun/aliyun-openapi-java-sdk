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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UnbindSlbRequest extends RoaAcsRequest<UnbindSlbResponse> {
	   

	private Boolean intranet;

	private String appId;

	private Boolean internet;
	public UnbindSlbRequest() {
		super("sae", "2019-05-06", "UnbindSlb", "serverless");
		setUriPattern("/pop/v1/sam/app/slb");
		setMethod(MethodType.DELETE);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIntranet() {
		return this.intranet;
	}

	public void setIntranet(Boolean intranet) {
		this.intranet = intranet;
		if(intranet != null){
			putQueryParameter("Intranet", intranet.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public Boolean getInternet() {
		return this.internet;
	}

	public void setInternet(Boolean internet) {
		this.internet = internet;
		if(internet != null){
			putQueryParameter("Internet", internet.toString());
		}
	}

	@Override
	public Class<UnbindSlbResponse> getResponseClass() {
		return UnbindSlbResponse.class;
	}

}
