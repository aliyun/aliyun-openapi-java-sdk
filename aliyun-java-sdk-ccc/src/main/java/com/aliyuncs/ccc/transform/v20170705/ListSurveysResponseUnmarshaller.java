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

	public static ListSurveysResponse unmarshall(ListSurveysResponse listSurveysResponse, UnmarshallerContext context) {
		
		listSurveysResponse.setRequestId(context.stringValue("ListSurveysResponse.RequestId"));
		listSurveysResponse.setSuccess(context.booleanValue("ListSurveysResponse.Success"));
		listSurveysResponse.setCode(context.stringValue("ListSurveysResponse.Code"));
		listSurveysResponse.setMessage(context.stringValue("ListSurveysResponse.Message"));
		listSurveysResponse.setHttpStatusCode(context.integerValue("ListSurveysResponse.HttpStatusCode"));

		List<Survey> surveys = new ArrayList<Survey>();
		for (int i = 0; i < context.lengthValue("ListSurveysResponse.Surveys.Length"); i++) {
			Survey survey = new Survey();
			survey.setId(context.stringValue("ListSurveysResponse.Surveys["+ i +"].Id"));
			survey.setScenarioUuid(context.stringValue("ListSurveysResponse.Surveys["+ i +"].ScenarioUuid"));
			survey.setName(context.stringValue("ListSurveysResponse.Surveys["+ i +"].Name"));
			survey.setDescription(context.stringValue("ListSurveysResponse.Surveys["+ i +"].Description"));
			survey.setRole(context.stringValue("ListSurveysResponse.Surveys["+ i +"].Role"));
			survey.setRound(context.integerValue("ListSurveysResponse.Surveys["+ i +"].Round"));
			survey.setHotWords(context.stringValue("ListSurveysResponse.Surveys["+ i +"].HotWords"));
			survey.setSpeechOptimizationParam(context.stringValue("ListSurveysResponse.Surveys["+ i +"].SpeechOptimizationParam"));
			survey.setGlobalQuestions(context.stringValue("ListSurveysResponse.Surveys["+ i +"].GlobalQuestions"));

			Flow flow = new Flow();
			flow.setFlowId(context.stringValue("ListSurveysResponse.Surveys["+ i +"].Flow.FlowId"));
			flow.setIsPublished(context.booleanValue("ListSurveysResponse.Surveys["+ i +"].Flow.IsPublished"));
			flow.setFlowJson(context.stringValue("ListSurveysResponse.Surveys["+ i +"].Flow.FlowJson"));
			survey.setFlow(flow);

			AsrCustomModel asrCustomModel = new AsrCustomModel();
			asrCustomModel.setCorpora(context.stringValue("ListSurveysResponse.Surveys["+ i +"].AsrCustomModel.Corpora"));
			asrCustomModel.setCustomModelStatus(context.integerValue("ListSurveysResponse.Surveys["+ i +"].AsrCustomModel.CustomModelStatus"));
			survey.setAsrCustomModel(asrCustomModel);

			surveys.add(survey);
		}
		listSurveysResponse.setSurveys(surveys);
	 
	 	return listSurveysResponse;
	}
}