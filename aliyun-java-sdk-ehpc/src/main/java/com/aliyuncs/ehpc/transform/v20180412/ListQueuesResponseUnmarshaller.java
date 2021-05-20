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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListQueuesResponse;
import com.aliyuncs.ehpc.model.v20180412.ListQueuesResponse.QueueInfo;
import com.aliyuncs.ehpc.model.v20180412.ListQueuesResponse.QueueInfo.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQueuesResponseUnmarshaller {

	public static ListQueuesResponse unmarshall(ListQueuesResponse listQueuesResponse, UnmarshallerContext _ctx) {
		
		listQueuesResponse.setRequestId(_ctx.stringValue("ListQueuesResponse.RequestId"));

		List<QueueInfo> queues = new ArrayList<QueueInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListQueuesResponse.Queues.Length"); i++) {
			QueueInfo queueInfo = new QueueInfo();
			queueInfo.setQueueName(_ctx.stringValue("ListQueuesResponse.Queues["+ i +"].QueueName"));
			queueInfo.setType(_ctx.stringValue("ListQueuesResponse.Queues["+ i +"].Type"));
			queueInfo.setResourceGroupId(_ctx.stringValue("ListQueuesResponse.Queues["+ i +"].ResourceGroupId"));
			queueInfo.setHostNamePrefix(_ctx.stringValue("ListQueuesResponse.Queues["+ i +"].HostNamePrefix"));
			queueInfo.setHostNameSuffix(_ctx.stringValue("ListQueuesResponse.Queues["+ i +"].HostNameSuffix"));
			queueInfo.setSpotStrategy(_ctx.stringValue("ListQueuesResponse.Queues["+ i +"].SpotStrategy"));
			queueInfo.setImageId(_ctx.stringValue("ListQueuesResponse.Queues["+ i +"].ImageId"));
			queueInfo.setEnableAutoGrow(_ctx.booleanValue("ListQueuesResponse.Queues["+ i +"].EnableAutoGrow"));

			List<String> computeInstanceType = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListQueuesResponse.Queues["+ i +"].ComputeInstanceType.Length"); j++) {
				computeInstanceType.add(_ctx.stringValue("ListQueuesResponse.Queues["+ i +"].ComputeInstanceType["+ j +"]"));
			}
			queueInfo.setComputeInstanceType(computeInstanceType);

			List<Instance> spotInstanceTypes = new ArrayList<Instance>();
			for (int j = 0; j < _ctx.lengthValue("ListQueuesResponse.Queues["+ i +"].SpotInstanceTypes.Length"); j++) {
				Instance instance = new Instance();
				instance.setInstanceType(_ctx.stringValue("ListQueuesResponse.Queues["+ i +"].SpotInstanceTypes["+ j +"].InstanceType"));
				instance.setSpotPriceLimit(_ctx.floatValue("ListQueuesResponse.Queues["+ i +"].SpotInstanceTypes["+ j +"].SpotPriceLimit"));

				spotInstanceTypes.add(instance);
			}
			queueInfo.setSpotInstanceTypes(spotInstanceTypes);

			queues.add(queueInfo);
		}
		listQueuesResponse.setQueues(queues);
	 
	 	return listQueuesResponse;
	}
}