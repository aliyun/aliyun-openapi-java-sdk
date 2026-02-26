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

import com.aliyuncs.itag.model.v20210517.GetAssignedCheckTaskSummaryResponse;
import com.aliyuncs.itag.model.v20210517.GetAssignedCheckTaskSummaryResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAssignedCheckTaskSummaryResponseUnmarshaller {

	public static GetAssignedCheckTaskSummaryResponse unmarshall(GetAssignedCheckTaskSummaryResponse getAssignedCheckTaskSummaryResponse, UnmarshallerContext _ctx) {
		
		getAssignedCheckTaskSummaryResponse.setRequestId(_ctx.stringValue("GetAssignedCheckTaskSummaryResponse.RequestId"));
		getAssignedCheckTaskSummaryResponse.setCode(_ctx.integerValue("GetAssignedCheckTaskSummaryResponse.Code"));
		getAssignedCheckTaskSummaryResponse.setMsg(_ctx.stringValue("GetAssignedCheckTaskSummaryResponse.Msg"));
		getAssignedCheckTaskSummaryResponse.setErrInfo(_ctx.stringValue("GetAssignedCheckTaskSummaryResponse.ErrInfo"));
		getAssignedCheckTaskSummaryResponse.setSucc(_ctx.booleanValue("GetAssignedCheckTaskSummaryResponse.Succ"));
		getAssignedCheckTaskSummaryResponse.setRt(_ctx.longValue("GetAssignedCheckTaskSummaryResponse.Rt"));
		getAssignedCheckTaskSummaryResponse.setHost(_ctx.stringValue("GetAssignedCheckTaskSummaryResponse.Host"));
		getAssignedCheckTaskSummaryResponse.setErrorCode(_ctx.stringValue("GetAssignedCheckTaskSummaryResponse.ErrorCode"));

		Result result = new Result();
		result.setTotalSubTask(_ctx.integerValue("GetAssignedCheckTaskSummaryResponse.Result.TotalSubTask"));
		result.setRejectSubTask(_ctx.integerValue("GetAssignedCheckTaskSummaryResponse.Result.RejectSubTask"));
		result.setAssignedSubTask(_ctx.integerValue("GetAssignedCheckTaskSummaryResponse.Result.AssignedSubTask"));
		result.setUncheckSubTask(_ctx.integerValue("GetAssignedCheckTaskSummaryResponse.Result.UncheckSubTask"));
		getAssignedCheckTaskSummaryResponse.setResult(result);
	 
	 	return getAssignedCheckTaskSummaryResponse;
	}
}