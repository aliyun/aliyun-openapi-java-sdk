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

import com.aliyuncs.resourcecenter.model.v20221201.ListDeliveryChannelsResponse;
import com.aliyuncs.resourcecenter.model.v20221201.ListDeliveryChannelsResponse.DeliveryChannel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeliveryChannelsResponseUnmarshaller {

	public static ListDeliveryChannelsResponse unmarshall(ListDeliveryChannelsResponse listDeliveryChannelsResponse, UnmarshallerContext _ctx) {
		
		listDeliveryChannelsResponse.setRequestId(_ctx.stringValue("ListDeliveryChannelsResponse.RequestId"));
		listDeliveryChannelsResponse.setMaxResults(_ctx.integerValue("ListDeliveryChannelsResponse.MaxResults"));
		listDeliveryChannelsResponse.setNextToken(_ctx.stringValue("ListDeliveryChannelsResponse.NextToken"));

		List<DeliveryChannel> deliveryChannels = new ArrayList<DeliveryChannel>();
		for (int i = 0; i < _ctx.lengthValue("ListDeliveryChannelsResponse.DeliveryChannels.Length"); i++) {
			DeliveryChannel deliveryChannel = new DeliveryChannel();
			deliveryChannel.setCreateTime(_ctx.stringValue("ListDeliveryChannelsResponse.DeliveryChannels["+ i +"].CreateTime"));
			deliveryChannel.setDeliveryChannelDescription(_ctx.stringValue("ListDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelDescription"));
			deliveryChannel.setDeliveryChannelId(_ctx.stringValue("ListDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelId"));
			deliveryChannel.setDeliveryChannelName(_ctx.stringValue("ListDeliveryChannelsResponse.DeliveryChannels["+ i +"].DeliveryChannelName"));

			deliveryChannels.add(deliveryChannel);
		}
		listDeliveryChannelsResponse.setDeliveryChannels(deliveryChannels);
	 
	 	return listDeliveryChannelsResponse;
	}
}