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
import com.aliyuncs.adb.transform.v20190315.DescribeLoghubDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoghubDetailResponse extends AcsResponse {

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

		private String projectName;

		private String logStoreName;

		private String deliverName;

		private String deliverTime;

		private String domainUrl;

		private String description;

		private String schemaName;

		private String tableName;

		private String regionId;

		private String zoneId;

		private String userName;

		private String password;

		private Boolean filterDirtyData;

		private String accessKey;

		private String accessSecret;

		private String dBType;

		private String dBClusterId;

		private List<LogHubStore> logHubStores;

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getLogStoreName() {
			return this.logStoreName;
		}

		public void setLogStoreName(String logStoreName) {
			this.logStoreName = logStoreName;
		}

		public String getDeliverName() {
			return this.deliverName;
		}

		public void setDeliverName(String deliverName) {
			this.deliverName = deliverName;
		}

		public String getDeliverTime() {
			return this.deliverTime;
		}

		public void setDeliverTime(String deliverTime) {
			this.deliverTime = deliverTime;
		}

		public String getDomainUrl() {
			return this.domainUrl;
		}

		public void setDomainUrl(String domainUrl) {
			this.domainUrl = domainUrl;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSchemaName() {
			return this.schemaName;
		}

		public void setSchemaName(String schemaName) {
			this.schemaName = schemaName;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
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

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Boolean getFilterDirtyData() {
			return this.filterDirtyData;
		}

		public void setFilterDirtyData(Boolean filterDirtyData) {
			this.filterDirtyData = filterDirtyData;
		}

		public String getAccessKey() {
			return this.accessKey;
		}

		public void setAccessKey(String accessKey) {
			this.accessKey = accessKey;
		}

		public String getAccessSecret() {
			return this.accessSecret;
		}

		public void setAccessSecret(String accessSecret) {
			this.accessSecret = accessSecret;
		}

		public String getDBType() {
			return this.dBType;
		}

		public void setDBType(String dBType) {
			this.dBType = dBType;
		}

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
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

			private String type;

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

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}
	}

	@Override
	public DescribeLoghubDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoghubDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
