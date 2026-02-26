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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.ListBindDataSourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBindDataSourcesResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String accountName;

		private String dataSourceInstanceId;

		private String dataSourceType;

		private String dataSourceName;

		private String dataSourceRemark;

		private Integer logCount;

		private Integer taskCount;

		private String accountId;

		private String cloudCode;

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getDataSourceInstanceId() {
			return this.dataSourceInstanceId;
		}

		public void setDataSourceInstanceId(String dataSourceInstanceId) {
			this.dataSourceInstanceId = dataSourceInstanceId;
		}

		public String getDataSourceType() {
			return this.dataSourceType;
		}

		public void setDataSourceType(String dataSourceType) {
			this.dataSourceType = dataSourceType;
		}

		public String getDataSourceName() {
			return this.dataSourceName;
		}

		public void setDataSourceName(String dataSourceName) {
			this.dataSourceName = dataSourceName;
		}

		public String getDataSourceRemark() {
			return this.dataSourceRemark;
		}

		public void setDataSourceRemark(String dataSourceRemark) {
			this.dataSourceRemark = dataSourceRemark;
		}

		public Integer getLogCount() {
			return this.logCount;
		}

		public void setLogCount(Integer logCount) {
			this.logCount = logCount;
		}

		public Integer getTaskCount() {
			return this.taskCount;
		}

		public void setTaskCount(Integer taskCount) {
			this.taskCount = taskCount;
		}

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getCloudCode() {
			return this.cloudCode;
		}

		public void setCloudCode(String cloudCode) {
			this.cloudCode = cloudCode;
		}
	}

	@Override
	public ListBindDataSourcesResponse getInstance(UnmarshallerContext context) {
		return	ListBindDataSourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
