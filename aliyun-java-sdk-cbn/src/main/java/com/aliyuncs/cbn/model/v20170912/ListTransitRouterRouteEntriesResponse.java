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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.ListTransitRouterRouteEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRouterRouteEntriesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private Integer maxResults;

	private List<TransitRouterRouteEntry> transitRouterRouteEntries;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<TransitRouterRouteEntry> getTransitRouterRouteEntries() {
		return this.transitRouterRouteEntries;
	}

	public void setTransitRouterRouteEntries(List<TransitRouterRouteEntry> transitRouterRouteEntries) {
		this.transitRouterRouteEntries = transitRouterRouteEntries;
	}

	public static class TransitRouterRouteEntry {

		private String transitRouterRouteEntryId;

		private String transitRouterRouteEntryDestinationCidrBlock;

		private String transitRouterRouteEntryType;

		private String createTime;

		private String transitRouterRouteEntryName;

		private String transitRouterRouteEntryStatus;

		private String transitRouterRouteEntryNextHopType;

		private String transitRouterRouteEntryNextHopId;

		private String transitRouterRouteEntryDescription;

		private Boolean operationalMode;

		private String tag;

		private String transitRouterRouteEntryNextHopResourceId;

		private String transitRouterRouteEntryNextHopResourceType;

		private String transitRouterRouteEntryOriginResourceType;

		private String transitRouterRouteEntryOriginResourceId;

		private String prefixListId;

		private Integer preference;

		private String vpnTunnelIp;

		private List<String> communities;

		private List<String> asPaths;

		private PathAttributes pathAttributes;

		public String getTransitRouterRouteEntryId() {
			return this.transitRouterRouteEntryId;
		}

		public void setTransitRouterRouteEntryId(String transitRouterRouteEntryId) {
			this.transitRouterRouteEntryId = transitRouterRouteEntryId;
		}

		public String getTransitRouterRouteEntryDestinationCidrBlock() {
			return this.transitRouterRouteEntryDestinationCidrBlock;
		}

		public void setTransitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
			this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
		}

		public String getTransitRouterRouteEntryType() {
			return this.transitRouterRouteEntryType;
		}

		public void setTransitRouterRouteEntryType(String transitRouterRouteEntryType) {
			this.transitRouterRouteEntryType = transitRouterRouteEntryType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getTransitRouterRouteEntryName() {
			return this.transitRouterRouteEntryName;
		}

		public void setTransitRouterRouteEntryName(String transitRouterRouteEntryName) {
			this.transitRouterRouteEntryName = transitRouterRouteEntryName;
		}

		public String getTransitRouterRouteEntryStatus() {
			return this.transitRouterRouteEntryStatus;
		}

		public void setTransitRouterRouteEntryStatus(String transitRouterRouteEntryStatus) {
			this.transitRouterRouteEntryStatus = transitRouterRouteEntryStatus;
		}

		public String getTransitRouterRouteEntryNextHopType() {
			return this.transitRouterRouteEntryNextHopType;
		}

		public void setTransitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
			this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
		}

		public String getTransitRouterRouteEntryNextHopId() {
			return this.transitRouterRouteEntryNextHopId;
		}

		public void setTransitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
			this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
		}

		public String getTransitRouterRouteEntryDescription() {
			return this.transitRouterRouteEntryDescription;
		}

		public void setTransitRouterRouteEntryDescription(String transitRouterRouteEntryDescription) {
			this.transitRouterRouteEntryDescription = transitRouterRouteEntryDescription;
		}

		public Boolean getOperationalMode() {
			return this.operationalMode;
		}

		public void setOperationalMode(Boolean operationalMode) {
			this.operationalMode = operationalMode;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getTransitRouterRouteEntryNextHopResourceId() {
			return this.transitRouterRouteEntryNextHopResourceId;
		}

		public void setTransitRouterRouteEntryNextHopResourceId(String transitRouterRouteEntryNextHopResourceId) {
			this.transitRouterRouteEntryNextHopResourceId = transitRouterRouteEntryNextHopResourceId;
		}

		public String getTransitRouterRouteEntryNextHopResourceType() {
			return this.transitRouterRouteEntryNextHopResourceType;
		}

		public void setTransitRouterRouteEntryNextHopResourceType(String transitRouterRouteEntryNextHopResourceType) {
			this.transitRouterRouteEntryNextHopResourceType = transitRouterRouteEntryNextHopResourceType;
		}

		public String getTransitRouterRouteEntryOriginResourceType() {
			return this.transitRouterRouteEntryOriginResourceType;
		}

		public void setTransitRouterRouteEntryOriginResourceType(String transitRouterRouteEntryOriginResourceType) {
			this.transitRouterRouteEntryOriginResourceType = transitRouterRouteEntryOriginResourceType;
		}

		public String getTransitRouterRouteEntryOriginResourceId() {
			return this.transitRouterRouteEntryOriginResourceId;
		}

		public void setTransitRouterRouteEntryOriginResourceId(String transitRouterRouteEntryOriginResourceId) {
			this.transitRouterRouteEntryOriginResourceId = transitRouterRouteEntryOriginResourceId;
		}

		public String getPrefixListId() {
			return this.prefixListId;
		}

		public void setPrefixListId(String prefixListId) {
			this.prefixListId = prefixListId;
		}

		public Integer getPreference() {
			return this.preference;
		}

		public void setPreference(Integer preference) {
			this.preference = preference;
		}

		public String getVpnTunnelIp() {
			return this.vpnTunnelIp;
		}

		public void setVpnTunnelIp(String vpnTunnelIp) {
			this.vpnTunnelIp = vpnTunnelIp;
		}

		public List<String> getCommunities() {
			return this.communities;
		}

		public void setCommunities(List<String> communities) {
			this.communities = communities;
		}

		public List<String> getAsPaths() {
			return this.asPaths;
		}

		public void setAsPaths(List<String> asPaths) {
			this.asPaths = asPaths;
		}

		public PathAttributes getPathAttributes() {
			return this.pathAttributes;
		}

		public void setPathAttributes(PathAttributes pathAttributes) {
			this.pathAttributes = pathAttributes;
		}

		public static class PathAttributes {

			private String originInstanceId;

			private String originInstanceType;

			private String originRouteType;

			private Integer preference;

			private Long med;

			private List<String> communities1;

			private List<String> asPaths2;

			public String getOriginInstanceId() {
				return this.originInstanceId;
			}

			public void setOriginInstanceId(String originInstanceId) {
				this.originInstanceId = originInstanceId;
			}

			public String getOriginInstanceType() {
				return this.originInstanceType;
			}

			public void setOriginInstanceType(String originInstanceType) {
				this.originInstanceType = originInstanceType;
			}

			public String getOriginRouteType() {
				return this.originRouteType;
			}

			public void setOriginRouteType(String originRouteType) {
				this.originRouteType = originRouteType;
			}

			public Integer getPreference() {
				return this.preference;
			}

			public void setPreference(Integer preference) {
				this.preference = preference;
			}

			public Long getMed() {
				return this.med;
			}

			public void setMed(Long med) {
				this.med = med;
			}

			public List<String> getCommunities1() {
				return this.communities1;
			}

			public void setCommunities1(List<String> communities1) {
				this.communities1 = communities1;
			}

			public List<String> getAsPaths2() {
				return this.asPaths2;
			}

			public void setAsPaths2(List<String> asPaths2) {
				this.asPaths2 = asPaths2;
			}
		}
	}

	@Override
	public ListTransitRouterRouteEntriesResponse getInstance(UnmarshallerContext context) {
		return	ListTransitRouterRouteEntriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
