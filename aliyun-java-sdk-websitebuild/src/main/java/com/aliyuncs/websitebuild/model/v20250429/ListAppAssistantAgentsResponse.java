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

package com.aliyuncs.websitebuild.model.v20250429;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.websitebuild.transform.v20250429.ListAppAssistantAgentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAppAssistantAgentsResponse extends AcsResponse {

	private String requestId;

	private String dynamicCode;

	private String dynamicMessage;

	private Boolean synchro;

	private String accessDeniedDetail;

	private String rootErrorMsg;

	private String rootErrorCode;

	private Boolean allowRetry;

	private String appName;

	private List<ModuleItem> module;

	private List<String> errorArgs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Boolean getSynchro() {
		return this.synchro;
	}

	public void setSynchro(Boolean synchro) {
		this.synchro = synchro;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getRootErrorMsg() {
		return this.rootErrorMsg;
	}

	public void setRootErrorMsg(String rootErrorMsg) {
		this.rootErrorMsg = rootErrorMsg;
	}

	public String getRootErrorCode() {
		return this.rootErrorCode;
	}

	public void setRootErrorCode(String rootErrorCode) {
		this.rootErrorCode = rootErrorCode;
	}

	public Boolean getAllowRetry() {
		return this.allowRetry;
	}

	public void setAllowRetry(Boolean allowRetry) {
		this.allowRetry = allowRetry;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public List<ModuleItem> getModule() {
		return this.module;
	}

	public void setModule(List<ModuleItem> module) {
		this.module = module;
	}

	public List<String> getErrorArgs() {
		return this.errorArgs;
	}

	public void setErrorArgs(List<String> errorArgs) {
		this.errorArgs = errorArgs;
	}

	public static class ModuleItem {

		private String agentId;

		private String agentName;

		private String bizId;

		private String userId;

		private String platformType;

		private String status;

		private String platformAppId;

		private Map<Object,Object> extraParams;

		private String gmtCreate;

		private String gmtModified;

		private Credential credential;

		private EmbedConfig embedConfig;

		public String getAgentId() {
			return this.agentId;
		}

		public void setAgentId(String agentId) {
			this.agentId = agentId;
		}

		public String getAgentName() {
			return this.agentName;
		}

		public void setAgentName(String agentName) {
			this.agentName = agentName;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getPlatformType() {
			return this.platformType;
		}

		public void setPlatformType(String platformType) {
			this.platformType = platformType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPlatformAppId() {
			return this.platformAppId;
		}

		public void setPlatformAppId(String platformAppId) {
			this.platformAppId = platformAppId;
		}

		public Map<Object,Object> getExtraParams() {
			return this.extraParams;
		}

		public void setExtraParams(Map<Object,Object> extraParams) {
			this.extraParams = extraParams;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Credential getCredential() {
			return this.credential;
		}

		public void setCredential(Credential credential) {
			this.credential = credential;
		}

		public EmbedConfig getEmbedConfig() {
			return this.embedConfig;
		}

		public void setEmbedConfig(EmbedConfig embedConfig) {
			this.embedConfig = embedConfig;
		}

		public static class Credential {

			private String username;

			private String password;

			private String apiKey;

			private String apiSecret;

			private Map<Object,Object> extra;

			public String getUsername() {
				return this.username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getApiKey() {
				return this.apiKey;
			}

			public void setApiKey(String apiKey) {
				this.apiKey = apiKey;
			}

			public String getApiSecret() {
				return this.apiSecret;
			}

			public void setApiSecret(String apiSecret) {
				this.apiSecret = apiSecret;
			}

			public Map<Object,Object> getExtra() {
				return this.extra;
			}

			public void setExtra(Map<Object,Object> extra) {
				this.extra = extra;
			}
		}

		public static class EmbedConfig {

			private String rawScript;

			private Map<Object,Object> extra;

			public String getRawScript() {
				return this.rawScript;
			}

			public void setRawScript(String rawScript) {
				this.rawScript = rawScript;
			}

			public Map<Object,Object> getExtra() {
				return this.extra;
			}

			public void setExtra(Map<Object,Object> extra) {
				this.extra = extra;
			}
		}
	}

	@Override
	public ListAppAssistantAgentsResponse getInstance(UnmarshallerContext context) {
		return	ListAppAssistantAgentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
