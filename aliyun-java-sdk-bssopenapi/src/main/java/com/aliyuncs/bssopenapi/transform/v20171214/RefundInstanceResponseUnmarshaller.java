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

package com.aliyuncs.bssopenapi.transform.v20171214;

import com.aliyuncs.bssopenapi.model.v20171214.RefundInstanceResponse;
import com.aliyuncs.bssopenapi.model.v20171214.RefundInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RefundInstanceResponseUnmarshaller {

	public static RefundInstanceResponse unmarshall(RefundInstanceResponse refundInstanceResponse, UnmarshallerContext _ctx) {
		
		refundInstanceResponse.setRequestId(_ctx.stringValue("RefundInstanceResponse.RequestId"));
		refundInstanceResponse.setMessage(_ctx.stringValue("RefundInstanceResponse.Message"));
		refundInstanceResponse.setCode(_ctx.stringValue("RefundInstanceResponse.Code"));
		refundInstanceResponse.setSuccess(_ctx.booleanValue("RefundInstanceResponse.Success"));

		Data data = new Data();
		data.setHostId(_ctx.stringValue("RefundInstanceResponse.Data.HostId"));
		data.setOrderId(_ctx.longValue("RefundInstanceResponse.Data.OrderId"));
		refundInstanceResponse.setData(data);
	 
	 	return refundInstanceResponse;
	}
}