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

import com.aliyuncs.itag.model.v20210517.CommitSubTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CommitSubTaskResponseUnmarshaller {

	public static CommitSubTaskResponse unmarshall(CommitSubTaskResponse commitSubTaskResponse, UnmarshallerContext _ctx) {
		
		commitSubTaskResponse.setRequestId(_ctx.stringValue("CommitSubTaskResponse.RequestId"));
		commitSubTaskResponse.setCode(_ctx.stringValue("CommitSubTaskResponse.Code"));
		commitSubTaskResponse.setErrInfo(_ctx.stringValue("CommitSubTaskResponse.ErrInfo"));
		commitSubTaskResponse.setMsg(_ctx.stringValue("CommitSubTaskResponse.Msg"));
		commitSubTaskResponse.setSucc(_ctx.booleanValue("CommitSubTaskResponse.Succ"));
		commitSubTaskResponse.setResult(_ctx.booleanValue("CommitSubTaskResponse.Result"));
		commitSubTaskResponse.setErrorCode(_ctx.stringValue("CommitSubTaskResponse.ErrorCode"));
	 
	 	return commitSubTaskResponse;
	}
}