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
public class UpdateApplicationFederatedCredentialRequest extends RpcAcsRequest<UpdateApplicationFederatedCredentialResponse> {
	   

	private String applicationFederatedCredentialId;

	private List<AttributeMappings> attributeMappings;

	private String applicationId;

	private String instanceId;

	private String verificationCondition;
	public UpdateApplicationFederatedCredentialRequest() {
		super("Eiam", "2021-12-01", "UpdateApplicationFederatedCredential", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getApplicationFederatedCredentialId() {
		return this.applicationFederatedCredentialId;
	}

	public void setApplicationFederatedCredentialId(String applicationFederatedCredentialId) {
		this.applicationFederatedCredentialId = applicationFederatedCredentialId;
		if(applicationFederatedCredentialId != null){
			putQueryParameter("ApplicationFederatedCredentialId", applicationFederatedCredentialId);
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

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putQueryParameter("ApplicationId", applicationId);
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
	public Class<UpdateApplicationFederatedCredentialResponse> getResponseClass() {
		return UpdateApplicationFederatedCredentialResponse.class;
	}

}
