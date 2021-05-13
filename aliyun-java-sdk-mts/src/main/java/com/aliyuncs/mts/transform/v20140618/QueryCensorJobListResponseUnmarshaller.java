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
import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse.CensorJob.CensorPornResult.Counter1;
import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse.CensorJob.CensorPornResult.Top2;
import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse.CensorJob.CensorTerrorismResult;
import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse.CensorJob.CensorTerrorismResult.Counter;
import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse.CensorJob.CensorTerrorismResult.Top;
import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse.CensorJob.ImageCensorResult;
import com.aliyuncs.mts.model.v20140618.QueryCensorJobListResponse.CensorJob.Input;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCensorJobListResponseUnmarshaller {

	public static QueryCensorJobListResponse unmarshall(QueryCensorJobListResponse queryCensorJobListResponse, UnmarshallerContext _ctx) {
		
		queryCensorJobListResponse.setRequestId(_ctx.stringValue("QueryCensorJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryCensorJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryCensorJobListResponse.NonExistIds["+ i +"]"));
		}
		queryCensorJobListResponse.setNonExistIds(nonExistIds);

		List<CensorJob> censorJobList = new ArrayList<CensorJob>();
		for (int i = 0; i < _ctx.lengthValue("QueryCensorJobListResponse.CensorJobList.Length"); i++) {
			CensorJob censorJob = new CensorJob();
			censorJob.setCreationTime(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CreationTime"));
			censorJob.setState(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].State"));
			censorJob.setTitleCensorResult(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].TitleCensorResult"));
			censorJob.setMessage(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].Message"));
			censorJob.setBarrageCensorResult(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].BarrageCensorResult"));
			censorJob.setDescCensorResult(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].DescCensorResult"));
			censorJob.setResultSaveObject(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].ResultSaveObject"));
			censorJob.setUserData(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].UserData"));
			censorJob.setCode(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].Code"));
			censorJob.setPipelineId(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].PipelineId"));
			censorJob.setId(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].Id"));

			CensorTerrorismResult censorTerrorismResult = new CensorTerrorismResult();
			censorTerrorismResult.setSuggestion(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.Suggestion"));
			censorTerrorismResult.setAverageScore(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.AverageScore"));
			censorTerrorismResult.setLabel(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.Label"));
			censorTerrorismResult.setMaxScore(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.MaxScore"));

			List<Top> terrorismTopList = new ArrayList<Top>();
			for (int j = 0; j < _ctx.lengthValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.TerrorismTopList.Length"); j++) {
				Top top = new Top();
				top.setIndex(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.TerrorismTopList["+ j +"].Index"));
				top.setScore(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.TerrorismTopList["+ j +"].Score"));
				top.setTimestamp(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.TerrorismTopList["+ j +"].Timestamp"));
				top.setObject(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.TerrorismTopList["+ j +"].Object"));
				top.setLabel(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.TerrorismTopList["+ j +"].Label"));

				terrorismTopList.add(top);
			}
			censorTerrorismResult.setTerrorismTopList(terrorismTopList);

			List<Counter> terrorismCounterList = new ArrayList<Counter>();
			for (int j = 0; j < _ctx.lengthValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.TerrorismCounterList.Length"); j++) {
				Counter counter = new Counter();
				counter.setLabel(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.TerrorismCounterList["+ j +"].Label"));
				counter.setCount(_ctx.integerValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorTerrorismResult.TerrorismCounterList["+ j +"].Count"));

				terrorismCounterList.add(counter);
			}
			censorTerrorismResult.setTerrorismCounterList(terrorismCounterList);
			censorJob.setCensorTerrorismResult(censorTerrorismResult);

			Input input = new Input();
			input.setObject(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].Input.Object"));
			input.setLocation(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].Input.Location"));
			input.setBucket(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].Input.Bucket"));
			censorJob.setInput(input);

			CensorConfig censorConfig = new CensorConfig();
			censorConfig.setInterval(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorConfig.Interval"));
			censorConfig.setSaveType(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorConfig.SaveType"));
			censorConfig.setScenes(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorConfig.Scenes"));
			censorConfig.setBizType(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorConfig.BizType"));

			OutputFile outputFile = new OutputFile();
			outputFile.setObject(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorConfig.OutputFile.Object"));
			outputFile.setLocation(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorConfig.OutputFile.Location"));
			outputFile.setBucket(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorConfig.OutputFile.Bucket"));
			censorConfig.setOutputFile(outputFile);
			censorJob.setCensorConfig(censorConfig);

			CensorPornResult censorPornResult = new CensorPornResult();
			censorPornResult.setSuggestion(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.Suggestion"));
			censorPornResult.setAverageScore(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.AverageScore"));
			censorPornResult.setLabel(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.Label"));
			censorPornResult.setMaxScore(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.MaxScore"));

			List<Counter1> pornCounterList = new ArrayList<Counter1>();
			for (int j = 0; j < _ctx.lengthValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.PornCounterList.Length"); j++) {
				Counter1 counter1 = new Counter1();
				counter1.setLabel(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.PornCounterList["+ j +"].Label"));
				counter1.setCount(_ctx.integerValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.PornCounterList["+ j +"].Count"));

				pornCounterList.add(counter1);
			}
			censorPornResult.setPornCounterList(pornCounterList);

			List<Top2> pornTopList = new ArrayList<Top2>();
			for (int j = 0; j < _ctx.lengthValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.PornTopList.Length"); j++) {
				Top2 top2 = new Top2();
				top2.setIndex(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Index"));
				top2.setScore(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Score"));
				top2.setTimestamp(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Timestamp"));
				top2.setObject(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Object"));
				top2.setLabel(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].CensorPornResult.PornTopList["+ j +"].Label"));

				pornTopList.add(top2);
			}
			censorPornResult.setPornTopList(pornTopList);
			censorJob.setCensorPornResult(censorPornResult);

			List<ImageCensorResult> imageCensorResults = new ArrayList<ImageCensorResult>();
			for (int j = 0; j < _ctx.lengthValue("QueryCensorJobListResponse.CensorJobList["+ i +"].ImageCensorResults.Length"); j++) {
				ImageCensorResult imageCensorResult = new ImageCensorResult();
				imageCensorResult.setImageBucket(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].ImageCensorResults["+ j +"].ImageBucket"));
				imageCensorResult.setResult(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].ImageCensorResults["+ j +"].Result"));
				imageCensorResult.setImageLocation(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].ImageCensorResults["+ j +"].ImageLocation"));
				imageCensorResult.setImageObject(_ctx.stringValue("QueryCensorJobListResponse.CensorJobList["+ i +"].ImageCensorResults["+ j +"].ImageObject"));

				imageCensorResults.add(imageCensorResult);
			}
			censorJob.setImageCensorResults(imageCensorResults);

			censorJobList.add(censorJob);
		}
		queryCensorJobListResponse.setCensorJobList(censorJobList);
	 
	 	return queryCensorJobListResponse;
	}
}