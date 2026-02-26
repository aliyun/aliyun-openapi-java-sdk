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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteForwardingRulesRequest extends RpcAcsRequest<DeleteForwardingRulesResponse> {
	   

	private String clientToken;

	private String listenerId;

	private String acceleratorId;

	private List<String> forwardingRuleIds;
	public DeleteForwardingRulesRequest() {
		super("Ga", "2019-11-20", "DeleteForwardingRules", "gaplus");
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
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
		if(listenerId != null){
			putQueryParameter("ListenerId", listenerId);
		}
	}

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
		if(acceleratorId != null){
			putQueryParameter("AcceleratorId", acceleratorId);
		}
	}

	public List<String> getForwardingRuleIds() {
		return this.forwardingRuleIds;
	}

	public void setForwardingRuleIds(List<String> forwardingRuleIds) {
		this.forwardingRuleIds = forwardingRuleIds;	
		if (forwardingRuleIds != null) {
			for (int depth1 = 0; depth1 < forwardingRuleIds.size(); depth1++) {
				putQueryParameter("ForwardingRuleIds." + (depth1 + 1) , forwardingRuleIds.get(depth1));
			}
		}	
	}

	@Override
	public Class<DeleteForwardingRulesResponse> getResponseClass() {
		return DeleteForwardingRulesResponse.class;
	}

}
