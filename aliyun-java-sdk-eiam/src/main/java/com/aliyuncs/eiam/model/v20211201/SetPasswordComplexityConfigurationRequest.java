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
public class SetPasswordComplexityConfigurationRequest extends RpcAcsRequest<SetPasswordComplexityConfigurationResponse> {
	   

	private Integer passwordMinLength;

	private List<PasswordComplexityRules> passwordComplexityRules;

	private String instanceId;
	public SetPasswordComplexityConfigurationRequest() {
		super("Eiam", "2021-12-01", "SetPasswordComplexityConfiguration", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Integer getPasswordMinLength() {
		return this.passwordMinLength;
	}

	public void setPasswordMinLength(Integer passwordMinLength) {
		this.passwordMinLength = passwordMinLength;
		if(passwordMinLength != null){
			putQueryParameter("PasswordMinLength", passwordMinLength.toString());
		}
	}

	public List<PasswordComplexityRules> getPasswordComplexityRules() {
		return this.passwordComplexityRules;
	}

	public void setPasswordComplexityRules(List<PasswordComplexityRules> passwordComplexityRules) {
		this.passwordComplexityRules = passwordComplexityRules;	
		if (passwordComplexityRules != null) {
			for (int depth1 = 0; depth1 < passwordComplexityRules.size(); depth1++) {
				if (passwordComplexityRules.get(depth1) != null) {
					
						putQueryParameter("PasswordComplexityRules." + (depth1 + 1) + ".PasswordCheckType" , passwordComplexityRules.get(depth1).getPasswordCheckType());
				}
			}
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

	public static class PasswordComplexityRules {

		private String passwordCheckType;

		public String getPasswordCheckType() {
			return this.passwordCheckType;
		}

		public void setPasswordCheckType(String passwordCheckType) {
			this.passwordCheckType = passwordCheckType;
		}
	}

	@Override
	public Class<SetPasswordComplexityConfigurationResponse> getResponseClass() {
		return SetPasswordComplexityConfigurationResponse.class;
	}

}
