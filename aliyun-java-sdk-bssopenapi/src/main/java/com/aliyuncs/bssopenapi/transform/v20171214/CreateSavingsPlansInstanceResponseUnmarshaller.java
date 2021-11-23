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

import com.aliyuncs.bssopenapi.model.v20171214.CreateSavingsPlansInstanceResponse;
import com.aliyuncs.bssopenapi.model.v20171214.CreateSavingsPlansInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSavingsPlansInstanceResponseUnmarshaller {

	public static CreateSavingsPlansInstanceResponse unmarshall(CreateSavingsPlansInstanceResponse createSavingsPlansInstanceResponse, UnmarshallerContext _ctx) {
		
		createSavingsPlansInstanceResponse.setRequestId(_ctx.stringValue("CreateSavingsPlansInstanceResponse.RequestId"));
		createSavingsPlansInstanceResponse.setMessage(_ctx.stringValue("CreateSavingsPlansInstanceResponse.Message"));
		createSavingsPlansInstanceResponse.setCode(_ctx.stringValue("CreateSavingsPlansInstanceResponse.Code"));
		createSavingsPlansInstanceResponse.setSuccess(_ctx.booleanValue("CreateSavingsPlansInstanceResponse.Success"));

		Data data = new Data();
		data.setOrderId(_ctx.longValue("CreateSavingsPlansInstanceResponse.Data.OrderId"));
		createSavingsPlansInstanceResponse.setData(data);
	 
	 	return createSavingsPlansInstanceResponse;
	}
}