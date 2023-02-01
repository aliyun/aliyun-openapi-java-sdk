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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribePreToPostQuotaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePreToPostQuotaResponse extends AcsResponse {

	private String requestId;

	private Long cost;

	private Long usedQuota;

	private Long totalQuota;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCost() {
		return this.cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public Long getUsedQuota() {
		return this.usedQuota;
	}

	public void setUsedQuota(Long usedQuota) {
		this.usedQuota = usedQuota;
	}

	public Long getTotalQuota() {
		return this.totalQuota;
	}

	public void setTotalQuota(Long totalQuota) {
		this.totalQuota = totalQuota;
	}

	@Override
	public DescribePreToPostQuotaResponse getInstance(UnmarshallerContext context) {
		return	DescribePreToPostQuotaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
