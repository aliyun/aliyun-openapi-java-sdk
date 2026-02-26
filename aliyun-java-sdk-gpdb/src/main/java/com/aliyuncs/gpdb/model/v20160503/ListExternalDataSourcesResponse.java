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
import com.aliyuncs.gpdb.transform.v20160503.ListExternalDataSourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListExternalDataSourcesResponse extends AcsResponse {

	private String requestId;

	private Integer totalRecordCount;

	private Integer pageNumber;

	private List<ItemsItem> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private Integer dataSourceId;

		private String dataSourceName;

		private String dataSourceType;

		private String dataSourceDescription;

		private String createTime;

		private String modifyTime;

		private String dataSourceStatus;

		private String statusMessage;

		private String dataSourceDir;

		private Integer externalDataServiceId;

		public Integer getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(Integer dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public String getDataSourceName() {
			return this.dataSourceName;
		}

		public void setDataSourceName(String dataSourceName) {
			this.dataSourceName = dataSourceName;
		}

		public String getDataSourceType() {
			return this.dataSourceType;
		}

		public void setDataSourceType(String dataSourceType) {
			this.dataSourceType = dataSourceType;
		}

		public String getDataSourceDescription() {
			return this.dataSourceDescription;
		}

		public void setDataSourceDescription(String dataSourceDescription) {
			this.dataSourceDescription = dataSourceDescription;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getDataSourceStatus() {
			return this.dataSourceStatus;
		}

		public void setDataSourceStatus(String dataSourceStatus) {
			this.dataSourceStatus = dataSourceStatus;
		}

		public String getStatusMessage() {
			return this.statusMessage;
		}

		public void setStatusMessage(String statusMessage) {
			this.statusMessage = statusMessage;
		}

		public String getDataSourceDir() {
			return this.dataSourceDir;
		}

		public void setDataSourceDir(String dataSourceDir) {
			this.dataSourceDir = dataSourceDir;
		}

		public Integer getExternalDataServiceId() {
			return this.externalDataServiceId;
		}

		public void setExternalDataServiceId(Integer externalDataServiceId) {
			this.externalDataServiceId = externalDataServiceId;
		}
	}

	@Override
	public ListExternalDataSourcesResponse getInstance(UnmarshallerContext context) {
		return	ListExternalDataSourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
