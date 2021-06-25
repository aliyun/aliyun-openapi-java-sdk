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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.ModifyEmptyNumberNoMoreCallsInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyEmptyNumberNoMoreCallsInfoResponseUnmarshaller {

	public static ModifyEmptyNumberNoMoreCallsInfoResponse unmarshall(ModifyEmptyNumberNoMoreCallsInfoResponse modifyEmptyNumberNoMoreCallsInfoResponse, UnmarshallerContext _ctx) {
		
		modifyEmptyNumberNoMoreCallsInfoResponse.setRequestId(_ctx.stringValue("ModifyEmptyNumberNoMoreCallsInfoResponse.RequestId"));
		modifyEmptyNumberNoMoreCallsInfoResponse.setSuccess(_ctx.booleanValue("ModifyEmptyNumberNoMoreCallsInfoResponse.Success"));
		modifyEmptyNumberNoMoreCallsInfoResponse.setCode(_ctx.stringValue("ModifyEmptyNumberNoMoreCallsInfoResponse.Code"));
		modifyEmptyNumberNoMoreCallsInfoResponse.setMessage(_ctx.stringValue("ModifyEmptyNumberNoMoreCallsInfoResponse.Message"));
		modifyEmptyNumberNoMoreCallsInfoResponse.setHttpStatusCode(_ctx.integerValue("ModifyEmptyNumberNoMoreCallsInfoResponse.HttpStatusCode"));
	 
	 	return modifyEmptyNumberNoMoreCallsInfoResponse;
	}
}