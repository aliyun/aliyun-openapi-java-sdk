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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeLogHubAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogHubAttributeResponse extends AcsResponse {

	private String requestId;

	private LoghubInfo loghubInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public LoghubInfo getLoghubInfo() {
		return this.loghubInfo;
	}

	public void setLoghubInfo(LoghubInfo loghubInfo) {
		this.loghubInfo = loghubInfo;
	}

	public static class LoghubInfo {

		private Long delay;

		private String tableName;

		private String projectName;

		private String dBType;

		private String schemaName;

		private String syncStatus;

		private String message;

		private String deliverName;

		private String regionId;

		private String dBClusterId;

		private String description;

		private Boolean filterDirtyData;

		private String logStoreName;

		private String zoneId;

		private String userName;

		private String deliverTime;

		private List<LogHubStore> logHubStores;

		public Long getDelay() {
			return this.delay;
		}

		public void setDelay(Long delay) {
			this.delay = delay;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getDBType() {
			return this.dBType;
		}

		public void setDBType(String dBType) {
			this.dBType = dBType;
		}

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}

		public String getSyncStatus() {
			return this.syncStatus;
		}

		public void setSyncStatus(String syncStatus) {
			this.syncStatus = syncStatus;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getDeliverName() {
			return this.deliverName;
		}

		public void setDeliverName(String deliverName) {
			this.deliverName = deliverName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getFilterDirtyData() {
			return this.filterDirtyData;
		}

		public void setFilterDirtyData(Boolean filterDirtyData) {
			this.filterDirtyData = filterDirtyData;
		}

		public String getLogStoreName() {
			return this.logStoreName;
		}

		public void setLogStoreName(String logStoreName) {
			this.logStoreName = logStoreName;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getDeliverTime() {
			return this.deliverTime;
		}

		public void setDeliverTime(String deliverTime) {
			this.deliverTime = deliverTime;
		}

		public List<LogHubStore> getLogHubStores() {
			return this.logHubStores;
		}

		public void setLogHubStores(List<LogHubStore> logHubStores) {
			this.logHubStores = logHubStores;
		}

		public static class LogHubStore {

			private String logKey;

			private String fieldKey;

			public String getLogKey() {
				return this.logKey;
			}

			public void setLogKey(String logKey) {
				this.logKey = logKey;
			}

			public String getFieldKey() {
				return this.fieldKey;
			}

			public void setFieldKey(String fieldKey) {
				this.fieldKey = fieldKey;
			}
		}
	}

	@Override
	public DescribeLogHubAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogHubAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
