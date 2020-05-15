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

package com.aliyuncs.hbase.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20190101.DescribeRestoreTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRestoreTablesResponse extends AcsResponse {

	private String requestId;

	private List<String> tables;

	private RestoreSummary restoreSummary;

	private RestoreSchema restoreSchema;

	private RestoreFull restoreFull;

	private RestoreIncrDetail restoreIncrDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getTables() {
		return this.tables;
	}

	public void setTables(List<String> tables) {
		this.tables = tables;
	}

	public RestoreSummary getRestoreSummary() {
		return this.restoreSummary;
	}

	public void setRestoreSummary(RestoreSummary restoreSummary) {
		this.restoreSummary = restoreSummary;
	}

	public RestoreSchema getRestoreSchema() {
		return this.restoreSchema;
	}

	public void setRestoreSchema(RestoreSchema restoreSchema) {
		this.restoreSchema = restoreSchema;
	}

	public RestoreFull getRestoreFull() {
		return this.restoreFull;
	}

	public void setRestoreFull(RestoreFull restoreFull) {
		this.restoreFull = restoreFull;
	}

	public RestoreIncrDetail getRestoreIncrDetail() {
		return this.restoreIncrDetail;
	}

	public void setRestoreIncrDetail(RestoreIncrDetail restoreIncrDetail) {
		this.restoreIncrDetail = restoreIncrDetail;
	}

	public static class RestoreSummary {

		private String recordId;

		private String startTime;

		private String endTime;

		private String state;

		private String targetCluster;

		private String restoreToDate;

		public String getRecordId() {
			return this.recordId;
		}

		public void setRecordId(String recordId) {
			this.recordId = recordId;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getTargetCluster() {
			return this.targetCluster;
		}

		public void setTargetCluster(String targetCluster) {
			this.targetCluster = targetCluster;
		}

		public String getRestoreToDate() {
			return this.restoreToDate;
		}

		public void setRestoreToDate(String restoreToDate) {
			this.restoreToDate = restoreToDate;
		}
	}

	public static class RestoreSchema {

		private Integer succeed;

		private Integer fail;

		private Long total;

		private Integer pageNumber;

		private Integer pageSize;

		private List<RestoreSchemaDetail> restoreSchemaDetails;

		public Integer getSucceed() {
			return this.succeed;
		}

		public void setSucceed(Integer succeed) {
			this.succeed = succeed;
		}

		public Integer getFail() {
			return this.fail;
		}

		public void setFail(Integer fail) {
			this.fail = fail;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

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

		public List<RestoreSchemaDetail> getRestoreSchemaDetails() {
			return this.restoreSchemaDetails;
		}

		public void setRestoreSchemaDetails(List<RestoreSchemaDetail> restoreSchemaDetails) {
			this.restoreSchemaDetails = restoreSchemaDetails;
		}

		public static class RestoreSchemaDetail {

			private String table;

			private String startTime;

			private String endTime;

			private String state;

			private String message;

			public String getTable() {
				return this.table;
			}

			public void setTable(String table) {
				this.table = table;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}
		}
	}

	public static class RestoreFull {

		private Integer succeed;

		private Integer fail;

		private String dataSize;

		private String speed;

		private Long total;

		private Integer pageNumber;

		private Integer pageSize;

		private List<RestoreFullDetail> restoreFullDetails;

		public Integer getSucceed() {
			return this.succeed;
		}

		public void setSucceed(Integer succeed) {
			this.succeed = succeed;
		}

		public Integer getFail() {
			return this.fail;
		}

		public void setFail(Integer fail) {
			this.fail = fail;
		}

		public String getDataSize() {
			return this.dataSize;
		}

		public void setDataSize(String dataSize) {
			this.dataSize = dataSize;
		}

		public String getSpeed() {
			return this.speed;
		}

		public void setSpeed(String speed) {
			this.speed = speed;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

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

		public List<RestoreFullDetail> getRestoreFullDetails() {
			return this.restoreFullDetails;
		}

		public void setRestoreFullDetails(List<RestoreFullDetail> restoreFullDetails) {
			this.restoreFullDetails = restoreFullDetails;
		}

		public static class RestoreFullDetail {

			private String table;

			private String state;

			private String startTime;

			private String endTime;

			private String process;

			private String dataSize;

			private String speed;

			private String message;

			public String getTable() {
				return this.table;
			}

			public void setTable(String table) {
				this.table = table;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getProcess() {
				return this.process;
			}

			public void setProcess(String process) {
				this.process = process;
			}

			public String getDataSize() {
				return this.dataSize;
			}

			public void setDataSize(String dataSize) {
				this.dataSize = dataSize;
			}

			public String getSpeed() {
				return this.speed;
			}

			public void setSpeed(String speed) {
				this.speed = speed;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}
		}
	}

	public static class RestoreIncrDetail {

		private String state;

		private String startTime;

		private String endTime;

		private String restoreStartTs;

		private String restoredTs;

		private String restoreDelay;

		private String process;

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getRestoreStartTs() {
			return this.restoreStartTs;
		}

		public void setRestoreStartTs(String restoreStartTs) {
			this.restoreStartTs = restoreStartTs;
		}

		public String getRestoredTs() {
			return this.restoredTs;
		}

		public void setRestoredTs(String restoredTs) {
			this.restoredTs = restoredTs;
		}

		public String getRestoreDelay() {
			return this.restoreDelay;
		}

		public void setRestoreDelay(String restoreDelay) {
			this.restoreDelay = restoreDelay;
		}

		public String getProcess() {
			return this.process;
		}

		public void setProcess(String process) {
			this.process = process;
		}
	}

	@Override
	public DescribeRestoreTablesResponse getInstance(UnmarshallerContext context) {
		return	DescribeRestoreTablesResponseUnmarshaller.unmarshall(this, context);
	}
}
