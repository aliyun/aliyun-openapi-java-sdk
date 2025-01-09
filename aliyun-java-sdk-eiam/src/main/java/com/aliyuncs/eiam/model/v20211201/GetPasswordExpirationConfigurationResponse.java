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
import com.aliyuncs.eiam.transform.v20211201.GetPasswordExpirationConfigurationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPasswordExpirationConfigurationResponse extends AcsResponse {

	private String requestId;

	private PasswordExpirationConfiguration passwordExpirationConfiguration;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PasswordExpirationConfiguration getPasswordExpirationConfiguration() {
		return this.passwordExpirationConfiguration;
	}

	public void setPasswordExpirationConfiguration(PasswordExpirationConfiguration passwordExpirationConfiguration) {
		this.passwordExpirationConfiguration = passwordExpirationConfiguration;
	}

	public static class PasswordExpirationConfiguration {

		private String passwordExpirationStatus;

		private Integer passwordValidMaxDay;

		private String passwordExpirationAction;

		private String passwordExpirationNotificationStatus;

		private Integer passwordExpirationNotificationDuration;

		private Integer passwordForcedUpdateDuration;

		private List<String> passwordExpirationNotificationChannels;

		private List<String> effectiveAuthenticationSourceIds;

		public String getPasswordExpirationStatus() {
			return this.passwordExpirationStatus;
		}

		public void setPasswordExpirationStatus(String passwordExpirationStatus) {
			this.passwordExpirationStatus = passwordExpirationStatus;
		}

		public Integer getPasswordValidMaxDay() {
			return this.passwordValidMaxDay;
		}

		public void setPasswordValidMaxDay(Integer passwordValidMaxDay) {
			this.passwordValidMaxDay = passwordValidMaxDay;
		}

		public String getPasswordExpirationAction() {
			return this.passwordExpirationAction;
		}

		public void setPasswordExpirationAction(String passwordExpirationAction) {
			this.passwordExpirationAction = passwordExpirationAction;
		}

		public String getPasswordExpirationNotificationStatus() {
			return this.passwordExpirationNotificationStatus;
		}

		public void setPasswordExpirationNotificationStatus(String passwordExpirationNotificationStatus) {
			this.passwordExpirationNotificationStatus = passwordExpirationNotificationStatus;
		}

		public Integer getPasswordExpirationNotificationDuration() {
			return this.passwordExpirationNotificationDuration;
		}

		public void setPasswordExpirationNotificationDuration(Integer passwordExpirationNotificationDuration) {
			this.passwordExpirationNotificationDuration = passwordExpirationNotificationDuration;
		}

		public Integer getPasswordForcedUpdateDuration() {
			return this.passwordForcedUpdateDuration;
		}

		public void setPasswordForcedUpdateDuration(Integer passwordForcedUpdateDuration) {
			this.passwordForcedUpdateDuration = passwordForcedUpdateDuration;
		}

		public List<String> getPasswordExpirationNotificationChannels() {
			return this.passwordExpirationNotificationChannels;
		}

		public void setPasswordExpirationNotificationChannels(List<String> passwordExpirationNotificationChannels) {
			this.passwordExpirationNotificationChannels = passwordExpirationNotificationChannels;
		}

		public List<String> getEffectiveAuthenticationSourceIds() {
			return this.effectiveAuthenticationSourceIds;
		}

		public void setEffectiveAuthenticationSourceIds(List<String> effectiveAuthenticationSourceIds) {
			this.effectiveAuthenticationSourceIds = effectiveAuthenticationSourceIds;
		}
	}

	@Override
	public GetPasswordExpirationConfigurationResponse getInstance(UnmarshallerContext context) {
		return	GetPasswordExpirationConfigurationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
