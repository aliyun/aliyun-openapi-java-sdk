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

import com.aliyuncs.itag.model.v20210517.FetchVideoMarkResultResponse;
import com.aliyuncs.itag.model.v20210517.FetchVideoMarkResultResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class FetchVideoMarkResultResponseUnmarshaller {

	public static FetchVideoMarkResultResponse unmarshall(FetchVideoMarkResultResponse fetchVideoMarkResultResponse, UnmarshallerContext _ctx) {
		
		fetchVideoMarkResultResponse.setRequestId(_ctx.stringValue("FetchVideoMarkResultResponse.RequestId"));
		fetchVideoMarkResultResponse.setCode(_ctx.integerValue("FetchVideoMarkResultResponse.Code"));
		fetchVideoMarkResultResponse.setMsg(_ctx.stringValue("FetchVideoMarkResultResponse.Msg"));
		fetchVideoMarkResultResponse.setErrInfo(_ctx.stringValue("FetchVideoMarkResultResponse.ErrInfo"));
		fetchVideoMarkResultResponse.setSucc(_ctx.booleanValue("FetchVideoMarkResultResponse.Succ"));
		fetchVideoMarkResultResponse.setRt(_ctx.longValue("FetchVideoMarkResultResponse.Rt"));
		fetchVideoMarkResultResponse.setHost(_ctx.stringValue("FetchVideoMarkResultResponse.Host"));
		fetchVideoMarkResultResponse.setErrorCode(_ctx.stringValue("FetchVideoMarkResultResponse.ErrorCode"));

		Result result = new Result();
		result.setTaskId(_ctx.stringValue("FetchVideoMarkResultResponse.Result.TaskId"));
		result.setUserMarkResultId(_ctx.stringValue("FetchVideoMarkResultResponse.Result.UserMarkResultId"));
		result.setMarkResult(_ctx.stringValue("FetchVideoMarkResultResponse.Result.MarkResult"));
		fetchVideoMarkResultResponse.setResult(result);
	 
	 	return fetchVideoMarkResultResponse;
	}
}