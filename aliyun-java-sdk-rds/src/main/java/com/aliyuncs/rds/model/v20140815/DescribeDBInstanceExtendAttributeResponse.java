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
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceExtendAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceExtendAttributeResponse extends AcsResponse {

	private String requestId;

	private Boolean canTempUpgrade;

	private String tempUpgradeTimeStart;

	private String tempUpgradeTimeEnd;

	private String tempUpgradeRecoveryTime;

	private String tempUpgradeRecoveryClass;

	private Integer tempUpgradeRecoveryCpu;

	private Integer tempUpgradeRecoveryMemory;

	private String tempUpgradeRecoveryMaxIOPS;

	private String tempUpgradeRecoveryMaxConnections;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getCanTempUpgrade() {
		return this.canTempUpgrade;
	}

	public void setCanTempUpgrade(Boolean canTempUpgrade) {
		this.canTempUpgrade = canTempUpgrade;
	}

	public String getTempUpgradeTimeStart() {
		return this.tempUpgradeTimeStart;
	}

	public void setTempUpgradeTimeStart(String tempUpgradeTimeStart) {
		this.tempUpgradeTimeStart = tempUpgradeTimeStart;
	}

	public String getTempUpgradeTimeEnd() {
		return this.tempUpgradeTimeEnd;
	}

	public void setTempUpgradeTimeEnd(String tempUpgradeTimeEnd) {
		this.tempUpgradeTimeEnd = tempUpgradeTimeEnd;
	}

	public String getTempUpgradeRecoveryTime() {
		return this.tempUpgradeRecoveryTime;
	}

	public void setTempUpgradeRecoveryTime(String tempUpgradeRecoveryTime) {
		this.tempUpgradeRecoveryTime = tempUpgradeRecoveryTime;
	}

	public String getTempUpgradeRecoveryClass() {
		return this.tempUpgradeRecoveryClass;
	}

	public void setTempUpgradeRecoveryClass(String tempUpgradeRecoveryClass) {
		this.tempUpgradeRecoveryClass = tempUpgradeRecoveryClass;
	}

	public Integer getTempUpgradeRecoveryCpu() {
		return this.tempUpgradeRecoveryCpu;
	}

	public void setTempUpgradeRecoveryCpu(Integer tempUpgradeRecoveryCpu) {
		this.tempUpgradeRecoveryCpu = tempUpgradeRecoveryCpu;
	}

	public Integer getTempUpgradeRecoveryMemory() {
		return this.tempUpgradeRecoveryMemory;
	}

	public void setTempUpgradeRecoveryMemory(Integer tempUpgradeRecoveryMemory) {
		this.tempUpgradeRecoveryMemory = tempUpgradeRecoveryMemory;
	}

	public String getTempUpgradeRecoveryMaxIOPS() {
		return this.tempUpgradeRecoveryMaxIOPS;
	}

	public void setTempUpgradeRecoveryMaxIOPS(String tempUpgradeRecoveryMaxIOPS) {
		this.tempUpgradeRecoveryMaxIOPS = tempUpgradeRecoveryMaxIOPS;
	}

	public String getTempUpgradeRecoveryMaxConnections() {
		return this.tempUpgradeRecoveryMaxConnections;
	}

	public void setTempUpgradeRecoveryMaxConnections(String tempUpgradeRecoveryMaxConnections) {
		this.tempUpgradeRecoveryMaxConnections = tempUpgradeRecoveryMaxConnections;
	}

	@Override
	public DescribeDBInstanceExtendAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceExtendAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
