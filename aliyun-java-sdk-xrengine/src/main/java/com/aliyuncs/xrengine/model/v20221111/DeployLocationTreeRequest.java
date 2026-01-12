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

package com.aliyuncs.xrengine.model.v20221111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.xrengine.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeployLocationTreeRequest extends RpcAcsRequest<DeployLocationTreeResponse> {
	   

	private Boolean forceUpdate;

	private Long svcId;

	private String jwtToken;
	public DeployLocationTreeRequest() {
		super("xrEngine", "2022-11-11", "DeployLocationTree");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getForceUpdate() {
		return this.forceUpdate;
	}

	public void setForceUpdate(Boolean forceUpdate) {
		this.forceUpdate = forceUpdate;
		if(forceUpdate != null){
			putBodyParameter("ForceUpdate", forceUpdate.toString());
		}
	}

	public Long getSvcId() {
		return this.svcId;
	}

	public void setSvcId(Long svcId) {
		this.svcId = svcId;
		if(svcId != null){
			putBodyParameter("SvcId", svcId.toString());
		}
	}

	public String getJwtToken() {
		return this.jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
		if(jwtToken != null){
			putBodyParameter("JwtToken", jwtToken);
		}
	}

	@Override
	public Class<DeployLocationTreeResponse> getResponseClass() {
		return DeployLocationTreeResponse.class;
	}

}
