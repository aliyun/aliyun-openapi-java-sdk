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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeApiGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApiGroupsResponse extends AcsResponse {

	private Integer pageNumber;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<ApiGroupAttribute> apiGroupAttributes;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ApiGroupAttribute> getApiGroupAttributes() {
		return this.apiGroupAttributes;
	}

	public void setApiGroupAttributes(List<ApiGroupAttribute> apiGroupAttributes) {
		this.apiGroupAttributes = apiGroupAttributes;
	}

	public static class ApiGroupAttribute {

		private String basePath;

		private String billingStatus;

		private Integer trafficLimit;

		private String instanceId;

		private String instanceType;

		private String regionId;

		private String modifiedTime;

		private String groupId;

		private String groupName;

		private String description;

		private String illegalStatus;

		private String httpsPolicy;

		private String subDomain;

		private String createdTime;

		private List<TagInfo> tags;

		public String getBasePath() {
			return this.basePath;
		}

		public void setBasePath(String basePath) {
			this.basePath = basePath;
		}

		public String getBillingStatus() {
			return this.billingStatus;
		}

		public void setBillingStatus(String billingStatus) {
			this.billingStatus = billingStatus;
		}

		public Integer getTrafficLimit() {
			return this.trafficLimit;
		}

		public void setTrafficLimit(Integer trafficLimit) {
			this.trafficLimit = trafficLimit;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIllegalStatus() {
			return this.illegalStatus;
		}

		public void setIllegalStatus(String illegalStatus) {
			this.illegalStatus = illegalStatus;
		}

		public String getHttpsPolicy() {
			return this.httpsPolicy;
		}

		public void setHttpsPolicy(String httpsPolicy) {
			this.httpsPolicy = httpsPolicy;
		}

		public String getSubDomain() {
			return this.subDomain;
		}

		public void setSubDomain(String subDomain) {
			this.subDomain = subDomain;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public List<TagInfo> getTags() {
			return this.tags;
		}

		public void setTags(List<TagInfo> tags) {
			this.tags = tags;
		}

		public static class TagInfo {

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
	public DescribeApiGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeApiGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
