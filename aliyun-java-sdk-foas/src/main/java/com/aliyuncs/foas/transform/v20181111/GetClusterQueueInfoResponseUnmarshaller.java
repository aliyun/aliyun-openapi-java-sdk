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

package com.aliyuncs.foas.transform.v20181111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.foas.model.v20181111.GetClusterQueueInfoResponse;
import com.aliyuncs.foas.model.v20181111.GetClusterQueueInfoResponse.Queue;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClusterQueueInfoResponseUnmarshaller {

	public static GetClusterQueueInfoResponse unmarshall(GetClusterQueueInfoResponse getClusterQueueInfoResponse, UnmarshallerContext _ctx) {
		
		getClusterQueueInfoResponse.setRequestId(_ctx.stringValue("GetClusterQueueInfoResponse.RequestId"));

		List<Queue> queues = new ArrayList<Queue>();
		for (int i = 0; i < _ctx.lengthValue("GetClusterQueueInfoResponse.Queues.Length"); i++) {
			Queue queue = new Queue();
			queue.setClusterId(_ctx.stringValue("GetClusterQueueInfoResponse.Queues["+ i +"].ClusterId"));
			queue.setQueueName(_ctx.stringValue("GetClusterQueueInfoResponse.Queues["+ i +"].QueueName"));
			queue.setMinGpu(_ctx.integerValue("GetClusterQueueInfoResponse.Queues["+ i +"].MinGpu"));
			queue.setMaxGpu(_ctx.integerValue("GetClusterQueueInfoResponse.Queues["+ i +"].MaxGpu"));
			queue.setMinMem(_ctx.integerValue("GetClusterQueueInfoResponse.Queues["+ i +"].MinMem"));
			queue.setUsedVCore(_ctx.integerValue("GetClusterQueueInfoResponse.Queues["+ i +"].UsedVCore"));
			queue.setUsedGpu(_ctx.integerValue("GetClusterQueueInfoResponse.Queues["+ i +"].UsedGpu"));
			queue.setUsedMem(_ctx.integerValue("GetClusterQueueInfoResponse.Queues["+ i +"].UsedMem"));
			queue.setMinVCore(_ctx.integerValue("GetClusterQueueInfoResponse.Queues["+ i +"].MinVCore"));
			queue.setMaxVCore(_ctx.integerValue("GetClusterQueueInfoResponse.Queues["+ i +"].MaxVCore"));
			queue.setMaxMem(_ctx.integerValue("GetClusterQueueInfoResponse.Queues["+ i +"].MaxMem"));

			queues.add(queue);
		}
		getClusterQueueInfoResponse.setQueues(queues);
	 
	 	return getClusterQueueInfoResponse;
	}
}