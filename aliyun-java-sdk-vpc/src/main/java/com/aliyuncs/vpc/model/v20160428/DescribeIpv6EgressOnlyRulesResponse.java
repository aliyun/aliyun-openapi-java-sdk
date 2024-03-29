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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeIpv6EgressOnlyRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIpv6EgressOnlyRulesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<Ipv6EgressOnlyRule> ipv6EgressOnlyRules;

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

	public List<Ipv6EgressOnlyRule> getIpv6EgressOnlyRules() {
		return this.ipv6EgressOnlyRules;
	}

	public void setIpv6EgressOnlyRules(List<Ipv6EgressOnlyRule> ipv6EgressOnlyRules) {
		this.ipv6EgressOnlyRules = ipv6EgressOnlyRules;
	}

	public static class Ipv6EgressOnlyRule {

		private String status;

		private String description;

		private String ipv6EgressOnlyRuleId;

		private String instanceId;

		private String instanceType;

		private String name;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIpv6EgressOnlyRuleId() {
			return this.ipv6EgressOnlyRuleId;
		}

		public void setIpv6EgressOnlyRuleId(String ipv6EgressOnlyRuleId) {
			this.ipv6EgressOnlyRuleId = ipv6EgressOnlyRuleId;
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

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public DescribeIpv6EgressOnlyRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeIpv6EgressOnlyRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
