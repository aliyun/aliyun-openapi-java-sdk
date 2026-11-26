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
import com.aliyuncs.gpdb.transform.v20160503.ListStreamingDataSourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListStreamingDataSourcesResponse extends AcsResponse {

	private Integer totalRecordCount;

	private String requestId;

	private Integer pageNumber;

	private List<DataSourceItemsItem> dataSourceItems;

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<DataSourceItemsItem> getDataSourceItems() {
		return this.dataSourceItems;
	}

	public void setDataSourceItems(List<DataSourceItemsItem> dataSourceItems) {
		this.dataSourceItems = dataSourceItems;
	}

	public static class DataSourceItemsItem {

		private String status;

		private String modifyTime;

		private String dataSourceName;

		private String dataSourceConfig;

		private String dataSourceType;

		private String createTime;

		private String dataSourceDescription;

		private String errorMessage;

		private Integer dataSourceId;

		private Integer serviceId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getDataSourceName() {
			return this.dataSourceName;
		}

		public void setDataSourceName(String dataSourceName) {
			this.dataSourceName = dataSourceName;
		}

		public String getDataSourceConfig() {
			return this.dataSourceConfig;
		}

		public void setDataSourceConfig(String dataSourceConfig) {
			this.dataSourceConfig = dataSourceConfig;
		}

		public String getDataSourceType() {
			return this.dataSourceType;
		}

		public void setDataSourceType(String dataSourceType) {
			this.dataSourceType = dataSourceType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDataSourceDescription() {
			return this.dataSourceDescription;
		}

		public void setDataSourceDescription(String dataSourceDescription) {
			this.dataSourceDescription = dataSourceDescription;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public Integer getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(Integer dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public Integer getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(Integer serviceId) {
			this.serviceId = serviceId;
		}
	}

	@Override
	public ListStreamingDataSourcesResponse getInstance(UnmarshallerContext context) {
		return	ListStreamingDataSourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
