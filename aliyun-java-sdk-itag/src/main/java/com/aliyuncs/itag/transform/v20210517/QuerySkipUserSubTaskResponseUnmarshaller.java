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

import com.aliyuncs.itag.model.v20210517.QuerySkipUserSubTaskResponse;
import com.aliyuncs.itag.model.v20210517.QuerySkipUserSubTaskResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySkipUserSubTaskResponseUnmarshaller {

	public static QuerySkipUserSubTaskResponse unmarshall(QuerySkipUserSubTaskResponse querySkipUserSubTaskResponse, UnmarshallerContext _ctx) {
		
		querySkipUserSubTaskResponse.setRequestId(_ctx.stringValue("QuerySkipUserSubTaskResponse.RequestId"));
		querySkipUserSubTaskResponse.setCode(_ctx.stringValue("QuerySkipUserSubTaskResponse.Code"));
		querySkipUserSubTaskResponse.setErrInfo(_ctx.stringValue("QuerySkipUserSubTaskResponse.ErrInfo"));
		querySkipUserSubTaskResponse.setMsg(_ctx.stringValue("QuerySkipUserSubTaskResponse.Msg"));
		querySkipUserSubTaskResponse.setSucc(_ctx.booleanValue("QuerySkipUserSubTaskResponse.Succ"));
		querySkipUserSubTaskResponse.setErrorCode(_ctx.stringValue("QuerySkipUserSubTaskResponse.ErrorCode"));

		Result result = new Result();
		result.setMaxSkipCount(_ctx.longValue("QuerySkipUserSubTaskResponse.Result.MaxSkipCount"));
		result.setSkipedCount(_ctx.longValue("QuerySkipUserSubTaskResponse.Result.SkipedCount"));
		result.setLeftSkipCount(_ctx.longValue("QuerySkipUserSubTaskResponse.Result.LeftSkipCount"));
		querySkipUserSubTaskResponse.setResult(result);
	 
	 	return querySkipUserSubTaskResponse;
	}
}