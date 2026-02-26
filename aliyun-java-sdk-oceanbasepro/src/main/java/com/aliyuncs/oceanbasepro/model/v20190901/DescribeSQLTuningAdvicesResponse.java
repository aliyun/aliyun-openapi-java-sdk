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
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeSQLTuningAdvicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLTuningAdvicesResponse extends AcsResponse {

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

		private String type;

		private String columnNames;

		private String localityType;

		private String dbName;

		private String table;

		private List<ColumnsItem> columns;

		private Plan plan;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getColumnNames() {
			return this.columnNames;
		}

		public void setColumnNames(String columnNames) {
			this.columnNames = columnNames;
		}

		public String getLocalityType() {
			return this.localityType;
		}

		public void setLocalityType(String localityType) {
			this.localityType = localityType;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public String getTable() {
			return this.table;
		}

		public void setTable(String table) {
			this.table = table;
		}

		public List<ColumnsItem> getColumns() {
			return this.columns;
		}

		public void setColumns(List<ColumnsItem> columns) {
			this.columns = columns;
		}

		public Plan getPlan() {
			return this.plan;
		}

		public void setPlan(Plan plan) {
			this.plan = plan;
		}

		public static class ColumnsItem {

			private String columnName;

			private Double ndv;

			private String minValue;

			private String maxValue;

			public String getColumnName() {
				return this.columnName;
			}

			public void setColumnName(String columnName) {
				this.columnName = columnName;
			}

			public Double getNdv() {
				return this.ndv;
			}

			public void setNdv(Double ndv) {
				this.ndv = ndv;
			}

			public String getMinValue() {
				return this.minValue;
			}

			public void setMinValue(String minValue) {
				this.minValue = minValue;
			}

			public String getMaxValue() {
				return this.maxValue;
			}

			public void setMaxValue(String maxValue) {
				this.maxValue = maxValue;
			}
		}

		public static class Plan {

			private Long executions;

			private Float avgCpuTime;

			private String planHash;

			private Float timeoutPercentage;

			private Float avgConcurrencyWaitTime;

			private Long firstLoadTimeUs;

			private Float avgDiskWrites;

			private Float avgUserIoWaitTime;

			private Long planSize;

			private String serverSn;

			private String outlineData;

			private String planType;

			private Long obDbId;

			private Float hitPercentage;

			private Float avgBufferGets;

			private Float execPs;

			private Float delayedLargeQueryPercentage;

			private Boolean tableScan;

			private Float largeQueryPercentage;

			private Long schemaVersion;

			private Long planId;

			private String firstLoadTime;

			private Float avgRowProcessed;

			private Long mergedVersion;

			private Boolean hitDiagnosis;

			private String uid;

			private Float avgApplicationWaitTime;

			private Long collectTimeUs;

			private Float avgElapsedTime;

			private Long obServerId;

			private Long outlineId;

			private Float avgDiskReads;

			public Long getExecutions() {
				return this.executions;
			}

			public void setExecutions(Long executions) {
				this.executions = executions;
			}

			public Float getAvgCpuTime() {
				return this.avgCpuTime;
			}

			public void setAvgCpuTime(Float avgCpuTime) {
				this.avgCpuTime = avgCpuTime;
			}

			public String getPlanHash() {
				return this.planHash;
			}

			public void setPlanHash(String planHash) {
				this.planHash = planHash;
			}

			public Float getTimeoutPercentage() {
				return this.timeoutPercentage;
			}

			public void setTimeoutPercentage(Float timeoutPercentage) {
				this.timeoutPercentage = timeoutPercentage;
			}

			public Float getAvgConcurrencyWaitTime() {
				return this.avgConcurrencyWaitTime;
			}

			public void setAvgConcurrencyWaitTime(Float avgConcurrencyWaitTime) {
				this.avgConcurrencyWaitTime = avgConcurrencyWaitTime;
			}

			public Long getFirstLoadTimeUs() {
				return this.firstLoadTimeUs;
			}

			public void setFirstLoadTimeUs(Long firstLoadTimeUs) {
				this.firstLoadTimeUs = firstLoadTimeUs;
			}

			public Float getAvgDiskWrites() {
				return this.avgDiskWrites;
			}

			public void setAvgDiskWrites(Float avgDiskWrites) {
				this.avgDiskWrites = avgDiskWrites;
			}

			public Float getAvgUserIoWaitTime() {
				return this.avgUserIoWaitTime;
			}

			public void setAvgUserIoWaitTime(Float avgUserIoWaitTime) {
				this.avgUserIoWaitTime = avgUserIoWaitTime;
			}

			public Long getPlanSize() {
				return this.planSize;
			}

			public void setPlanSize(Long planSize) {
				this.planSize = planSize;
			}

			public String getServerSn() {
				return this.serverSn;
			}

			public void setServerSn(String serverSn) {
				this.serverSn = serverSn;
			}

			public String getOutlineData() {
				return this.outlineData;
			}

			public void setOutlineData(String outlineData) {
				this.outlineData = outlineData;
			}

			public String getPlanType() {
				return this.planType;
			}

			public void setPlanType(String planType) {
				this.planType = planType;
			}

			public Long getObDbId() {
				return this.obDbId;
			}

			public void setObDbId(Long obDbId) {
				this.obDbId = obDbId;
			}

			public Float getHitPercentage() {
				return this.hitPercentage;
			}

			public void setHitPercentage(Float hitPercentage) {
				this.hitPercentage = hitPercentage;
			}

			public Float getAvgBufferGets() {
				return this.avgBufferGets;
			}

			public void setAvgBufferGets(Float avgBufferGets) {
				this.avgBufferGets = avgBufferGets;
			}

			public Float getExecPs() {
				return this.execPs;
			}

			public void setExecPs(Float execPs) {
				this.execPs = execPs;
			}

			public Float getDelayedLargeQueryPercentage() {
				return this.delayedLargeQueryPercentage;
			}

			public void setDelayedLargeQueryPercentage(Float delayedLargeQueryPercentage) {
				this.delayedLargeQueryPercentage = delayedLargeQueryPercentage;
			}

			public Boolean getTableScan() {
				return this.tableScan;
			}

			public void setTableScan(Boolean tableScan) {
				this.tableScan = tableScan;
			}

			public Float getLargeQueryPercentage() {
				return this.largeQueryPercentage;
			}

			public void setLargeQueryPercentage(Float largeQueryPercentage) {
				this.largeQueryPercentage = largeQueryPercentage;
			}

			public Long getSchemaVersion() {
				return this.schemaVersion;
			}

			public void setSchemaVersion(Long schemaVersion) {
				this.schemaVersion = schemaVersion;
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

			public Float getAvgRowProcessed() {
				return this.avgRowProcessed;
			}

			public void setAvgRowProcessed(Float avgRowProcessed) {
				this.avgRowProcessed = avgRowProcessed;
			}

			public Long getMergedVersion() {
				return this.mergedVersion;
			}

			public void setMergedVersion(Long mergedVersion) {
				this.mergedVersion = mergedVersion;
			}

			public Boolean getHitDiagnosis() {
				return this.hitDiagnosis;
			}

			public void setHitDiagnosis(Boolean hitDiagnosis) {
				this.hitDiagnosis = hitDiagnosis;
			}

			public String getUid() {
				return this.uid;
			}

			public void setUid(String uid) {
				this.uid = uid;
			}

			public Float getAvgApplicationWaitTime() {
				return this.avgApplicationWaitTime;
			}

			public void setAvgApplicationWaitTime(Float avgApplicationWaitTime) {
				this.avgApplicationWaitTime = avgApplicationWaitTime;
			}

			public Long getCollectTimeUs() {
				return this.collectTimeUs;
			}

			public void setCollectTimeUs(Long collectTimeUs) {
				this.collectTimeUs = collectTimeUs;
			}

			public Float getAvgElapsedTime() {
				return this.avgElapsedTime;
			}

			public void setAvgElapsedTime(Float avgElapsedTime) {
				this.avgElapsedTime = avgElapsedTime;
			}

			public Long getObServerId() {
				return this.obServerId;
			}

			public void setObServerId(Long obServerId) {
				this.obServerId = obServerId;
			}

			public Long getOutlineId() {
				return this.outlineId;
			}

			public void setOutlineId(Long outlineId) {
				this.outlineId = outlineId;
			}

			public Float getAvgDiskReads() {
				return this.avgDiskReads;
			}

			public void setAvgDiskReads(Float avgDiskReads) {
				this.avgDiskReads = avgDiskReads;
			}
		}
	}

	@Override
	public DescribeSQLTuningAdvicesResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLTuningAdvicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
