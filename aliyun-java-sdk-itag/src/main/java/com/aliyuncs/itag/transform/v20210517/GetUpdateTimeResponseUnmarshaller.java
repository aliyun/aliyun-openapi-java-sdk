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

import com.aliyuncs.itag.model.v20210517.GetUpdateTimeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUpdateTimeResponseUnmarshaller {

	public static GetUpdateTimeResponse unmarshall(GetUpdateTimeResponse getUpdateTimeResponse, UnmarshallerContext _ctx) {
		
		getUpdateTimeResponse.setRequestId(_ctx.stringValue("GetUpdateTimeResponse.RequestId"));
		getUpdateTimeResponse.setCode(_ctx.stringValue("GetUpdateTimeResponse.Code"));
		getUpdateTimeResponse.setErrInfo(_ctx.stringValue("GetUpdateTimeResponse.ErrInfo"));
		getUpdateTimeResponse.setMsg(_ctx.stringValue("GetUpdateTimeResponse.Msg"));
		getUpdateTimeResponse.setSucc(_ctx.booleanValue("GetUpdateTimeResponse.Succ"));
		getUpdateTimeResponse.setResult(_ctx.stringValue("GetUpdateTimeResponse.Result"));
		getUpdateTimeResponse.setErrorCode(_ctx.stringValue("GetUpdateTimeResponse.ErrorCode"));
	 
	 	return getUpdateTimeResponse;
	}
}