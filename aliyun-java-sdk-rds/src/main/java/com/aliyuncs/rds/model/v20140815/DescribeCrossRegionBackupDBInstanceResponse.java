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
import com.aliyuncs.rds.transform.v20140815.DescribeCrossRegionBackupDBInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCrossRegionBackupDBInstanceResponse extends AcsResponse {

	private String requestId;

	private Integer totalRecords;

	private Integer itemsNumbers;

	private Integer pageSize;

	private Integer pageNumber;

	private String regionId;

	private List<Item> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalRecords() {
		return this.totalRecords;
	}

	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}

	public Integer getItemsNumbers() {
		return this.itemsNumbers;
	}

	public void setItemsNumbers(Integer itemsNumbers) {
		this.itemsNumbers = itemsNumbers;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static class Item {

		private String relServiceId;

		private String logBackupEnabledTime;

		private String dBInstanceStatusDesc;

		private String relService;

		private String backupEnabled;

		private String dBInstanceStatus;

		private String lockMode;

		private String engineVersion;

		private String logBackupEnabled;

		private Integer retentType;

		private Integer retention;

		private String crossBackupType;

		private String crossBackupRegion;

		private String dBInstanceId;

		private String engine;

		private String backupEnabledTime;

		private String dBInstanceDescription;

		public String getRelServiceId() {
			return this.relServiceId;
		}

		public void setRelServiceId(String relServiceId) {
			this.relServiceId = relServiceId;
		}

		public String getLogBackupEnabledTime() {
			return this.logBackupEnabledTime;
		}

		public void setLogBackupEnabledTime(String logBackupEnabledTime) {
			this.logBackupEnabledTime = logBackupEnabledTime;
		}

		public String getDBInstanceStatusDesc() {
			return this.dBInstanceStatusDesc;
		}

		public void setDBInstanceStatusDesc(String dBInstanceStatusDesc) {
			this.dBInstanceStatusDesc = dBInstanceStatusDesc;
		}

		public String getRelService() {
			return this.relService;
		}

		public void setRelService(String relService) {
			this.relService = relService;
		}

		public String getBackupEnabled() {
			return this.backupEnabled;
		}

		public void setBackupEnabled(String backupEnabled) {
			this.backupEnabled = backupEnabled;
		}

		public String getDBInstanceStatus() {
			return this.dBInstanceStatus;
		}

		public void setDBInstanceStatus(String dBInstanceStatus) {
			this.dBInstanceStatus = dBInstanceStatus;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getLogBackupEnabled() {
			return this.logBackupEnabled;
		}

		public void setLogBackupEnabled(String logBackupEnabled) {
			this.logBackupEnabled = logBackupEnabled;
		}

		public Integer getRetentType() {
			return this.retentType;
		}

		public void setRetentType(Integer retentType) {
			this.retentType = retentType;
		}

		public Integer getRetention() {
			return this.retention;
		}

		public void setRetention(Integer retention) {
			this.retention = retention;
		}

		public String getCrossBackupType() {
			return this.crossBackupType;
		}

		public void setCrossBackupType(String crossBackupType) {
			this.crossBackupType = crossBackupType;
		}

		public String getCrossBackupRegion() {
			return this.crossBackupRegion;
		}

		public void setCrossBackupRegion(String crossBackupRegion) {
			this.crossBackupRegion = crossBackupRegion;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getBackupEnabledTime() {
			return this.backupEnabledTime;
		}

		public void setBackupEnabledTime(String backupEnabledTime) {
			this.backupEnabledTime = backupEnabledTime;
		}

		public String getDBInstanceDescription() {
			return this.dBInstanceDescription;
		}

		public void setDBInstanceDescription(String dBInstanceDescription) {
			this.dBInstanceDescription = dBInstanceDescription;
		}
	}

	@Override
	public DescribeCrossRegionBackupDBInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeCrossRegionBackupDBInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
