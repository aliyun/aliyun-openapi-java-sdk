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

import com.aliyuncs.bssopenapi.model.v20171214.ModifyInstanceResponse;
import com.aliyuncs.bssopenapi.model.v20171214.ModifyInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyInstanceResponseUnmarshaller {

	public static ModifyInstanceResponse unmarshall(ModifyInstanceResponse modifyInstanceResponse, UnmarshallerContext _ctx) {
		
		modifyInstanceResponse.setRequestId(_ctx.stringValue("ModifyInstanceResponse.RequestId"));
		modifyInstanceResponse.setSuccess(_ctx.booleanValue("ModifyInstanceResponse.Success"));
		modifyInstanceResponse.setCode(_ctx.stringValue("ModifyInstanceResponse.Code"));
		modifyInstanceResponse.setMessage(_ctx.stringValue("ModifyInstanceResponse.Message"));

		Data data = new Data();
		data.setHostId(_ctx.stringValue("ModifyInstanceResponse.Data.HostId"));
		data.setOrderId(_ctx.stringValue("ModifyInstanceResponse.Data.OrderId"));
		modifyInstanceResponse.setData(data);
	 
	 	return modifyInstanceResponse;
	}
}