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

import com.aliyuncs.itag.model.v20210517.UpdateDatasetStateMsgResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDatasetStateMsgResponseUnmarshaller {

	public static UpdateDatasetStateMsgResponse unmarshall(UpdateDatasetStateMsgResponse updateDatasetStateMsgResponse, UnmarshallerContext _ctx) {
		
		updateDatasetStateMsgResponse.setRequestId(_ctx.stringValue("UpdateDatasetStateMsgResponse.RequestId"));
		updateDatasetStateMsgResponse.setCode(_ctx.stringValue("UpdateDatasetStateMsgResponse.Code"));
		updateDatasetStateMsgResponse.setErrInfo(_ctx.stringValue("UpdateDatasetStateMsgResponse.ErrInfo"));
		updateDatasetStateMsgResponse.setMsg(_ctx.stringValue("UpdateDatasetStateMsgResponse.Msg"));
		updateDatasetStateMsgResponse.setSucc(_ctx.booleanValue("UpdateDatasetStateMsgResponse.Succ"));
		updateDatasetStateMsgResponse.setResult(_ctx.booleanValue("UpdateDatasetStateMsgResponse.Result"));
		updateDatasetStateMsgResponse.setErrorCode(_ctx.stringValue("UpdateDatasetStateMsgResponse.ErrorCode"));
	 
	 	return updateDatasetStateMsgResponse;
	}
}