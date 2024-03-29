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

import com.aliyuncs.voicenavigator.model.v20180612.DebugCollectedNumberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DebugCollectedNumberResponseUnmarshaller {

	public static DebugCollectedNumberResponse unmarshall(DebugCollectedNumberResponse debugCollectedNumberResponse, UnmarshallerContext _ctx) {
		
		debugCollectedNumberResponse.setRequestId(_ctx.stringValue("DebugCollectedNumberResponse.RequestId"));
		debugCollectedNumberResponse.setAction(_ctx.stringValue("DebugCollectedNumberResponse.Action"));
		debugCollectedNumberResponse.setInterruptible(_ctx.booleanValue("DebugCollectedNumberResponse.Interruptible"));
		debugCollectedNumberResponse.setActionParams(_ctx.stringValue("DebugCollectedNumberResponse.ActionParams"));
		debugCollectedNumberResponse.setTextResponse(_ctx.stringValue("DebugCollectedNumberResponse.TextResponse"));
	 
	 	return debugCollectedNumberResponse;
	}
}