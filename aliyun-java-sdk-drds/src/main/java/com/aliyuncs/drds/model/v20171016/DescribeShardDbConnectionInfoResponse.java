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

package com.aliyuncs.drds.model.v20171016;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20171016.DescribeShardDbConnectionInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeShardDbConnectionInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private ConnectionInfo connectionInfo;

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

	public ConnectionInfo getConnectionInfo() {
		return this.connectionInfo;
	}

	public void setConnectionInfo(ConnectionInfo connectionInfo) {
		this.connectionInfo = connectionInfo;
	}

	public static class ConnectionInfo {

		private String instanceName;

		private String instanceUrl;

		private String subDbName;

		private String dbStatus;

		private String dbType;

		private Integer minPoolSize;

		private Integer maxPoolSize;

		private Integer idleTimeOut;

		private Integer blockingTimeout;

		private String connectionProperties;

		private Integer preparedStatementCacheSize;

		private String userName;

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceUrl() {
			return this.instanceUrl;
		}

		public void setInstanceUrl(String instanceUrl) {
			this.instanceUrl = instanceUrl;
		}

		public String getSubDbName() {
			return this.subDbName;
		}

		public void setSubDbName(String subDbName) {
			this.subDbName = subDbName;
		}

		public String getDbStatus() {
			return this.dbStatus;
		}

		public void setDbStatus(String dbStatus) {
			this.dbStatus = dbStatus;
		}

		public String getDbType() {
			return this.dbType;
		}

		public void setDbType(String dbType) {
			this.dbType = dbType;
		}

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

		public Integer getIdleTimeOut() {
			return this.idleTimeOut;
		}

		public void setIdleTimeOut(Integer idleTimeOut) {
			this.idleTimeOut = idleTimeOut;
		}

		public Integer getBlockingTimeout() {
			return this.blockingTimeout;
		}

		public void setBlockingTimeout(Integer blockingTimeout) {
			this.blockingTimeout = blockingTimeout;
		}

		public String getConnectionProperties() {
			return this.connectionProperties;
		}

		public void setConnectionProperties(String connectionProperties) {
			this.connectionProperties = connectionProperties;
		}

		public Integer getPreparedStatementCacheSize() {
			return this.preparedStatementCacheSize;
		}

		public void setPreparedStatementCacheSize(Integer preparedStatementCacheSize) {
			this.preparedStatementCacheSize = preparedStatementCacheSize;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}
	}

	@Override
	public DescribeShardDbConnectionInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeShardDbConnectionInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
