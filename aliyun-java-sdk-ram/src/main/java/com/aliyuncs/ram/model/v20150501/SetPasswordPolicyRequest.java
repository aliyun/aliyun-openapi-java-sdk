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

package com.aliyuncs.ram.model.v20150501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ram.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetPasswordPolicyRequest extends RpcAcsRequest<SetPasswordPolicyResponse> {
	   

	private Integer passwordReusePrevention;

	private Boolean requireUppercaseCharacters;

	private Integer minimumPasswordLength;

	private Boolean requireNumbers;

	private Boolean requireLowercaseCharacters;

	private Integer maxPasswordAge;

	private Integer maxLoginAttemps;

	private Boolean hardExpiry;

	private Boolean requireSymbols;
	public SetPasswordPolicyRequest() {
		super("Ram", "2015-05-01", "SetPasswordPolicy", "Ram");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getPasswordReusePrevention() {
		return this.passwordReusePrevention;
	}

	public void setPasswordReusePrevention(Integer passwordReusePrevention) {
		this.passwordReusePrevention = passwordReusePrevention;
		if(passwordReusePrevention != null){
			putQueryParameter("PasswordReusePrevention", passwordReusePrevention.toString());
		}
	}

	public Boolean getRequireUppercaseCharacters() {
		return this.requireUppercaseCharacters;
	}

	public void setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
		this.requireUppercaseCharacters = requireUppercaseCharacters;
		if(requireUppercaseCharacters != null){
			putQueryParameter("RequireUppercaseCharacters", requireUppercaseCharacters.toString());
		}
	}

	public Integer getMinimumPasswordLength() {
		return this.minimumPasswordLength;
	}

	public void setMinimumPasswordLength(Integer minimumPasswordLength) {
		this.minimumPasswordLength = minimumPasswordLength;
		if(minimumPasswordLength != null){
			putQueryParameter("MinimumPasswordLength", minimumPasswordLength.toString());
		}
	}

	public Boolean getRequireNumbers() {
		return this.requireNumbers;
	}

	public void setRequireNumbers(Boolean requireNumbers) {
		this.requireNumbers = requireNumbers;
		if(requireNumbers != null){
			putQueryParameter("RequireNumbers", requireNumbers.toString());
		}
	}

	public Boolean getRequireLowercaseCharacters() {
		return this.requireLowercaseCharacters;
	}

	public void setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
		this.requireLowercaseCharacters = requireLowercaseCharacters;
		if(requireLowercaseCharacters != null){
			putQueryParameter("RequireLowercaseCharacters", requireLowercaseCharacters.toString());
		}
	}

	public Integer getMaxPasswordAge() {
		return this.maxPasswordAge;
	}

	public void setMaxPasswordAge(Integer maxPasswordAge) {
		this.maxPasswordAge = maxPasswordAge;
		if(maxPasswordAge != null){
			putQueryParameter("MaxPasswordAge", maxPasswordAge.toString());
		}
	}

	public Integer getMaxLoginAttemps() {
		return this.maxLoginAttemps;
	}

	public void setMaxLoginAttemps(Integer maxLoginAttemps) {
		this.maxLoginAttemps = maxLoginAttemps;
		if(maxLoginAttemps != null){
			putQueryParameter("MaxLoginAttemps", maxLoginAttemps.toString());
		}
	}

	public Boolean getHardExpiry() {
		return this.hardExpiry;
	}

	public void setHardExpiry(Boolean hardExpiry) {
		this.hardExpiry = hardExpiry;
		if(hardExpiry != null){
			putQueryParameter("HardExpiry", hardExpiry.toString());
		}
	}

	public Boolean getRequireSymbols() {
		return this.requireSymbols;
	}

	public void setRequireSymbols(Boolean requireSymbols) {
		this.requireSymbols = requireSymbols;
		if(requireSymbols != null){
			putQueryParameter("RequireSymbols", requireSymbols.toString());
		}
	}

	@Override
	public Class<SetPasswordPolicyResponse> getResponseClass() {
		return SetPasswordPolicyResponse.class;
	}

}
