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

	private String requestId;

	private String dBInstanceName;

	private String dBVersion;

	private String dBMinorVersion;

	private String dBRevisionVersion;

	private String dBVersionStatus;

	private String isLatestVersion;

	private String latestRevisionVersion;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
	}

	public String getDBVersion() {
		return this.dBVersion;
	}

	public void setDBVersion(String dBVersion) {
		this.dBVersion = dBVersion;
	}

	public String getDBMinorVersion() {
		return this.dBMinorVersion;
	}

	public void setDBMinorVersion(String dBMinorVersion) {
		this.dBMinorVersion = dBMinorVersion;
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

	public String getIsLatestVersion() {
		return this.isLatestVersion;
	}

	public void setIsLatestVersion(String isLatestVersion) {
		this.isLatestVersion = isLatestVersion;
	}

	public String getLatestRevisionVersion() {
		return this.latestRevisionVersion;
	}

	public void setLatestRevisionVersion(String latestRevisionVersion) {
		this.latestRevisionVersion = latestRevisionVersion;
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
