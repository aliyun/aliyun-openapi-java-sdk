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

import com.aliyuncs.airec.model.v20201126.ListFlowControlTaskReferenceResponse;
import com.aliyuncs.airec.model.v20201126.ListFlowControlTaskReferenceResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowControlTaskReferenceResponseUnmarshaller {

	public static ListFlowControlTaskReferenceResponse unmarshall(ListFlowControlTaskReferenceResponse listFlowControlTaskReferenceResponse, UnmarshallerContext _ctx) {
		
		listFlowControlTaskReferenceResponse.setRequestId(_ctx.stringValue("ListFlowControlTaskReferenceResponse.requestId"));

		Result result = new Result();
		result.setLast7PvPercent(_ctx.doubleValue("ListFlowControlTaskReferenceResponse.result.last7PvPercent"));
		result.setLast7ScenePv(_ctx.doubleValue("ListFlowControlTaskReferenceResponse.result.last7ScenePv"));
		result.setLast7TaskPv(_ctx.doubleValue("ListFlowControlTaskReferenceResponse.result.last7TaskPv"));
		result.setLastPvPercent(_ctx.doubleValue("ListFlowControlTaskReferenceResponse.result.lastPvPercent"));
		result.setLastScenePv(_ctx.longValue("ListFlowControlTaskReferenceResponse.result.lastScenePv"));
		result.setLastTaskPv(_ctx.longValue("ListFlowControlTaskReferenceResponse.result.lastTaskPv"));
		result.setReferenceId(_ctx.stringValue("ListFlowControlTaskReferenceResponse.result.referenceId"));
		listFlowControlTaskReferenceResponse.setResult(result);
	 
	 	return listFlowControlTaskReferenceResponse;
	}
}