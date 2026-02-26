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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.GetPasswordComplexityConfigurationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPasswordComplexityConfigurationResponse extends AcsResponse {

	private String requestId;

	private PasswordComplexityConfiguration passwordComplexityConfiguration;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PasswordComplexityConfiguration getPasswordComplexityConfiguration() {
		return this.passwordComplexityConfiguration;
	}

	public void setPasswordComplexityConfiguration(PasswordComplexityConfiguration passwordComplexityConfiguration) {
		this.passwordComplexityConfiguration = passwordComplexityConfiguration;
	}

	public static class PasswordComplexityConfiguration {

		private Integer passwordMinLength;

		private List<PasswordComplexityRul> passwordComplexityRules;

		public Integer getPasswordMinLength() {
			return this.passwordMinLength;
		}

		public void setPasswordMinLength(Integer passwordMinLength) {
			this.passwordMinLength = passwordMinLength;
		}

		public List<PasswordComplexityRul> getPasswordComplexityRules() {
			return this.passwordComplexityRules;
		}

		public void setPasswordComplexityRules(List<PasswordComplexityRul> passwordComplexityRules) {
			this.passwordComplexityRules = passwordComplexityRules;
		}

		public static class PasswordComplexityRul {

			private String passwordCheckType;

			public String getPasswordCheckType() {
				return this.passwordCheckType;
			}

			public void setPasswordCheckType(String passwordCheckType) {
				this.passwordCheckType = passwordCheckType;
			}
		}
	}

	@Override
	public GetPasswordComplexityConfigurationResponse getInstance(UnmarshallerContext context) {
		return	GetPasswordComplexityConfigurationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
