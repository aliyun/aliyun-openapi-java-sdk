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

package com.aliyuncs.config.transform.v20190108;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20190108.DescribeDeliveryChannelsResponse;
import com.aliyuncs.config.model.v20190108.DescribeDeliveryChannelsResponse.DeliveryChannel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeliveryChannelsResponseUnmarshaller {

	public static DescribeDeliveryChannelsResponse unmarshall(DescribeDeliveryChannelsResponse describeDeliveryChannelsResponse, UnmarshallerContext _ctx) {
		
		describeDeliveryChannelsResponse.setRequestId(_ctx.stringValue("DescribeDeliveryChannelsResponse.RequestId"));

		List<DeliveryChannel> deliveryChannels = new ArrayList<DeliveryChannel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeliveryChannelsResponse.DeliveryChannels.Length"); i++) {
			DeliveryChannel deliveryChannel = new DeliveryChannel();
			deliveryChannel.setDeliveryChannelId(_ctx.stringValue("DescribeDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelId"));
			deliveryChannel.setDeliveryChannelName(_ctx.stringValue("DescribeDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelName"));
			deliveryChannel.setDeliveryChannelType(_ctx.stringValue("DescribeDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelType"));
			deliveryChannel.setDeliveryChannelTargetArn(_ctx.stringValue("DescribeDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelTargetArn"));
			deliveryChannel.setDeliveryChannelAssumeRoleArn(_ctx.stringValue("DescribeDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelAssumeRoleArn"));
			deliveryChannel.setDeliveryChannelCondition(_ctx.stringValue("DescribeDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelCondition"));
			deliveryChannel.setDescription(_ctx.stringValue("DescribeDeliveryChannelsResponse.DeliveryChannels["+ i +"].Description"));
			deliveryChannel.setStatus(_ctx.integerValue("DescribeDeliveryChannelsResponse.DeliveryChannels["+ i +"].Status"));

			deliveryChannels.add(deliveryChannel);
		}
		describeDeliveryChannelsResponse.setDeliveryChannels(deliveryChannels);
	 
	 	return describeDeliveryChannelsResponse;
	}
}