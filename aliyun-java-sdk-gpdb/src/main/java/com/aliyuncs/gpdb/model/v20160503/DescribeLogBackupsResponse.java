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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeLogBackupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogBackupsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalLogSize;

	private List<Backup> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public Long getTotalLogSize() {
		return this.totalLogSize;
	}

	public void setTotalLogSize(Long totalLogSize) {
		this.totalLogSize = totalLogSize;
	}

	public List<Backup> getItems() {
		return this.items;
	}

	public void setItems(List<Backup> items) {
		this.items = items;
	}

	public static class Backup {

		private String backupId;

		private String dBInstanceId;

		private String segmentName;

		private String logFileName;

		private String logTime;

		private Long logFileSize;

		public String getBackupId() {
			return this.backupId;
		}

		public void setBackupId(String backupId) {
			this.backupId = backupId;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getSegmentName() {
			return this.segmentName;
		}

		public void setSegmentName(String segmentName) {
			this.segmentName = segmentName;
		}

		public String getLogFileName() {
			return this.logFileName;
		}

		public void setLogFileName(String logFileName) {
			this.logFileName = logFileName;
		}

		public String getLogTime() {
			return this.logTime;
		}

		public void setLogTime(String logTime) {
			this.logTime = logTime;
		}

		public Long getLogFileSize() {
			return this.logFileSize;
		}

		public void setLogFileSize(Long logFileSize) {
			this.logFileSize = logFileSize;
		}
	}

	@Override
	public DescribeLogBackupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogBackupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
