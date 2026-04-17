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

package com.aliyuncs.hitsdb.model.v20200615;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20200615.GetLindormFsUsedDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLindormFsUsedDetailResponse extends AcsResponse {

	private String requestId;

	private String valid;

	private String fsCapacity;

	private String fsCapacityHot;

	private String fsCapacityCold;

	private String fsUsedHot;

	private String fsUsedCold;

	private String fsUsedOnLindormTable;

	private String fsUsedOnLindormTableData;

	private String fsUsedOnLindormTableWAL;

	private String fsUsedOnLindormSearch;

	private String fsUsedOnLindormTSDB;

	private String fsUsedHotOnLindormTable;

	private String fsUsedColdOnLindormTable;

	private String fsUsedHotOnLindormSearch;

	private String fsUsedColdOnLindormSearch;

	private String fsUsedHotOnLindormTSDB;

	private String fsUsedColdOnLindormTSDB;

	private String accessDeniedDetail;

	private List<LStorageUsageInfo> lStorageUsageList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getValid() {
		return this.valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public String getFsCapacity() {
		return this.fsCapacity;
	}

	public void setFsCapacity(String fsCapacity) {
		this.fsCapacity = fsCapacity;
	}

	public String getFsCapacityHot() {
		return this.fsCapacityHot;
	}

	public void setFsCapacityHot(String fsCapacityHot) {
		this.fsCapacityHot = fsCapacityHot;
	}

	public String getFsCapacityCold() {
		return this.fsCapacityCold;
	}

	public void setFsCapacityCold(String fsCapacityCold) {
		this.fsCapacityCold = fsCapacityCold;
	}

	public String getFsUsedHot() {
		return this.fsUsedHot;
	}

	public void setFsUsedHot(String fsUsedHot) {
		this.fsUsedHot = fsUsedHot;
	}

	public String getFsUsedCold() {
		return this.fsUsedCold;
	}

	public void setFsUsedCold(String fsUsedCold) {
		this.fsUsedCold = fsUsedCold;
	}

	public String getFsUsedOnLindormTable() {
		return this.fsUsedOnLindormTable;
	}

	public void setFsUsedOnLindormTable(String fsUsedOnLindormTable) {
		this.fsUsedOnLindormTable = fsUsedOnLindormTable;
	}

	public String getFsUsedOnLindormTableData() {
		return this.fsUsedOnLindormTableData;
	}

	public void setFsUsedOnLindormTableData(String fsUsedOnLindormTableData) {
		this.fsUsedOnLindormTableData = fsUsedOnLindormTableData;
	}

	public String getFsUsedOnLindormTableWAL() {
		return this.fsUsedOnLindormTableWAL;
	}

	public void setFsUsedOnLindormTableWAL(String fsUsedOnLindormTableWAL) {
		this.fsUsedOnLindormTableWAL = fsUsedOnLindormTableWAL;
	}

	public String getFsUsedOnLindormSearch() {
		return this.fsUsedOnLindormSearch;
	}

	public void setFsUsedOnLindormSearch(String fsUsedOnLindormSearch) {
		this.fsUsedOnLindormSearch = fsUsedOnLindormSearch;
	}

	public String getFsUsedOnLindormTSDB() {
		return this.fsUsedOnLindormTSDB;
	}

	public void setFsUsedOnLindormTSDB(String fsUsedOnLindormTSDB) {
		this.fsUsedOnLindormTSDB = fsUsedOnLindormTSDB;
	}

	public String getFsUsedHotOnLindormTable() {
		return this.fsUsedHotOnLindormTable;
	}

	public void setFsUsedHotOnLindormTable(String fsUsedHotOnLindormTable) {
		this.fsUsedHotOnLindormTable = fsUsedHotOnLindormTable;
	}

	public String getFsUsedColdOnLindormTable() {
		return this.fsUsedColdOnLindormTable;
	}

	public void setFsUsedColdOnLindormTable(String fsUsedColdOnLindormTable) {
		this.fsUsedColdOnLindormTable = fsUsedColdOnLindormTable;
	}

	public String getFsUsedHotOnLindormSearch() {
		return this.fsUsedHotOnLindormSearch;
	}

	public void setFsUsedHotOnLindormSearch(String fsUsedHotOnLindormSearch) {
		this.fsUsedHotOnLindormSearch = fsUsedHotOnLindormSearch;
	}

	public String getFsUsedColdOnLindormSearch() {
		return this.fsUsedColdOnLindormSearch;
	}

	public void setFsUsedColdOnLindormSearch(String fsUsedColdOnLindormSearch) {
		this.fsUsedColdOnLindormSearch = fsUsedColdOnLindormSearch;
	}

	public String getFsUsedHotOnLindormTSDB() {
		return this.fsUsedHotOnLindormTSDB;
	}

	public void setFsUsedHotOnLindormTSDB(String fsUsedHotOnLindormTSDB) {
		this.fsUsedHotOnLindormTSDB = fsUsedHotOnLindormTSDB;
	}

	public String getFsUsedColdOnLindormTSDB() {
		return this.fsUsedColdOnLindormTSDB;
	}

	public void setFsUsedColdOnLindormTSDB(String fsUsedColdOnLindormTSDB) {
		this.fsUsedColdOnLindormTSDB = fsUsedColdOnLindormTSDB;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public List<LStorageUsageInfo> getLStorageUsageList() {
		return this.lStorageUsageList;
	}

	public void setLStorageUsageList(List<LStorageUsageInfo> lStorageUsageList) {
		this.lStorageUsageList = lStorageUsageList;
	}

	public static class LStorageUsageInfo {

		private String diskType;

		private String capacity;

		private String used;

		private String usedLindormTable;

		private String usedLindormTsdb;

		private String usedLindormSearch;

		private String usedLindormSpark;

		private String usedOther;

		private String usedLindormMessage3;

		private String usedLindormColumn3;

		private String usedLindormVector3;

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getCapacity() {
			return this.capacity;
		}

		public void setCapacity(String capacity) {
			this.capacity = capacity;
		}

		public String getUsed() {
			return this.used;
		}

		public void setUsed(String used) {
			this.used = used;
		}

		public String getUsedLindormTable() {
			return this.usedLindormTable;
		}

		public void setUsedLindormTable(String usedLindormTable) {
			this.usedLindormTable = usedLindormTable;
		}

		public String getUsedLindormTsdb() {
			return this.usedLindormTsdb;
		}

		public void setUsedLindormTsdb(String usedLindormTsdb) {
			this.usedLindormTsdb = usedLindormTsdb;
		}

		public String getUsedLindormSearch() {
			return this.usedLindormSearch;
		}

		public void setUsedLindormSearch(String usedLindormSearch) {
			this.usedLindormSearch = usedLindormSearch;
		}

		public String getUsedLindormSpark() {
			return this.usedLindormSpark;
		}

		public void setUsedLindormSpark(String usedLindormSpark) {
			this.usedLindormSpark = usedLindormSpark;
		}

		public String getUsedOther() {
			return this.usedOther;
		}

		public void setUsedOther(String usedOther) {
			this.usedOther = usedOther;
		}

		public String getUsedLindormMessage3() {
			return this.usedLindormMessage3;
		}

		public void setUsedLindormMessage3(String usedLindormMessage3) {
			this.usedLindormMessage3 = usedLindormMessage3;
		}

		public String getUsedLindormColumn3() {
			return this.usedLindormColumn3;
		}

		public void setUsedLindormColumn3(String usedLindormColumn3) {
			this.usedLindormColumn3 = usedLindormColumn3;
		}

		public String getUsedLindormVector3() {
			return this.usedLindormVector3;
		}

		public void setUsedLindormVector3(String usedLindormVector3) {
			this.usedLindormVector3 = usedLindormVector3;
		}
	}

	@Override
	public GetLindormFsUsedDetailResponse getInstance(UnmarshallerContext context) {
		return	GetLindormFsUsedDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
