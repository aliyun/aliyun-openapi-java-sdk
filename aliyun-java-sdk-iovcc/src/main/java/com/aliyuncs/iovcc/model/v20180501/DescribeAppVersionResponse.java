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
import com.aliyuncs.iovcc.transform.v20180501.DescribeAppVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppVersionResponse extends AcsResponse {

	private String requestId;

	private AppVersion appVersion;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AppVersion getAppVersion() {
		return this.appVersion;
	}

	public void setAppVersion(AppVersion appVersion) {
		this.appVersion = appVersion;
	}

	public static class AppVersion {

		private Long id;

		private String appId;

		private Long versionCode;

		private String releaseNote;

		private String remark;

		private String status;

		private String appVersion;

		private String downloadUrl;

		private String originalUrl;

		private String isForceUpgrade;

		private String isSilentUpgrade;

		private String md5;

		private String apkMd5;

		private String size;

		private String gmtCreate;

		private String gmtModify;

		private String isNeedRestart;

		private String isAllowNewInstall;

		private String restartType;

		private String restartAppType;

		private String restartAppParam;

		private String installType;

		private String blackVersionList;

		private String whiteVersionList;

		private String appName;

		private String statusName;

		private String packageName;

		private List<AdaptersItem> adapters;

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

		public Long getVersionCode() {
			return this.versionCode;
		}

		public void setVersionCode(Long versionCode) {
			this.versionCode = versionCode;
		}

		public String getReleaseNote() {
			return this.releaseNote;
		}

		public void setReleaseNote(String releaseNote) {
			this.releaseNote = releaseNote;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAppVersion() {
			return this.appVersion;
		}

		public void setAppVersion(String appVersion) {
			this.appVersion = appVersion;
		}

		public String getDownloadUrl() {
			return this.downloadUrl;
		}

		public void setDownloadUrl(String downloadUrl) {
			this.downloadUrl = downloadUrl;
		}

		public String getOriginalUrl() {
			return this.originalUrl;
		}

		public void setOriginalUrl(String originalUrl) {
			this.originalUrl = originalUrl;
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

		public String getMd5() {
			return this.md5;
		}

		public void setMd5(String md5) {
			this.md5 = md5;
		}

		public String getApkMd5() {
			return this.apkMd5;
		}

		public void setApkMd5(String apkMd5) {
			this.apkMd5 = apkMd5;
		}

		public String getSize() {
			return this.size;
		}

		public void setSize(String size) {
			this.size = size;
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

		public String getIsNeedRestart() {
			return this.isNeedRestart;
		}

		public void setIsNeedRestart(String isNeedRestart) {
			this.isNeedRestart = isNeedRestart;
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

		public String getBlackVersionList() {
			return this.blackVersionList;
		}

		public void setBlackVersionList(String blackVersionList) {
			this.blackVersionList = blackVersionList;
		}

		public String getWhiteVersionList() {
			return this.whiteVersionList;
		}

		public void setWhiteVersionList(String whiteVersionList) {
			this.whiteVersionList = whiteVersionList;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getStatusName() {
			return this.statusName;
		}

		public void setStatusName(String statusName) {
			this.statusName = statusName;
		}

		public String getPackageName() {
			return this.packageName;
		}

		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}

		public List<AdaptersItem> getAdapters() {
			return this.adapters;
		}

		public void setAdapters(List<AdaptersItem> adapters) {
			this.adapters = adapters;
		}

		public static class AdaptersItem {

			private Long id;

			private Long versionId;

			private String deviceModelId;

			private String minOsVersion;

			private String maxOsVersion;

			private String deviceModelName;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getVersionId() {
				return this.versionId;
			}

			public void setVersionId(Long versionId) {
				this.versionId = versionId;
			}

			public String getDeviceModelId() {
				return this.deviceModelId;
			}

			public void setDeviceModelId(String deviceModelId) {
				this.deviceModelId = deviceModelId;
			}

			public String getMinOsVersion() {
				return this.minOsVersion;
			}

			public void setMinOsVersion(String minOsVersion) {
				this.minOsVersion = minOsVersion;
			}

			public String getMaxOsVersion() {
				return this.maxOsVersion;
			}

			public void setMaxOsVersion(String maxOsVersion) {
				this.maxOsVersion = maxOsVersion;
			}

			public String getDeviceModelName() {
				return this.deviceModelName;
			}

			public void setDeviceModelName(String deviceModelName) {
				this.deviceModelName = deviceModelName;
			}
		}
	}

	@Override
	public DescribeAppVersionResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppVersionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
