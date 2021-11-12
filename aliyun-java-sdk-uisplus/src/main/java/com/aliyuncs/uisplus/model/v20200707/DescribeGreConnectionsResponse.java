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

package com.aliyuncs.uisplus.model.v20200707;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.uisplus.transform.v20200707.DescribeGreConnectionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGreConnectionsResponse extends AcsResponse {

	private String uisId;

	private String requestId;

	private String state;

	private Long pageSize;

	private Integer totalCount;

	private String uisName;

	private Long page;

	private List<GreConnectionsItem> greConnections;

	public String getUisId() {
		return this.uisId;
	}

	public void setUisId(String uisId) {
		this.uisId = uisId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getUisName() {
		return this.uisName;
	}

	public void setUisName(String uisName) {
		this.uisName = uisName;
	}

	public Long getPage() {
		return this.page;
	}

	public void setPage(Long page) {
		this.page = page;
	}

	public List<GreConnectionsItem> getGreConnections() {
		return this.greConnections;
	}

	public void setGreConnections(List<GreConnectionsItem> greConnections) {
		this.greConnections = greConnections;
	}

	public static class GreConnectionsItem {

		private String customerIp;

		private String customerTunnelIp;

		private String localTunnelIp;

		private String description;

		private String cidrs;

		private String state;

		private Long createTime;

		private String name;

		private String localIp;

		private String greConnectionId;

		public String getCustomerIp() {
			return this.customerIp;
		}

		public void setCustomerIp(String customerIp) {
			this.customerIp = customerIp;
		}

		public String getCustomerTunnelIp() {
			return this.customerTunnelIp;
		}

		public void setCustomerTunnelIp(String customerTunnelIp) {
			this.customerTunnelIp = customerTunnelIp;
		}

		public String getLocalTunnelIp() {
			return this.localTunnelIp;
		}

		public void setLocalTunnelIp(String localTunnelIp) {
			this.localTunnelIp = localTunnelIp;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCidrs() {
			return this.cidrs;
		}

		public void setCidrs(String cidrs) {
			this.cidrs = cidrs;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocalIp() {
			return this.localIp;
		}

		public void setLocalIp(String localIp) {
			this.localIp = localIp;
		}

		public String getGreConnectionId() {
			return this.greConnectionId;
		}

		public void setGreConnectionId(String greConnectionId) {
			this.greConnectionId = greConnectionId;
		}
	}

	@Override
	public DescribeGreConnectionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeGreConnectionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
