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
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeOasSQLPlansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOasSQLPlansResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String planHash;

		private Long mergedVersion;

		private String firstLoadTime;

		private String planType;

		private Boolean hitDiagnosis;

		private Double hitPercentage;

		private Double avgCpuTime;

		private Long executions;

		private String planUnionHash;

		private String querySql;

		private Boolean bounded;

		private Boolean tableScan;

		private String outlineId;

		private String outlineStatus;

		private List<PlansItem> plans;

		private PlanExplain planExplain;

		public String getPlanHash() {
			return this.planHash;
		}

		public void setPlanHash(String planHash) {
			this.planHash = planHash;
		}

		public Long getMergedVersion() {
			return this.mergedVersion;
		}

		public void setMergedVersion(Long mergedVersion) {
			this.mergedVersion = mergedVersion;
		}

		public String getFirstLoadTime() {
			return this.firstLoadTime;
		}

		public void setFirstLoadTime(String firstLoadTime) {
			this.firstLoadTime = firstLoadTime;
		}

		public String getPlanType() {
			return this.planType;
		}

		public void setPlanType(String planType) {
			this.planType = planType;
		}

		public Boolean getHitDiagnosis() {
			return this.hitDiagnosis;
		}

		public void setHitDiagnosis(Boolean hitDiagnosis) {
			this.hitDiagnosis = hitDiagnosis;
		}

		public Double getHitPercentage() {
			return this.hitPercentage;
		}

		public void setHitPercentage(Double hitPercentage) {
			this.hitPercentage = hitPercentage;
		}

		public Double getAvgCpuTime() {
			return this.avgCpuTime;
		}

		public void setAvgCpuTime(Double avgCpuTime) {
			this.avgCpuTime = avgCpuTime;
		}

		public Long getExecutions() {
			return this.executions;
		}

		public void setExecutions(Long executions) {
			this.executions = executions;
		}

		public String getPlanUnionHash() {
			return this.planUnionHash;
		}

		public void setPlanUnionHash(String planUnionHash) {
			this.planUnionHash = planUnionHash;
		}

		public String getQuerySql() {
			return this.querySql;
		}

		public void setQuerySql(String querySql) {
			this.querySql = querySql;
		}

		public Boolean getBounded() {
			return this.bounded;
		}

		public void setBounded(Boolean bounded) {
			this.bounded = bounded;
		}

		public Boolean getTableScan() {
			return this.tableScan;
		}

		public void setTableScan(Boolean tableScan) {
			this.tableScan = tableScan;
		}

		public String getOutlineId() {
			return this.outlineId;
		}

		public void setOutlineId(String outlineId) {
			this.outlineId = outlineId;
		}

		public String getOutlineStatus() {
			return this.outlineStatus;
		}

		public void setOutlineStatus(String outlineStatus) {
			this.outlineStatus = outlineStatus;
		}

		public List<PlansItem> getPlans() {
			return this.plans;
		}

		public void setPlans(List<PlansItem> plans) {
			this.plans = plans;
		}

		public PlanExplain getPlanExplain() {
			return this.planExplain;
		}

		public void setPlanExplain(PlanExplain planExplain) {
			this.planExplain = planExplain;
		}

		public static class PlansItem {

			private String uid;

			private Long planId;

			private String firstLoadTime;

			private String planType;

			private String planHash;

			private Long planSize;

			private Long schemaVersion;

			private Long mergedVersion;

			private Long obServerId;

			private Long obDbId;

			private Long serverId;

			private Long firstLoadTimeUs;

			private Boolean hitDiagnosis;

			private String outlineData;

			private Long outlineId;

			private Long collectTimeUs;

			private String server;

			private Double hitPercentage;

			private Long executions;

			private Double execPs;

			private Double avgDiskReads;

			private Double avgDiskWrites;

			private Double avgBufferGets;

			private Double avgApplicationWaitTime;

			private Double avgConcurrencyWaitTime;

			private Double avgUserIoWaitTime;

			private Double avgRowProcessed;

			private Double avgElapsedTime;

			private Double avgCpuTime;

			private Double largeQueryPercentage;

			private Double delayedLargeQueryPercentage;

			private Double timeoutPercentage;

			private Boolean tableScan;

			private String planUnionHash;

			private String sqlId;

			public String getUid() {
				return this.uid;
			}

			public void setUid(String uid) {
				this.uid = uid;
			}

			public Long getPlanId() {
				return this.planId;
			}

			public void setPlanId(Long planId) {
				this.planId = planId;
			}

			public String getFirstLoadTime() {
				return this.firstLoadTime;
			}

			public void setFirstLoadTime(String firstLoadTime) {
				this.firstLoadTime = firstLoadTime;
			}

			public String getPlanType() {
				return this.planType;
			}

			public void setPlanType(String planType) {
				this.planType = planType;
			}

			public String getPlanHash() {
				return this.planHash;
			}

			public void setPlanHash(String planHash) {
				this.planHash = planHash;
			}

			public Long getPlanSize() {
				return this.planSize;
			}

			public void setPlanSize(Long planSize) {
				this.planSize = planSize;
			}

			public Long getSchemaVersion() {
				return this.schemaVersion;
			}

			public void setSchemaVersion(Long schemaVersion) {
				this.schemaVersion = schemaVersion;
			}

			public Long getMergedVersion() {
				return this.mergedVersion;
			}

			public void setMergedVersion(Long mergedVersion) {
				this.mergedVersion = mergedVersion;
			}

			public Long getObServerId() {
				return this.obServerId;
			}

			public void setObServerId(Long obServerId) {
				this.obServerId = obServerId;
			}

			public Long getObDbId() {
				return this.obDbId;
			}

			public void setObDbId(Long obDbId) {
				this.obDbId = obDbId;
			}

			public Long getServerId() {
				return this.serverId;
			}

			public void setServerId(Long serverId) {
				this.serverId = serverId;
			}

			public Long getFirstLoadTimeUs() {
				return this.firstLoadTimeUs;
			}

			public void setFirstLoadTimeUs(Long firstLoadTimeUs) {
				this.firstLoadTimeUs = firstLoadTimeUs;
			}

			public Boolean getHitDiagnosis() {
				return this.hitDiagnosis;
			}

			public void setHitDiagnosis(Boolean hitDiagnosis) {
				this.hitDiagnosis = hitDiagnosis;
			}

			public String getOutlineData() {
				return this.outlineData;
			}

			public void setOutlineData(String outlineData) {
				this.outlineData = outlineData;
			}

			public Long getOutlineId() {
				return this.outlineId;
			}

			public void setOutlineId(Long outlineId) {
				this.outlineId = outlineId;
			}

			public Long getCollectTimeUs() {
				return this.collectTimeUs;
			}

			public void setCollectTimeUs(Long collectTimeUs) {
				this.collectTimeUs = collectTimeUs;
			}

			public String getServer() {
				return this.server;
			}

			public void setServer(String server) {
				this.server = server;
			}

			public Double getHitPercentage() {
				return this.hitPercentage;
			}

			public void setHitPercentage(Double hitPercentage) {
				this.hitPercentage = hitPercentage;
			}

			public Long getExecutions() {
				return this.executions;
			}

			public void setExecutions(Long executions) {
				this.executions = executions;
			}

			public Double getExecPs() {
				return this.execPs;
			}

			public void setExecPs(Double execPs) {
				this.execPs = execPs;
			}

			public Double getAvgDiskReads() {
				return this.avgDiskReads;
			}

			public void setAvgDiskReads(Double avgDiskReads) {
				this.avgDiskReads = avgDiskReads;
			}

			public Double getAvgDiskWrites() {
				return this.avgDiskWrites;
			}

			public void setAvgDiskWrites(Double avgDiskWrites) {
				this.avgDiskWrites = avgDiskWrites;
			}

			public Double getAvgBufferGets() {
				return this.avgBufferGets;
			}

			public void setAvgBufferGets(Double avgBufferGets) {
				this.avgBufferGets = avgBufferGets;
			}

			public Double getAvgApplicationWaitTime() {
				return this.avgApplicationWaitTime;
			}

			public void setAvgApplicationWaitTime(Double avgApplicationWaitTime) {
				this.avgApplicationWaitTime = avgApplicationWaitTime;
			}

			public Double getAvgConcurrencyWaitTime() {
				return this.avgConcurrencyWaitTime;
			}

			public void setAvgConcurrencyWaitTime(Double avgConcurrencyWaitTime) {
				this.avgConcurrencyWaitTime = avgConcurrencyWaitTime;
			}

			public Double getAvgUserIoWaitTime() {
				return this.avgUserIoWaitTime;
			}

			public void setAvgUserIoWaitTime(Double avgUserIoWaitTime) {
				this.avgUserIoWaitTime = avgUserIoWaitTime;
			}

			public Double getAvgRowProcessed() {
				return this.avgRowProcessed;
			}

			public void setAvgRowProcessed(Double avgRowProcessed) {
				this.avgRowProcessed = avgRowProcessed;
			}

			public Double getAvgElapsedTime() {
				return this.avgElapsedTime;
			}

			public void setAvgElapsedTime(Double avgElapsedTime) {
				this.avgElapsedTime = avgElapsedTime;
			}

			public Double getAvgCpuTime() {
				return this.avgCpuTime;
			}

			public void setAvgCpuTime(Double avgCpuTime) {
				this.avgCpuTime = avgCpuTime;
			}

			public Double getLargeQueryPercentage() {
				return this.largeQueryPercentage;
			}

			public void setLargeQueryPercentage(Double largeQueryPercentage) {
				this.largeQueryPercentage = largeQueryPercentage;
			}

			public Double getDelayedLargeQueryPercentage() {
				return this.delayedLargeQueryPercentage;
			}

			public void setDelayedLargeQueryPercentage(Double delayedLargeQueryPercentage) {
				this.delayedLargeQueryPercentage = delayedLargeQueryPercentage;
			}

			public Double getTimeoutPercentage() {
				return this.timeoutPercentage;
			}

			public void setTimeoutPercentage(Double timeoutPercentage) {
				this.timeoutPercentage = timeoutPercentage;
			}

			public Boolean getTableScan() {
				return this.tableScan;
			}

			public void setTableScan(Boolean tableScan) {
				this.tableScan = tableScan;
			}

			public String getPlanUnionHash() {
				return this.planUnionHash;
			}

			public void setPlanUnionHash(String planUnionHash) {
				this.planUnionHash = planUnionHash;
			}

			public String getSqlId() {
				return this.sqlId;
			}

			public void setSqlId(String sqlId) {
				this.sqlId = sqlId;
			}
		}

		public static class PlanExplain {

			private String planJsonString;

			public String getPlanJsonString() {
				return this.planJsonString;
			}

			public void setPlanJsonString(String planJsonString) {
				this.planJsonString = planJsonString;
			}
		}
	}

	@Override
	public DescribeOasSQLPlansResponse getInstance(UnmarshallerContext context) {
		return	DescribeOasSQLPlansResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
