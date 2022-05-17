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

import com.aliyuncs.retailbot.model.v20210224.GetKnowledgeResponse;
import com.aliyuncs.retailbot.model.v20210224.GetKnowledgeResponse.Knowledge;
import com.aliyuncs.retailbot.model.v20210224.GetKnowledgeResponse.Knowledge.Category;
import com.aliyuncs.retailbot.model.v20210224.GetKnowledgeResponse.Knowledge.SimilarQuestion;
import com.aliyuncs.retailbot.model.v20210224.GetKnowledgeResponse.Knowledge.Solution;
import com.aliyuncs.retailbot.model.v20210224.GetKnowledgeResponse.Knowledge.Solution.Condition;
import com.aliyuncs.retailbot.model.v20210224.GetKnowledgeResponse.Knowledge.Solution.SolutionVariable;
import com.aliyuncs.retailbot.model.v20210224.GetKnowledgeResponse.Knowledge._Package;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetKnowledgeResponseUnmarshaller {

	public static GetKnowledgeResponse unmarshall(GetKnowledgeResponse getKnowledgeResponse, UnmarshallerContext _ctx) {
		
		getKnowledgeResponse.setRequestId(_ctx.stringValue("GetKnowledgeResponse.RequestId"));
		getKnowledgeResponse.setSuccess(_ctx.booleanValue("GetKnowledgeResponse.Success"));
		getKnowledgeResponse.setCode(_ctx.stringValue("GetKnowledgeResponse.Code"));
		getKnowledgeResponse.setMessage(_ctx.stringValue("GetKnowledgeResponse.Message"));

		Knowledge knowledge = new Knowledge();
		knowledge.setKnowledgeId(_ctx.longValue("GetKnowledgeResponse.Knowledge.KnowledgeId"));
		knowledge.setKnowledgeTitle(_ctx.stringValue("GetKnowledgeResponse.Knowledge.KnowledgeTitle"));
		knowledge.setKnowledgeStatus(_ctx.stringValue("GetKnowledgeResponse.Knowledge.KnowledgeStatus"));
		knowledge.setSceneKey(_ctx.stringValue("GetKnowledgeResponse.Knowledge.SceneKey"));
		knowledge.setKnowledgeDescription(_ctx.stringValue("GetKnowledgeResponse.Knowledge.KnowledgeDescription"));
		knowledge.setCreateTime(_ctx.stringValue("GetKnowledgeResponse.Knowledge.CreateTime"));
		knowledge.setCreateUserId(_ctx.stringValue("GetKnowledgeResponse.Knowledge.CreateUserId"));
		knowledge.setModifyUserId(_ctx.stringValue("GetKnowledgeResponse.Knowledge.ModifyUserId"));
		knowledge.setModifyTime(_ctx.stringValue("GetKnowledgeResponse.Knowledge.ModifyTime"));

		Category category = new Category();
		category.setCategoryId(_ctx.longValue("GetKnowledgeResponse.Knowledge.Category.CategoryId"));
		category.setParentCategoryId(_ctx.longValue("GetKnowledgeResponse.Knowledge.Category.ParentCategoryId"));
		category.setCategoryName(_ctx.stringValue("GetKnowledgeResponse.Knowledge.Category.CategoryName"));
		knowledge.setCategory(category);

		List<SimilarQuestion> similarQuestions = new ArrayList<SimilarQuestion>();
		for (int i = 0; i < _ctx.lengthValue("GetKnowledgeResponse.Knowledge.SimilarQuestions.Length"); i++) {
			SimilarQuestion similarQuestion = new SimilarQuestion();
			similarQuestion.setSimilarQuestionId(_ctx.longValue("GetKnowledgeResponse.Knowledge.SimilarQuestions["+ i +"].SimilarQuestionId"));
			similarQuestion.setSimilarQuestionTitle(_ctx.stringValue("GetKnowledgeResponse.Knowledge.SimilarQuestions["+ i +"].SimilarQuestionTitle"));
			similarQuestion.setSimilarQuestionType(_ctx.stringValue("GetKnowledgeResponse.Knowledge.SimilarQuestions["+ i +"].SimilarQuestionType"));
			similarQuestion.setSimilarQuestionEffectType(_ctx.stringValue("GetKnowledgeResponse.Knowledge.SimilarQuestions["+ i +"].SimilarQuestionEffectType"));
			similarQuestion.setCreateTime(_ctx.stringValue("GetKnowledgeResponse.Knowledge.SimilarQuestions["+ i +"].CreateTime"));
			similarQuestion.setModifyTime(_ctx.stringValue("GetKnowledgeResponse.Knowledge.SimilarQuestions["+ i +"].ModifyTime"));
			similarQuestion.setCreateUserId(_ctx.stringValue("GetKnowledgeResponse.Knowledge.SimilarQuestions["+ i +"].CreateUserId"));
			similarQuestion.setModifyUserId(_ctx.stringValue("GetKnowledgeResponse.Knowledge.SimilarQuestions["+ i +"].ModifyUserId"));

			similarQuestions.add(similarQuestion);
		}
		knowledge.setSimilarQuestions(similarQuestions);

		List<Solution> solutions = new ArrayList<Solution>();
		for (int i = 0; i < _ctx.lengthValue("GetKnowledgeResponse.Knowledge.Solutions.Length"); i++) {
			Solution solution = new Solution();
			solution.setSolutionId(_ctx.longValue("GetKnowledgeResponse.Knowledge.Solutions["+ i +"].SolutionId"));
			solution.setKnowledgeId(_ctx.longValue("GetKnowledgeResponse.Knowledge.Solutions["+ i +"].KnowledgeId"));
			solution.setSolutionType(_ctx.stringValue("GetKnowledgeResponse.Knowledge.Solutions["+ i +"].SolutionType"));
			solution.setSolutionSource(_ctx.stringValue("GetKnowledgeResponse.Knowledge.Solutions["+ i +"].SolutionSource"));
			solution.setSolutionContent(_ctx.stringValue("GetKnowledgeResponse.Knowledge.Solutions["+ i +"].SolutionContent"));
			solution.setExtraContent(_ctx.stringValue("GetKnowledgeResponse.Knowledge.Solutions["+ i +"].ExtraContent"));

			List<Condition> conditions = new ArrayList<Condition>();
			for (int j = 0; j < _ctx.lengthValue("GetKnowledgeResponse.Knowledge.Solutions["+ i +"].Conditions.Length"); j++) {
				Condition condition = new Condition();
				condition.setKnowledgeId(_ctx.longValue("GetKnowledgeResponse.Knowledge.Solutions["+ i +"].Conditions["+ j +"].KnowledgeId"));
				condition.setSolutionId(_ctx.longValue("GetKnowledgeResponse.Knowledge.Solutions["+ i +"].Conditions["+ j +"].SolutionId"));
				condition.setConditionType(_ctx.stringValue("GetKnowledgeResponse.Knowledge.Solutions["+ i +"].Conditions["+ j +"].ConditionType"));
				condition.setConditionValue(_ctx.stringValue("GetKnowledgeResponse.Knowledge.Solutions["+ i +"].Conditions["+ j +"].ConditionValue"));

				conditions.add(condition);
			}
			solution.setConditions(conditions);

			List<SolutionVariable> solutionVariables = new ArrayList<SolutionVariable>();
			for (int j = 0; j < _ctx.lengthValue("GetKnowledgeResponse.Knowledge.Solutions["+ i +"].SolutionVariables.Length"); j++) {
				SolutionVariable solutionVariable = new SolutionVariable();
				solutionVariable.setKnowledgeId(_ctx.longValue("GetKnowledgeResponse.Knowledge.Solutions["+ i +"].SolutionVariables["+ j +"].KnowledgeId"));
				solutionVariable.setSolutionId(_ctx.longValue("GetKnowledgeResponse.Knowledge.Solutions["+ i +"].SolutionVariables["+ j +"].SolutionId"));
				solutionVariable.setVariableName(_ctx.stringValue("GetKnowledgeResponse.Knowledge.Solutions["+ i +"].SolutionVariables["+ j +"].VariableName"));
				solutionVariable.setVariableType(_ctx.stringValue("GetKnowledgeResponse.Knowledge.Solutions["+ i +"].SolutionVariables["+ j +"].VariableType"));

				solutionVariables.add(solutionVariable);
			}
			solution.setSolutionVariables(solutionVariables);

			solutions.add(solution);
		}
		knowledge.setSolutions(solutions);

		List<_Package> packages = new ArrayList<_Package>();
		for (int i = 0; i < _ctx.lengthValue("GetKnowledgeResponse.Knowledge.Packages.Length"); i++) {
			_Package _package = new _Package();
			_package.setPackageName(_ctx.stringValue("GetKnowledgeResponse.Knowledge.Packages["+ i +"].PackageName"));
			_package.setPackageCode(_ctx.stringValue("GetKnowledgeResponse.Knowledge.Packages["+ i +"].PackageCode"));

			packages.add(_package);
		}
		knowledge.setPackages(packages);
		getKnowledgeResponse.setKnowledge(knowledge);
	 
	 	return getKnowledgeResponse;
	}
}