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

	public static GetSurveyResponse unmarshall(GetSurveyResponse getSurveyResponse, UnmarshallerContext _ctx) {
		
		getSurveyResponse.setRequestId(_ctx.stringValue("GetSurveyResponse.RequestId"));
		getSurveyResponse.setSuccess(_ctx.booleanValue("GetSurveyResponse.Success"));
		getSurveyResponse.setCode(_ctx.stringValue("GetSurveyResponse.Code"));
		getSurveyResponse.setMessage(_ctx.stringValue("GetSurveyResponse.Message"));
		getSurveyResponse.setHttpStatusCode(_ctx.integerValue("GetSurveyResponse.HttpStatusCode"));

		Survey survey = new Survey();
		survey.setId(_ctx.stringValue("GetSurveyResponse.Survey.Id"));
		survey.setScenarioUuid(_ctx.stringValue("GetSurveyResponse.Survey.ScenarioUuid"));
		survey.setName(_ctx.stringValue("GetSurveyResponse.Survey.Name"));
		survey.setDescription(_ctx.stringValue("GetSurveyResponse.Survey.Description"));
		survey.setRole(_ctx.stringValue("GetSurveyResponse.Survey.Role"));
		survey.setRound(_ctx.integerValue("GetSurveyResponse.Survey.Round"));
		survey.setHotWords(_ctx.stringValue("GetSurveyResponse.Survey.HotWords"));
		survey.setSpeechOptimizationParam(_ctx.stringValue("GetSurveyResponse.Survey.SpeechOptimizationParam"));
		survey.setGlobalQuestions(_ctx.stringValue("GetSurveyResponse.Survey.GlobalQuestions"));

		Flow flow = new Flow();
		flow.setFlowId(_ctx.stringValue("GetSurveyResponse.Survey.Flow.FlowId"));
		flow.setIsPublished(_ctx.booleanValue("GetSurveyResponse.Survey.Flow.IsPublished"));
		flow.setFlowJson(_ctx.stringValue("GetSurveyResponse.Survey.Flow.FlowJson"));
		survey.setFlow(flow);

		AsrCustomModel asrCustomModel = new AsrCustomModel();
		asrCustomModel.setCorpora(_ctx.stringValue("GetSurveyResponse.Survey.AsrCustomModel.Corpora"));
		asrCustomModel.setCustomModelStatus(_ctx.integerValue("GetSurveyResponse.Survey.AsrCustomModel.CustomModelStatus"));
		survey.setAsrCustomModel(asrCustomModel);
		getSurveyResponse.setSurvey(survey);
	 
	 	return getSurveyResponse;
	}
}