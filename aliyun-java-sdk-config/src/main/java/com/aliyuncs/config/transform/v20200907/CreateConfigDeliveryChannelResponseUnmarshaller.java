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

import com.aliyuncs.config.model.v20200907.CreateConfigDeliveryChannelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateConfigDeliveryChannelResponseUnmarshaller {

	public static CreateConfigDeliveryChannelResponse unmarshall(CreateConfigDeliveryChannelResponse createConfigDeliveryChannelResponse, UnmarshallerContext _ctx) {
		
		createConfigDeliveryChannelResponse.setRequestId(_ctx.stringValue("CreateConfigDeliveryChannelResponse.RequestId"));
		createConfigDeliveryChannelResponse.setDeliveryChannelId(_ctx.stringValue("CreateConfigDeliveryChannelResponse.DeliveryChannelId"));
	 
	 	return createConfigDeliveryChannelResponse;
	}
}