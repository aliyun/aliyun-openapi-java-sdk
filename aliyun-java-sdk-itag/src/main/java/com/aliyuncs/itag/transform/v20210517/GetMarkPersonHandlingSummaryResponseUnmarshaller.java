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

import com.aliyuncs.itag.model.v20210517.GetMarkPersonHandlingSummaryResponse;
import com.aliyuncs.itag.model.v20210517.GetMarkPersonHandlingSummaryResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMarkPersonHandlingSummaryResponseUnmarshaller {

	public static GetMarkPersonHandlingSummaryResponse unmarshall(GetMarkPersonHandlingSummaryResponse getMarkPersonHandlingSummaryResponse, UnmarshallerContext _ctx) {
		
		getMarkPersonHandlingSummaryResponse.setRequestId(_ctx.stringValue("GetMarkPersonHandlingSummaryResponse.requestId"));
		getMarkPersonHandlingSummaryResponse.setCode(_ctx.integerValue("GetMarkPersonHandlingSummaryResponse.Code"));
		getMarkPersonHandlingSummaryResponse.setMsg(_ctx.stringValue("GetMarkPersonHandlingSummaryResponse.Msg"));
		getMarkPersonHandlingSummaryResponse.setErrInfo(_ctx.stringValue("GetMarkPersonHandlingSummaryResponse.ErrInfo"));
		getMarkPersonHandlingSummaryResponse.setSucc(_ctx.booleanValue("GetMarkPersonHandlingSummaryResponse.Succ"));
		getMarkPersonHandlingSummaryResponse.setErrorCode(_ctx.stringValue("GetMarkPersonHandlingSummaryResponse.ErrorCode"));

		Result result = new Result();
		result.setMarking(_ctx.integerValue("GetMarkPersonHandlingSummaryResponse.Result.Marking"));
		result.setChecking(_ctx.integerValue("GetMarkPersonHandlingSummaryResponse.Result.Checking"));
		result.setMarkingFromReject(_ctx.integerValue("GetMarkPersonHandlingSummaryResponse.Result.MarkingFromReject"));
		getMarkPersonHandlingSummaryResponse.setResult(result);
	 
	 	return getMarkPersonHandlingSummaryResponse;
	}
}