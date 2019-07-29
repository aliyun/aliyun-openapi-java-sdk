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

import com.aliyuncs.foas.model.v20181111.ListProjectBindQueueResourceResponse;
import com.aliyuncs.foas.model.v20181111.ListProjectBindQueueResourceResponse.Queue;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectBindQueueResourceResponseUnmarshaller {

	public static ListProjectBindQueueResourceResponse unmarshall(ListProjectBindQueueResourceResponse listProjectBindQueueResourceResponse, UnmarshallerContext _ctx) {
		
		listProjectBindQueueResourceResponse.setRequestId(_ctx.stringValue("ListProjectBindQueueResourceResponse.RequestId"));

		List<Queue> queues = new ArrayList<Queue>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectBindQueueResourceResponse.Queues.Length"); i++) {
			Queue queue = new Queue();
			queue.setClusterId(_ctx.stringValue("ListProjectBindQueueResourceResponse.Queues["+ i +"].ClusterId"));
			queue.setQueueName(_ctx.stringValue("ListProjectBindQueueResourceResponse.Queues["+ i +"].QueueName"));
			queue.setMinGpu(_ctx.integerValue("ListProjectBindQueueResourceResponse.Queues["+ i +"].MinGpu"));
			queue.setMaxGpu(_ctx.integerValue("ListProjectBindQueueResourceResponse.Queues["+ i +"].MaxGpu"));
			queue.setMinMem(_ctx.integerValue("ListProjectBindQueueResourceResponse.Queues["+ i +"].MinMem"));
			queue.setMaxMem(_ctx.integerValue("ListProjectBindQueueResourceResponse.Queues["+ i +"].MaxMem"));
			queue.setMinVCore(_ctx.integerValue("ListProjectBindQueueResourceResponse.Queues["+ i +"].MinVCore"));
			queue.setMaxVCore(_ctx.integerValue("ListProjectBindQueueResourceResponse.Queues["+ i +"].MaxVCore"));
			queue.setUsedVCore(_ctx.integerValue("ListProjectBindQueueResourceResponse.Queues["+ i +"].UsedVCore"));
			queue.setUsedGpu(_ctx.integerValue("ListProjectBindQueueResourceResponse.Queues["+ i +"].UsedGpu"));
			queue.setUsedMem(_ctx.integerValue("ListProjectBindQueueResourceResponse.Queues["+ i +"].UsedMem"));

			queues.add(queue);
		}
		listProjectBindQueueResourceResponse.setQueues(queues);
	 
	 	return listProjectBindQueueResourceResponse;
	}
}