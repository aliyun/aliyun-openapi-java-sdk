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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QueryTerrorismJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryTerrorismJobListResponse.TerrorismJob;
import com.aliyuncs.mts.model.v20140618.QueryTerrorismJobListResponse.TerrorismJob.CensorTerrorismResult;
import com.aliyuncs.mts.model.v20140618.QueryTerrorismJobListResponse.TerrorismJob.CensorTerrorismResult.Counter;
import com.aliyuncs.mts.model.v20140618.QueryTerrorismJobListResponse.TerrorismJob.CensorTerrorismResult.Top;
import com.aliyuncs.mts.model.v20140618.QueryTerrorismJobListResponse.TerrorismJob.Input;
import com.aliyuncs.mts.model.v20140618.QueryTerrorismJobListResponse.TerrorismJob.TerrorismConfig;
import com.aliyuncs.mts.model.v20140618.QueryTerrorismJobListResponse.TerrorismJob.TerrorismConfig.OutputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTerrorismJobListResponseUnmarshaller {

	public static QueryTerrorismJobListResponse unmarshall(QueryTerrorismJobListResponse queryTerrorismJobListResponse, UnmarshallerContext _ctx) {
		
		queryTerrorismJobListResponse.setRequestId(_ctx.stringValue("QueryTerrorismJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryTerrorismJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryTerrorismJobListResponse.NonExistIds["+ i +"]"));
		}
		queryTerrorismJobListResponse.setNonExistIds(nonExistIds);

		List<TerrorismJob> terrorismJobList = new ArrayList<TerrorismJob>();
		for (int i = 0; i < _ctx.lengthValue("QueryTerrorismJobListResponse.TerrorismJobList.Length"); i++) {
			TerrorismJob terrorismJob = new TerrorismJob();
			terrorismJob.setCreationTime(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].CreationTime"));
			terrorismJob.setState(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].State"));
			terrorismJob.setUserData(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].UserData"));
			terrorismJob.setCode(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].Code"));
			terrorismJob.setMessage(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].Message"));
			terrorismJob.setPipelineId(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].PipelineId"));
			terrorismJob.setId(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].Id"));

			CensorTerrorismResult censorTerrorismResult = new CensorTerrorismResult();
			censorTerrorismResult.setSuggestion(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].CensorTerrorismResult.Suggestion"));
			censorTerrorismResult.setAverageScore(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].CensorTerrorismResult.AverageScore"));
			censorTerrorismResult.setLabel(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].CensorTerrorismResult.Label"));
			censorTerrorismResult.setMaxScore(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].CensorTerrorismResult.MaxScore"));

			List<Top> terrorismTopList = new ArrayList<Top>();
			for (int j = 0; j < _ctx.lengthValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].CensorTerrorismResult.TerrorismTopList.Length"); j++) {
				Top top = new Top();
				top.setIndex(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].CensorTerrorismResult.TerrorismTopList["+ j +"].Index"));
				top.setScore(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].CensorTerrorismResult.TerrorismTopList["+ j +"].Score"));
				top.setTimestamp(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].CensorTerrorismResult.TerrorismTopList["+ j +"].Timestamp"));
				top.setObject(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].CensorTerrorismResult.TerrorismTopList["+ j +"].Object"));
				top.setLabel(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].CensorTerrorismResult.TerrorismTopList["+ j +"].Label"));

				terrorismTopList.add(top);
			}
			censorTerrorismResult.setTerrorismTopList(terrorismTopList);

			List<Counter> terrorismCounterList = new ArrayList<Counter>();
			for (int j = 0; j < _ctx.lengthValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].CensorTerrorismResult.TerrorismCounterList.Length"); j++) {
				Counter counter = new Counter();
				counter.setLabel(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].CensorTerrorismResult.TerrorismCounterList["+ j +"].Label"));
				counter.setCount(_ctx.integerValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].CensorTerrorismResult.TerrorismCounterList["+ j +"].Count"));

				terrorismCounterList.add(counter);
			}
			censorTerrorismResult.setTerrorismCounterList(terrorismCounterList);
			terrorismJob.setCensorTerrorismResult(censorTerrorismResult);

			TerrorismConfig terrorismConfig = new TerrorismConfig();
			terrorismConfig.setInterval(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].TerrorismConfig.Interval"));
			terrorismConfig.setBizType(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].TerrorismConfig.BizType"));

			OutputFile outputFile = new OutputFile();
			outputFile.setObject(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].TerrorismConfig.OutputFile.Object"));
			outputFile.setLocation(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].TerrorismConfig.OutputFile.Location"));
			outputFile.setBucket(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].TerrorismConfig.OutputFile.Bucket"));
			terrorismConfig.setOutputFile(outputFile);
			terrorismJob.setTerrorismConfig(terrorismConfig);

			Input input = new Input();
			input.setObject(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].Input.Object"));
			input.setLocation(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].Input.Location"));
			input.setBucket(_ctx.stringValue("QueryTerrorismJobListResponse.TerrorismJobList["+ i +"].Input.Bucket"));
			terrorismJob.setInput(input);

			terrorismJobList.add(terrorismJob);
		}
		queryTerrorismJobListResponse.setTerrorismJobList(terrorismJobList);
	 
	 	return queryTerrorismJobListResponse;
	}
}