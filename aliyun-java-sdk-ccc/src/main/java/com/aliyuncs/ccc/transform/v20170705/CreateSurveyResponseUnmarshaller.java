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

	public static CreateSurveyResponse unmarshall(CreateSurveyResponse createSurveyResponse, UnmarshallerContext _ctx) {
		
		createSurveyResponse.setRequestId(_ctx.stringValue("CreateSurveyResponse.RequestId"));
		createSurveyResponse.setSuccess(_ctx.booleanValue("CreateSurveyResponse.Success"));
		createSurveyResponse.setCode(_ctx.stringValue("CreateSurveyResponse.Code"));
		createSurveyResponse.setMessage(_ctx.stringValue("CreateSurveyResponse.Message"));
		createSurveyResponse.setHttpStatusCode(_ctx.integerValue("CreateSurveyResponse.HttpStatusCode"));

		Survey survey = new Survey();
		survey.setId(_ctx.stringValue("CreateSurveyResponse.Survey.Id"));
		survey.setScenarioUuid(_ctx.stringValue("CreateSurveyResponse.Survey.ScenarioUuid"));
		survey.setName(_ctx.stringValue("CreateSurveyResponse.Survey.Name"));
		survey.setDescription(_ctx.stringValue("CreateSurveyResponse.Survey.Description"));
		survey.setRole(_ctx.stringValue("CreateSurveyResponse.Survey.Role"));
		survey.setRound(_ctx.integerValue("CreateSurveyResponse.Survey.Round"));
		survey.setHotWords(_ctx.stringValue("CreateSurveyResponse.Survey.HotWords"));
		survey.setSpeechOptimizationParam(_ctx.stringValue("CreateSurveyResponse.Survey.SpeechOptimizationParam"));
		survey.setGlobalQuestions(_ctx.stringValue("CreateSurveyResponse.Survey.GlobalQuestions"));

		Flow flow = new Flow();
		flow.setFlowId(_ctx.stringValue("CreateSurveyResponse.Survey.Flow.FlowId"));
		flow.setIsPublished(_ctx.booleanValue("CreateSurveyResponse.Survey.Flow.IsPublished"));
		flow.setFlowJson(_ctx.stringValue("CreateSurveyResponse.Survey.Flow.FlowJson"));
		survey.setFlow(flow);

		AsrCustomModel asrCustomModel = new AsrCustomModel();
		asrCustomModel.setCorpora(_ctx.stringValue("CreateSurveyResponse.Survey.AsrCustomModel.Corpora"));
		asrCustomModel.setCustomModelStatus(_ctx.integerValue("CreateSurveyResponse.Survey.AsrCustomModel.CustomModelStatus"));
		survey.setAsrCustomModel(asrCustomModel);
		createSurveyResponse.setSurvey(survey);
	 
	 	return createSurveyResponse;
	}
}