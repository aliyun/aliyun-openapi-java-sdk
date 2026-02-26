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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateApplicationFederatedCredentialRequest extends RpcAcsRequest<CreateApplicationFederatedCredentialResponse> {
	   

	private String description;

	private List<AttributeMappings> attributeMappings;

	private String federatedCredentialProviderId;

	private String applicationId;

	private String applicationFederatedCredentialName;

	private String instanceId;

	private String verificationCondition;

	private String applicationFederatedCredentialType;
	public CreateApplicationFederatedCredentialRequest() {
		super("Eiam", "2021-12-01", "CreateApplicationFederatedCredential", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public List<AttributeMappings> getAttributeMappings() {
		return this.attributeMappings;
	}

	public void setAttributeMappings(List<AttributeMappings> attributeMappings) {
		this.attributeMappings = attributeMappings;	
		if (attributeMappings != null) {
			for (int depth1 = 0; depth1 < attributeMappings.size(); depth1++) {
				if (attributeMappings.get(depth1) != null) {
					
						putQueryParameter("AttributeMappings." + (depth1 + 1) + ".SourceValueExpression" , attributeMappings.get(depth1).getSourceValueExpression());
						putQueryParameter("AttributeMappings." + (depth1 + 1) + ".TargetField" , attributeMappings.get(depth1).getTargetField());
				}
			}
		}	
	}

	public String getFederatedCredentialProviderId() {
		return this.federatedCredentialProviderId;
	}

	public void setFederatedCredentialProviderId(String federatedCredentialProviderId) {
		this.federatedCredentialProviderId = federatedCredentialProviderId;
		if(federatedCredentialProviderId != null){
			putQueryParameter("FederatedCredentialProviderId", federatedCredentialProviderId);
		}
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putQueryParameter("ApplicationId", applicationId);
		}
	}

	public String getApplicationFederatedCredentialName() {
		return this.applicationFederatedCredentialName;
	}

	public void setApplicationFederatedCredentialName(String applicationFederatedCredentialName) {
		this.applicationFederatedCredentialName = applicationFederatedCredentialName;
		if(applicationFederatedCredentialName != null){
			putQueryParameter("ApplicationFederatedCredentialName", applicationFederatedCredentialName);
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

	public String getVerificationCondition() {
		return this.verificationCondition;
	}

	public void setVerificationCondition(String verificationCondition) {
		this.verificationCondition = verificationCondition;
		if(verificationCondition != null){
			putQueryParameter("VerificationCondition", verificationCondition);
		}
	}

	public String getApplicationFederatedCredentialType() {
		return this.applicationFederatedCredentialType;
	}

	public void setApplicationFederatedCredentialType(String applicationFederatedCredentialType) {
		this.applicationFederatedCredentialType = applicationFederatedCredentialType;
		if(applicationFederatedCredentialType != null){
			putQueryParameter("ApplicationFederatedCredentialType", applicationFederatedCredentialType);
		}
	}

	public static class AttributeMappings {

		private String sourceValueExpression;

		private String targetField;

		public String getSourceValueExpression() {
			return this.sourceValueExpression;
		}

		public void setSourceValueExpression(String sourceValueExpression) {
			this.sourceValueExpression = sourceValueExpression;
		}

		public String getTargetField() {
			return this.targetField;
		}

		public void setTargetField(String targetField) {
			this.targetField = targetField;
		}
	}

	@Override
	public Class<CreateApplicationFederatedCredentialResponse> getResponseClass() {
		return CreateApplicationFederatedCredentialResponse.class;
	}

}
