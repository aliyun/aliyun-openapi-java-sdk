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

import com.aliyuncs.itag.model.v20210517.AsyncDownloadMarkResultResponse;
import com.aliyuncs.itag.model.v20210517.AsyncDownloadMarkResultResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AsyncDownloadMarkResultResponseUnmarshaller {

	public static AsyncDownloadMarkResultResponse unmarshall(AsyncDownloadMarkResultResponse asyncDownloadMarkResultResponse, UnmarshallerContext _ctx) {
		
		asyncDownloadMarkResultResponse.setRequestId(_ctx.stringValue("AsyncDownloadMarkResultResponse.RequestId"));
		asyncDownloadMarkResultResponse.setCode(_ctx.stringValue("AsyncDownloadMarkResultResponse.Code"));
		asyncDownloadMarkResultResponse.setErrInfo(_ctx.stringValue("AsyncDownloadMarkResultResponse.ErrInfo"));
		asyncDownloadMarkResultResponse.setMsg(_ctx.stringValue("AsyncDownloadMarkResultResponse.Msg"));
		asyncDownloadMarkResultResponse.setSucc(_ctx.booleanValue("AsyncDownloadMarkResultResponse.Succ"));
		asyncDownloadMarkResultResponse.setErrorCode(_ctx.stringValue("AsyncDownloadMarkResultResponse.ErrorCode"));

		Result result = new Result();
		result.setTaskId(_ctx.stringValue("AsyncDownloadMarkResultResponse.Result.TaskId"));
		result.setRunInstId(_ctx.stringValue("AsyncDownloadMarkResultResponse.Result.RunInstId"));
		result.setFlowId(_ctx.stringValue("AsyncDownloadMarkResultResponse.Result.FlowId"));
		result.setMsgId(_ctx.stringValue("AsyncDownloadMarkResultResponse.Result.MsgId"));
		asyncDownloadMarkResultResponse.setResult(result);
	 
	 	return asyncDownloadMarkResultResponse;
	}
}