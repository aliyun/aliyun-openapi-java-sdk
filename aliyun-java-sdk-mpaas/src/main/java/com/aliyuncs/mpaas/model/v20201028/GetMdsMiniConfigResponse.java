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

package com.aliyuncs.mpaas.model.v20201028;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20201028.GetMdsMiniConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMdsMiniConfigResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private ResultContent resultContent;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public ResultContent getResultContent() {
		return this.resultContent;
	}

	public void setResultContent(ResultContent resultContent) {
		this.resultContent = resultContent;
	}

	public static class ResultContent {

		private String requestId;

		private Data data;

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public Data getData() {
			return this.data;
		}

		public void setData(Data data) {
			this.data = data;
		}

		public static class Data {

			private String requestId;

			private String resultMsg;

			private Boolean success;

			private Content content;

			public String getRequestId() {
				return this.requestId;
			}

			public void setRequestId(String requestId) {
				this.requestId = requestId;
			}

			public String getResultMsg() {
				return this.resultMsg;
			}

			public void setResultMsg(String resultMsg) {
				this.resultMsg = resultMsg;
			}

			public Boolean getSuccess() {
				return this.success;
			}

			public void setSuccess(Boolean success) {
				this.success = success;
			}

			public Content getContent() {
				return this.content;
			}

			public void setContent(Content content) {
				this.content = content;
			}

			public static class Content {

				private String appCode;

				private String enableServerDomainCount;

				private String h5Id;

				private String h5Name;

				private List<ApiConfigListItem> apiConfigList;

				private List<ServerDomainConfigListItem> serverDomainConfigList;

				private List<WebviewDomainConfigListItem> webviewDomainConfigList;

				private PrivilegeSwitch privilegeSwitch;

				public String getAppCode() {
					return this.appCode;
				}

				public void setAppCode(String appCode) {
					this.appCode = appCode;
				}

				public String getEnableServerDomainCount() {
					return this.enableServerDomainCount;
				}

				public void setEnableServerDomainCount(String enableServerDomainCount) {
					this.enableServerDomainCount = enableServerDomainCount;
				}

				public String getH5Id() {
					return this.h5Id;
				}

				public void setH5Id(String h5Id) {
					this.h5Id = h5Id;
				}

				public String getH5Name() {
					return this.h5Name;
				}

				public void setH5Name(String h5Name) {
					this.h5Name = h5Name;
				}

				public List<ApiConfigListItem> getApiConfigList() {
					return this.apiConfigList;
				}

				public void setApiConfigList(List<ApiConfigListItem> apiConfigList) {
					this.apiConfigList = apiConfigList;
				}

				public List<ServerDomainConfigListItem> getServerDomainConfigList() {
					return this.serverDomainConfigList;
				}

				public void setServerDomainConfigList(List<ServerDomainConfigListItem> serverDomainConfigList) {
					this.serverDomainConfigList = serverDomainConfigList;
				}

				public List<WebviewDomainConfigListItem> getWebviewDomainConfigList() {
					return this.webviewDomainConfigList;
				}

				public void setWebviewDomainConfigList(List<WebviewDomainConfigListItem> webviewDomainConfigList) {
					this.webviewDomainConfigList = webviewDomainConfigList;
				}

				public PrivilegeSwitch getPrivilegeSwitch() {
					return this.privilegeSwitch;
				}

				public void setPrivilegeSwitch(PrivilegeSwitch privilegeSwitch) {
					this.privilegeSwitch = privilegeSwitch;
				}

				public static class ApiConfigListItem {

					private String appCode;

					private Long configStatus;

					private String configType;

					private String configValue;

					private String description;

					private String gmtCreate;

					private String gmtModified;

					private String h5Id;

					private String h5Name;

					private Long id;

					public String getAppCode() {
						return this.appCode;
					}

					public void setAppCode(String appCode) {
						this.appCode = appCode;
					}

					public Long getConfigStatus() {
						return this.configStatus;
					}

					public void setConfigStatus(Long configStatus) {
						this.configStatus = configStatus;
					}

					public String getConfigType() {
						return this.configType;
					}

					public void setConfigType(String configType) {
						this.configType = configType;
					}

					public String getConfigValue() {
						return this.configValue;
					}

					public void setConfigValue(String configValue) {
						this.configValue = configValue;
					}

					public String getDescription() {
						return this.description;
					}

					public void setDescription(String description) {
						this.description = description;
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

					public String getH5Id() {
						return this.h5Id;
					}

					public void setH5Id(String h5Id) {
						this.h5Id = h5Id;
					}

					public String getH5Name() {
						return this.h5Name;
					}

					public void setH5Name(String h5Name) {
						this.h5Name = h5Name;
					}

					public Long getId() {
						return this.id;
					}

					public void setId(Long id) {
						this.id = id;
					}
				}

				public static class ServerDomainConfigListItem {

					private String appCode;

					private Long configStatus;

					private String configType;

					private String configValue;

					private String description;

					private String gmtCreate;

					private String gmtModified;

					private String h5Id;

					private String h5Name;

					private Long id;

					public String getAppCode() {
						return this.appCode;
					}

					public void setAppCode(String appCode) {
						this.appCode = appCode;
					}

					public Long getConfigStatus() {
						return this.configStatus;
					}

					public void setConfigStatus(Long configStatus) {
						this.configStatus = configStatus;
					}

					public String getConfigType() {
						return this.configType;
					}

					public void setConfigType(String configType) {
						this.configType = configType;
					}

					public String getConfigValue() {
						return this.configValue;
					}

					public void setConfigValue(String configValue) {
						this.configValue = configValue;
					}

					public String getDescription() {
						return this.description;
					}

					public void setDescription(String description) {
						this.description = description;
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

					public String getH5Id() {
						return this.h5Id;
					}

					public void setH5Id(String h5Id) {
						this.h5Id = h5Id;
					}

					public String getH5Name() {
						return this.h5Name;
					}

					public void setH5Name(String h5Name) {
						this.h5Name = h5Name;
					}

					public Long getId() {
						return this.id;
					}

					public void setId(Long id) {
						this.id = id;
					}
				}

				public static class WebviewDomainConfigListItem {

					private String appCode;

					private Long configStatus;

					private String configType;

					private String configValue;

					private String description;

					private String gmtCreate;

					private String gmtModified;

					private String h5Id;

					private String h5Name;

					private Long id;

					public String getAppCode() {
						return this.appCode;
					}

					public void setAppCode(String appCode) {
						this.appCode = appCode;
					}

					public Long getConfigStatus() {
						return this.configStatus;
					}

					public void setConfigStatus(Long configStatus) {
						this.configStatus = configStatus;
					}

					public String getConfigType() {
						return this.configType;
					}

					public void setConfigType(String configType) {
						this.configType = configType;
					}

					public String getConfigValue() {
						return this.configValue;
					}

					public void setConfigValue(String configValue) {
						this.configValue = configValue;
					}

					public String getDescription() {
						return this.description;
					}

					public void setDescription(String description) {
						this.description = description;
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

					public String getH5Id() {
						return this.h5Id;
					}

					public void setH5Id(String h5Id) {
						this.h5Id = h5Id;
					}

					public String getH5Name() {
						return this.h5Name;
					}

					public void setH5Name(String h5Name) {
						this.h5Name = h5Name;
					}

					public Long getId() {
						return this.id;
					}

					public void setId(Long id) {
						this.id = id;
					}
				}

				public static class PrivilegeSwitch {

					private String appCode;

					private Long configStatus;

					private String configType;

					private String configValue;

					private String description;

					private String gmtCreate;

					private String gmtModified;

					private String h5Id;

					private String h5Name;

					private Long id;

					public String getAppCode() {
						return this.appCode;
					}

					public void setAppCode(String appCode) {
						this.appCode = appCode;
					}

					public Long getConfigStatus() {
						return this.configStatus;
					}

					public void setConfigStatus(Long configStatus) {
						this.configStatus = configStatus;
					}

					public String getConfigType() {
						return this.configType;
					}

					public void setConfigType(String configType) {
						this.configType = configType;
					}

					public String getConfigValue() {
						return this.configValue;
					}

					public void setConfigValue(String configValue) {
						this.configValue = configValue;
					}

					public String getDescription() {
						return this.description;
					}

					public void setDescription(String description) {
						this.description = description;
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

					public String getH5Id() {
						return this.h5Id;
					}

					public void setH5Id(String h5Id) {
						this.h5Id = h5Id;
					}

					public String getH5Name() {
						return this.h5Name;
					}

					public void setH5Name(String h5Name) {
						this.h5Name = h5Name;
					}

					public Long getId() {
						return this.id;
					}

					public void setId(Long id) {
						this.id = id;
					}
				}
			}
		}
	}

	@Override
	public GetMdsMiniConfigResponse getInstance(UnmarshallerContext context) {
		return	GetMdsMiniConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
