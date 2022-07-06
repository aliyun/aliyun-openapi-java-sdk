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

package com.aliyuncs.airec.transform.v20201126;

import com.aliyuncs.airec.model.v20201126.GetRankingModelVersionResponse;
import com.aliyuncs.airec.model.v20201126.GetRankingModelVersionResponse.Result;
import com.aliyuncs.airec.model.v20201126.GetRankingModelVersionResponse.Result.RunResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRankingModelVersionResponseUnmarshaller {

	public static GetRankingModelVersionResponse unmarshall(GetRankingModelVersionResponse getRankingModelVersionResponse, UnmarshallerContext _ctx) {
		
		getRankingModelVersionResponse.setRequestId(_ctx.stringValue("GetRankingModelVersionResponse.requestId"));

		Result result = new Result();
		result.setStatus(_ctx.stringValue("GetRankingModelVersionResponse.result.Status"));
		result.setRunTime(_ctx.stringValue("GetRankingModelVersionResponse.result.RunTime"));
		result.setRunLog(_ctx.stringValue("GetRankingModelVersionResponse.result.RunLog"));
		result.setTemplateName(_ctx.stringValue("GetRankingModelVersionResponse.result.TemplateName"));
		result.setName(_ctx.stringValue("GetRankingModelVersionResponse.result.Name"));
		result.setTemplateId(_ctx.stringValue("GetRankingModelVersionResponse.result.TemplateId"));

		RunResult runResult = new RunResult();
		runResult.setAssessAuc(_ctx.stringValue("GetRankingModelVersionResponse.result.RunResult.AssessAuc"));
		runResult.setAssessGauc(_ctx.stringValue("GetRankingModelVersionResponse.result.RunResult.AssessGauc"));
		runResult.setAssessLoss(_ctx.stringValue("GetRankingModelVersionResponse.result.RunResult.AssessLoss"));
		runResult.setTrainAuc(_ctx.stringValue("GetRankingModelVersionResponse.result.RunResult.TrainAuc"));
		runResult.setTrainGauc(_ctx.stringValue("GetRankingModelVersionResponse.result.RunResult.TrainGauc"));
		runResult.setTrainLoss(_ctx.stringValue("GetRankingModelVersionResponse.result.RunResult.TrainLoss"));
		result.setRunResult(runResult);
		getRankingModelVersionResponse.setResult(result);
	 
	 	return getRankingModelVersionResponse;
	}
}