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

import com.aliyuncs.itag.model.v20210517.TransferUserSubTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TransferUserSubTaskResponseUnmarshaller {

	public static TransferUserSubTaskResponse unmarshall(TransferUserSubTaskResponse transferUserSubTaskResponse, UnmarshallerContext _ctx) {
		
		transferUserSubTaskResponse.setRequestId(_ctx.stringValue("TransferUserSubTaskResponse.RequestId"));
		transferUserSubTaskResponse.setCode(_ctx.stringValue("TransferUserSubTaskResponse.Code"));
		transferUserSubTaskResponse.setErrInfo(_ctx.stringValue("TransferUserSubTaskResponse.ErrInfo"));
		transferUserSubTaskResponse.setMsg(_ctx.stringValue("TransferUserSubTaskResponse.Msg"));
		transferUserSubTaskResponse.setSucc(_ctx.booleanValue("TransferUserSubTaskResponse.Succ"));
		transferUserSubTaskResponse.setResult(_ctx.booleanValue("TransferUserSubTaskResponse.Result"));
		transferUserSubTaskResponse.setErrorCode(_ctx.stringValue("TransferUserSubTaskResponse.ErrorCode"));
	 
	 	return transferUserSubTaskResponse;
	}
}