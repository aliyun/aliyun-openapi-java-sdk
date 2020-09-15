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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.BindRoleToEdgeInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindRoleToEdgeInstanceResponseUnmarshaller {

	public static BindRoleToEdgeInstanceResponse unmarshall(BindRoleToEdgeInstanceResponse bindRoleToEdgeInstanceResponse, UnmarshallerContext _ctx) {
		
		bindRoleToEdgeInstanceResponse.setRequestId(_ctx.stringValue("BindRoleToEdgeInstanceResponse.RequestId"));
		bindRoleToEdgeInstanceResponse.setSuccess(_ctx.booleanValue("BindRoleToEdgeInstanceResponse.Success"));
		bindRoleToEdgeInstanceResponse.setCode(_ctx.stringValue("BindRoleToEdgeInstanceResponse.Code"));
		bindRoleToEdgeInstanceResponse.setErrorMessage(_ctx.stringValue("BindRoleToEdgeInstanceResponse.ErrorMessage"));
	 
	 	return bindRoleToEdgeInstanceResponse;
	}
}