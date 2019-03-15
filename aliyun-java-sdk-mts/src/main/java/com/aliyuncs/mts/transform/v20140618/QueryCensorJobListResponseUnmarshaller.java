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

import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse.CensorJob;
import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse.CensorJob.CensorConfig;
import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse.CensorJob.CensorConfig.OutputFile;
import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse.CensorJob.CensorPornResult;
import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse.CensorJob.CensorPornResult.Counter;
import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse.CensorJob.CensorPornResult.Top;
import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse.CensorJob.CensorTerrorismResult;
import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse.CensorJob.CensorTerrorismResult.Counter1;
import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse.CensorJob.CensorTerrorismResult.Top2;
import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse.CensorJob.ImageCensorResult;
import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse.CensorJob.Input;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCensorJobListResponseUnmarshaller {

	public static QueryCensorJobListResponse unmarshall(QueryCensorJobListResponse queryCensorJobListResponse, UnmarshallerContext context) {
		
		queryCensorJobListResponse.setRequestId(context.stringValue("QueryCensorJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryCensorJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(context.stringValue("QueryCensorJobListResponse.NonExistIds["+ i +"]"));
		}
		queryCensorJobListResponse.setNonExistIds(nonExistIds);

		List<CensorJob> censorJobList = new ArrayList<CensorJob>();
		for (int i = 0; i < context.lengthValue("QueryCensorJobListResponse.CensorJobList.Length"); i++) {
			CensorJob censorJob = new CensorJob();
			censorJob.setId(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].Id"));
			censorJob.setUserData(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].UserData"));
			censorJob.setPipelineId(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].PipelineId"));
			censorJob.setState(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].State"));
			censorJob.setCode(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].Code"));
			censorJob.setMessage(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].Message"));
			censorJob.setCreationTime(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CreationTime"));
			censorJob.setTitleCensorResult(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].TitleCensorResult"));
			censorJob.setDescCensorResult(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].DescCensorResult"));
			censorJob.setBarrageCensorResult(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].BarrageCensorResult"));
			censorJob.setResultSaveObject(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].ResultSaveObject"));

			Input input = new Input();
			input.setBucket(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].Input.Bucket"));
			input.setLocation(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].Input.Location"));
			input.setObject(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].Input.Object"));
			censorJob.setInput(input);

			CensorConfig censorConfig = new CensorConfig();
			censorConfig.setInterval(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorConfig.Interval"));
			censorConfig.setBizType(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorConfig.BizType"));
			censorConfig.setSaveType(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorConfig.SaveType"));
			censorConfig.setScenes(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorConfig.Scenes"));

			OutputFile outputFile = new OutputFile();
			outputFile.setBucket(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorConfig.OutputFile.Bucket"));
			outputFile.setLocation(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorConfig.OutputFile.Location"));
			outputFile.setObject(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorConfig.OutputFile.Object"));
			censorConfig.setOutputFile(outputFile);
			censorJob.setCensorConfig(censorConfig);

			CensorPornResult censorPornResult = new CensorPornResult();
			censorPornResult.setLabel(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.Label"));
			censorPornResult.setSuggestion(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.Suggestion"));
			censorPornResult.setMaxScore(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.MaxScore"));
			censorPornResult.setAverageScore(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.AverageScore"));

			List<Counter> pornCounterList = new ArrayList<Counter>();
			for (int j = 0; j < context.lengthValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.PornCounterList.Length"); j++) {
				Counter counter = new Counter();
				counter.setCount(context.integerValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.PornCounterList["+ j +"].Count"));
				counter.setLabel(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.PornCounterList["+ j +"].Label"));

				pornCounterList.add(counter);
			}
			censorPornResult.setPornCounterList(pornCounterList);

			List<Top> pornTopList = new ArrayList<Top>();
			for (int j = 0; j < context.lengthValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.PornTopList.Length"); j++) {
				Top top = new Top();
				top.setLabel(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Label"));
				top.setScore(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Score"));
				top.setTimestamp(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Timestamp"));
				top.setIndex(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Index"));
				top.setObject(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Object"));

				pornTopList.add(top);
			}
			censorPornResult.setPornTopList(pornTopList);
			censorJob.setCensorPornResult(censorPornResult);

			CensorTerrorismResult censorTerrorismResult = new CensorTerrorismResult();
			censorTerrorismResult.setLabel(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.Label"));
			censorTerrorismResult.setSuggestion(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.Suggestion"));
			censorTerrorismResult.setMaxScore(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.MaxScore"));
			censorTerrorismResult.setAverageScore(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.AverageScore"));

			List<Counter1> terrorismCounterList = new ArrayList<Counter1>();
			for (int j = 0; j < context.lengthValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.TerrorismCounterList.Length"); j++) {
				Counter1 counter1 = new Counter1();
				counter1.setCount(context.integerValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.TerrorismCounterList["+ j +"].Count"));
				counter1.setLabel(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.TerrorismCounterList["+ j +"].Label"));

				terrorismCounterList.add(counter1);
			}
			censorTerrorismResult.setTerrorismCounterList(terrorismCounterList);

			List<Top2> terrorismTopList = new ArrayList<Top2>();
			for (int j = 0; j < context.lengthValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.TerrorismTopList.Length"); j++) {
				Top2 top2 = new Top2();
				top2.setLabel(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.TerrorismTopList["+ j +"].Label"));
				top2.setScore(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.TerrorismTopList["+ j +"].Score"));
				top2.setTimestamp(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.TerrorismTopList["+ j +"].Timestamp"));
				top2.setIndex(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.TerrorismTopList["+ j +"].Index"));
				top2.setObject(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.TerrorismTopList["+ j +"].Object"));

				terrorismTopList.add(top2);
			}
			censorTerrorismResult.setTerrorismTopList(terrorismTopList);
			censorJob.setCensorTerrorismResult(censorTerrorismResult);

			List<ImageCensorResult> imageCensorResults = new ArrayList<ImageCensorResult>();
			for (int j = 0; j < context.lengthValue("QueryCensorJobListResponse.CensorJobList["+ i +"].ImageCensorResults.Length"); j++) {
				ImageCensorResult imageCensorResult = new ImageCensorResult();
				imageCensorResult.setImageLocation(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].ImageCensorResults["+ j +"].ImageLocation"));
				imageCensorResult.setImageBucket(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].ImageCensorResults["+ j +"].ImageBucket"));
				imageCensorResult.setImageObject(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].ImageCensorResults["+ j +"].ImageObject"));
				imageCensorResult.setResult(context.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].ImageCensorResults["+ j +"].Result"));

				imageCensorResults.add(imageCensorResult);
			}
			censorJob.setImageCensorResults(imageCensorResults);

			censorJobList.add(censorJob);
		}
		queryCensorJobListResponse.setCensorJobList(censorJobList);
	 
	 	return queryCensorJobListResponse;
	}
}