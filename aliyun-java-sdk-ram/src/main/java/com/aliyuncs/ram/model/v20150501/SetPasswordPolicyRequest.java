/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ram.model.v20150501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class SetPasswordPolicyRequest extends RpcAcsRequest<SetPasswordPolicyResponse> {
	
	public SetPasswordPolicyRequest() {
		super("Ram", "2015-05-01", "SetPasswordPolicy");
		setProtocol(ProtocolType.HTTPS);
	}

	private Integer minimumPasswordLength;

	private Boolean requireLowercaseCharacters;

	private Boolean requireUppercaseCharacters;

	private Boolean requireNumbers;

	private Boolean requireSymbols;

	public Integer getMinimumPasswordLength() {
		return this.minimumPasswordLength;
	}

	public void setMinimumPasswordLength(Integer minimumPasswordLength) {
		this.minimumPasswordLength = minimumPasswordLength;
		putQueryParameter("MinimumPasswordLength", String.valueOf(minimumPasswordLength));
	}

	public Boolean getRequireLowercaseCharacters() {
		return this.requireLowercaseCharacters;
	}

	public void setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
		this.requireLowercaseCharacters = requireLowercaseCharacters;
		putQueryParameter("RequireLowercaseCharacters", String.valueOf(requireLowercaseCharacters));
	}

	public Boolean getRequireUppercaseCharacters() {
		return this.requireUppercaseCharacters;
	}

	public void setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
		this.requireUppercaseCharacters = requireUppercaseCharacters;
		putQueryParameter("RequireUppercaseCharacters", String.valueOf(requireUppercaseCharacters));
	}

	public Boolean getRequireNumbers() {
		return this.requireNumbers;
	}

	public void setRequireNumbers(Boolean requireNumbers) {
		this.requireNumbers = requireNumbers;
		putQueryParameter("RequireNumbers", String.valueOf(requireNumbers));
	}

	public Boolean getRequireSymbols() {
		return this.requireSymbols;
	}

	public void setRequireSymbols(Boolean requireSymbols) {
		this.requireSymbols = requireSymbols;
		putQueryParameter("RequireSymbols", String.valueOf(requireSymbols));
	}

	@Override
	public Class<SetPasswordPolicyResponse> getResponseClass() {
		return SetPasswordPolicyResponse.class;
	}

}
