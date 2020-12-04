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

package com.aliyuncs.cloudgameapi.transform.v20200728;

import com.aliyuncs.cloudgameapi.model.v20200728.DeliveryOrderResponse;
import com.aliyuncs.cloudgameapi.model.v20200728.DeliveryOrderResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeliveryOrderResponseUnmarshaller {

	public static DeliveryOrderResponse unmarshall(DeliveryOrderResponse deliveryOrderResponse, UnmarshallerContext _ctx) {
		
		deliveryOrderResponse.setRequestId(_ctx.stringValue("DeliveryOrderResponse.RequestId"));

		Data data = new Data();
		data.setDeliveryStatus(_ctx.stringValue("DeliveryOrderResponse.Data.DeliveryStatus"));
		deliveryOrderResponse.setData(data);
	 
	 	return deliveryOrderResponse;
	}
}