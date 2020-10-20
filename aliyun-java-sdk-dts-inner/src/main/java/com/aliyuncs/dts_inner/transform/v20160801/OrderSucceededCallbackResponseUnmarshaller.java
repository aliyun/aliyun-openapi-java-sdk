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

package com.aliyuncs.dts_inner.transform.v20160801;

import com.aliyuncs.dts_inner.model.v20160801.OrderSucceededCallbackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OrderSucceededCallbackResponseUnmarshaller {

	public static OrderSucceededCallbackResponse unmarshall(OrderSucceededCallbackResponse orderSucceededCallbackResponse, UnmarshallerContext _ctx) {
		
		orderSucceededCallbackResponse.setRequestId(_ctx.stringValue("OrderSucceededCallbackResponse.requestId"));
		orderSucceededCallbackResponse.setData(_ctx.stringValue("OrderSucceededCallbackResponse.data"));
		orderSucceededCallbackResponse.setSuccess(_ctx.booleanValue("OrderSucceededCallbackResponse.success"));
		orderSucceededCallbackResponse.setCode(_ctx.stringValue("OrderSucceededCallbackResponse.code"));
		orderSucceededCallbackResponse.setMessage(_ctx.stringValue("OrderSucceededCallbackResponse.message"));
	 
	 	return orderSucceededCallbackResponse;
	}
}