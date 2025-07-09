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
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeSQLSamplesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLSamplesResponse extends AcsResponse {

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

		private Long requestId;

		private String traceId;

		private String requestTime;

		private String server;

		private String clientIp;

		private Integer clientPort;

		private String dbName;

		private String userName;

		private String sqlType;

		private Long planId;

		private Long affectedRows;

		private Long returnRows;

		private Long partitionCount;

		private Integer retCode;

		private String waitEvent;

		private Double waitTime;

		private Long waitCount;

		private Long rpcCount;

		private String planType;

		private Boolean inner;

		private Boolean executorRpc;

		private Boolean hitPlan;

		private Double elapsedTime;

		private Double cpuTime;

		private Double netTime;

		private Double netWaitTime;

		private Double queueTime;

		private Double decodeTime;

		private Double getPlanTime;

		private Double executeTime;

		private Double applicationWaitTime;

		private Double concurrencyWaitTime;

		private Double userIoWaitTime;

		private Double scheduleTime;

		private Double rowCacheHit;

		private Double bloomFilterCacheHit;

		private Double blockCacheHit;

		private Double blockIndexCacheHit;

		private Double diskReads;

		private Long retryCount;

		private Boolean tableScan;

		private String consistencyLevel;

		private Long memstoreReadRows;

		private Long expectedWorkerCount;

		private Long usedWorkerCount;

		private Long ssstoreReadRows;

		private Long obServerId;

		private Long obUserId;

		private Long obDbId;

		private String statement;

		private String transHash;

		private String fullSqlText;

		private String sqlText;

		private String paramsValue;

		public Long getRequestId() {
			return this.requestId;
		}

		public void setRequestId(Long requestId) {
			this.requestId = requestId;
		}

		public String getTraceId() {
			return this.traceId;
		}

		public void setTraceId(String traceId) {
			this.traceId = traceId;
		}

		public String getRequestTime() {
			return this.requestTime;
		}

		public void setRequestTime(String requestTime) {
			this.requestTime = requestTime;
		}

		public String getServer() {
			return this.server;
		}

		public void setServer(String server) {
			this.server = server;
		}

		public String getClientIp() {
			return this.clientIp;
		}

		public void setClientIp(String clientIp) {
			this.clientIp = clientIp;
		}

		public Integer getClientPort() {
			return this.clientPort;
		}

		public void setClientPort(Integer clientPort) {
			this.clientPort = clientPort;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getSqlType() {
			return this.sqlType;
		}

		public void setSqlType(String sqlType) {
			this.sqlType = sqlType;
		}

		public Long getPlanId() {
			return this.planId;
		}

		public void setPlanId(Long planId) {
			this.planId = planId;
		}

		public Long getAffectedRows() {
			return this.affectedRows;
		}

		public void setAffectedRows(Long affectedRows) {
			this.affectedRows = affectedRows;
		}

		public Long getReturnRows() {
			return this.returnRows;
		}

		public void setReturnRows(Long returnRows) {
			this.returnRows = returnRows;
		}

		public Long getPartitionCount() {
			return this.partitionCount;
		}

		public void setPartitionCount(Long partitionCount) {
			this.partitionCount = partitionCount;
		}

		public Integer getRetCode() {
			return this.retCode;
		}

		public void setRetCode(Integer retCode) {
			this.retCode = retCode;
		}

		public String getWaitEvent() {
			return this.waitEvent;
		}

		public void setWaitEvent(String waitEvent) {
			this.waitEvent = waitEvent;
		}

		public Double getWaitTime() {
			return this.waitTime;
		}

		public void setWaitTime(Double waitTime) {
			this.waitTime = waitTime;
		}

		public Long getWaitCount() {
			return this.waitCount;
		}

		public void setWaitCount(Long waitCount) {
			this.waitCount = waitCount;
		}

		public Long getRpcCount() {
			return this.rpcCount;
		}

		public void setRpcCount(Long rpcCount) {
			this.rpcCount = rpcCount;
		}

		public String getPlanType() {
			return this.planType;
		}

		public void setPlanType(String planType) {
			this.planType = planType;
		}

		public Boolean getInner() {
			return this.inner;
		}

		public void setInner(Boolean inner) {
			this.inner = inner;
		}

		public Boolean getExecutorRpc() {
			return this.executorRpc;
		}

		public void setExecutorRpc(Boolean executorRpc) {
			this.executorRpc = executorRpc;
		}

		public Boolean getHitPlan() {
			return this.hitPlan;
		}

		public void setHitPlan(Boolean hitPlan) {
			this.hitPlan = hitPlan;
		}

		public Double getElapsedTime() {
			return this.elapsedTime;
		}

		public void setElapsedTime(Double elapsedTime) {
			this.elapsedTime = elapsedTime;
		}

		public Double getCpuTime() {
			return this.cpuTime;
		}

		public void setCpuTime(Double cpuTime) {
			this.cpuTime = cpuTime;
		}

		public Double getNetTime() {
			return this.netTime;
		}

		public void setNetTime(Double netTime) {
			this.netTime = netTime;
		}

		public Double getNetWaitTime() {
			return this.netWaitTime;
		}

		public void setNetWaitTime(Double netWaitTime) {
			this.netWaitTime = netWaitTime;
		}

		public Double getQueueTime() {
			return this.queueTime;
		}

		public void setQueueTime(Double queueTime) {
			this.queueTime = queueTime;
		}

		public Double getDecodeTime() {
			return this.decodeTime;
		}

		public void setDecodeTime(Double decodeTime) {
			this.decodeTime = decodeTime;
		}

		public Double getGetPlanTime() {
			return this.getPlanTime;
		}

		public void setGetPlanTime(Double getPlanTime) {
			this.getPlanTime = getPlanTime;
		}

		public Double getExecuteTime() {
			return this.executeTime;
		}

		public void setExecuteTime(Double executeTime) {
			this.executeTime = executeTime;
		}

		public Double getApplicationWaitTime() {
			return this.applicationWaitTime;
		}

		public void setApplicationWaitTime(Double applicationWaitTime) {
			this.applicationWaitTime = applicationWaitTime;
		}

		public Double getConcurrencyWaitTime() {
			return this.concurrencyWaitTime;
		}

		public void setConcurrencyWaitTime(Double concurrencyWaitTime) {
			this.concurrencyWaitTime = concurrencyWaitTime;
		}

		public Double getUserIoWaitTime() {
			return this.userIoWaitTime;
		}

		public void setUserIoWaitTime(Double userIoWaitTime) {
			this.userIoWaitTime = userIoWaitTime;
		}

		public Double getScheduleTime() {
			return this.scheduleTime;
		}

		public void setScheduleTime(Double scheduleTime) {
			this.scheduleTime = scheduleTime;
		}

		public Double getRowCacheHit() {
			return this.rowCacheHit;
		}

		public void setRowCacheHit(Double rowCacheHit) {
			this.rowCacheHit = rowCacheHit;
		}

		public Double getBloomFilterCacheHit() {
			return this.bloomFilterCacheHit;
		}

		public void setBloomFilterCacheHit(Double bloomFilterCacheHit) {
			this.bloomFilterCacheHit = bloomFilterCacheHit;
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

		public Double getDiskReads() {
			return this.diskReads;
		}

		public void setDiskReads(Double diskReads) {
			this.diskReads = diskReads;
		}

		public Long getRetryCount() {
			return this.retryCount;
		}

		public void setRetryCount(Long retryCount) {
			this.retryCount = retryCount;
		}

		public Boolean getTableScan() {
			return this.tableScan;
		}

		public void setTableScan(Boolean tableScan) {
			this.tableScan = tableScan;
		}

		public String getConsistencyLevel() {
			return this.consistencyLevel;
		}

		public void setConsistencyLevel(String consistencyLevel) {
			this.consistencyLevel = consistencyLevel;
		}

		public Long getMemstoreReadRows() {
			return this.memstoreReadRows;
		}

		public void setMemstoreReadRows(Long memstoreReadRows) {
			this.memstoreReadRows = memstoreReadRows;
		}

		public Long getExpectedWorkerCount() {
			return this.expectedWorkerCount;
		}

		public void setExpectedWorkerCount(Long expectedWorkerCount) {
			this.expectedWorkerCount = expectedWorkerCount;
		}

		public Long getUsedWorkerCount() {
			return this.usedWorkerCount;
		}

		public void setUsedWorkerCount(Long usedWorkerCount) {
			this.usedWorkerCount = usedWorkerCount;
		}

		public Long getSsstoreReadRows() {
			return this.ssstoreReadRows;
		}

		public void setSsstoreReadRows(Long ssstoreReadRows) {
			this.ssstoreReadRows = ssstoreReadRows;
		}

		public Long getObServerId() {
			return this.obServerId;
		}

		public void setObServerId(Long obServerId) {
			this.obServerId = obServerId;
		}

		public Long getObUserId() {
			return this.obUserId;
		}

		public void setObUserId(Long obUserId) {
			this.obUserId = obUserId;
		}

		public Long getObDbId() {
			return this.obDbId;
		}

		public void setObDbId(Long obDbId) {
			this.obDbId = obDbId;
		}

		public String getStatement() {
			return this.statement;
		}

		public void setStatement(String statement) {
			this.statement = statement;
		}

		public String getTransHash() {
			return this.transHash;
		}

		public void setTransHash(String transHash) {
			this.transHash = transHash;
		}

		public String getFullSqlText() {
			return this.fullSqlText;
		}

		public void setFullSqlText(String fullSqlText) {
			this.fullSqlText = fullSqlText;
		}

		public String getSqlText() {
			return this.sqlText;
		}

		public void setSqlText(String sqlText) {
			this.sqlText = sqlText;
		}

		public String getParamsValue() {
			return this.paramsValue;
		}

		public void setParamsValue(String paramsValue) {
			this.paramsValue = paramsValue;
		}
	}

	@Override
	public DescribeSQLSamplesResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLSamplesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
