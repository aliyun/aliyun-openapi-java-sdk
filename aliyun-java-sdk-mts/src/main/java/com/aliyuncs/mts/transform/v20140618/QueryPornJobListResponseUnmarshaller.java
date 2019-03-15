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

	public static QueryPornJobListResponse unmarshall(QueryPornJobListResponse queryPornJobListResponse, UnmarshallerContext context) {
		
		queryPornJobListResponse.setRequestId(context.stringValue("QueryPornJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryPornJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(context.stringValue("QueryPornJobListResponse.NonExistIds["+ i +"]"));
		}
		queryPornJobListResponse.setNonExistIds(nonExistIds);

		List<PornJob> pornJobList = new ArrayList<PornJob>();
		for (int i = 0; i < context.lengthValue("QueryPornJobListResponse.PornJobList.Length"); i++) {
			PornJob pornJob = new PornJob();
			pornJob.setId(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].Id"));
			pornJob.setUserData(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].UserData"));
			pornJob.setPipelineId(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].PipelineId"));
			pornJob.setState(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].State"));
			pornJob.setCode(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].Code"));
			pornJob.setMessage(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].Message"));
			pornJob.setCreationTime(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CreationTime"));

			Input input = new Input();
			input.setBucket(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].Input.Bucket"));
			input.setLocation(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].Input.Location"));
			input.setObject(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].Input.Object"));
			pornJob.setInput(input);

			PornConfig pornConfig = new PornConfig();
			pornConfig.setInterval(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].PornConfig.Interval"));
			pornConfig.setBizType(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].PornConfig.BizType"));

			OutputFile outputFile = new OutputFile();
			outputFile.setBucket(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].PornConfig.OutputFile.Bucket"));
			outputFile.setLocation(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].PornConfig.OutputFile.Location"));
			outputFile.setObject(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].PornConfig.OutputFile.Object"));
			pornConfig.setOutputFile(outputFile);
			pornJob.setPornConfig(pornConfig);

			CensorPornResult censorPornResult = new CensorPornResult();
			censorPornResult.setLabel(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.Label"));
			censorPornResult.setSuggestion(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.Suggestion"));
			censorPornResult.setMaxScore(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.MaxScore"));
			censorPornResult.setAverageScore(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.AverageScore"));

			List<Counter> pornCounterList = new ArrayList<Counter>();
			for (int j = 0; j < context.lengthValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.PornCounterList.Length"); j++) {
				Counter counter = new Counter();
				counter.setCount(context.integerValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.PornCounterList["+ j +"].Count"));
				counter.setLabel(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.PornCounterList["+ j +"].Label"));

				pornCounterList.add(counter);
			}
			censorPornResult.setPornCounterList(pornCounterList);

			List<Top> pornTopList = new ArrayList<Top>();
			for (int j = 0; j < context.lengthValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.PornTopList.Length"); j++) {
				Top top = new Top();
				top.setLabel(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Label"));
				top.setScore(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Score"));
				top.setTimestamp(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Timestamp"));
				top.setIndex(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Index"));
				top.setObject(context.stringValue("QueryPornJobListResponse.PornJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Object"));

				pornTopList.add(top);
			}
			censorPornResult.setPornTopList(pornTopList);
			pornJob.setCensorPornResult(censorPornResult);

			pornJobList.add(pornJob);
		}
		queryPornJobListResponse.setPornJobList(pornJobList);
	 
	 	return queryPornJobListResponse;
	}
}