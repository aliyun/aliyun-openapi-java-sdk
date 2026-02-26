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

package com.aliyuncs.eds_aic.model.v20230930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_aic.transform.v20230930.DescribeAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppsResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private String nextToken;

	private List<AppInfoModel> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<AppInfoModel> getData() {
		return this.data;
	}

	public void setData(List<AppInfoModel> data) {
		this.data = data;
	}

	public static class AppInfoModel {

		private String appName;

		private Integer appId;

		private String androidAppVersion;

		private Integer appStatus;

		private String iconUrl;

		private String gmtCreate;

		private String gmtModified;

		private String description;

		private String installStatus;

		private String status;

		private String installationStatus;

		private String bizRegionId;

		private String packageName;

		private String apkSize;

		private String mD5;

		private String appType;

		private List<String> instanceGroupList;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Integer getAppId() {
			return this.appId;
		}

		public void setAppId(Integer appId) {
			this.appId = appId;
		}

		public String getAndroidAppVersion() {
			return this.androidAppVersion;
		}

		public void setAndroidAppVersion(String androidAppVersion) {
			this.androidAppVersion = androidAppVersion;
		}

		public Integer getAppStatus() {
			return this.appStatus;
		}

		public void setAppStatus(Integer appStatus) {
			this.appStatus = appStatus;
		}

		public String getIconUrl() {
			return this.iconUrl;
		}

		public void setIconUrl(String iconUrl) {
			this.iconUrl = iconUrl;
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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getInstallStatus() {
			return this.installStatus;
		}

		public void setInstallStatus(String installStatus) {
			this.installStatus = installStatus;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getInstallationStatus() {
			return this.installationStatus;
		}

		public void setInstallationStatus(String installationStatus) {
			this.installationStatus = installationStatus;
		}

		public String getBizRegionId() {
			return this.bizRegionId;
		}

		public void setBizRegionId(String bizRegionId) {
			this.bizRegionId = bizRegionId;
		}

		public String getPackageName() {
			return this.packageName;
		}

		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}

		public String getApkSize() {
			return this.apkSize;
		}

		public void setApkSize(String apkSize) {
			this.apkSize = apkSize;
		}

		public String getMD5() {
			return this.mD5;
		}

		public void setMD5(String mD5) {
			this.mD5 = mD5;
		}

		public String getAppType() {
			return this.appType;
		}

		public void setAppType(String appType) {
			this.appType = appType;
		}

		public List<String> getInstanceGroupList() {
			return this.instanceGroupList;
		}

		public void setInstanceGroupList(List<String> instanceGroupList) {
			this.instanceGroupList = instanceGroupList;
		}
	}

	@Override
	public DescribeAppsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
