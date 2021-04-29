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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeQosPoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeQosPoliciesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<QosPolicy> qosPolicies;

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

	public List<QosPolicy> getQosPolicies() {
		return this.qosPolicies;
	}

	public void setQosPolicies(List<QosPolicy> qosPolicies) {
		this.qosPolicies = qosPolicies;
	}

	public static class QosPolicy {

		private String destCidr;

		private String description;

		private String sourcePortRange;

		private String qosPolicyId;

		private String endTime;

		private String sourceCidr;

		private Integer priority;

		private String startTime;

		private String qosId;

		private String ipProtocol;

		private String destPortRange;

		private String name;

		private List<String> dpiSignatureIds;

		private List<String> dpiGroupIds;

		public String getDestCidr() {
			return this.destCidr;
		}

		public void setDestCidr(String destCidr) {
			this.destCidr = destCidr;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSourcePortRange() {
			return this.sourcePortRange;
		}

		public void setSourcePortRange(String sourcePortRange) {
			this.sourcePortRange = sourcePortRange;
		}

		public String getQosPolicyId() {
			return this.qosPolicyId;
		}

		public void setQosPolicyId(String qosPolicyId) {
			this.qosPolicyId = qosPolicyId;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getSourceCidr() {
			return this.sourceCidr;
		}

		public void setSourceCidr(String sourceCidr) {
			this.sourceCidr = sourceCidr;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getQosId() {
			return this.qosId;
		}

		public void setQosId(String qosId) {
			this.qosId = qosId;
		}

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}

		public String getDestPortRange() {
			return this.destPortRange;
		}

		public void setDestPortRange(String destPortRange) {
			this.destPortRange = destPortRange;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<String> getDpiSignatureIds() {
			return this.dpiSignatureIds;
		}

		public void setDpiSignatureIds(List<String> dpiSignatureIds) {
			this.dpiSignatureIds = dpiSignatureIds;
		}

		public List<String> getDpiGroupIds() {
			return this.dpiGroupIds;
		}

		public void setDpiGroupIds(List<String> dpiGroupIds) {
			this.dpiGroupIds = dpiGroupIds;
		}
	}

	@Override
	public DescribeQosPoliciesResponse getInstance(UnmarshallerContext context) {
		return	DescribeQosPoliciesResponseUnmarshaller.unmarshall(this, context);
	}
}
