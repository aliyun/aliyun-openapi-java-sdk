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

import com.aliyuncs.config.model.v20200907.ListConfigDeliveryChannelsResponse;
import com.aliyuncs.config.model.v20200907.ListConfigDeliveryChannelsResponse.DeliveryChannel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConfigDeliveryChannelsResponseUnmarshaller {

	public static ListConfigDeliveryChannelsResponse unmarshall(ListConfigDeliveryChannelsResponse listConfigDeliveryChannelsResponse, UnmarshallerContext _ctx) {
		
		listConfigDeliveryChannelsResponse.setRequestId(_ctx.stringValue("ListConfigDeliveryChannelsResponse.RequestId"));

		List<DeliveryChannel> deliveryChannels = new ArrayList<DeliveryChannel>();
		for (int i = 0; i < _ctx.lengthValue("ListConfigDeliveryChannelsResponse.DeliveryChannels.Length"); i++) {
			DeliveryChannel deliveryChannel = new DeliveryChannel();
			deliveryChannel.setStatus(_ctx.integerValue("ListConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].Status"));
			deliveryChannel.setDeliveryChannelName(_ctx.stringValue("ListConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelName"));
			deliveryChannel.setDeliveryChannelId(_ctx.stringValue("ListConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelId"));
			deliveryChannel.setDeliveryChannelType(_ctx.stringValue("ListConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelType"));
			deliveryChannel.setDeliveryChannelTargetArn(_ctx.stringValue("ListConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelTargetArn"));
			deliveryChannel.setDeliveryChannelAssumeRoleArn(_ctx.stringValue("ListConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelAssumeRoleArn"));
			deliveryChannel.setDeliveryChannelCondition(_ctx.stringValue("ListConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelCondition"));
			deliveryChannel.setOversizedDataOSSTargetArn(_ctx.stringValue("ListConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].OversizedDataOSSTargetArn"));
			deliveryChannel.setDescription(_ctx.stringValue("ListConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].Description"));
			deliveryChannel.setConfigurationSnapshot(_ctx.booleanValue("ListConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].ConfigurationSnapshot"));
			deliveryChannel.setConfigurationItemChangeNotification(_ctx.booleanValue("ListConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].ConfigurationItemChangeNotification"));
			deliveryChannel.setNonCompliantNotification(_ctx.booleanValue("ListConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].NonCompliantNotification"));
			deliveryChannel.setAccountId(_ctx.longValue("ListConfigDeliveryChannelsResponse.DeliveryChannels["+ i +"].AccountId"));

			deliveryChannels.add(deliveryChannel);
		}
		listConfigDeliveryChannelsResponse.setDeliveryChannels(deliveryChannels);
	 
	 	return listConfigDeliveryChannelsResponse;
	}
}