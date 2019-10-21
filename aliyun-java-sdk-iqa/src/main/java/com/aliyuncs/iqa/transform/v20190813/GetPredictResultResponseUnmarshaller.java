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

package com.aliyuncs.iqa.transform.v20190813;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iqa.model.v20190813.GetPredictResultResponse;
import com.aliyuncs.iqa.model.v20190813.GetPredictResultResponse.PredictResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPredictResultResponseUnmarshaller {

	public static GetPredictResultResponse unmarshall(GetPredictResultResponse getPredictResultResponse, UnmarshallerContext _ctx) {
		
		getPredictResultResponse.setRequestId(_ctx.stringValue("GetPredictResultResponse.RequestId"));
		getPredictResultResponse.setProjectId(_ctx.stringValue("GetPredictResultResponse.ProjectId"));
		getPredictResultResponse.setQuestion(_ctx.stringValue("GetPredictResultResponse.Question"));
		getPredictResultResponse.setTopK(_ctx.integerValue("GetPredictResultResponse.TopK"));
		getPredictResultResponse.setTraceTag(_ctx.stringValue("GetPredictResultResponse.TraceTag"));
		getPredictResultResponse.setCostTime(_ctx.longValue("GetPredictResultResponse.CostTime"));
		getPredictResultResponse.setTrace(_ctx.stringValue("GetPredictResultResponse.Trace"));

		List<PredictResult> predictResults = new ArrayList<PredictResult>();
		for (int i = 0; i < _ctx.lengthValue("GetPredictResultResponse.PredictResults.Length"); i++) {
			PredictResult predictResult = new PredictResult();
			predictResult.setRank(_ctx.integerValue("GetPredictResultResponse.PredictResults["+ i +"].Rank"));
			predictResult.setQuestionId(_ctx.stringValue("GetPredictResultResponse.PredictResults["+ i +"].QuestionId"));
			predictResult.setQuestion(_ctx.stringValue("GetPredictResultResponse.PredictResults["+ i +"].Question"));
			predictResult.setScore(_ctx.floatValue("GetPredictResultResponse.PredictResults["+ i +"].Score"));
			predictResult.setAnswer(_ctx.stringValue("GetPredictResultResponse.PredictResults["+ i +"].Answer"));

			predictResults.add(predictResult);
		}
		getPredictResultResponse.setPredictResults(predictResults);
	 
	 	return getPredictResultResponse;
	}
}