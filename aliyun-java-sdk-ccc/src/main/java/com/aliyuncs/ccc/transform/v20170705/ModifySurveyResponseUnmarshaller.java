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

	public static ModifySurveyResponse unmarshall(ModifySurveyResponse modifySurveyResponse, UnmarshallerContext _ctx) {
		
		modifySurveyResponse.setRequestId(_ctx.stringValue("ModifySurveyResponse.RequestId"));
		modifySurveyResponse.setSuccess(_ctx.booleanValue("ModifySurveyResponse.Success"));
		modifySurveyResponse.setCode(_ctx.stringValue("ModifySurveyResponse.Code"));
		modifySurveyResponse.setMessage(_ctx.stringValue("ModifySurveyResponse.Message"));
		modifySurveyResponse.setHttpStatusCode(_ctx.integerValue("ModifySurveyResponse.HttpStatusCode"));

		Survey survey = new Survey();
		survey.setId(_ctx.stringValue("ModifySurveyResponse.Survey.Id"));
		survey.setScenarioUuid(_ctx.stringValue("ModifySurveyResponse.Survey.ScenarioUuid"));
		survey.setName(_ctx.stringValue("ModifySurveyResponse.Survey.Name"));
		survey.setDescription(_ctx.stringValue("ModifySurveyResponse.Survey.Description"));
		survey.setRole(_ctx.stringValue("ModifySurveyResponse.Survey.Role"));
		survey.setRound(_ctx.integerValue("ModifySurveyResponse.Survey.Round"));
		survey.setHotWords(_ctx.stringValue("ModifySurveyResponse.Survey.HotWords"));
		survey.setSpeechOptimizationParam(_ctx.stringValue("ModifySurveyResponse.Survey.SpeechOptimizationParam"));
		survey.setGlobalQuestions(_ctx.stringValue("ModifySurveyResponse.Survey.GlobalQuestions"));

		Flow flow = new Flow();
		flow.setFlowId(_ctx.stringValue("ModifySurveyResponse.Survey.Flow.FlowId"));
		flow.setIsPublished(_ctx.booleanValue("ModifySurveyResponse.Survey.Flow.IsPublished"));
		flow.setFlowJson(_ctx.stringValue("ModifySurveyResponse.Survey.Flow.FlowJson"));
		survey.setFlow(flow);

		AsrCustomModel asrCustomModel = new AsrCustomModel();
		asrCustomModel.setCorpora(_ctx.stringValue("ModifySurveyResponse.Survey.AsrCustomModel.Corpora"));
		asrCustomModel.setCustomModelStatus(_ctx.integerValue("ModifySurveyResponse.Survey.AsrCustomModel.CustomModelStatus"));
		survey.setAsrCustomModel(asrCustomModel);
		modifySurveyResponse.setSurvey(survey);
	 
	 	return modifySurveyResponse;
	}
}