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
import com.aliyuncs.cbn.transform.v20170912.ListTransitRoutersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRoutersResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<TransitRouter> transitRouters;

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

	public List<TransitRouter> getTransitRouters() {
		return this.transitRouters;
	}

	public void setTransitRouters(List<TransitRouter> transitRouters) {
		this.transitRouters = transitRouters;
	}

	public static class TransitRouter {

		private String creationTime;

		private String type;

		private String status;

		private String transitRouterId;

		private String transitRouterDescription;

		private String transitRouterName;

		private String cenId;

		private Long aliUid;

		private String regionId;

		private String serviceMode;

		private Boolean supportMulticast;

		private List<TransitRouterCidrListItem> transitRouterCidrList;

		private List<Tag> tags;

		private List<TransitRouterPrimaryStandbyZoneInfoListItem> transitRouterPrimaryStandbyZoneInfoList;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTransitRouterId() {
			return this.transitRouterId;
		}

		public void setTransitRouterId(String transitRouterId) {
			this.transitRouterId = transitRouterId;
		}

		public String getTransitRouterDescription() {
			return this.transitRouterDescription;
		}

		public void setTransitRouterDescription(String transitRouterDescription) {
			this.transitRouterDescription = transitRouterDescription;
		}

		public String getTransitRouterName() {
			return this.transitRouterName;
		}

		public void setTransitRouterName(String transitRouterName) {
			this.transitRouterName = transitRouterName;
		}

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getServiceMode() {
			return this.serviceMode;
		}

		public void setServiceMode(String serviceMode) {
			this.serviceMode = serviceMode;
		}

		public Boolean getSupportMulticast() {
			return this.supportMulticast;
		}

		public void setSupportMulticast(Boolean supportMulticast) {
			this.supportMulticast = supportMulticast;
		}

		public List<TransitRouterCidrListItem> getTransitRouterCidrList() {
			return this.transitRouterCidrList;
		}

		public void setTransitRouterCidrList(List<TransitRouterCidrListItem> transitRouterCidrList) {
			this.transitRouterCidrList = transitRouterCidrList;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<TransitRouterPrimaryStandbyZoneInfoListItem> getTransitRouterPrimaryStandbyZoneInfoList() {
			return this.transitRouterPrimaryStandbyZoneInfoList;
		}

		public void setTransitRouterPrimaryStandbyZoneInfoList(List<TransitRouterPrimaryStandbyZoneInfoListItem> transitRouterPrimaryStandbyZoneInfoList) {
			this.transitRouterPrimaryStandbyZoneInfoList = transitRouterPrimaryStandbyZoneInfoList;
		}

		public static class TransitRouterCidrListItem {

			private String cidr;

			private String name;

			private String description;

			private String transitRouterCidrId;

			private Boolean publishCidrRoute;

			public String getCidr() {
				return this.cidr;
			}

			public void setCidr(String cidr) {
				this.cidr = cidr;
			}

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

			public String getTransitRouterCidrId() {
				return this.transitRouterCidrId;
			}

			public void setTransitRouterCidrId(String transitRouterCidrId) {
				this.transitRouterCidrId = transitRouterCidrId;
			}

			public Boolean getPublishCidrRoute() {
				return this.publishCidrRoute;
			}

			public void setPublishCidrRoute(Boolean publishCidrRoute) {
				this.publishCidrRoute = publishCidrRoute;
			}
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class TransitRouterPrimaryStandbyZoneInfoListItem {

			private String zoneId;

			private String role;

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}
		}
	}

	@Override
	public ListTransitRoutersResponse getInstance(UnmarshallerContext context) {
		return	ListTransitRoutersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
