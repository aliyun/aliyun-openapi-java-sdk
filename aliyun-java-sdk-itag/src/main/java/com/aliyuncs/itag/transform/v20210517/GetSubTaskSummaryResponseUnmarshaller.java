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

import com.aliyuncs.itag.model.v20210517.GetSubTaskSummaryResponse;
import com.aliyuncs.itag.model.v20210517.GetSubTaskSummaryResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSubTaskSummaryResponseUnmarshaller {

	public static GetSubTaskSummaryResponse unmarshall(GetSubTaskSummaryResponse getSubTaskSummaryResponse, UnmarshallerContext _ctx) {
		
		getSubTaskSummaryResponse.setRequestId(_ctx.stringValue("GetSubTaskSummaryResponse.RequestId"));
		getSubTaskSummaryResponse.setCode(_ctx.stringValue("GetSubTaskSummaryResponse.Code"));
		getSubTaskSummaryResponse.setErrInfo(_ctx.stringValue("GetSubTaskSummaryResponse.ErrInfo"));
		getSubTaskSummaryResponse.setMsg(_ctx.stringValue("GetSubTaskSummaryResponse.Msg"));
		getSubTaskSummaryResponse.setSucc(_ctx.booleanValue("GetSubTaskSummaryResponse.Succ"));
		getSubTaskSummaryResponse.setErrorCode(_ctx.stringValue("GetSubTaskSummaryResponse.ErrorCode"));

		Result result = new Result();
		result.setFailItemCount(_ctx.integerValue("GetSubTaskSummaryResponse.Result.FailItemCount"));
		result.setTotalItemCount(_ctx.integerValue("GetSubTaskSummaryResponse.Result.TotalItemCount"));
		getSubTaskSummaryResponse.setResult(result);
	 
	 	return getSubTaskSummaryResponse;
	}
}