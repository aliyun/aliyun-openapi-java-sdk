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

import com.aliyuncs.config.model.v20200907.GetAggregateConfigDeliveryChannelResponse;
import com.aliyuncs.config.model.v20200907.GetAggregateConfigDeliveryChannelResponse.DeliveryChannel;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAggregateConfigDeliveryChannelResponseUnmarshaller {

	public static GetAggregateConfigDeliveryChannelResponse unmarshall(GetAggregateConfigDeliveryChannelResponse getAggregateConfigDeliveryChannelResponse, UnmarshallerContext _ctx) {
		
		getAggregateConfigDeliveryChannelResponse.setRequestId(_ctx.stringValue("GetAggregateConfigDeliveryChannelResponse.RequestId"));

		DeliveryChannel deliveryChannel = new DeliveryChannel();
		deliveryChannel.setStatus(_ctx.integerValue("GetAggregateConfigDeliveryChannelResponse.DeliveryChannel.Status"));
		deliveryChannel.setDeliveryChannelId(_ctx.stringValue("GetAggregateConfigDeliveryChannelResponse.DeliveryChannel.DeliveryChannelId"));
		deliveryChannel.setDeliveryChannelName(_ctx.stringValue("GetAggregateConfigDeliveryChannelResponse.DeliveryChannel.DeliveryChannelName"));
		deliveryChannel.setDeliveryChannelType(_ctx.stringValue("GetAggregateConfigDeliveryChannelResponse.DeliveryChannel.DeliveryChannelType"));
		deliveryChannel.setDeliveryChannelTargetArn(_ctx.stringValue("GetAggregateConfigDeliveryChannelResponse.DeliveryChannel.DeliveryChannelTargetArn"));
		deliveryChannel.setDeliveryChannelAssumeRoleArn(_ctx.stringValue("GetAggregateConfigDeliveryChannelResponse.DeliveryChannel.DeliveryChannelAssumeRoleArn"));
		deliveryChannel.setDeliveryChannelCondition(_ctx.stringValue("GetAggregateConfigDeliveryChannelResponse.DeliveryChannel.DeliveryChannelCondition"));
		deliveryChannel.setOversizedDataOSSTargetArn(_ctx.stringValue("GetAggregateConfigDeliveryChannelResponse.DeliveryChannel.OversizedDataOSSTargetArn"));
		deliveryChannel.setDescription(_ctx.stringValue("GetAggregateConfigDeliveryChannelResponse.DeliveryChannel.Description"));
		deliveryChannel.setConfigurationSnapshot(_ctx.booleanValue("GetAggregateConfigDeliveryChannelResponse.DeliveryChannel.ConfigurationSnapshot"));
		deliveryChannel.setConfigurationItemChangeNotification(_ctx.booleanValue("GetAggregateConfigDeliveryChannelResponse.DeliveryChannel.ConfigurationItemChangeNotification"));
		deliveryChannel.setNonCompliantNotification(_ctx.booleanValue("GetAggregateConfigDeliveryChannelResponse.DeliveryChannel.NonCompliantNotification"));
		deliveryChannel.setAggregatorId(_ctx.stringValue("GetAggregateConfigDeliveryChannelResponse.DeliveryChannel.AggregatorId"));
		deliveryChannel.setAccountId(_ctx.stringValue("GetAggregateConfigDeliveryChannelResponse.DeliveryChannel.AccountId"));
		getAggregateConfigDeliveryChannelResponse.setDeliveryChannel(deliveryChannel);
	 
	 	return getAggregateConfigDeliveryChannelResponse;
	}
}