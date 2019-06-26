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
import com.aliyuncs.qualitycheck.model.v20190115.ListTaskAssignRulesResponse.TaskAssignRuleInfo.SkillGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskAssignRulesResponseUnmarshaller {

	public static ListTaskAssignRulesResponse unmarshall(ListTaskAssignRulesResponse listTaskAssignRulesResponse, UnmarshallerContext context) {
		
		listTaskAssignRulesResponse.setRequestId(context.stringValue("ListTaskAssignRulesResponse.RequestId"));
		listTaskAssignRulesResponse.setSuccess(context.booleanValue("ListTaskAssignRulesResponse.Success"));
		listTaskAssignRulesResponse.setCode(context.stringValue("ListTaskAssignRulesResponse.Code"));
		listTaskAssignRulesResponse.setMessage(context.stringValue("ListTaskAssignRulesResponse.Message"));

		List<TaskAssignRuleInfo> data = new ArrayList<TaskAssignRuleInfo>();
		for (int i = 0; i < context.lengthValue("ListTaskAssignRulesResponse.Data.Length"); i++) {
			TaskAssignRuleInfo taskAssignRuleInfo = new TaskAssignRuleInfo();
			taskAssignRuleInfo.setRuleId(context.longValue("ListTaskAssignRulesResponse.Data["+ i +"].RuleId"));
			taskAssignRuleInfo.setEnabled(context.integerValue("ListTaskAssignRulesResponse.Data["+ i +"].Enabled"));
			taskAssignRuleInfo.setCallType(context.integerValue("ListTaskAssignRulesResponse.Data["+ i +"].CallType"));
			taskAssignRuleInfo.setPriority(context.integerValue("ListTaskAssignRulesResponse.Data["+ i +"].Priority"));
			taskAssignRuleInfo.setDurationMin(context.integerValue("ListTaskAssignRulesResponse.Data["+ i +"].DurationMin"));
			taskAssignRuleInfo.setDurationMax(context.integerValue("ListTaskAssignRulesResponse.Data["+ i +"].DurationMax"));
			taskAssignRuleInfo.setCreateTime(context.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].CreateTime"));
			taskAssignRuleInfo.setUpdateTime(context.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].UpdateTime"));
			taskAssignRuleInfo.setAgentsStr(context.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].AgentsStr"));
			taskAssignRuleInfo.setSkillGroupsStr(context.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].SkillGroupsStr"));

			List<Agent> agents = new ArrayList<Agent>();
			for (int j = 0; j < context.lengthValue("ListTaskAssignRulesResponse.Data["+ i +"].Agents.Length"); j++) {
				Agent agent = new Agent();
				agent.setAgentId(context.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].Agents["+ j +"].AgentId"));
				agent.setAgentName(context.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].Agents["+ j +"].AgentName"));

				agents.add(agent);
			}
			taskAssignRuleInfo.setAgents(agents);

			List<SkillGroup> skillGroups = new ArrayList<SkillGroup>();
			for (int j = 0; j < context.lengthValue("ListTaskAssignRulesResponse.Data["+ i +"].SkillGroups.Length"); j++) {
				SkillGroup skillGroup = new SkillGroup();
				skillGroup.setSkillId(context.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].SkillGroups["+ j +"].SkillId"));
				skillGroup.setSkillName(context.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].SkillGroups["+ j +"].SkillName"));

				skillGroups.add(skillGroup);
			}
			taskAssignRuleInfo.setSkillGroups(skillGroups);

			List<Reviewer> reviewers = new ArrayList<Reviewer>();
			for (int j = 0; j < context.lengthValue("ListTaskAssignRulesResponse.Data["+ i +"].Reviewers.Length"); j++) {
				Reviewer reviewer = new Reviewer();
				reviewer.setReviewerId(context.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].Reviewers["+ j +"].ReviewerId"));
				reviewer.setReviewerName(context.stringValue("ListTaskAssignRulesResponse.Data["+ i +"].Reviewers["+ j +"].ReviewerName"));

				reviewers.add(reviewer);
			}
			taskAssignRuleInfo.setReviewers(reviewers);

			data.add(taskAssignRuleInfo);
		}
		listTaskAssignRulesResponse.setData(data);
	 
	 	return listTaskAssignRulesResponse;
	}
}