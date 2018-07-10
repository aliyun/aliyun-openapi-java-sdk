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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.ModifySurveyResponse;
import com.aliyuncs.ccc.model.v20170705.ModifySurveyResponse.Survey;
import com.aliyuncs.ccc.model.v20170705.ModifySurveyResponse.Survey.AsrCustomModel;
import com.aliyuncs.ccc.model.v20170705.ModifySurveyResponse.Survey.Flow;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifySurveyResponseUnmarshaller {

	public static ModifySurveyResponse unmarshall(ModifySurveyResponse modifySurveyResponse, UnmarshallerContext context) {
		
		modifySurveyResponse.setRequestId(context.stringValue("ModifySurveyResponse.RequestId"));
		modifySurveyResponse.setSuccess(context.booleanValue("ModifySurveyResponse.Success"));
		modifySurveyResponse.setCode(context.stringValue("ModifySurveyResponse.Code"));
		modifySurveyResponse.setMessage(context.stringValue("ModifySurveyResponse.Message"));
		modifySurveyResponse.setHttpStatusCode(context.integerValue("ModifySurveyResponse.HttpStatusCode"));

		Survey survey = new Survey();
		survey.setId(context.stringValue("ModifySurveyResponse.Survey.Id"));
		survey.setScenarioUuid(context.stringValue("ModifySurveyResponse.Survey.ScenarioUuid"));
		survey.setName(context.stringValue("ModifySurveyResponse.Survey.Name"));
		survey.setDescription(context.stringValue("ModifySurveyResponse.Survey.Description"));
		survey.setRole(context.stringValue("ModifySurveyResponse.Survey.Role"));
		survey.setRound(context.integerValue("ModifySurveyResponse.Survey.Round"));
		survey.setHotWords(context.stringValue("ModifySurveyResponse.Survey.HotWords"));
		survey.setSpeechOptimizationParam(context.stringValue("ModifySurveyResponse.Survey.SpeechOptimizationParam"));
		survey.setGlobalQuestions(context.stringValue("ModifySurveyResponse.Survey.GlobalQuestions"));

		Flow flow = new Flow();
		flow.setFlowId(context.stringValue("ModifySurveyResponse.Survey.Flow.FlowId"));
		flow.setIsPublished(context.booleanValue("ModifySurveyResponse.Survey.Flow.IsPublished"));
		flow.setFlowJson(context.stringValue("ModifySurveyResponse.Survey.Flow.FlowJson"));
		survey.setFlow(flow);

		AsrCustomModel asrCustomModel = new AsrCustomModel();
		asrCustomModel.setCorpora(context.stringValue("ModifySurveyResponse.Survey.AsrCustomModel.Corpora"));
		asrCustomModel.setCustomModelStatus(context.integerValue("ModifySurveyResponse.Survey.AsrCustomModel.CustomModelStatus"));
		survey.setAsrCustomModel(asrCustomModel);
		modifySurveyResponse.setSurvey(survey);
	 
	 	return modifySurveyResponse;
	}
}