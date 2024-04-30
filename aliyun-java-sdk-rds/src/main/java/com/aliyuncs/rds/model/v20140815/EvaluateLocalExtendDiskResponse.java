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
import com.aliyuncs.rds.transform.v20140815.EvaluateLocalExtendDiskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class EvaluateLocalExtendDiskResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private String available;

	private Long localUpgradeDiskLimit;

	private String dBInstanceTransType;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getAvailable() {
		return this.available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public Long getLocalUpgradeDiskLimit() {
		return this.localUpgradeDiskLimit;
	}

	public void setLocalUpgradeDiskLimit(Long localUpgradeDiskLimit) {
		this.localUpgradeDiskLimit = localUpgradeDiskLimit;
	}

	public String getDBInstanceTransType() {
		return this.dBInstanceTransType;
	}

	public void setDBInstanceTransType(String dBInstanceTransType) {
		this.dBInstanceTransType = dBInstanceTransType;
	}

	@Override
	public EvaluateLocalExtendDiskResponse getInstance(UnmarshallerContext context) {
		return	EvaluateLocalExtendDiskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
