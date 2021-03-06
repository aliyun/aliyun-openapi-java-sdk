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

package com.aliyuncs.datalake.model.v20200710;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.datalake.transform.v20200710.GetMetaDataStorageUsagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMetaDataStorageUsagesResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private Boolean success;

	private List<MetaDataStorageUsage> metaDataStorageUsages;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<MetaDataStorageUsage> getMetaDataStorageUsages() {
		return this.metaDataStorageUsages;
	}

	public void setMetaDataStorageUsages(List<MetaDataStorageUsage> metaDataStorageUsages) {
		this.metaDataStorageUsages = metaDataStorageUsages;
	}

	public static class MetaDataStorageUsage {

		private String queryTime;

		private String month;

		private Long storageUsage;

		private Long catalog;

		private Long database;

		private Long table;

		private Long partition;

		private Long function;

		public String getQueryTime() {
			return this.queryTime;
		}

		public void setQueryTime(String queryTime) {
			this.queryTime = queryTime;
		}

		public String getMonth() {
			return this.month;
		}

		public void setMonth(String month) {
			this.month = month;
		}

		public Long getStorageUsage() {
			return this.storageUsage;
		}

		public void setStorageUsage(Long storageUsage) {
			this.storageUsage = storageUsage;
		}

		public Long getCatalog() {
			return this.catalog;
		}

		public void setCatalog(Long catalog) {
			this.catalog = catalog;
		}

		public Long getDatabase() {
			return this.database;
		}

		public void setDatabase(Long database) {
			this.database = database;
		}

		public Long getTable() {
			return this.table;
		}

		public void setTable(Long table) {
			this.table = table;
		}

		public Long getPartition() {
			return this.partition;
		}

		public void setPartition(Long partition) {
			this.partition = partition;
		}

		public Long getFunction() {
			return this.function;
		}

		public void setFunction(Long function) {
			this.function = function;
		}
	}

	@Override
	public GetMetaDataStorageUsagesResponse getInstance(UnmarshallerContext context) {
		return	GetMetaDataStorageUsagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
