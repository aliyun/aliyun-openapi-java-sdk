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

package com.aliyuncs.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardbx.model.v20200202.CreatePolarxOrderResponse;
import com.aliyuncs.polardbx.model.v20200202.CreatePolarxOrderResponse.OrderResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePolarxOrderResponseUnmarshaller {

	public static CreatePolarxOrderResponse unmarshall(CreatePolarxOrderResponse createPolarxOrderResponse, UnmarshallerContext _ctx) {
		
		createPolarxOrderResponse.setRequestId(_ctx.stringValue("CreatePolarxOrderResponse.RequestId"));

		List<OrderResult> orderResultList = new ArrayList<OrderResult>();
		for (int i = 0; i < _ctx.lengthValue("CreatePolarxOrderResponse.OrderResultList.Length"); i++) {
			OrderResult orderResult = new OrderResult();
			orderResult.setOrderId(_ctx.longValue("CreatePolarxOrderResponse.OrderResultList["+ i +"].OrderId"));
			orderResult.setDBInstanceName(_ctx.stringValue("CreatePolarxOrderResponse.OrderResultList["+ i +"].DBInstanceName"));

			orderResultList.add(orderResult);
		}
		createPolarxOrderResponse.setOrderResultList(orderResultList);
	 
	 	return createPolarxOrderResponse;
	}
}