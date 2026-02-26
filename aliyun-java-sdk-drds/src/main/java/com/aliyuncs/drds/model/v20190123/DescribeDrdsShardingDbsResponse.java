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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeDrdsShardingDbsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDrdsShardingDbsResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private String pageNumber;

	private String pageSize;

	private String total;

	private List<ShardingDb> shardingDbs;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public List<ShardingDb> getShardingDbs() {
		return this.shardingDbs;
	}

	public void setShardingDbs(List<ShardingDb> shardingDbs) {
		this.shardingDbs = shardingDbs;
	}

	public static class ShardingDb {

		private Integer minPoolSize;

		private Integer maxPoolSize;

		private String dbInstanceId;

		private String connectUrl;

		private String groupName;

		private String dbType;

		private Integer idleTimeOut;

		private String shardingDbName;

		private Integer blockingTimeout;

		private Integer preparedStatementCacheSize;

		private String connectionProperties;

		private String userName;

		private String dbStatus;

		public Integer getMinPoolSize() {
			return this.minPoolSize;
		}

		public void setMinPoolSize(Integer minPoolSize) {
			this.minPoolSize = minPoolSize;
		}

		public Integer getMaxPoolSize() {
			return this.maxPoolSize;
		}

		public void setMaxPoolSize(Integer maxPoolSize) {
			this.maxPoolSize = maxPoolSize;
		}

		public String getDbInstanceId() {
			return this.dbInstanceId;
		}

		public void setDbInstanceId(String dbInstanceId) {
			this.dbInstanceId = dbInstanceId;
		}

		public String getConnectUrl() {
			return this.connectUrl;
		}

		public void setConnectUrl(String connectUrl) {
			this.connectUrl = connectUrl;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
		}

		public Integer getIdleTimeOut() {
			return this.idleTimeOut;
		}

		public void setIdleTimeOut(Integer idleTimeOut) {
			this.idleTimeOut = idleTimeOut;
		}

		public String getShardingDbName() {
			return this.shardingDbName;
		}

		public void setShardingDbName(String shardingDbName) {
			this.shardingDbName = shardingDbName;
		}

		public Integer getBlockingTimeout() {
			return this.blockingTimeout;
		}

		public void setBlockingTimeout(Integer blockingTimeout) {
			this.blockingTimeout = blockingTimeout;
		}

		public Integer getPreparedStatementCacheSize() {
			return this.preparedStatementCacheSize;
		}

		public void setPreparedStatementCacheSize(Integer preparedStatementCacheSize) {
			this.preparedStatementCacheSize = preparedStatementCacheSize;
		}

		public String getConnectionProperties() {
			return this.connectionProperties;
		}

		public void setConnectionProperties(String connectionProperties) {
			this.connectionProperties = connectionProperties;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getDbStatus() {
			return this.dbStatus;
		}

		public void setDbStatus(String dbStatus) {
			this.dbStatus = dbStatus;
		}
	}

	@Override
	public DescribeDrdsShardingDbsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDrdsShardingDbsResponseUnmarshaller.unmarshall(this, context);
	}
}
