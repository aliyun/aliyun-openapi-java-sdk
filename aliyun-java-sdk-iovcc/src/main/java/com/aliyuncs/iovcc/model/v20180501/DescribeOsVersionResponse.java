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
import com.aliyuncs.iovcc.transform.v20180501.DescribeOsVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOsVersionResponse extends AcsResponse {

	private String requestId;

	private OsVersion osVersion;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public OsVersion getOsVersion() {
		return this.osVersion;
	}

	public void setOsVersion(OsVersion osVersion) {
		this.osVersion = osVersion;
	}

	public static class OsVersion {

		private Long id;

		private String deviceModelId;

		private String systemVersion;

		private String releaseNote;

		private String remark;

		private String status;

		private String blackVersionList;

		private String whiteVersionList;

		private String minClientVersion;

		private String maxClientVersion;

		private String isMilestone;

		private String isForceUpgrade;

		private String isForceNightUpgrade;

		private String gmtCreate;

		private String gmtModify;

		private String statusName;

		private String deviceModelName;

		private String enableMobileDownload;

		private String mobileDownloadMaxSize;

		private List<RomListItem> romList;

		private NightUpgradeOption nightUpgradeOption;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDeviceModelId() {
			return this.deviceModelId;
		}

		public void setDeviceModelId(String deviceModelId) {
			this.deviceModelId = deviceModelId;
		}

		public String getSystemVersion() {
			return this.systemVersion;
		}

		public void setSystemVersion(String systemVersion) {
			this.systemVersion = systemVersion;
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

		public String getMinClientVersion() {
			return this.minClientVersion;
		}

		public void setMinClientVersion(String minClientVersion) {
			this.minClientVersion = minClientVersion;
		}

		public String getMaxClientVersion() {
			return this.maxClientVersion;
		}

		public void setMaxClientVersion(String maxClientVersion) {
			this.maxClientVersion = maxClientVersion;
		}

		public String getIsMilestone() {
			return this.isMilestone;
		}

		public void setIsMilestone(String isMilestone) {
			this.isMilestone = isMilestone;
		}

		public String getIsForceUpgrade() {
			return this.isForceUpgrade;
		}

		public void setIsForceUpgrade(String isForceUpgrade) {
			this.isForceUpgrade = isForceUpgrade;
		}

		public String getIsForceNightUpgrade() {
			return this.isForceNightUpgrade;
		}

		public void setIsForceNightUpgrade(String isForceNightUpgrade) {
			this.isForceNightUpgrade = isForceNightUpgrade;
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

		public String getStatusName() {
			return this.statusName;
		}

		public void setStatusName(String statusName) {
			this.statusName = statusName;
		}

		public String getDeviceModelName() {
			return this.deviceModelName;
		}

		public void setDeviceModelName(String deviceModelName) {
			this.deviceModelName = deviceModelName;
		}

		public String getEnableMobileDownload() {
			return this.enableMobileDownload;
		}

		public void setEnableMobileDownload(String enableMobileDownload) {
			this.enableMobileDownload = enableMobileDownload;
		}

		public String getMobileDownloadMaxSize() {
			return this.mobileDownloadMaxSize;
		}

		public void setMobileDownloadMaxSize(String mobileDownloadMaxSize) {
			this.mobileDownloadMaxSize = mobileDownloadMaxSize;
		}

		public List<RomListItem> getRomList() {
			return this.romList;
		}

		public void setRomList(List<RomListItem> romList) {
			this.romList = romList;
		}

		public NightUpgradeOption getNightUpgradeOption() {
			return this.nightUpgradeOption;
		}

		public void setNightUpgradeOption(NightUpgradeOption nightUpgradeOption) {
			this.nightUpgradeOption = nightUpgradeOption;
		}

		public static class RomListItem {

			private Long id;

			private Long versionId;

			private String baseVersion;

			private String downloadUrl;

			private String originalUrl;

			private String md5;

			private String size;

			private String splitNum;

			private String gmtCreate;

			private String gmtModify;

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

			public String getBaseVersion() {
				return this.baseVersion;
			}

			public void setBaseVersion(String baseVersion) {
				this.baseVersion = baseVersion;
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

			public String getMd5() {
				return this.md5;
			}

			public void setMd5(String md5) {
				this.md5 = md5;
			}

			public String getSize() {
				return this.size;
			}

			public void setSize(String size) {
				this.size = size;
			}

			public String getSplitNum() {
				return this.splitNum;
			}

			public void setSplitNum(String splitNum) {
				this.splitNum = splitNum;
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
		}

		public static class NightUpgradeOption {

			private String downloadType;

			private String isShowTip;

			private String isAllowedCancel;

			public String getDownloadType() {
				return this.downloadType;
			}

			public void setDownloadType(String downloadType) {
				this.downloadType = downloadType;
			}

			public String getIsShowTip() {
				return this.isShowTip;
			}

			public void setIsShowTip(String isShowTip) {
				this.isShowTip = isShowTip;
			}

			public String getIsAllowedCancel() {
				return this.isAllowedCancel;
			}

			public void setIsAllowedCancel(String isAllowedCancel) {
				this.isAllowedCancel = isAllowedCancel;
			}
		}
	}

	@Override
	public DescribeOsVersionResponse getInstance(UnmarshallerContext context) {
		return	DescribeOsVersionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
