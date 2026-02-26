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

package com.aliyuncs.resourcecenter.transform.v20221201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcecenter.model.v20221201.ListMultiAccountDeliveryChannelsResponse;
import com.aliyuncs.resourcecenter.model.v20221201.ListMultiAccountDeliveryChannelsResponse.DeliveryChannel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMultiAccountDeliveryChannelsResponseUnmarshaller {

	public static ListMultiAccountDeliveryChannelsResponse unmarshall(ListMultiAccountDeliveryChannelsResponse listMultiAccountDeliveryChannelsResponse, UnmarshallerContext _ctx) {
		
		listMultiAccountDeliveryChannelsResponse.setRequestId(_ctx.stringValue("ListMultiAccountDeliveryChannelsResponse.RequestId"));
		listMultiAccountDeliveryChannelsResponse.setMaxResults(_ctx.integerValue("ListMultiAccountDeliveryChannelsResponse.MaxResults"));
		listMultiAccountDeliveryChannelsResponse.setNextToken(_ctx.stringValue("ListMultiAccountDeliveryChannelsResponse.NextToken"));

		List<DeliveryChannel> deliveryChannels = new ArrayList<DeliveryChannel>();
		for (int i = 0; i < _ctx.lengthValue("ListMultiAccountDeliveryChannelsResponse.DeliveryChannels.Length"); i++) {
			DeliveryChannel deliveryChannel = new DeliveryChannel();
			deliveryChannel.setCreateTime(_ctx.stringValue("ListMultiAccountDeliveryChannelsResponse.DeliveryChannels["+ i +"].CreateTime"));
			deliveryChannel.setDeliveryChannelDescription(_ctx.stringValue("ListMultiAccountDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelDescription"));
			deliveryChannel.setDeliveryChannelId(_ctx.stringValue("ListMultiAccountDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelId"));
			deliveryChannel.setDeliveryChannelName(_ctx.stringValue("ListMultiAccountDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelName"));

			deliveryChannels.add(deliveryChannel);
		}
		listMultiAccountDeliveryChannelsResponse.setDeliveryChannels(deliveryChannels);
	 
	 	return listMultiAccountDeliveryChannelsResponse;
	}
}