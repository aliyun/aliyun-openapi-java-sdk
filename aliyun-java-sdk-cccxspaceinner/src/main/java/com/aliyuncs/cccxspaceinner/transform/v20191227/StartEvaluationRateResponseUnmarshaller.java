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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import com.aliyuncs.cccxspaceinner.model.v20191227.StartEvaluationRateResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.StartEvaluationRateResponse.Data;
import com.aliyuncs.cccxspaceinner.model.v20191227.StartEvaluationRateResponse.Data.EvaluationInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartEvaluationRateResponseUnmarshaller {

	public static StartEvaluationRateResponse unmarshall(StartEvaluationRateResponse startEvaluationRateResponse, UnmarshallerContext _ctx) {
		
		startEvaluationRateResponse.setRequestId(_ctx.stringValue("StartEvaluationRateResponse.RequestId"));
		startEvaluationRateResponse.setMessage(_ctx.stringValue("StartEvaluationRateResponse.Message"));
		startEvaluationRateResponse.setCode(_ctx.stringValue("StartEvaluationRateResponse.Code"));
		startEvaluationRateResponse.setSuccess(_ctx.booleanValue("StartEvaluationRateResponse.Success"));

		Data data = new Data();
		data.setQuestions(_ctx.mapValue("StartEvaluationRateResponse.Data.Questions"));

		EvaluationInfo evaluationInfo = new EvaluationInfo();
		evaluationInfo.setStatus(_ctx.stringValue("StartEvaluationRateResponse.Data.EvaluationInfo.Status"));
		evaluationInfo.setPurpose(_ctx.stringValue("StartEvaluationRateResponse.Data.EvaluationInfo.Purpose"));
		evaluationInfo.setType(_ctx.stringValue("StartEvaluationRateResponse.Data.EvaluationInfo.Type"));
		evaluationInfo.setSenceId(_ctx.longValue("StartEvaluationRateResponse.Data.EvaluationInfo.SenceId"));
		evaluationInfo.setIsEmpty(_ctx.booleanValue("StartEvaluationRateResponse.Data.EvaluationInfo.IsEmpty"));
		evaluationInfo.setPriority(_ctx.integerValue("StartEvaluationRateResponse.Data.EvaluationInfo.Priority"));
		evaluationInfo.setIsAvailable(_ctx.booleanValue("StartEvaluationRateResponse.Data.EvaluationInfo.IsAvailable"));
		evaluationInfo.setCreator(_ctx.longValue("StartEvaluationRateResponse.Data.EvaluationInfo.Creator"));
		evaluationInfo.setRuleId(_ctx.longValue("StartEvaluationRateResponse.Data.EvaluationInfo.RuleId"));
		evaluationInfo.setLastModifier(_ctx.longValue("StartEvaluationRateResponse.Data.EvaluationInfo.LastModifier"));
		evaluationInfo.setExtMap(_ctx.mapValue("StartEvaluationRateResponse.Data.EvaluationInfo.ExtMap"));
		evaluationInfo.setIsSimpleEvaluation(_ctx.booleanValue("StartEvaluationRateResponse.Data.EvaluationInfo.IsSimpleEvaluation"));
		evaluationInfo.setDescription(_ctx.stringValue("StartEvaluationRateResponse.Data.EvaluationInfo.Description"));
		evaluationInfo.setTitle(_ctx.stringValue("StartEvaluationRateResponse.Data.EvaluationInfo.Title"));
		evaluationInfo.setExtAttrs(_ctx.stringValue("StartEvaluationRateResponse.Data.EvaluationInfo.ExtAttrs"));
		evaluationInfo.setId(_ctx.longValue("StartEvaluationRateResponse.Data.EvaluationInfo.Id"));
		evaluationInfo.setLanguageId(_ctx.integerValue("StartEvaluationRateResponse.Data.EvaluationInfo.LanguageId"));
		data.setEvaluationInfo(evaluationInfo);
		startEvaluationRateResponse.setData(data);
	 
	 	return startEvaluationRateResponse;
	}
}