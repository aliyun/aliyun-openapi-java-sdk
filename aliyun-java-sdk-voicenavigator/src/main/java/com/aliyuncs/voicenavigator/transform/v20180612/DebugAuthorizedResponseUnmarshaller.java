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

package com.aliyuncs.voicenavigator.transform.v20180612;

import com.aliyuncs.voicenavigator.model.v20180612.DebugAuthorizedResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DebugAuthorizedResponseUnmarshaller {

	public static DebugAuthorizedResponse unmarshall(DebugAuthorizedResponse debugAuthorizedResponse, UnmarshallerContext _ctx) {
		
		debugAuthorizedResponse.setRequestId(_ctx.stringValue("DebugAuthorizedResponse.RequestId"));
		debugAuthorizedResponse.setTextResponse(_ctx.stringValue("DebugAuthorizedResponse.TextResponse"));
		debugAuthorizedResponse.setInterruptible(_ctx.booleanValue("DebugAuthorizedResponse.Interruptible"));
		debugAuthorizedResponse.setAction(_ctx.stringValue("DebugAuthorizedResponse.Action"));
		debugAuthorizedResponse.setActionParams(_ctx.stringValue("DebugAuthorizedResponse.ActionParams"));
	 
	 	return debugAuthorizedResponse;
	}
}