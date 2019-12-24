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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.AbortChangeOrderResponse;
import com.aliyuncs.edas.model.v20170801.AbortChangeOrderResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AbortChangeOrderResponseUnmarshaller {

	public static AbortChangeOrderResponse unmarshall(AbortChangeOrderResponse abortChangeOrderResponse, UnmarshallerContext _ctx) {
		
		abortChangeOrderResponse.setRequestId(_ctx.stringValue("AbortChangeOrderResponse.RequestId"));
		abortChangeOrderResponse.setCode(_ctx.integerValue("AbortChangeOrderResponse.Code"));
		abortChangeOrderResponse.setErrorCode(_ctx.stringValue("AbortChangeOrderResponse.ErrorCode"));
		abortChangeOrderResponse.setMessage(_ctx.stringValue("AbortChangeOrderResponse.Message"));
		abortChangeOrderResponse.setTraceId(_ctx.stringValue("AbortChangeOrderResponse.TraceId"));

		Data data = new Data();
		data.setChangeOrderId(_ctx.stringValue("AbortChangeOrderResponse.Data.ChangeOrderId"));
		abortChangeOrderResponse.setData(data);
	 
	 	return abortChangeOrderResponse;
	}
}