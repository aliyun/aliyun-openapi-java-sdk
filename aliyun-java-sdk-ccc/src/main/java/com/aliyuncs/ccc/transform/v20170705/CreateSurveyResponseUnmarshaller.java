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

import com.aliyuncs.ccc.model.v20170705.CreateSurveyResponse;
import com.aliyuncs.ccc.model.v20170705.CreateSurveyResponse.Survey;
import com.aliyuncs.ccc.model.v20170705.CreateSurveyResponse.Survey.AsrCustomModel;
import com.aliyuncs.ccc.model.v20170705.CreateSurveyResponse.Survey.Flow;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSurveyResponseUnmarshaller {

	public static CreateSurveyResponse unmarshall(CreateSurveyResponse createSurveyResponse, UnmarshallerContext context) {
		
		createSurveyResponse.setRequestId(context.stringValue("CreateSurveyResponse.RequestId"));
		createSurveyResponse.setSuccess(context.booleanValue("CreateSurveyResponse.Success"));
		createSurveyResponse.setCode(context.stringValue("CreateSurveyResponse.Code"));
		createSurveyResponse.setMessage(context.stringValue("CreateSurveyResponse.Message"));
		createSurveyResponse.setHttpStatusCode(context.integerValue("CreateSurveyResponse.HttpStatusCode"));

		Survey survey = new Survey();
		survey.setId(context.stringValue("CreateSurveyResponse.Survey.Id"));
		survey.setScenarioUuid(context.stringValue("CreateSurveyResponse.Survey.ScenarioUuid"));
		survey.setName(context.stringValue("CreateSurveyResponse.Survey.Name"));
		survey.setDescription(context.stringValue("CreateSurveyResponse.Survey.Description"));
		survey.setRole(context.stringValue("CreateSurveyResponse.Survey.Role"));
		survey.setRound(context.integerValue("CreateSurveyResponse.Survey.Round"));
		survey.setHotWords(context.stringValue("CreateSurveyResponse.Survey.HotWords"));
		survey.setSpeechOptimizationParam(context.stringValue("CreateSurveyResponse.Survey.SpeechOptimizationParam"));
		survey.setGlobalQuestions(context.stringValue("CreateSurveyResponse.Survey.GlobalQuestions"));

		Flow flow = new Flow();
		flow.setFlowId(context.stringValue("CreateSurveyResponse.Survey.Flow.FlowId"));
		flow.setIsPublished(context.booleanValue("CreateSurveyResponse.Survey.Flow.IsPublished"));
		flow.setFlowJson(context.stringValue("CreateSurveyResponse.Survey.Flow.FlowJson"));
		survey.setFlow(flow);

		AsrCustomModel asrCustomModel = new AsrCustomModel();
		asrCustomModel.setCorpora(context.stringValue("CreateSurveyResponse.Survey.AsrCustomModel.Corpora"));
		asrCustomModel.setCustomModelStatus(context.integerValue("CreateSurveyResponse.Survey.AsrCustomModel.CustomModelStatus"));
		survey.setAsrCustomModel(asrCustomModel);
		createSurveyResponse.setSurvey(survey);
	 
	 	return createSurveyResponse;
	}
}