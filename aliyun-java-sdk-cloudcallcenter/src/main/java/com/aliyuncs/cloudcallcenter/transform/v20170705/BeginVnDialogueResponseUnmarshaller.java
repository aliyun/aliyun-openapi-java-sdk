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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.BeginVnDialogueResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BeginVnDialogueResponseUnmarshaller {

	public static BeginVnDialogueResponse unmarshall(BeginVnDialogueResponse beginVnDialogueResponse, UnmarshallerContext context) {
		
		beginVnDialogueResponse.setRequestId(context.stringValue("BeginVnDialogueResponse.RequestId"));
		beginVnDialogueResponse.setTextResponse(context.stringValue("BeginVnDialogueResponse.TextResponse"));
		beginVnDialogueResponse.setInterruptible(context.booleanValue("BeginVnDialogueResponse.Interruptible"));
		beginVnDialogueResponse.setAction(context.stringValue("BeginVnDialogueResponse.Action"));
		beginVnDialogueResponse.setActionParams(context.stringValue("BeginVnDialogueResponse.ActionParams"));
	 
	 	return beginVnDialogueResponse;
	}
}