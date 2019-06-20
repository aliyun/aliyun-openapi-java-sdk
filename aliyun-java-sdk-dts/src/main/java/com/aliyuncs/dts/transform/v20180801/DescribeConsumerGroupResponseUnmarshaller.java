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

package com.aliyuncs.dts.transform.v20180801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20180801.DescribeConsumerGroupResponse;
import com.aliyuncs.dts.model.v20180801.DescribeConsumerGroupResponse.DescribeConsumerChannel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConsumerGroupResponseUnmarshaller {

	public static DescribeConsumerGroupResponse unmarshall(DescribeConsumerGroupResponse describeConsumerGroupResponse, UnmarshallerContext context) {
		
		describeConsumerGroupResponse.setPageNumber(context.integerValue("DescribeConsumerGroupResponse.PageNumber"));
		describeConsumerGroupResponse.setTotalRecordCount(context.integerValue("DescribeConsumerGroupResponse.TotalRecordCount"));
		describeConsumerGroupResponse.setPageRecordCount(context.integerValue("DescribeConsumerGroupResponse.PageRecordCount"));

		List<DescribeConsumerChannel> consumerChannels = new ArrayList<DescribeConsumerChannel>();
		for (int i = 0; i < context.lengthValue("DescribeConsumerGroupResponse.ConsumerChannels.Length"); i++) {
			DescribeConsumerChannel describeConsumerChannel = new DescribeConsumerChannel();
			describeConsumerChannel.setConsumerGroupID(context.stringValue("DescribeConsumerGroupResponse.ConsumerChannels["+ i +"].ConsumerGroupID"));
			describeConsumerChannel.setConsumerGroupName(context.stringValue("DescribeConsumerGroupResponse.ConsumerChannels["+ i +"].ConsumerGroupName"));
			describeConsumerChannel.setConsumptionCheckpoint(context.stringValue("DescribeConsumerGroupResponse.ConsumerChannels["+ i +"].ConsumptionCheckpoint"));
			describeConsumerChannel.setUnconsumedData(context.longValue("DescribeConsumerGroupResponse.ConsumerChannels["+ i +"].UnconsumedData"));
			describeConsumerChannel.setMessageDelay(context.longValue("DescribeConsumerGroupResponse.ConsumerChannels["+ i +"].MessageDelay"));
			describeConsumerChannel.setConsumerGroupUserName(context.stringValue("DescribeConsumerGroupResponse.ConsumerChannels["+ i +"].ConsumerGroupUserName"));

			consumerChannels.add(describeConsumerChannel);
		}
		describeConsumerGroupResponse.setConsumerChannels(consumerChannels);
	 
	 	return describeConsumerGroupResponse;
	}
}