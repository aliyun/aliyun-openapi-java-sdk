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

package com.aliyuncs.iotcc.model.v20210513;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iotcc.transform.v20210513.ListConnectionPoolsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListConnectionPoolsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private Integer maxResults;

	private List<ConnectionPoolModels> connectionPools;

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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<ConnectionPoolModels> getConnectionPools() {
		return this.connectionPools;
	}

	public void setConnectionPools(List<ConnectionPoolModels> connectionPools) {
		this.connectionPools = connectionPools;
	}

	public static class ConnectionPoolModels {

		private String connectionPoolId;

		private String connectionPoolStatus;

		private String connectionPoolName;

		private String connectionPoolDescription;

		private List<String> cidrs;

		public String getConnectionPoolId() {
			return this.connectionPoolId;
		}

		public void setConnectionPoolId(String connectionPoolId) {
			this.connectionPoolId = connectionPoolId;
		}

		public String getConnectionPoolStatus() {
			return this.connectionPoolStatus;
		}

		public void setConnectionPoolStatus(String connectionPoolStatus) {
			this.connectionPoolStatus = connectionPoolStatus;
		}

		public String getConnectionPoolName() {
			return this.connectionPoolName;
		}

		public void setConnectionPoolName(String connectionPoolName) {
			this.connectionPoolName = connectionPoolName;
		}

		public String getConnectionPoolDescription() {
			return this.connectionPoolDescription;
		}

		public void setConnectionPoolDescription(String connectionPoolDescription) {
			this.connectionPoolDescription = connectionPoolDescription;
		}

		public List<String> getCidrs() {
			return this.cidrs;
		}

		public void setCidrs(List<String> cidrs) {
			this.cidrs = cidrs;
		}
	}

	@Override
	public ListConnectionPoolsResponse getInstance(UnmarshallerContext context) {
		return	ListConnectionPoolsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
