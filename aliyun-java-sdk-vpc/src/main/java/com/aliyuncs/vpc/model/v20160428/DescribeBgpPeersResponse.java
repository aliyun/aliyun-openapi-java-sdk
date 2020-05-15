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
import com.aliyuncs.vpc.transform.v20160428.DescribeBgpPeersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBgpPeersResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<BgpPeer> bgpPeers;

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

	public List<BgpPeer> getBgpPeers() {
		return this.bgpPeers;
	}

	public void setBgpPeers(List<BgpPeer> bgpPeers) {
		this.bgpPeers = bgpPeers;
	}

	public static class BgpPeer {

		private String name;

		private String description;

		private String bgpPeerId;

		private String bgpGroupId;

		private String peerIpAddress;

		private String peerAsn;

		private String authKey;

		private String routerId;

		private String bgpStatus;

		private String status;

		private String keepalive;

		private String localAsn;

		private String hold;

		private String isFake;

		private String routeLimit;

		private String regionId;

		private Boolean enableBfd;

		private String ipVersion;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getBgpPeerId() {
			return this.bgpPeerId;
		}

		public void setBgpPeerId(String bgpPeerId) {
			this.bgpPeerId = bgpPeerId;
		}

		public String getBgpGroupId() {
			return this.bgpGroupId;
		}

		public void setBgpGroupId(String bgpGroupId) {
			this.bgpGroupId = bgpGroupId;
		}

		public String getPeerIpAddress() {
			return this.peerIpAddress;
		}

		public void setPeerIpAddress(String peerIpAddress) {
			this.peerIpAddress = peerIpAddress;
		}

		public String getPeerAsn() {
			return this.peerAsn;
		}

		public void setPeerAsn(String peerAsn) {
			this.peerAsn = peerAsn;
		}

		public String getAuthKey() {
			return this.authKey;
		}

		public void setAuthKey(String authKey) {
			this.authKey = authKey;
		}

		public String getRouterId() {
			return this.routerId;
		}

		public void setRouterId(String routerId) {
			this.routerId = routerId;
		}

		public String getBgpStatus() {
			return this.bgpStatus;
		}

		public void setBgpStatus(String bgpStatus) {
			this.bgpStatus = bgpStatus;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getKeepalive() {
			return this.keepalive;
		}

		public void setKeepalive(String keepalive) {
			this.keepalive = keepalive;
		}

		public String getLocalAsn() {
			return this.localAsn;
		}

		public void setLocalAsn(String localAsn) {
			this.localAsn = localAsn;
		}

		public String getHold() {
			return this.hold;
		}

		public void setHold(String hold) {
			this.hold = hold;
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

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Boolean getEnableBfd() {
			return this.enableBfd;
		}

		public void setEnableBfd(Boolean enableBfd) {
			this.enableBfd = enableBfd;
		}

		public String getIpVersion() {
			return this.ipVersion;
		}

		public void setIpVersion(String ipVersion) {
			this.ipVersion = ipVersion;
		}
	}

	@Override
	public DescribeBgpPeersResponse getInstance(UnmarshallerContext context) {
		return	DescribeBgpPeersResponseUnmarshaller.unmarshall(this, context);
	}
}
