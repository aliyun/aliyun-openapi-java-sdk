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
import com.aliyuncs.iotcc.transform.v20210513.ListConnectionPoolAllIpsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListConnectionPoolAllIpsResponse extends AcsResponse {

	private String requestId;

	private Integer totalIpsCount;

	private String nextToken;

	private Integer maxResults;

	private List<ConnectionPoolIp> connectionPoolIps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalIpsCount() {
		return this.totalIpsCount;
	}

	public void setTotalIpsCount(Integer totalIpsCount) {
		this.totalIpsCount = totalIpsCount;
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

	public List<ConnectionPoolIp> getConnectionPoolIps() {
		return this.connectionPoolIps;
	}

	public void setConnectionPoolIps(List<ConnectionPoolIp> connectionPoolIps) {
		this.connectionPoolIps = connectionPoolIps;
	}

	public static class ConnectionPoolIp {

		private String connectionPoolId;

		private String ip;

		private String status;

		private String type;

		private Long ipNum;

		public String getConnectionPoolId() {
			return this.connectionPoolId;
		}

		public void setConnectionPoolId(String connectionPoolId) {
			this.connectionPoolId = connectionPoolId;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getIpNum() {
			return this.ipNum;
		}

		public void setIpNum(Long ipNum) {
			this.ipNum = ipNum;
		}
	}

	@Override
	public ListConnectionPoolAllIpsResponse getInstance(UnmarshallerContext context) {
		return	ListConnectionPoolAllIpsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
