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

import com.aliyuncs.bssopenapi.model.v20171214.SetResellerUserStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetResellerUserStatusResponseUnmarshaller {

	public static SetResellerUserStatusResponse unmarshall(SetResellerUserStatusResponse setResellerUserStatusResponse, UnmarshallerContext context) {
		
		setResellerUserStatusResponse.setRequestId(context.stringValue("SetResellerUserStatusResponse.RequestId"));
		setResellerUserStatusResponse.setCode(context.stringValue("SetResellerUserStatusResponse.Code"));
		setResellerUserStatusResponse.setMessage(context.stringValue("SetResellerUserStatusResponse.Message"));
		setResellerUserStatusResponse.setSuccess(context.booleanValue("SetResellerUserStatusResponse.Success"));
		setResellerUserStatusResponse.setData(context.booleanValue("SetResellerUserStatusResponse.Data"));
	 
	 	return setResellerUserStatusResponse;
	}
}