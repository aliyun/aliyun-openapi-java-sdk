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
import com.aliyuncs.rds.transform.v20140815.UpgradeDBInstanceKernelVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpgradeDBInstanceKernelVersionResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceName;

	private String taskId;

	private String targetMinorVersion;

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

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTargetMinorVersion() {
		return this.targetMinorVersion;
	}

	public void setTargetMinorVersion(String targetMinorVersion) {
		this.targetMinorVersion = targetMinorVersion;
	}

	@Override
	public UpgradeDBInstanceKernelVersionResponse getInstance(UnmarshallerContext context) {
		return	UpgradeDBInstanceKernelVersionResponseUnmarshaller.unmarshall(this, context);
	}
}
