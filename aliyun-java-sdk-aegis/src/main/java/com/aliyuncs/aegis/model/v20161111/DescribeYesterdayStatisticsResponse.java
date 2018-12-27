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

package com.aliyuncs.aegis.model.v20161111;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeYesterdayStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeYesterdayStatisticsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer newRiskCheckCount;

	private Integer newVulCount;

	private Integer newHealthCheckCount;

	private Integer newSuspiciousCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getNewRiskCheckCount() {
		return this.newRiskCheckCount;
	}

	public void setNewRiskCheckCount(Integer newRiskCheckCount) {
		this.newRiskCheckCount = newRiskCheckCount;
	}

	public Integer getNewVulCount() {
		return this.newVulCount;
	}

	public void setNewVulCount(Integer newVulCount) {
		this.newVulCount = newVulCount;
	}

	public Integer getNewHealthCheckCount() {
		return this.newHealthCheckCount;
	}

	public void setNewHealthCheckCount(Integer newHealthCheckCount) {
		this.newHealthCheckCount = newHealthCheckCount;
	}

	public Integer getNewSuspiciousCount() {
		return this.newSuspiciousCount;
	}

	public void setNewSuspiciousCount(Integer newSuspiciousCount) {
		this.newSuspiciousCount = newSuspiciousCount;
	}

	@Override
	public DescribeYesterdayStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeYesterdayStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
