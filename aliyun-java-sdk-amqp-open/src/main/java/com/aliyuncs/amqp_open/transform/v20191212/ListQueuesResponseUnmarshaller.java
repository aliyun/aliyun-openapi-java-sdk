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

import com.aliyuncs.amqp_open.model.v20191212.ListQueuesResponse;
import com.aliyuncs.amqp_open.model.v20191212.ListQueuesResponse.Data;
import com.aliyuncs.amqp_open.model.v20191212.ListQueuesResponse.Data.QueueVO;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQueuesResponseUnmarshaller {

	public static ListQueuesResponse unmarshall(ListQueuesResponse listQueuesResponse, UnmarshallerContext _ctx) {
		
		listQueuesResponse.setRequestId(_ctx.stringValue("ListQueuesResponse.RequestId"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListQueuesResponse.Data.NextToken"));
		data.setMaxResults(_ctx.integerValue("ListQueuesResponse.Data.MaxResults"));

		List<QueueVO> queues = new ArrayList<QueueVO>();
		for (int i = 0; i < _ctx.lengthValue("ListQueuesResponse.Data.Queues.Length"); i++) {
			QueueVO queueVO = new QueueVO();
			queueVO.setName(_ctx.stringValue("ListQueuesResponse.Data.Queues["+ i +"].Name"));
			queueVO.setOwnerId(_ctx.stringValue("ListQueuesResponse.Data.Queues["+ i +"].OwnerId"));
			queueVO.setVHostName(_ctx.stringValue("ListQueuesResponse.Data.Queues["+ i +"].VHostName"));
			queueVO.setAutoDeleteState(_ctx.booleanValue("ListQueuesResponse.Data.Queues["+ i +"].AutoDeleteState"));
			queueVO.setExclusiveState(_ctx.booleanValue("ListQueuesResponse.Data.Queues["+ i +"].ExclusiveState"));
			queueVO.setCreateTime(_ctx.longValue("ListQueuesResponse.Data.Queues["+ i +"].CreateTime"));
			queueVO.setLastConsumeTime(_ctx.longValue("ListQueuesResponse.Data.Queues["+ i +"].LastConsumeTime"));
			queueVO.setAttributes(_ctx.mapValue("ListQueuesResponse.Data.Queues["+ i +"].Attributes"));

			queues.add(queueVO);
		}
		data.setQueues(queues);
		listQueuesResponse.setData(data);
	 
	 	return listQueuesResponse;
	}
}