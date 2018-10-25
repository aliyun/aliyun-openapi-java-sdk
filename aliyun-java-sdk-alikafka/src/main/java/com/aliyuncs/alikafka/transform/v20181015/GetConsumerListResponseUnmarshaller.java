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

package com.aliyuncs.alikafka.transform.v20181015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alikafka.model.v20181015.GetConsumerListResponse;
import com.aliyuncs.alikafka.model.v20181015.GetConsumerListResponse.ConsumerListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConsumerListResponseUnmarshaller {

	public static GetConsumerListResponse unmarshall(GetConsumerListResponse getConsumerListResponse, UnmarshallerContext context) {
		
		getConsumerListResponse.setRequestId(context.stringValue("GetConsumerListResponse.RequestId"));
		getConsumerListResponse.setSuccess(context.booleanValue("GetConsumerListResponse.Success"));
		getConsumerListResponse.setCode(context.integerValue("GetConsumerListResponse.Code"));
		getConsumerListResponse.setMessage(context.stringValue("GetConsumerListResponse.Message"));

		List<ConsumerListItem> consumerList = new ArrayList<ConsumerListItem>();
		for (int i = 0; i < context.lengthValue("GetConsumerListResponse.ConsumerList.Length"); i++) {
			ConsumerListItem consumerListItem = new ConsumerListItem();
			consumerListItem.setRegionId(context.stringValue("GetConsumerListResponse.ConsumerList["+ i +"].RegionId"));
			consumerListItem.setInstanceId(context.stringValue("GetConsumerListResponse.ConsumerList["+ i +"].InstanceId"));
			consumerListItem.setConsumerId(context.stringValue("GetConsumerListResponse.ConsumerList["+ i +"].ConsumerId"));

			consumerList.add(consumerListItem);
		}
		getConsumerListResponse.setConsumerList(consumerList);
	 
	 	return getConsumerListResponse;
	}
}