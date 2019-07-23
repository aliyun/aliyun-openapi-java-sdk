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
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClusterMigrationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterMigrationResponse extends AcsResponse {

	private String requestId;

	private String dBClusterId;

	private String sourceRDSDBInstanceId;

	private String migrationStatus;

	private String topologies;

	private Integer delayedSeconds;

	private String expiredTime;

	private String rdsReadWriteMode;

	private String dBClusterReadWriteMode;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getSourceRDSDBInstanceId() {
		return this.sourceRDSDBInstanceId;
	}

	public void setSourceRDSDBInstanceId(String sourceRDSDBInstanceId) {
		this.sourceRDSDBInstanceId = sourceRDSDBInstanceId;
	}

	public String getMigrationStatus() {
		return this.migrationStatus;
	}

	public void setMigrationStatus(String migrationStatus) {
		this.migrationStatus = migrationStatus;
	}

	public String getTopologies() {
		return this.topologies;
	}

	public void setTopologies(String topologies) {
		this.topologies = topologies;
	}

	public Integer getDelayedSeconds() {
		return this.delayedSeconds;
	}

	public void setDelayedSeconds(Integer delayedSeconds) {
		this.delayedSeconds = delayedSeconds;
	}

	public String getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getRdsReadWriteMode() {
		return this.rdsReadWriteMode;
	}

	public void setRdsReadWriteMode(String rdsReadWriteMode) {
		this.rdsReadWriteMode = rdsReadWriteMode;
	}

	public String getDBClusterReadWriteMode() {
		return this.dBClusterReadWriteMode;
	}

	public void setDBClusterReadWriteMode(String dBClusterReadWriteMode) {
		this.dBClusterReadWriteMode = dBClusterReadWriteMode;
	}

	@Override
	public DescribeDBClusterMigrationResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterMigrationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
