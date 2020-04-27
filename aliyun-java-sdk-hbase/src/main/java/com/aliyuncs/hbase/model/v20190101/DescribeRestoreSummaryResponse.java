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
import com.aliyuncs.hbase.transform.v20190101.DescribeRestoreSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRestoreSummaryResponse extends AcsResponse {

	private String requestId;

	private Integer restoreRecordSize;

	private Integer hasMoreRestoreRecord;

	private List<Rescord> rescords;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getRestoreRecordSize() {
		return this.restoreRecordSize;
	}

	public void setRestoreRecordSize(Integer restoreRecordSize) {
		this.restoreRecordSize = restoreRecordSize;
	}

	public Integer getHasMoreRestoreRecord() {
		return this.hasMoreRestoreRecord;
	}

	public void setHasMoreRestoreRecord(Integer hasMoreRestoreRecord) {
		this.hasMoreRestoreRecord = hasMoreRestoreRecord;
	}

	public List<Rescord> getRescords() {
		return this.rescords;
	}

	public void setRescords(List<Rescord> rescords) {
		this.rescords = rescords;
	}

	public static class Rescord {

		private String recordId;

		private String finishTime;

		private String schemaProcess;

		private String hfileRestoreProcess;

		private String createTime;

		private String bulkLoadProcess;

		private String status;

		private String logProcess;

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

		public String getSchemaProcess() {
			return this.schemaProcess;
		}

		public void setSchemaProcess(String schemaProcess) {
			this.schemaProcess = schemaProcess;
		}

		public String getHfileRestoreProcess() {
			return this.hfileRestoreProcess;
		}

		public void setHfileRestoreProcess(String hfileRestoreProcess) {
			this.hfileRestoreProcess = hfileRestoreProcess;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getBulkLoadProcess() {
			return this.bulkLoadProcess;
		}

		public void setBulkLoadProcess(String bulkLoadProcess) {
			this.bulkLoadProcess = bulkLoadProcess;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getLogProcess() {
			return this.logProcess;
		}

		public void setLogProcess(String logProcess) {
			this.logProcess = logProcess;
		}
	}

	@Override
	public DescribeRestoreSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeRestoreSummaryResponseUnmarshaller.unmarshall(this, context);
	}
}
