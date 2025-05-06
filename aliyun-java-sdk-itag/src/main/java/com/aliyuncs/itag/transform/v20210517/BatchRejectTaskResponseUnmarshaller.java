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

import com.aliyuncs.itag.model.v20210517.BatchRejectTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchRejectTaskResponseUnmarshaller {

	public static BatchRejectTaskResponse unmarshall(BatchRejectTaskResponse batchRejectTaskResponse, UnmarshallerContext _ctx) {
		
		batchRejectTaskResponse.setRequestId(_ctx.stringValue("BatchRejectTaskResponse.RequestId"));
		batchRejectTaskResponse.setCode(_ctx.integerValue("BatchRejectTaskResponse.Code"));
		batchRejectTaskResponse.setMsg(_ctx.stringValue("BatchRejectTaskResponse.Msg"));
		batchRejectTaskResponse.setErrInfo(_ctx.stringValue("BatchRejectTaskResponse.ErrInfo"));
		batchRejectTaskResponse.setSucc(_ctx.booleanValue("BatchRejectTaskResponse.Succ"));
		batchRejectTaskResponse.setResult(_ctx.booleanValue("BatchRejectTaskResponse.Result"));
		batchRejectTaskResponse.setRt(_ctx.longValue("BatchRejectTaskResponse.Rt"));
		batchRejectTaskResponse.setHost(_ctx.stringValue("BatchRejectTaskResponse.Host"));
		batchRejectTaskResponse.setErrorCode(_ctx.stringValue("BatchRejectTaskResponse.ErrorCode"));
	 
	 	return batchRejectTaskResponse;
	}
}