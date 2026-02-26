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
import com.aliyuncs.eiam.transform.v20211201.GetForgetPasswordConfigurationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetForgetPasswordConfigurationResponse extends AcsResponse {

	private String requestId;

	private OpenForgetPasswordConfiguration openForgetPasswordConfiguration;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public OpenForgetPasswordConfiguration getOpenForgetPasswordConfiguration() {
		return this.openForgetPasswordConfiguration;
	}

	public void setOpenForgetPasswordConfiguration(OpenForgetPasswordConfiguration openForgetPasswordConfiguration) {
		this.openForgetPasswordConfiguration = openForgetPasswordConfiguration;
	}

	public static class OpenForgetPasswordConfiguration {

		private Boolean enable;

		private Boolean enableSms;

		private Boolean enableEmail;

		private String forgetPasswordStatus;

		private List<String> authenticationChannels;

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public Boolean getEnableSms() {
			return this.enableSms;
		}

		public void setEnableSms(Boolean enableSms) {
			this.enableSms = enableSms;
		}

		public Boolean getEnableEmail() {
			return this.enableEmail;
		}

		public void setEnableEmail(Boolean enableEmail) {
			this.enableEmail = enableEmail;
		}

		public String getForgetPasswordStatus() {
			return this.forgetPasswordStatus;
		}

		public void setForgetPasswordStatus(String forgetPasswordStatus) {
			this.forgetPasswordStatus = forgetPasswordStatus;
		}

		public List<String> getAuthenticationChannels() {
			return this.authenticationChannels;
		}

		public void setAuthenticationChannels(List<String> authenticationChannels) {
			this.authenticationChannels = authenticationChannels;
		}
	}

	@Override
	public GetForgetPasswordConfigurationResponse getInstance(UnmarshallerContext context) {
		return	GetForgetPasswordConfigurationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
