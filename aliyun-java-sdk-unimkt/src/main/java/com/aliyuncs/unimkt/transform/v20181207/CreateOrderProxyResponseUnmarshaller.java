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

package com.aliyuncs.unimkt.transform.v20181207;

import com.aliyuncs.unimkt.model.v20181207.CreateOrderProxyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrderProxyResponseUnmarshaller {

	public static CreateOrderProxyResponse unmarshall(CreateOrderProxyResponse createOrderProxyResponse, UnmarshallerContext _ctx) {
		
		createOrderProxyResponse.setRequestId(_ctx.stringValue("CreateOrderProxyResponse.RequestId"));
		createOrderProxyResponse.setStatus(_ctx.booleanValue("CreateOrderProxyResponse.Status"));
		createOrderProxyResponse.setMsg(_ctx.stringValue("CreateOrderProxyResponse.Msg"));
		createOrderProxyResponse.setAliPayOrderId(_ctx.stringValue("CreateOrderProxyResponse.AliPayOrderId"));
		createOrderProxyResponse.setErrorCode(_ctx.stringValue("CreateOrderProxyResponse.ErrorCode"));
	 
	 	return createOrderProxyResponse;
	}
}