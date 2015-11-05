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
import com.aliyuncs.ram.transform.v20150501.SetSecurityPreferenceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SetSecurityPreferenceResponse extends AcsResponse {

	private String requestId;

	private SecurityPreference securityPreference;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SecurityPreference getSecurityPreference() {
		return this.securityPreference;
	}

	public void setSecurityPreference(SecurityPreference securityPreference) {
		this.securityPreference = securityPreference;
	}

	public static class SecurityPreference {

		private LoginProfilePreference loginProfilePreference;

		public LoginProfilePreference getLoginProfilePreference() {
			return this.loginProfilePreference;
		}

		public void setLoginProfilePreference(LoginProfilePreference loginProfilePreference) {
			this.loginProfilePreference = loginProfilePreference;
		}

		public static class LoginProfilePreference {

			private Boolean enableSaveMFATicket;

			public Boolean getEnableSaveMFATicket() {
				return this.enableSaveMFATicket;
			}

			public void setEnableSaveMFATicket(Boolean enableSaveMFATicket) {
				this.enableSaveMFATicket = enableSaveMFATicket;
			}
		}
	}

	@Override
	public SetSecurityPreferenceResponse getInstance(UnmarshallerContext context) {
		return	SetSecurityPreferenceResponseUnmarshaller.unmarshall(this, context);
	}
}
