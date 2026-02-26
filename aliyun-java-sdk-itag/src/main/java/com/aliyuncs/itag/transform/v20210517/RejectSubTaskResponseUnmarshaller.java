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

import com.aliyuncs.itag.model.v20210517.RejectSubTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RejectSubTaskResponseUnmarshaller {

	public static RejectSubTaskResponse unmarshall(RejectSubTaskResponse rejectSubTaskResponse, UnmarshallerContext _ctx) {
		
		rejectSubTaskResponse.setRequestId(_ctx.stringValue("RejectSubTaskResponse.RequestId"));
		rejectSubTaskResponse.setCode(_ctx.stringValue("RejectSubTaskResponse.Code"));
		rejectSubTaskResponse.setErrInfo(_ctx.stringValue("RejectSubTaskResponse.ErrInfo"));
		rejectSubTaskResponse.setMsg(_ctx.stringValue("RejectSubTaskResponse.Msg"));
		rejectSubTaskResponse.setSucc(_ctx.booleanValue("RejectSubTaskResponse.Succ"));
		rejectSubTaskResponse.setResult(_ctx.booleanValue("RejectSubTaskResponse.Result"));
		rejectSubTaskResponse.setErrorCode(_ctx.stringValue("RejectSubTaskResponse.ErrorCode"));
	 
	 	return rejectSubTaskResponse;
	}
}