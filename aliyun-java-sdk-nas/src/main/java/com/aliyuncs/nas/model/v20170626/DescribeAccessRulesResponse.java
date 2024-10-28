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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeAccessRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccessRulesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<AccessRule> accessRules;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<AccessRule> getAccessRules() {
		return this.accessRules;
	}

	public void setAccessRules(List<AccessRule> accessRules) {
		this.accessRules = accessRules;
	}

	public static class AccessRule {

		private String accessRuleId;

		private String sourceCidrIp;

		private String ipv6SourceCidrIp;

		private String rWAccess;

		private String userAccess;

		private Integer priority;

		private String fileSystemType;

		private String accessGroupName;

		private String regionId;

		public String getAccessRuleId() {
			return this.accessRuleId;
		}

		public void setAccessRuleId(String accessRuleId) {
			this.accessRuleId = accessRuleId;
		}

		public String getSourceCidrIp() {
			return this.sourceCidrIp;
		}

		public void setSourceCidrIp(String sourceCidrIp) {
			this.sourceCidrIp = sourceCidrIp;
		}

		public String getIpv6SourceCidrIp() {
			return this.ipv6SourceCidrIp;
		}

		public void setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
			this.ipv6SourceCidrIp = ipv6SourceCidrIp;
		}

		public String getRWAccess() {
			return this.rWAccess;
		}

		public void setRWAccess(String rWAccess) {
			this.rWAccess = rWAccess;
		}

		public String getUserAccess() {
			return this.userAccess;
		}

		public void setUserAccess(String userAccess) {
			this.userAccess = userAccess;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getFileSystemType() {
			return this.fileSystemType;
		}

		public void setFileSystemType(String fileSystemType) {
			this.fileSystemType = fileSystemType;
		}

		public String getAccessGroupName() {
			return this.accessGroupName;
		}

		public void setAccessGroupName(String accessGroupName) {
			this.accessGroupName = accessGroupName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public DescribeAccessRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccessRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
