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

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<AccessRule> accessRules;

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

	public List<AccessRule> getAccessRules() {
		return this.accessRules;
	}

	public void setAccessRules(List<AccessRule> accessRules) {
		this.accessRules = accessRules;
	}

	public static class AccessRule {

		private String sourceCidrIp;

		private Integer priority;

		private String accessRuleId;

		private String rWAccess;

		private String userAccess;

		public String getSourceCidrIp() {
			return this.sourceCidrIp;
		}

		public void setSourceCidrIp(String sourceCidrIp) {
			this.sourceCidrIp = sourceCidrIp;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getAccessRuleId() {
			return this.accessRuleId;
		}

		public void setAccessRuleId(String accessRuleId) {
			this.accessRuleId = accessRuleId;
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
	}

	@Override
	public DescribeAccessRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccessRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
