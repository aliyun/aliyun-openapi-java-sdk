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

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<ApiGroupAttribute> apiGroupAttributes;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<ApiGroupAttribute> getApiGroupAttributes() {
		return this.apiGroupAttributes;
	}

	public void setApiGroupAttributes(List<ApiGroupAttribute> apiGroupAttributes) {
		this.apiGroupAttributes = apiGroupAttributes;
	}

	public static class ApiGroupAttribute {

		private String groupId;

		private String groupName;

		private String subDomain;

		private String description;

		private String createdTime;

		private String modifiedTime;

		private String regionId;

		private Integer trafficLimit;

		private String billingStatus;

		private String illegalStatus;

		private String instanceId;

		private String instanceType;

		private String httpsPolicy;

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

		public String getSubDomain() {
			return this.subDomain;
		}

		public void setSubDomain(String subDomain) {
			this.subDomain = subDomain;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getTrafficLimit() {
			return this.trafficLimit;
		}

		public void setTrafficLimit(Integer trafficLimit) {
			this.trafficLimit = trafficLimit;
		}

		public String getBillingStatus() {
			return this.billingStatus;
		}

		public void setBillingStatus(String billingStatus) {
			this.billingStatus = billingStatus;
		}

		public String getIllegalStatus() {
			return this.illegalStatus;
		}

		public void setIllegalStatus(String illegalStatus) {
			this.illegalStatus = illegalStatus;
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

		public String getHttpsPolicy() {
			return this.httpsPolicy;
		}

		public void setHttpsPolicy(String httpsPolicy) {
			this.httpsPolicy = httpsPolicy;
		}
	}

	@Override
	public DescribeApiGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeApiGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
