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

package com.aliyuncs.intlmarket.transform.v20250812;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.intlmarket.model.v20250812.CreateOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrderResponseUnmarshaller {

	public static CreateOrderResponse unmarshall(CreateOrderResponse createOrderResponse, UnmarshallerContext _ctx) {
		
		createOrderResponse.setRequestId(_ctx.stringValue("CreateOrderResponse.RequestId"));
		createOrderResponse.setOrderId(_ctx.stringValue("CreateOrderResponse.OrderId"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrderResponse.InstanceIds.Length"); i++) {
			instanceIds.add(_ctx.stringValue("CreateOrderResponse.InstanceIds["+ i +"]"));
		}
		createOrderResponse.setInstanceIds(instanceIds);
	 
	 	return createOrderResponse;
	}
}