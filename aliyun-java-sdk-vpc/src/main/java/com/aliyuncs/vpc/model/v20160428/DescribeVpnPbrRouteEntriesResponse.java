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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeVpnPbrRouteEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVpnPbrRouteEntriesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<VpnPbrRouteEntry> vpnPbrRouteEntries;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<VpnPbrRouteEntry> getVpnPbrRouteEntries() {
		return this.vpnPbrRouteEntries;
	}

	public void setVpnPbrRouteEntries(List<VpnPbrRouteEntry> vpnPbrRouteEntries) {
		this.vpnPbrRouteEntries = vpnPbrRouteEntries;
	}

	public static class VpnPbrRouteEntry {

		private String nextHop;

		private Integer weight;

		private String routeDest;

		private String state;

		private Long createTime;

		private String vpnInstanceId;

		private String routeSource;

		private Integer priority;

		private String nextHopTunnelId;

		public String getNextHop() {
			return this.nextHop;
		}

		public void setNextHop(String nextHop) {
			this.nextHop = nextHop;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getRouteDest() {
			return this.routeDest;
		}

		public void setRouteDest(String routeDest) {
			this.routeDest = routeDest;
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

		public String getVpnInstanceId() {
			return this.vpnInstanceId;
		}

		public void setVpnInstanceId(String vpnInstanceId) {
			this.vpnInstanceId = vpnInstanceId;
		}

		public String getRouteSource() {
			return this.routeSource;
		}

		public void setRouteSource(String routeSource) {
			this.routeSource = routeSource;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getNextHopTunnelId() {
			return this.nextHopTunnelId;
		}

		public void setNextHopTunnelId(String nextHopTunnelId) {
			this.nextHopTunnelId = nextHopTunnelId;
		}
	}

	@Override
	public DescribeVpnPbrRouteEntriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeVpnPbrRouteEntriesResponseUnmarshaller.unmarshall(this, context);
	}
}
