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

package com.aliyuncs.openitag.transform.v20220616;

import com.aliyuncs.openitag.model.v20220616.AddWorkNodeWorkforceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddWorkNodeWorkforceResponseUnmarshaller {

	public static AddWorkNodeWorkforceResponse unmarshall(AddWorkNodeWorkforceResponse addWorkNodeWorkforceResponse, UnmarshallerContext _ctx) {
		
		addWorkNodeWorkforceResponse.setRequestId(_ctx.stringValue("AddWorkNodeWorkforceResponse.RequestId"));
		addWorkNodeWorkforceResponse.setCode(_ctx.integerValue("AddWorkNodeWorkforceResponse.Code"));
		addWorkNodeWorkforceResponse.setMessage(_ctx.stringValue("AddWorkNodeWorkforceResponse.Message"));
		addWorkNodeWorkforceResponse.setDetails(_ctx.stringValue("AddWorkNodeWorkforceResponse.Details"));
		addWorkNodeWorkforceResponse.setSuccess(_ctx.booleanValue("AddWorkNodeWorkforceResponse.Success"));
		addWorkNodeWorkforceResponse.setErrorCode(_ctx.stringValue("AddWorkNodeWorkforceResponse.ErrorCode"));
	 
	 	return addWorkNodeWorkforceResponse;
	}
}