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

import com.aliyuncs.openitag.model.v20220616.RemoveWorkNodeWorkforceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveWorkNodeWorkforceResponseUnmarshaller {

	public static RemoveWorkNodeWorkforceResponse unmarshall(RemoveWorkNodeWorkforceResponse removeWorkNodeWorkforceResponse, UnmarshallerContext _ctx) {
		
		removeWorkNodeWorkforceResponse.setRequestId(_ctx.stringValue("RemoveWorkNodeWorkforceResponse.RequestId"));
		removeWorkNodeWorkforceResponse.setCode(_ctx.integerValue("RemoveWorkNodeWorkforceResponse.Code"));
		removeWorkNodeWorkforceResponse.setMessage(_ctx.stringValue("RemoveWorkNodeWorkforceResponse.Message"));
		removeWorkNodeWorkforceResponse.setDetails(_ctx.stringValue("RemoveWorkNodeWorkforceResponse.Details"));
		removeWorkNodeWorkforceResponse.setSuccess(_ctx.booleanValue("RemoveWorkNodeWorkforceResponse.Success"));
		removeWorkNodeWorkforceResponse.setErrorCode(_ctx.stringValue("RemoveWorkNodeWorkforceResponse.ErrorCode"));
	 
	 	return removeWorkNodeWorkforceResponse;
	}
}