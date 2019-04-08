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

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<VpnRouteEntry> vpnRouteEntries;

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

	public List<VpnRouteEntry> getVpnRouteEntries() {
		return this.vpnRouteEntries;
	}

	public void setVpnRouteEntries(List<VpnRouteEntry> vpnRouteEntries) {
		this.vpnRouteEntries = vpnRouteEntries;
	}

	public static class VpnRouteEntry {

		private String vpnInstanceId;

		private String routeDest;

		private String nextHop;

		private Integer weight;

		private Long createTime;

		private String state;

		public String getVpnInstanceId() {
			return this.vpnInstanceId;
		}

		public void setVpnInstanceId(String vpnInstanceId) {
			this.vpnInstanceId = vpnInstanceId;
		}

		public String getRouteDest() {
			return this.routeDest;
		}

		public void setRouteDest(String routeDest) {
			this.routeDest = routeDest;
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

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}
	}

	@Override
	public DescribeVpnRouteEntriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeVpnRouteEntriesResponseUnmarshaller.unmarshall(this, context);
	}
}
