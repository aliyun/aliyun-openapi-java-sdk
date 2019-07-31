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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.AbortAndRollbackChangeOrderResponse;
import com.aliyuncs.sae.model.v20190506.AbortAndRollbackChangeOrderResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AbortAndRollbackChangeOrderResponseUnmarshaller {

	public static AbortAndRollbackChangeOrderResponse unmarshall(AbortAndRollbackChangeOrderResponse abortAndRollbackChangeOrderResponse, UnmarshallerContext _ctx) {
		
		abortAndRollbackChangeOrderResponse.setRequestId(_ctx.stringValue("AbortAndRollbackChangeOrderResponse.RequestId"));
		abortAndRollbackChangeOrderResponse.setCode(_ctx.stringValue("AbortAndRollbackChangeOrderResponse.Code"));
		abortAndRollbackChangeOrderResponse.setErrorCode(_ctx.stringValue("AbortAndRollbackChangeOrderResponse.ErrorCode"));
		abortAndRollbackChangeOrderResponse.setMessage(_ctx.stringValue("AbortAndRollbackChangeOrderResponse.Message"));
		abortAndRollbackChangeOrderResponse.setSuccess(_ctx.booleanValue("AbortAndRollbackChangeOrderResponse.Success"));
		abortAndRollbackChangeOrderResponse.setTraceId(_ctx.stringValue("AbortAndRollbackChangeOrderResponse.TraceId"));

		Data data = new Data();
		data.setChangeOrderId(_ctx.stringValue("AbortAndRollbackChangeOrderResponse.Data.ChangeOrderId"));
		abortAndRollbackChangeOrderResponse.setData(data);
	 
	 	return abortAndRollbackChangeOrderResponse;
	}
}