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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.DescribeVnConcurrencyLimitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVnConcurrencyLimitResponse extends AcsResponse {

	private String requestId;

	private Long availableConcurrencyCount;

	private Long totalConcurrencyCount;

	private Long occupiedConcurrencyCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getAvailableConcurrencyCount() {
		return this.availableConcurrencyCount;
	}

	public void setAvailableConcurrencyCount(Long availableConcurrencyCount) {
		this.availableConcurrencyCount = availableConcurrencyCount;
	}

	public Long getTotalConcurrencyCount() {
		return this.totalConcurrencyCount;
	}

	public void setTotalConcurrencyCount(Long totalConcurrencyCount) {
		this.totalConcurrencyCount = totalConcurrencyCount;
	}

	public Long getOccupiedConcurrencyCount() {
		return this.occupiedConcurrencyCount;
	}

	public void setOccupiedConcurrencyCount(Long occupiedConcurrencyCount) {
		this.occupiedConcurrencyCount = occupiedConcurrencyCount;
	}

	@Override
	public DescribeVnConcurrencyLimitResponse getInstance(UnmarshallerContext context) {
		return	DescribeVnConcurrencyLimitResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
