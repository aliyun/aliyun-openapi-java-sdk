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

package com.aliyuncs.trademark.transform.v20190902;

import com.aliyuncs.trademark.model.v20190902.CreateTrademarkApplicationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTrademarkApplicationResponseUnmarshaller {

	public static CreateTrademarkApplicationResponse unmarshall(CreateTrademarkApplicationResponse createTrademarkApplicationResponse, UnmarshallerContext _ctx) {
		
		createTrademarkApplicationResponse.setRequestId(_ctx.stringValue("CreateTrademarkApplicationResponse.RequestId"));
		createTrademarkApplicationResponse.setOrderId(_ctx.longValue("CreateTrademarkApplicationResponse.OrderId"));
		createTrademarkApplicationResponse.setSuccess(_ctx.booleanValue("CreateTrademarkApplicationResponse.Success"));
		createTrademarkApplicationResponse.setMessage(_ctx.stringValue("CreateTrademarkApplicationResponse.Message"));
	 
	 	return createTrademarkApplicationResponse;
	}
}