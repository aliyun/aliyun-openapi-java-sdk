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

import com.aliyuncs.config.model.v20200907.CreateAggregateConfigDeliveryChannelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAggregateConfigDeliveryChannelResponseUnmarshaller {

	public static CreateAggregateConfigDeliveryChannelResponse unmarshall(CreateAggregateConfigDeliveryChannelResponse createAggregateConfigDeliveryChannelResponse, UnmarshallerContext _ctx) {
		
		createAggregateConfigDeliveryChannelResponse.setRequestId(_ctx.stringValue("CreateAggregateConfigDeliveryChannelResponse.RequestId"));
		createAggregateConfigDeliveryChannelResponse.setDeliveryChannelId(_ctx.stringValue("CreateAggregateConfigDeliveryChannelResponse.DeliveryChannelId"));
	 
	 	return createAggregateConfigDeliveryChannelResponse;
	}
}