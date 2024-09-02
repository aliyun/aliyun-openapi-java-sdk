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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeInstanceSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceSummaryResponse extends AcsResponse {

	private String requestId;

	private InstanceSummary instanceSummary;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public InstanceSummary getInstanceSummary() {
		return this.instanceSummary;
	}

	public void setInstanceSummary(InstanceSummary instanceSummary) {
		this.instanceSummary = instanceSummary;
	}

	public static class InstanceSummary {

		private Long totalInstancesCount;

		private Long overLoadInstancesCount;

		private Long immediatelyExpiredInstancesCount;

		private Long runningInstancesCount;

		private Long insufficientDiskInstancesCount;

		private Long expiredInstancesCount;

		private Long alarmSummaryCount;

		private Long anomalySQLCount;

		private Long clusterInstancesCount;

		private Long tenantInstancesCount;

		private Long totalOmsInstancesCount;

		private List<RegionalInstanceSummaryLis> regionalInstanceSummaryList;

		public Long getTotalInstancesCount() {
			return this.totalInstancesCount;
		}

		public void setTotalInstancesCount(Long totalInstancesCount) {
			this.totalInstancesCount = totalInstancesCount;
		}

		public Long getOverLoadInstancesCount() {
			return this.overLoadInstancesCount;
		}

		public void setOverLoadInstancesCount(Long overLoadInstancesCount) {
			this.overLoadInstancesCount = overLoadInstancesCount;
		}

		public Long getImmediatelyExpiredInstancesCount() {
			return this.immediatelyExpiredInstancesCount;
		}

		public void setImmediatelyExpiredInstancesCount(Long immediatelyExpiredInstancesCount) {
			this.immediatelyExpiredInstancesCount = immediatelyExpiredInstancesCount;
		}

		public Long getRunningInstancesCount() {
			return this.runningInstancesCount;
		}

		public void setRunningInstancesCount(Long runningInstancesCount) {
			this.runningInstancesCount = runningInstancesCount;
		}

		public Long getInsufficientDiskInstancesCount() {
			return this.insufficientDiskInstancesCount;
		}

		public void setInsufficientDiskInstancesCount(Long insufficientDiskInstancesCount) {
			this.insufficientDiskInstancesCount = insufficientDiskInstancesCount;
		}

		public Long getExpiredInstancesCount() {
			return this.expiredInstancesCount;
		}

		public void setExpiredInstancesCount(Long expiredInstancesCount) {
			this.expiredInstancesCount = expiredInstancesCount;
		}

		public Long getAlarmSummaryCount() {
			return this.alarmSummaryCount;
		}

		public void setAlarmSummaryCount(Long alarmSummaryCount) {
			this.alarmSummaryCount = alarmSummaryCount;
		}

		public Long getAnomalySQLCount() {
			return this.anomalySQLCount;
		}

		public void setAnomalySQLCount(Long anomalySQLCount) {
			this.anomalySQLCount = anomalySQLCount;
		}

		public Long getClusterInstancesCount() {
			return this.clusterInstancesCount;
		}

		public void setClusterInstancesCount(Long clusterInstancesCount) {
			this.clusterInstancesCount = clusterInstancesCount;
		}

		public Long getTenantInstancesCount() {
			return this.tenantInstancesCount;
		}

		public void setTenantInstancesCount(Long tenantInstancesCount) {
			this.tenantInstancesCount = tenantInstancesCount;
		}

		public Long getTotalOmsInstancesCount() {
			return this.totalOmsInstancesCount;
		}

		public void setTotalOmsInstancesCount(Long totalOmsInstancesCount) {
			this.totalOmsInstancesCount = totalOmsInstancesCount;
		}

		public List<RegionalInstanceSummaryLis> getRegionalInstanceSummaryList() {
			return this.regionalInstanceSummaryList;
		}

		public void setRegionalInstanceSummaryList(List<RegionalInstanceSummaryLis> regionalInstanceSummaryList) {
			this.regionalInstanceSummaryList = regionalInstanceSummaryList;
		}

		public static class RegionalInstanceSummaryLis {

			private String region;

			private String totalInstancesCount;

			private String immediatelyExpiredInstancesCount;

			private String runningInstancesCount;

			private String expiredInstancesCount;

			private String recentCreatedInstancesCount;

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getTotalInstancesCount() {
				return this.totalInstancesCount;
			}

			public void setTotalInstancesCount(String totalInstancesCount) {
				this.totalInstancesCount = totalInstancesCount;
			}

			public String getImmediatelyExpiredInstancesCount() {
				return this.immediatelyExpiredInstancesCount;
			}

			public void setImmediatelyExpiredInstancesCount(String immediatelyExpiredInstancesCount) {
				this.immediatelyExpiredInstancesCount = immediatelyExpiredInstancesCount;
			}

			public String getRunningInstancesCount() {
				return this.runningInstancesCount;
			}

			public void setRunningInstancesCount(String runningInstancesCount) {
				this.runningInstancesCount = runningInstancesCount;
			}

			public String getExpiredInstancesCount() {
				return this.expiredInstancesCount;
			}

			public void setExpiredInstancesCount(String expiredInstancesCount) {
				this.expiredInstancesCount = expiredInstancesCount;
			}

			public String getRecentCreatedInstancesCount() {
				return this.recentCreatedInstancesCount;
			}

			public void setRecentCreatedInstancesCount(String recentCreatedInstancesCount) {
				this.recentCreatedInstancesCount = recentCreatedInstancesCount;
			}
		}
	}

	@Override
	public DescribeInstanceSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
