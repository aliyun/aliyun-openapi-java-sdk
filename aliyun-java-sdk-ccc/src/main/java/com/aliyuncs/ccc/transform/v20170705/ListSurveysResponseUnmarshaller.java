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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListSurveysResponse;
import com.aliyuncs.ccc.model.v20170705.ListSurveysResponse.Survey;
import com.aliyuncs.ccc.model.v20170705.ListSurveysResponse.Survey.AsrCustomModel;
import com.aliyuncs.ccc.model.v20170705.ListSurveysResponse.Survey.Flow;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSurveysResponseUnmarshaller {

	public static ListSurveysResponse unmarshall(ListSurveysResponse listSurveysResponse, UnmarshallerContext _ctx) {
		
		listSurveysResponse.setRequestId(_ctx.stringValue("ListSurveysResponse.RequestId"));
		listSurveysResponse.setSuccess(_ctx.booleanValue("ListSurveysResponse.Success"));
		listSurveysResponse.setCode(_ctx.stringValue("ListSurveysResponse.Code"));
		listSurveysResponse.setMessage(_ctx.stringValue("ListSurveysResponse.Message"));
		listSurveysResponse.setHttpStatusCode(_ctx.integerValue("ListSurveysResponse.HttpStatusCode"));

		List<Survey> surveys = new ArrayList<Survey>();
		for (int i = 0; i < _ctx.lengthValue("ListSurveysResponse.Surveys.Length"); i++) {
			Survey survey = new Survey();
			survey.setId(_ctx.stringValue("ListSurveysResponse.Surveys["+ i +"].Id"));
			survey.setScenarioUuid(_ctx.stringValue("ListSurveysResponse.Surveys["+ i +"].ScenarioUuid"));
			survey.setName(_ctx.stringValue("ListSurveysResponse.Surveys["+ i +"].Name"));
			survey.setDescription(_ctx.stringValue("ListSurveysResponse.Surveys["+ i +"].Description"));
			survey.setRole(_ctx.stringValue("ListSurveysResponse.Surveys["+ i +"].Role"));
			survey.setRound(_ctx.integerValue("ListSurveysResponse.Surveys["+ i +"].Round"));
			survey.setHotWords(_ctx.stringValue("ListSurveysResponse.Surveys["+ i +"].HotWords"));
			survey.setSpeechOptimizationParam(_ctx.stringValue("ListSurveysResponse.Surveys["+ i +"].SpeechOptimizationParam"));
			survey.setGlobalQuestions(_ctx.stringValue("ListSurveysResponse.Surveys["+ i +"].GlobalQuestions"));

			Flow flow = new Flow();
			flow.setFlowId(_ctx.stringValue("ListSurveysResponse.Surveys["+ i +"].Flow.FlowId"));
			flow.setIsPublished(_ctx.booleanValue("ListSurveysResponse.Surveys["+ i +"].Flow.IsPublished"));
			flow.setFlowJson(_ctx.stringValue("ListSurveysResponse.Surveys["+ i +"].Flow.FlowJson"));
			survey.setFlow(flow);

			AsrCustomModel asrCustomModel = new AsrCustomModel();
			asrCustomModel.setCorpora(_ctx.stringValue("ListSurveysResponse.Surveys["+ i +"].AsrCustomModel.Corpora"));
			asrCustomModel.setCustomModelStatus(_ctx.integerValue("ListSurveysResponse.Surveys["+ i +"].AsrCustomModel.CustomModelStatus"));
			survey.setAsrCustomModel(asrCustomModel);

			surveys.add(survey);
		}
		listSurveysResponse.setSurveys(surveys);
	 
	 	return listSurveysResponse;
	}
}