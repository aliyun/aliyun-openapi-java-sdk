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

package com.aliyuncs.swas_open.model.v20200601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateFirewallRuleRequest extends RpcAcsRequest<CreateFirewallRuleResponse> {
	   

	private String clientToken;

	private String instanceId;

	private String ruleProtocol;

	private String port;
	public CreateFirewallRuleRequest() {
		super("SWAS-OPEN", "2020-06-01", "CreateFirewallRule");
		setMethod(MethodType.POST);
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getRuleProtocol() {
		return this.ruleProtocol;
	}

	public void setRuleProtocol(String ruleProtocol) {
		this.ruleProtocol = ruleProtocol;
		if(ruleProtocol != null){
			putQueryParameter("RuleProtocol", ruleProtocol);
		}
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port);
		}
	}

	@Override
	public Class<CreateFirewallRuleResponse> getResponseClass() {
		return CreateFirewallRuleResponse.class;
	}

}
