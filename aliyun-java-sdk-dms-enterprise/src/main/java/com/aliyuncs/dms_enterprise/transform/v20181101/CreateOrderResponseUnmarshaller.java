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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.CreateOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrderResponseUnmarshaller {

	public static CreateOrderResponse unmarshall(CreateOrderResponse createOrderResponse, UnmarshallerContext _ctx) {
		
		createOrderResponse.setRequestId(_ctx.stringValue("CreateOrderResponse.RequestId"));
		createOrderResponse.setErrorCode(_ctx.stringValue("CreateOrderResponse.ErrorCode"));
		createOrderResponse.setErrorMessage(_ctx.stringValue("CreateOrderResponse.ErrorMessage"));
		createOrderResponse.setSuccess(_ctx.booleanValue("CreateOrderResponse.Success"));

		List<Long> createOrderResult = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrderResponse.CreateOrderResult.Length"); i++) {
			createOrderResult.add(_ctx.longValue("CreateOrderResponse.CreateOrderResult["+ i +"]"));
		}
		createOrderResponse.setCreateOrderResult(createOrderResult);
	 
	 	return createOrderResponse;
	}
}