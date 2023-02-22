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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.ListPluginForUuidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPluginForUuidResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private List<AegisUuidTargetPluginConfig> aegisUuidTargetPluginConfigList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<AegisUuidTargetPluginConfig> getAegisUuidTargetPluginConfigList() {
		return this.aegisUuidTargetPluginConfigList;
	}

	public void setAegisUuidTargetPluginConfigList(List<AegisUuidTargetPluginConfig> aegisUuidTargetPluginConfigList) {
		this.aegisUuidTargetPluginConfigList = aegisUuidTargetPluginConfigList;
	}

	public static class AegisUuidTargetPluginConfig {

		private String pluginName;

		private Boolean pluginOnlineInstalled;

		private Boolean pluginOnlineStatus;

		private String pluginInstallCode;

		private String pluginVersion;

		private List<AegisSuspiciousConfig> aegisSuspiciousConfigList;

		public String getPluginName() {
			return this.pluginName;
		}

		public void setPluginName(String pluginName) {
			this.pluginName = pluginName;
		}

		public Boolean getPluginOnlineInstalled() {
			return this.pluginOnlineInstalled;
		}

		public void setPluginOnlineInstalled(Boolean pluginOnlineInstalled) {
			this.pluginOnlineInstalled = pluginOnlineInstalled;
		}

		public Boolean getPluginOnlineStatus() {
			return this.pluginOnlineStatus;
		}

		public void setPluginOnlineStatus(Boolean pluginOnlineStatus) {
			this.pluginOnlineStatus = pluginOnlineStatus;
		}

		public String getPluginInstallCode() {
			return this.pluginInstallCode;
		}

		public void setPluginInstallCode(String pluginInstallCode) {
			this.pluginInstallCode = pluginInstallCode;
		}

		public String getPluginVersion() {
			return this.pluginVersion;
		}

		public void setPluginVersion(String pluginVersion) {
			this.pluginVersion = pluginVersion;
		}

		public List<AegisSuspiciousConfig> getAegisSuspiciousConfigList() {
			return this.aegisSuspiciousConfigList;
		}

		public void setAegisSuspiciousConfigList(List<AegisSuspiciousConfig> aegisSuspiciousConfigList) {
			this.aegisSuspiciousConfigList = aegisSuspiciousConfigList;
		}

		public static class AegisSuspiciousConfig {

			private String type;

			private Boolean config;

			private String msg;

			private Boolean overallConfig;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Boolean getConfig() {
				return this.config;
			}

			public void setConfig(Boolean config) {
				this.config = config;
			}

			public String getMsg() {
				return this.msg;
			}

			public void setMsg(String msg) {
				this.msg = msg;
			}

			public Boolean getOverallConfig() {
				return this.overallConfig;
			}

			public void setOverallConfig(Boolean overallConfig) {
				this.overallConfig = overallConfig;
			}
		}
	}

	@Override
	public ListPluginForUuidResponse getInstance(UnmarshallerContext context) {
		return	ListPluginForUuidResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
