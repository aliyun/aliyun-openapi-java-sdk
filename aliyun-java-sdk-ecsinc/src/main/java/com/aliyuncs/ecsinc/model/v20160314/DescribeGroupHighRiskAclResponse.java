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
import com.aliyuncs.ecsinc.transform.v20160314.DescribeGroupHighRiskAclResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupHighRiskAclResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<AclSet> aclSets;

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

	public List<AclSet> getAclSets() {
		return this.aclSets;
	}

	public void setAclSets(List<AclSet> aclSets) {
		this.aclSets = aclSets;
	}

	public static class AclSet {

		private Long id;

		private String srcGroupId;

		private String dstGroupId;

		private String srcIpRange;

		private String protocol;

		private String srcPortRange;

		private String dstPortRange;

		private String createTime;

		private String modifiedTime;

		private String policy;

		private Long type;

		private Long priority;

		private String dstIpRange;

		private Long nic;

		private Long alarmLevel;

		private String securityGroupId;

		private String description;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getSrcGroupId() {
			return this.srcGroupId;
		}

		public void setSrcGroupId(String srcGroupId) {
			this.srcGroupId = srcGroupId;
		}

		public String getDstGroupId() {
			return this.dstGroupId;
		}

		public void setDstGroupId(String dstGroupId) {
			this.dstGroupId = dstGroupId;
		}

		public String getSrcIpRange() {
			return this.srcIpRange;
		}

		public void setSrcIpRange(String srcIpRange) {
			this.srcIpRange = srcIpRange;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		/**
		 * @deprecated use getBizProtocol instead of this.
		 */
		@Deprecated
		public String getProtocol() {
			return this.protocol;
		}

		/**
		 * @deprecated use setBizProtocol instead of this.
		 */
		@Deprecated
		public void setProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getSrcPortRange() {
			return this.srcPortRange;
		}

		public void setSrcPortRange(String srcPortRange) {
			this.srcPortRange = srcPortRange;
		}

		public String getDstPortRange() {
			return this.dstPortRange;
		}

		public void setDstPortRange(String dstPortRange) {
			this.dstPortRange = dstPortRange;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public Long getType() {
			return this.type;
		}

		public void setType(Long type) {
			this.type = type;
		}

		public Long getPriority() {
			return this.priority;
		}

		public void setPriority(Long priority) {
			this.priority = priority;
		}

		public String getDstIpRange() {
			return this.dstIpRange;
		}

		public void setDstIpRange(String dstIpRange) {
			this.dstIpRange = dstIpRange;
		}

		public Long getNic() {
			return this.nic;
		}

		public void setNic(Long nic) {
			this.nic = nic;
		}

		public Long getAlarmLevel() {
			return this.alarmLevel;
		}

		public void setAlarmLevel(Long alarmLevel) {
			this.alarmLevel = alarmLevel;
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
	}

	@Override
	public DescribeGroupHighRiskAclResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupHighRiskAclResponseUnmarshaller.unmarshall(this, context);
	}
}
