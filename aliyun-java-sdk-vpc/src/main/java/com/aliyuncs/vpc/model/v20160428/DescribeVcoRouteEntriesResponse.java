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
import com.aliyuncs.vpc.transform.v20160428.DescribeVcoRouteEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVcoRouteEntriesResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private List<VcoRouteEntrie> vcoRouteEntries;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<VcoRouteEntrie> getVcoRouteEntries() {
		return this.vcoRouteEntries;
	}

	public void setVcoRouteEntries(List<VcoRouteEntrie> vcoRouteEntries) {
		this.vcoRouteEntries = vcoRouteEntries;
	}

	public static class VcoRouteEntrie {

		private String vpnConnectionId;

		private String routeDest;

		private String nextHop;

		private Integer weight;

		private String state;

		private String routeEntryType;

		private Long createTime;

		private String asPath;

		private String community;

		private String source;

		public String getVpnConnectionId() {
			return this.vpnConnectionId;
		}

		public void setVpnConnectionId(String vpnConnectionId) {
			this.vpnConnectionId = vpnConnectionId;
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

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getRouteEntryType() {
			return this.routeEntryType;
		}

		public void setRouteEntryType(String routeEntryType) {
			this.routeEntryType = routeEntryType;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getAsPath() {
			return this.asPath;
		}

		public void setAsPath(String asPath) {
			this.asPath = asPath;
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
	}

	@Override
	public DescribeVcoRouteEntriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeVcoRouteEntriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
