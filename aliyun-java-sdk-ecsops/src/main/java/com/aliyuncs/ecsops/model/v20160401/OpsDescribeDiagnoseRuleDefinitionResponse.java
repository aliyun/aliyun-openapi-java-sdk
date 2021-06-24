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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeDiagnoseRuleDefinitionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeDiagnoseRuleDefinitionResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer page;

	private Integer pageSize;

	private Integer count;

	private List<ComplexRule> complexRules;

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

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<ComplexRule> getComplexRules() {
		return this.complexRules;
	}

	public void setComplexRules(List<ComplexRule> complexRules) {
		this.complexRules = complexRules;
	}

	public static class ComplexRule {

		private String name;

		private String type;

		private String desc;

		private String level;

		private Long silent;

		private String reason;

		private Integer maxTimes;

		private Integer delayExec;

		private Boolean enable;

		private String opsType;

		private List<String> actions;

		private List<String> relatedFeatureName;

		private List<String> conditions;

		private List<String> exclusions;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Long getSilent() {
			return this.silent;
		}

		public void setSilent(Long silent) {
			this.silent = silent;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public Integer getMaxTimes() {
			return this.maxTimes;
		}

		public void setMaxTimes(Integer maxTimes) {
			this.maxTimes = maxTimes;
		}

		public Integer getDelayExec() {
			return this.delayExec;
		}

		public void setDelayExec(Integer delayExec) {
			this.delayExec = delayExec;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public String getOpsType() {
			return this.opsType;
		}

		public void setOpsType(String opsType) {
			this.opsType = opsType;
		}

		public List<String> getActions() {
			return this.actions;
		}

		public void setActions(List<String> actions) {
			this.actions = actions;
		}

		public List<String> getRelatedFeatureName() {
			return this.relatedFeatureName;
		}

		public void setRelatedFeatureName(List<String> relatedFeatureName) {
			this.relatedFeatureName = relatedFeatureName;
		}

		public List<String> getConditions() {
			return this.conditions;
		}

		public void setConditions(List<String> conditions) {
			this.conditions = conditions;
		}

		public List<String> getExclusions() {
			return this.exclusions;
		}

		public void setExclusions(List<String> exclusions) {
			this.exclusions = exclusions;
		}
	}

	@Override
	public OpsDescribeDiagnoseRuleDefinitionResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeDiagnoseRuleDefinitionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
