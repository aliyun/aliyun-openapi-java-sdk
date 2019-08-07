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

package com.aliyuncs.webplus.model.v20190320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.webplus.transform.v20190320.DescribeConfigSettingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeConfigSettingsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<ConfigSetting> configSettings;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<ConfigSetting> getConfigSettings() {
		return this.configSettings;
	}

	public void setConfigSettings(List<ConfigSetting> configSettings) {
		this.configSettings = configSettings;
	}

	public static class ConfigSetting {

		private String pathName;

		private String optionName;

		private String settingValue;

		public String getPathName() {
			return this.pathName;
		}

		public void setPathName(String pathName) {
			this.pathName = pathName;
		}

		public String getOptionName() {
			return this.optionName;
		}

		public void setOptionName(String optionName) {
			this.optionName = optionName;
		}

		public String getSettingValue() {
			return this.settingValue;
		}

		public void setSettingValue(String settingValue) {
			this.settingValue = settingValue;
		}
	}

	@Override
	public DescribeConfigSettingsResponse getInstance(UnmarshallerContext context) {
		return	DescribeConfigSettingsResponseUnmarshaller.unmarshall(this, context);
	}
}
