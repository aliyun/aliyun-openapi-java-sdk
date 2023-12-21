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
import com.aliyuncs.eiam.transform.v20211201.GetPasswordInitializationConfigurationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPasswordInitializationConfigurationResponse extends AcsResponse {

	private String requestId;

	private PasswordInitializationConfiguration passwordInitializationConfiguration;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PasswordInitializationConfiguration getPasswordInitializationConfiguration() {
		return this.passwordInitializationConfiguration;
	}

	public void setPasswordInitializationConfiguration(PasswordInitializationConfiguration passwordInitializationConfiguration) {
		this.passwordInitializationConfiguration = passwordInitializationConfiguration;
	}

	public static class PasswordInitializationConfiguration {

		private String passwordInitializationStatus;

		private String passwordInitializationType;

		private String passwordForcedUpdateStatus;

		private List<String> passwordInitializationNotificationChannels;

		public String getPasswordInitializationStatus() {
			return this.passwordInitializationStatus;
		}

		public void setPasswordInitializationStatus(String passwordInitializationStatus) {
			this.passwordInitializationStatus = passwordInitializationStatus;
		}

		public String getPasswordInitializationType() {
			return this.passwordInitializationType;
		}

		public void setPasswordInitializationType(String passwordInitializationType) {
			this.passwordInitializationType = passwordInitializationType;
		}

		public String getPasswordForcedUpdateStatus() {
			return this.passwordForcedUpdateStatus;
		}

		public void setPasswordForcedUpdateStatus(String passwordForcedUpdateStatus) {
			this.passwordForcedUpdateStatus = passwordForcedUpdateStatus;
		}

		public List<String> getPasswordInitializationNotificationChannels() {
			return this.passwordInitializationNotificationChannels;
		}

		public void setPasswordInitializationNotificationChannels(List<String> passwordInitializationNotificationChannels) {
			this.passwordInitializationNotificationChannels = passwordInitializationNotificationChannels;
		}
	}

	@Override
	public GetPasswordInitializationConfigurationResponse getInstance(UnmarshallerContext context) {
		return	GetPasswordInitializationConfigurationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
