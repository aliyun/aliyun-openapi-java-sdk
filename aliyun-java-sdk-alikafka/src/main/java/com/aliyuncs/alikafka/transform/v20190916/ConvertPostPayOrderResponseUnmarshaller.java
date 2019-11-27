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

package com.aliyuncs.alikafka.transform.v20190916;

import com.aliyuncs.alikafka.model.v20190916.ConvertPostPayOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConvertPostPayOrderResponseUnmarshaller {

	public static ConvertPostPayOrderResponse unmarshall(ConvertPostPayOrderResponse convertPostPayOrderResponse, UnmarshallerContext _ctx) {
		
		convertPostPayOrderResponse.setRequestId(_ctx.stringValue("ConvertPostPayOrderResponse.RequestId"));
		convertPostPayOrderResponse.setSuccess(_ctx.booleanValue("ConvertPostPayOrderResponse.Success"));
		convertPostPayOrderResponse.setCode(_ctx.integerValue("ConvertPostPayOrderResponse.Code"));
		convertPostPayOrderResponse.setMessage(_ctx.stringValue("ConvertPostPayOrderResponse.Message"));
		convertPostPayOrderResponse.setOrderId(_ctx.stringValue("ConvertPostPayOrderResponse.OrderId"));
	 
	 	return convertPostPayOrderResponse;
	}
}