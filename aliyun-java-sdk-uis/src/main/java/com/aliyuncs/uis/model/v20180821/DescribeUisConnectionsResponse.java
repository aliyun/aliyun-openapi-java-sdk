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

package com.aliyuncs.uis.model.v20180821;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.uis.transform.v20180821.DescribeUisConnectionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUisConnectionsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<UisConnection> uisConnections;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<UisConnection> getUisConnections() {
		return this.uisConnections;
	}

	public void setUisConnections(List<UisConnection> uisConnections) {
		this.uisConnections = uisConnections;
	}

	public static class UisConnection {

		private String uisId;

		private String uisNodeId;

		private String uisConnectionId;

		private String description;

		private String name;

		private String state;

		private String uisProtocol;

		private String greConfig;

		private String sslConfig;

		public String getUisId() {
			return this.uisId;
		}

		public void setUisId(String uisId) {
			this.uisId = uisId;
		}

		public String getUisNodeId() {
			return this.uisNodeId;
		}

		public void setUisNodeId(String uisNodeId) {
			this.uisNodeId = uisNodeId;
		}

		public String getUisConnectionId() {
			return this.uisConnectionId;
		}

		public void setUisConnectionId(String uisConnectionId) {
			this.uisConnectionId = uisConnectionId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getUisProtocol() {
			return this.uisProtocol;
		}

		public void setUisProtocol(String uisProtocol) {
			this.uisProtocol = uisProtocol;
		}

		public String getGreConfig() {
			return this.greConfig;
		}

		public void setGreConfig(String greConfig) {
			this.greConfig = greConfig;
		}

		public String getSslConfig() {
			return this.sslConfig;
		}

		public void setSslConfig(String sslConfig) {
			this.sslConfig = sslConfig;
		}
	}

	@Override
	public DescribeUisConnectionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeUisConnectionsResponseUnmarshaller.unmarshall(this, context);
	}
}
