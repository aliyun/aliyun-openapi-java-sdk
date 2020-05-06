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
import com.aliyuncs.hbase.transform.v20190101.DescribeBackupSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupSummaryResponse extends AcsResponse {

	private String requestId;

	private Incr incr;

	private Full full;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Incr getIncr() {
		return this.incr;
	}

	public void setIncr(Incr incr) {
		this.incr = incr;
	}

	public Full getFull() {
		return this.full;
	}

	public void setFull(Full full) {
		this.full = full;
	}

	public static class Incr {

		private String pos;

		private String queueLogNum;

		private String speed;

		private String status;

		private String runningLogNum;

		private String backupLogSize;

		public String getPos() {
			return this.pos;
		}

		public void setPos(String pos) {
			this.pos = pos;
		}

		public String getQueueLogNum() {
			return this.queueLogNum;
		}

		public void setQueueLogNum(String queueLogNum) {
			this.queueLogNum = queueLogNum;
		}

		public String getSpeed() {
			return this.speed;
		}

		public void setSpeed(String speed) {
			this.speed = speed;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getRunningLogNum() {
			return this.runningLogNum;
		}

		public void setRunningLogNum(String runningLogNum) {
			this.runningLogNum = runningLogNum;
		}

		public String getBackupLogSize() {
			return this.backupLogSize;
		}

		public void setBackupLogSize(String backupLogSize) {
			this.backupLogSize = backupLogSize;
		}
	}

	public static class Full {

		private String hasMore;

		private String nextFullBackupDate;

		private Integer pageNumber;

		private Integer pageSize;

		private Integer total;

		private List<Record> records;

		public String getHasMore() {
			return this.hasMore;
		}

		public void setHasMore(String hasMore) {
			this.hasMore = hasMore;
		}

		public String getNextFullBackupDate() {
			return this.nextFullBackupDate;
		}

		public void setNextFullBackupDate(String nextFullBackupDate) {
			this.nextFullBackupDate = nextFullBackupDate;
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

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<Record> getRecords() {
			return this.records;
		}

		public void setRecords(List<Record> records) {
			this.records = records;
		}

		public static class Record {

			private String recordId;

			private String finishTime;

			private String process;

			private String createTime;

			private String dataSize;

			private String speed;

			private String status;

			public String getRecordId() {
				return this.recordId;
			}

			public void setRecordId(String recordId) {
				this.recordId = recordId;
			}

			public String getFinishTime() {
				return this.finishTime;
			}

			public void setFinishTime(String finishTime) {
				this.finishTime = finishTime;
			}

			public String getProcess() {
				return this.process;
			}

			public void setProcess(String process) {
				this.process = process;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public DescribeBackupSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupSummaryResponseUnmarshaller.unmarshall(this, context);
	}
}
