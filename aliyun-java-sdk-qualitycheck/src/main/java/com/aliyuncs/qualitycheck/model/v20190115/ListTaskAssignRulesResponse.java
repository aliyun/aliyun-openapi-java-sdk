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

	private Integer pageNumber;

	private Integer pageSize;

	private Integer count;

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

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
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

		private Long callTimeStart;

		private Long callTimeEnd;

		private Integer assignmentType;

		private String ruleName;

		private List<Agent> agents;

		private List<SkillGroup> skillGroups;

		private List<Reviewer> reviewers;

		private List<RuleBasicInfo> rules;

		private SamplingMode samplingMode;

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

		public Long getCallTimeStart() {
			return this.callTimeStart;
		}

		public void setCallTimeStart(Long callTimeStart) {
			this.callTimeStart = callTimeStart;
		}

		public Long getCallTimeEnd() {
			return this.callTimeEnd;
		}

		public void setCallTimeEnd(Long callTimeEnd) {
			this.callTimeEnd = callTimeEnd;
		}

		public Integer getAssignmentType() {
			return this.assignmentType;
		}

		public void setAssignmentType(Integer assignmentType) {
			this.assignmentType = assignmentType;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
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

		public List<RuleBasicInfo> getRules() {
			return this.rules;
		}

		public void setRules(List<RuleBasicInfo> rules) {
			this.rules = rules;
		}

		public SamplingMode getSamplingMode() {
			return this.samplingMode;
		}

		public void setSamplingMode(SamplingMode samplingMode) {
			this.samplingMode = samplingMode;
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

		public static class RuleBasicInfo {

			private String rid;

			private String name;

			public String getRid() {
				return this.rid;
			}

			public void setRid(String rid) {
				this.rid = rid;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class SamplingMode {

			private Integer dimension;

			private Float proportion;

			private Integer limit;

			private Integer numberOfDraws;

			private Integer anyNumberOfDraws;

			private Boolean designated;

			private Integer randomInspectionNumber;

			private List<SamplingModeAgent> samplingModeAgents;

			public Integer getDimension() {
				return this.dimension;
			}

			public void setDimension(Integer dimension) {
				this.dimension = dimension;
			}

			public Float getProportion() {
				return this.proportion;
			}

			public void setProportion(Float proportion) {
				this.proportion = proportion;
			}

			public Integer getLimit() {
				return this.limit;
			}

			public void setLimit(Integer limit) {
				this.limit = limit;
			}

			public Integer getNumberOfDraws() {
				return this.numberOfDraws;
			}

			public void setNumberOfDraws(Integer numberOfDraws) {
				this.numberOfDraws = numberOfDraws;
			}

			public Integer getAnyNumberOfDraws() {
				return this.anyNumberOfDraws;
			}

			public void setAnyNumberOfDraws(Integer anyNumberOfDraws) {
				this.anyNumberOfDraws = anyNumberOfDraws;
			}

			public Boolean getDesignated() {
				return this.designated;
			}

			public void setDesignated(Boolean designated) {
				this.designated = designated;
			}

			public Integer getRandomInspectionNumber() {
				return this.randomInspectionNumber;
			}

			public void setRandomInspectionNumber(Integer randomInspectionNumber) {
				this.randomInspectionNumber = randomInspectionNumber;
			}

			public List<SamplingModeAgent> getSamplingModeAgents() {
				return this.samplingModeAgents;
			}

			public void setSamplingModeAgents(List<SamplingModeAgent> samplingModeAgents) {
				this.samplingModeAgents = samplingModeAgents;
			}

			public static class SamplingModeAgent {

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
		}
	}

	@Override
	public ListTaskAssignRulesResponse getInstance(UnmarshallerContext context) {
		return	ListTaskAssignRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
