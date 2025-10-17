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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeColdStorageInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeColdStorageInstanceResponse extends AcsResponse {

	private Integer pageRecordCount;

	private String requestId;

	private String nextToken;

	private String downLoadUrl;

	private String ossClusterEnabled;

	private String supportOssCluster;

	private String objectType;

	private Integer maxResults;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalRecord;

	private List<TablesItem> tables;

	private List<OssClusterInfoListItem> ossClusterInfoList;

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getDownLoadUrl() {
		return this.downLoadUrl;
	}

	public void setDownLoadUrl(String downLoadUrl) {
		this.downLoadUrl = downLoadUrl;
	}

	public String getOssClusterEnabled() {
		return this.ossClusterEnabled;
	}

	public void setOssClusterEnabled(String ossClusterEnabled) {
		this.ossClusterEnabled = ossClusterEnabled;
	}

	public String getSupportOssCluster() {
		return this.supportOssCluster;
	}

	public void setSupportOssCluster(String supportOssCluster) {
		this.supportOssCluster = supportOssCluster;
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
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

	public Integer getTotalRecord() {
		return this.totalRecord;
	}

	public void setTotalRecord(Integer totalRecord) {
		this.totalRecord = totalRecord;
	}

	public List<TablesItem> getTables() {
		return this.tables;
	}

	public void setTables(List<TablesItem> tables) {
		this.tables = tables;
	}

	public List<OssClusterInfoListItem> getOssClusterInfoList() {
		return this.ossClusterInfoList;
	}

	public void setOssClusterInfoList(List<OssClusterInfoListItem> ossClusterInfoList) {
		this.ossClusterInfoList = ossClusterInfoList;
	}

	public static class TablesItem {

		private String ossClusterId;

		private String partion;

		private String size;

		private String dB;

		private String table;

		private String tableName;

		private String dBName;

		private String status;

		private String fieldName;

		private List<ChildObjectsItem> childObjects;

		public String getOssClusterId() {
			return this.ossClusterId;
		}

		public void setOssClusterId(String ossClusterId) {
			this.ossClusterId = ossClusterId;
		}

		public String getPartion() {
			return this.partion;
		}

		public void setPartion(String partion) {
			this.partion = partion;
		}

		public String getSize() {
			return this.size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public String getDB() {
			return this.dB;
		}

		public void setDB(String dB) {
			this.dB = dB;
		}

		public String getTable() {
			return this.table;
		}

		public void setTable(String table) {
			this.table = table;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getFieldName() {
			return this.fieldName;
		}

		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}

		public List<ChildObjectsItem> getChildObjects() {
			return this.childObjects;
		}

		public void setChildObjects(List<ChildObjectsItem> childObjects) {
			this.childObjects = childObjects;
		}

		public static class ChildObjectsItem {

			private String objectName;

			private String objectType;

			private String size;

			private String status;

			public String getObjectName() {
				return this.objectName;
			}

			public void setObjectName(String objectName) {
				this.objectName = objectName;
			}

			public String getObjectType() {
				return this.objectType;
			}

			public void setObjectType(String objectType) {
				this.objectType = objectType;
			}

			public String getSize() {
				return this.size;
			}

			public void setSize(String size) {
				this.size = size;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	public static class OssClusterInfoListItem {

		private String ossClusterId;

		private String region;

		private String size;

		private String createdTime;

		public String getOssClusterId() {
			return this.ossClusterId;
		}

		public void setOssClusterId(String ossClusterId) {
			this.ossClusterId = ossClusterId;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getSize() {
			return this.size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}
	}

	@Override
	public DescribeColdStorageInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeColdStorageInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
