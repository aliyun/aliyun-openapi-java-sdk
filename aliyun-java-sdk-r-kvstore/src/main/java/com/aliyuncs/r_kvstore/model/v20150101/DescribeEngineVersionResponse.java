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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeEngineVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEngineVersionResponse extends AcsResponse {

	private Boolean isLatestVersion;

	private String requestId;

	private String proxyMinorVersion;

	private String dBVersionRelease;

	private String proxyVersionRelease;

	private Boolean enableUpgradeMajorVersion;

	private Boolean enableUpgradeMinorVersion;

	private String majorVersion;

	private String engine;

	private String minorVersion;

	private String isRedisCompatibleVersion;

	private String isSSLEnable;

	private String isNewSSLMode;

	private String isAutoUpgradeOpen;

	private DBLatestMinorVersion dBLatestMinorVersion;

	private ProxyLatestMinorVersion proxyLatestMinorVersion;

	public Boolean getIsLatestVersion() {
		return this.isLatestVersion;
	}

	public void setIsLatestVersion(Boolean isLatestVersion) {
		this.isLatestVersion = isLatestVersion;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProxyMinorVersion() {
		return this.proxyMinorVersion;
	}

	public void setProxyMinorVersion(String proxyMinorVersion) {
		this.proxyMinorVersion = proxyMinorVersion;
	}

	public String getDBVersionRelease() {
		return this.dBVersionRelease;
	}

	public void setDBVersionRelease(String dBVersionRelease) {
		this.dBVersionRelease = dBVersionRelease;
	}

	public String getProxyVersionRelease() {
		return this.proxyVersionRelease;
	}

	public void setProxyVersionRelease(String proxyVersionRelease) {
		this.proxyVersionRelease = proxyVersionRelease;
	}

	public Boolean getEnableUpgradeMajorVersion() {
		return this.enableUpgradeMajorVersion;
	}

	public void setEnableUpgradeMajorVersion(Boolean enableUpgradeMajorVersion) {
		this.enableUpgradeMajorVersion = enableUpgradeMajorVersion;
	}

	public Boolean getEnableUpgradeMinorVersion() {
		return this.enableUpgradeMinorVersion;
	}

	public void setEnableUpgradeMinorVersion(Boolean enableUpgradeMinorVersion) {
		this.enableUpgradeMinorVersion = enableUpgradeMinorVersion;
	}

	public String getMajorVersion() {
		return this.majorVersion;
	}

	public void setMajorVersion(String majorVersion) {
		this.majorVersion = majorVersion;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getMinorVersion() {
		return this.minorVersion;
	}

	public void setMinorVersion(String minorVersion) {
		this.minorVersion = minorVersion;
	}

	public String getIsRedisCompatibleVersion() {
		return this.isRedisCompatibleVersion;
	}

	public void setIsRedisCompatibleVersion(String isRedisCompatibleVersion) {
		this.isRedisCompatibleVersion = isRedisCompatibleVersion;
	}

	public String getIsSSLEnable() {
		return this.isSSLEnable;
	}

	public void setIsSSLEnable(String isSSLEnable) {
		this.isSSLEnable = isSSLEnable;
	}

	public String getIsNewSSLMode() {
		return this.isNewSSLMode;
	}

	public void setIsNewSSLMode(String isNewSSLMode) {
		this.isNewSSLMode = isNewSSLMode;
	}

	public String getIsAutoUpgradeOpen() {
		return this.isAutoUpgradeOpen;
	}

	public void setIsAutoUpgradeOpen(String isAutoUpgradeOpen) {
		this.isAutoUpgradeOpen = isAutoUpgradeOpen;
	}

	public DBLatestMinorVersion getDBLatestMinorVersion() {
		return this.dBLatestMinorVersion;
	}

	public void setDBLatestMinorVersion(DBLatestMinorVersion dBLatestMinorVersion) {
		this.dBLatestMinorVersion = dBLatestMinorVersion;
	}

	public ProxyLatestMinorVersion getProxyLatestMinorVersion() {
		return this.proxyLatestMinorVersion;
	}

	public void setProxyLatestMinorVersion(ProxyLatestMinorVersion proxyLatestMinorVersion) {
		this.proxyLatestMinorVersion = proxyLatestMinorVersion;
	}

	public static class DBLatestMinorVersion {

		private String minorVersion;

		private String level;

		private VersionRelease versionRelease;

		public String getMinorVersion() {
			return this.minorVersion;
		}

		public void setMinorVersion(String minorVersion) {
			this.minorVersion = minorVersion;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public VersionRelease getVersionRelease() {
			return this.versionRelease;
		}

		public void setVersionRelease(VersionRelease versionRelease) {
			this.versionRelease = versionRelease;
		}

		public static class VersionRelease {

			private String versionChangesLevel;

			private List<ReleaseInfoList> releaseInfo;

			public String getVersionChangesLevel() {
				return this.versionChangesLevel;
			}

			public void setVersionChangesLevel(String versionChangesLevel) {
				this.versionChangesLevel = versionChangesLevel;
			}

			public List<ReleaseInfoList> getReleaseInfo() {
				return this.releaseInfo;
			}

			public void setReleaseInfo(List<ReleaseInfoList> releaseInfo) {
				this.releaseInfo = releaseInfo;
			}

			public static class ReleaseInfoList {

				private String releaseVersion;

				private String createTime;

				private String releaseNote;

				private String level;

				private String releaseNoteEn;

				public String getReleaseVersion() {
					return this.releaseVersion;
				}

				public void setReleaseVersion(String releaseVersion) {
					this.releaseVersion = releaseVersion;
				}

				public String getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(String createTime) {
					this.createTime = createTime;
				}

				public String getReleaseNote() {
					return this.releaseNote;
				}

				public void setReleaseNote(String releaseNote) {
					this.releaseNote = releaseNote;
				}

				public String getLevel() {
					return this.level;
				}

				public void setLevel(String level) {
					this.level = level;
				}

				public String getReleaseNoteEn() {
					return this.releaseNoteEn;
				}

				public void setReleaseNoteEn(String releaseNoteEn) {
					this.releaseNoteEn = releaseNoteEn;
				}
			}
		}
	}

	public static class ProxyLatestMinorVersion {

		private String minorVersion;

		private String level;

		private VersionRelease1 versionRelease1;

		public String getMinorVersion() {
			return this.minorVersion;
		}

		public void setMinorVersion(String minorVersion) {
			this.minorVersion = minorVersion;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public VersionRelease1 getVersionRelease1() {
			return this.versionRelease1;
		}

		public void setVersionRelease1(VersionRelease1 versionRelease1) {
			this.versionRelease1 = versionRelease1;
		}

		public static class VersionRelease1 {

			private String versionChangesLevel;

			private List<ReleaseInfoList3> releaseInfo2;

			public String getVersionChangesLevel() {
				return this.versionChangesLevel;
			}

			public void setVersionChangesLevel(String versionChangesLevel) {
				this.versionChangesLevel = versionChangesLevel;
			}

			public List<ReleaseInfoList3> getReleaseInfo2() {
				return this.releaseInfo2;
			}

			public void setReleaseInfo2(List<ReleaseInfoList3> releaseInfo2) {
				this.releaseInfo2 = releaseInfo2;
			}

			public static class ReleaseInfoList3 {

				private String releaseVersion;

				private String createTime;

				private String releaseNote;

				private String level;

				private String releaseNoteEn;

				public String getReleaseVersion() {
					return this.releaseVersion;
				}

				public void setReleaseVersion(String releaseVersion) {
					this.releaseVersion = releaseVersion;
				}

				public String getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(String createTime) {
					this.createTime = createTime;
				}

				public String getReleaseNote() {
					return this.releaseNote;
				}

				public void setReleaseNote(String releaseNote) {
					this.releaseNote = releaseNote;
				}

				public String getLevel() {
					return this.level;
				}

				public void setLevel(String level) {
					this.level = level;
				}

				public String getReleaseNoteEn() {
					return this.releaseNoteEn;
				}

				public void setReleaseNoteEn(String releaseNoteEn) {
					this.releaseNoteEn = releaseNoteEn;
				}
			}
		}
	}

	@Override
	public DescribeEngineVersionResponse getInstance(UnmarshallerContext context) {
		return	DescribeEngineVersionResponseUnmarshaller.unmarshall(this, context);
	}
}
