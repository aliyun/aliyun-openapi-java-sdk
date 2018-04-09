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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListHealthRuleResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListHealthRuleResultResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageNumber;

	private Integer pageSize;

	private List<HealthRuleResult> healthRuleResultList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
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

	public List<HealthRuleResult> getHealthRuleResultList() {
		return this.healthRuleResultList;
	}

	public void setHealthRuleResultList(List<HealthRuleResult> healthRuleResultList) {
		this.healthRuleResultList = healthRuleResultList;
	}

	public static class HealthRuleResult {

		private Long id;

		private Long clusterId;

		private Long ruleId;

		private String ruleName;

		private String ruleTitle;

		private String ruleStatus;

		private String ruleDescription;

		private String service;

		private String component;

		private String pass;

		private String hostNames;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(Long clusterId) {
			this.clusterId = clusterId;
		}

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getRuleTitle() {
			return this.ruleTitle;
		}

		public void setRuleTitle(String ruleTitle) {
			this.ruleTitle = ruleTitle;
		}

		public String getRuleStatus() {
			return this.ruleStatus;
		}

		public void setRuleStatus(String ruleStatus) {
			this.ruleStatus = ruleStatus;
		}

		public String getRuleDescription() {
			return this.ruleDescription;
		}

		public void setRuleDescription(String ruleDescription) {
			this.ruleDescription = ruleDescription;
		}

		public String getService() {
			return this.service;
		}

		public void setService(String service) {
			this.service = service;
		}

		public String getComponent() {
			return this.component;
		}

		public void setComponent(String component) {
			this.component = component;
		}

		public String getPass() {
			return this.pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}

		public String getHostNames() {
			return this.hostNames;
		}

		public void setHostNames(String hostNames) {
			this.hostNames = hostNames;
		}
	}

	@Override
	public ListHealthRuleResultResponse getInstance(UnmarshallerContext context) {
		return	ListHealthRuleResultResponseUnmarshaller.unmarshall(this, context);
	}
}
