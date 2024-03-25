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
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeOasSQLHistoryListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOasSQLHistoryListResponse extends AcsResponse {

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

		private String sQLId;

		private String dbName;

		private Long avgAffectedRows;

		private Long avgBlockCacheHit;

		private Long avgBlockIndexCacheHit;

		private Long avgBloomFilterCacheHit;

		private Long executions;

		private Long failCount;

		private Long avgRpcCount;

		private Long remotePlans;

		private Long missPlans;

		private Long avgReturnRows;

		private Long avgLogicalReads;

		private Long retryCount;

		private Long avgRowCacheHit;

		private Long avgDiskReads;

		private Long avgMemstoreReadRows;

		private Long avgSsstoreReadRows;

		private Double avgApplicationWaitTime;

		private Double avgElapsedTime;

		private Double avgExecuteTime;

		private Double avgQueueTime;

		private Double avgConcurrencyWaitTime;

		private Double avgCpuTime;

		private Double avgDecodeTime;

		private Double avgNetWaitTime;

		private Double avgUserIoWaitTime;

		private Double avgGetPlanTime;

		private Double maxElapsedTime;

		private Double sumWaitTime;

		private Double avgScheduleTime;

		private Double maxCpuTime;

		private Double sumElapsedTime;

		private String timestamp;

		private String server;

		private String userName;

		private Double avgPartitionCount;

		private Double failPercentage;

		private Double retCode4012Count;

		private Double retCode4013Count;

		private Double retCode5001Count;

		private Double retCode5024Count;

		private Double retCode5167Count;

		private Double retCode5217Count;

		private Double retCode6002Count;

		private Double avgWaitTime;

		private Double avgWaitCount;

		private Double localPlanPercentage;

		private Double remotePlanPercentage;

		private Double distPlanPercentage;

		private Double avgNetTime;

		private Double avgExecutorRpcCount;

		private Double missPlanPercentage;

		private Double tableScanPercentage;

		private Double strongConsistencyPercentage;

		private Double weakConsistencyPercentage;

		private Double maxAffectedRows;

		private Double maxReturnRows;

		private Double maxWaitTime;

		private Double maxApplicationWaitTime;

		private Double maxConcurrencyWaitTime;

		private Double maxUserIoWaitTime;

		private Double maxDiskReads;

		private Double avgExpectedWorkerCount;

		private Double avgUsedWorkerCount;

		private Double sumLogicalReads;

		private Double execPs;

		private Double avgDbTime;

		private Double sumDbTime;

		public String getSQLId() {
			return this.sQLId;
		}

		public void setSQLId(String sQLId) {
			this.sQLId = sQLId;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public Long getAvgAffectedRows() {
			return this.avgAffectedRows;
		}

		public void setAvgAffectedRows(Long avgAffectedRows) {
			this.avgAffectedRows = avgAffectedRows;
		}

		public Long getAvgBlockCacheHit() {
			return this.avgBlockCacheHit;
		}

		public void setAvgBlockCacheHit(Long avgBlockCacheHit) {
			this.avgBlockCacheHit = avgBlockCacheHit;
		}

		public Long getAvgBlockIndexCacheHit() {
			return this.avgBlockIndexCacheHit;
		}

		public void setAvgBlockIndexCacheHit(Long avgBlockIndexCacheHit) {
			this.avgBlockIndexCacheHit = avgBlockIndexCacheHit;
		}

		public Long getAvgBloomFilterCacheHit() {
			return this.avgBloomFilterCacheHit;
		}

		public void setAvgBloomFilterCacheHit(Long avgBloomFilterCacheHit) {
			this.avgBloomFilterCacheHit = avgBloomFilterCacheHit;
		}

		public Long getExecutions() {
			return this.executions;
		}

		public void setExecutions(Long executions) {
			this.executions = executions;
		}

		public Long getFailCount() {
			return this.failCount;
		}

		public void setFailCount(Long failCount) {
			this.failCount = failCount;
		}

		public Long getAvgRpcCount() {
			return this.avgRpcCount;
		}

		public void setAvgRpcCount(Long avgRpcCount) {
			this.avgRpcCount = avgRpcCount;
		}

		public Long getRemotePlans() {
			return this.remotePlans;
		}

		public void setRemotePlans(Long remotePlans) {
			this.remotePlans = remotePlans;
		}

		public Long getMissPlans() {
			return this.missPlans;
		}

		public void setMissPlans(Long missPlans) {
			this.missPlans = missPlans;
		}

		public Long getAvgReturnRows() {
			return this.avgReturnRows;
		}

		public void setAvgReturnRows(Long avgReturnRows) {
			this.avgReturnRows = avgReturnRows;
		}

		public Long getAvgLogicalReads() {
			return this.avgLogicalReads;
		}

		public void setAvgLogicalReads(Long avgLogicalReads) {
			this.avgLogicalReads = avgLogicalReads;
		}

		public Long getRetryCount() {
			return this.retryCount;
		}

		public void setRetryCount(Long retryCount) {
			this.retryCount = retryCount;
		}

		public Long getAvgRowCacheHit() {
			return this.avgRowCacheHit;
		}

		public void setAvgRowCacheHit(Long avgRowCacheHit) {
			this.avgRowCacheHit = avgRowCacheHit;
		}

		public Long getAvgDiskReads() {
			return this.avgDiskReads;
		}

		public void setAvgDiskReads(Long avgDiskReads) {
			this.avgDiskReads = avgDiskReads;
		}

		public Long getAvgMemstoreReadRows() {
			return this.avgMemstoreReadRows;
		}

		public void setAvgMemstoreReadRows(Long avgMemstoreReadRows) {
			this.avgMemstoreReadRows = avgMemstoreReadRows;
		}

		public Long getAvgSsstoreReadRows() {
			return this.avgSsstoreReadRows;
		}

		public void setAvgSsstoreReadRows(Long avgSsstoreReadRows) {
			this.avgSsstoreReadRows = avgSsstoreReadRows;
		}

		public Double getAvgApplicationWaitTime() {
			return this.avgApplicationWaitTime;
		}

		public void setAvgApplicationWaitTime(Double avgApplicationWaitTime) {
			this.avgApplicationWaitTime = avgApplicationWaitTime;
		}

		public Double getAvgElapsedTime() {
			return this.avgElapsedTime;
		}

		public void setAvgElapsedTime(Double avgElapsedTime) {
			this.avgElapsedTime = avgElapsedTime;
		}

		public Double getAvgExecuteTime() {
			return this.avgExecuteTime;
		}

		public void setAvgExecuteTime(Double avgExecuteTime) {
			this.avgExecuteTime = avgExecuteTime;
		}

		public Double getAvgQueueTime() {
			return this.avgQueueTime;
		}

		public void setAvgQueueTime(Double avgQueueTime) {
			this.avgQueueTime = avgQueueTime;
		}

		public Double getAvgConcurrencyWaitTime() {
			return this.avgConcurrencyWaitTime;
		}

		public void setAvgConcurrencyWaitTime(Double avgConcurrencyWaitTime) {
			this.avgConcurrencyWaitTime = avgConcurrencyWaitTime;
		}

		public Double getAvgCpuTime() {
			return this.avgCpuTime;
		}

		public void setAvgCpuTime(Double avgCpuTime) {
			this.avgCpuTime = avgCpuTime;
		}

		public Double getAvgDecodeTime() {
			return this.avgDecodeTime;
		}

		public void setAvgDecodeTime(Double avgDecodeTime) {
			this.avgDecodeTime = avgDecodeTime;
		}

		public Double getAvgNetWaitTime() {
			return this.avgNetWaitTime;
		}

		public void setAvgNetWaitTime(Double avgNetWaitTime) {
			this.avgNetWaitTime = avgNetWaitTime;
		}

		public Double getAvgUserIoWaitTime() {
			return this.avgUserIoWaitTime;
		}

		public void setAvgUserIoWaitTime(Double avgUserIoWaitTime) {
			this.avgUserIoWaitTime = avgUserIoWaitTime;
		}

		public Double getAvgGetPlanTime() {
			return this.avgGetPlanTime;
		}

		public void setAvgGetPlanTime(Double avgGetPlanTime) {
			this.avgGetPlanTime = avgGetPlanTime;
		}

		public Double getMaxElapsedTime() {
			return this.maxElapsedTime;
		}

		public void setMaxElapsedTime(Double maxElapsedTime) {
			this.maxElapsedTime = maxElapsedTime;
		}

		public Double getSumWaitTime() {
			return this.sumWaitTime;
		}

		public void setSumWaitTime(Double sumWaitTime) {
			this.sumWaitTime = sumWaitTime;
		}

		public Double getAvgScheduleTime() {
			return this.avgScheduleTime;
		}

		public void setAvgScheduleTime(Double avgScheduleTime) {
			this.avgScheduleTime = avgScheduleTime;
		}

		public Double getMaxCpuTime() {
			return this.maxCpuTime;
		}

		public void setMaxCpuTime(Double maxCpuTime) {
			this.maxCpuTime = maxCpuTime;
		}

		public Double getSumElapsedTime() {
			return this.sumElapsedTime;
		}

		public void setSumElapsedTime(Double sumElapsedTime) {
			this.sumElapsedTime = sumElapsedTime;
		}

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		public String getServer() {
			return this.server;
		}

		public void setServer(String server) {
			this.server = server;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Double getAvgPartitionCount() {
			return this.avgPartitionCount;
		}

		public void setAvgPartitionCount(Double avgPartitionCount) {
			this.avgPartitionCount = avgPartitionCount;
		}

		public Double getFailPercentage() {
			return this.failPercentage;
		}

		public void setFailPercentage(Double failPercentage) {
			this.failPercentage = failPercentage;
		}

		public Double getRetCode4012Count() {
			return this.retCode4012Count;
		}

		public void setRetCode4012Count(Double retCode4012Count) {
			this.retCode4012Count = retCode4012Count;
		}

		public Double getRetCode4013Count() {
			return this.retCode4013Count;
		}

		public void setRetCode4013Count(Double retCode4013Count) {
			this.retCode4013Count = retCode4013Count;
		}

		public Double getRetCode5001Count() {
			return this.retCode5001Count;
		}

		public void setRetCode5001Count(Double retCode5001Count) {
			this.retCode5001Count = retCode5001Count;
		}

		public Double getRetCode5024Count() {
			return this.retCode5024Count;
		}

		public void setRetCode5024Count(Double retCode5024Count) {
			this.retCode5024Count = retCode5024Count;
		}

		public Double getRetCode5167Count() {
			return this.retCode5167Count;
		}

		public void setRetCode5167Count(Double retCode5167Count) {
			this.retCode5167Count = retCode5167Count;
		}

		public Double getRetCode5217Count() {
			return this.retCode5217Count;
		}

		public void setRetCode5217Count(Double retCode5217Count) {
			this.retCode5217Count = retCode5217Count;
		}

		public Double getRetCode6002Count() {
			return this.retCode6002Count;
		}

		public void setRetCode6002Count(Double retCode6002Count) {
			this.retCode6002Count = retCode6002Count;
		}

		public Double getAvgWaitTime() {
			return this.avgWaitTime;
		}

		public void setAvgWaitTime(Double avgWaitTime) {
			this.avgWaitTime = avgWaitTime;
		}

		public Double getAvgWaitCount() {
			return this.avgWaitCount;
		}

		public void setAvgWaitCount(Double avgWaitCount) {
			this.avgWaitCount = avgWaitCount;
		}

		public Double getLocalPlanPercentage() {
			return this.localPlanPercentage;
		}

		public void setLocalPlanPercentage(Double localPlanPercentage) {
			this.localPlanPercentage = localPlanPercentage;
		}

		public Double getRemotePlanPercentage() {
			return this.remotePlanPercentage;
		}

		public void setRemotePlanPercentage(Double remotePlanPercentage) {
			this.remotePlanPercentage = remotePlanPercentage;
		}

		public Double getDistPlanPercentage() {
			return this.distPlanPercentage;
		}

		public void setDistPlanPercentage(Double distPlanPercentage) {
			this.distPlanPercentage = distPlanPercentage;
		}

		public Double getAvgNetTime() {
			return this.avgNetTime;
		}

		public void setAvgNetTime(Double avgNetTime) {
			this.avgNetTime = avgNetTime;
		}

		public Double getAvgExecutorRpcCount() {
			return this.avgExecutorRpcCount;
		}

		public void setAvgExecutorRpcCount(Double avgExecutorRpcCount) {
			this.avgExecutorRpcCount = avgExecutorRpcCount;
		}

		public Double getMissPlanPercentage() {
			return this.missPlanPercentage;
		}

		public void setMissPlanPercentage(Double missPlanPercentage) {
			this.missPlanPercentage = missPlanPercentage;
		}

		public Double getTableScanPercentage() {
			return this.tableScanPercentage;
		}

		public void setTableScanPercentage(Double tableScanPercentage) {
			this.tableScanPercentage = tableScanPercentage;
		}

		public Double getStrongConsistencyPercentage() {
			return this.strongConsistencyPercentage;
		}

		public void setStrongConsistencyPercentage(Double strongConsistencyPercentage) {
			this.strongConsistencyPercentage = strongConsistencyPercentage;
		}

		public Double getWeakConsistencyPercentage() {
			return this.weakConsistencyPercentage;
		}

		public void setWeakConsistencyPercentage(Double weakConsistencyPercentage) {
			this.weakConsistencyPercentage = weakConsistencyPercentage;
		}

		public Double getMaxAffectedRows() {
			return this.maxAffectedRows;
		}

		public void setMaxAffectedRows(Double maxAffectedRows) {
			this.maxAffectedRows = maxAffectedRows;
		}

		public Double getMaxReturnRows() {
			return this.maxReturnRows;
		}

		public void setMaxReturnRows(Double maxReturnRows) {
			this.maxReturnRows = maxReturnRows;
		}

		public Double getMaxWaitTime() {
			return this.maxWaitTime;
		}

		public void setMaxWaitTime(Double maxWaitTime) {
			this.maxWaitTime = maxWaitTime;
		}

		public Double getMaxApplicationWaitTime() {
			return this.maxApplicationWaitTime;
		}

		public void setMaxApplicationWaitTime(Double maxApplicationWaitTime) {
			this.maxApplicationWaitTime = maxApplicationWaitTime;
		}

		public Double getMaxConcurrencyWaitTime() {
			return this.maxConcurrencyWaitTime;
		}

		public void setMaxConcurrencyWaitTime(Double maxConcurrencyWaitTime) {
			this.maxConcurrencyWaitTime = maxConcurrencyWaitTime;
		}

		public Double getMaxUserIoWaitTime() {
			return this.maxUserIoWaitTime;
		}

		public void setMaxUserIoWaitTime(Double maxUserIoWaitTime) {
			this.maxUserIoWaitTime = maxUserIoWaitTime;
		}

		public Double getMaxDiskReads() {
			return this.maxDiskReads;
		}

		public void setMaxDiskReads(Double maxDiskReads) {
			this.maxDiskReads = maxDiskReads;
		}

		public Double getAvgExpectedWorkerCount() {
			return this.avgExpectedWorkerCount;
		}

		public void setAvgExpectedWorkerCount(Double avgExpectedWorkerCount) {
			this.avgExpectedWorkerCount = avgExpectedWorkerCount;
		}

		public Double getAvgUsedWorkerCount() {
			return this.avgUsedWorkerCount;
		}

		public void setAvgUsedWorkerCount(Double avgUsedWorkerCount) {
			this.avgUsedWorkerCount = avgUsedWorkerCount;
		}

		public Double getSumLogicalReads() {
			return this.sumLogicalReads;
		}

		public void setSumLogicalReads(Double sumLogicalReads) {
			this.sumLogicalReads = sumLogicalReads;
		}

		public Double getExecPs() {
			return this.execPs;
		}

		public void setExecPs(Double execPs) {
			this.execPs = execPs;
		}

		public Double getAvgDbTime() {
			return this.avgDbTime;
		}

		public void setAvgDbTime(Double avgDbTime) {
			this.avgDbTime = avgDbTime;
		}

		public Double getSumDbTime() {
			return this.sumDbTime;
		}

		public void setSumDbTime(Double sumDbTime) {
			this.sumDbTime = sumDbTime;
		}
	}

	@Override
	public DescribeOasSQLHistoryListResponse getInstance(UnmarshallerContext context) {
		return	DescribeOasSQLHistoryListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
