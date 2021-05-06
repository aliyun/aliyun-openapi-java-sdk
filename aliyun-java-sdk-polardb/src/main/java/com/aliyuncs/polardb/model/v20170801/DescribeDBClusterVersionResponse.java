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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClusterVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterVersionResponse extends AcsResponse {

	private String proxyVersionStatus;

	private String isLatestVersion;

	private String dBVersion;

	private String requestId;

	private String dBRevisionVersion;

	private String dBVersionStatus;

	private String dBClusterId;

	private String dBLatestVersion;

	private String proxyRevisionVersion;

	private String dBMinorVersion;

	private String proxyLatestVersion;

	public String getProxyVersionStatus() {
		return this.proxyVersionStatus;
	}

	public void setProxyVersionStatus(String proxyVersionStatus) {
		this.proxyVersionStatus = proxyVersionStatus;
	}

	public String getIsLatestVersion() {
		return this.isLatestVersion;
	}

	public void setIsLatestVersion(String isLatestVersion) {
		this.isLatestVersion = isLatestVersion;
	}

	public String getDBVersion() {
		return this.dBVersion;
	}

	public void setDBVersion(String dBVersion) {
		this.dBVersion = dBVersion;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBRevisionVersion() {
		return this.dBRevisionVersion;
	}

	public void setDBRevisionVersion(String dBRevisionVersion) {
		this.dBRevisionVersion = dBRevisionVersion;
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

	public String getDBLatestVersion() {
		return this.dBLatestVersion;
	}

	public void setDBLatestVersion(String dBLatestVersion) {
		this.dBLatestVersion = dBLatestVersion;
	}

	public String getProxyRevisionVersion() {
		return this.proxyRevisionVersion;
	}

	public void setProxyRevisionVersion(String proxyRevisionVersion) {
		this.proxyRevisionVersion = proxyRevisionVersion;
	}

	public String getDBMinorVersion() {
		return this.dBMinorVersion;
	}

	public void setDBMinorVersion(String dBMinorVersion) {
		this.dBMinorVersion = dBMinorVersion;
	}

	public String getProxyLatestVersion() {
		return this.proxyLatestVersion;
	}

	public void setProxyLatestVersion(String proxyLatestVersion) {
		this.proxyLatestVersion = proxyLatestVersion;
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
