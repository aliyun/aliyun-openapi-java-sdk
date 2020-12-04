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

import com.aliyuncs.cloudgameapi.model.v20200728.BatchStopGameSessionsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchStopGameSessionsResponseUnmarshaller {

	public static BatchStopGameSessionsResponse unmarshall(BatchStopGameSessionsResponse batchStopGameSessionsResponse, UnmarshallerContext _ctx) {
		
		batchStopGameSessionsResponse.setRequestId(_ctx.stringValue("BatchStopGameSessionsResponse.RequestId"));
		batchStopGameSessionsResponse.setSuccess(_ctx.booleanValue("BatchStopGameSessionsResponse.Success"));
		batchStopGameSessionsResponse.setQueueState(_ctx.integerValue("BatchStopGameSessionsResponse.QueueState"));
		batchStopGameSessionsResponse.setMessage(_ctx.stringValue("BatchStopGameSessionsResponse.Message"));
		batchStopGameSessionsResponse.setGameId(_ctx.stringValue("BatchStopGameSessionsResponse.GameId"));
		batchStopGameSessionsResponse.setProjectId(_ctx.stringValue("BatchStopGameSessionsResponse.ProjectId"));
		batchStopGameSessionsResponse.setTrackInfo(_ctx.stringValue("BatchStopGameSessionsResponse.TrackInfo"));
	 
	 	return batchStopGameSessionsResponse;
	}
}