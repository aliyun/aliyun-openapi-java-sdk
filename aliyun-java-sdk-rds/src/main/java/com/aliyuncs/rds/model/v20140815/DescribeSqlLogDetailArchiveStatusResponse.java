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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeSqlLogDetailArchiveStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSqlLogDetailArchiveStatusResponse extends AcsResponse {

	private String requestId;

	private Integer dBInstanceID;

	private String dBInstanceName;

	private Integer itemsNumbers;

	private List<ArchiveSQLLog> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getDBInstanceID() {
		return this.dBInstanceID;
	}

	public void setDBInstanceID(Integer dBInstanceID) {
		this.dBInstanceID = dBInstanceID;
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
	}

	public Integer getItemsNumbers() {
		return this.itemsNumbers;
	}

	public void setItemsNumbers(Integer itemsNumbers) {
		this.itemsNumbers = itemsNumbers;
	}

	public List<ArchiveSQLLog> getItems() {
		return this.items;
	}

	public void setItems(List<ArchiveSQLLog> items) {
		this.items = items;
	}

	public static class ArchiveSQLLog {

		private String jobName;

		private String createTime;

		private String updateTime;

		private Long processRows;

		private Long totalRows;

		private String failMsg;

		private String jobStatus;

		private String downloadLink;

		private String linkExpiredTime;

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Long getProcessRows() {
			return this.processRows;
		}

		public void setProcessRows(Long processRows) {
			this.processRows = processRows;
		}

		public Long getTotalRows() {
			return this.totalRows;
		}

		public void setTotalRows(Long totalRows) {
			this.totalRows = totalRows;
		}

		public String getFailMsg() {
			return this.failMsg;
		}

		public void setFailMsg(String failMsg) {
			this.failMsg = failMsg;
		}

		public String getJobStatus() {
			return this.jobStatus;
		}

		public void setJobStatus(String jobStatus) {
			this.jobStatus = jobStatus;
		}

		public String getDownloadLink() {
			return this.downloadLink;
		}

		public void setDownloadLink(String downloadLink) {
			this.downloadLink = downloadLink;
		}

		public String getLinkExpiredTime() {
			return this.linkExpiredTime;
		}

		public void setLinkExpiredTime(String linkExpiredTime) {
			this.linkExpiredTime = linkExpiredTime;
		}
	}

	@Override
	public DescribeSqlLogDetailArchiveStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeSqlLogDetailArchiveStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
