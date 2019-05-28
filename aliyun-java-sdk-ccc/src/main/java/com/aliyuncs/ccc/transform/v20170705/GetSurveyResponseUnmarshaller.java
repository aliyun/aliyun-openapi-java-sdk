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

import com.aliyuncs.ccc.model.v20170705.GetSurveyResponse;
import com.aliyuncs.ccc.model.v20170705.GetSurveyResponse.Survey;
import com.aliyuncs.ccc.model.v20170705.GetSurveyResponse.Survey.AsrCustomModel;
import com.aliyuncs.ccc.model.v20170705.GetSurveyResponse.Survey.Flow;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSurveyResponseUnmarshaller {

	public static GetSurveyResponse unmarshall(GetSurveyResponse getSurveyResponse, UnmarshallerContext context) {
		
		getSurveyResponse.setRequestId(context.stringValue("GetSurveyResponse.RequestId"));
		getSurveyResponse.setSuccess(context.booleanValue("GetSurveyResponse.Success"));
		getSurveyResponse.setCode(context.stringValue("GetSurveyResponse.Code"));
		getSurveyResponse.setMessage(context.stringValue("GetSurveyResponse.Message"));
		getSurveyResponse.setHttpStatusCode(context.integerValue("GetSurveyResponse.HttpStatusCode"));

		Survey survey = new Survey();
		survey.setId(context.stringValue("GetSurveyResponse.Survey.Id"));
		survey.setScenarioUuid(context.stringValue("GetSurveyResponse.Survey.ScenarioUuid"));
		survey.setName(context.stringValue("GetSurveyResponse.Survey.Name"));
		survey.setDescription(context.stringValue("GetSurveyResponse.Survey.Description"));
		survey.setRole(context.stringValue("GetSurveyResponse.Survey.Role"));
		survey.setRound(context.integerValue("GetSurveyResponse.Survey.Round"));
		survey.setHotWords(context.stringValue("GetSurveyResponse.Survey.HotWords"));
		survey.setSpeechOptimizationParam(context.stringValue("GetSurveyResponse.Survey.SpeechOptimizationParam"));
		survey.setGlobalQuestions(context.stringValue("GetSurveyResponse.Survey.GlobalQuestions"));

		Flow flow = new Flow();
		flow.setFlowId(context.stringValue("GetSurveyResponse.Survey.Flow.FlowId"));
		flow.setIsPublished(context.booleanValue("GetSurveyResponse.Survey.Flow.IsPublished"));
		flow.setFlowJson(context.stringValue("GetSurveyResponse.Survey.Flow.FlowJson"));
		survey.setFlow(flow);

		AsrCustomModel asrCustomModel = new AsrCustomModel();
		asrCustomModel.setCorpora(context.stringValue("GetSurveyResponse.Survey.AsrCustomModel.Corpora"));
		asrCustomModel.setCustomModelStatus(context.integerValue("GetSurveyResponse.Survey.AsrCustomModel.CustomModelStatus"));
		survey.setAsrCustomModel(asrCustomModel);
		getSurveyResponse.setSurvey(survey);
	 
	 	return getSurveyResponse;
	}
}