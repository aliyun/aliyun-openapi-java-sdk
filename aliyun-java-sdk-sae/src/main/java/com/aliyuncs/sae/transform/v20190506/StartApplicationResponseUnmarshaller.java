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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.StartApplicationResponse;
import com.aliyuncs.sae.model.v20190506.StartApplicationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartApplicationResponseUnmarshaller {

	public static StartApplicationResponse unmarshall(StartApplicationResponse startApplicationResponse, UnmarshallerContext _ctx) {
		
		startApplicationResponse.setRequestId(_ctx.stringValue("StartApplicationResponse.RequestId"));
		startApplicationResponse.setCode(_ctx.stringValue("StartApplicationResponse.Code"));
		startApplicationResponse.setSuccess(_ctx.booleanValue("StartApplicationResponse.Success"));
		startApplicationResponse.setErrorCode(_ctx.stringValue("StartApplicationResponse.ErrorCode"));
		startApplicationResponse.setMessage(_ctx.stringValue("StartApplicationResponse.Message"));
		startApplicationResponse.setTraceId(_ctx.stringValue("StartApplicationResponse.TraceId"));

		Data data = new Data();
		data.setChangeOrderId(_ctx.stringValue("StartApplicationResponse.Data.ChangeOrderId"));
		startApplicationResponse.setData(data);
	 
	 	return startApplicationResponse;
	}
}