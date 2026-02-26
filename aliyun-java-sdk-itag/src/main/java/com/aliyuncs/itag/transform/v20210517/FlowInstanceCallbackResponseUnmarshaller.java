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

import com.aliyuncs.itag.model.v20210517.FlowInstanceCallbackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class FlowInstanceCallbackResponseUnmarshaller {

	public static FlowInstanceCallbackResponse unmarshall(FlowInstanceCallbackResponse flowInstanceCallbackResponse, UnmarshallerContext _ctx) {
		
		flowInstanceCallbackResponse.setRequestId(_ctx.stringValue("FlowInstanceCallbackResponse.RequestId"));
		flowInstanceCallbackResponse.setCode(_ctx.stringValue("FlowInstanceCallbackResponse.Code"));
		flowInstanceCallbackResponse.setErrInfo(_ctx.stringValue("FlowInstanceCallbackResponse.ErrInfo"));
		flowInstanceCallbackResponse.setMsg(_ctx.stringValue("FlowInstanceCallbackResponse.Msg"));
		flowInstanceCallbackResponse.setSucc(_ctx.booleanValue("FlowInstanceCallbackResponse.Succ"));
		flowInstanceCallbackResponse.setResult(_ctx.booleanValue("FlowInstanceCallbackResponse.Result"));
		flowInstanceCallbackResponse.setErrorCode(_ctx.stringValue("FlowInstanceCallbackResponse.ErrorCode"));
	 
	 	return flowInstanceCallbackResponse;
	}
}