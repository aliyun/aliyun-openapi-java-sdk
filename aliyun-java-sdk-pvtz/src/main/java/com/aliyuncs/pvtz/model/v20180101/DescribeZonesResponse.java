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

package com.aliyuncs.pvtz.model.v20180101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pvtz.transform.v20180101.DescribeZonesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeZonesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalPages;

	private Integer totalItems;

	private List<Zone> zones;

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

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public List<Zone> getZones() {
		return this.zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}

	public static class Zone {

		private String updateTime;

		private String zoneType;

		private String remark;

		private String createTime;

		private Integer recordCount;

		private String zoneName;

		private String proxyPattern;

		private Long updateTimestamp;

		private String resourceGroupId;

		private String zoneId;

		private String zoneTag;

		private Boolean isPtr;

		private Long createTimestamp;

		private String dnsGroup;

		private String creator;

		private String creatorSubType;

		private Boolean dnsGroupChanging;

		private List<ResourceTag> resourceTags;

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getZoneType() {
			return this.zoneType;
		}

		public void setZoneType(String zoneType) {
			this.zoneType = zoneType;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Integer getRecordCount() {
			return this.recordCount;
		}

		public void setRecordCount(Integer recordCount) {
			this.recordCount = recordCount;
		}

		public String getZoneName() {
			return this.zoneName;
		}

		public void setZoneName(String zoneName) {
			this.zoneName = zoneName;
		}

		public String getProxyPattern() {
			return this.proxyPattern;
		}

		public void setProxyPattern(String proxyPattern) {
			this.proxyPattern = proxyPattern;
		}

		public Long getUpdateTimestamp() {
			return this.updateTimestamp;
		}

		public void setUpdateTimestamp(Long updateTimestamp) {
			this.updateTimestamp = updateTimestamp;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getZoneTag() {
			return this.zoneTag;
		}

		public void setZoneTag(String zoneTag) {
			this.zoneTag = zoneTag;
		}

		public Boolean getIsPtr() {
			return this.isPtr;
		}

		public void setIsPtr(Boolean isPtr) {
			this.isPtr = isPtr;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public String getDnsGroup() {
			return this.dnsGroup;
		}

		public void setDnsGroup(String dnsGroup) {
			this.dnsGroup = dnsGroup;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getCreatorSubType() {
			return this.creatorSubType;
		}

		public void setCreatorSubType(String creatorSubType) {
			this.creatorSubType = creatorSubType;
		}

		public Boolean getDnsGroupChanging() {
			return this.dnsGroupChanging;
		}

		public void setDnsGroupChanging(Boolean dnsGroupChanging) {
			this.dnsGroupChanging = dnsGroupChanging;
		}

		public List<ResourceTag> getResourceTags() {
			return this.resourceTags;
		}

		public void setResourceTags(List<ResourceTag> resourceTags) {
			this.resourceTags = resourceTags;
		}

		public static class ResourceTag {

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
	}

	@Override
	public DescribeZonesResponse getInstance(UnmarshallerContext context) {
		return	DescribeZonesResponseUnmarshaller.unmarshall(this, context);
	}
}
