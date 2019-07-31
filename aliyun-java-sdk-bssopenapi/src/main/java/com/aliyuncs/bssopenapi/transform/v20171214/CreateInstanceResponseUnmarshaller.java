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

import com.aliyuncs.bssopenapi.model.v20171214.CreateInstanceResponse;
import com.aliyuncs.bssopenapi.model.v20171214.CreateInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateInstanceResponseUnmarshaller {

	public static CreateInstanceResponse unmarshall(CreateInstanceResponse createInstanceResponse, UnmarshallerContext _ctx) {
		
		createInstanceResponse.setRequestId(_ctx.stringValue("CreateInstanceResponse.RequestId"));
		createInstanceResponse.setSuccess(_ctx.booleanValue("CreateInstanceResponse.Success"));
		createInstanceResponse.setCode(_ctx.stringValue("CreateInstanceResponse.Code"));
		createInstanceResponse.setMessage(_ctx.stringValue("CreateInstanceResponse.Message"));

		Data data = new Data();
		data.setInstanceId(_ctx.stringValue("CreateInstanceResponse.Data.InstanceId"));
		data.setOrderId(_ctx.stringValue("CreateInstanceResponse.Data.OrderId"));
		createInstanceResponse.setData(data);
	 
	 	return createInstanceResponse;
	}
}