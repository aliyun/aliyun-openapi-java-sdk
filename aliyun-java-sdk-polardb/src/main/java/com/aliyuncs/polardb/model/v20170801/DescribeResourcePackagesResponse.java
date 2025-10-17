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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeResourcePackagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourcePackagesResponse extends AcsResponse {

	private String requestId;

	private List<ResourcePackageListItem> resourcePackageList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResourcePackageListItem> getResourcePackageList() {
		return this.resourcePackageList;
	}

	public void setResourcePackageList(List<ResourcePackageListItem> resourcePackageList) {
		this.resourcePackageList = resourcePackageList;
	}

	public static class ResourcePackageListItem {

		private String resourcePackageId;

		private String resourcePackageType;

		private String status;

		private Long usedCapacity;

		private Long totalCapacity;

		private Long createTime;

		private Long expireTime;

		private Boolean autoQuota;

		private List<ResourcePackageQuotaListItem> resourcePackageQuotaList;

		private List<Tag> tags;

		public String getResourcePackageId() {
			return this.resourcePackageId;
		}

		public void setResourcePackageId(String resourcePackageId) {
			this.resourcePackageId = resourcePackageId;
		}

		public String getResourcePackageType() {
			return this.resourcePackageType;
		}

		public void setResourcePackageType(String resourcePackageType) {
			this.resourcePackageType = resourcePackageType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getUsedCapacity() {
			return this.usedCapacity;
		}

		public void setUsedCapacity(Long usedCapacity) {
			this.usedCapacity = usedCapacity;
		}

		public Long getTotalCapacity() {
			return this.totalCapacity;
		}

		public void setTotalCapacity(Long totalCapacity) {
			this.totalCapacity = totalCapacity;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(Long expireTime) {
			this.expireTime = expireTime;
		}

		public Boolean getAutoQuota() {
			return this.autoQuota;
		}

		public void setAutoQuota(Boolean autoQuota) {
			this.autoQuota = autoQuota;
		}

		public List<ResourcePackageQuotaListItem> getResourcePackageQuotaList() {
			return this.resourcePackageQuotaList;
		}

		public void setResourcePackageQuotaList(List<ResourcePackageQuotaListItem> resourcePackageQuotaList) {
			this.resourcePackageQuotaList = resourcePackageQuotaList;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class ResourcePackageQuotaListItem {

			private String projectId;

			private Long usedCapacity;

			private Long allocatedCapacity;

			public String getProjectId() {
				return this.projectId;
			}

			public void setProjectId(String projectId) {
				this.projectId = projectId;
			}

			public Long getUsedCapacity() {
				return this.usedCapacity;
			}

			public void setUsedCapacity(Long usedCapacity) {
				this.usedCapacity = usedCapacity;
			}

			public Long getAllocatedCapacity() {
				return this.allocatedCapacity;
			}

			public void setAllocatedCapacity(Long allocatedCapacity) {
				this.allocatedCapacity = allocatedCapacity;
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
	}

	@Override
	public DescribeResourcePackagesResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourcePackagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
