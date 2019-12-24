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

import com.aliyuncs.edas.model.v20170801.RollbackChangeOrderResponse;
import com.aliyuncs.edas.model.v20170801.RollbackChangeOrderResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RollbackChangeOrderResponseUnmarshaller {

	public static RollbackChangeOrderResponse unmarshall(RollbackChangeOrderResponse rollbackChangeOrderResponse, UnmarshallerContext _ctx) {
		
		rollbackChangeOrderResponse.setRequestId(_ctx.stringValue("RollbackChangeOrderResponse.RequestId"));
		rollbackChangeOrderResponse.setCode(_ctx.integerValue("RollbackChangeOrderResponse.Code"));
		rollbackChangeOrderResponse.setErrorCode(_ctx.stringValue("RollbackChangeOrderResponse.ErrorCode"));
		rollbackChangeOrderResponse.setMessage(_ctx.stringValue("RollbackChangeOrderResponse.Message"));
		rollbackChangeOrderResponse.setTraceId(_ctx.stringValue("RollbackChangeOrderResponse.TraceId"));

		Data data = new Data();
		data.setChangeOrderId(_ctx.stringValue("RollbackChangeOrderResponse.Data.ChangeOrderId"));
		rollbackChangeOrderResponse.setData(data);
	 
	 	return rollbackChangeOrderResponse;
	}
}