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

package com.aliyuncs.live.transform.v20161101;

import com.aliyuncs.live.model.v20161101.SendLiveMessageGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendLiveMessageGroupResponseUnmarshaller {

	public static SendLiveMessageGroupResponse unmarshall(SendLiveMessageGroupResponse sendLiveMessageGroupResponse, UnmarshallerContext _ctx) {
		
		sendLiveMessageGroupResponse.setRequestId(_ctx.stringValue("SendLiveMessageGroupResponse.RequestId"));
		sendLiveMessageGroupResponse.setMsgTid(_ctx.stringValue("SendLiveMessageGroupResponse.MsgTid"));
	 
	 	return sendLiveMessageGroupResponse;
	}
}