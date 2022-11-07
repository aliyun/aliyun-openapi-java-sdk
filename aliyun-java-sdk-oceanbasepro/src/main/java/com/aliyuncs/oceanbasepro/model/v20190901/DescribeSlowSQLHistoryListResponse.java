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
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeSlowSQLHistoryListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSlowSQLHistoryListResponse extends AcsResponse {

	private String requestId;

	private SlowSQLHistoryList slowSQLHistoryList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SlowSQLHistoryList getSlowSQLHistoryList() {
		return this.slowSQLHistoryList;
	}

	public void setSlowSQLHistoryList(SlowSQLHistoryList slowSQLHistoryList) {
		this.slowSQLHistoryList = slowSQLHistoryList;
	}

	public static class SlowSQLHistoryList {

		private Long count;

		private List<ListItem> list;

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String sqlId;

			private String sqlType;

			private String tenantName;

			private String userName;

			private String clientIp;

			private String dbName;

			private String event;

			private String nodeIp;

			private Double affectedRows;

			private Double blockCacheHit;

			private Double blockIndexCacheHit;

			private Double bloomFilterCacheHit;

			private Double executions;

			private Double failTimes;

			private Double rPCCount;

			private Double remotePlans;

			private Double missPlans;

			private Double returnRows;

			private Double logicalRead;

			private Double retryCount;

			private Double rowCacheHit;

			private Double diskRead;

			private Double memstoreReadRowCount;

			private Double ssstoreReadRowCount;

			private Double execPerSecond;

			private Double appWaitTime;

			private Double elapsedTime;

			private Double executeTime;

			private Double queueTime;

			private Double concurrencyWaitTime;

			private Double cpuTime;

			private Double decodeTime;

			private Double netwaitTime;

			private Double iOWaitTime;

			private Double getplanTime;

			private Double maxElapsedTime;

			private Double totalWaitTime;

			private Double scheduleTime;

			private Double maxCpuTime;

			private String endTimeUTCString;

			public String getSqlId() {
				return this.sqlId;
			}

			public void setSqlId(String sqlId) {
				this.sqlId = sqlId;
			}

			public String getSqlType() {
				return this.sqlType;
			}

			public void setSqlType(String sqlType) {
				this.sqlType = sqlType;
			}

			public String getTenantName() {
				return this.tenantName;
			}

			public void setTenantName(String tenantName) {
				this.tenantName = tenantName;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getClientIp() {
				return this.clientIp;
			}

			public void setClientIp(String clientIp) {
				this.clientIp = clientIp;
			}

			public String getDbName() {
				return this.dbName;
			}

			public void setDbName(String dbName) {
				this.dbName = dbName;
			}

			public String getEvent() {
				return this.event;
			}

			public void setEvent(String event) {
				this.event = event;
			}

			public String getNodeIp() {
				return this.nodeIp;
			}

			public void setNodeIp(String nodeIp) {
				this.nodeIp = nodeIp;
			}

			public Double getAffectedRows() {
				return this.affectedRows;
			}

			public void setAffectedRows(Double affectedRows) {
				this.affectedRows = affectedRows;
			}

			public Double getBlockCacheHit() {
				return this.blockCacheHit;
			}

			public void setBlockCacheHit(Double blockCacheHit) {
				this.blockCacheHit = blockCacheHit;
			}

			public Double getBlockIndexCacheHit() {
				return this.blockIndexCacheHit;
			}

			public void setBlockIndexCacheHit(Double blockIndexCacheHit) {
				this.blockIndexCacheHit = blockIndexCacheHit;
			}

			public Double getBloomFilterCacheHit() {
				return this.bloomFilterCacheHit;
			}

			public void setBloomFilterCacheHit(Double bloomFilterCacheHit) {
				this.bloomFilterCacheHit = bloomFilterCacheHit;
			}

			public Double getExecutions() {
				return this.executions;
			}

			public void setExecutions(Double executions) {
				this.executions = executions;
			}

			public Double getFailTimes() {
				return this.failTimes;
			}

			public void setFailTimes(Double failTimes) {
				this.failTimes = failTimes;
			}

			public Double getRPCCount() {
				return this.rPCCount;
			}

			public void setRPCCount(Double rPCCount) {
				this.rPCCount = rPCCount;
			}

			public Double getRemotePlans() {
				return this.remotePlans;
			}

			public void setRemotePlans(Double remotePlans) {
				this.remotePlans = remotePlans;
			}

			public Double getMissPlans() {
				return this.missPlans;
			}

			public void setMissPlans(Double missPlans) {
				this.missPlans = missPlans;
			}

			public Double getReturnRows() {
				return this.returnRows;
			}

			public void setReturnRows(Double returnRows) {
				this.returnRows = returnRows;
			}

			public Double getLogicalRead() {
				return this.logicalRead;
			}

			public void setLogicalRead(Double logicalRead) {
				this.logicalRead = logicalRead;
			}

			public Double getRetryCount() {
				return this.retryCount;
			}

			public void setRetryCount(Double retryCount) {
				this.retryCount = retryCount;
			}

			public Double getRowCacheHit() {
				return this.rowCacheHit;
			}

			public void setRowCacheHit(Double rowCacheHit) {
				this.rowCacheHit = rowCacheHit;
			}

			public Double getDiskRead() {
				return this.diskRead;
			}

			public void setDiskRead(Double diskRead) {
				this.diskRead = diskRead;
			}

			public Double getMemstoreReadRowCount() {
				return this.memstoreReadRowCount;
			}

			public void setMemstoreReadRowCount(Double memstoreReadRowCount) {
				this.memstoreReadRowCount = memstoreReadRowCount;
			}

			public Double getSsstoreReadRowCount() {
				return this.ssstoreReadRowCount;
			}

			public void setSsstoreReadRowCount(Double ssstoreReadRowCount) {
				this.ssstoreReadRowCount = ssstoreReadRowCount;
			}

			public Double getExecPerSecond() {
				return this.execPerSecond;
			}

			public void setExecPerSecond(Double execPerSecond) {
				this.execPerSecond = execPerSecond;
			}

			public Double getAppWaitTime() {
				return this.appWaitTime;
			}

			public void setAppWaitTime(Double appWaitTime) {
				this.appWaitTime = appWaitTime;
			}

			public Double getElapsedTime() {
				return this.elapsedTime;
			}

			public void setElapsedTime(Double elapsedTime) {
				this.elapsedTime = elapsedTime;
			}

			public Double getExecuteTime() {
				return this.executeTime;
			}

			public void setExecuteTime(Double executeTime) {
				this.executeTime = executeTime;
			}

			public Double getQueueTime() {
				return this.queueTime;
			}

			public void setQueueTime(Double queueTime) {
				this.queueTime = queueTime;
			}

			public Double getConcurrencyWaitTime() {
				return this.concurrencyWaitTime;
			}

			public void setConcurrencyWaitTime(Double concurrencyWaitTime) {
				this.concurrencyWaitTime = concurrencyWaitTime;
			}

			public Double getCpuTime() {
				return this.cpuTime;
			}

			public void setCpuTime(Double cpuTime) {
				this.cpuTime = cpuTime;
			}

			public Double getDecodeTime() {
				return this.decodeTime;
			}

			public void setDecodeTime(Double decodeTime) {
				this.decodeTime = decodeTime;
			}

			public Double getNetwaitTime() {
				return this.netwaitTime;
			}

			public void setNetwaitTime(Double netwaitTime) {
				this.netwaitTime = netwaitTime;
			}

			public Double getIOWaitTime() {
				return this.iOWaitTime;
			}

			public void setIOWaitTime(Double iOWaitTime) {
				this.iOWaitTime = iOWaitTime;
			}

			public Double getGetplanTime() {
				return this.getplanTime;
			}

			public void setGetplanTime(Double getplanTime) {
				this.getplanTime = getplanTime;
			}

			public Double getMaxElapsedTime() {
				return this.maxElapsedTime;
			}

			public void setMaxElapsedTime(Double maxElapsedTime) {
				this.maxElapsedTime = maxElapsedTime;
			}

			public Double getTotalWaitTime() {
				return this.totalWaitTime;
			}

			public void setTotalWaitTime(Double totalWaitTime) {
				this.totalWaitTime = totalWaitTime;
			}

			public Double getScheduleTime() {
				return this.scheduleTime;
			}

			public void setScheduleTime(Double scheduleTime) {
				this.scheduleTime = scheduleTime;
			}

			public Double getMaxCpuTime() {
				return this.maxCpuTime;
			}

			public void setMaxCpuTime(Double maxCpuTime) {
				this.maxCpuTime = maxCpuTime;
			}

			public String getEndTimeUTCString() {
				return this.endTimeUTCString;
			}

			public void setEndTimeUTCString(String endTimeUTCString) {
				this.endTimeUTCString = endTimeUTCString;
			}
		}
	}

	@Override
	public DescribeSlowSQLHistoryListResponse getInstance(UnmarshallerContext context) {
		return	DescribeSlowSQLHistoryListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
