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

import com.aliyuncs.bssopenapi.model.v20171214.ConfirmRelationResponse;
import com.aliyuncs.bssopenapi.model.v20171214.ConfirmRelationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmRelationResponseUnmarshaller {

	public static ConfirmRelationResponse unmarshall(ConfirmRelationResponse confirmRelationResponse, UnmarshallerContext _ctx) {
		
		confirmRelationResponse.setRequestId(_ctx.stringValue("ConfirmRelationResponse.RequestId"));
		confirmRelationResponse.setCode(_ctx.stringValue("ConfirmRelationResponse.Code"));
		confirmRelationResponse.setSuccess(_ctx.booleanValue("ConfirmRelationResponse.Success"));
		confirmRelationResponse.setMessage(_ctx.stringValue("ConfirmRelationResponse.Message"));

		Data data = new Data();
		data.setHostId(_ctx.stringValue("ConfirmRelationResponse.Data.HostId"));
		confirmRelationResponse.setData(data);
	 
	 	return confirmRelationResponse;
	}
}