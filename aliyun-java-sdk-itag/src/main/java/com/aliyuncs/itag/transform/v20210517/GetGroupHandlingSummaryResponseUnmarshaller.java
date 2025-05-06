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

import com.aliyuncs.itag.model.v20210517.GetGroupHandlingSummaryResponse;
import com.aliyuncs.itag.model.v20210517.GetGroupHandlingSummaryResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGroupHandlingSummaryResponseUnmarshaller {

	public static GetGroupHandlingSummaryResponse unmarshall(GetGroupHandlingSummaryResponse getGroupHandlingSummaryResponse, UnmarshallerContext _ctx) {
		
		getGroupHandlingSummaryResponse.setRequestId(_ctx.stringValue("GetGroupHandlingSummaryResponse.requestId"));
		getGroupHandlingSummaryResponse.setCode(_ctx.integerValue("GetGroupHandlingSummaryResponse.Code"));
		getGroupHandlingSummaryResponse.setMsg(_ctx.stringValue("GetGroupHandlingSummaryResponse.Msg"));
		getGroupHandlingSummaryResponse.setErrInfo(_ctx.stringValue("GetGroupHandlingSummaryResponse.ErrInfo"));
		getGroupHandlingSummaryResponse.setSucc(_ctx.booleanValue("GetGroupHandlingSummaryResponse.Succ"));
		getGroupHandlingSummaryResponse.setErrorCode(_ctx.stringValue("GetGroupHandlingSummaryResponse.ErrorCode"));

		Result result = new Result();
		result.setMarking(_ctx.integerValue("GetGroupHandlingSummaryResponse.Result.Marking"));
		result.setChecking(_ctx.integerValue("GetGroupHandlingSummaryResponse.Result.Checking"));
		result.setMarkingFromReject(_ctx.integerValue("GetGroupHandlingSummaryResponse.Result.MarkingFromReject"));
		getGroupHandlingSummaryResponse.setResult(result);
	 
	 	return getGroupHandlingSummaryResponse;
	}
}