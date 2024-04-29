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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.DescribeAddonReleaseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAddonReleaseResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String success;

	private String message;

	private Data data;

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

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String config;

		private Release release;

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public Release getRelease() {
			return this.release;
		}

		public void setRelease(Release release) {
			this.release = release;
		}

		public static class Release {

			private String addonName;

			private Long alertRuleCount;

			private String createTime;

			private Long dashboardCount;

			private Long exporterCount;

			private Boolean haveConfig;

			private String installUserId;

			private String language;

			private String releaseId;

			private String releaseName;

			private String scene;

			private String status;

			private String updateTime;

			private String userID;

			private String version;

			private String environmentId;

			private String regionId;

			private Boolean managed;

			private List<ConditionsItem> conditions;

			public String getAddonName() {
				return this.addonName;
			}

			public void setAddonName(String addonName) {
				this.addonName = addonName;
			}

			public Long getAlertRuleCount() {
				return this.alertRuleCount;
			}

			public void setAlertRuleCount(Long alertRuleCount) {
				this.alertRuleCount = alertRuleCount;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public Long getDashboardCount() {
				return this.dashboardCount;
			}

			public void setDashboardCount(Long dashboardCount) {
				this.dashboardCount = dashboardCount;
			}

			public Long getExporterCount() {
				return this.exporterCount;
			}

			public void setExporterCount(Long exporterCount) {
				this.exporterCount = exporterCount;
			}

			public Boolean getHaveConfig() {
				return this.haveConfig;
			}

			public void setHaveConfig(Boolean haveConfig) {
				this.haveConfig = haveConfig;
			}

			public String getInstallUserId() {
				return this.installUserId;
			}

			public void setInstallUserId(String installUserId) {
				this.installUserId = installUserId;
			}

			public String getLanguage() {
				return this.language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}

			public String getReleaseId() {
				return this.releaseId;
			}

			public void setReleaseId(String releaseId) {
				this.releaseId = releaseId;
			}

			public String getReleaseName() {
				return this.releaseName;
			}

			public void setReleaseName(String releaseName) {
				this.releaseName = releaseName;
			}

			public String getScene() {
				return this.scene;
			}

			public void setScene(String scene) {
				this.scene = scene;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public String getUserID() {
				return this.userID;
			}

			public void setUserID(String userID) {
				this.userID = userID;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getEnvironmentId() {
				return this.environmentId;
			}

			public void setEnvironmentId(String environmentId) {
				this.environmentId = environmentId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public Boolean getManaged() {
				return this.managed;
			}

			public void setManaged(Boolean managed) {
				this.managed = managed;
			}

			public List<ConditionsItem> getConditions() {
				return this.conditions;
			}

			public void setConditions(List<ConditionsItem> conditions) {
				this.conditions = conditions;
			}

			public static class ConditionsItem {

				private String firstTransitionTime;

				private String lastTransitionTime;

				private String message;

				private String reason;

				private String status;

				private String type;

				public String getFirstTransitionTime() {
					return this.firstTransitionTime;
				}

				public void setFirstTransitionTime(String firstTransitionTime) {
					this.firstTransitionTime = firstTransitionTime;
				}

				public String getLastTransitionTime() {
					return this.lastTransitionTime;
				}

				public void setLastTransitionTime(String lastTransitionTime) {
					this.lastTransitionTime = lastTransitionTime;
				}

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}

				public String getReason() {
					return this.reason;
				}

				public void setReason(String reason) {
					this.reason = reason;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}
		}
	}

	@Override
	public DescribeAddonReleaseResponse getInstance(UnmarshallerContext context) {
		return	DescribeAddonReleaseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
