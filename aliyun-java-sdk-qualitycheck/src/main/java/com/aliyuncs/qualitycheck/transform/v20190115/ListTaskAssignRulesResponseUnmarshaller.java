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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.ListTaskAssignRulesResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ListTaskAssignRulesResponse.TaskAssignRuleInfo;
import com.aliyuncs.qualitycheck.model.v20190115.ListTaskAssignRulesResponse.TaskAssignRuleInfo.Agent;
import com.aliyuncs.qualitycheck.model.v20190115.ListTaskAssignRulesResponse.TaskAssignRuleInfo.Reviewer;
import com.aliyuncs.qualitycheck.model.v20190115.ListTaskAssignRulesResponse.TaskAssignRuleInfo.RuleBasicInfo;
import com.aliyuncs.qualitycheck.model.v20190115.ListTaskAssignRulesResponse.TaskAssignRuleInfo.SamplingMode;
import com.aliyuncs.qualitycheck.model.v20190115.ListTaskAssignRulesResponse.TaskAssignRuleInfo.SamplingMode.SamplingModeAgent;
import com.aliyuncs.qualitycheck.model.v20190115.ListTaskAssignRulesResponse.TaskAssignRuleInfo.SkillGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskAssignRulesResponseUnmarshaller {

	public static ListTaskAssignRulesResponse unmarshall(ListTaskAssignRulesResponse listTaskAssignRulesResponse, UnmarshallerContext _ctx) {
		
		listTaskAssignRulesResponse.setRequestId(_ctx.stringValue("ListTaskAssignRulesResponse.RequestId"));
		listTaskAssignRulesResponse.setSuccess(_ctx.booleanValue("ListTaskAssignRulesResponse.Success"));
		listTaskAssignRulesResponse.setCode(_ctx.stringValue("ListTaskAssignRulesResponse.Code"));
		listTaskAssignRulesResponse.setMessage(_ctx.stringValue("ListTaskAssignRulesResponse.Message"));
		listTaskAssignRulesResponse.setPageNumber(_ctx.integerValue("ListTaskAssignRulesResponse.PageNumber"));
		listTaskAssignRulesResponse.setPageSize(_ctx.integerValue("ListTaskAssignRulesResponse.PageSize"));
		listTaskAssignRulesResponse.setCount(_ctx.integerValue("ListTaskAssignRulesResponse.Count"));

		List<TaskAssignRuleInfo> data = new ArrayList<TaskAssignRuleInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListTaskAssignRulesResponse.Data.Length"); i++) {
			TaskAssignRuleInfo taskAssignRuleInfo = new TaskAssignRuleInfo();
			taskAssignRuleInfo.setRuleId(_ctx.longValue("ListTaskAssignRulesResponse.Data["+ i +"].RuleId"));
			taskAssignRuleInfo.setEnabled(_ctx.integerValue("ListTaskAssignRulesResponse.Data["+ i +"].Enabled"));
			taskAssignRuleInfo.setCallType(_ctx.integerValue("ListTaskAssignRulesResponse.Data["+ i +"].CallType"));
			taskAssignRuleInfo.setPriority(_ctx.integerValue("ListTaskAssignRulesResponse.Data["+ i +"].Priority"));
			taskAssignRuleInfo.setDurationMin(_ctx.integerValue("ListTaskAssignRulesResponse.Data["+ i +"].DurationMin"));
			taskAssignRuleInfo.setDurationMax(_ctx.integerValue("ListTaskAssignRulesResponse.Data["+ i +"].DurationMax"));
			taskAssignRuleInfo.setCreateTime(_ctx.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].CreateTime"));
			taskAssignRuleInfo.setUpdateTime(_ctx.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].UpdateTime"));
			taskAssignRuleInfo.setAgentsStr(_ctx.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].AgentsStr"));
			taskAssignRuleInfo.setSkillGroupsStr(_ctx.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].SkillGroupsStr"));
			taskAssignRuleInfo.setCallTimeStart(_ctx.longValue("ListTaskAssignRulesResponse.Data["+ i +"].CallTimeStart"));
			taskAssignRuleInfo.setCallTimeEnd(_ctx.longValue("ListTaskAssignRulesResponse.Data["+ i +"].CallTimeEnd"));
			taskAssignRuleInfo.setAssignmentType(_ctx.integerValue("ListTaskAssignRulesResponse.Data["+ i +"].AssignmentType"));
			taskAssignRuleInfo.setRuleName(_ctx.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].RuleName"));

			SamplingMode samplingMode = new SamplingMode();
			samplingMode.setDimension(_ctx.integerValue("ListTaskAssignRulesResponse.Data["+ i +"].SamplingMode.Dimension"));
			samplingMode.setProportion(_ctx.floatValue("ListTaskAssignRulesResponse.Data["+ i +"].SamplingMode.Proportion"));
			samplingMode.setLimit(_ctx.integerValue("ListTaskAssignRulesResponse.Data["+ i +"].SamplingMode.Limit"));
			samplingMode.setNumberOfDraws(_ctx.integerValue("ListTaskAssignRulesResponse.Data["+ i +"].SamplingMode.NumberOfDraws"));
			samplingMode.setAnyNumberOfDraws(_ctx.integerValue("ListTaskAssignRulesResponse.Data["+ i +"].SamplingMode.AnyNumberOfDraws"));
			samplingMode.setDesignated(_ctx.booleanValue("ListTaskAssignRulesResponse.Data["+ i +"].SamplingMode.Designated"));
			samplingMode.setRandomInspectionNumber(_ctx.integerValue("ListTaskAssignRulesResponse.Data["+ i +"].SamplingMode.RandomInspectionNumber"));

			List<SamplingModeAgent> samplingModeAgents = new ArrayList<SamplingModeAgent>();
			for (int j = 0; j < _ctx.lengthValue("ListTaskAssignRulesResponse.Data["+ i +"].SamplingMode.SamplingModeAgents.Length"); j++) {
				SamplingModeAgent samplingModeAgent = new SamplingModeAgent();
				samplingModeAgent.setAgentId(_ctx.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].SamplingMode.SamplingModeAgents["+ j +"].AgentId"));
				samplingModeAgent.setAgentName(_ctx.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].SamplingMode.SamplingModeAgents["+ j +"].AgentName"));

				samplingModeAgents.add(samplingModeAgent);
			}
			samplingMode.setSamplingModeAgents(samplingModeAgents);
			taskAssignRuleInfo.setSamplingMode(samplingMode);

			List<Agent> agents = new ArrayList<Agent>();
			for (int j = 0; j < _ctx.lengthValue("ListTaskAssignRulesResponse.Data["+ i +"].Agents.Length"); j++) {
				Agent agent = new Agent();
				agent.setAgentId(_ctx.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].Agents["+ j +"].AgentId"));
				agent.setAgentName(_ctx.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].Agents["+ j +"].AgentName"));

				agents.add(agent);
			}
			taskAssignRuleInfo.setAgents(agents);

			List<SkillGroup> skillGroups = new ArrayList<SkillGroup>();
			for (int j = 0; j < _ctx.lengthValue("ListTaskAssignRulesResponse.Data["+ i +"].SkillGroups.Length"); j++) {
				SkillGroup skillGroup = new SkillGroup();
				skillGroup.setSkillId(_ctx.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].SkillGroups["+ j +"].SkillId"));
				skillGroup.setSkillName(_ctx.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].SkillGroups["+ j +"].SkillName"));

				skillGroups.add(skillGroup);
			}
			taskAssignRuleInfo.setSkillGroups(skillGroups);

			List<Reviewer> reviewers = new ArrayList<Reviewer>();
			for (int j = 0; j < _ctx.lengthValue("ListTaskAssignRulesResponse.Data["+ i +"].Reviewers.Length"); j++) {
				Reviewer reviewer = new Reviewer();
				reviewer.setReviewerId(_ctx.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].Reviewers["+ j +"].ReviewerId"));
				reviewer.setReviewerName(_ctx.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].Reviewers["+ j +"].ReviewerName"));

				reviewers.add(reviewer);
			}
			taskAssignRuleInfo.setReviewers(reviewers);

			List<RuleBasicInfo> rules = new ArrayList<RuleBasicInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListTaskAssignRulesResponse.Data["+ i +"].Rules.Length"); j++) {
				RuleBasicInfo ruleBasicInfo = new RuleBasicInfo();
				ruleBasicInfo.setRid(_ctx.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].Rules["+ j +"].Rid"));
				ruleBasicInfo.setName(_ctx.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].Rules["+ j +"].Name"));

				rules.add(ruleBasicInfo);
			}
			taskAssignRuleInfo.setRules(rules);

			data.add(taskAssignRuleInfo);
		}
		listTaskAssignRulesResponse.setData(data);
	 
	 	return listTaskAssignRulesResponse;
	}
}