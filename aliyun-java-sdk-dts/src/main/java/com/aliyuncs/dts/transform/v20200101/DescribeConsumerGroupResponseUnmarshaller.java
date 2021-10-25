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

import com.aliyuncs.dts.model.v20200101.DescribeConsumerGroupResponse;
import com.aliyuncs.dts.model.v20200101.DescribeConsumerGroupResponse.DescribeConsumerChannel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConsumerGroupResponseUnmarshaller {

	public static DescribeConsumerGroupResponse unmarshall(DescribeConsumerGroupResponse describeConsumerGroupResponse, UnmarshallerContext _ctx) {
		
		describeConsumerGroupResponse.setRequestId(_ctx.stringValue("DescribeConsumerGroupResponse.RequestId"));
		describeConsumerGroupResponse.setPageNumber(_ctx.integerValue("DescribeConsumerGroupResponse.PageNumber"));
		describeConsumerGroupResponse.setPageRecordCount(_ctx.integerValue("DescribeConsumerGroupResponse.PageRecordCount"));
		describeConsumerGroupResponse.setTotalRecordCount(_ctx.integerValue("DescribeConsumerGroupResponse.TotalRecordCount"));
		describeConsumerGroupResponse.setErrCode(_ctx.stringValue("DescribeConsumerGroupResponse.ErrCode"));
		describeConsumerGroupResponse.setErrMessage(_ctx.stringValue("DescribeConsumerGroupResponse.ErrMessage"));
		describeConsumerGroupResponse.setSuccess(_ctx.stringValue("DescribeConsumerGroupResponse.Success"));

		List<DescribeConsumerChannel> consumerChannels = new ArrayList<DescribeConsumerChannel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConsumerGroupResponse.ConsumerChannels.Length"); i++) {
			DescribeConsumerChannel describeConsumerChannel = new DescribeConsumerChannel();
			describeConsumerChannel.setConsumerGroupID(_ctx.stringValue("DescribeConsumerGroupResponse.ConsumerChannels["+ i +"].ConsumerGroupID"));
			describeConsumerChannel.setConsumerGroupName(_ctx.stringValue("DescribeConsumerGroupResponse.ConsumerChannels["+ i +"].ConsumerGroupName"));
			describeConsumerChannel.setConsumerGroupUserName(_ctx.stringValue("DescribeConsumerGroupResponse.ConsumerChannels["+ i +"].ConsumerGroupUserName"));
			describeConsumerChannel.setConsumptionCheckpoint(_ctx.stringValue("DescribeConsumerGroupResponse.ConsumerChannels["+ i +"].ConsumptionCheckpoint"));
			describeConsumerChannel.setMessageDelay(_ctx.longValue("DescribeConsumerGroupResponse.ConsumerChannels["+ i +"].MessageDelay"));
			describeConsumerChannel.setUnconsumedData(_ctx.longValue("DescribeConsumerGroupResponse.ConsumerChannels["+ i +"].UnconsumedData"));

			consumerChannels.add(describeConsumerChannel);
		}
		describeConsumerGroupResponse.setConsumerChannels(consumerChannels);
	 
	 	return describeConsumerGroupResponse;
	}
}