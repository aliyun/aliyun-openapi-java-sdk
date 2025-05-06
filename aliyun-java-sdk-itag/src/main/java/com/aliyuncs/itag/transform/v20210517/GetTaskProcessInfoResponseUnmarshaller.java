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

package com.aliyuncs.itag.transform.v20210517;

import com.aliyuncs.itag.model.v20210517.GetTaskProcessInfoResponse;
import com.aliyuncs.itag.model.v20210517.GetTaskProcessInfoResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetTaskProcessInfoResponse.Result.Summary;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskProcessInfoResponseUnmarshaller {

	public static GetTaskProcessInfoResponse unmarshall(GetTaskProcessInfoResponse getTaskProcessInfoResponse, UnmarshallerContext _ctx) {
		
		getTaskProcessInfoResponse.setRequestId(_ctx.stringValue("GetTaskProcessInfoResponse.RequestId"));
		getTaskProcessInfoResponse.setCode(_ctx.stringValue("GetTaskProcessInfoResponse.Code"));
		getTaskProcessInfoResponse.setErrInfo(_ctx.stringValue("GetTaskProcessInfoResponse.ErrInfo"));
		getTaskProcessInfoResponse.setMsg(_ctx.stringValue("GetTaskProcessInfoResponse.Msg"));
		getTaskProcessInfoResponse.setSucc(_ctx.booleanValue("GetTaskProcessInfoResponse.Succ"));
		getTaskProcessInfoResponse.setErrorCode(_ctx.stringValue("GetTaskProcessInfoResponse.ErrorCode"));

		Result result = new Result();
		result.setTaskId(_ctx.stringValue("GetTaskProcessInfoResponse.Result.TaskId"));
		result.setNodeSummary(_ctx.mapValue("GetTaskProcessInfoResponse.Result.NodeSummary"));
		result.setStage(_ctx.stringValue("GetTaskProcessInfoResponse.Result.Stage"));

		Summary summary = new Summary();
		summary.setNode(_ctx.stringValue("GetTaskProcessInfoResponse.Result.Summary.Node"));
		summary.setTotalSubTask(_ctx.integerValue("GetTaskProcessInfoResponse.Result.Summary.TotalSubTask"));
		summary.setFinishedSubTask(_ctx.integerValue("GetTaskProcessInfoResponse.Result.Summary.FinishedSubTask"));
		summary.setTotalItem(_ctx.integerValue("GetTaskProcessInfoResponse.Result.Summary.TotalItem"));
		summary.setFinishedItem(_ctx.integerValue("GetTaskProcessInfoResponse.Result.Summary.FinishedItem"));
		summary.setState(_ctx.stringValue("GetTaskProcessInfoResponse.Result.Summary.State"));
		summary.setFixedItem(_ctx.longValue("GetTaskProcessInfoResponse.Result.Summary.FixedItem"));
		summary.setAbandonItem(_ctx.longValue("GetTaskProcessInfoResponse.Result.Summary.AbandonItem"));
		result.setSummary(summary);
		getTaskProcessInfoResponse.setResult(result);
	 
	 	return getTaskProcessInfoResponse;
	}
}