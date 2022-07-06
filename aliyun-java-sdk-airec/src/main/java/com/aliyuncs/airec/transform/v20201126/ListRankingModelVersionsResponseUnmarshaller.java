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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListRankingModelVersionsResponse;
import com.aliyuncs.airec.model.v20201126.ListRankingModelVersionsResponse.ResultItem;
import com.aliyuncs.airec.model.v20201126.ListRankingModelVersionsResponse.ResultItem.RunResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRankingModelVersionsResponseUnmarshaller {

	public static ListRankingModelVersionsResponse unmarshall(ListRankingModelVersionsResponse listRankingModelVersionsResponse, UnmarshallerContext _ctx) {
		
		listRankingModelVersionsResponse.setRequestId(_ctx.stringValue("ListRankingModelVersionsResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRankingModelVersionsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setStatus(_ctx.stringValue("ListRankingModelVersionsResponse.result["+ i +"].Status"));
			resultItem.setRunTime(_ctx.stringValue("ListRankingModelVersionsResponse.result["+ i +"].RunTime"));
			resultItem.setRunLog(_ctx.stringValue("ListRankingModelVersionsResponse.result["+ i +"].RunLog"));
			resultItem.setTemplateName(_ctx.stringValue("ListRankingModelVersionsResponse.result["+ i +"].TemplateName"));
			resultItem.setName(_ctx.stringValue("ListRankingModelVersionsResponse.result["+ i +"].Name"));
			resultItem.setTemplateId(_ctx.stringValue("ListRankingModelVersionsResponse.result["+ i +"].TemplateId"));

			RunResult runResult = new RunResult();
			runResult.setAssessAuc(_ctx.stringValue("ListRankingModelVersionsResponse.result["+ i +"].RunResult.AssessAuc"));
			runResult.setAssessGauc(_ctx.stringValue("ListRankingModelVersionsResponse.result["+ i +"].RunResult.AssessGauc"));
			runResult.setAssessLoss(_ctx.stringValue("ListRankingModelVersionsResponse.result["+ i +"].RunResult.AssessLoss"));
			runResult.setTrainAuc(_ctx.stringValue("ListRankingModelVersionsResponse.result["+ i +"].RunResult.TrainAuc"));
			runResult.setTrainGauc(_ctx.stringValue("ListRankingModelVersionsResponse.result["+ i +"].RunResult.TrainGauc"));
			runResult.setTrainLoss(_ctx.stringValue("ListRankingModelVersionsResponse.result["+ i +"].RunResult.TrainLoss"));
			resultItem.setRunResult(runResult);

			result.add(resultItem);
		}
		listRankingModelVersionsResponse.setResult(result);
	 
	 	return listRankingModelVersionsResponse;
	}
}