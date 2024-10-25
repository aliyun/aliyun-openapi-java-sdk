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
import com.aliyuncs.vpc.transform.v20160428.DescribeVpnRouteEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVpnRouteEntriesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<VpnRouteEntry> vpnRouteEntries;

	private List<VpnRouteCount> vpnRouteCounts;

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

	public List<VpnRouteEntry> getVpnRouteEntries() {
		return this.vpnRouteEntries;
	}

	public void setVpnRouteEntries(List<VpnRouteEntry> vpnRouteEntries) {
		this.vpnRouteEntries = vpnRouteEntries;
	}

	public List<VpnRouteCount> getVpnRouteCounts() {
		return this.vpnRouteCounts;
	}

	public void setVpnRouteCounts(List<VpnRouteCount> vpnRouteCounts) {
		this.vpnRouteCounts = vpnRouteCounts;
	}

	public static class VpnRouteEntry {

		private String routeEntryType;

		private String nextHop;

		private Integer weight;

		private String routeDest;

		private String asPath;

		private String state;

		private Long createTime;

		private String community;

		private String source;

		private String vpnInstanceId;

		private String nextHopTunnelId;

		public String getRouteEntryType() {
			return this.routeEntryType;
		}

		public void setRouteEntryType(String routeEntryType) {
			this.routeEntryType = routeEntryType;
		}

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

		public String getAsPath() {
			return this.asPath;
		}

		public void setAsPath(String asPath) {
			this.asPath = asPath;
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

		public String getCommunity() {
			return this.community;
		}

		public void setCommunity(String community) {
			this.community = community;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getVpnInstanceId() {
			return this.vpnInstanceId;
		}

		public void setVpnInstanceId(String vpnInstanceId) {
			this.vpnInstanceId = vpnInstanceId;
		}

		public String getNextHopTunnelId() {
			return this.nextHopTunnelId;
		}

		public void setNextHopTunnelId(String nextHopTunnelId) {
			this.nextHopTunnelId = nextHopTunnelId;
		}
	}

	public static class VpnRouteCount {

		private String routeEntryType;

		private Integer routeCount;

		private String source;

		public String getRouteEntryType() {
			return this.routeEntryType;
		}

		public void setRouteEntryType(String routeEntryType) {
			this.routeEntryType = routeEntryType;
		}

		public Integer getRouteCount() {
			return this.routeCount;
		}

		public void setRouteCount(Integer routeCount) {
			this.routeCount = routeCount;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}
	}

	@Override
	public DescribeVpnRouteEntriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeVpnRouteEntriesResponseUnmarshaller.unmarshall(this, context);
	}
}
