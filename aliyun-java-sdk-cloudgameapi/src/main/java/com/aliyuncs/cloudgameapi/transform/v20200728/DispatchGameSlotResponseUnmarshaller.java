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

import com.aliyuncs.cloudgameapi.model.v20200728.DispatchGameSlotResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DispatchGameSlotResponseUnmarshaller {

	public static DispatchGameSlotResponse unmarshall(DispatchGameSlotResponse dispatchGameSlotResponse, UnmarshallerContext _ctx) {
		
		dispatchGameSlotResponse.setRequestId(_ctx.stringValue("DispatchGameSlotResponse.RequestId"));
		dispatchGameSlotResponse.setGameId(_ctx.stringValue("DispatchGameSlotResponse.GameId"));
		dispatchGameSlotResponse.setGameSession(_ctx.stringValue("DispatchGameSlotResponse.GameSession"));
		dispatchGameSlotResponse.setQueueState(_ctx.integerValue("DispatchGameSlotResponse.QueueState"));
		dispatchGameSlotResponse.setQueueCode(_ctx.integerValue("DispatchGameSlotResponse.QueueCode"));
		dispatchGameSlotResponse.setMessage(_ctx.stringValue("DispatchGameSlotResponse.Message"));
		dispatchGameSlotResponse.setRegionName(_ctx.stringValue("DispatchGameSlotResponse.RegionName"));
		dispatchGameSlotResponse.setUserId(_ctx.stringValue("DispatchGameSlotResponse.UserId"));
	 
	 	return dispatchGameSlotResponse;
	}
}