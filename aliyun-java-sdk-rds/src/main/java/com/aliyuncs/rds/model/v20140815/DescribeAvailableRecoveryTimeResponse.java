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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeAvailableRecoveryTimeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailableRecoveryTimeResponse extends AcsResponse {

	private String requestId;

	private String recoveryBeginTime;

	private String recoveryEndTime;

	private String dBInstanceId;

	private String regionId;

	private Integer crossBackupId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRecoveryBeginTime() {
		return this.recoveryBeginTime;
	}

	public void setRecoveryBeginTime(String recoveryBeginTime) {
		this.recoveryBeginTime = recoveryBeginTime;
	}

	public String getRecoveryEndTime() {
		return this.recoveryEndTime;
	}

	public void setRecoveryEndTime(String recoveryEndTime) {
		this.recoveryEndTime = recoveryEndTime;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getBizRegionId() {
		return this.regionId;
	}

	public void setBizRegionId(String regionId) {
		this.regionId = regionId;
	}

	/**
	 * @deprecated use getBizRegionId instead of this.
	 */
	@Deprecated
	public String getRegionId() {
		return this.regionId;
	}

	/**
	 * @deprecated use setBizRegionId instead of this.
	 */
	@Deprecated
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public Integer getCrossBackupId() {
		return this.crossBackupId;
	}

	public void setCrossBackupId(Integer crossBackupId) {
		this.crossBackupId = crossBackupId;
	}

	@Override
	public DescribeAvailableRecoveryTimeResponse getInstance(UnmarshallerContext context) {
		return	DescribeAvailableRecoveryTimeResponseUnmarshaller.unmarshall(this, context);
	}
}
