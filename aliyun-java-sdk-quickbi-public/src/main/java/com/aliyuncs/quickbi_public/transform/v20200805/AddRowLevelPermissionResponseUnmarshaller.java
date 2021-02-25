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

package com.aliyuncs.quickbi_public.transform.v20200805;

import com.aliyuncs.quickbi_public.model.v20200805.AddRowLevelPermissionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddRowLevelPermissionResponseUnmarshaller {

	public static AddRowLevelPermissionResponse unmarshall(AddRowLevelPermissionResponse addRowLevelPermissionResponse, UnmarshallerContext _ctx) {
		
		addRowLevelPermissionResponse.setRequestId(_ctx.stringValue("AddRowLevelPermissionResponse.RequestId"));
		addRowLevelPermissionResponse.setResult(_ctx.booleanValue("AddRowLevelPermissionResponse.Result"));
		addRowLevelPermissionResponse.setSuccess(_ctx.booleanValue("AddRowLevelPermissionResponse.Success"));
	 
	 	return addRowLevelPermissionResponse;
	}
}