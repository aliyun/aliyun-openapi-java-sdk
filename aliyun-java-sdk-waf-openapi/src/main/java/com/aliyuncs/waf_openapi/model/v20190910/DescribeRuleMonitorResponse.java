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

package com.aliyuncs.waf_openapi.model.v20190910;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.waf_openapi.transform.v20190910.DescribeRuleMonitorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRuleMonitorResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<Item> ruleMonitors;

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

	public List<Item> getRuleMonitors() {
		return this.ruleMonitors;
	}

	public void setRuleMonitors(List<Item> ruleMonitors) {
		this.ruleMonitors = ruleMonitors;
	}

	public static class Item {

		private String antibotType;

		private Long pv;

		private String ruleId;

		private Long index;

		private String domain;

		private String antibotWatch;

		public String getAntibotType() {
			return this.antibotType;
		}

		public void setAntibotType(String antibotType) {
			this.antibotType = antibotType;
		}

		public Long getPv() {
			return this.pv;
		}

		public void setPv(Long pv) {
			this.pv = pv;
		}

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public Long getIndex() {
			return this.index;
		}

		public void setIndex(Long index) {
			this.index = index;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getAntibotWatch() {
			return this.antibotWatch;
		}

		public void setAntibotWatch(String antibotWatch) {
			this.antibotWatch = antibotWatch;
		}
	}

	@Override
	public DescribeRuleMonitorResponse getInstance(UnmarshallerContext context) {
		return	DescribeRuleMonitorResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
