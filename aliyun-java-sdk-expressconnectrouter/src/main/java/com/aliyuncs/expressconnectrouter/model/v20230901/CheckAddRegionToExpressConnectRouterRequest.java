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

package com.aliyuncs.expressconnectrouter.model.v20230901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.expressconnectrouter.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CheckAddRegionToExpressConnectRouterRequest extends RpcAcsRequest<CheckAddRegionToExpressConnectRouterResponse> {
	   

	private String clientToken;

	private String ecrId;

	private String freshRegionId;

	private Boolean dryRun;
	public CheckAddRegionToExpressConnectRouterRequest() {
		super("ExpressConnectRouter", "2023-09-01", "CheckAddRegionToExpressConnectRouter", "ecr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getEcrId() {
		return this.ecrId;
	}

	public void setEcrId(String ecrId) {
		this.ecrId = ecrId;
		if(ecrId != null){
			putBodyParameter("EcrId", ecrId);
		}
	}

	public String getFreshRegionId() {
		return this.freshRegionId;
	}

	public void setFreshRegionId(String freshRegionId) {
		this.freshRegionId = freshRegionId;
		if(freshRegionId != null){
			putBodyParameter("FreshRegionId", freshRegionId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putBodyParameter("DryRun", dryRun.toString());
		}
	}

	@Override
	public Class<CheckAddRegionToExpressConnectRouterResponse> getResponseClass() {
		return CheckAddRegionToExpressConnectRouterResponse.class;
	}

}
