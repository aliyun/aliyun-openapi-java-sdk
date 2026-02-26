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

package com.aliyuncs.config.model.v20200907;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.UpdateConfigurationRecorderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateConfigurationRecorderResponse extends AcsResponse {

	private String requestId;

	private ConfigurationRecorder configurationRecorder;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ConfigurationRecorder getConfigurationRecorder() {
		return this.configurationRecorder;
	}

	public void setConfigurationRecorder(ConfigurationRecorder configurationRecorder) {
		this.configurationRecorder = configurationRecorder;
	}

	public static class ConfigurationRecorder {

		private String configurationRecorderStatus;

		private List<String> resourceTypes;

		public String getConfigurationRecorderStatus() {
			return this.configurationRecorderStatus;
		}

		public void setConfigurationRecorderStatus(String configurationRecorderStatus) {
			this.configurationRecorderStatus = configurationRecorderStatus;
		}

		public List<String> getResourceTypes() {
			return this.resourceTypes;
		}

		public void setResourceTypes(List<String> resourceTypes) {
			this.resourceTypes = resourceTypes;
		}
	}

	@Override
	public UpdateConfigurationRecorderResponse getInstance(UnmarshallerContext context) {
		return	UpdateConfigurationRecorderResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
