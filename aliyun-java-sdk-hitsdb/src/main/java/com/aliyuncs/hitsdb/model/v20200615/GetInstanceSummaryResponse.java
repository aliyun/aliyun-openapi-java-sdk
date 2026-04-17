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

package com.aliyuncs.hitsdb.model.v20200615;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20200615.GetInstanceSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceSummaryResponse extends AcsResponse {

	private Integer lockingCount;

	private String requestId;

	private Integer total;

	private Integer runningCount;

	private List<RegionalSummaryItem> regionalSummary;

	public Integer getLockingCount() {
		return this.lockingCount;
	}

	public void setLockingCount(Integer lockingCount) {
		this.lockingCount = lockingCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRunningCount() {
		return this.runningCount;
	}

	public void setRunningCount(Integer runningCount) {
		this.runningCount = runningCount;
	}

	public List<RegionalSummaryItem> getRegionalSummary() {
		return this.regionalSummary;
	}

	public void setRegionalSummary(List<RegionalSummaryItem> regionalSummary) {
		this.regionalSummary = regionalSummary;
	}

	public static class RegionalSummaryItem {

		private Integer lockingCount;

		private Integer total;

		private String regionId;

		private Integer runningCount;

		public Integer getLockingCount() {
			return this.lockingCount;
		}

		public void setLockingCount(Integer lockingCount) {
			this.lockingCount = lockingCount;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getRunningCount() {
			return this.runningCount;
		}

		public void setRunningCount(Integer runningCount) {
			this.runningCount = runningCount;
		}
	}

	@Override
	public GetInstanceSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
