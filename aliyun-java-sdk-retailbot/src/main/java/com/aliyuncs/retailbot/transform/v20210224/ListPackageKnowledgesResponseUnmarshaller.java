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

import com.aliyuncs.retailbot.model.v20210224.ListPackageKnowledgesResponse;
import com.aliyuncs.retailbot.model.v20210224.ListPackageKnowledgesResponse.Knowledge;
import com.aliyuncs.retailbot.model.v20210224.ListPackageKnowledgesResponse.Knowledge.SimilarQuestion;
import com.aliyuncs.retailbot.model.v20210224.ListPackageKnowledgesResponse.Knowledge.Solution;
import com.aliyuncs.retailbot.model.v20210224.ListPackageKnowledgesResponse.Knowledge.Solution.Condition;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPackageKnowledgesResponseUnmarshaller {

	public static ListPackageKnowledgesResponse unmarshall(ListPackageKnowledgesResponse listPackageKnowledgesResponse, UnmarshallerContext _ctx) {
		
		listPackageKnowledgesResponse.setRequestId(_ctx.stringValue("ListPackageKnowledgesResponse.RequestId"));
		listPackageKnowledgesResponse.setSuccess(_ctx.booleanValue("ListPackageKnowledgesResponse.Success"));
		listPackageKnowledgesResponse.setCode(_ctx.stringValue("ListPackageKnowledgesResponse.Code"));
		listPackageKnowledgesResponse.setMessage(_ctx.stringValue("ListPackageKnowledgesResponse.Message"));

		List<Knowledge> knowledges = new ArrayList<Knowledge>();
		for (int i = 0; i < _ctx.lengthValue("ListPackageKnowledgesResponse.Knowledges.Length"); i++) {
			Knowledge knowledge = new Knowledge();
			knowledge.setKnowledgeId(_ctx.longValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].KnowledgeId"));
			knowledge.setKnowledgeTitle(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].KnowledgeTitle"));
			knowledge.setKnowledgeStatus(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].KnowledgeStatus"));
			knowledge.setSceneKey(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].SceneKey"));
			knowledge.setKnowledgeDescription(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].KnowledgeDescription"));
			knowledge.setCreateTime(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].CreateTime"));
			knowledge.setModifyTime(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].ModifyTime"));
			knowledge.setCreateUserId(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].CreateUserId"));
			knowledge.setModifyUserId(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].ModifyUserId"));

			List<SimilarQuestion> similarQuestions = new ArrayList<SimilarQuestion>();
			for (int j = 0; j < _ctx.lengthValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].SimilarQuestions.Length"); j++) {
				SimilarQuestion similarQuestion = new SimilarQuestion();
				similarQuestion.setSimilarQuestionId(_ctx.longValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].SimilarQuestions["+ j +"].SimilarQuestionId"));
				similarQuestion.setSimilarQuestionTitle(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].SimilarQuestions["+ j +"].SimilarQuestionTitle"));
				similarQuestion.setSimilarQuestionType(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].SimilarQuestions["+ j +"].SimilarQuestionType"));
				similarQuestion.setSimilarQuestionEffectType(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].SimilarQuestions["+ j +"].SimilarQuestionEffectType"));
				similarQuestion.setCreateTime(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].SimilarQuestions["+ j +"].CreateTime"));
				similarQuestion.setModifyTime(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].SimilarQuestions["+ j +"].ModifyTime"));
				similarQuestion.setCreateUserId(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].SimilarQuestions["+ j +"].CreateUserId"));
				similarQuestion.setModifyUserId(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].SimilarQuestions["+ j +"].ModifyUserId"));

				similarQuestions.add(similarQuestion);
			}
			knowledge.setSimilarQuestions(similarQuestions);

			List<Solution> solutions = new ArrayList<Solution>();
			for (int j = 0; j < _ctx.lengthValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].Solutions.Length"); j++) {
				Solution solution = new Solution();
				solution.setSolutionId(_ctx.longValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].SolutionId"));
				solution.setKnowledgeId(_ctx.longValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].KnowledgeId"));
				solution.setSolutionType(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].SolutionType"));
				solution.setSolutionSource(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].SolutionSource"));
				solution.setSolutionContent(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].SolutionContent"));
				solution.setExtraContent(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].ExtraContent"));

				List<Condition> conditions = new ArrayList<Condition>();
				for (int k = 0; k < _ctx.lengthValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].Conditions.Length"); k++) {
					Condition condition = new Condition();
					condition.setKnowledgeId(_ctx.longValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].Conditions["+ k +"].KnowledgeId"));
					condition.setSolutionId(_ctx.longValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].Conditions["+ k +"].SolutionId"));
					condition.setConditionType(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].Conditions["+ k +"].ConditionType"));
					condition.setConditionValue(_ctx.stringValue("ListPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].Conditions["+ k +"].ConditionValue"));

					conditions.add(condition);
				}
				solution.setConditions(conditions);

				solutions.add(solution);
			}
			knowledge.setSolutions(solutions);

			knowledges.add(knowledge);
		}
		listPackageKnowledgesResponse.setKnowledges(knowledges);
	 
	 	return listPackageKnowledgesResponse;
	}
}