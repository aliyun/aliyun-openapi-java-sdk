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

package com.aliyuncs.dts.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20200101.DescribeConsumerChannelResponse;
import com.aliyuncs.dts.model.v20200101.DescribeConsumerChannelResponse.ConsumerChannel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConsumerChannelResponseUnmarshaller {

	public static DescribeConsumerChannelResponse unmarshall(DescribeConsumerChannelResponse describeConsumerChannelResponse, UnmarshallerContext _ctx) {
		
		describeConsumerChannelResponse.setRequestId(_ctx.stringValue("DescribeConsumerChannelResponse.RequestId"));
		describeConsumerChannelResponse.setErrCode(_ctx.stringValue("DescribeConsumerChannelResponse.ErrCode"));
		describeConsumerChannelResponse.setErrMessage(_ctx.stringValue("DescribeConsumerChannelResponse.ErrMessage"));
		describeConsumerChannelResponse.setSuccess(_ctx.stringValue("DescribeConsumerChannelResponse.Success"));
		describeConsumerChannelResponse.setHttpStatusCode(_ctx.stringValue("DescribeConsumerChannelResponse.HttpStatusCode"));
		describeConsumerChannelResponse.setPageNumber(_ctx.integerValue("DescribeConsumerChannelResponse.PageNumber"));
		describeConsumerChannelResponse.setPageRecordCount(_ctx.integerValue("DescribeConsumerChannelResponse.PageRecordCount"));
		describeConsumerChannelResponse.setTotalRecordCount(_ctx.longValue("DescribeConsumerChannelResponse.TotalRecordCount"));

		List<ConsumerChannel> consumerChannels = new ArrayList<ConsumerChannel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConsumerChannelResponse.ConsumerChannels.Length"); i++) {
			ConsumerChannel consumerChannel = new ConsumerChannel();
			consumerChannel.setConsumerGroupId(_ctx.stringValue("DescribeConsumerChannelResponse.ConsumerChannels["+ i +"].ConsumerGroupId"));
			consumerChannel.setConsumerGroupName(_ctx.stringValue("DescribeConsumerChannelResponse.ConsumerChannels["+ i +"].ConsumerGroupName"));
			consumerChannel.setConsumptionCheckpoint(_ctx.stringValue("DescribeConsumerChannelResponse.ConsumerChannels["+ i +"].ConsumptionCheckpoint"));
			consumerChannel.setUnconsumedData(_ctx.longValue("DescribeConsumerChannelResponse.ConsumerChannels["+ i +"].UnconsumedData"));
			consumerChannel.setMessageDelay(_ctx.longValue("DescribeConsumerChannelResponse.ConsumerChannels["+ i +"].MessageDelay"));
			consumerChannel.setConsumerGroupUserName(_ctx.stringValue("DescribeConsumerChannelResponse.ConsumerChannels["+ i +"].ConsumerGroupUserName"));

			consumerChannels.add(consumerChannel);
		}
		describeConsumerChannelResponse.setConsumerChannels(consumerChannels);
	 
	 	return describeConsumerChannelResponse;
	}
}