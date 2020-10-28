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

package com.aliyuncs.drds.transform.v20161213;

import com.aliyuncs.drds.model.v20161213.OrderRefundResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OrderRefundResponseUnmarshaller {

	public static OrderRefundResponse unmarshall(OrderRefundResponse orderRefundResponse, UnmarshallerContext _ctx) {
		
		orderRefundResponse.setRequestId(_ctx.stringValue("OrderRefundResponse.requestId"));
		orderRefundResponse.setData(_ctx.stringValue("OrderRefundResponse.data"));
		orderRefundResponse.setCode(_ctx.stringValue("OrderRefundResponse.code"));
		orderRefundResponse.setSuccess(_ctx.booleanValue("OrderRefundResponse.success"));
		orderRefundResponse.setMessage(_ctx.stringValue("OrderRefundResponse.message"));
	 
	 	return orderRefundResponse;
	}
}