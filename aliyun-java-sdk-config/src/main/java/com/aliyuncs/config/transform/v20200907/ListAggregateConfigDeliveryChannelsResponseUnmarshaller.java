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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.ListAggregateConfigDeliveryChannelsResponse;
import com.aliyuncs.config.model.v20200907.ListAggregateConfigDeliveryChannelsResponse.DeliveryChannel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAggregateConfigDeliveryChannelsResponseUnmarshaller {

	public static ListAggregateConfigDeliveryChannelsResponse unmarshall(ListAggregateConfigDeliveryChannelsResponse listAggregateConfigDeliveryChannelsResponse, UnmarshallerContext _ctx) {
		
		listAggregateConfigDeliveryChannelsResponse.setRequestId(_ctx.stringValue("ListAggregateConfigDeliveryChannelsResponse.RequestId"));

		List<DeliveryChannel> deliveryChannels = new ArrayList<DeliveryChannel>();
		for (int i = 0; i < _ctx.lengthValue("ListAggregateConfigDeliveryChannelsResponse.DeliveryChannels.Length"); i++) {
			DeliveryChannel deliveryChannel = new DeliveryChannel();
			deliveryChannel.setStatus(_ctx.integerValue("ListAggregateConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].Status"));
			deliveryChannel.setDeliveryChannelName(_ctx.stringValue("ListAggregateConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelName"));
			deliveryChannel.setDeliveryChannelId(_ctx.stringValue("ListAggregateConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelId"));
			deliveryChannel.setDeliveryChannelType(_ctx.stringValue("ListAggregateConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelType"));
			deliveryChannel.setDeliveryChannelTargetArn(_ctx.stringValue("ListAggregateConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelTargetArn"));
			deliveryChannel.setDeliveryChannelAssumeRoleArn(_ctx.stringValue("ListAggregateConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelAssumeRoleArn"));
			deliveryChannel.setDeliveryChannelCondition(_ctx.stringValue("ListAggregateConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelCondition"));
			deliveryChannel.setOversizedDataOSSTargetArn(_ctx.stringValue("ListAggregateConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].OversizedDataOSSTargetArn"));
			deliveryChannel.setDescription(_ctx.stringValue("ListAggregateConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].Description"));
			deliveryChannel.setConfigurationSnapshot(_ctx.booleanValue("ListAggregateConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].ConfigurationSnapshot"));
			deliveryChannel.setConfigurationItemChangeNotification(_ctx.booleanValue("ListAggregateConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].ConfigurationItemChangeNotification"));
			deliveryChannel.setNonCompliantNotification(_ctx.booleanValue("ListAggregateConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].NonCompliantNotification"));
			deliveryChannel.setAggregatorId(_ctx.stringValue("ListAggregateConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].AggregatorId"));
			deliveryChannel.setAccountId(_ctx.longValue("ListAggregateConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].AccountId"));

			deliveryChannels.add(deliveryChannel);
		}
		listAggregateConfigDeliveryChannelsResponse.setDeliveryChannels(deliveryChannels);
	 
	 	return listAggregateConfigDeliveryChannelsResponse;
	}
}