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

	public static SetResellerUserStatusResponse unmarshall(SetResellerUserStatusResponse setResellerUserStatusResponse, UnmarshallerContext _ctx) {
		
		setResellerUserStatusResponse.setRequestId(_ctx.stringValue("SetResellerUserStatusResponse.RequestId"));
		setResellerUserStatusResponse.setCode(_ctx.stringValue("SetResellerUserStatusResponse.Code"));
		setResellerUserStatusResponse.setMessage(_ctx.stringValue("SetResellerUserStatusResponse.Message"));
		setResellerUserStatusResponse.setSuccess(_ctx.booleanValue("SetResellerUserStatusResponse.Success"));
		setResellerUserStatusResponse.setData(_ctx.booleanValue("SetResellerUserStatusResponse.Data"));
	 
	 	return setResellerUserStatusResponse;
	}
}