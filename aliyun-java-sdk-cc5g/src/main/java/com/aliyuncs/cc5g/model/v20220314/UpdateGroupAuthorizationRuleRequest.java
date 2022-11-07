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

package com.aliyuncs.cc5g.model.v20220314;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateGroupAuthorizationRuleRequest extends RpcAcsRequest<UpdateGroupAuthorizationRuleResponse> {
	   

	private String wirelessCloudConnectorGroupId;

	private String clientToken;

	private String sourceCidr;

	private String destination;

	private String description;

	private String protocol;

	private String policy;

	private Boolean dryRun;

	private String authorizationRuleId;

	private String destinationPort;

	private String name;
	public UpdateGroupAuthorizationRuleRequest() {
		super("CC5G", "2022-03-14", "UpdateGroupAuthorizationRule", "fivegcc");
		setMethod(MethodType.POST);
	}

	public String getWirelessCloudConnectorGroupId() {
		return this.wirelessCloudConnectorGroupId;
	}

	public void setWirelessCloudConnectorGroupId(String wirelessCloudConnectorGroupId) {
		this.wirelessCloudConnectorGroupId = wirelessCloudConnectorGroupId;
		if(wirelessCloudConnectorGroupId != null){
			putQueryParameter("WirelessCloudConnectorGroupId", wirelessCloudConnectorGroupId);
		}
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

	public String getSourceCidr() {
		return this.sourceCidr;
	}

	public void setSourceCidr(String sourceCidr) {
		this.sourceCidr = sourceCidr;
		if(sourceCidr != null){
			putQueryParameter("SourceCidr", sourceCidr);
		}
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
		if(destination != null){
			putQueryParameter("Destination", destination);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putQueryParameter("Protocol", protocol);
		}
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
		if(policy != null){
			putQueryParameter("Policy", policy);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getAuthorizationRuleId() {
		return this.authorizationRuleId;
	}

	public void setAuthorizationRuleId(String authorizationRuleId) {
		this.authorizationRuleId = authorizationRuleId;
		if(authorizationRuleId != null){
			putQueryParameter("AuthorizationRuleId", authorizationRuleId);
		}
	}

	public String getDestinationPort() {
		return this.destinationPort;
	}

	public void setDestinationPort(String destinationPort) {
		this.destinationPort = destinationPort;
		if(destinationPort != null){
			putQueryParameter("DestinationPort", destinationPort);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<UpdateGroupAuthorizationRuleResponse> getResponseClass() {
		return UpdateGroupAuthorizationRuleResponse.class;
	}

}
