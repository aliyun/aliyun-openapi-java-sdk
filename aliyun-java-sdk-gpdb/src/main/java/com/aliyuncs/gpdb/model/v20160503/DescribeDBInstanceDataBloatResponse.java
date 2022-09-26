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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeDBInstanceDataBloatResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceDataBloatResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private List<ItemsItem> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private Integer sequence;

		private String databaseName;

		private String schemaName;

		private String tableName;

		private String storageType;

		private String expectTableSize;

		private String realTableSize;

		private String bloatSize;

		private String bloatCeoff;

		private String suggestedAction;

		private String timeLastVacuumed;

		private String timeLastUpdated;

		public Integer getSequence() {
			return this.sequence;
		}

		public void setSequence(Integer sequence) {
			this.sequence = sequence;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
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

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getExpectTableSize() {
			return this.expectTableSize;
		}

		public void setExpectTableSize(String expectTableSize) {
			this.expectTableSize = expectTableSize;
		}

		public String getRealTableSize() {
			return this.realTableSize;
		}

		public void setRealTableSize(String realTableSize) {
			this.realTableSize = realTableSize;
		}

		public String getBloatSize() {
			return this.bloatSize;
		}

		public void setBloatSize(String bloatSize) {
			this.bloatSize = bloatSize;
		}

		public String getBloatCeoff() {
			return this.bloatCeoff;
		}

		public void setBloatCeoff(String bloatCeoff) {
			this.bloatCeoff = bloatCeoff;
		}

		public String getSuggestedAction() {
			return this.suggestedAction;
		}

		public void setSuggestedAction(String suggestedAction) {
			this.suggestedAction = suggestedAction;
		}

		public String getTimeLastVacuumed() {
			return this.timeLastVacuumed;
		}

		public void setTimeLastVacuumed(String timeLastVacuumed) {
			this.timeLastVacuumed = timeLastVacuumed;
		}

		public String getTimeLastUpdated() {
			return this.timeLastUpdated;
		}

		public void setTimeLastUpdated(String timeLastUpdated) {
			this.timeLastUpdated = timeLastUpdated;
		}
	}

	@Override
	public DescribeDBInstanceDataBloatResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceDataBloatResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
