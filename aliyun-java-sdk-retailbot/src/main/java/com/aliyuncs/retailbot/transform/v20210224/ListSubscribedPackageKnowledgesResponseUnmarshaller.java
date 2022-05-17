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

import com.aliyuncs.retailbot.model.v20210224.ListSubscribedPackageKnowledgesResponse;
import com.aliyuncs.retailbot.model.v20210224.ListSubscribedPackageKnowledgesResponse.Knowledge;
import com.aliyuncs.retailbot.model.v20210224.ListSubscribedPackageKnowledgesResponse.Knowledge.SimilarQuestion;
import com.aliyuncs.retailbot.model.v20210224.ListSubscribedPackageKnowledgesResponse.Knowledge.Solution;
import com.aliyuncs.retailbot.model.v20210224.ListSubscribedPackageKnowledgesResponse.Knowledge.Solution.Condition;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSubscribedPackageKnowledgesResponseUnmarshaller {

	public static ListSubscribedPackageKnowledgesResponse unmarshall(ListSubscribedPackageKnowledgesResponse listSubscribedPackageKnowledgesResponse, UnmarshallerContext _ctx) {
		
		listSubscribedPackageKnowledgesResponse.setRequestId(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.RequestId"));
		listSubscribedPackageKnowledgesResponse.setSuccess(_ctx.booleanValue("ListSubscribedPackageKnowledgesResponse.Success"));
		listSubscribedPackageKnowledgesResponse.setCode(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Code"));
		listSubscribedPackageKnowledgesResponse.setMessage(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Message"));

		List<Knowledge> knowledges = new ArrayList<Knowledge>();
		for (int i = 0; i < _ctx.lengthValue("ListSubscribedPackageKnowledgesResponse.Knowledges.Length"); i++) {
			Knowledge knowledge = new Knowledge();
			knowledge.setKnowledgeId(_ctx.longValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].KnowledgeId"));
			knowledge.setKnowledgeTitle(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].KnowledgeTitle"));
			knowledge.setKnowledgeStatus(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].KnowledgeStatus"));
			knowledge.setKnowledgeDescription(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].KnowledgeDescription"));
			knowledge.setCreateTime(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].CreateTime"));
			knowledge.setModifyTime(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].ModifyTime"));
			knowledge.setCreateUserId(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].CreateUserId"));
			knowledge.setModifyUserId(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].ModifyUserId"));
			knowledge.setSceneKey(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].SceneKey"));

			List<SimilarQuestion> similarQuestions = new ArrayList<SimilarQuestion>();
			for (int j = 0; j < _ctx.lengthValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].SimilarQuestions.Length"); j++) {
				SimilarQuestion similarQuestion = new SimilarQuestion();
				similarQuestion.setSimilarQuestionId(_ctx.longValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].SimilarQuestions["+ j +"].SimilarQuestionId"));
				similarQuestion.setSimilarQuestionTitle(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].SimilarQuestions["+ j +"].SimilarQuestionTitle"));
				similarQuestion.setSimilarQuestionType(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].SimilarQuestions["+ j +"].SimilarQuestionType"));
				similarQuestion.setSimilarQuestionEffectType(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].SimilarQuestions["+ j +"].SimilarQuestionEffectType"));
				similarQuestion.setCreateTime(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].SimilarQuestions["+ j +"].CreateTime"));
				similarQuestion.setModifyTime(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].SimilarQuestions["+ j +"].ModifyTime"));
				similarQuestion.setCreateUserId(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].SimilarQuestions["+ j +"].CreateUserId"));
				similarQuestion.setModifyUserId(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].SimilarQuestions["+ j +"].ModifyUserId"));

				similarQuestions.add(similarQuestion);
			}
			knowledge.setSimilarQuestions(similarQuestions);

			List<Solution> solutions = new ArrayList<Solution>();
			for (int j = 0; j < _ctx.lengthValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].Solutions.Length"); j++) {
				Solution solution = new Solution();
				solution.setSolutionId(_ctx.longValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].SolutionId"));
				solution.setKnowledgeId(_ctx.longValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].KnowledgeId"));
				solution.setSolutionType(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].SolutionType"));
				solution.setSolutionSource(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].SolutionSource"));
				solution.setSolutionContent(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].SolutionContent"));
				solution.setExtraContent(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].ExtraContent"));

				List<Condition> conditions = new ArrayList<Condition>();
				for (int k = 0; k < _ctx.lengthValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].Conditions.Length"); k++) {
					Condition condition = new Condition();
					condition.setKnowledgeId(_ctx.longValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].Conditions["+ k +"].KnowledgeId"));
					condition.setSolutionId(_ctx.longValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].Conditions["+ k +"].SolutionId"));
					condition.setConditionType(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].Conditions["+ k +"].ConditionType"));
					condition.setConditionValue(_ctx.stringValue("ListSubscribedPackageKnowledgesResponse.Knowledges["+ i +"].Solutions["+ j +"].Conditions["+ k +"].ConditionValue"));

					conditions.add(condition);
				}
				solution.setConditions(conditions);

				solutions.add(solution);
			}
			knowledge.setSolutions(solutions);

			knowledges.add(knowledge);
		}
		listSubscribedPackageKnowledgesResponse.setKnowledges(knowledges);
	 
	 	return listSubscribedPackageKnowledgesResponse;
	}
}