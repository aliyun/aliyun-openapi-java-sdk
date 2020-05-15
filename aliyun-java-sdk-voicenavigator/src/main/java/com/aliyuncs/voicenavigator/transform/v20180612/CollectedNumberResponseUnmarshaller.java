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

import com.aliyuncs.voicenavigator.model.v20180612.CollectedNumberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CollectedNumberResponseUnmarshaller {

	public static CollectedNumberResponse unmarshall(CollectedNumberResponse collectedNumberResponse, UnmarshallerContext _ctx) {
		
		collectedNumberResponse.setRequestId(_ctx.stringValue("CollectedNumberResponse.RequestId"));
		collectedNumberResponse.setTextResponse(_ctx.stringValue("CollectedNumberResponse.TextResponse"));
		collectedNumberResponse.setInterruptible(_ctx.booleanValue("CollectedNumberResponse.Interruptible"));
		collectedNumberResponse.setAction(_ctx.stringValue("CollectedNumberResponse.Action"));
		collectedNumberResponse.setActionParams(_ctx.stringValue("CollectedNumberResponse.ActionParams"));
	 
	 	return collectedNumberResponse;
	}
}