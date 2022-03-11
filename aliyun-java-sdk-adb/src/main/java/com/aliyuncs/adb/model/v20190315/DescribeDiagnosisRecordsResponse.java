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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeDiagnosisRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiagnosisRecordsResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private String requestId;

	private List<Items> querys;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Items> getQuerys() {
		return this.querys;
	}

	public void setQuerys(List<Items> querys) {
		this.querys = querys;
	}

	public static class Items {

		private String sQL;

		private Long sQLTruncatedThreshold;

		private String status;

		private Long outputDataSize;

		private Long cost;

		private Long outputRows;

		private String rcHost;

		private Long scanSize;

		private String processId;

		private Long startTime;

		private Boolean sQLTruncated;

		private String database;

		private Long scanRows;

		private Integer resourceCostRank;

		private String clientIp;

		private Long peakMemory;

		private Long queueTime;

		private String resourceGroup;

		private String userName;

		private Long executionTime;

		private Long totalPlanningTime;

		private Long etlWriteRows;

		private Integer totalStages;

		public String getSQL() {
			return this.sQL;
		}

		public void setSQL(String sQL) {
			this.sQL = sQL;
		}

		public Long getSQLTruncatedThreshold() {
			return this.sQLTruncatedThreshold;
		}

		public void setSQLTruncatedThreshold(Long sQLTruncatedThreshold) {
			this.sQLTruncatedThreshold = sQLTruncatedThreshold;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getOutputDataSize() {
			return this.outputDataSize;
		}

		public void setOutputDataSize(Long outputDataSize) {
			this.outputDataSize = outputDataSize;
		}

		public Long getCost() {
			return this.cost;
		}

		public void setCost(Long cost) {
			this.cost = cost;
		}

		public Long getOutputRows() {
			return this.outputRows;
		}

		public void setOutputRows(Long outputRows) {
			this.outputRows = outputRows;
		}

		public String getRcHost() {
			return this.rcHost;
		}

		public void setRcHost(String rcHost) {
			this.rcHost = rcHost;
		}

		public Long getScanSize() {
			return this.scanSize;
		}

		public void setScanSize(Long scanSize) {
			this.scanSize = scanSize;
		}

		public String getProcessId() {
			return this.processId;
		}

		public void setProcessId(String processId) {
			this.processId = processId;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Boolean getSQLTruncated() {
			return this.sQLTruncated;
		}

		public void setSQLTruncated(Boolean sQLTruncated) {
			this.sQLTruncated = sQLTruncated;
		}

		public String getDatabase() {
			return this.database;
		}

		public void setDatabase(String database) {
			this.database = database;
		}

		public Long getScanRows() {
			return this.scanRows;
		}

		public void setScanRows(Long scanRows) {
			this.scanRows = scanRows;
		}

		public Integer getResourceCostRank() {
			return this.resourceCostRank;
		}

		public void setResourceCostRank(Integer resourceCostRank) {
			this.resourceCostRank = resourceCostRank;
		}

		public String getClientIp() {
			return this.clientIp;
		}

		public void setClientIp(String clientIp) {
			this.clientIp = clientIp;
		}

		public Long getPeakMemory() {
			return this.peakMemory;
		}

		public void setPeakMemory(Long peakMemory) {
			this.peakMemory = peakMemory;
		}

		public Long getQueueTime() {
			return this.queueTime;
		}

		public void setQueueTime(Long queueTime) {
			this.queueTime = queueTime;
		}

		public String getResourceGroup() {
			return this.resourceGroup;
		}

		public void setResourceGroup(String resourceGroup) {
			this.resourceGroup = resourceGroup;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Long getExecutionTime() {
			return this.executionTime;
		}

		public void setExecutionTime(Long executionTime) {
			this.executionTime = executionTime;
		}

		public Long getTotalPlanningTime() {
			return this.totalPlanningTime;
		}

		public void setTotalPlanningTime(Long totalPlanningTime) {
			this.totalPlanningTime = totalPlanningTime;
		}

		public Long getEtlWriteRows() {
			return this.etlWriteRows;
		}

		public void setEtlWriteRows(Long etlWriteRows) {
			this.etlWriteRows = etlWriteRows;
		}

		public Integer getTotalStages() {
			return this.totalStages;
		}

		public void setTotalStages(Integer totalStages) {
			this.totalStages = totalStages;
		}
	}

	@Override
	public DescribeDiagnosisRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiagnosisRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
