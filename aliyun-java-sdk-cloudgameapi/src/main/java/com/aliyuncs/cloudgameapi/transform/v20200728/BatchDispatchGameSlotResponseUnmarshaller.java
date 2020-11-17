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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudgameapi.model.v20200728.BatchDispatchGameSlotResponse;
import com.aliyuncs.cloudgameapi.model.v20200728.BatchDispatchGameSlotResponse.DataList;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchDispatchGameSlotResponseUnmarshaller {

	public static BatchDispatchGameSlotResponse unmarshall(BatchDispatchGameSlotResponse batchDispatchGameSlotResponse, UnmarshallerContext _ctx) {
		
		batchDispatchGameSlotResponse.setRequestId(_ctx.stringValue("BatchDispatchGameSlotResponse.RequestId"));

		List<DataList> queueResultList = new ArrayList<DataList>();
		for (int i = 0; i < _ctx.lengthValue("BatchDispatchGameSlotResponse.QueueResultList.Length"); i++) {
			DataList dataList = new DataList();
			dataList.setGameId(_ctx.stringValue("BatchDispatchGameSlotResponse.QueueResultList["+ i +"].GameId"));
			dataList.setGameSession(_ctx.stringValue("BatchDispatchGameSlotResponse.QueueResultList["+ i +"].GameSession"));
			dataList.setMessage(_ctx.stringValue("BatchDispatchGameSlotResponse.QueueResultList["+ i +"].Message"));
			dataList.setQueueCode(_ctx.integerValue("BatchDispatchGameSlotResponse.QueueResultList["+ i +"].QueueCode"));
			dataList.setQueueState(_ctx.integerValue("BatchDispatchGameSlotResponse.QueueResultList["+ i +"].QueueState"));
			dataList.setRegionName(_ctx.stringValue("BatchDispatchGameSlotResponse.QueueResultList["+ i +"].RegionName"));
			dataList.setUserId(_ctx.stringValue("BatchDispatchGameSlotResponse.QueueResultList["+ i +"].UserId"));

			queueResultList.add(dataList);
		}
		batchDispatchGameSlotResponse.setQueueResultList(queueResultList);
	 
	 	return batchDispatchGameSlotResponse;
	}
}