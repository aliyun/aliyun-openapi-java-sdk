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

package com.aliyuncs.amqp_open.transform.v20191212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.amqp_open.model.v20191212.ListQueueConsumersResponse;
import com.aliyuncs.amqp_open.model.v20191212.ListQueueConsumersResponse.Data;
import com.aliyuncs.amqp_open.model.v20191212.ListQueueConsumersResponse.Data.QueueConsumerVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQueueConsumersResponseUnmarshaller {

	public static ListQueueConsumersResponse unmarshall(ListQueueConsumersResponse listQueueConsumersResponse, UnmarshallerContext _ctx) {
		
		listQueueConsumersResponse.setRequestId(_ctx.stringValue("ListQueueConsumersResponse.RequestId"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListQueueConsumersResponse.Data.NextToken"));
		data.setMaxResults(_ctx.integerValue("ListQueueConsumersResponse.Data.MaxResults"));

		List<QueueConsumerVO> consumers = new ArrayList<QueueConsumerVO>();
		for (int i = 0; i < _ctx.lengthValue("ListQueueConsumersResponse.Data.Consumers.Length"); i++) {
			QueueConsumerVO queueConsumerVO = new QueueConsumerVO();
			queueConsumerVO.setConsumerTag(_ctx.stringValue("ListQueueConsumersResponse.Data.Consumers["+ i +"].ConsumerTag"));

			consumers.add(queueConsumerVO);
		}
		data.setConsumers(consumers);
		listQueueConsumersResponse.setData(data);
	 
	 	return listQueueConsumersResponse;
	}
}