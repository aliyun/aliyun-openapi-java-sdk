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

package com.aliyuncs.foas.transform.v20181111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.foas.model.v20181111.BatchGetInstanceRunSummaryResponse;
import com.aliyuncs.foas.model.v20181111.BatchGetInstanceRunSummaryResponse.RunSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGetInstanceRunSummaryResponseUnmarshaller {

	public static BatchGetInstanceRunSummaryResponse unmarshall(BatchGetInstanceRunSummaryResponse batchGetInstanceRunSummaryResponse, UnmarshallerContext _ctx) {
		
		batchGetInstanceRunSummaryResponse.setRequestId(_ctx.stringValue("BatchGetInstanceRunSummaryResponse.RequestId"));

		List<RunSummary> runSummarys = new ArrayList<RunSummary>();
		for (int i = 0; i < _ctx.lengthValue("BatchGetInstanceRunSummaryResponse.RunSummarys.Length"); i++) {
			RunSummary runSummary = new RunSummary();
			runSummary.setId(_ctx.longValue("BatchGetInstanceRunSummaryResponse.RunSummarys["+ i +"].Id"));
			runSummary.setActualState(_ctx.stringValue("BatchGetInstanceRunSummaryResponse.RunSummarys["+ i +"].ActualState"));
			runSummary.setExpectState(_ctx.stringValue("BatchGetInstanceRunSummaryResponse.RunSummarys["+ i +"].ExpectState"));
			runSummary.setLastErrorTime(_ctx.longValue("BatchGetInstanceRunSummaryResponse.RunSummarys["+ i +"].LastErrorTime"));
			runSummary.setLastErrorMessage(_ctx.stringValue("BatchGetInstanceRunSummaryResponse.RunSummarys["+ i +"].LastErrorMessage"));
			runSummary.setEngineJobHandler(_ctx.stringValue("BatchGetInstanceRunSummaryResponse.RunSummarys["+ i +"].EngineJobHandler"));
			runSummary.setInputDelay(_ctx.longValue("BatchGetInstanceRunSummaryResponse.RunSummarys["+ i +"].InputDelay"));
			runSummary.setJobName(_ctx.stringValue("BatchGetInstanceRunSummaryResponse.RunSummarys["+ i +"].JobName"));

			runSummarys.add(runSummary);
		}
		batchGetInstanceRunSummaryResponse.setRunSummarys(runSummarys);
	 
	 	return batchGetInstanceRunSummaryResponse;
	}
}