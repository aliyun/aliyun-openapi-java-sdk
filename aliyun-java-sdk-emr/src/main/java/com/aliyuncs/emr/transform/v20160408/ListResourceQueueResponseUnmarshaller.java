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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListResourceQueueResponse;
import com.aliyuncs.emr.model.v20160408.ListResourceQueueResponse.Queue;
import com.aliyuncs.emr.model.v20160408.ListResourceQueueResponse.Queue.EcmResourceQueue;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceQueueResponseUnmarshaller {

	public static ListResourceQueueResponse unmarshall(ListResourceQueueResponse listResourceQueueResponse, UnmarshallerContext context) {
		

		List<Queue> queueList = new ArrayList<Queue>();
		for (int i = 0; i < context.lengthValue("ListResourceQueueResponse.QueueList.Length"); i++) {
			Queue queue = new Queue();

			EcmResourceQueue ecmResourceQueue = new EcmResourceQueue();
			ecmResourceQueue.setId(context.longValue("ListResourceQueueResponse.QueueList["+ i +"].EcmResourceQueue.Id"));
			ecmResourceQueue.setName(context.stringValue("ListResourceQueueResponse.QueueList["+ i +"].EcmResourceQueue.Name"));
			ecmResourceQueue.setQualifiedName(context.stringValue("ListResourceQueueResponse.QueueList["+ i +"].EcmResourceQueue.QualifiedName"));
			ecmResourceQueue.setQueueType(context.stringValue("ListResourceQueueResponse.QueueList["+ i +"].EcmResourceQueue.QueueType"));
			ecmResourceQueue.setParentQueueId(context.longValue("ListResourceQueueResponse.QueueList["+ i +"].EcmResourceQueue.ParentQueueId"));
			ecmResourceQueue.setLeaf(context.booleanValue("ListResourceQueueResponse.QueueList["+ i +"].EcmResourceQueue.Leaf"));
			ecmResourceQueue.setStatus(context.stringValue("ListResourceQueueResponse.QueueList["+ i +"].EcmResourceQueue.Status"));
			ecmResourceQueue.setUserId(context.stringValue("ListResourceQueueResponse.QueueList["+ i +"].EcmResourceQueue.UserId"));
			ecmResourceQueue.setResourcePoolId(context.longValue("ListResourceQueueResponse.QueueList["+ i +"].EcmResourceQueue.ResourcePoolId"));
			queue.setEcmResourceQueue(ecmResourceQueue);

			queueList.add(queue);
		}
		listResourceQueueResponse.setQueueList(queueList);
	 
	 	return listResourceQueueResponse;
	}
}