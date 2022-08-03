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
public class CreateAuthorizationRulesRequest extends RpcAcsRequest<CreateAuthorizationRulesResponse> {
	   

	private Boolean dryRun;

	private String clientToken;

	private List<AuthorizationRules> authorizationRuless;

	private String ioTCloudConnectorId;
	public CreateAuthorizationRulesRequest() {
		super("IoTCC", "2021-05-13", "CreateAuthorizationRules", "IoTCC");
		setMethod(MethodType.POST);
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public List<AuthorizationRules> getAuthorizationRuless() {
		return this.authorizationRuless;
	}

	public void setAuthorizationRuless(List<AuthorizationRules> authorizationRuless) {
		this.authorizationRuless = authorizationRuless;	
		if (authorizationRuless != null) {
			for (int depth1 = 0; depth1 < authorizationRuless.size(); depth1++) {
				putQueryParameter("AuthorizationRules." + (depth1 + 1) + ".Name" , authorizationRuless.get(depth1).getName());
				putQueryParameter("AuthorizationRules." + (depth1 + 1) + ".Description" , authorizationRuless.get(depth1).getDescription());
				putQueryParameter("AuthorizationRules." + (depth1 + 1) + ".SourceCidr" , authorizationRuless.get(depth1).getSourceCidr());
				putQueryParameter("AuthorizationRules." + (depth1 + 1) + ".DestinationType" , authorizationRuless.get(depth1).getDestinationType());
				putQueryParameter("AuthorizationRules." + (depth1 + 1) + ".Destination" , authorizationRuless.get(depth1).getDestination());
				putQueryParameter("AuthorizationRules." + (depth1 + 1) + ".Policy" , authorizationRuless.get(depth1).getPolicy());
			}
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

	public static class AuthorizationRules {

		private String name;

		private String description;

		private String sourceCidr;

		private String destinationType;

		private String destination;

		private String policy;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSourceCidr() {
			return this.sourceCidr;
		}

		public void setSourceCidr(String sourceCidr) {
			this.sourceCidr = sourceCidr;
		}

		public String getDestinationType() {
			return this.destinationType;
		}

		public void setDestinationType(String destinationType) {
			this.destinationType = destinationType;
		}

		public String getDestination() {
			return this.destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}
	}

	@Override
	public Class<CreateAuthorizationRulesResponse> getResponseClass() {
		return CreateAuthorizationRulesResponse.class;
	}

}
