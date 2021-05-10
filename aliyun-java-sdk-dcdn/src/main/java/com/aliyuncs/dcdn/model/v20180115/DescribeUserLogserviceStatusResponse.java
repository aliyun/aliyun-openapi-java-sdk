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

package com.aliyuncs.dcdn.model.v20180115;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeUserLogserviceStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserLogserviceStatusResponse extends AcsResponse {

	private String requestId;

	private Boolean enabled;

	private Boolean onService;

	private Boolean inDebt;

	private Boolean inDebtOverdue;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getOnService() {
		return this.onService;
	}

	public void setOnService(Boolean onService) {
		this.onService = onService;
	}

	public Boolean getInDebt() {
		return this.inDebt;
	}

	public void setInDebt(Boolean inDebt) {
		this.inDebt = inDebt;
	}

	public Boolean getInDebtOverdue() {
		return this.inDebtOverdue;
	}

	public void setInDebtOverdue(Boolean inDebtOverdue) {
		this.inDebtOverdue = inDebtOverdue;
	}

	@Override
	public DescribeUserLogserviceStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserLogserviceStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
