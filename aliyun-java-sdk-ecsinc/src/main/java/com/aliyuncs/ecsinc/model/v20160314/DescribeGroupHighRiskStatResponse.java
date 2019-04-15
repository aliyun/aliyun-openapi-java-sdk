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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.DescribeGroupHighRiskStatResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupHighRiskStatResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<AclStatSet> aclStatSets;

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

	public List<AclStatSet> getAclStatSets() {
		return this.aclStatSets;
	}

	public void setAclStatSets(List<AclStatSet> aclStatSets) {
		this.aclStatSets = aclStatSets;
	}

	public static class AclStatSet {

		private Long warnAclCount;

		private Long alertAclCount;

		private Long vmCount;

		private String securityGroupId;

		private String description;

		private String regionId;

		public Long getWarnAclCount() {
			return this.warnAclCount;
		}

		public void setWarnAclCount(Long warnAclCount) {
			this.warnAclCount = warnAclCount;
		}

		public Long getAlertAclCount() {
			return this.alertAclCount;
		}

		public void setAlertAclCount(Long alertAclCount) {
			this.alertAclCount = alertAclCount;
		}

		public Long getVmCount() {
			return this.vmCount;
		}

		public void setVmCount(Long vmCount) {
			this.vmCount = vmCount;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
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
	}

	@Override
	public DescribeGroupHighRiskStatResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupHighRiskStatResponseUnmarshaller.unmarshall(this, context);
	}
}
