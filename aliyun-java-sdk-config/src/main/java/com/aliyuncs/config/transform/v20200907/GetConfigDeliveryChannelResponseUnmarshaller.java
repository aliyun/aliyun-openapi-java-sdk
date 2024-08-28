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

import com.aliyuncs.config.model.v20200907.GetConfigDeliveryChannelResponse;
import com.aliyuncs.config.model.v20200907.GetConfigDeliveryChannelResponse.DeliveryChannel;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConfigDeliveryChannelResponseUnmarshaller {

	public static GetConfigDeliveryChannelResponse unmarshall(GetConfigDeliveryChannelResponse getConfigDeliveryChannelResponse, UnmarshallerContext _ctx) {
		
		getConfigDeliveryChannelResponse.setRequestId(_ctx.stringValue("GetConfigDeliveryChannelResponse.RequestId"));

		DeliveryChannel deliveryChannel = new DeliveryChannel();
		deliveryChannel.setAccountId(_ctx.longValue("GetConfigDeliveryChannelResponse.DeliveryChannel.AccountId"));
		deliveryChannel.setCompliantSnapshot(_ctx.booleanValue("GetConfigDeliveryChannelResponse.DeliveryChannel.CompliantSnapshot"));
		deliveryChannel.setConfigurationItemChangeNotification(_ctx.booleanValue("GetConfigDeliveryChannelResponse.DeliveryChannel.ConfigurationItemChangeNotification"));
		deliveryChannel.setConfigurationSnapshot(_ctx.booleanValue("GetConfigDeliveryChannelResponse.DeliveryChannel.ConfigurationSnapshot"));
		deliveryChannel.setDeliveryChannelAssumeRoleArn(_ctx.stringValue("GetConfigDeliveryChannelResponse.DeliveryChannel.DeliveryChannelAssumeRoleArn"));
		deliveryChannel.setDeliveryChannelCondition(_ctx.stringValue("GetConfigDeliveryChannelResponse.DeliveryChannel.DeliveryChannelCondition"));
		deliveryChannel.setDeliveryChannelId(_ctx.stringValue("GetConfigDeliveryChannelResponse.DeliveryChannel.DeliveryChannelId"));
		deliveryChannel.setDeliveryChannelName(_ctx.stringValue("GetConfigDeliveryChannelResponse.DeliveryChannel.DeliveryChannelName"));
		deliveryChannel.setDeliveryChannelTargetArn(_ctx.stringValue("GetConfigDeliveryChannelResponse.DeliveryChannel.DeliveryChannelTargetArn"));
		deliveryChannel.setDeliveryChannelType(_ctx.stringValue("GetConfigDeliveryChannelResponse.DeliveryChannel.DeliveryChannelType"));
		deliveryChannel.setDeliverySnapshotTime(_ctx.stringValue("GetConfigDeliveryChannelResponse.DeliveryChannel.DeliverySnapshotTime"));
		deliveryChannel.setDescription(_ctx.stringValue("GetConfigDeliveryChannelResponse.DeliveryChannel.Description"));
		deliveryChannel.setNonCompliantNotification(_ctx.booleanValue("GetConfigDeliveryChannelResponse.DeliveryChannel.NonCompliantNotification"));
		deliveryChannel.setOversizedDataOSSTargetArn(_ctx.stringValue("GetConfigDeliveryChannelResponse.DeliveryChannel.OversizedDataOSSTargetArn"));
		deliveryChannel.setStatus(_ctx.integerValue("GetConfigDeliveryChannelResponse.DeliveryChannel.Status"));
		getConfigDeliveryChannelResponse.setDeliveryChannel(deliveryChannel);
	 
	 	return getConfigDeliveryChannelResponse;
	}
}