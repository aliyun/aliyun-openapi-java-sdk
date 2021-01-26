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
import com.aliyuncs.polardb.transform.v20170801.DescribeSqlLogTrialStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSqlLogTrialStatusResponse extends AcsResponse {

	private String requestId;

	private String everTrialed;

	private String openTrial;

	private String remainDays;

	private String usedDays;

	private String dBInstanceName;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEverTrialed() {
		return this.everTrialed;
	}

	public void setEverTrialed(String everTrialed) {
		this.everTrialed = everTrialed;
	}

	public String getOpenTrial() {
		return this.openTrial;
	}

	public void setOpenTrial(String openTrial) {
		this.openTrial = openTrial;
	}

	public String getRemainDays() {
		return this.remainDays;
	}

	public void setRemainDays(String remainDays) {
		this.remainDays = remainDays;
	}

	public String getUsedDays() {
		return this.usedDays;
	}

	public void setUsedDays(String usedDays) {
		this.usedDays = usedDays;
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
	}

	@Override
	public DescribeSqlLogTrialStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeSqlLogTrialStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
