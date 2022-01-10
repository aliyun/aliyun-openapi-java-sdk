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

package com.aliyuncs.commondriver.transform.v20160712;

import com.aliyuncs.commondriver.model.v20160712.CreateOrderIapResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrderIapResponseUnmarshaller {

	public static CreateOrderIapResponse unmarshall(CreateOrderIapResponse createOrderIapResponse, UnmarshallerContext _ctx) {
		
		createOrderIapResponse.setRequestId(_ctx.stringValue("CreateOrderIapResponse.RequestId"));
		createOrderIapResponse.setCode(_ctx.stringValue("CreateOrderIapResponse.Code"));
		createOrderIapResponse.setMessage(_ctx.stringValue("CreateOrderIapResponse.Message"));
		createOrderIapResponse.setData(_ctx.stringValue("CreateOrderIapResponse.Data"));
		createOrderIapResponse.setSuccess(_ctx.booleanValue("CreateOrderIapResponse.Success"));
	 
	 	return createOrderIapResponse;
	}
}