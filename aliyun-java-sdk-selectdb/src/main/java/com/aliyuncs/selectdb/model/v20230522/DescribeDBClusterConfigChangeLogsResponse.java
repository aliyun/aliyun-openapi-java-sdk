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

package com.aliyuncs.selectdb.model.v20230522;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.selectdb.transform.v20230522.DescribeDBClusterConfigChangeLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterConfigChangeLogsResponse extends AcsResponse {

	private String dynamicCode;

	private String dynamicMessage;

	private String accessDeniedDetail;

	private String requestId;

	private Data data;

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String dbInstanceName;

		private String dbInstanceId;

		private String dbClusterId;

		private Integer taskId;

		private List<ParamChangeLog> paramChangeLogs;

		public String getDbInstanceName() {
			return this.dbInstanceName;
		}

		public void setDbInstanceName(String dbInstanceName) {
			this.dbInstanceName = dbInstanceName;
		}

		public String getDbInstanceId() {
			return this.dbInstanceId;
		}

		public void setDbInstanceId(String dbInstanceId) {
			this.dbInstanceId = dbInstanceId;
		}

		public String getDbClusterId() {
			return this.dbClusterId;
		}

		public void setDbClusterId(String dbClusterId) {
			this.dbClusterId = dbClusterId;
		}

		public Integer getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Integer taskId) {
			this.taskId = taskId;
		}

		public List<ParamChangeLog> getParamChangeLogs() {
			return this.paramChangeLogs;
		}

		public void setParamChangeLogs(List<ParamChangeLog> paramChangeLogs) {
			this.paramChangeLogs = paramChangeLogs;
		}

		public static class ParamChangeLog {

			private Long id;

			private String name;

			private String oldValue;

			private String newValue;

			private Boolean isApplied;

			private String gmtCreated;

			private String gmtModified;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getOldValue() {
				return this.oldValue;
			}

			public void setOldValue(String oldValue) {
				this.oldValue = oldValue;
			}

			public String getNewValue() {
				return this.newValue;
			}

			public void setNewValue(String newValue) {
				this.newValue = newValue;
			}

			public Boolean getIsApplied() {
				return this.isApplied;
			}

			public void setIsApplied(Boolean isApplied) {
				this.isApplied = isApplied;
			}

			public String getGmtCreated() {
				return this.gmtCreated;
			}

			public void setGmtCreated(String gmtCreated) {
				this.gmtCreated = gmtCreated;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}
		}
	}

	@Override
	public DescribeDBClusterConfigChangeLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterConfigChangeLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
