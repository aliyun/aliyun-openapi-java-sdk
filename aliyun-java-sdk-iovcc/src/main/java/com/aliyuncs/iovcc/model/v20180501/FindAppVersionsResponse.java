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

package com.aliyuncs.iovcc.model.v20180501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.FindAppVersionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindAppVersionsResponse extends AcsResponse {

	private String requestId;

	private AppVersionList appVersionList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AppVersionList getAppVersionList() {
		return this.appVersionList;
	}

	public void setAppVersionList(AppVersionList appVersionList) {
		this.appVersionList = appVersionList;
	}

	public static class AppVersionList {

		private Integer totalCount;

		private List<ItemsItem> items;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<ItemsItem> getItems() {
			return this.items;
		}

		public void setItems(List<ItemsItem> items) {
			this.items = items;
		}

		public static class ItemsItem {

			private Long id;

			private String appId;

			private String versionCode;

			private String status;

			private String gmtCreate;

			private String gmtModify;

			private String appVersion;

			private String isNeedRestart;

			private String isForceUpgrade;

			private String isSilentUpgrade;

			private String isAllowNewInstall;

			private String restartType;

			private String restartAppType;

			private String restartAppParam;

			private String installType;

			private String appName;

			private String appPackageName;

			private String statusName;

			private Long gmtCreateTimestamp;

			private Long gmtModifyTimestamp;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getVersionCode() {
				return this.versionCode;
			}

			public void setVersionCode(String versionCode) {
				this.versionCode = versionCode;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModify() {
				return this.gmtModify;
			}

			public void setGmtModify(String gmtModify) {
				this.gmtModify = gmtModify;
			}

			public String getAppVersion() {
				return this.appVersion;
			}

			public void setAppVersion(String appVersion) {
				this.appVersion = appVersion;
			}

			public String getIsNeedRestart() {
				return this.isNeedRestart;
			}

			public void setIsNeedRestart(String isNeedRestart) {
				this.isNeedRestart = isNeedRestart;
			}

			public String getIsForceUpgrade() {
				return this.isForceUpgrade;
			}

			public void setIsForceUpgrade(String isForceUpgrade) {
				this.isForceUpgrade = isForceUpgrade;
			}

			public String getIsSilentUpgrade() {
				return this.isSilentUpgrade;
			}

			public void setIsSilentUpgrade(String isSilentUpgrade) {
				this.isSilentUpgrade = isSilentUpgrade;
			}

			public String getIsAllowNewInstall() {
				return this.isAllowNewInstall;
			}

			public void setIsAllowNewInstall(String isAllowNewInstall) {
				this.isAllowNewInstall = isAllowNewInstall;
			}

			public String getRestartType() {
				return this.restartType;
			}

			public void setRestartType(String restartType) {
				this.restartType = restartType;
			}

			public String getRestartAppType() {
				return this.restartAppType;
			}

			public void setRestartAppType(String restartAppType) {
				this.restartAppType = restartAppType;
			}

			public String getRestartAppParam() {
				return this.restartAppParam;
			}

			public void setRestartAppParam(String restartAppParam) {
				this.restartAppParam = restartAppParam;
			}

			public String getInstallType() {
				return this.installType;
			}

			public void setInstallType(String installType) {
				this.installType = installType;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getAppPackageName() {
				return this.appPackageName;
			}

			public void setAppPackageName(String appPackageName) {
				this.appPackageName = appPackageName;
			}

			public String getStatusName() {
				return this.statusName;
			}

			public void setStatusName(String statusName) {
				this.statusName = statusName;
			}

			public Long getGmtCreateTimestamp() {
				return this.gmtCreateTimestamp;
			}

			public void setGmtCreateTimestamp(Long gmtCreateTimestamp) {
				this.gmtCreateTimestamp = gmtCreateTimestamp;
			}

			public Long getGmtModifyTimestamp() {
				return this.gmtModifyTimestamp;
			}

			public void setGmtModifyTimestamp(Long gmtModifyTimestamp) {
				this.gmtModifyTimestamp = gmtModifyTimestamp;
			}
		}
	}

	@Override
	public FindAppVersionsResponse getInstance(UnmarshallerContext context) {
		return	FindAppVersionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
