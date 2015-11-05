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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ram.transform.v20150501.SetPasswordPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SetPasswordPolicyResponse extends AcsResponse {

	private String requestId;

	private PasswordPolicy passwordPolicy;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PasswordPolicy getPasswordPolicy() {
		return this.passwordPolicy;
	}

	public void setPasswordPolicy(PasswordPolicy passwordPolicy) {
		this.passwordPolicy = passwordPolicy;
	}

	public static class PasswordPolicy {

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
		}

		public Boolean getRequireLowercaseCharacters() {
			return this.requireLowercaseCharacters;
		}

		public void setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
			this.requireLowercaseCharacters = requireLowercaseCharacters;
		}

		public Boolean getRequireUppercaseCharacters() {
			return this.requireUppercaseCharacters;
		}

		public void setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
			this.requireUppercaseCharacters = requireUppercaseCharacters;
		}

		public Boolean getRequireNumbers() {
			return this.requireNumbers;
		}

		public void setRequireNumbers(Boolean requireNumbers) {
			this.requireNumbers = requireNumbers;
		}

		public Boolean getRequireSymbols() {
			return this.requireSymbols;
		}

		public void setRequireSymbols(Boolean requireSymbols) {
			this.requireSymbols = requireSymbols;
		}
	}

	@Override
	public SetPasswordPolicyResponse getInstance(UnmarshallerContext context) {
		return	SetPasswordPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
