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

package com.aliyuncs.cloudgameapi.transform.v20200728;

import com.aliyuncs.cloudgameapi.model.v20200728.StopGameSessionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopGameSessionResponseUnmarshaller {

	public static StopGameSessionResponse unmarshall(StopGameSessionResponse stopGameSessionResponse, UnmarshallerContext _ctx) {
		
		stopGameSessionResponse.setRequestId(_ctx.stringValue("StopGameSessionResponse.RequestId"));
		stopGameSessionResponse.setGameId(_ctx.stringValue("StopGameSessionResponse.GameId"));
		stopGameSessionResponse.setGameSession(_ctx.stringValue("StopGameSessionResponse.GameSession"));
		stopGameSessionResponse.setQueueState(_ctx.integerValue("StopGameSessionResponse.QueueState"));
		stopGameSessionResponse.setQueueCode(_ctx.integerValue("StopGameSessionResponse.QueueCode"));
		stopGameSessionResponse.setMessage(_ctx.stringValue("StopGameSessionResponse.Message"));
		stopGameSessionResponse.setSuccess(_ctx.booleanValue("StopGameSessionResponse.Success"));
	 
	 	return stopGameSessionResponse;
	}
}