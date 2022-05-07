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
import com.aliyuncs.vpc.transform.v20160428.DescribeBgpGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBgpGroupsResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<BgpGroup> bgpGroups;

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

	public List<BgpGroup> getBgpGroups() {
		return this.bgpGroups;
	}

	public void setBgpGroups(List<BgpGroup> bgpGroups) {
		this.bgpGroups = bgpGroups;
	}

	public static class BgpGroup {

		private String status;

		private String bgpGroupId;

		private String routerId;

		private String peerAsn;

		private String localAsn;

		private String regionId;

		private String hold;

		private String ipVersion;

		private String description;

		private String keepalive;

		private String isFake;

		private String routeLimit;

		private Integer routeQuota;

		private String name;

		private String authKey;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getBgpGroupId() {
			return this.bgpGroupId;
		}

		public void setBgpGroupId(String bgpGroupId) {
			this.bgpGroupId = bgpGroupId;
		}

		public String getRouterId() {
			return this.routerId;
		}

		public void setRouterId(String routerId) {
			this.routerId = routerId;
		}

		public String getPeerAsn() {
			return this.peerAsn;
		}

		public void setPeerAsn(String peerAsn) {
			this.peerAsn = peerAsn;
		}

		public String getLocalAsn() {
			return this.localAsn;
		}

		public void setLocalAsn(String localAsn) {
			this.localAsn = localAsn;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getHold() {
			return this.hold;
		}

		public void setHold(String hold) {
			this.hold = hold;
		}

		public String getIpVersion() {
			return this.ipVersion;
		}

		public void setIpVersion(String ipVersion) {
			this.ipVersion = ipVersion;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getKeepalive() {
			return this.keepalive;
		}

		public void setKeepalive(String keepalive) {
			this.keepalive = keepalive;
		}

		public String getIsFake() {
			return this.isFake;
		}

		public void setIsFake(String isFake) {
			this.isFake = isFake;
		}

		public String getRouteLimit() {
			return this.routeLimit;
		}

		public void setRouteLimit(String routeLimit) {
			this.routeLimit = routeLimit;
		}

		public Integer getRouteQuota() {
			return this.routeQuota;
		}

		public void setRouteQuota(Integer routeQuota) {
			this.routeQuota = routeQuota;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAuthKey() {
			return this.authKey;
		}

		public void setAuthKey(String authKey) {
			this.authKey = authKey;
		}
	}

	@Override
	public DescribeBgpGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeBgpGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
