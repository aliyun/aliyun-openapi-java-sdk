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
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeTopSQLListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTopSQLListResponse extends AcsResponse {

	private Long totalCount;

	private String requestId;

	private List<Data> topSQLList;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getTopSQLList() {
		return this.topSQLList;
	}

	public void setTopSQLList(List<Data> topSQLList) {
		this.topSQLList = topSQLList;
	}

	public static class Data {

		private Long key;

		private Float execPerSecond;

		private String sQLText;

		private Float maxCpuTime;

		private Long blockCacheHit;

		private Float decodeTime;

		private Long remotePlans;

		private Long rPCCount;

		private Float netWaitTime;

		private Long diskRead;

		private String nodeIp;

		private Float concurrencyWaitTime;

		private Long memstoreReadRowCount;

		private String dbName;

		private Float appWaitTime;

		private Float elapsedTime;

		private Long missPlans;

		private Long affectedRows;

		private Float scheduleTime;

		private String event;

		private Float totalWaitTime;

		private Long returnRows;

		private Float executeTime;

		private String userName;

		private Long executions;

		private Float getPlanTime;

		private Float cpuTime;

		private Float maxElapsedTime;

		private Long sQLType;

		private Long blockIndexCacheHit;

		private Long retryCount;

		private String sQLId;

		private String clientIp;

		private Long bloomFilterCacheHit;

		private Float iOWaitTime;

		private Long failTimes;

		private Float queueTime;

		private Long rowCacheHit;

		private Long logicalRead;

		private Long ssstoreReadRowCount;

		public Long getKey() {
			return this.key;
		}

		public void setKey(Long key) {
			this.key = key;
		}

		public Float getExecPerSecond() {
			return this.execPerSecond;
		}

		public void setExecPerSecond(Float execPerSecond) {
			this.execPerSecond = execPerSecond;
		}

		public String getSQLText() {
			return this.sQLText;
		}

		public void setSQLText(String sQLText) {
			this.sQLText = sQLText;
		}

		public Float getMaxCpuTime() {
			return this.maxCpuTime;
		}

		public void setMaxCpuTime(Float maxCpuTime) {
			this.maxCpuTime = maxCpuTime;
		}

		public Long getBlockCacheHit() {
			return this.blockCacheHit;
		}

		public void setBlockCacheHit(Long blockCacheHit) {
			this.blockCacheHit = blockCacheHit;
		}

		public Float getDecodeTime() {
			return this.decodeTime;
		}

		public void setDecodeTime(Float decodeTime) {
			this.decodeTime = decodeTime;
		}

		public Long getRemotePlans() {
			return this.remotePlans;
		}

		public void setRemotePlans(Long remotePlans) {
			this.remotePlans = remotePlans;
		}

		public Long getRPCCount() {
			return this.rPCCount;
		}

		public void setRPCCount(Long rPCCount) {
			this.rPCCount = rPCCount;
		}

		public Float getNetWaitTime() {
			return this.netWaitTime;
		}

		public void setNetWaitTime(Float netWaitTime) {
			this.netWaitTime = netWaitTime;
		}

		public Long getDiskRead() {
			return this.diskRead;
		}

		public void setDiskRead(Long diskRead) {
			this.diskRead = diskRead;
		}

		public String getNodeIp() {
			return this.nodeIp;
		}

		public void setNodeIp(String nodeIp) {
			this.nodeIp = nodeIp;
		}

		public Float getConcurrencyWaitTime() {
			return this.concurrencyWaitTime;
		}

		public void setConcurrencyWaitTime(Float concurrencyWaitTime) {
			this.concurrencyWaitTime = concurrencyWaitTime;
		}

		public Long getMemstoreReadRowCount() {
			return this.memstoreReadRowCount;
		}

		public void setMemstoreReadRowCount(Long memstoreReadRowCount) {
			this.memstoreReadRowCount = memstoreReadRowCount;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public Float getAppWaitTime() {
			return this.appWaitTime;
		}

		public void setAppWaitTime(Float appWaitTime) {
			this.appWaitTime = appWaitTime;
		}

		public Float getElapsedTime() {
			return this.elapsedTime;
		}

		public void setElapsedTime(Float elapsedTime) {
			this.elapsedTime = elapsedTime;
		}

		public Long getMissPlans() {
			return this.missPlans;
		}

		public void setMissPlans(Long missPlans) {
			this.missPlans = missPlans;
		}

		public Long getAffectedRows() {
			return this.affectedRows;
		}

		public void setAffectedRows(Long affectedRows) {
			this.affectedRows = affectedRows;
		}

		public Float getScheduleTime() {
			return this.scheduleTime;
		}

		public void setScheduleTime(Float scheduleTime) {
			this.scheduleTime = scheduleTime;
		}

		public String getEvent() {
			return this.event;
		}

		public void setEvent(String event) {
			this.event = event;
		}

		public Float getTotalWaitTime() {
			return this.totalWaitTime;
		}

		public void setTotalWaitTime(Float totalWaitTime) {
			this.totalWaitTime = totalWaitTime;
		}

		public Long getReturnRows() {
			return this.returnRows;
		}

		public void setReturnRows(Long returnRows) {
			this.returnRows = returnRows;
		}

		public Float getExecuteTime() {
			return this.executeTime;
		}

		public void setExecuteTime(Float executeTime) {
			this.executeTime = executeTime;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Long getExecutions() {
			return this.executions;
		}

		public void setExecutions(Long executions) {
			this.executions = executions;
		}

		public Float getGetPlanTime() {
			return this.getPlanTime;
		}

		public void setGetPlanTime(Float getPlanTime) {
			this.getPlanTime = getPlanTime;
		}

		public Float getCpuTime() {
			return this.cpuTime;
		}

		public void setCpuTime(Float cpuTime) {
			this.cpuTime = cpuTime;
		}

		public Float getMaxElapsedTime() {
			return this.maxElapsedTime;
		}

		public void setMaxElapsedTime(Float maxElapsedTime) {
			this.maxElapsedTime = maxElapsedTime;
		}

		public Long getSQLType() {
			return this.sQLType;
		}

		public void setSQLType(Long sQLType) {
			this.sQLType = sQLType;
		}

		public Long getBlockIndexCacheHit() {
			return this.blockIndexCacheHit;
		}

		public void setBlockIndexCacheHit(Long blockIndexCacheHit) {
			this.blockIndexCacheHit = blockIndexCacheHit;
		}

		public Long getRetryCount() {
			return this.retryCount;
		}

		public void setRetryCount(Long retryCount) {
			this.retryCount = retryCount;
		}

		public String getSQLId() {
			return this.sQLId;
		}

		public void setSQLId(String sQLId) {
			this.sQLId = sQLId;
		}

		public String getClientIp() {
			return this.clientIp;
		}

		public void setClientIp(String clientIp) {
			this.clientIp = clientIp;
		}

		public Long getBloomFilterCacheHit() {
			return this.bloomFilterCacheHit;
		}

		public void setBloomFilterCacheHit(Long bloomFilterCacheHit) {
			this.bloomFilterCacheHit = bloomFilterCacheHit;
		}

		public Float getIOWaitTime() {
			return this.iOWaitTime;
		}

		public void setIOWaitTime(Float iOWaitTime) {
			this.iOWaitTime = iOWaitTime;
		}

		public Long getFailTimes() {
			return this.failTimes;
		}

		public void setFailTimes(Long failTimes) {
			this.failTimes = failTimes;
		}

		public Float getQueueTime() {
			return this.queueTime;
		}

		public void setQueueTime(Float queueTime) {
			this.queueTime = queueTime;
		}

		public Long getRowCacheHit() {
			return this.rowCacheHit;
		}

		public void setRowCacheHit(Long rowCacheHit) {
			this.rowCacheHit = rowCacheHit;
		}

		public Long getLogicalRead() {
			return this.logicalRead;
		}

		public void setLogicalRead(Long logicalRead) {
			this.logicalRead = logicalRead;
		}

		public Long getSsstoreReadRowCount() {
			return this.ssstoreReadRowCount;
		}

		public void setSsstoreReadRowCount(Long ssstoreReadRowCount) {
			this.ssstoreReadRowCount = ssstoreReadRowCount;
		}
	}

	@Override
	public DescribeTopSQLListResponse getInstance(UnmarshallerContext context) {
		return	DescribeTopSQLListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
