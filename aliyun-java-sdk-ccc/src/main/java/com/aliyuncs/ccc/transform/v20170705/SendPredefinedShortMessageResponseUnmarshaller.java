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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.SendPredefinedShortMessageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendPredefinedShortMessageResponseUnmarshaller {

	public static SendPredefinedShortMessageResponse unmarshall(SendPredefinedShortMessageResponse sendPredefinedShortMessageResponse, UnmarshallerContext _ctx) {
		
		sendPredefinedShortMessageResponse.setRequestId(_ctx.stringValue("SendPredefinedShortMessageResponse.RequestId"));
		sendPredefinedShortMessageResponse.setSuccess(_ctx.booleanValue("SendPredefinedShortMessageResponse.Success"));
		sendPredefinedShortMessageResponse.setCode(_ctx.stringValue("SendPredefinedShortMessageResponse.Code"));
		sendPredefinedShortMessageResponse.setMessage(_ctx.stringValue("SendPredefinedShortMessageResponse.Message"));
		sendPredefinedShortMessageResponse.setHttpStatusCode(_ctx.integerValue("SendPredefinedShortMessageResponse.HttpStatusCode"));
		sendPredefinedShortMessageResponse.setBizId(_ctx.stringValue("SendPredefinedShortMessageResponse.BizId"));
	 
	 	return sendPredefinedShortMessageResponse;
	}
}