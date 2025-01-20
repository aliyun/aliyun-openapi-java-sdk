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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClusterVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterVersionResponse extends AcsResponse {

	private String isLatestVersion;

	private String isProxyLatestVersion;

	private String dBVersion;

	private String dBRevisionVersion;

	private String requestId;

	private String dBVersionStatus;

	private String dBClusterId;

	private String dBMinorVersion;

	private String proxyRevisionVersion;

	private String proxyVersionStatus;

	private String proxyLatestVersion;

	private String dBLatestVersion;

	private String proxyLatestVersionAfterDBEngineUpgraded;

	private String dBInnerRevisionVersion;

	private List<DBRevisionVersionListItem> dBRevisionVersionList;

	private List<ProxyRevisionVersionListItem> proxyRevisionVersionList;

	public String getIsLatestVersion() {
		return this.isLatestVersion;
	}

	public void setIsLatestVersion(String isLatestVersion) {
		this.isLatestVersion = isLatestVersion;
	}

	public String getIsProxyLatestVersion() {
		return this.isProxyLatestVersion;
	}

	public void setIsProxyLatestVersion(String isProxyLatestVersion) {
		this.isProxyLatestVersion = isProxyLatestVersion;
	}

	public String getDBVersion() {
		return this.dBVersion;
	}

	public void setDBVersion(String dBVersion) {
		this.dBVersion = dBVersion;
	}

	public String getDBRevisionVersion() {
		return this.dBRevisionVersion;
	}

	public void setDBRevisionVersion(String dBRevisionVersion) {
		this.dBRevisionVersion = dBRevisionVersion;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBVersionStatus() {
		return this.dBVersionStatus;
	}

	public void setDBVersionStatus(String dBVersionStatus) {
		this.dBVersionStatus = dBVersionStatus;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getDBMinorVersion() {
		return this.dBMinorVersion;
	}

	public void setDBMinorVersion(String dBMinorVersion) {
		this.dBMinorVersion = dBMinorVersion;
	}

	public String getProxyRevisionVersion() {
		return this.proxyRevisionVersion;
	}

	public void setProxyRevisionVersion(String proxyRevisionVersion) {
		this.proxyRevisionVersion = proxyRevisionVersion;
	}

	public String getProxyVersionStatus() {
		return this.proxyVersionStatus;
	}

	public void setProxyVersionStatus(String proxyVersionStatus) {
		this.proxyVersionStatus = proxyVersionStatus;
	}

	public String getProxyLatestVersion() {
		return this.proxyLatestVersion;
	}

	public void setProxyLatestVersion(String proxyLatestVersion) {
		this.proxyLatestVersion = proxyLatestVersion;
	}

	public String getDBLatestVersion() {
		return this.dBLatestVersion;
	}

	public void setDBLatestVersion(String dBLatestVersion) {
		this.dBLatestVersion = dBLatestVersion;
	}

	public String getProxyLatestVersionAfterDBEngineUpgraded() {
		return this.proxyLatestVersionAfterDBEngineUpgraded;
	}

	public void setProxyLatestVersionAfterDBEngineUpgraded(String proxyLatestVersionAfterDBEngineUpgraded) {
		this.proxyLatestVersionAfterDBEngineUpgraded = proxyLatestVersionAfterDBEngineUpgraded;
	}

	public String getDBInnerRevisionVersion() {
		return this.dBInnerRevisionVersion;
	}

	public void setDBInnerRevisionVersion(String dBInnerRevisionVersion) {
		this.dBInnerRevisionVersion = dBInnerRevisionVersion;
	}

	public List<DBRevisionVersionListItem> getDBRevisionVersionList() {
		return this.dBRevisionVersionList;
	}

	public void setDBRevisionVersionList(List<DBRevisionVersionListItem> dBRevisionVersionList) {
		this.dBRevisionVersionList = dBRevisionVersionList;
	}

	public List<ProxyRevisionVersionListItem> getProxyRevisionVersionList() {
		return this.proxyRevisionVersionList;
	}

	public void setProxyRevisionVersionList(List<ProxyRevisionVersionListItem> proxyRevisionVersionList) {
		this.proxyRevisionVersionList = proxyRevisionVersionList;
	}

	public static class DBRevisionVersionListItem {

		private String releaseType;

		private String revisionVersionCode;

		private String revisionVersionName;

		private String releaseNote;

		public String getReleaseType() {
			return this.releaseType;
		}

		public void setReleaseType(String releaseType) {
			this.releaseType = releaseType;
		}

		public String getRevisionVersionCode() {
			return this.revisionVersionCode;
		}

		public void setRevisionVersionCode(String revisionVersionCode) {
			this.revisionVersionCode = revisionVersionCode;
		}

		public String getRevisionVersionName() {
			return this.revisionVersionName;
		}

		public void setRevisionVersionName(String revisionVersionName) {
			this.revisionVersionName = revisionVersionName;
		}

		public String getReleaseNote() {
			return this.releaseNote;
		}

		public void setReleaseNote(String releaseNote) {
			this.releaseNote = releaseNote;
		}
	}

	public static class ProxyRevisionVersionListItem {

		private String releaseType;

		private String revisionVersionCode;

		private String revisionVersionName;

		private String releaseNote;

		public String getReleaseType() {
			return this.releaseType;
		}

		public void setReleaseType(String releaseType) {
			this.releaseType = releaseType;
		}

		public String getRevisionVersionCode() {
			return this.revisionVersionCode;
		}

		public void setRevisionVersionCode(String revisionVersionCode) {
			this.revisionVersionCode = revisionVersionCode;
		}

		public String getRevisionVersionName() {
			return this.revisionVersionName;
		}

		public void setRevisionVersionName(String revisionVersionName) {
			this.revisionVersionName = revisionVersionName;
		}

		public String getReleaseNote() {
			return this.releaseNote;
		}

		public void setReleaseNote(String releaseNote) {
			this.releaseNote = releaseNote;
		}
	}

	@Override
	public DescribeDBClusterVersionResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterVersionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
