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

	private Integer pageNumber;

	private Integer pageRecordCount;

	private String regionId;

	private String requestId;

	private String startTime;

	private Integer totalRecordCount;

	private List<Item> items;

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static class Item {

		private String backupEndTime;

		private String backupMethod;

		private Integer backupSetScale;

		private Integer backupSetStatus;

		private String backupStartTime;

		private String backupType;

		private String category;

		private String consistentTime;

		private String crossBackupDownloadLink;

		private Integer crossBackupId;

		private String crossBackupRegion;

		private String crossBackupSetFile;

		private String crossBackupSetLocation;

		private Long crossBackupSetSize;

		private String dBInstanceStorageType;

		private String engine;

		private String engineVersion;

		private String hasBackupTableMeta;

		private Integer instanceId;

		private List<String> restoreRegions;

		public String getBackupEndTime() {
			return this.backupEndTime;
		}

		public void setBackupEndTime(String backupEndTime) {
			this.backupEndTime = backupEndTime;
		}

		public String getBackupMethod() {
			return this.backupMethod;
		}

		public void setBackupMethod(String backupMethod) {
			this.backupMethod = backupMethod;
		}

		public Integer getBackupSetScale() {
			return this.backupSetScale;
		}

		public void setBackupSetScale(Integer backupSetScale) {
			this.backupSetScale = backupSetScale;
		}

		public Integer getBackupSetStatus() {
			return this.backupSetStatus;
		}

		public void setBackupSetStatus(Integer backupSetStatus) {
			this.backupSetStatus = backupSetStatus;
		}

		public String getBackupStartTime() {
			return this.backupStartTime;
		}

		public void setBackupStartTime(String backupStartTime) {
			this.backupStartTime = backupStartTime;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getConsistentTime() {
			return this.consistentTime;
		}

		public void setConsistentTime(String consistentTime) {
			this.consistentTime = consistentTime;
		}

		public String getCrossBackupDownloadLink() {
			return this.crossBackupDownloadLink;
		}

		public void setCrossBackupDownloadLink(String crossBackupDownloadLink) {
			this.crossBackupDownloadLink = crossBackupDownloadLink;
		}

		public Integer getCrossBackupId() {
			return this.crossBackupId;
		}

		public void setCrossBackupId(Integer crossBackupId) {
			this.crossBackupId = crossBackupId;
		}

		public String getCrossBackupRegion() {
			return this.crossBackupRegion;
		}

		public void setCrossBackupRegion(String crossBackupRegion) {
			this.crossBackupRegion = crossBackupRegion;
		}

		public String getCrossBackupSetFile() {
			return this.crossBackupSetFile;
		}

		public void setCrossBackupSetFile(String crossBackupSetFile) {
			this.crossBackupSetFile = crossBackupSetFile;
		}

		public String getCrossBackupSetLocation() {
			return this.crossBackupSetLocation;
		}

		public void setCrossBackupSetLocation(String crossBackupSetLocation) {
			this.crossBackupSetLocation = crossBackupSetLocation;
		}

		public Long getCrossBackupSetSize() {
			return this.crossBackupSetSize;
		}

		public void setCrossBackupSetSize(Long crossBackupSetSize) {
			this.crossBackupSetSize = crossBackupSetSize;
		}

		public String getDBInstanceStorageType() {
			return this.dBInstanceStorageType;
		}

		public void setDBInstanceStorageType(String dBInstanceStorageType) {
			this.dBInstanceStorageType = dBInstanceStorageType;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getHasBackupTableMeta() {
			return this.hasBackupTableMeta;
		}

		public void setHasBackupTableMeta(String hasBackupTableMeta) {
			this.hasBackupTableMeta = hasBackupTableMeta;
		}

		public Integer getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Integer instanceId) {
			this.instanceId = instanceId;
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
