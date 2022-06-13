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
public class UpdateDNSAuthorizationRuleRequest extends RpcAcsRequest<UpdateDNSAuthorizationRuleResponse> {
	   

	private String clientToken;

	private String description;

	private Boolean dryRun;

	private String sourceDNSIp;

	private String authorizationRuleId;

	private String destinationIp;

	private String wirelessCloudConnectorId;

	private String name;
	public UpdateDNSAuthorizationRuleRequest() {
		super("CC5G", "2022-03-14", "UpdateDNSAuthorizationRule", "fivegcc");
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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

	public String getSourceDNSIp() {
		return this.sourceDNSIp;
	}

	public void setSourceDNSIp(String sourceDNSIp) {
		this.sourceDNSIp = sourceDNSIp;
		if(sourceDNSIp != null){
			putQueryParameter("SourceDNSIp", sourceDNSIp);
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

	public String getDestinationIp() {
		return this.destinationIp;
	}

	public void setDestinationIp(String destinationIp) {
		this.destinationIp = destinationIp;
		if(destinationIp != null){
			putQueryParameter("DestinationIp", destinationIp);
		}
	}

	public String getWirelessCloudConnectorId() {
		return this.wirelessCloudConnectorId;
	}

	public void setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
		this.wirelessCloudConnectorId = wirelessCloudConnectorId;
		if(wirelessCloudConnectorId != null){
			putQueryParameter("WirelessCloudConnectorId", wirelessCloudConnectorId);
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
	public Class<UpdateDNSAuthorizationRuleResponse> getResponseClass() {
		return UpdateDNSAuthorizationRuleResponse.class;
	}

}
