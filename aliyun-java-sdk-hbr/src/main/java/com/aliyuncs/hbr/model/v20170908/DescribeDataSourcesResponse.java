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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribeDataSourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataSourcesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private List<DataSource> dataSources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<DataSource> getDataSources() {
		return this.dataSources;
	}

	public void setDataSources(List<DataSource> dataSources) {
		this.dataSources = dataSources;
	}

	public static class DataSource {

		private String indexLevel;

		private String schedule;

		private String dataSourceName;

		private String dataSourceId;

		private String options;

		private String speedLimit;

		private String planId;

		private Boolean indexUpdateTime;

		private String exclude;

		private Boolean indexing;

		private Long updatedTime;

		private String dataSourceType;

		private String connectionInfo;

		private Boolean indexAvailable;

		private Long createdTime;

		private String include;

		private String clusterId;

		private List<String> paths;

		public String getIndexLevel() {
			return this.indexLevel;
		}

		public void setIndexLevel(String indexLevel) {
			this.indexLevel = indexLevel;
		}

		public String getSchedule() {
			return this.schedule;
		}

		public void setSchedule(String schedule) {
			this.schedule = schedule;
		}

		public String getDataSourceName() {
			return this.dataSourceName;
		}

		public void setDataSourceName(String dataSourceName) {
			this.dataSourceName = dataSourceName;
		}

		public String getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(String dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public String getOptions() {
			return this.options;
		}

		public void setOptions(String options) {
			this.options = options;
		}

		public String getSpeedLimit() {
			return this.speedLimit;
		}

		public void setSpeedLimit(String speedLimit) {
			this.speedLimit = speedLimit;
		}

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public Boolean getIndexUpdateTime() {
			return this.indexUpdateTime;
		}

		public void setIndexUpdateTime(Boolean indexUpdateTime) {
			this.indexUpdateTime = indexUpdateTime;
		}

		public String getExclude() {
			return this.exclude;
		}

		public void setExclude(String exclude) {
			this.exclude = exclude;
		}

		public Boolean getIndexing() {
			return this.indexing;
		}

		public void setIndexing(Boolean indexing) {
			this.indexing = indexing;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public String getDataSourceType() {
			return this.dataSourceType;
		}

		public void setDataSourceType(String dataSourceType) {
			this.dataSourceType = dataSourceType;
		}

		public String getConnectionInfo() {
			return this.connectionInfo;
		}

		public void setConnectionInfo(String connectionInfo) {
			this.connectionInfo = connectionInfo;
		}

		public Boolean getIndexAvailable() {
			return this.indexAvailable;
		}

		public void setIndexAvailable(Boolean indexAvailable) {
			this.indexAvailable = indexAvailable;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public String getInclude() {
			return this.include;
		}

		public void setInclude(String include) {
			this.include = include;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public List<String> getPaths() {
			return this.paths;
		}

		public void setPaths(List<String> paths) {
			this.paths = paths;
		}
	}

	@Override
	public DescribeDataSourcesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataSourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
