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
import com.aliyuncs.mpaas.transform.v20201028.ListMappCenterAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMappCenterAppsResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private ListMappCenterAppResult listMappCenterAppResult;

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ListMappCenterAppResult getListMappCenterAppResult() {
		return this.listMappCenterAppResult;
	}

	public void setListMappCenterAppResult(ListMappCenterAppResult listMappCenterAppResult) {
		this.listMappCenterAppResult = listMappCenterAppResult;
	}

	public static class ListMappCenterAppResult {

		private Boolean success;

		private String resultMsg;

		private List<MappCenterAppListItem> mappCenterAppList;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getResultMsg() {
			return this.resultMsg;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}

		public List<MappCenterAppListItem> getMappCenterAppList() {
			return this.mappCenterAppList;
		}

		public void setMappCenterAppList(List<MappCenterAppListItem> mappCenterAppList) {
			this.mappCenterAppList = mappCenterAppList;
		}

		public static class MappCenterAppListItem {

			private Long type;

			private Long status;

			private String gmtModified;

			private String appDesc;

			private String creator;

			private String appIcon;

			private String appName;

			private String appSecret;

			private String modifier;

			private String appId;

			private String monitorJson;

			private String gmtCreate;

			private Long id;

			private String tenantId;

			private AndroidConfig androidConfig;

			private IosConfig iosConfig;

			public Long getType() {
				return this.type;
			}

			public void setType(Long type) {
				this.type = type;
			}

			public Long getStatus() {
				return this.status;
			}

			public void setStatus(Long status) {
				this.status = status;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getAppDesc() {
				return this.appDesc;
			}

			public void setAppDesc(String appDesc) {
				this.appDesc = appDesc;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getAppIcon() {
				return this.appIcon;
			}

			public void setAppIcon(String appIcon) {
				this.appIcon = appIcon;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getAppSecret() {
				return this.appSecret;
			}

			public void setAppSecret(String appSecret) {
				this.appSecret = appSecret;
			}

			public String getModifier() {
				return this.modifier;
			}

			public void setModifier(String modifier) {
				this.modifier = modifier;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getMonitorJson() {
				return this.monitorJson;
			}

			public void setMonitorJson(String monitorJson) {
				this.monitorJson = monitorJson;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public AndroidConfig getAndroidConfig() {
				return this.androidConfig;
			}

			public void setAndroidConfig(AndroidConfig androidConfig) {
				this.androidConfig = androidConfig;
			}

			public IosConfig getIosConfig() {
				return this.iosConfig;
			}

			public void setIosConfig(IosConfig iosConfig) {
				this.iosConfig = iosConfig;
			}

			public static class AndroidConfig {

				private String packageName;

				private String certRSA;

				public String getPackageName() {
					return this.packageName;
				}

				public void setPackageName(String packageName) {
					this.packageName = packageName;
				}

				public String getCertRSA() {
					return this.certRSA;
				}

				public void setCertRSA(String certRSA) {
					this.certRSA = certRSA;
				}
			}

			public static class IosConfig {

				private String bundleId;

				public String getBundleId() {
					return this.bundleId;
				}

				public void setBundleId(String bundleId) {
					this.bundleId = bundleId;
				}
			}
		}
	}

	@Override
	public ListMappCenterAppsResponse getInstance(UnmarshallerContext context) {
		return	ListMappCenterAppsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
