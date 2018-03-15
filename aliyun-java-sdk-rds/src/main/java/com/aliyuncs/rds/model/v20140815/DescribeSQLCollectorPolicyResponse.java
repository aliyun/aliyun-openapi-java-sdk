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
import com.aliyuncs.rds.transform.v20140815.DescribeSQLCollectorPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLCollectorPolicyResponse extends AcsResponse {

	private String requestId;

	private String sQLCollectorStatus;

	private Integer storagePeriod;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSQLCollectorStatus() {
		return this.sQLCollectorStatus;
	}

	public void setSQLCollectorStatus(String sQLCollectorStatus) {
		this.sQLCollectorStatus = sQLCollectorStatus;
	}

	public Integer getStoragePeriod() {
		return this.storagePeriod;
	}

	public void setStoragePeriod(Integer storagePeriod) {
		this.storagePeriod = storagePeriod;
	}

	@Override
	public DescribeSQLCollectorPolicyResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLCollectorPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
