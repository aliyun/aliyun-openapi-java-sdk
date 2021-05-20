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

package com.aliyuncs.dbfs.model.v20200418;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dbfs.transform.v20200418.DbfsRecordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DbfsRecordResponse extends AcsResponse {

	private String requestId;

	private List<RecordsItem> records;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RecordsItem> getRecords() {
		return this.records;
	}

	public void setRecords(List<RecordsItem> records) {
		this.records = records;
	}

	public static class RecordsItem {

		private Long id;

		private String batchStrategyNo;

		private String accountId;

		private String dbfsId;

		private String ecsId;

		private String taskId;

		private String regionId;

		private String zoneId;

		private String state;

		private String currentVersion;

		private String targetVersion;

		private Long upgradeStartTime;

		private Long upgradeEndTime;

		private Integer taskExecutionCounts;

		private String taskErrorReason;

		private Long createTime;

		private Long updateTime;

		private String isDel;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getBatchStrategyNo() {
			return this.batchStrategyNo;
		}

		public void setBatchStrategyNo(String batchStrategyNo) {
			this.batchStrategyNo = batchStrategyNo;
		}

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getDbfsId() {
			return this.dbfsId;
		}

		public void setDbfsId(String dbfsId) {
			this.dbfsId = dbfsId;
		}

		public String getEcsId() {
			return this.ecsId;
		}

		public void setEcsId(String ecsId) {
			this.ecsId = ecsId;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCurrentVersion() {
			return this.currentVersion;
		}

		public void setCurrentVersion(String currentVersion) {
			this.currentVersion = currentVersion;
		}

		public String getTargetVersion() {
			return this.targetVersion;
		}

		public void setTargetVersion(String targetVersion) {
			this.targetVersion = targetVersion;
		}

		public Long getUpgradeStartTime() {
			return this.upgradeStartTime;
		}

		public void setUpgradeStartTime(Long upgradeStartTime) {
			this.upgradeStartTime = upgradeStartTime;
		}

		public Long getUpgradeEndTime() {
			return this.upgradeEndTime;
		}

		public void setUpgradeEndTime(Long upgradeEndTime) {
			this.upgradeEndTime = upgradeEndTime;
		}

		public Integer getTaskExecutionCounts() {
			return this.taskExecutionCounts;
		}

		public void setTaskExecutionCounts(Integer taskExecutionCounts) {
			this.taskExecutionCounts = taskExecutionCounts;
		}

		public String getTaskErrorReason() {
			return this.taskErrorReason;
		}

		public void setTaskErrorReason(String taskErrorReason) {
			this.taskErrorReason = taskErrorReason;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getIsDel() {
			return this.isDel;
		}

		public void setIsDel(String isDel) {
			this.isDel = isDel;
		}
	}

	@Override
	public DbfsRecordResponse getInstance(UnmarshallerContext context) {
		return	DbfsRecordResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
