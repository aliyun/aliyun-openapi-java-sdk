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

import com.aliyuncs.bssopenapi.model.v20171214.RenewInstanceResponse;
import com.aliyuncs.bssopenapi.model.v20171214.RenewInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenewInstanceResponseUnmarshaller {

	public static RenewInstanceResponse unmarshall(RenewInstanceResponse renewInstanceResponse, UnmarshallerContext _ctx) {
		
		renewInstanceResponse.setRequestId(_ctx.stringValue("RenewInstanceResponse.RequestId"));
		renewInstanceResponse.setSuccess(_ctx.booleanValue("RenewInstanceResponse.Success"));
		renewInstanceResponse.setCode(_ctx.stringValue("RenewInstanceResponse.Code"));
		renewInstanceResponse.setMessage(_ctx.stringValue("RenewInstanceResponse.Message"));

		Data data = new Data();
		data.setOrderId(_ctx.stringValue("RenewInstanceResponse.Data.OrderId"));
		renewInstanceResponse.setData(data);
	 
	 	return renewInstanceResponse;
	}
}