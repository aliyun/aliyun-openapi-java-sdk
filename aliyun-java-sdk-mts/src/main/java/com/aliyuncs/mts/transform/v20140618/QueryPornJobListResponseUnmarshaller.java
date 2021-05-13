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

import com.aliyuncs.mts.model.v20140618.QueryPornJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryPornJobListResponse.PornJob;
import com.aliyuncs.mts.model.v20140618.QueryPornJobListResponse.PornJob.CensorPornResult;
import com.aliyuncs.mts.model.v20140618.QueryPornJobListResponse.PornJob.CensorPornResult.Counter;
import com.aliyuncs.mts.model.v20140618.QueryPornJobListResponse.PornJob.CensorPornResult.Top;
import com.aliyuncs.mts.model.v20140618.QueryPornJobListResponse.PornJob.Input;
import com.aliyuncs.mts.model.v20140618.QueryPornJobListResponse.PornJob.PornConfig;
import com.aliyuncs.mts.model.v20140618.QueryPornJobListResponse.PornJob.PornConfig.OutputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPornJobListResponseUnmarshaller {

	public static QueryPornJobListResponse unmarshall(QueryPornJobListResponse queryPornJobListResponse, UnmarshallerContext _ctx) {
		
		queryPornJobListResponse.setRequestId(_ctx.stringValue("QueryPornJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryPornJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryPornJobListResponse.NonExistIds["+ i +"]"));
		}
		queryPornJobListResponse.setNonExistIds(nonExistIds);

		List<PornJob> pornJobList = new ArrayList<PornJob>();
		for (int i = 0; i < _ctx.lengthValue("QueryPornJobListResponse.PornJobList.Length"); i++) {
			PornJob pornJob = new PornJob();
			pornJob.setCreationTime(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CreationTime"));
			pornJob.setState(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].State"));
			pornJob.setUserData(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].UserData"));
			pornJob.setCode(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].Code"));
			pornJob.setMessage(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].Message"));
			pornJob.setPipelineId(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].PipelineId"));
			pornJob.setId(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].Id"));

			PornConfig pornConfig = new PornConfig();
			pornConfig.setInterval(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].PornConfig.Interval"));
			pornConfig.setBizType(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].PornConfig.BizType"));

			OutputFile outputFile = new OutputFile();
			outputFile.setObject(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].PornConfig.OutputFile.Object"));
			outputFile.setLocation(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].PornConfig.OutputFile.Location"));
			outputFile.setBucket(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].PornConfig.OutputFile.Bucket"));
			pornConfig.setOutputFile(outputFile);
			pornJob.setPornConfig(pornConfig);

			CensorPornResult censorPornResult = new CensorPornResult();
			censorPornResult.setSuggestion(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.Suggestion"));
			censorPornResult.setAverageScore(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.AverageScore"));
			censorPornResult.setLabel(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.Label"));
			censorPornResult.setMaxScore(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.MaxScore"));

			List<Counter> pornCounterList = new ArrayList<Counter>();
			for (int j = 0; j < _ctx.lengthValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.PornCounterList.Length"); j++) {
				Counter counter = new Counter();
				counter.setLabel(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.PornCounterList["+ j +"].Label"));
				counter.setCount(_ctx.integerValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.PornCounterList["+ j +"].Count"));

				pornCounterList.add(counter);
			}
			censorPornResult.setPornCounterList(pornCounterList);

			List<Top> pornTopList = new ArrayList<Top>();
			for (int j = 0; j < _ctx.lengthValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.PornTopList.Length"); j++) {
				Top top = new Top();
				top.setIndex(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Index"));
				top.setScore(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Score"));
				top.setTimestamp(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Timestamp"));
				top.setObject(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Object"));
				top.setLabel(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Label"));

				pornTopList.add(top);
			}
			censorPornResult.setPornTopList(pornTopList);
			pornJob.setCensorPornResult(censorPornResult);

			Input input = new Input();
			input.setObject(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].Input.Object"));
			input.setLocation(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].Input.Location"));
			input.setBucket(_ctx.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].Input.Bucket"));
			pornJob.setInput(input);

			pornJobList.add(pornJob);
		}
		queryPornJobListResponse.setPornJobList(pornJobList);
	 
	 	return queryPornJobListResponse;
	}
}