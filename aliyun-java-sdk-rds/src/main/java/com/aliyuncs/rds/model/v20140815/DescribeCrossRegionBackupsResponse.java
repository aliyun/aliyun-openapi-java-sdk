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
import com.aliyuncs.rds.transform.v20140815.DescribeCrossRegionBackupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCrossRegionBackupsResponse extends AcsResponse {

	private String endTime;

	private String startTime;

	private String requestId;

	private Integer pageRecordCount;

	private Integer totalRecordCount;

	private Integer pageNumber;

	private String regionId;

	private List<Item> items;

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
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

		private String consistentTime;

		private String dBInstanceStorageType;

		private Integer crossBackupId;

		private String backupType;

		private String backupStartTime;

		private String crossBackupSetLocation;

		private Integer instanceId;

		private String crossBackupDownloadLink;

		private String backupEndTime;

		private String engineVersion;

		private Integer backupSetStatus;

		private String crossBackupSetFile;

		private Integer backupSetScale;

		private Long crossBackupSetSize;

		private String hasBackupTableMeta;

		private String crossBackupRegion;

		private String category;

		private String engine;

		private String backupMethod;

		private List<String> restoreRegions;

		public String getConsistentTime() {
			return this.consistentTime;
		}

		public void setConsistentTime(String consistentTime) {
			this.consistentTime = consistentTime;
		}

		public String getDBInstanceStorageType() {
			return this.dBInstanceStorageType;
		}

		public void setDBInstanceStorageType(String dBInstanceStorageType) {
			this.dBInstanceStorageType = dBInstanceStorageType;
		}

		public Integer getCrossBackupId() {
			return this.crossBackupId;
		}

		public void setCrossBackupId(Integer crossBackupId) {
			this.crossBackupId = crossBackupId;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public String getBackupStartTime() {
			return this.backupStartTime;
		}

		public void setBackupStartTime(String backupStartTime) {
			this.backupStartTime = backupStartTime;
		}

		public String getCrossBackupSetLocation() {
			return this.crossBackupSetLocation;
		}

		public void setCrossBackupSetLocation(String crossBackupSetLocation) {
			this.crossBackupSetLocation = crossBackupSetLocation;
		}

		public Integer getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Integer instanceId) {
			this.instanceId = instanceId;
		}

		public String getCrossBackupDownloadLink() {
			return this.crossBackupDownloadLink;
		}

		public void setCrossBackupDownloadLink(String crossBackupDownloadLink) {
			this.crossBackupDownloadLink = crossBackupDownloadLink;
		}

		public String getBackupEndTime() {
			return this.backupEndTime;
		}

		public void setBackupEndTime(String backupEndTime) {
			this.backupEndTime = backupEndTime;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public Integer getBackupSetStatus() {
			return this.backupSetStatus;
		}

		public void setBackupSetStatus(Integer backupSetStatus) {
			this.backupSetStatus = backupSetStatus;
		}

		public String getCrossBackupSetFile() {
			return this.crossBackupSetFile;
		}

		public void setCrossBackupSetFile(String crossBackupSetFile) {
			this.crossBackupSetFile = crossBackupSetFile;
		}

		public Integer getBackupSetScale() {
			return this.backupSetScale;
		}

		public void setBackupSetScale(Integer backupSetScale) {
			this.backupSetScale = backupSetScale;
		}

		public Long getCrossBackupSetSize() {
			return this.crossBackupSetSize;
		}

		public void setCrossBackupSetSize(Long crossBackupSetSize) {
			this.crossBackupSetSize = crossBackupSetSize;
		}

		public String getHasBackupTableMeta() {
			return this.hasBackupTableMeta;
		}

		public void setHasBackupTableMeta(String hasBackupTableMeta) {
			this.hasBackupTableMeta = hasBackupTableMeta;
		}

		public String getCrossBackupRegion() {
			return this.crossBackupRegion;
		}

		public void setCrossBackupRegion(String crossBackupRegion) {
			this.crossBackupRegion = crossBackupRegion;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getBackupMethod() {
			return this.backupMethod;
		}

		public void setBackupMethod(String backupMethod) {
			this.backupMethod = backupMethod;
		}

		public List<String> getRestoreRegions() {
			return this.restoreRegions;
		}

		public void setRestoreRegions(List<String> restoreRegions) {
			this.restoreRegions = restoreRegions;
		}
	}

	@Override
	public DescribeCrossRegionBackupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCrossRegionBackupsResponseUnmarshaller.unmarshall(this, context);
	}
}
