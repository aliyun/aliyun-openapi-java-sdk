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

import com.aliyuncs.itag.model.v20210517.CanCommitResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CanCommitResponseUnmarshaller {

	public static CanCommitResponse unmarshall(CanCommitResponse canCommitResponse, UnmarshallerContext _ctx) {
		
		canCommitResponse.setRequestId(_ctx.stringValue("CanCommitResponse.RequestId"));
		canCommitResponse.setCode(_ctx.stringValue("CanCommitResponse.Code"));
		canCommitResponse.setErrInfo(_ctx.stringValue("CanCommitResponse.ErrInfo"));
		canCommitResponse.setMsg(_ctx.stringValue("CanCommitResponse.Msg"));
		canCommitResponse.setSucc(_ctx.booleanValue("CanCommitResponse.Succ"));
		canCommitResponse.setResult(_ctx.booleanValue("CanCommitResponse.Result"));
		canCommitResponse.setErrorCode(_ctx.stringValue("CanCommitResponse.ErrorCode"));
	 
	 	return canCommitResponse;
	}
}