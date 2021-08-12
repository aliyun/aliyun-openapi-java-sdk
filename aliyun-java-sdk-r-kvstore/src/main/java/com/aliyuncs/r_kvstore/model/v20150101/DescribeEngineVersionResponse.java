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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeEngineVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEngineVersionResponse extends AcsResponse {

	private String requestId;

	private String engine;

	private Boolean isLatestVersion;

	private String minorVersion;

	private Boolean enableUpgradeMinorVersion;

	private String majorVersion;

	private Boolean enableUpgradeMajorVersion;

	private String proxyMinorVersion;

	private String dBVersionRelease;

	private String proxyVersionRelease;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public Boolean getIsLatestVersion() {
		return this.isLatestVersion;
	}

	public void setIsLatestVersion(Boolean isLatestVersion) {
		this.isLatestVersion = isLatestVersion;
	}

	public String getMinorVersion() {
		return this.minorVersion;
	}

	public void setMinorVersion(String minorVersion) {
		this.minorVersion = minorVersion;
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

	public Boolean getEnableUpgradeMajorVersion() {
		return this.enableUpgradeMajorVersion;
	}

	public void setEnableUpgradeMajorVersion(Boolean enableUpgradeMajorVersion) {
		this.enableUpgradeMajorVersion = enableUpgradeMajorVersion;
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

	@Override
	public DescribeEngineVersionResponse getInstance(UnmarshallerContext context) {
		return	DescribeEngineVersionResponseUnmarshaller.unmarshall(this, context);
	}
}
