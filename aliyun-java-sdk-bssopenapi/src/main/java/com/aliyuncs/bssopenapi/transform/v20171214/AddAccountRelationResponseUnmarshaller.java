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

import com.aliyuncs.bssopenapi.model.v20171214.AddAccountRelationResponse;
import com.aliyuncs.bssopenapi.model.v20171214.AddAccountRelationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddAccountRelationResponseUnmarshaller {

	public static AddAccountRelationResponse unmarshall(AddAccountRelationResponse addAccountRelationResponse, UnmarshallerContext _ctx) {
		
		addAccountRelationResponse.setRequestId(_ctx.stringValue("AddAccountRelationResponse.RequestId"));
		addAccountRelationResponse.setCode(_ctx.stringValue("AddAccountRelationResponse.Code"));
		addAccountRelationResponse.setSuccess(_ctx.booleanValue("AddAccountRelationResponse.Success"));
		addAccountRelationResponse.setMessage(_ctx.stringValue("AddAccountRelationResponse.Message"));

		Data data = new Data();
		data.setHostId(_ctx.stringValue("AddAccountRelationResponse.Data.HostId"));
		addAccountRelationResponse.setData(data);
	 
	 	return addAccountRelationResponse;
	}
}