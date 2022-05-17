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

package com.aliyuncs.retailbot.transform.v20210224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailbot.model.v20210224.GetSolutionResponse;
import com.aliyuncs.retailbot.model.v20210224.GetSolutionResponse.Solution;
import com.aliyuncs.retailbot.model.v20210224.GetSolutionResponse.Solution.Condition;
import com.aliyuncs.retailbot.model.v20210224.GetSolutionResponse.Solution.SolutionVariable;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSolutionResponseUnmarshaller {

	public static GetSolutionResponse unmarshall(GetSolutionResponse getSolutionResponse, UnmarshallerContext _ctx) {
		
		getSolutionResponse.setRequestId(_ctx.stringValue("GetSolutionResponse.RequestId"));
		getSolutionResponse.setSuccess(_ctx.booleanValue("GetSolutionResponse.Success"));
		getSolutionResponse.setCode(_ctx.stringValue("GetSolutionResponse.Code"));
		getSolutionResponse.setMessage(_ctx.stringValue("GetSolutionResponse.Message"));

		Solution solution = new Solution();
		solution.setSolutionId(_ctx.longValue("GetSolutionResponse.Solution.SolutionId"));
		solution.setKnowledgeId(_ctx.longValue("GetSolutionResponse.Solution.KnowledgeId"));
		solution.setSolutionType(_ctx.stringValue("GetSolutionResponse.Solution.SolutionType"));
		solution.setSolutionSource(_ctx.stringValue("GetSolutionResponse.Solution.SolutionSource"));
		solution.setSolutionContent(_ctx.stringValue("GetSolutionResponse.Solution.SolutionContent"));
		solution.setExtraContent(_ctx.stringValue("GetSolutionResponse.Solution.ExtraContent"));

		List<Condition> conditions = new ArrayList<Condition>();
		for (int i = 0; i < _ctx.lengthValue("GetSolutionResponse.Solution.Conditions.Length"); i++) {
			Condition condition = new Condition();
			condition.setKnowledgeId(_ctx.longValue("GetSolutionResponse.Solution.Conditions["+ i +"].KnowledgeId"));
			condition.setSolutionId(_ctx.longValue("GetSolutionResponse.Solution.Conditions["+ i +"].SolutionId"));
			condition.setConditionType(_ctx.stringValue("GetSolutionResponse.Solution.Conditions["+ i +"].ConditionType"));
			condition.setConditionValue(_ctx.stringValue("GetSolutionResponse.Solution.Conditions["+ i +"].ConditionValue"));

			conditions.add(condition);
		}
		solution.setConditions(conditions);

		List<SolutionVariable> solutionVariables = new ArrayList<SolutionVariable>();
		for (int i = 0; i < _ctx.lengthValue("GetSolutionResponse.Solution.SolutionVariables.Length"); i++) {
			SolutionVariable solutionVariable = new SolutionVariable();
			solutionVariable.setKnowledgeId(_ctx.longValue("GetSolutionResponse.Solution.SolutionVariables["+ i +"].KnowledgeId"));
			solutionVariable.setSolutionId(_ctx.longValue("GetSolutionResponse.Solution.SolutionVariables["+ i +"].SolutionId"));
			solutionVariable.setVariableName(_ctx.stringValue("GetSolutionResponse.Solution.SolutionVariables["+ i +"].VariableName"));
			solutionVariable.setVariableType(_ctx.stringValue("GetSolutionResponse.Solution.SolutionVariables["+ i +"].VariableType"));

			solutionVariables.add(solutionVariable);
		}
		solution.setSolutionVariables(solutionVariables);
		getSolutionResponse.setSolution(solution);
	 
	 	return getSolutionResponse;
	}
}