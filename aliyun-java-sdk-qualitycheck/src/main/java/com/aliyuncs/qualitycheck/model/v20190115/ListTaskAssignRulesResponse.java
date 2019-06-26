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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.ListTaskAssignRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTaskAssignRulesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<TaskAssignRuleInfo> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<TaskAssignRuleInfo> getData() {
		return this.data;
	}

	public void setData(List<TaskAssignRuleInfo> data) {
		this.data = data;
	}

	public static class TaskAssignRuleInfo {

		private Long ruleId;

		private Integer enabled;

		private Integer callType;

		private Integer priority;

		private Integer durationMin;

		private Integer durationMax;

		private String createTime;

		private String updateTime;

		private String agentsStr;

		private String skillGroupsStr;

		private List<Agent> agents;

		private List<SkillGroup> skillGroups;

		private List<Reviewer> reviewers;

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}

		public Integer getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Integer enabled) {
			this.enabled = enabled;
		}

		public Integer getCallType() {
			return this.callType;
		}

		public void setCallType(Integer callType) {
			this.callType = callType;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public Integer getDurationMin() {
			return this.durationMin;
		}

		public void setDurationMin(Integer durationMin) {
			this.durationMin = durationMin;
		}

		public Integer getDurationMax() {
			return this.durationMax;
		}

		public void setDurationMax(Integer durationMax) {
			this.durationMax = durationMax;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getAgentsStr() {
			return this.agentsStr;
		}

		public void setAgentsStr(String agentsStr) {
			this.agentsStr = agentsStr;
		}

		public String getSkillGroupsStr() {
			return this.skillGroupsStr;
		}

		public void setSkillGroupsStr(String skillGroupsStr) {
			this.skillGroupsStr = skillGroupsStr;
		}

		public List<Agent> getAgents() {
			return this.agents;
		}

		public void setAgents(List<Agent> agents) {
			this.agents = agents;
		}

		public List<SkillGroup> getSkillGroups() {
			return this.skillGroups;
		}

		public void setSkillGroups(List<SkillGroup> skillGroups) {
			this.skillGroups = skillGroups;
		}

		public List<Reviewer> getReviewers() {
			return this.reviewers;
		}

		public void setReviewers(List<Reviewer> reviewers) {
			this.reviewers = reviewers;
		}

		public static class Agent {

			private String agentId;

			private String agentName;

			public String getAgentId() {
				return this.agentId;
			}

			public void setAgentId(String agentId) {
				this.agentId = agentId;
			}

			public String getAgentName() {
				return this.agentName;
			}

			public void setAgentName(String agentName) {
				this.agentName = agentName;
			}
		}

		public static class SkillGroup {

			private String skillId;

			private String skillName;

			public String getSkillId() {
				return this.skillId;
			}

			public void setSkillId(String skillId) {
				this.skillId = skillId;
			}

			public String getSkillName() {
				return this.skillName;
			}

			public void setSkillName(String skillName) {
				this.skillName = skillName;
			}
		}

		public static class Reviewer {

			private String reviewerId;

			private String reviewerName;

			public String getReviewerId() {
				return this.reviewerId;
			}

			public void setReviewerId(String reviewerId) {
				this.reviewerId = reviewerId;
			}

			public String getReviewerName() {
				return this.reviewerName;
			}

			public void setReviewerName(String reviewerName) {
				this.reviewerName = reviewerName;
			}
		}
	}

	@Override
	public ListTaskAssignRulesResponse getInstance(UnmarshallerContext context) {
		return	ListTaskAssignRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
