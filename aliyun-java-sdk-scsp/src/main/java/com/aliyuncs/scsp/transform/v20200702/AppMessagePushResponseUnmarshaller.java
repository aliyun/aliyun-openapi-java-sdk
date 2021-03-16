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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.AppMessagePushResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AppMessagePushResponseUnmarshaller {

	public static AppMessagePushResponse unmarshall(AppMessagePushResponse appMessagePushResponse, UnmarshallerContext _ctx) {
		
		appMessagePushResponse.setRequestId(_ctx.stringValue("AppMessagePushResponse.RequestId"));
		appMessagePushResponse.setMessage(_ctx.stringValue("AppMessagePushResponse.Message"));
		appMessagePushResponse.setData(_ctx.stringValue("AppMessagePushResponse.Data"));
		appMessagePushResponse.setCode(_ctx.stringValue("AppMessagePushResponse.Code"));
		appMessagePushResponse.setSuccess(_ctx.booleanValue("AppMessagePushResponse.Success"));
	 
	 	return appMessagePushResponse;
	}
}