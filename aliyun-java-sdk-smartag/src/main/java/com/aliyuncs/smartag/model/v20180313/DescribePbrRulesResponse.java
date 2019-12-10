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
import com.aliyuncs.smartag.transform.v20180313.DescribePbrRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePbrRulesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<PbrRule> pbrRules;

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

	public List<PbrRule> getPbrRules() {
		return this.pbrRules;
	}

	public void setPbrRules(List<PbrRule> pbrRules) {
		this.pbrRules = pbrRules;
	}

	public static class PbrRule {

		private String pbrRuleId;

		private String srcCidr;

		private String dstCidr;

		private String srcPort;

		private String dstPort;

		private String protocol;

		private String name;

		private String description;

		public String getPbrRuleId() {
			return this.pbrRuleId;
		}

		public void setPbrRuleId(String pbrRuleId) {
			this.pbrRuleId = pbrRuleId;
		}

		public String getSrcCidr() {
			return this.srcCidr;
		}

		public void setSrcCidr(String srcCidr) {
			this.srcCidr = srcCidr;
		}

		public String getDstCidr() {
			return this.dstCidr;
		}

		public void setDstCidr(String dstCidr) {
			this.dstCidr = dstCidr;
		}

		public String getSrcPort() {
			return this.srcPort;
		}

		public void setSrcPort(String srcPort) {
			this.srcPort = srcPort;
		}

		public String getDstPort() {
			return this.dstPort;
		}

		public void setDstPort(String dstPort) {
			this.dstPort = dstPort;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public DescribePbrRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribePbrRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
