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

import com.aliyuncs.foas.model.v20181111.GetInstanceRunSummaryResponse;
import com.aliyuncs.foas.model.v20181111.GetInstanceRunSummaryResponse.RunSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceRunSummaryResponseUnmarshaller {

	public static GetInstanceRunSummaryResponse unmarshall(GetInstanceRunSummaryResponse getInstanceRunSummaryResponse, UnmarshallerContext _ctx) {
		
		getInstanceRunSummaryResponse.setRequestId(_ctx.stringValue("GetInstanceRunSummaryResponse.RequestId"));

		RunSummary runSummary = new RunSummary();
		runSummary.setId(_ctx.longValue("GetInstanceRunSummaryResponse.RunSummary.Id"));
		runSummary.setActualState(_ctx.stringValue("GetInstanceRunSummaryResponse.RunSummary.ActualState"));
		runSummary.setExpectState(_ctx.stringValue("GetInstanceRunSummaryResponse.RunSummary.ExpectState"));
		runSummary.setLastErrorTime(_ctx.longValue("GetInstanceRunSummaryResponse.RunSummary.LastErrorTime"));
		runSummary.setLastErrorMessage(_ctx.stringValue("GetInstanceRunSummaryResponse.RunSummary.LastErrorMessage"));
		runSummary.setEngineJobHandler(_ctx.stringValue("GetInstanceRunSummaryResponse.RunSummary.EngineJobHandler"));
		runSummary.setInputDelay(_ctx.longValue("GetInstanceRunSummaryResponse.RunSummary.InputDelay"));
		runSummary.setJobName(_ctx.stringValue("GetInstanceRunSummaryResponse.RunSummary.JobName"));
		getInstanceRunSummaryResponse.setRunSummary(runSummary);
	 
	 	return getInstanceRunSummaryResponse;
	}
}