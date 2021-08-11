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

package com.aliyuncs.iotcc.model.v20210513;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateAuthorizationRuleRequest extends RpcAcsRequest<CreateAuthorizationRuleResponse> {
	   

	private String clientToken;

	private String destinationType;

	private String destination;

	private String authorizationRuleDescription;

	private String policy;

	private Boolean dryRun;

	private List<String> sourceCidrss;

	private String authorizationRuleName;

	private String ioTCloudConnectorId;
	public CreateAuthorizationRuleRequest() {
		super("IoTCC", "2021-05-13", "CreateAuthorizationRule", "cciot");
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

	public String getDestinationType() {
		return this.destinationType;
	}

	public void setDestinationType(String destinationType) {
		this.destinationType = destinationType;
		if(destinationType != null){
			putQueryParameter("DestinationType", destinationType);
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

	public String getAuthorizationRuleDescription() {
		return this.authorizationRuleDescription;
	}

	public void setAuthorizationRuleDescription(String authorizationRuleDescription) {
		this.authorizationRuleDescription = authorizationRuleDescription;
		if(authorizationRuleDescription != null){
			putQueryParameter("AuthorizationRuleDescription", authorizationRuleDescription);
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

	public List<String> getSourceCidrss() {
		return this.sourceCidrss;
	}

	public void setSourceCidrss(List<String> sourceCidrss) {
		this.sourceCidrss = sourceCidrss;	
		if (sourceCidrss != null) {
			for (int i = 0; i < sourceCidrss.size(); i++) {
				putQueryParameter("SourceCidrs." + (i + 1) , sourceCidrss.get(i));
			}
		}	
	}

	public String getAuthorizationRuleName() {
		return this.authorizationRuleName;
	}

	public void setAuthorizationRuleName(String authorizationRuleName) {
		this.authorizationRuleName = authorizationRuleName;
		if(authorizationRuleName != null){
			putQueryParameter("AuthorizationRuleName", authorizationRuleName);
		}
	}

	public String getIoTCloudConnectorId() {
		return this.ioTCloudConnectorId;
	}

	public void setIoTCloudConnectorId(String ioTCloudConnectorId) {
		this.ioTCloudConnectorId = ioTCloudConnectorId;
		if(ioTCloudConnectorId != null){
			putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
		}
	}

	@Override
	public Class<CreateAuthorizationRuleResponse> getResponseClass() {
		return CreateAuthorizationRuleResponse.class;
	}

}
